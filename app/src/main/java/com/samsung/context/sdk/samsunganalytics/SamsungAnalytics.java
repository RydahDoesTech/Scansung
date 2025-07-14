package com.samsung.context.sdk.samsunganalytics;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.samsung.context.sdk.samsunganalytics.internal.Tracker;
import com.samsung.context.sdk.samsunganalytics.internal.policy.Validation;
import com.samsung.context.sdk.samsunganalytics.internal.util.Debug;
import com.samsung.context.sdk.samsunganalytics.internal.util.Utils;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class SamsungAnalytics {
    public static final String SDK_VERSION = "6.05.077";
    private static SamsungAnalytics instance;
    private Tracker tracker;

    private SamsungAnalytics(Application application, Configuration configuration) {
        this.tracker = null;
        if (Validation.isValid(application, configuration)) {
            this.tracker = new Tracker(application, configuration);
        }
    }

    public static Configuration getConfiguration() {
        if (isInstanceNull()) {
            return null;
        }
        return instance.tracker.getConfiguration();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042 A[Catch: NullPointerException -> 0x003a, PHI: r5
  0x0042: PHI (r5v9 android.database.Cursor) = (r5v8 android.database.Cursor), (r5v11 android.database.Cursor) binds: [B:29:0x005e, B:21:0x0040] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {NullPointerException -> 0x003a, blocks: (B:3:0x0003, B:5:0x000f, B:7:0x001b, B:13:0x0036, B:22:0x0042, B:32:0x0063, B:33:0x0066, B:34:0x0067), top: B:41:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063 A[Catch: NullPointerException -> 0x003a, TRY_ENTER, TryCatch #4 {NullPointerException -> 0x003a, blocks: (B:3:0x0003, B:5:0x000f, B:7:0x001b, B:13:0x0036, B:22:0x0042, B:32:0x0063, B:33:0x0066, B:34:0x0067), top: B:41:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String getDeviceId(android.content.Context r5) throws java.lang.Throwable {
        /*
            r4 = this;
            java.lang.String r0 = "failed to get deviceId from DMA : "
            r1 = 0
            com.samsung.context.sdk.samsunganalytics.internal.Tracker r2 = r4.tracker     // Catch: java.lang.NullPointerException -> L3a
            com.samsung.context.sdk.samsunganalytics.Configuration r2 = r2.getConfiguration()     // Catch: java.lang.NullPointerException -> L3a
            boolean r2 = r2.isEnableAutoDeviceId()     // Catch: java.lang.NullPointerException -> L3a
            if (r2 == 0) goto L67
            com.samsung.context.sdk.samsunganalytics.internal.Tracker r2 = r4.tracker     // Catch: java.lang.NullPointerException -> L3a
            com.samsung.context.sdk.samsunganalytics.Configuration r2 = r2.getConfiguration()     // Catch: java.lang.NullPointerException -> L3a
            boolean r2 = r2.isEnableUseInAppLogging()     // Catch: java.lang.NullPointerException -> L3a
            if (r2 != 0) goto L67
            java.lang.String r2 = "content://com.sec.android.log.diagmonagent.sa/deviceid"
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.NullPointerException -> L3a
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            android.database.Cursor r5 = r5.query(r2, r1, r1, r1)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            if (r5 == 0) goto L40
            boolean r2 = r5.moveToNext()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            if (r2 == 0) goto L40
            r2 = 0
            java.lang.String r0 = r5.getString(r2)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r5.close()     // Catch: java.lang.NullPointerException -> L3a
            return r0
        L3a:
            r5 = move-exception
            goto L72
        L3c:
            r0 = move-exception
            goto L61
        L3e:
            r2 = move-exception
            goto L4b
        L40:
            if (r5 == 0) goto L67
        L42:
            r5.close()     // Catch: java.lang.NullPointerException -> L3a
            goto L67
        L46:
            r0 = move-exception
            r5 = r1
            goto L61
        L49:
            r2 = move-exception
            r5 = r1
        L4b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r2.getMessage()     // Catch: java.lang.Throwable -> L3c
            r3.append(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L3c
            com.samsung.context.sdk.samsunganalytics.internal.util.Debug.logwingW(r0)     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L67
            goto L42
        L61:
            if (r5 == 0) goto L66
            r5.close()     // Catch: java.lang.NullPointerException -> L3a
        L66:
            throw r0     // Catch: java.lang.NullPointerException -> L3a
        L67:
            com.samsung.context.sdk.samsunganalytics.internal.Tracker r5 = r4.tracker     // Catch: java.lang.NullPointerException -> L3a
            com.samsung.context.sdk.samsunganalytics.Configuration r5 = r5.getConfiguration()     // Catch: java.lang.NullPointerException -> L3a
            java.lang.String r4 = r5.getDeviceId()     // Catch: java.lang.NullPointerException -> L3a
            return r4
        L72:
            java.lang.Class r4 = r4.getClass()
            com.samsung.context.sdk.samsunganalytics.internal.util.Debug.LogException(r4, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.context.sdk.samsunganalytics.SamsungAnalytics.getDeviceId(android.content.Context):java.lang.String");
    }

    public static SamsungAnalytics getInstance() {
        if (instance == null) {
            Utils.throwException("call after setConfiguration() method");
            if (!Utils.isDev()) {
                synchronized (SamsungAnalytics.class) {
                    try {
                        if (instance == null) {
                            instance = new SamsungAnalytics(null, null);
                        }
                    } finally {
                    }
                }
            }
        }
        return instance;
    }

    private static SamsungAnalytics getInstanceAndConfig(Application application, Configuration configuration) {
        if (isInstanceNull() || isTcTypeChanged(application, configuration)) {
            synchronized (SamsungAnalytics.class) {
                try {
                    if (isTcTypeChanged(application, configuration)) {
                        instance = SamsungAnalyticsHolder.getInstance(configuration);
                    }
                    if (isInstanceNull()) {
                        SamsungAnalytics samsungAnalytics = new SamsungAnalytics(application, configuration);
                        instance = samsungAnalytics;
                        SamsungAnalyticsHolder.putInstance(samsungAnalytics, configuration);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    private static boolean isInstanceNull() {
        SamsungAnalytics samsungAnalytics = instance;
        return samsungAnalytics == null || samsungAnalytics.tracker == null;
    }

    private static boolean isTcTypeChanged(Application application, Configuration configuration) {
        if (isInstanceNull()) {
            return false;
        }
        return Utils.isTcTypeChanged(application.getApplicationContext(), instance.tracker.getConfiguration(), configuration);
    }

    public static void setConfiguration(Application application, Configuration configuration) {
        Trace.beginSection("SamsungAnalytics setConfiguration");
        getInstanceAndConfig(application, configuration);
        Trace.endSection();
    }

    public void deleteLogData() {
        try {
            this.tracker.deleteLogData();
        } catch (NullPointerException e5) {
            Debug.LogException(getClass(), e5);
        }
    }

    public void deleteSensitiveLogData() {
        try {
            this.tracker.deleteSensitiveLogData();
        } catch (NullPointerException e5) {
            Debug.LogException(getClass(), e5);
        }
    }

    public SamsungAnalytics enableAutoActivityTracking() {
        try {
            this.tracker.enableAutoActivityTracking();
        } catch (NullPointerException e5) {
            Debug.LogException(getClass(), e5);
        }
        return this;
    }

    public void registerSettingPref(Map<String, Set<String>> map) {
        try {
            this.tracker.registerSettingPref(map);
        } catch (NullPointerException e5) {
            Debug.LogException(getClass(), e5);
        }
    }

    public int sendLog(Map<String, String> map) {
        Debug.LogD("sendLog");
        try {
            return this.tracker.sendLog(map);
        } catch (NullPointerException unused) {
            return -100;
        }
    }

    public void useWebAppLogging(Context context, WebView webView, String[] strArr) throws Throwable {
        if (context == null) {
            Utils.throwException("useWebAppLogging: context is null");
            return;
        }
        if (strArr == null) {
            Utils.throwException("useWebAppLogging: domain is null");
            return;
        }
        Tracker tracker = this.tracker;
        if (tracker == null || tracker.getConfiguration() == null) {
            Utils.throwException("useWebAppLogging: call after setConfiguration() method");
            return;
        }
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.setAcceptThirdPartyCookies(webView, true);
        webView.getSettings().setJavaScriptEnabled(true);
        int auidType = TextUtils.isEmpty(this.tracker.getConfiguration().getDeviceId()) ? 4 : this.tracker.getConfiguration().getAuidType();
        String deviceId = getDeviceId(context);
        String packageName = context.getPackageName();
        String str = Build.MODEL;
        String strValueOf = String.valueOf(this.tracker.getConfiguration().getUserAgreement().isAgreement());
        if (TextUtils.isEmpty(deviceId)) {
            Debug.LogE("useWebAppLogging: device id is null");
            return;
        }
        for (String str2 : strArr) {
            cookieManager.setCookie(str2, "_sa_auid=" + deviceId);
            cookieManager.setCookie(str2, "_sa_apn=" + packageName);
            cookieManager.setCookie(str2, "_sa_at=" + auidType);
            cookieManager.setCookie(str2, "_sa_dm=" + str);
            cookieManager.setCookie(str2, "_sa_agree=" + strValueOf);
        }
    }
}
