package com.samsung.android.knox.net.vpn.serviceprovider;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public class GenericVpnContext extends ContextWrapper {
    public static final boolean CONNECTING = true;
    public static final boolean DISCONNECTING = false;
    public static final boolean META_DISABLED = false;
    public static final boolean META_ENABLED = true;

    public GenericVpnContext(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public void enableMetaData(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public String getVPNProfile() {
        throw new RuntimeException("Stub!");
    }

    public boolean getVPNState() {
        throw new RuntimeException("Stub!");
    }

    public boolean isMetaEnabled() {
        throw new RuntimeException("Stub!");
    }

    public void setGenericVpnParams(String str, boolean z4) {
        throw new RuntimeException("Stub!");
    }
}
