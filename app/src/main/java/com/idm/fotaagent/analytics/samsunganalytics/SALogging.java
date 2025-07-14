package com.idm.fotaagent.analytics.samsunganalytics;

import C1.b;
import android.app.Application;
import com.idm.fotaagent.analytics.samsunganalytics.SALogging;
import com.idm.fotaagent.utils.DeviceUtils;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.context.sdk.samsunganalytics.AnalyticsException;
import com.samsung.context.sdk.samsunganalytics.Configuration;
import com.samsung.context.sdk.samsunganalytics.LogBuilders;
import com.samsung.context.sdk.samsunganalytics.SamsungAnalytics;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public class SALogging {
    private static final String TRACKING_ID = "012-399-544955";
    private static boolean enabled = false;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$send$1(LogBuilders.EventBuilder eventBuilder, String str) {
        HashMap map = new HashMap();
        map.put(LogBuilders.CustomDimension.DETAIL, str);
        eventBuilder.setDimension(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setup$0(Application application) {
        synchronized (SALogging.class) {
            SamsungAnalytics.setConfiguration(application, new Configuration().setTrackingId(TRACKING_ID).setVersion(DeviceUtils.readAppVersionName(application.getApplicationContext())).enableAutoDeviceId());
            enabled = true;
        }
    }

    public static void send(String str, Map<String, String> map) {
        if (!enabled) {
            Log.W("setup is not done");
            return;
        }
        Log.V("eventId : " + str + ", dimen : " + map);
        try {
            LogBuilders.EventBuilder eventId = new LogBuilders.EventBuilder().setEventId(str);
            eventId.setDimension(map);
            SamsungAnalytics.getInstance().sendLog(eventId.build());
        } catch (AnalyticsException e5) {
            Log.printStackTrace(e5);
        }
    }

    public static void sendScreenEntrance(String str) {
        if (!enabled) {
            Log.W("setup is not done");
            return;
        }
        if (str == null) {
            return;
        }
        Log.V("screenId : ".concat(str));
        try {
            SamsungAnalytics.getInstance().sendLog(new LogBuilders.ScreenViewBuilder().setScreenView(str).build());
        } catch (AnalyticsException e5) {
            Log.printStackTrace(e5);
        }
    }

    public static void setup(Application application) {
        new Thread(new b(25, application)).start();
    }

    public static void send(String str, String str2, String str3) {
        if (!enabled) {
            Log.W("setup is not done");
            return;
        }
        Log.V("screenId : " + str + ", eventId : " + str2 + ", detail : " + str3);
        try {
            final LogBuilders.EventBuilder eventId = new LogBuilders.EventBuilder().setEventId(str2);
            Optional optionalOfNullable = Optional.ofNullable(str);
            Objects.requireNonNull(eventId);
            final int i5 = 0;
            optionalOfNullable.ifPresent(new Consumer() { // from class: t2.a
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i6 = i5;
                    LogBuilders.EventBuilder eventBuilder = eventId;
                    String str4 = (String) obj;
                    switch (i6) {
                        case 0:
                            eventBuilder.setScreenView(str4);
                            break;
                        default:
                            SALogging.lambda$send$1(eventBuilder, str4);
                            break;
                    }
                }
            });
            final int i6 = 1;
            Optional.ofNullable(str3).ifPresent(new Consumer() { // from class: t2.a
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i62 = i6;
                    LogBuilders.EventBuilder eventBuilder = eventId;
                    String str4 = (String) obj;
                    switch (i62) {
                        case 0:
                            eventBuilder.setScreenView(str4);
                            break;
                        default:
                            SALogging.lambda$send$1(eventBuilder, str4);
                            break;
                    }
                }
            });
            SamsungAnalytics.getInstance().sendLog(eventId.build());
        } catch (AnalyticsException e5) {
            Log.printStackTrace(e5);
        }
    }

    public static void send(String str, String str2) {
        send(null, str, str2);
    }

    public static void send(String str) {
        send(null, str, null);
    }
}
