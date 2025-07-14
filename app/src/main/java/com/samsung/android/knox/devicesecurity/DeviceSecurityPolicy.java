package com.samsung.android.knox.devicesecurity;

import android.content.ComponentName;

/* loaded from: classes.dex */
public class DeviceSecurityPolicy {
    public static final int WIPE_EXTERNAL_MEMORY = 2;
    public static final int WIPE_INTERNAL_EXTERNAL_MEMORY = 3;
    public static final int WIPE_INTERNAL_MEMORY = 1;

    public DeviceSecurityPolicy() {
        throw new RuntimeException("Stub!");
    }

    public boolean addClipboardTextData(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean clearClipboardData() {
        throw new RuntimeException("Stub!");
    }

    public String getClipboardTextData() {
        throw new RuntimeException("Stub!");
    }

    public boolean getRequireDeviceEncryption(ComponentName componentName) {
        throw new RuntimeException("Stub!");
    }

    public boolean getRequireStorageCardEncryption(ComponentName componentName) {
        throw new RuntimeException("Stub!");
    }

    public boolean isExternalStorageEncrypted() {
        throw new RuntimeException("Stub!");
    }

    public boolean isInternalStorageEncrypted() {
        throw new RuntimeException("Stub!");
    }

    public void setExternalStorageEncryption(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public void setInternalStorageEncryption(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public void setRequireDeviceEncryption(ComponentName componentName, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public void setRequireStorageCardEncryption(ComponentName componentName, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean wipeDevice(int i5) {
        throw new RuntimeException("Stub!");
    }
}
