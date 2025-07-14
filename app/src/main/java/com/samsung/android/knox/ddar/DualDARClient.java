package com.samsung.android.knox.ddar;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class DualDARClient extends Service {
    public static final int ERROR_FAILURE = -1;
    public static final int ERROR_NONE = 0;
    public static final int FEATURE_RESET_PASSWORD = 1000;

    public DualDARClient() {
        throw new RuntimeException("Stub!");
    }

    public List<Integer> getDualDARUsers() {
        throw new RuntimeException("Stub!");
    }

    public String getInstalledClientLibraryVersion() {
        throw new RuntimeException("Stub!");
    }

    public int installLibrary(String str, List<String> list, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean isSupported(int i5) {
        throw new RuntimeException("Stub!");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public abstract void onClearResetPasswordToken(int i5, long j5);

    public abstract boolean onClientBringup();

    public abstract void onDataLockStateChange(int i5, boolean z4);

    public abstract boolean onDualDARDestroyForUser(int i5);

    public abstract boolean onDualDARSetupForUser(int i5);

    public abstract boolean onPasswordAuth(int i5, byte[] bArr);

    public abstract boolean onPasswordChange(int i5, byte[] bArr, byte[] bArr2);

    public abstract boolean onResetPasswordWithToken(int i5, byte[] bArr, long j5, byte[] bArr2);

    public abstract boolean onSetResetPasswordToken(int i5, byte[] bArr, long j5, byte[] bArr2);

    public void setSecret(int i5, Map<String, Byte[]> map) {
        throw new RuntimeException("Stub!");
    }
}
