package com.idm.fotaagent.enabler.adapter;

import android.text.TextUtils;
import com.idm.agent.dm.IDMDmAuthValidInterface;
import com.idm.core.security.IDMSecurityImpl;
import com.idm.fotaagent.utils.GeneralUtils;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMAdapterDMAuthValidImpl implements IDMDmAuthValidInterface {
    @Override // com.idm.agent.dm.IDMDmAuthValidInterface
    public void idmCheckValidClientDigest(String str, String str2, String str3) {
        if (isValidClientPwd(str, str2, str3)) {
            return;
        }
        Log.H("ClientId : " + str);
        Log.H("ClientPw : " + str3);
        Log.E("Client digest is not valid.");
    }

    @Override // com.idm.agent.dm.IDMDmAuthValidInterface
    public void idmCheckValidServerDigest(String str, String str2) {
        if (isValidServerIdPwd(str, str2)) {
            return;
        }
        Log.H("ServerId : " + str);
        Log.H("ServerPw : " + str2);
        Log.E("Server digest is not valid.");
    }

    public boolean isValidClientPwd(String str, String str2, String str3) {
        return !TextUtils.isEmpty(str3) && str3.equals(new IDMSecurityImpl().idmSecurityMakeSECDevicePassword(str, str2));
    }

    public boolean isValidServerIdPwd(String str, String str2) {
        return "60b8a48dd3e6f2179753474ffbf23f65df6ebae93d3a64c1faaf01ac6c5a9764".equals(GeneralUtils.generateHash(str, "SHA-256")) && "45cff78545f098cf61a6b38f119c082a30233de84e9269fc87f7507b9e7f9b55".equals(GeneralUtils.generateHash(str2, "SHA-256"));
    }
}
