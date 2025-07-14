package com.idm.adapter.logmanager;

import android.content.Context;
import com.idm.adapter.common.IDMCommonUtils;

/* loaded from: classes.dex */
public class IDMDebug {
    private static IDMLogManager debug = null;
    private static IDMLogManagerAdapter idmLogInterface = null;
    private static String idmSecurityKey = "";
    private static boolean isDUMP = false;
    private static boolean isLogFileSaveEnable = true;
    private static boolean isPrivate = false;

    public IDMDebug(IDMLogManagerAdapter iDMLogManagerAdapter) {
        if (iDMLogManagerAdapter == null) {
            debug = new IDMLogManager();
        } else {
            idmLogInterface = iDMLogManagerAdapter;
            idmSecurityKey = iDMLogManagerAdapter.idmGetSecurityKey();
        }
    }

    public static void D(String str) {
        try {
            IDMLogManagerAdapter iDMLogManagerAdapter = idmLogInterface;
            if (iDMLogManagerAdapter != null) {
                iDMLogManagerAdapter.D(str);
            } else {
                IDMLogManager iDMLogManager = debug;
                if (iDMLogManager != null) {
                    iDMLogManager.D(str);
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void DUMP(byte[] bArr, int i5) {
        try {
            if (isDUMP) {
                if (bArr == null) {
                    I("buf is null");
                    return;
                }
                int length = bArr.length;
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                for (int i6 = 0; i6 < length; i6++) {
                    int i7 = i6 + i5;
                    sb2.append((char) IDMCommonUtils.idmLibHexToChar((bArr[i7] >> 4) & 15));
                    sb2.append((char) IDMCommonUtils.idmLibHexToChar(bArr[i7] & 15));
                    sb2.append(' ');
                    byte b2 = bArr[i7];
                    if (b2 < 32 || b2 > 126) {
                        sb.append('.');
                    } else {
                        sb.append((char) b2);
                    }
                    if (i6 % 16 == 15 || i6 == length - 1) {
                        if (sb.length() > 0) {
                            sb2.append("   ");
                            sb2.append((CharSequence) sb);
                        }
                        sb2.append("\r\n");
                        I(sb2.toString());
                        sb2.setLength(0);
                        sb.setLength(0);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void E(String str) {
        try {
            IDMLogManagerAdapter iDMLogManagerAdapter = idmLogInterface;
            if (iDMLogManagerAdapter != null) {
                iDMLogManagerAdapter.E(str);
            } else {
                IDMLogManager iDMLogManager = debug;
                if (iDMLogManager != null) {
                    iDMLogManager.E(str);
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void H(String str) {
        try {
            IDMLogManagerAdapter iDMLogManagerAdapter = idmLogInterface;
            if (iDMLogManagerAdapter != null) {
                iDMLogManagerAdapter.H(str);
            } else {
                IDMLogManager iDMLogManager = debug;
                if (iDMLogManager != null) {
                    iDMLogManager.H(str);
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void I(String str) {
        try {
            IDMLogManagerAdapter iDMLogManagerAdapter = idmLogInterface;
            if (iDMLogManagerAdapter != null) {
                iDMLogManagerAdapter.I(str);
            } else {
                IDMLogManager iDMLogManager = debug;
                if (iDMLogManager != null) {
                    iDMLogManager.I(str);
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void V(String str) {
        try {
            IDMLogManagerAdapter iDMLogManagerAdapter = idmLogInterface;
            if (iDMLogManagerAdapter != null) {
                iDMLogManagerAdapter.V(str);
            } else {
                IDMLogManager iDMLogManager = debug;
                if (iDMLogManager != null) {
                    iDMLogManager.V(str);
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void W(String str) {
        try {
            IDMLogManagerAdapter iDMLogManagerAdapter = idmLogInterface;
            if (iDMLogManagerAdapter != null) {
                iDMLogManagerAdapter.W(str);
            } else {
                IDMLogManager iDMLogManager = debug;
                if (iDMLogManager != null) {
                    iDMLogManager.W(str);
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void idmDumpLogeOnOff() {
        isDUMP = !isDUMP;
        I("IDM_DUMPLOG_STATE : " + isDUMP);
    }

    public static boolean idmGetDumpLogState() {
        return isDUMP;
    }

    public static boolean idmGetLogFileSaveState() {
        return isLogFileSaveEnable;
    }

    public static String idmGetSecurityKey() {
        return idmSecurityKey;
    }

    public static void idmLogfileSaveOnOff() {
        isLogFileSaveEnable = !isLogFileSaveEnable;
        I("IDM_LOGFILESAVE_STATE : " + isLogFileSaveEnable);
    }

    public static void idmPrivateLogOnOff() {
        isPrivate = !isPrivate;
        I("IDM_PRIVATE_LOG_ON : " + isPrivate);
    }

    public static void idmSaveDevInfoLog(Context context) {
        try {
            IDMLogManagerAdapter iDMLogManagerAdapter = idmLogInterface;
            if (iDMLogManagerAdapter != null) {
                iDMLogManagerAdapter.idmSaveDevInfoLog(context);
            }
        } catch (Exception unused) {
        }
    }

    public static void idmSaveDeviceStatusLog(Context context, String str, String str2) {
        try {
            IDMLogManagerAdapter iDMLogManagerAdapter = idmLogInterface;
            if (iDMLogManagerAdapter != null) {
                iDMLogManagerAdapter.idmSaveDeviceStatusLog(context, str, str2);
            }
        } catch (Exception unused) {
        }
    }

    public static void printStackTrace(Throwable th) {
        try {
            IDMLogManagerAdapter iDMLogManagerAdapter = idmLogInterface;
            if (iDMLogManagerAdapter != null) {
                iDMLogManagerAdapter.printStackTrace(th);
            } else {
                IDMLogManager iDMLogManager = debug;
                if (iDMLogManager != null) {
                    iDMLogManager.printStackTrace(th);
                }
            }
        } catch (Exception unused) {
        }
    }
}
