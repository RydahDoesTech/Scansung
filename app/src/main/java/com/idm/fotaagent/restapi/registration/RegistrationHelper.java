package com.idm.fotaagent.restapi.registration;

import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.DeviceRegistrationRepository;
import com.idm.fotaagent.database.room.data.repository.HeartbeatRepository;
import com.idm.fotaagent.database.room.data.repository.PollingRepository;
import com.idm.fotaagent.database.room.data.repository.PushRegistrationRepository;
import com.idm.fotaagent.database.room.data.repository.RegisteredDeviceRepository;
import com.idm.fotaagent.restapi.registration.context.DmFollowingRegistration;
import com.idm.fotaagent.restapi.registration.context.SchedulableRegistration;
import com.idm.fotaagent.restapi.restclient.polling.Polling;
import com.idm.fotaagent.restapi.restclient.push.message.PushType;
import com.samsung.android.fotaagent.common.feature.SalesCode;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class RegistrationHelper {
    private static boolean deviceIsCompleted(Context context) {
        return new DeviceRegistrationRepository(context).isRegistered();
    }

    public static boolean isCompleted(Context context) {
        return deviceIsCompleted(context) && pollingIsCompleted(context) && pushIsCompleted(context);
    }

    public static boolean pollingIsCompleted(Context context) {
        if (new PollingRepository(context).getNextTime() > 0) {
            return true;
        }
        Log.W("Polling not registered");
        return Polling.isDisabled();
    }

    public static boolean pushIsCompleted(Context context) {
        if (new PushRegistrationRepository(context).isRegistered()) {
            return true;
        }
        Log.W("Push not registered");
        return !PushType.get().isAvailable(context);
    }

    public static void scheduleDeviceRegistrationIfNeeded(Context context, DeviceRegistrationRepository.Requester requester) {
        TimeUnit timeUnit;
        long j5;
        Log.V("");
        if (isCompleted(context)) {
            return;
        }
        if (SchedulableRegistration.isWithoutUnregistrationJobPending(context)) {
            Log.I("already scheduled job has been pending");
            return;
        }
        setRequester(context, requester);
        if (SalesCode.get().isChinaCountryFeature()) {
            timeUnit = TimeUnit.HOURS;
            j5 = 3;
        } else {
            timeUnit = TimeUnit.MINUTES;
            j5 = 5;
        }
        long millis = timeUnit.toMillis(j5);
        if (millis < 0) {
            millis = 0;
        }
        new SchedulableRegistration.WithoutUnregistration(context).schedule(millis);
    }

    private static void setRequester(Context context, DeviceRegistrationRepository.Requester requester) {
        Log.I("request : " + requester);
        new DeviceRegistrationRepository(context).setRequesterAs(requester);
    }

    public static void startDeviceRegistration(Context context, DeviceRegistrationRepository.Requester requester) {
        Log.V("");
        setRequester(context, requester);
        new SchedulableRegistration.WithUnregistration(context).start();
    }

    public static void startDeviceRegistrationIfUnregistered(Context context, DeviceRegistrationRepository.Requester requester, boolean z4) {
        Log.V("");
        if (isCompleted(context)) {
            return;
        }
        setRequester(context, requester);
        new DmFollowingRegistration(context, z4).start();
    }

    public static void startPushRegistration(Context context) {
        Log.V("");
        new SchedulableRegistration.WithPushUnregistration(context).start();
    }

    public static void unregister() {
        Context contextIdmGetContext = IDMApplication.idmGetContext();
        new PushRegistrationRepository(contextIdmGetContext).unregister();
        new RegisteredDeviceRepository(contextIdmGetContext).clear();
        new HeartbeatRepository.Periodic(contextIdmGetContext).clear();
        new HeartbeatRepository.OneShot(contextIdmGetContext).clear();
        new DeviceRegistrationRepository(contextIdmGetContext).setUnregister();
        new PollingRepository(contextIdmGetContext).setNextTime(0L);
    }

    public static void startDeviceRegistration(Context context, DeviceRegistrationRepository.Requester requester, long j5) {
        Log.V("");
        setRequester(context, requester);
        new SchedulableRegistration.WithoutUnregistration(context).start(j5);
    }
}
