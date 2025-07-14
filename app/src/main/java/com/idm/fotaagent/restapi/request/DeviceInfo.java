package com.idm.fotaagent.restapi.request;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.SemSystemProperties;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import com.idm.agent.dm.uic.IDMDmUICInterface;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.DeviceRegistrationRepository;
import com.idm.fotaagent.restapi.response.Result;
import com.idm.fotaagent.restapi.restclient.push.message.PushType;
import com.idm.fotaagent.utils.DeviceUtils;
import com.idm.fotaagent.utils.SAKAttestation;
import com.samsung.android.fotaagent.common.DeviceId;
import com.samsung.android.fotaagent.common.FotaTelephonyManager;
import com.samsung.android.fotaagent.common.feature.SalesCode;
import com.samsung.android.fotaagent.common.log.Log;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public interface DeviceInfo {

    public static class ForDeviceRegistration extends ForHeartBeat {
        private static final String CARRIER_ID = "ro.boot.carrierid";
        private static final String CONTENT_EULA_TERMS_VERSION = "3.0";
        private static final String CONTENT_LDU_FLAG = "LDU";
        private static final String CONTENT_TERMS = "Y";
        private static final String CONTENT_TYPE_CODE = "PHONE DEVICE";
        private static final String KEY_TYPE = "ro.security.keystore.keytype";
        private static final String TAG_AID_CODE = "aidCode";
        private static final String TAG_APP_CERT = "appCert";
        private static final String TAG_APP_VERSION = "fotaClientVer";
        private static final String TAG_AUTH_TYPE = "authenticateType";
        private static final String TAG_CARRIER_ID = "carrierID";
        private static final String TAG_EE_FLAG = "eeFlag";
        private static final String TAG_LDU_FLAG = "lduFlag";
        private static final String TAG_MCC = "mobileCountryCode";
        private static final String TAG_MCC_NT = "mobileCountryCodeByTelephony";
        private static final String TAG_MNC = "mobileNetworkCode";
        private static final String TAG_MNC_NT = "mobileNetworkCodeByTelephony";
        static final String TAG_MODEL_NAME = "deviceName";
        private static final String TAG_PHYSICAL_ADDRESS = "devicePhysicalAddressText";
        private static final String TAG_PP_VERSION = "ppVersion";
        private static final String TAG_ROOT_CERT = "rootCert";
        private static final String TAG_SAK_CERT = "sakCert";
        private static final String TAG_SN = "deviceSerialNumber";
        private static final String TAG_TERMS = "terms";
        private static final String TAG_TERMS_VERSION = "termsVersion";
        private static final String TAG_TYPE_CODE = "deviceTypeCode";
        private static final String TAG_UN = "uniqueNumber";
        private Node activatedId;
        private Node appCert;
        private Node authType;
        private Node carrierId;
        private Node clientVersion;
        private Node eeFlag;
        private Node lduFlag;
        private Node modelName;
        private Node physicalAddress;
        private Node ppVersion;
        private Node rootCert;
        private Node sakCert;
        private String sakErrorCode;
        private Node simMcc;
        private Node simMnc;
        private Node sn;
        private Node telMcc;
        private Node telMnc;
        private Node terms;
        private Node termsVersion;
        private Node typeCode;
        private Node un;

        public static class LazyInstanceHolder {
            private static final ForDeviceRegistration INSTANCE = new ForDeviceRegistration();

            private LazyInstanceHolder() {
            }
        }

        public static ForDeviceRegistration get() {
            return LazyInstanceHolder.INSTANCE;
        }

        private void loadSAKInfoIfNeeded(Context context) {
            String challenge = new DeviceRegistrationRepository(context).getChallenge();
            if (TextUtils.isEmpty(challenge)) {
                setDefaultSAKValues();
                this.sakErrorCode = "";
                return;
            }
            Log.H("challenge : " + challenge);
            if (!isSakAppliedModel()) {
                Log.W("SAK is not applied");
                setDefaultSAKValues();
                this.sakErrorCode = Result.ERROR_TYPE_SAK_NOT_SUPPORTED;
                return;
            }
            try {
                List<byte[]> listRetrieveCertificateChain = new SAKAttestation().retrieveCertificateChain(challenge);
                this.appCert = new Node(TAG_APP_CERT, Base64.encodeToString(listRetrieveCertificateChain.get(0), 2));
                this.sakCert = new Node(TAG_SAK_CERT, Base64.encodeToString(listRetrieveCertificateChain.get(1), 2));
                this.rootCert = new Node(TAG_ROOT_CERT, Base64.encodeToString(listRetrieveCertificateChain.get(2), 2));
                this.sakErrorCode = "";
                this.authType = new Node(TAG_AUTH_TYPE, "1");
                Log.I("certificate chain retrieval succeeded ");
            } catch (IOException | RuntimeException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException e5) {
                Log.printStackTrace(e5);
                setDefaultSAKValues();
                this.sakErrorCode = Result.ERROR_TYPE_SAK_CERTIFICATE_CHAIN_RETRIEVAL_FAILED;
            }
        }

        private void setDefaultSAKValues() {
            this.appCert = new Node(TAG_APP_CERT, null);
            this.sakCert = new Node(TAG_SAK_CERT, null);
            this.rootCert = new Node(TAG_ROOT_CERT, null);
            this.authType = new Node(TAG_AUTH_TYPE, "0");
        }

        public String getModelName() {
            return this.modelName.content().orElse("");
        }

        @Override // com.idm.fotaagent.restapi.request.DeviceInfo.ForHeartBeat, com.idm.fotaagent.restapi.request.DeviceInfo
        public List<Node> getNodes() {
            return Arrays.asList(this.deviceId, this.modelId, this.salesCode, this.deviceVersion, this.physicalAddress, this.un, this.sn, this.typeCode, this.modelName, this.simMcc, this.simMnc, this.telMcc, this.telMnc, this.terms, this.termsVersion, this.clientVersion, this.carrierId, this.eeFlag, this.ppVersion, this.lduFlag, this.activatedId, this.authType, this.appCert, this.sakCert, this.rootCert);
        }

        public String getPPVersion() {
            Uri uri = F2.a.f627b;
            Context contextIdmGetContext = IDMApplication.idmGetContext();
            int i5 = -1;
            if (uri.getAuthority().contains("com.sec.android.app.setupwizardlegalprovider")) {
                int i6 = uri.getPath().contains("eulaprovider") ? 10 : uri.getPath().contains("diagprovider") ? 40 : uri.getPath().contains("ppprovider") ? 20 : uri.getPath().contains("aaprovider") ? 30 : uri.getPath().contains("gdgpprovider") ? 50 : uri.getPath().contains("uspdprovider") ? 60 : uri.getPath().contains("cbtprovider") ? 70 : uri.getPath().contains("cpp2provider") ? 80 : uri.getPath().contains("diagcbt2provider") ? 90 : uri.getPath().contains("diagnonsensitive2provider") ? 100 : uri.getPath().contains("diagsensitiveprovider") ? 110 : -1;
                if (i6 <= 0) {
                    i5 = i6;
                } else if (uri.getLastPathSegment().equals("get")) {
                    i5 = i6 + 1;
                } else if (uri.getLastPathSegment().equals("agree")) {
                    i5 = i6 + 2;
                } else if (uri.getLastPathSegment().equals("disagree")) {
                    i5 = i6 + 3;
                } else if (uri.getLastPathSegment().equals("version")) {
                    i5 = i6 + 4;
                }
            }
            String str = "Uri:" + uri.toString() + " > process: " + i5;
            String str2 = F2.a.f626a;
            android.util.Log.d(str2, str);
            String string = null;
            if (i5 % 10 != 4) {
                android.util.Log.e(str2, "this is not a granted ver action(" + uri.toString() + ") from " + contextIdmGetContext.getPackageName());
            } else {
                Cursor cursorQuery = contextIdmGetContext.getContentResolver().query(uri, null, contextIdmGetContext.getPackageName(), null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    android.util.Log.e(str2, "no version is found");
                    android.util.Log.e(str2, "this is not a granted ver action(" + uri.toString() + ") from " + contextIdmGetContext.getPackageName());
                } else {
                    android.util.Log.i(str2, "read Version done");
                    string = cursorQuery.getString(0);
                    cursorQuery.close();
                }
            }
            return TextUtils.isEmpty(string) ? string : string.replaceAll("[%$&*()#@!]", "");
        }

        public String getSakErrorCode() {
            return this.sakErrorCode;
        }

        public boolean isSakAppliedModel() {
            return SemSystemProperties.get(KEY_TYPE).contains("sak");
        }

        public String readCarrierId() {
            return SemSystemProperties.get(CARRIER_ID, "");
        }

        @Override // com.idm.fotaagent.restapi.request.DeviceInfo.ForHeartBeat, com.idm.fotaagent.restapi.request.DeviceInfo
        public void readDeviceInfo(Context context) {
            super.readDeviceInfo(context);
            this.physicalAddress = new Node(TAG_PHYSICAL_ADDRESS, DeviceId.readDeviceId(context));
            this.un = new Node(TAG_UN, DeviceUtils.readUN());
            this.sn = new Node(TAG_SN, DeviceUtils.getSerialNumber());
            this.typeCode = new Node(TAG_TYPE_CODE, CONTENT_TYPE_CODE);
            this.modelName = new Node(TAG_MODEL_NAME, DeviceUtils.readModelName());
            this.simMcc = new Node(TAG_MCC, FotaTelephonyManager.readSimMCC(context));
            this.simMnc = new Node(TAG_MNC, FotaTelephonyManager.readSimMNC(context));
            this.telMcc = new Node(TAG_MCC_NT, FotaTelephonyManager.readNetworkMCC(context));
            this.telMnc = new Node(TAG_MNC_NT, FotaTelephonyManager.readNetworkMNC(context));
            this.terms = new Node(TAG_TERMS, CONTENT_TERMS);
            this.termsVersion = new Node(TAG_TERMS_VERSION, CONTENT_EULA_TERMS_VERSION);
            this.clientVersion = new Node(TAG_APP_VERSION, DeviceUtils.readAppVersionName(context));
            String carrierId = readCarrierId();
            String str = null;
            if (TextUtils.isEmpty(carrierId)) {
                carrierId = null;
            }
            this.carrierId = new Node(TAG_CARRIER_ID, carrierId);
            String eEFlag = readEEFlag(context);
            if (TextUtils.isEmpty(eEFlag)) {
                eEFlag = null;
            }
            this.eeFlag = new Node(TAG_EE_FLAG, eEFlag);
            String pPVersion = getPPVersion();
            if (TextUtils.isEmpty(pPVersion) || !SalesCode.get().isKoreaCountryFeature()) {
                pPVersion = null;
            }
            this.ppVersion = new Node(TAG_PP_VERSION, pPVersion);
            this.lduFlag = new Node(TAG_LDU_FLAG, DeviceUtils.isLiveDemoDevice() ? CONTENT_LDU_FLAG : null);
            String activatedId = DeviceUtils.getActivatedId();
            if (DeviceUtils.isTSS2_0() && !TextUtils.isEmpty(activatedId)) {
                str = activatedId;
            }
            this.activatedId = new Node(TAG_AID_CODE, str);
            loadSAKInfoIfNeeded(context);
        }

        public String readEEFlag(Context context) {
            try {
                return Settings.Secure.getInt(context.getContentResolver(), "enterprise_edition") != 0 ? CONTENT_TERMS : IDMDmUICInterface.IDM_UIC_OPTION_IT_N;
            } catch (Settings.SettingNotFoundException e5) {
                Log.printStackTrace(e5);
                return "";
            }
        }

        private ForDeviceRegistration() {
            super();
            this.sakErrorCode = "";
        }
    }

    public static class ForHeartBeat implements DeviceInfo {
        private static final String TAG_FIRMWARE_VERSION = "firmwareVersion";
        private static final String TAG_MODEL_ID = "deviceModelID";
        static final String TAG_SALES_CODE = "customerCode";
        static final String TAG_UNIQUE_ID = "deviceUniqueID";
        protected Node deviceId;
        protected Node deviceVersion;
        protected Node modelId;
        protected Node salesCode;

        public static class LazyInstanceHolder {
            private static final ForHeartBeat INSTANCE = new ForHeartBeat();

            private LazyInstanceHolder() {
            }
        }

        public static ForHeartBeat get() {
            return LazyInstanceHolder.INSTANCE;
        }

        public String getDeviceId() {
            return this.deviceId.content().orElse("");
        }

        @Override // com.idm.fotaagent.restapi.request.DeviceInfo
        public List<Node> getNodes() {
            return Arrays.asList(this.deviceId, this.modelId, this.salesCode, this.deviceVersion);
        }

        public String getSalesCode() {
            return this.salesCode.content().orElse("");
        }

        @Override // com.idm.fotaagent.restapi.request.DeviceInfo
        public void readDeviceInfo(Context context) {
            this.deviceId = new Node(TAG_UNIQUE_ID, DeviceId.readDeviceId(context));
            this.modelId = new Node(TAG_MODEL_ID, DeviceUtils.readModelName());
            this.salesCode = new Node(TAG_SALES_CODE, SalesCode.get().toString());
            this.deviceVersion = new Node(TAG_FIRMWARE_VERSION, DeviceUtils.readFirmwareVersion());
        }

        private ForHeartBeat() {
        }
    }

    public static class ForPush implements DeviceInfo {
        private static final String TAG_DEVICE_ID = "deviceID";
        private static final String TAG_PUSH_TYPE = "pushType";
        private static final String TAG_REGISTRATION_ID = "registrationID";
        private Node deviceId;
        private Node pushId;
        private Node pushType;

        public static class LazyInstanceHolder {
            private static final ForPush INSTANCE = new ForPush();

            private LazyInstanceHolder() {
            }
        }

        public static ForPush get() {
            return LazyInstanceHolder.INSTANCE;
        }

        @Override // com.idm.fotaagent.restapi.request.DeviceInfo
        public List<Node> getNodes() {
            if (this.pushId == null) {
                this.pushId = new Node(TAG_REGISTRATION_ID, null);
            }
            return Arrays.asList(this.deviceId, this.pushType, this.pushId);
        }

        @Override // com.idm.fotaagent.restapi.request.DeviceInfo
        public void readDeviceInfo(Context context) {
            this.deviceId = new Node(TAG_DEVICE_ID, DeviceId.readDeviceId(context));
            this.pushType = new Node(TAG_PUSH_TYPE, PushType.get().name());
            this.pushId = new Node(TAG_REGISTRATION_ID, PushType.get().getPushId(context));
        }

        private ForPush() {
        }
    }

    List<Node> getNodes();

    void readDeviceInfo(Context context);
}
