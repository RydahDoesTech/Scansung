package com.idm.adapter.logmanager;

import android.content.Context;

/* loaded from: classes.dex */
public interface IDMLogManagerAdapter {
    void D(String str);

    void E(String str);

    void H(String str);

    void I(String str);

    void V(String str);

    void W(String str);

    String idmGetSecurityKey();

    void idmSaveDevInfoLog(Context context);

    void idmSaveDeviceStatusLog(Context context, String str, String str2);

    void printStackTrace(Throwable th);
}
