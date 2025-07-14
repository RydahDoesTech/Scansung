package com.idm.fotaagent.enabler.adapter;

import com.idm.adapter.handler.AdaptersHolder;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMAdapterImpl extends AdaptersHolder {
    public IDMAdapterImpl(String str, int i5) {
        super(new IDMAdapterDeviceInfoImpl(), new IDMAdapterNetworkImpl(str, i5), new IDMAdapterCommandImpl(), new IDMAdapterDLConnectImpl(), new IDMAdapterDownload(str), new IDMAdapterContinueProcessImpl(), IDMAdapterDMConnectImpl.getInstance(), new IDMAdapterDMAuthValidImpl());
        Log.I("");
    }
}
