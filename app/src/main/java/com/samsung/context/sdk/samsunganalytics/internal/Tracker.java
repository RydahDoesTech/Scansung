package com.samsung.context.sdk.samsunganalytics.internal;

import I2.b;
import Y0.h;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Trace;
import android.os.UserManager;
import android.text.TextUtils;
import com.samsung.android.knox.net.wifi.WifiAdminProfile;
import com.samsung.context.sdk.samsunganalytics.Configuration;
import com.samsung.context.sdk.samsunganalytics.DBOpenHelper;
import com.samsung.context.sdk.samsunganalytics.LogBuilders;
import com.samsung.context.sdk.samsunganalytics.UserAgreement;
import com.samsung.context.sdk.samsunganalytics.internal.connection.Directory;
import com.samsung.context.sdk.samsunganalytics.internal.connection.Domain;
import com.samsung.context.sdk.samsunganalytics.internal.device.DeviceInfo;
import com.samsung.context.sdk.samsunganalytics.internal.policy.Constants;
import com.samsung.context.sdk.samsunganalytics.internal.policy.PolicyUtils;
import com.samsung.context.sdk.samsunganalytics.internal.policy.Validation;
import com.samsung.context.sdk.samsunganalytics.internal.sender.DMA.DMALogSender;
import com.samsung.context.sdk.samsunganalytics.internal.sender.Sender;
import com.samsung.context.sdk.samsunganalytics.internal.sender.buffering.Manager;
import com.samsung.context.sdk.samsunganalytics.internal.sender.buffering.database.DbManager;
import com.samsung.context.sdk.samsunganalytics.internal.terms.RegisterType;
import com.samsung.context.sdk.samsunganalytics.internal.util.Debug;
import com.samsung.context.sdk.samsunganalytics.internal.util.DeleteApiCallChecker;
import com.samsung.context.sdk.samsunganalytics.internal.util.IdGenerator;
import com.samsung.context.sdk.samsunganalytics.internal.util.Preferences;
import com.samsung.context.sdk.samsunganalytics.internal.util.Utils;
import e1.AbstractC0415a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class Tracker {
    public static final int AUID_TYPE_DMA = 4;
    public static final int AUID_TYPE_INAPP = 2;
    public static final int AUID_TYPE_MAKE_SDK = 1;
    public static final int AUID_TYPE_UNKNOWN = -1;
    public static final int DEVICE_ID_BIT_NUM = 128;
    private static final int FAIL = -1;
    private static final int NOT_INIT = 0;
    public static final String PERMISSION_TOKEN = "com.sec.spp.permission.TOKEN";
    private static final int SUCCESS = 1;
    private static final String TAG_ASYNC_SECTION_CONSTRUCTOR = "Tracker Constructor SingleThreadExecutor";
    private static final String TAG_ASYNC_SECTION_REGISTER_SETTING = "Tracker registerSettingPref SingleThreadExecutor";
    private static final String TAG_ASYNC_SECTION_SENDLOG = "Tracker SendLog SingleThreadExecutor";
    private Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
    private final Application application;
    private final Configuration configuration;
    private final DeleteApiCallChecker deleteApiCallChecker;
    private final Context mContext;
    private int mStatus = 0;

    public Tracker(final Application application, final Configuration configuration) {
        Trace.beginSection("Tracker Constructor");
        this.application = application;
        this.configuration = configuration;
        Context applicationContext = application.getApplicationContext();
        this.mContext = applicationContext;
        this.deleteApiCallChecker = new DeleteApiCallChecker(applicationContext);
        if (!configuration.isEnableUseInAppLogging()) {
            configuration.setUserAgreement(new UserAgreement() { // from class: com.samsung.context.sdk.samsunganalytics.internal.Tracker.1
                @Override // com.samsung.context.sdk.samsunganalytics.UserAgreement
                public boolean isAgreement() {
                    return Utils.isDiagnosticAgree(Tracker.this.mContext);
                }
            });
        }
        Trace.beginAsyncSection(TAG_ASYNC_SECTION_CONSTRUCTOR, -757204973);
        h.f().e(new b() { // from class: com.samsung.context.sdk.samsunganalytics.internal.Tracker.2
            @Override // I2.b
            public int onFinish() {
                return 0;
            }

            @Override // I2.b
            public void run() {
                if (Tracker.this.isActivated()) {
                    if (!Utils.isAppVersionChanged(Tracker.this.mContext, Preferences.PREFS_KEY_APP_VERSION_FOR_INIT)) {
                        Utils.sendSettings(Tracker.this.mContext, configuration);
                        Utils.sendProperties(Tracker.this.mContext, configuration);
                    }
                    Utils.sendRegistration(application, configuration, RegisterType.SEND_PREVIOUS_REGISTRATION_INFO);
                }
            }
        });
        Trace.endAsyncSection(TAG_ASYNC_SECTION_CONSTRUCTOR, -757204973);
        Debug.LogI("Tracker start:6.05.077");
        Trace.endSection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkDeviceId() {
        if (PolicyUtils.getSenderType() >= 2 || !TextUtils.isEmpty(this.configuration.getDeviceId())) {
            return true;
        }
        Debug.LogD("did is empty");
        return false;
    }

    private boolean hasPermission(Context context) {
        String[] strArr;
        PackageInfo packageInfoA = AbstractC0415a.A(context);
        if (packageInfoA != null && (strArr = packageInfoA.requestedPermissions) != null) {
            for (String str : strArr) {
                if (str.startsWith(PERMISSION_TOKEN)) {
                    return true;
                }
            }
        }
        return false;
    }

    private int init() {
        if (this.mStatus == 0) {
            if (this.configuration.isEnableUseInAppLogging()) {
                if (!TextUtils.isEmpty(this.configuration.getDeviceId())) {
                    Preferences.getPreferences(this.mContext).edit().putString(Preferences.PREFS_KEY_DID, this.configuration.getDeviceId()).putInt(Preferences.PREFS_KEY_DID_TYPE, 2).apply();
                    this.configuration.setAuidType(2);
                } else if (!loadDeviceId() && this.configuration.isEnableAutoDeviceId()) {
                    String strCreateDeviceId = new IdGenerator().createDeviceId(this.mContext);
                    if (TextUtils.isEmpty(strCreateDeviceId)) {
                        this.mStatus = -1;
                        return -1;
                    }
                    setDeviceId(strCreateDeviceId);
                }
            }
            PolicyUtils.setSenderType(this.mContext, this.configuration);
            if (PolicyUtils.getSenderType() == 0) {
                setPolicy();
            }
            UserManager userManager = (UserManager) this.mContext.getSystemService("user");
            if (userManager != null && !userManager.isUserUnlocked()) {
                Debug.LogD("current user is locked");
                this.mStatus = 0;
                return 0;
            }
            if (!this.configuration.isEnableUseInAppLogging() && !Validation.isLoggingEnableDevice(this.mContext)) {
                Debug.LogD("Device is not enabled for logging");
                this.mStatus = -1;
                return -1;
            }
            if (-1 == PolicyUtils.getSenderType()) {
                Debug.LogD("SenderType is None");
                this.mStatus = -1;
                return -1;
            }
            if (PolicyUtils.getSenderType() == 2 && !hasPermission(this.mContext)) {
                Utils.throwException("SamsungAnalytics2 need to define 'com.sec.spp.permission.TOKEN_XXXX' permission in AndroidManifest");
                this.mStatus = -1;
                return -1;
            }
            if (Utils.isSendingAppCommonSupported(this.mContext)) {
                sendAppCommon();
            }
        }
        this.mStatus = 1;
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean isActivated() {
        boolean z4 = false;
        if (-1 == this.mStatus) {
            Debug.LogD("Tracker is not initialized, status : " + this.mStatus);
            return false;
        }
        if (1 == init() && this.deleteApiCallChecker.isNotOverLimit()) {
            z4 = true;
        }
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isUserAgreement() {
        return this.configuration.getUserAgreement().isAgreement();
    }

    private boolean loadDeviceId() {
        SharedPreferences preferences = Preferences.getPreferences(this.application);
        String string = preferences.getString(Preferences.PREFS_KEY_DID, "");
        int i5 = preferences.getInt(Preferences.PREFS_KEY_DID_TYPE, -1);
        if (TextUtils.isEmpty(string) || string.length() != 32 || i5 == -1) {
            return false;
        }
        this.configuration.setAuidType(i5);
        this.configuration.setDeviceId(string);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Application.ActivityLifecycleCallbacks makeActivityLifecycleCallbacks() {
        if (this.activityLifecycleCallbacks == null) {
            this.activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.samsung.context.sdk.samsunganalytics.internal.Tracker.8
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    Tracker.this.sendLog(new LogBuilders.ScreenViewBuilder().setScreenView(activity.getComponentName().getShortClassName()).build());
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                }
            };
        }
        return this.activityLifecycleCallbacks;
    }

    private void requestDeleteLogData(final RegisterType registerType) {
        h.f().e(new b() { // from class: com.samsung.context.sdk.samsunganalytics.internal.Tracker.6
            @Override // I2.b
            public int onFinish() {
                return 0;
            }

            @Override // I2.b
            public void run() throws IOException {
                if (Tracker.this.configuration.isEnableUseInAppLogging() && Tracker.this.isActivated()) {
                    Utils.sendRegistration(Tracker.this.application, Tracker.this.configuration, registerType);
                    if (Tracker.this.configuration.getAuidType() == 1 && registerType == RegisterType.DELETE_APP_DATA) {
                        Debug.LogD("Reset deviceid");
                        String strRecreateDeviceId = new IdGenerator().recreateDeviceId(Tracker.this.mContext, Tracker.this.configuration.getDeviceId());
                        if (TextUtils.isEmpty(strRecreateDeviceId)) {
                            Tracker.this.mStatus = -1;
                        } else {
                            Tracker.this.setDeviceId(strRecreateDeviceId);
                        }
                    }
                    Tracker.this.deleteApiCallChecker.increaseCount();
                }
            }
        });
    }

    private void sendAppCommon() {
        if ((Utils.isProvidingDataSupported(this.mContext) || isUserAgreement()) && PolicyUtils.getSenderType() == 3) {
            SharedPreferences preferences = Preferences.getPreferences(this.mContext);
            String strY = AbstractC0415a.y(this.mContext);
            if (TextUtils.isEmpty(strY)) {
                strY = WifiAdminProfile.PHASE2_NONE;
            }
            boolean z4 = preferences.getBoolean(Preferences.PREFS_KEY_SEND_COMMON_SUCCESS, false);
            String string = preferences.getString(Preferences.PREFS_KEY_APP_VERSION, WifiAdminProfile.PHASE2_NONE);
            Long lValueOf = Long.valueOf(preferences.getLong(Preferences.PREFS_KEY_SEND_COMMON_TIME, 0L));
            Debug.LogD("AppVersion = " + strY + ", prefAppVersion = " + string + ", beforeSendCommonTime = " + lValueOf + ", success = " + z4);
            if (!strY.equals(string) || ((z4 && Utils.compareDays(7, lValueOf)) || (!z4 && Utils.compareHours(6, lValueOf)))) {
                Debug.LogD("send app common");
                preferences.edit().putString(Preferences.PREFS_KEY_APP_VERSION, strY).putLong(Preferences.PREFS_KEY_SEND_COMMON_TIME, System.currentTimeMillis()).apply();
                ((DMALogSender) Sender.get(this.application, 3, this.configuration)).sendCommon();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceId(String str) {
        Preferences.getPreferences(this.mContext).edit().putString(Preferences.PREFS_KEY_DID, str).putInt(Preferences.PREFS_KEY_DID_TYPE, 1).apply();
        this.configuration.setAuidType(1);
        this.configuration.setDeviceId(str);
    }

    private void setPolicy() {
        SharedPreferences preferences = Preferences.getPreferences(this.application);
        Domain.DLS.setDomain(preferences.getString(Constants.KEY_DLS_DOMAIN, ""));
        Directory.DLS_DIR.setDirectory(preferences.getString(Constants.KEY_DLS_URI, ""));
        Directory.DLS_DIR_BAT.setDirectory(preferences.getString(Constants.KEY_DLS_URI_BAT, ""));
        if (PolicyUtils.isPolicyExpired(this.mContext)) {
            PolicyUtils.updatePolicy(this.application, this.configuration, h.f(), DeviceInfo.getDeviceInfo(this.mContext), new Callback<Void, Boolean>() { // from class: com.samsung.context.sdk.samsunganalytics.internal.Tracker.7
                @Override // com.samsung.context.sdk.samsunganalytics.internal.Callback
                public Void onResult(Boolean bool) {
                    if (!bool.booleanValue()) {
                        return null;
                    }
                    DBOpenHelper dbOpenHelper = Tracker.this.configuration.getDbOpenHelper();
                    if (dbOpenHelper == null) {
                        Manager.getInstance(Tracker.this.mContext, Tracker.this.configuration).enableDatabaseBuffering(Tracker.this.mContext);
                        return null;
                    }
                    Manager.getInstance(Tracker.this.mContext, Tracker.this.configuration).enableDatabaseBuffering(new DbManager(dbOpenHelper));
                    return null;
                }
            });
        }
    }

    public void deleteLogData() {
        requestDeleteLogData(RegisterType.DELETE_APP_DATA);
    }

    public void deleteSensitiveLogData() {
        if (Utils.isDeletionOfSensitiveDataSupported(this.mContext)) {
            requestDeleteLogData(RegisterType.DELETE_SENSITIVE_APP_DATA);
        } else {
            deleteLogData();
        }
    }

    public void enableAutoActivityTracking() {
        h.f().e(new b() { // from class: com.samsung.context.sdk.samsunganalytics.internal.Tracker.4
            @Override // I2.b
            public int onFinish() {
                return 0;
            }

            @Override // I2.b
            public void run() {
                Tracker.this.application.registerActivityLifecycleCallbacks(Tracker.this.makeActivityLifecycleCallbacks());
            }
        });
    }

    public Configuration getConfiguration() {
        return this.configuration;
    }

    public void registerSettingPref(final Map<String, Set<String>> map) {
        Trace.beginAsyncSection(TAG_ASYNC_SECTION_REGISTER_SETTING, 499562429);
        h.f().e(new b() { // from class: com.samsung.context.sdk.samsunganalytics.internal.Tracker.5
            @Override // I2.b
            public int onFinish() {
                return 0;
            }

            @Override // I2.b
            public void run() {
                Utils.registerSettings(Tracker.this.mContext, map);
                if (Tracker.this.isActivated()) {
                    Utils.sendSettings(Tracker.this.mContext, Tracker.this.configuration);
                }
            }
        });
        Trace.endAsyncSection(TAG_ASYNC_SECTION_REGISTER_SETTING, 499562429);
    }

    public int sendLog(final Map<String, String> map) {
        Trace.beginAsyncSection(TAG_ASYNC_SECTION_SENDLOG, 1468411569);
        h.f().e(new b() { // from class: com.samsung.context.sdk.samsunganalytics.internal.Tracker.3
            @Override // I2.b
            public int onFinish() {
                return 0;
            }

            @Override // I2.b
            public void run() {
                String str;
                if (Tracker.this.isActivated()) {
                    if (!Utils.isProvidingDataSupported(Tracker.this.mContext)) {
                        if (!Tracker.this.isUserAgreement()) {
                            Debug.LogD("user do not agree");
                            return;
                        } else {
                            map.remove("pd");
                            map.remove("ps");
                        }
                    }
                    Map map2 = map;
                    if (map2 == null || map2.isEmpty()) {
                        Debug.LogD("Failure to send Logs : No data");
                        return;
                    }
                    if (Tracker.this.checkDeviceId()) {
                        if ("pp".equals(map.get("t"))) {
                            Utils.registerProperties(Tracker.this.mContext, map);
                            Utils.sendProperties(Tracker.this.mContext, Tracker.this.configuration);
                            return;
                        }
                        if ("ev".equals(map.get("t")) && (str = (String) map.get("et")) != null && (str.equals(String.valueOf(10)) || str.equals(String.valueOf(11)))) {
                            String string = Preferences.getPropertyPreferences(Tracker.this.mContext).getString(LogBuilders.Property.SAMSUNG_ACCOUNT_ID, "");
                            if (!TextUtils.isEmpty(string)) {
                                String str2 = (String) map.get("cd");
                                Map map3 = TextUtils.isEmpty(str2) ? new HashMap() : Utils.parseDelimiterString(str2, Utils.Depth.TWO_DEPTH);
                                map3.put(LogBuilders.Property.SAMSUNG_ACCOUNT_ID, string);
                                map.put("cd", Utils.makeDelimiterString(Validation.checkSizeLimit(map3), Utils.Depth.TWO_DEPTH));
                            }
                        }
                        Sender.get(Tracker.this.application, PolicyUtils.getSenderType(), Tracker.this.configuration).send(map);
                    }
                }
            }
        });
        Trace.endAsyncSection(TAG_ASYNC_SECTION_SENDLOG, 1468411569);
        return 0;
    }
}
