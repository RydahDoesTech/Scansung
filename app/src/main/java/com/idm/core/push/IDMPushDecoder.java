package com.idm.core.push;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.idm.adapter.common.IDMCommonUtils;
import com.idm.adapter.logmanager.IDMDebug;
import com.idm.agent.dm.IDMDmInterface;
import com.idm.core.security.IDMSecurityImpl;
import com.idm.exception.push.IDMExceptionPushProcessFail;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseInterface;
import com.idm.providers.mo.IDMMoDatabaseManager;
import com.idm.providers.mo.IDMMoInterface;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
class IDMPushDecoder implements IDMPushInterface, IDMMoInterface, IDMDmInterface {
    private boolean bNonceResync;
    private byte[] digestData;
    private IDMMoDatabaseManager moDataBaseManager;
    private byte[] notiData;
    private IDMPushInfo pushInfo = new IDMPushInfo();
    private int pushType;
    private byte[] rawData;

    public IDMPushDecoder(Context context, byte[] bArr, int i5, boolean z4) {
        this.rawData = Arrays.copyOf(bArr, bArr.length);
        this.pushType = i5;
        this.bNonceResync = z4;
        this.moDataBaseManager = IDMMoDatabaseManager.getInstance(context);
    }

    private boolean idmPushCheckNotiDigest(byte[] bArr) throws IDMExceptionPushProcessFail {
        if (TextUtils.isEmpty(this.pushInfo.idmPushGetServerId())) {
            throw new IDMExceptionPushProcessFail("serverId is null...");
        }
        if (!idmPushIsServerProfile(this.pushInfo.idmPushGetServerId())) {
            throw new IDMExceptionPushProcessFail("Profile is null...");
        }
        String strIdmSecurityMakeDigest = new IDMSecurityImpl().idmSecurityMakeDigest(this.moDataBaseManager.idmMoGetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHNAME, this.pushInfo.idmPushGetServerId()), this.moDataBaseManager.idmMoGetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHSECRET, this.pushInfo.idmPushGetServerId()), Base64.decode(this.moDataBaseManager.idmMoGetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHDATA, this.pushInfo.idmPushGetServerId()).getBytes(Charset.defaultCharset()), 2), bArr);
        IDMDebug.H("Device Digest = " + strIdmSecurityMakeDigest);
        if (TextUtils.isEmpty(strIdmSecurityMakeDigest)) {
            throw new IDMExceptionPushProcessFail("clientDigest is null...");
        }
        String str = new String(idmPushGetDigestData(), Charset.defaultCharset());
        IDMDebug.H("Server Digest = ".concat(str));
        if (strIdmSecurityMakeDigest.equals(str)) {
            IDMDebug.I("checkNotiDigest success");
            return true;
        }
        IDMDebug.I("checkNotiDigest  fail");
        return false;
    }

    private IDMPushInfo idmPushCheckNotiReSync(byte[] bArr) throws IDMExceptionPushProcessFail {
        byte[] bArr2 = {0, 0, 0, 0};
        if (TextUtils.isEmpty(this.pushInfo.idmPushGetServerId())) {
            throw new IDMExceptionPushProcessFail("Server Id is Null");
        }
        String strIdmSecurityMakeDigest = new IDMSecurityImpl().idmSecurityMakeDigest(this.moDataBaseManager.idmMoGetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHNAME, this.pushInfo.idmPushGetServerId()), this.moDataBaseManager.idmMoGetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHSECRET, this.pushInfo.idmPushGetServerId()), bArr2, bArr);
        if (TextUtils.isEmpty(strIdmSecurityMakeDigest)) {
            throw new IDMExceptionPushProcessFail("b64Digest is null...");
        }
        IDMDebug.H("b64Digest : " + strIdmSecurityMakeDigest);
        if (!strIdmSecurityMakeDigest.equals(new String(idmPushGetDigestData(), Charset.defaultCharset()))) {
            throw new IDMExceptionPushProcessFail("checkNotiReSync Fail");
        }
        IDMDebug.I("checkNotiReSync Success");
        return this.pushInfo;
    }

    private boolean idmPushDecodeNotiHeader(byte[] bArr) throws IDMExceptionPushProcessFail {
        if (bArr == null) {
            IDMDebug.I("notiTrigger is null...");
            return false;
        }
        try {
            this.pushInfo.idmPushSetVersion(((bArr[0] << 8) | (bArr[1] & 192)) >> 6);
            this.pushInfo.idmPushSetUiMode((bArr[1] & 48) >> 4);
            this.pushInfo.idmPushSetInitiator(((bArr[1] & 8) >> 3) > 0 ? 1 : 0);
            this.pushInfo.idmPushSetFuture(bArr[3] | (bArr[1] & 7) | bArr[2] | bArr[4]);
            this.pushInfo.idmPushSetSessionId(IDMCommonUtils.idmToHexString(bArr, 5, 2));
            int i5 = bArr[7];
            if (i5 <= 0) {
                IDMDebug.I("serverIdSize is invalid");
                return false;
            }
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, 8, bArr2, 0, i5);
            this.pushInfo.idmPushSetServerId(new String(bArr2, Charset.defaultCharset()));
            this.pushInfo.idmPushSetTriggerHeaderSize(8 + i5);
            return true;
        } catch (Exception e5) {
            throw new IDMExceptionPushProcessFail(e5);
        }
    }

    private void idmPushDecodeNotiTriggerBody(byte[] bArr) throws IDMExceptionPushProcessFail {
        try {
            if (bArr.length == this.pushInfo.idmPushGetTriggerHeaderSize()) {
                IDMDebug.I("notiTriggerBody is empty");
                return;
            }
            int length = bArr.length - this.pushInfo.idmPushGetTriggerHeaderSize();
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, this.pushInfo.idmPushGetTriggerHeaderSize(), bArr2, 0, length);
            this.pushInfo.idmPushSetTriggerBody(bArr2);
            IDMDebug.I("notiTriggerBodyLength is : " + this.pushInfo.idmPushGetTriggerBody().length);
        } catch (Exception e5) {
            throw new IDMExceptionPushProcessFail(e5);
        }
    }

    private byte[] idmPushGetDigestData() {
        return this.digestData;
    }

    private byte[] idmPushGetNotiDigestData(byte[] bArr) {
        if (bArr == null || bArr.length <= 16) {
            return null;
        }
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        return bArr2;
    }

    private byte[] idmPushGetNotiTriggerData(byte[] bArr) {
        if (bArr == null || bArr.length <= 16) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length - 16];
        System.arraycopy(bArr, 16, bArr2, 0, bArr.length - 16);
        return bArr2;
    }

    private boolean idmPushIsServerProfile(String str) {
        return this.moDataBaseManager.idmMoGetDBAdapter().idmMoIsExistNode(str, IDMDatabaseInterface.IDM_ACC + str + IDMDmInterface.IDM_DMACC_PATH_SERVERID);
    }

    private void idmPushSetDigestData(byte[] bArr) {
        this.digestData = Arrays.copyOf(bArr, bArr.length);
    }

    public IDMPushInfo idmPushDecodePushInfo() throws IDMExceptionPushProcessFail {
        byte[] bArr = this.rawData;
        if (bArr == null) {
            throw new IDMExceptionPushProcessFail("Push RawData is null...");
        }
        int i5 = this.pushType;
        if (i5 == 2) {
            byte[] bArrDecode = Base64.decode(bArr, 2);
            this.notiData = bArrDecode;
            if (bArrDecode == null) {
                throw new IDMExceptionPushProcessFail("decode notiData is null...");
            }
        } else if (i5 == 1) {
            this.notiData = bArr;
        }
        idmPushSetDigestData(idmPushGetNotiDigestData(this.notiData));
        byte[] bArrIdmPushGetNotiTriggerData = idmPushGetNotiTriggerData(this.notiData);
        if (!idmPushDecodeNotiHeader(bArrIdmPushGetNotiTriggerData)) {
            throw new IDMExceptionPushProcessFail("decodeNotiHeader fail");
        }
        idmPushDecodeNotiTriggerBody(bArrIdmPushGetNotiTriggerData);
        this.moDataBaseManager.idmMoDatabaseOpen();
        if (!idmPushCheckNotiDigest(bArrIdmPushGetNotiTriggerData) && this.bNonceResync) {
            this.pushInfo = idmPushCheckNotiReSync(bArrIdmPushGetNotiTriggerData);
        }
        this.moDataBaseManager.idmMoDatabaseClose();
        return this.pushInfo;
    }

    public IDMPushDecoder(Context context, byte[] bArr, int i5) {
        this.rawData = Arrays.copyOf(bArr, bArr.length);
        this.pushType = i5;
        this.moDataBaseManager = IDMMoDatabaseManager.getInstance(context);
    }
}
