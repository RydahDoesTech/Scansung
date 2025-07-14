package com.idm.fotaagent;

import android.content.Context;
import com.idm.adapter.callback.IDMCallback;
import com.idm.fotaagent.database.room.data.repository.DeviceRegistrationRepository;
import com.idm.fotaagent.database.room.data.repository.GeneralRepository;
import com.idm.fotaagent.database.room.debug.repository.PostponeReasonsRepository;
import com.idm.fotaagent.enabler.adapter.IDMAdapterImpl;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.receiver.callback.ProviderEventHandler;
import com.idm.fotaagent.utils.DeviceUtils;
import com.idm.service.actioninfo.IDMActionInfo;
import com.idm.service.provider.IDMProviderService;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public class LibraryStarter {

    public interface IDMProviderStarter {
        String execute(Context context, IDMActionInfo iDMActionInfo, IDMAdapterImpl iDMAdapterImpl, IDMCallback iDMCallback);
    }

    private static Context getContext() {
        return IDMApplication.idmGetContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startDMTask$0(List list) {
        Stream.of(list).forEach(new f());
    }

    public static void pauseDownloading(IDMActionInfo iDMActionInfo) {
        Log.I(">>>>>>>>>>   Pause   <<<<<<<<<<");
        Log.switchFileLoggerToSession(getContext());
        try {
            IDMProviderService.idmSendMessagePauseTask(iDMActionInfo);
        } catch (Exception e5) {
            Log.printStackTrace(e5);
        }
    }

    private static void savePreviousFirmwareVersion() {
        new GeneralRepository(getContext()).setPreviousFirmwareVersion(DeviceUtils.readFirmwareVersion());
    }

    private static synchronized void start(IDMActionInfo iDMActionInfo, IDMProviderStarter iDMProviderStarter) {
        NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_SYNC_DM, iDMActionInfo.idmGetSessionId());
        Log.I("started for " + iDMProviderStarter.execute(getContext(), iDMActionInfo, new IDMAdapterImpl(iDMActionInfo.idmGetSessionId(), iDMActionInfo.idmGetAppId()), new ProviderEventHandler()));
    }

    public static void startDLTask(IDMActionInfo iDMActionInfo) {
        Log.I(">>>>>>>>>>   Start DL Task   <<<<<<<<<<");
        Log.switchFileLoggerToSession(getContext());
        try {
            Objects.requireNonNull(iDMActionInfo);
            start(iDMActionInfo, new e(0));
        } catch (Exception e5) {
            Log.printStackTrace(e5);
        }
    }

    public static void startDMTask(IDMActionInfo iDMActionInfo) {
        Log.I(">>>>>>>>>>   Start DM Task   <<<<<<<<<<");
        Log.switchFileLoggerToSession(getContext());
        Log.I("Device Registration Requester : " + DeviceRegistrationRepository.Requester.of(new DeviceRegistrationRepository(getContext()).getRequester()));
        PostponeReasonsRepository.get(getContext()).getLimitedPostponeReasons(new e(2));
        savePreviousFirmwareVersion();
        try {
            Objects.requireNonNull(iDMActionInfo);
            start(iDMActionInfo, new e(1));
        } catch (Exception e5) {
            Log.printStackTrace(e5);
        }
    }
}
