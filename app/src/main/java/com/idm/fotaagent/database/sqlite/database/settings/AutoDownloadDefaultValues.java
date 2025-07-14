package com.idm.fotaagent.database.sqlite.database.settings;

import com.idm.core.ddf.a;
import com.samsung.android.fotaagent.common.feature.CarrierFeature;
import java.util.stream.Stream;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'OFF' uses external variables
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
public final class AutoDownloadDefaultValues {
    private static final /* synthetic */ AutoDownloadDefaultValues[] $VALUES;
    public static final AutoDownloadDefaultValues OFF;
    public static final AutoDownloadDefaultValues REMOVE;
    public static final AutoDownloadDefaultValues REMOVE_OFF;
    public static final AutoDownloadDefaultValues REMOVE_WIFI;
    public static final AutoDownloadDefaultValues WIFI;
    public static final AutoDownloadDefaultValues WIFI_AND_CELLULAR;
    private final String carrierFeatureValue;
    private final AutoDownloadOptions option;

    private static /* synthetic */ AutoDownloadDefaultValues[] $values() {
        return new AutoDownloadDefaultValues[]{OFF, WIFI, WIFI_AND_CELLULAR, REMOVE_OFF, REMOVE_WIFI, REMOVE};
    }

    static {
        AutoDownloadOptions autoDownloadOptions = AutoDownloadOptions.OFF;
        OFF = new AutoDownloadDefaultValues("OFF", 0, CarrierFeature.VALUE_AUTO_DOWNLOAD_OFF, autoDownloadOptions);
        AutoDownloadOptions autoDownloadOptions2 = AutoDownloadOptions.WIFI;
        WIFI = new AutoDownloadDefaultValues("WIFI", 1, "wifi", autoDownloadOptions2);
        AutoDownloadOptions autoDownloadOptions3 = AutoDownloadOptions.WIFI_AND_CELLULAR;
        WIFI_AND_CELLULAR = new AutoDownloadDefaultValues("WIFI_AND_CELLULAR", 2, CarrierFeature.VALUE_AUTO_DOWNLOAD_WIFI_AND_CELLULAR, autoDownloadOptions3);
        REMOVE_OFF = new AutoDownloadDefaultValues("REMOVE_OFF", 3, CarrierFeature.VALUE_AUTO_DOWNLOAD_REMOVE_OFF, autoDownloadOptions);
        REMOVE_WIFI = new AutoDownloadDefaultValues("REMOVE_WIFI", 4, CarrierFeature.VALUE_AUTO_DOWNLOAD_REMOVE_WIFI, autoDownloadOptions2);
        REMOVE = new AutoDownloadDefaultValues("REMOVE", 5, CarrierFeature.VALUE_AUTO_DOWNLOAD_REMOVE, autoDownloadOptions3);
        $VALUES = $values();
    }

    private AutoDownloadDefaultValues(String str, int i5, String str2, AutoDownloadOptions autoDownloadOptions) {
        this.carrierFeatureValue = str2;
        this.option = autoDownloadOptions;
    }

    public static AutoDownloadDefaultValues get() {
        return (AutoDownloadDefaultValues) Stream.of((Object[]) values()).filter(new a(CarrierFeature.getDefaultAutoDownload(), 1)).findFirst().orElse(WIFI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$get$0(String str, AutoDownloadDefaultValues autoDownloadDefaultValues) {
        return autoDownloadDefaultValues.carrierFeatureValue.equals(str);
    }

    public static AutoDownloadDefaultValues valueOf(String str) {
        return (AutoDownloadDefaultValues) Enum.valueOf(AutoDownloadDefaultValues.class, str);
    }

    public static AutoDownloadDefaultValues[] values() {
        return (AutoDownloadDefaultValues[]) $VALUES.clone();
    }

    public int getDefaultValue() {
        return this.option.getDbValue();
    }

    public AutoDownloadOptions getOption() {
        return this.option;
    }

    public boolean needsToRemoveAutoDownloadMenu() {
        return this == REMOVE || this == REMOVE_WIFI || this == REMOVE_OFF;
    }
}
