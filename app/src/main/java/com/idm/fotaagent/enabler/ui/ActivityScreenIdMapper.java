package com.idm.fotaagent.enabler.ui;

import android.app.Activity;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.analytics.samsunganalytics.SAConstants;
import com.idm.fotaagent.enabler.ui.ActivityScreenIdMapper;
import com.idm.fotaagent.enabler.ui.whatsnew.MajorUpdate;
import java.util.Arrays;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public class ActivityScreenIdMapper {

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'LAST_UPDATE' uses external variables
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
    public static final class ScreenId {
        private static final /* synthetic */ ScreenId[] $VALUES = $values();
        public static final ScreenId DOWNLOAD_CONFIRM;
        public static final ScreenId DOWNLOAD_PROGRESS;
        public static final ScreenId INSTALL_CONFIRM;
        public static final ScreenId LAST_UPDATE;
        private final String[] activities;
        private final Supplier<String> screenIdSupplier;

        private static /* synthetic */ ScreenId[] $values() {
            return new ScreenId[]{LAST_UPDATE, DOWNLOAD_CONFIRM, DOWNLOAD_PROGRESS, INSTALL_CONFIRM};
        }

        static {
            final int i5 = 0;
            LAST_UPDATE = new ScreenId("LAST_UPDATE", 0, new Supplier() { // from class: com.idm.fotaagent.enabler.ui.c
                @Override // java.util.function.Supplier
                public final Object get() {
                    switch (i5) {
                        case 0:
                            return SAConstants.ScreedId.SCREEN_ID_LAST_UPDATE;
                        case 1:
                            return ActivityScreenIdMapper.ScreenId.lambda$static$1();
                        case 2:
                            return SAConstants.ScreedId.SCREEN_ID_DOWNLOAD_PROGRESS;
                        default:
                            return ActivityScreenIdMapper.ScreenId.lambda$static$3();
                    }
                }
            }, "LastUpdateActivity");
            final int i6 = 1;
            DOWNLOAD_CONFIRM = new ScreenId("DOWNLOAD_CONFIRM", 1, new Supplier() { // from class: com.idm.fotaagent.enabler.ui.c
                @Override // java.util.function.Supplier
                public final Object get() {
                    switch (i6) {
                        case 0:
                            return SAConstants.ScreedId.SCREEN_ID_LAST_UPDATE;
                        case 1:
                            return ActivityScreenIdMapper.ScreenId.lambda$static$1();
                        case 2:
                            return SAConstants.ScreedId.SCREEN_ID_DOWNLOAD_PROGRESS;
                        default:
                            return ActivityScreenIdMapper.ScreenId.lambda$static$3();
                    }
                }
            }, "DownloadConfirmActivity");
            final int i7 = 2;
            DOWNLOAD_PROGRESS = new ScreenId("DOWNLOAD_PROGRESS", 2, new Supplier() { // from class: com.idm.fotaagent.enabler.ui.c
                @Override // java.util.function.Supplier
                public final Object get() {
                    switch (i7) {
                        case 0:
                            return SAConstants.ScreedId.SCREEN_ID_LAST_UPDATE;
                        case 1:
                            return ActivityScreenIdMapper.ScreenId.lambda$static$1();
                        case 2:
                            return SAConstants.ScreedId.SCREEN_ID_DOWNLOAD_PROGRESS;
                        default:
                            return ActivityScreenIdMapper.ScreenId.lambda$static$3();
                    }
                }
            }, "DownloadProgressActivity", "DownloadAndInstallProgressActivity");
            final int i8 = 3;
            INSTALL_CONFIRM = new ScreenId("INSTALL_CONFIRM", 3, new Supplier() { // from class: com.idm.fotaagent.enabler.ui.c
                @Override // java.util.function.Supplier
                public final Object get() {
                    switch (i8) {
                        case 0:
                            return SAConstants.ScreedId.SCREEN_ID_LAST_UPDATE;
                        case 1:
                            return ActivityScreenIdMapper.ScreenId.lambda$static$1();
                        case 2:
                            return SAConstants.ScreedId.SCREEN_ID_DOWNLOAD_PROGRESS;
                        default:
                            return ActivityScreenIdMapper.ScreenId.lambda$static$3();
                    }
                }
            }, "InstallConfirmActivity");
        }

        private ScreenId(String str, int i5, Supplier supplier, String... strArr) {
            this.screenIdSupplier = supplier;
            this.activities = strArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getScreenId() {
            return this.screenIdSupplier.get();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$static$1() {
            return MajorUpdate.FOR_WHATS_NEW.isMajorUpdate(IDMApplication.idmGetContext()) ? SAConstants.ScreedId.SCREEN_ID_MAJOR_DOWNLOAD_CONFIRM : SAConstants.ScreedId.SCREEN_ID_MINOR_DOWNLOAD_CONFIRM;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$static$3() {
            return MajorUpdate.FOR_WHATS_NEW.isMajorUpdate(IDMApplication.idmGetContext()) ? SAConstants.ScreedId.SCREEN_ID_MAJOR_INSTALL_CONFIRM : SAConstants.ScreedId.SCREEN_ID_MINOR_INSTALL_CONFIRM;
        }

        public static ScreenId valueOf(String str) {
            return (ScreenId) Enum.valueOf(ScreenId.class, str);
        }

        public static ScreenId[] values() {
            return (ScreenId[]) $VALUES.clone();
        }
    }

    public static String getScreenIdFrom(Activity activity) {
        return (String) Arrays.stream(ScreenId.values()).filter(new a(0, activity)).findFirst().map(new b(0)).orElse(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getScreenIdFrom$0(Activity activity, ScreenId screenId) {
        return Arrays.asList(screenId.activities).contains(activity.getClass().getSimpleName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getScreenIdFrom$1(Object obj) {
        return ((ScreenId) obj).getScreenId();
    }
}
