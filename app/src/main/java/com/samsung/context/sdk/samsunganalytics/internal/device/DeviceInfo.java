package com.samsung.context.sdk.samsunganalytics.internal.device;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.samsung.android.lib.episode.EternalContract;

/* loaded from: classes.dex */
public class DeviceInfo {
    private static volatile DeviceInfo INSTANCE;
    private final String language;
    private String mcc = "";
    private String mnc = "";
    private final String androidVersion = Build.VERSION.RELEASE;
    private final String deviceModel = Build.MODEL;
    private final String firmwareVersion = Build.VERSION.INCREMENTAL;

    private DeviceInfo(Context context) {
        this.language = context.getResources().getConfiguration().locale.getLanguage();
        setMccMnc(context);
    }

    public static DeviceInfo getDeviceInfo(Context context) {
        synchronized (DeviceInfo.class) {
            try {
                if (INSTANCE == null) {
                    INSTANCE = new DeviceInfo(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return INSTANCE;
    }

    public String getAndroidVersion() {
        return this.androidVersion;
    }

    public String getDeviceModel() {
        return this.deviceModel;
    }

    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getMcc() {
        return this.mcc;
    }

    public String getMnc() {
        return this.mnc;
    }

    public void setMccMnc(Context context) {
        String simOperator;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(EternalContract.DEVICE_TYPE_PHONE);
        if (telephonyManager == null || telephonyManager.getSimState() != 5 || (simOperator = telephonyManager.getSimOperator()) == null || simOperator.length() < 3) {
            return;
        }
        this.mcc = simOperator.substring(0, 3);
        this.mnc = simOperator.substring(3);
    }
}
