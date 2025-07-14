package com.idm.fotaagent.restapi.registration.state;

import android.content.Context;
import android.text.TextUtils;
import com.idm.agent.dm.IDMDmInterface;
import com.idm.core.security.IDMSecurityImpl;
import com.idm.fotaagent.analytics.diagmon.DiagMon;
import com.idm.fotaagent.database.room.data.repository.DeviceRegistrationRepository;
import com.idm.fotaagent.database.room.data.repository.PollingRepository;
import com.idm.fotaagent.database.room.data.repository.RegisteredDeviceRepository;
import com.idm.fotaagent.database.sqlite.database.mo.IDMDatabaseMoNodeManager;
import com.idm.fotaagent.database.sqlite.database.polling.PollingInfo;
import com.idm.fotaagent.restapi.parser.XmlParser;
import com.idm.fotaagent.restapi.registration.DeviceNotRegisteredException;
import com.idm.fotaagent.restapi.registration.DeviceRegistrationReportChecker;
import com.idm.fotaagent.restapi.registration.RegistrationHelper;
import com.idm.fotaagent.restapi.registration.context.Registration;
import com.idm.fotaagent.restapi.request.DeviceInfo;
import com.idm.fotaagent.restapi.response.Response;
import com.idm.fotaagent.restapi.response.Result;
import com.idm.fotaagent.restapi.restclient.device.DeviceRestClient;
import com.idm.fotaagent.restapi.restclient.heartbeat.PeriodicHeartbeat;
import com.idm.fotaagent.restapi.restclient.heartbeat.PeriodicHeartbeatManager;
import com.idm.fotaagent.utils.GeneralUtils;
import com.idm.fotaagent.utils.NetworkUtil;
import com.idm.fotaagent.utils.ToastHelper;
import com.idm.providers.mo.IDMMoDatabaseManager;
import com.idm.providers.mo.exception.IDMMoExceptionNotFound;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class DeviceRegistrationState extends RegistrationState {
    private static final long serialVersionUID = -9035073218398709823L;

    public DeviceRegistrationState(Registration registration) {
        super(registration);
    }

    private void prepareDeviceInfo() throws DeviceNotRegisteredException {
        DeviceInfo.ForDeviceRegistration.get().readDeviceInfo(getApplicationContext());
        String sakErrorCode = DeviceInfo.ForDeviceRegistration.get().getSakErrorCode();
        if (!TextUtils.isEmpty(sakErrorCode)) {
            throw new DeviceNotRegisteredException("Error in retrieving certificate chain", 400, sakErrorCode);
        }
    }

    public void finalizeFailure(int i5, String str) {
        Context applicationContext = getApplicationContext();
        DeviceRegistrationRepository deviceRegistrationRepository = new DeviceRegistrationRepository(applicationContext);
        if (i5 == 400) {
            deviceRegistrationRepository.setInvalidRegister();
        } else {
            deviceRegistrationRepository.setUnregister();
        }
        deviceRegistrationRepository.clearChallenge();
        if (this.registration.isForeground()) {
            ToastHelper.showShortToast(applicationContext, applicationContext.getString(i5 == 100 ? R.string.STR_NETWORK_FAIL : R.string.STR_REGISTER_FAIL));
        }
        if (TextUtils.isEmpty(str)) {
            str = DiagMon.DEVICE_REGISTRATION_FAILED_DUE_TO_ABNORMAL_CONNECTION;
        }
        if (needsReport(applicationContext, i5, str) && DeviceRegistrationReportChecker.isAvailableToReport(applicationContext, str)) {
            new DiagMon.Reporter(str).withDescription(DiagMon.DESCRIPTION_DEVICE_REGISTRATION_FAILED).report();
            DeviceRegistrationReportChecker.storeReportInfo(applicationContext, str);
        }
    }

    public boolean needsReport(Context context, int i5, String str) {
        if (i5 != 100 || NetworkUtil.isAnyNetworkConnected(context)) {
            return (Result.ERROR_TYPE_MODEL_CC_NOT_EXIST.equals(str) || Result.ERROR_TYPE_SAK_CERTIFICATE_CHAIN_RETRIEVAL_FAILED.equals(str)) ? false : true;
        }
        Log.I("Intended behavior. No need to report.");
        return false;
    }

    @Override // com.idm.fotaagent.restapi.registration.state.RegistrationState
    public void onEntry() throws DeviceNotRegisteredException {
        Log.I("");
        if (new DeviceRegistrationRepository(getApplicationContext()).isRegistered()) {
            changeRegistrationState(new PollingRegistrationState(this.registration));
        } else {
            RegistrationHelper.unregister();
            onExecute();
        }
    }

    @Override // com.idm.fotaagent.restapi.registration.state.RegistrationState
    public void onExecute() throws DeviceNotRegisteredException {
        Log.V("");
        try {
            Context applicationContext = getApplicationContext();
            if (!NetworkUtil.isAnyNetworkConnected(applicationContext)) {
                throw new DeviceNotRegisteredException("Network is not available", 100);
            }
            prepareDeviceInfo();
            if (this.registration.isForeground()) {
                ToastHelper.showShortToast(applicationContext, applicationContext.getString(R.string.STR_DM_CONNECTING_SERVER));
            }
            DeviceRestClient deviceRestClient = new DeviceRestClient(applicationContext, DeviceInfo.ForDeviceRegistration.get());
            if (deviceRestClient.execute()) {
                postExecuteOnSuccess(deviceRestClient.getResponse());
                changeRegistrationState(new PollingRegistrationState(this.registration));
            } else {
                postExecuteOnFailure(deviceRestClient.getResponse());
                onExecute();
            }
        } catch (DeviceNotRegisteredException e5) {
            Log.printStackTrace(e5);
            finalizeFailure(e5.getResult(), e5.getErrorCode());
            throw e5;
        }
    }

    public void postExecuteOnFailure(Response.WithAttributes withAttributes) throws DeviceNotRegisteredException {
        int value = withAttributes.getResult().getValue();
        String errorCode = withAttributes.getErrorCode();
        if (value == 400) {
            throw new DeviceNotRegisteredException("Device is not valid!!", value, errorCode);
        }
        if (value != 406) {
            throw new DeviceNotRegisteredException(value, errorCode);
        }
        String str = withAttributes.getAttributes().get(XmlParser.ERROR_CHALLENGE);
        if (TextUtils.isEmpty(str)) {
            throw new DeviceNotRegisteredException("Server response to re-register with SAK but challenge is empty", value, errorCode);
        }
        new DeviceRegistrationRepository(getApplicationContext()).setChallenge(str);
        Log.I("succeed to set challenge received from server");
        Log.H("challenge : " + str);
    }

    public void postExecuteOnSuccess(Response.WithAttributes withAttributes) throws DeviceNotRegisteredException {
        Log.I("Receive result: success in DeviceRestClient");
        Context applicationContext = getApplicationContext();
        Map<String, String> attributes = withAttributes.getAttributes();
        int i5 = GeneralUtils.parseInt(attributes.get(XmlParser.Device.DEVICE_FIRST_POLLING_TIME), 0);
        if (i5 > 0) {
            Log.I("DeviceInitDelayTime : " + i5);
            new PollingRepository(applicationContext).setFirstTime(System.currentTimeMillis() + TimeUnit.HOURS.toMillis((long) i5));
        }
        PollingInfo.get().setUrl(attributes.get("versioninfo/url"));
        PollingInfo.get().setTarget(applicationContext, attributes.get(XmlParser.Device.DEVICE_POLLING_TARGET));
        new PeriodicHeartbeatManager(applicationContext).register(new PeriodicHeartbeat.TriggeredByRegistration(attributes));
        DeviceInfo.ForDeviceRegistration forDeviceRegistration = DeviceInfo.ForDeviceRegistration.get();
        try {
            new RegisteredDeviceRepository(applicationContext).save(forDeviceRegistration.getDeviceId(), forDeviceRegistration.getModelName(), forDeviceRegistration.getSalesCode());
            updateDMAccClientAAuth(forDeviceRegistration.getDeviceId());
            DeviceRegistrationRepository deviceRegistrationRepository = new DeviceRegistrationRepository(applicationContext);
            deviceRegistrationRepository.setInitialUpdate(true);
            deviceRegistrationRepository.setRegister();
        } catch (RuntimeException e5) {
            e = e5;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new DeviceNotRegisteredException("Failed to save registered device into repository", Result.FAIL_UNKNOWN, e);
        }
    }

    public void updateDMAccClientAAuth(String str) throws DeviceNotRegisteredException {
        try {
            IDMMoDatabaseManager iDMMoDatabaseManagerIdmGetMoDatabaseManager = IDMDatabaseMoNodeManager.getInstance().idmGetMoDatabaseManager();
            iDMMoDatabaseManagerIdmGetMoDatabaseManager.idmMoSetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHNAME, "x6g1q14r75", str);
            iDMMoDatabaseManagerIdmGetMoDatabaseManager.idmMoSetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHSECRET, "x6g1q14r75", new IDMSecurityImpl().idmSecurityMakeSECDevicePassword(str, "x6g1q14r75"));
        } catch (IDMMoExceptionNotFound e5) {
            e = e5;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new DeviceNotRegisteredException("Failed to update DM Account", Result.FAIL_UNKNOWN, e);
        }
    }
}
