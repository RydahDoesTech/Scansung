package com.idm.fotaagent.utils;

import android.app.ActivityManager;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.sqlite.database.settings.SettingsDatabaseManager;
import com.idm.fotaagent.enabler.adapter.IDMAdapterDeviceInfoImpl;
import com.samsung.android.fotaagent.common.cipher.AESCrypt;
import com.samsung.android.fotaagent.common.log.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class GeneralUtils {
    private static final String CLASS_NAME_FOTA_SUGGESTION = "com.android.settings.Settings$FOTASuggestionActivity";
    private static final long NO_UPDATE = -1;
    private static final String PACKAGE_NAME_SETTINGS = "com.android.settings";
    private static final String PACKAGE_NAME_SETUP_WIZARD = "com.sec.android.app.SecSetupWizard";
    private static final String PACKAGE_NAME_SMART_SWITCH = "com.sec.android.easyMover";
    private static volatile boolean stopsPrintingProcessInfo;
    private static volatile boolean stopsPrintingTaskInfo;

    public static String appendExtraParam(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str);
        if (str.contains("?")) {
            sb.append("&");
        } else {
            sb.append("?");
        }
        sb.append("px-nb=");
        sb.append(AESCrypt.encrypt(new IDMAdapterDeviceInfoImpl().idmGetUsingBearer(context)));
        sb.append("&px-rmtime=");
        sb.append(DateTimeFormatter.ofPattern("yyyy-MM-dd%20HH:mm:ss", Locale.US).format(LocalDateTime.now(ZoneOffset.UTC)));
        return sb.toString();
    }

    private static void disableSettingsFOTASuggestionComponent(Context context) {
        try {
            Log.I("disable com.android.settings.Settings$FOTASuggestionActivity");
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(PACKAGE_NAME_SETTINGS, CLASS_NAME_FOTA_SUGGESTION), 2, 1);
        } catch (IllegalArgumentException | NullPointerException e5) {
            Log.printStackTrace(e5);
        }
    }

    private static void enableSettingsFOTASuggestionComponent(Context context) {
        try {
            Log.I("enable com.android.settings.Settings$FOTASuggestionActivity");
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(PACKAGE_NAME_SETTINGS, CLASS_NAME_FOTA_SUGGESTION), 1, 1);
        } catch (IllegalArgumentException | NullPointerException e5) {
            Log.printStackTrace(e5);
        }
    }

    public static String generateHash(String str, String str2) throws NoSuchAlgorithmException {
        try {
            byte[] bytes = str.getBytes(Charset.defaultCharset());
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.reset();
            byte[] bArrDigest = messageDigest.digest(bytes);
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                sb.append(Integer.toString((b2 & 255) + 256, 16).substring(1));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e5) {
            Log.printStackTrace(e5);
            return str;
        }
    }

    public static Object invokeStaticMethod(String str, String str2, Class<?>[] clsArr, Object... objArr) throws NoSuchMethodException, SecurityException {
        try {
            Method method = Class.forName(str).getMethod(str2, clsArr);
            if (method != null) {
                return method.invoke(null, objArr);
            }
            return null;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e5) {
            Log.I(e5.getMessage());
            return null;
        }
    }

    public static boolean isPackageInstalled(Context context, String str) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            Log.W("PackageManager is null");
            return false;
        }
        try {
            packageManager.getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean isRunningOOBESmartSwitch(Context context) {
        if (!isPackageInstalled(context, PACKAGE_NAME_SMART_SWITCH)) {
            Log.I("SmartSwitch is not installed");
            return false;
        }
        try {
        } catch (Exception e5) {
            Log.E("Exception : " + e5);
        }
        return "TRUE".equals(context.getContentResolver().getType(Uri.parse("content://com.sec.android.easyMover.statusProvider/isOOBERunning")));
    }

    public static boolean isSetupWizardCompleted(Context context) {
        if (!isSetupWizardInstalled(context)) {
            Log.I("Setup Wizard is not installed");
            return true;
        }
        boolean zIsDeviceProvisioned = SettingsDatabaseManager.isDeviceProvisioned(context);
        Log.I("Setup Wizard Completed: " + zIsDeviceProvisioned);
        return zIsDeviceProvisioned;
    }

    public static boolean isSetupWizardInstalled(Context context) {
        return isPackageInstalled(context, PACKAGE_NAME_SETUP_WIZARD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$printProcessInfo$0(ActivityManager.RunningAppProcessInfo runningAppProcessInfo, ActivityManager.RunningAppProcessInfo runningAppProcessInfo2) {
        return runningAppProcessInfo.lru - runningAppProcessInfo2.lru;
    }

    public static int parseInt(String str, int i5) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e5) {
            Log.printStackTrace(e5, str);
            return i5;
        }
    }

    public static void printAuditLog(Context context, String str, boolean z4) {
        try {
            Uri uri = Uri.parse("content://com.sec.knox.provider/AuditLog");
            ContentValues contentValues = new ContentValues();
            contentValues.put("severity", (Integer) 1);
            contentValues.put("group", (Integer) 5);
            contentValues.put("outcome", Boolean.valueOf(z4));
            contentValues.put("uid", Integer.valueOf(Process.myPid()));
            contentValues.put("component", context.getClass().getSimpleName());
            contentValues.put("message", "Software update: " + str);
            context.getContentResolver().insert(uri, contentValues);
        } catch (IllegalArgumentException e5) {
            Log.printStackTrace(e5);
        }
    }

    public static void printProcessInfo(final int i5) {
        stopsPrintingProcessInfo = false;
        Thread thread = new Thread() { // from class: com.idm.fotaagent.utils.GeneralUtils.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws InterruptedException {
                while (!GeneralUtils.stopsPrintingProcessInfo) {
                    GeneralUtils.printProcessInfo();
                    try {
                        TimeUnit.SECONDS.sleep(i5);
                    } catch (InterruptedException e5) {
                        Log.printStackTrace(e5);
                    }
                }
            }
        };
        thread.setDaemon(true);
        thread.start();
    }

    public static void printTaskInfo(final int i5) {
        stopsPrintingTaskInfo = false;
        Thread thread = new Thread() { // from class: com.idm.fotaagent.utils.GeneralUtils.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws InterruptedException, SecurityException {
                while (!GeneralUtils.stopsPrintingTaskInfo) {
                    GeneralUtils.printTaskInfo();
                    try {
                        TimeUnit.SECONDS.sleep(i5);
                    } catch (InterruptedException e5) {
                        Log.printStackTrace(e5);
                    }
                }
            }
        };
        thread.setDaemon(true);
        thread.start();
    }

    public static void resetBadgeAndPendingAfWSystemUpdate() {
        Context contextIdmGetContext = IDMApplication.idmGetContext();
        try {
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) contextIdmGetContext.getSystemService(DevicePolicyManager.class);
            Objects.requireNonNull(devicePolicyManager);
            devicePolicyManager.semNotifyPendingSystemUpdate(-1L);
        } catch (NoSuchMethodError | NullPointerException e5) {
            Log.printStackTrace(e5);
        }
        SettingsDatabaseManager.setBadgeCount(contextIdmGetContext, 0);
        disableSettingsFOTASuggestionComponent(contextIdmGetContext);
    }

    public static void setBadgeAndPendingAfWSystemUpdate() {
        Context contextIdmGetContext = IDMApplication.idmGetContext();
        try {
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) contextIdmGetContext.getSystemService(DevicePolicyManager.class);
            Objects.requireNonNull(devicePolicyManager);
            devicePolicyManager.semNotifyPendingSystemUpdate(System.currentTimeMillis());
        } catch (NoSuchMethodError | NullPointerException e5) {
            Log.printStackTrace(e5);
        }
        SettingsDatabaseManager.setBadgeCount(contextIdmGetContext, 1);
        enableSettingsFOTASuggestionComponent(contextIdmGetContext);
    }

    public static void stopPrintingProcessInfo() {
        stopsPrintingProcessInfo = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void printProcessInfo() {
        /*
            android.content.Context r0 = com.idm.fotaagent.IDMApplication.idmGetContext()
            java.lang.Class<android.app.ActivityManager> r1 = android.app.ActivityManager.class
            java.lang.Object r1 = r0.getSystemService(r1)
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            java.util.List r1 = r1.getRunningAppProcesses()
            if (r1 != 0) goto L18
            java.lang.String r0 = "processInfoList should not be null"
            com.samsung.android.fotaagent.common.log.Log.W(r0)
            return
        L18:
            G.c r2 = new G.c
            r3 = 1
            r2.<init>(r3)
            java.util.Collections.sort(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "#running processes: "
            r2.<init>(r3)
            int r3 = r1.size()
            r2.append(r3)
            java.lang.String r3 = ", myUid: "
            r2.append(r3)
            int r3 = android.os.Process.myUid()
            r2.append(r3)
            java.lang.String r3 = ", myPid: "
            r2.append(r3)
            int r3 = android.os.Process.myPid()
            r2.append(r3)
            java.lang.String r3 = ", myTid: "
            r2.append(r3)
            int r3 = android.os.Process.myTid()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.samsung.android.fotaagent.common.log.Log.E(r2)
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
        L5f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Leb
            java.lang.Object r3 = r1.next()
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3
            int r4 = r3.importance
            r5 = 100
            if (r4 == r5) goto La3
            r5 = 125(0x7d, float:1.75E-43)
            if (r4 == r5) goto La0
            r5 = 130(0x82, float:1.82E-43)
            if (r4 == r5) goto L9d
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 == r5) goto L9a
            r5 = 230(0xe6, float:3.22E-43)
            if (r4 == r5) goto L9d
            r5 = 300(0x12c, float:4.2E-43)
            if (r4 == r5) goto L97
            r5 = 325(0x145, float:4.55E-43)
            if (r4 == r5) goto L94
            r5 = 400(0x190, float:5.6E-43)
            if (r4 == r5) goto L91
            java.lang.String r4 = "unknowns"
        L8f:
            r10 = r4
            goto La6
        L91:
            java.lang.String r4 = "CACHED"
            goto L8f
        L94:
            java.lang.String r4 = "TOP_SLEEPING"
            goto L8f
        L97:
            java.lang.String r4 = "SERVICE"
            goto L8f
        L9a:
            java.lang.String r4 = "VISIBLE"
            goto L8f
        L9d:
            java.lang.String r4 = "PERCEPTIBLE"
            goto L8f
        La0:
            java.lang.String r4 = "FOREGROUND_SERVICE"
            goto L8f
        La3:
            java.lang.String r4 = "FOREGROUND"
            goto L8f
        La6:
            java.util.Locale r4 = java.util.Locale.US
            int r13 = r2 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.String r6 = r3.processName
            int r2 = r3.pid
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            int r2 = r3.uid
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            int r2 = r3.lru
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            int r2 = r3.importance
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = r3.processName
            java.lang.String r3 = r0.getPackageName()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Ld8
            java.lang.String r2 = " <<<<<<<<"
        Ld6:
            r12 = r2
            goto Ldb
        Ld8:
            java.lang.String r2 = ""
            goto Ld6
        Ldb:
            java.lang.Object[] r2 = new java.lang.Object[]{r5, r6, r7, r8, r9, r10, r11, r12}
            java.lang.String r3 = "#%-3d process: %-60s, pid: %5d, uid: %5d, lru: %4d, %s(%3d)%s"
            java.lang.String r2 = java.lang.String.format(r4, r3, r2)
            com.samsung.android.fotaagent.common.log.Log.I(r2)
            r2 = r13
            goto L5f
        Leb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.idm.fotaagent.utils.GeneralUtils.printProcessInfo():void");
    }

    public static void printTaskInfo() throws SecurityException {
        ActivityManager activityManager = (ActivityManager) IDMApplication.idmGetContext().getSystemService(ActivityManager.class);
        List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
        Log.I("AppTasks: " + appTasks.size());
        Iterator<ActivityManager.AppTask> it = appTasks.iterator();
        while (it.hasNext()) {
            ActivityManager.RecentTaskInfo taskInfo = it.next().getTaskInfo();
            Log.I("\tnumActivities: " + taskInfo.numActivities + ", base: " + taskInfo.baseActivity + ", orig: " + taskInfo.origActivity + ", top: " + taskInfo.topActivity);
        }
        List<ActivityManager.RecentTaskInfo> recentTasks = activityManager.getRecentTasks(10, 0);
        Log.I("RecentTasks: " + recentTasks.size());
        for (ActivityManager.RecentTaskInfo recentTaskInfo : recentTasks) {
            Log.I("\tnumActivities: " + recentTaskInfo.numActivities + ", base: " + recentTaskInfo.baseActivity + ", orig: " + recentTaskInfo.origActivity + ", top: " + recentTaskInfo.topActivity);
        }
        List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(10);
        Log.I("RunningTasks: " + runningTasks.size());
        for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
            Log.I("\tnumActivities: " + runningTaskInfo.numActivities + ", numRunning: " + runningTaskInfo.numRunning + ", base: " + runningTaskInfo.baseActivity + ", top: " + runningTaskInfo.topActivity);
        }
    }
}
