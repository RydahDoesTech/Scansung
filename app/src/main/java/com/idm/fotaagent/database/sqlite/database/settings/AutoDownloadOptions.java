package com.idm.fotaagent.database.sqlite.database.settings;

import android.content.Context;
import com.idm.agent.dl.a;
import com.idm.fotaagent.utils.NetworkUtil;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.stream.Stream;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NOT_SET' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public abstract class AutoDownloadOptions {
    private static final /* synthetic */ AutoDownloadOptions[] $VALUES = $values();
    public static final AutoDownloadOptions NOT_SET;
    public static final AutoDownloadOptions OFF;
    public static final AutoDownloadOptions WIFI;
    public static final AutoDownloadOptions WIFI_AND_CELLULAR;
    private final int dbValue;

    private static /* synthetic */ AutoDownloadOptions[] $values() {
        return new AutoDownloadOptions[]{NOT_SET, OFF, WIFI, WIFI_AND_CELLULAR};
    }

    static {
        int i5 = 0;
        NOT_SET = new AutoDownloadOptions("NOT_SET", i5, -1) { // from class: com.idm.fotaagent.database.sqlite.database.settings.AutoDownloadOptions.1
            @Override // com.idm.fotaagent.database.sqlite.database.settings.AutoDownloadOptions
            public boolean skipShowConfirm(Context context, boolean z4) {
                return AutoDownloadOptions.WIFI.skipShowConfirm(context, z4);
            }
        };
        int i6 = 1;
        OFF = new AutoDownloadOptions("OFF", i6, i5) { // from class: com.idm.fotaagent.database.sqlite.database.settings.AutoDownloadOptions.2
            @Override // com.idm.fotaagent.database.sqlite.database.settings.AutoDownloadOptions
            public boolean isRetriable(Context context, boolean z4) {
                if (!NetworkUtil.isWiFiNetworkConnected(context)) {
                    return skipShowConfirm(context, z4);
                }
                Log.I("Auto download option is OFF and WIFI. Retriable");
                return true;
            }

            @Override // com.idm.fotaagent.database.sqlite.database.settings.AutoDownloadOptions
            public boolean skipShowConfirm(Context context, boolean z4) {
                if (z4) {
                    Log.I("Auto download option is OFF and charge. No skip");
                    return false;
                }
                boolean zIsMobileNetworkConnected = NetworkUtil.isMobileNetworkConnected(context);
                Log.I("Auto download option is OFF and No charge. return mobileNetwork : " + zIsMobileNetworkConnected);
                return zIsMobileNetworkConnected;
            }
        };
        int i7 = 2;
        WIFI = new AutoDownloadOptions("WIFI", i7, i6) { // from class: com.idm.fotaagent.database.sqlite.database.settings.AutoDownloadOptions.3
            @Override // com.idm.fotaagent.database.sqlite.database.settings.AutoDownloadOptions
            public boolean skipShowConfirm(Context context, boolean z4) {
                if (z4) {
                    boolean zIsWiFiNetworkConnected = NetworkUtil.isWiFiNetworkConnected(context);
                    Log.I("Auto download option is WIFI and charge. return wifiNetwork : " + zIsWiFiNetworkConnected);
                    return zIsWiFiNetworkConnected;
                }
                boolean zIsAnyNetworkConnected = NetworkUtil.isAnyNetworkConnected(context);
                Log.I("Auto download option is WIFI and No charge. return anyNetwork : " + zIsAnyNetworkConnected);
                return zIsAnyNetworkConnected;
            }
        };
        WIFI_AND_CELLULAR = new AutoDownloadOptions("WIFI_AND_CELLULAR", 3, i7) { // from class: com.idm.fotaagent.database.sqlite.database.settings.AutoDownloadOptions.4
            @Override // com.idm.fotaagent.database.sqlite.database.settings.AutoDownloadOptions
            public boolean skipShowConfirm(Context context, boolean z4) {
                if (!z4) {
                    Log.W("This case should not be called");
                }
                boolean zIsAnyNetworkConnected = NetworkUtil.isAnyNetworkConnected(context);
                Log.I("Auto download option is WIFI/CELLULAR and charge is " + z4 + ". return anyNetwork : " + zIsAnyNetworkConnected);
                return zIsAnyNetworkConnected;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$of$0(int i5, AutoDownloadOptions autoDownloadOptions) {
        return autoDownloadOptions.dbValue == i5;
    }

    public static AutoDownloadOptions of(int i5) {
        return (AutoDownloadOptions) Stream.of((Object[]) values()).filter(new a(i5, 7)).findFirst().orElse(WIFI);
    }

    public static AutoDownloadOptions valueOf(String str) {
        return (AutoDownloadOptions) Enum.valueOf(AutoDownloadOptions.class, str);
    }

    public static AutoDownloadOptions[] values() {
        return (AutoDownloadOptions[]) $VALUES.clone();
    }

    public int getDbValue() {
        return this.dbValue;
    }

    public boolean isRetriable(Context context, boolean z4) {
        return skipShowConfirm(context, z4);
    }

    public abstract boolean skipShowConfirm(Context context, boolean z4);

    private AutoDownloadOptions(String str, int i5, int i6) {
        this.dbValue = i6;
    }
}
