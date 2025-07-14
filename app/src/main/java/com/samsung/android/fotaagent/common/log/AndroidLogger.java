package com.samsung.android.fotaagent.common.log;

import android.os.SemSystemProperties;
import com.idm.fotaagent.utils.DeviceUtils;
import com.samsung.android.fotaagent.common.cipher.AESCrypt;
import com.samsung.android.fotaagent.common.log.Logger;

/* loaded from: classes.dex */
abstract class AndroidLogger extends Logger {
    private final String tagName;

    /* renamed from: com.samsung.android.fotaagent.common.log.AndroidLogger$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$samsung$android$fotaagent$common$log$Logger$Level;

        static {
            int[] iArr = new int[Logger.Level.values().length];
            $SwitchMap$com$samsung$android$fotaagent$common$log$Logger$Level = iArr;
            try {
                iArr[Logger.Level.H.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$samsung$android$fotaagent$common$log$Logger$Level[Logger.Level.V.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$samsung$android$fotaagent$common$log$Logger$Level[Logger.Level.D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class Debug extends AndroidLogger {
        public /* synthetic */ Debug(String str, int i5, AnonymousClass1 anonymousClass1) {
            this(str, i5);
        }

        @Override // com.samsung.android.fotaagent.common.log.AndroidLogger
        public String encryptIfNeeded(String str) {
            return str;
        }

        private Debug(String str, int i5) {
            super(str, i5, null);
        }
    }

    public static class Release extends AndroidLogger {

        public static class SecOff extends Release {
            public /* synthetic */ SecOff(String str, int i5, AnonymousClass1 anonymousClass1) {
                this(str, i5);
            }

            @Override // com.samsung.android.fotaagent.common.log.AndroidLogger, com.samsung.android.fotaagent.common.log.Logger
            public void log(Logger.Level level, Where where, Object obj) {
                int i5 = AnonymousClass1.$SwitchMap$com$samsung$android$fotaagent$common$log$Logger$Level[level.ordinal()];
                if (i5 == 1 || i5 == 2 || i5 == 3) {
                    return;
                }
                super.log(level, where, obj);
            }

            private SecOff(String str, int i5) {
                super(str, i5, null);
            }
        }

        public static class SecOn extends Release {
            public /* synthetic */ SecOn(String str, int i5, AnonymousClass1 anonymousClass1) {
                this(str, i5);
            }

            private SecOn(String str, int i5) {
                super(str, i5, null);
            }
        }

        public /* synthetic */ Release(String str, int i5, AnonymousClass1 anonymousClass1) {
            this(str, i5);
        }

        @Override // com.samsung.android.fotaagent.common.log.AndroidLogger
        public String encryptIfNeeded(String str) {
            return AESCrypt.encrypt(str);
        }

        private Release(String str, int i5) {
            super(str, i5, null);
        }
    }

    public /* synthetic */ AndroidLogger(String str, int i5, AnonymousClass1 anonymousClass1) {
        this(str, i5);
    }

    private String getTagName() {
        return this.tagName;
    }

    private static boolean isSecLogEnabled() {
        return "1".equals(SemSystemProperties.get("persist.log.seclevel", "0"));
    }

    public static AndroidLogger of(String str) {
        return of(str, 0);
    }

    public abstract String encryptIfNeeded(String str);

    @Override // com.samsung.android.fotaagent.common.log.Logger
    public void log(Logger.Level level, Where where, Object obj) {
        try {
            if (level != Logger.Level.S) {
                if (level == Logger.Level.H) {
                    obj = encryptIfNeeded(String.valueOf(obj));
                }
                android.util.Log.println(level.priority(), getTagName(), where + " " + obj);
                return;
            }
            String strValueOf = String.valueOf(obj);
            int i5 = 0;
            while (true) {
                int iIndexOf = strValueOf.indexOf(10, i5);
                if (iIndexOf == -1) {
                    return;
                }
                android.util.Log.println(level.priority(), getTagName(), where + " " + encryptIfNeeded(strValueOf.substring(i5, iIndexOf)));
                i5 = iIndexOf + 1;
            }
        } catch (Exception e5) {
            android.util.Log.e("IDM_FOTA", e5.toString());
        }
    }

    private AndroidLogger(String str, int i5) {
        super(i5);
        this.tagName = str;
    }

    public static AndroidLogger of(String str, int i5) {
        AnonymousClass1 anonymousClass1 = null;
        return !DeviceUtils.isUserShipBinary() ? new Debug(str, i5, anonymousClass1) : !isSecLogEnabled() ? new Release.SecOff(str, i5, anonymousClass1) : new Release.SecOn(str, i5, anonymousClass1);
    }
}
