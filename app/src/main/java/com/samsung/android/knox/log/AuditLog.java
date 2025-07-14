package com.samsung.android.knox.log;

import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public class AuditLog {
    public static final String ACTION_AUDIT_CRITICAL_SIZE = "com.samsung.android.knox.intent.action.AUDIT_CRITICAL_SIZE";
    public static final String ACTION_AUDIT_FULL_SIZE = "com.samsung.android.knox.intent.action.AUDIT_FULL_SIZE";
    public static final String ACTION_AUDIT_MAXIMUM_SIZE = "com.samsung.android.knox.intent.action.AUDIT_MAXIMUM_SIZE";
    public static final String ACTION_DUMP_LOG_RESULT = "com.samsung.android.knox.intent.action.DUMP_LOG_RESULT";
    public static final String ACTION_LOG_EXCEPTION = "com.samsung.android.knox.intent.action.LOG_EXCEPTION";
    public static final int AUDIT_LOG_GROUP_APPLICATION = 5;
    public static final int AUDIT_LOG_GROUP_EVENTS = 4;
    public static final int AUDIT_LOG_GROUP_NETWORK = 3;
    public static final int AUDIT_LOG_GROUP_SECURITY = 1;
    public static final int AUDIT_LOG_GROUP_SYSTEM = 2;
    public static final int AUDIT_LOG_SEVERITY_ALERT = 1;
    public static final int AUDIT_LOG_SEVERITY_CRITICAL = 2;
    public static final int AUDIT_LOG_SEVERITY_ERROR = 3;
    public static final int AUDIT_LOG_SEVERITY_NOTICE = 5;
    public static final int AUDIT_LOG_SEVERITY_WARNING = 4;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_UNKNOWN = -2000;
    public static final String EXTRA_AUDIT_RESULT = "com.samsung.android.knox.intent.extra.AUDIT_RESULT";

    public AuditLog() {
        throw new RuntimeException("Stub!");
    }

    public static void a(int i5, boolean z4, int i6, String str, String str2) {
        throw new RuntimeException("Stub!");
    }

    public static void c(int i5, boolean z4, int i6, String str, String str2) {
        throw new RuntimeException("Stub!");
    }

    public static void e(int i5, boolean z4, int i6, String str, String str2) {
        throw new RuntimeException("Stub!");
    }

    public static void n(int i5, boolean z4, int i6, String str, String str2) {
        throw new RuntimeException("Stub!");
    }

    public static void w(int i5, boolean z4, int i6, String str, String str2) {
        throw new RuntimeException("Stub!");
    }

    public boolean disableAuditLog() {
        throw new RuntimeException("Stub!");
    }

    public boolean disableIPTablesLogging() {
        throw new RuntimeException("Stub!");
    }

    public boolean dumpLogFile(long j5, long j6, String str, ParcelFileDescriptor parcelFileDescriptor) {
        throw new RuntimeException("Stub!");
    }

    public boolean enableAuditLog() {
        throw new RuntimeException("Stub!");
    }

    public boolean enableIPTablesLogging() {
        throw new RuntimeException("Stub!");
    }

    public AuditLogRulesInfo getAuditLogRules() {
        throw new RuntimeException("Stub!");
    }

    public int getCriticalLogSize() {
        throw new RuntimeException("Stub!");
    }

    public int getCurrentLogFileSize() {
        throw new RuntimeException("Stub!");
    }

    public int getMaximumLogSize() {
        throw new RuntimeException("Stub!");
    }

    public boolean isAuditLogEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isIPTablesLoggingEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean setAuditLogRules(AuditLogRulesInfo auditLogRulesInfo) {
        throw new RuntimeException("Stub!");
    }

    public boolean setCriticalLogSize(int i5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setMaximumLogSize(int i5) {
        throw new RuntimeException("Stub!");
    }
}
