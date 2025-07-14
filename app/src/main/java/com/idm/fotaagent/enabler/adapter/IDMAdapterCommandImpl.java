package com.idm.fotaagent.enabler.adapter;

import android.content.Context;
import android.text.TextUtils;
import com.idm.agent.dl.IDMDlInterface;
import com.idm.agent.dm.IDMDmCommandInterface;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.AdminRepository;
import com.idm.fotaagent.database.room.data.repository.DeviceRegistrationRepository;
import com.idm.fotaagent.database.room.data.repository.PushRegistrationRepository;
import com.idm.fotaagent.database.room.data.repository.RegisteredDeviceRepository;
import com.idm.fotaagent.enabler.network.WifiOnlyChecker;
import com.idm.fotaagent.restapi.registration.RegistrationHelper;
import com.idm.fotaagent.utils.BinaryStatus;
import com.idm.fotaagent.utils.DeviceUtils;
import com.idm.service.actioninfo.IDMActionInfo;
import com.samsung.android.fotaagent.common.FotaTelephonyManager;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMAdapterCommandImpl implements IDMDmCommandInterface {
    static final String PATH_AIDCODE = "./DevInfo/Ext/AidCode";
    static final String PATH_COUNTRYISOCODE = "./DevInfo/Ext/CountryISOCode";
    static final String PATH_DEVICE_REGISTRATION_STATUS = "./DevInfo/Ext/DeviceRegistrationStatus";
    public static final String PATH_DEVNETWORKCONNTYPE = "./DevInfo/Ext/DevNetworkConnType";
    static final String PATH_DMCLIENTVER = "./DevInfo/Ext/DMClientVer";
    static final String PATH_FOTACLIENTVER = "./DevInfo/Ext/FotaClientVer";
    static final String PATH_INITIAL_UPDATE = "./DevInfo/Ext/InitialUpdate";
    static final String PATH_IPPUSHREGISTRATIONSTATUS = "./DevInfo/Ext/IpPushRegistrationStatus";
    static final String PATH_MODEM_ZERO_BILLING = "./DevInfo/Ext/ModemZeroBilling";
    static final String PATH_OMCCODE = "./DevInfo/Ext/OmcCode";
    static final String PATH_SIMCARDMCC = "./DevInfo/Ext/SIMCardMcc";
    static final String PATH_SIMCARDMNC = "./DevInfo/Ext/SIMCardMnc";
    static final String PATH_TELEPHONYMCC = "./DevInfo/Ext/TelephonyMcc";
    static final String PATH_TELEPHONYMNC = "./DevInfo/Ext/TelephonyMnc";
    static final String VALUE_INITIAL_UPDATE = "1";
    static final String VALUE_MODEM_EXIST = "1";
    static final String VALUE_WIFI_ONLY = "0";

    private static Context getContext() {
        return IDMApplication.idmGetContext();
    }

    private String processGet(IDMActionInfo iDMActionInfo, String str) {
        str.getClass();
        switch (str) {
            case "./DevInfo/Ext/TelephonyMcc":
                return FotaTelephonyManager.readNetworkMCC(getContext());
            case "./DevInfo/Ext/TelephonyMnc":
                return FotaTelephonyManager.readNetworkMNC(getContext());
            case "./DevInfo/Lang":
                return new IDMAdapterDeviceInfoImpl().idmGetDeviceLanguage(getContext());
            case "./DevInfo/Ext/InitialUpdate":
                return "1";
            case "./DevInfo/Mod":
                return new RegisteredDeviceRepository(getContext()).getModelName().orElse(null);
            case "./DevInfo/Ext/ModemZeroBilling":
                return WifiOnlyChecker.getInstance().isWifiOnlyByDevice() ? "0" : "1";
            case "./DevInfo/DevId":
                return new RegisteredDeviceRepository(getContext()).getDeviceId().orElse(null);
            case "./DevInfo/Ext/SIMCardMcc":
                return !WifiOnlyChecker.getInstance().isWifiOnly() ? FotaTelephonyManager.readSimMCC(getContext()) : "N/A";
            case "./DevInfo/Ext/SIMCardMnc":
                return !WifiOnlyChecker.getInstance().isWifiOnly() ? FotaTelephonyManager.readSimMNC(getContext()) : "N/A";
            case "./DevInfo/Ext/DevNetworkConnType":
                return new IDMAdapterDeviceInfoImpl().idmGetUsingBearer(getContext());
            case "./DevInfo/Ext/CountryISOCode":
                return DeviceUtils.getCountryIsoCode();
            case "./DevDetail/FwV":
                return DeviceUtils.readFirmwareVersion();
            case "./DevInfo/Ext/OmcCode":
                return new RegisteredDeviceRepository(getContext()).getSalesCode().orElse(null);
            case "./DevInfo/Ext/AidCode":
                return DeviceUtils.getActivatedId();
            case "./DevInfo/Ext/FotaClientVer":
            case "./DevInfo/Ext/DMClientVer":
                return DeviceUtils.readAppVersionName(getContext());
            default:
                if (str.endsWith(IDMDlInterface.IDM_FUMO_STATE_PATH)) {
                    return String.valueOf(iDMActionInfo != null ? iDMActionInfo.idmGetFumoStatus() : 0);
                }
                return "N/A";
        }
    }

    private String processReplace(String str, String str2) {
        Context context;
        context = getContext();
        str.getClass();
        switch (str) {
            case "./DevInfo/Ext/IpPushRegistrationStatus":
                if ("0".equals(str2) || !new PushRegistrationRepository(context).isRegistered()) {
                    Log.I("register push by DM");
                    RegistrationHelper.startPushRegistration(context);
                    break;
                }
                break;
            case "./DevInfo/Ext/DeviceRegistrationStatus":
                if ("0".equals(str2)) {
                    Log.I("register device by DM");
                    RegistrationHelper.startDeviceRegistration(context, DeviceRegistrationRepository.Requester.DM);
                    break;
                }
                break;
            case "./FUMO/Ext/DoCheckingRooting":
                boolean zIsRootingCheckEnabled = new AdminRepository(getContext()).isRootingCheckEnabled();
                if (!"T".equals(str2) || !zIsRootingCheckEnabled || BinaryStatus.isOfficial()) {
                }
                break;
        }
        return "N/A";
    }

    @Override // com.idm.agent.dm.IDMDmCommandInterface
    public String idmProcessAdd(IDMActionInfo iDMActionInfo, String str, String str2) {
        return "N/A";
    }

    @Override // com.idm.agent.dm.IDMDmCommandInterface
    public int idmProcessExec(IDMActionInfo iDMActionInfo, String str) {
        if (TextUtils.isEmpty(str)) {
            Log.W("locURI should not be empty : " + str);
            return 1;
        }
        if (str.endsWith(IDMDlInterface.IDM_FUMO_DOWNLOADANDUPDATE_PATH)) {
            Log.I("idmProcessExec : IDM_FUMO_DOWNLOADANDUPDATE_PATH");
            return 2;
        }
        Log.W("Not supported locURI : ".concat(str));
        return 1;
    }

    @Override // com.idm.agent.dm.IDMDmCommandInterface
    public String idmProcessGet(IDMActionInfo iDMActionInfo, String str) {
        if (TextUtils.isEmpty(str)) {
            Log.W("locURI should not be empty : " + str);
            return "N/A";
        }
        String strProcessGet = processGet(iDMActionInfo, str);
        Log.H("idmProcessGet " + str + " : " + strProcessGet);
        return strProcessGet;
    }

    @Override // com.idm.agent.dm.IDMDmCommandInterface
    public String idmProcessReplace(IDMActionInfo iDMActionInfo, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            Log.W("locURI should not be empty : " + str);
            return "N/A";
        }
        String strProcessReplace = processReplace(str, str2);
        Log.H("idmProcessReplace " + str + " : " + strProcessReplace + " data : " + str2);
        return strProcessReplace;
    }
}
