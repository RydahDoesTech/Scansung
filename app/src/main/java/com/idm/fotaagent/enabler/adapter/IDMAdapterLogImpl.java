package com.idm.fotaagent.enabler.adapter;

import android.content.Context;
import android.os.SemSystemProperties;
import com.idm.adapter.logmanager.IDMLogManagerAdapter;
import com.idm.fotaagent.utils.DeviceUtils;
import com.idm.fotaagent.utils.storage.FileManager;
import com.samsung.android.fotaagent.common.DeviceId;
import com.samsung.android.fotaagent.common.feature.SalesCode;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.fotaagent.common.log.Logger;
import com.samsung.android.fotaagent.common.log.Where;
import com.samsung.android.fotaagent.common.util.NativeUtils;

/* loaded from: classes.dex */
public class IDMAdapterLogImpl implements IDMLogManagerAdapter {
    static final int ADDITIONAL_DEPTH_IN_CALL_STACK = 2;
    private static final String BUILD_DATE = "ro.build.date";
    private static final String BUILD_FINGERPRINT = "ro.build.fingerprint";
    private static final String BUILD_HOST = "ro.build.host";
    private final Logger defaultLogger;

    public IDMAdapterLogImpl(Logger logger) {
        this.defaultLogger = logger;
    }

    @Override // com.idm.adapter.logmanager.IDMLogManagerAdapter
    public void D(String str) {
        this.defaultLogger.D(Where.callerOf(2), str);
    }

    @Override // com.idm.adapter.logmanager.IDMLogManagerAdapter
    public void E(String str) {
        this.defaultLogger.E(Where.callerOf(2), str);
    }

    @Override // com.idm.adapter.logmanager.IDMLogManagerAdapter
    public void H(String str) {
        this.defaultLogger.H(Where.callerOf(2), str);
    }

    @Override // com.idm.adapter.logmanager.IDMLogManagerAdapter
    public void I(String str) {
        this.defaultLogger.I(Where.callerOf(2), str);
    }

    @Override // com.idm.adapter.logmanager.IDMLogManagerAdapter
    public void V(String str) {
        this.defaultLogger.V(Where.callerOf(2), str);
    }

    @Override // com.idm.adapter.logmanager.IDMLogManagerAdapter
    public void W(String str) {
        this.defaultLogger.W(Where.callerOf(2), str);
    }

    public String getBuildDate() {
        return SemSystemProperties.get(BUILD_DATE, "");
    }

    public String getBuildFingerprint() {
        return SemSystemProperties.get(BUILD_FINGERPRINT, "");
    }

    public String getBuildHost() {
        return SemSystemProperties.get(BUILD_HOST, "");
    }

    @Override // com.idm.adapter.logmanager.IDMLogManagerAdapter
    public String idmGetSecurityKey() {
        try {
            return NativeUtils.getKey();
        } catch (Throwable th) {
            this.defaultLogger.printStackTrace(th);
            return "";
        }
    }

    @Override // com.idm.adapter.logmanager.IDMLogManagerAdapter
    public void idmSaveDevInfoLog(Context context) {
        Log.switchFileLoggerToSession(context);
        FileManager fileManager = new FileManager();
        this.defaultLogger.H("//////////////// Device information");
        this.defaultLogger.H("Release Version : " + DeviceUtils.readAppVersionName(context));
        this.defaultLogger.H("Model : " + DeviceUtils.readModelName());
        this.defaultLogger.H("CC : " + SalesCode.get().toString());
        this.defaultLogger.H("DeviceID :" + DeviceId.readDeviceId(context));
        this.defaultLogger.H("Build FingerPrint : " + getBuildFingerprint());
        this.defaultLogger.H("Build Data : " + getBuildDate());
        this.defaultLogger.H("Build Host : " + getBuildHost());
        this.defaultLogger.H("Remain Space : /cache: " + (fileManager.getAvailableBytesAtCache() / 1024) + "Kb /data: " + (fileManager.getAvailableBytesAtData() / 1024));
    }

    @Override // com.idm.adapter.logmanager.IDMLogManagerAdapter
    public void idmSaveDeviceStatusLog(Context context, String str, String str2) {
    }

    @Override // com.idm.adapter.logmanager.IDMLogManagerAdapter
    public void printStackTrace(Throwable th) {
        this.defaultLogger.printStackTrace(Where.callerOf(2), th);
    }
}
