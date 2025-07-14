package com.idm.fotaagent.enabler.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.idm.fotaagent.BundleWrapper;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.PostponeRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeManager;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.receiver.dynamic.IDMDynamicReceivers;
import com.idm.fotaagent.receiver.dynamic.TemperatureChangeReceiver;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public enum IDMUIManager {
    INSTANCE;

    private static final int DEFAULT_DELAY_IN_MILLIS = 300;
    private static final long MAX_INTERVAL_FOR_DIALOG_IN_MILLIS = 1000;
    private final Handler handler;
    private final Map<String, Activity> activityMap = new ConcurrentHashMap();
    private long lastRequestTimeForUi = 0;

    /* renamed from: com.idm.fotaagent.enabler.ui.IDMUIManager$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$idm$fotaagent$enabler$ui$IDMUIManager$UiType;
        static final /* synthetic */ int[] $SwitchMap$com$idm$fotaagent$enabler$ui$interfaces$IDMUIEventInterface$UIACTIVITY;

        static {
            int[] iArr = new int[IDMUIEventInterface.UIACTIVITY.values().length];
            $SwitchMap$com$idm$fotaagent$enabler$ui$interfaces$IDMUIEventInterface$UIACTIVITY = iArr;
            try {
                iArr[IDMUIEventInterface.UIACTIVITY.DOWNLOAD_CONFIRM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$enabler$ui$interfaces$IDMUIEventInterface$UIACTIVITY[IDMUIEventInterface.UIACTIVITY.DOWNLOAD_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$enabler$ui$interfaces$IDMUIEventInterface$UIACTIVITY[IDMUIEventInterface.UIACTIVITY.INSTALL_CONFIRM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$enabler$ui$interfaces$IDMUIEventInterface$UIACTIVITY[IDMUIEventInterface.UIACTIVITY.NO_UPDATABLE_VERSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$enabler$ui$interfaces$IDMUIEventInterface$UIACTIVITY[IDMUIEventInterface.UIACTIVITY.CHECKING_FOR_UPDATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[UiType.values().length];
            $SwitchMap$com$idm$fotaagent$enabler$ui$IDMUIManager$UiType = iArr2;
            try {
                iArr2[UiType.DIALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$enabler$ui$IDMUIManager$UiType[UiType.ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum UiType {
        NONE(0),
        DIALOG(1),
        ACTIVITY(2);

        private final int type;

        UiType(int i5) {
            this.type = i5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$of$0(int i5, UiType uiType) {
            return uiType.getType() == i5;
        }

        public static UiType of(final int i5) {
            return (UiType) Arrays.stream(values()).filter(new Predicate() { // from class: com.idm.fotaagent.enabler.ui.h
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return IDMUIManager.UiType.lambda$of$0(i5, (IDMUIManager.UiType) obj);
                }
            }).findFirst().orElse(NONE);
        }

        public int getType() {
            return this.type;
        }
    }

    IDMUIManager() {
        HandlerThread handlerThread = new HandlerThread("UIManager");
        handlerThread.setDaemon(true);
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper(), new Handler.Callback() { // from class: com.idm.fotaagent.enabler.ui.f
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f6328a.lambda$new$0(message);
            }
        });
    }

    public static boolean allowsToFinish(Activity activity) {
        if (activity == null) {
            Log.I("not allowed: activity is null");
            return false;
        }
        if (activity.isDestroyed()) {
            Log.I("not allowed: activity is destroyed");
            return false;
        }
        if (!activity.isFinishing()) {
            return true;
        }
        Log.I("not allowed: activity is finishing");
        return false;
    }

    private void finishAllActivitiesExcept(String str) {
        Log.I("except " + str);
        finishIf(new a(1, str));
    }

    private void finishIf(Predicate<String> predicate) {
        this.activityMap.keySet().stream().filter(predicate).forEach(new Consumer() { // from class: com.idm.fotaagent.enabler.ui.g
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f6329d.finish((String) obj);
            }
        });
    }

    private Optional<Map.Entry<String, Activity>> getActivityInMapEntryFirstly() {
        return getActivityMapStream().anyMatch(new d(4)) ? getActivityMapStream().filter(new d(1)).findFirst() : getActivityMapStream().findFirst();
    }

    private Stream<Map.Entry<String, Activity>> getActivityMapStream() {
        return this.activityMap.entrySet().stream();
    }

    public static IDMUIManager getInstance() {
        return INSTANCE;
    }

    private void idmHandleMessage(Message message) throws InterruptedException {
        try {
            UiType uiTypeOf = UiType.of(message.arg1);
            String str = "UiType : " + uiTypeOf;
            int i5 = AnonymousClass1.$SwitchMap$com$idm$fotaagent$enabler$ui$IDMUIManager$UiType[uiTypeOf.ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    return;
                }
                this.lastRequestTimeForUi = SystemClock.elapsedRealtime();
                IDMUIEventInterface.UIACTIVITY uiactivityValueOf = IDMUIEventInterface.UIACTIVITY.valueOf(message.what);
                Log.I(str.concat(" [UI Operate ACTIVITY ID : " + uiactivityValueOf + "]"));
                idmStartActivity(uiactivityValueOf, (BundleWrapper) message.obj);
                finishAllActivitiesExcept(uiactivityValueOf.getKey());
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j5 = 1000 - (jElapsedRealtime - this.lastRequestTimeForUi);
            if (j5 > 0) {
                try {
                    TimeUnit.MILLISECONDS.sleep(j5);
                } catch (Exception e5) {
                    Log.printStackTrace(e5);
                }
            }
            this.lastRequestTimeForUi = jElapsedRealtime;
            IDMUIEventInterface.UIDIALOG uidialogValueOf = IDMUIEventInterface.UIDIALOG.valueOf(message.what);
            Log.I(str.concat(" [UI Operate DIALOG ID : " + uidialogValueOf + "]"));
            idmStartDialog(uidialogValueOf, (BundleWrapper) message.obj);
            finishAllActivitiesExcept(IDMUIEventInterface.UIDIALOG.getKey());
        } catch (Exception e6) {
            Log.printStackTrace(e6);
        }
    }

    private void idmStartActivity(IDMUIEventInterface.UIACTIVITY uiactivity, BundleWrapper bundleWrapper) {
        String str = (String) Optional.ofNullable(bundleWrapper.getTaskId()).orElse("");
        int resourceId = bundleWrapper.getResourceId();
        Log.I("idmStartActivity : " + uiactivity);
        ActionInfoDao actionInfoDao = new ActionInfoDao(str);
        Intent intent = new Intent(IDMApplication.idmGetContext(), uiactivity.getActivityClass());
        int i5 = AnonymousClass1.$SwitchMap$com$idm$fotaagent$enabler$ui$interfaces$IDMUIEventInterface$UIACTIVITY[uiactivity.ordinal()];
        if (i5 == 1) {
            actionInfoDao.setUiMode(1);
            if (!new PostponeRepository(IDMApplication.idmGetContext()).isNone()) {
                PostponeManager.cancel();
            }
            intent.setAction(str);
        } else if (i5 == 2 || i5 == 3) {
            IDMDynamicReceivers.getInstance().unregister(TemperatureChangeReceiver.class);
            actionInfoDao.setUiMode(1);
            intent.setAction(str);
        } else if (i5 == 4) {
            intent.putExtra(IDMUIEventInterface.IDM_UI_EXTRA_KEY, resourceId);
        } else {
            if (i5 != 5) {
                Log.W("unexpected UIACTIVITY: + " + uiactivity);
                return;
            }
            intent.setAction(str);
        }
        intent.setFlags(604241920);
        startActivity(intent);
    }

    private void idmStartDialog(IDMUIEventInterface.UIDIALOG uidialog, BundleWrapper bundleWrapper) {
        Log.I("idmStartDialog : " + uidialog);
        bundleWrapper.setDialogType(uidialog);
        startActivity(new Intent(IDMApplication.idmGetContext(), uidialog.getDialogClass()).setFlags(872677376).putExtra(IDMUIEventInterface.IDM_UI_EXTRA_KEY, bundleWrapper.build()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$finishAllActivities$8(String str) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$finishAllActivitiesExcept$9(String str, String str2) {
        return !str.equals(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$finishEntryActivityIfExists$2(Map.Entry entry) {
        return IDMUIEventInterface.UIACTIVITY.USER_INIT_ENTRY.getKey().equals(entry.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Optional lambda$finishEntryActivityIfExists$3(Map.Entry entry) {
        return Optional.ofNullable((Activity) entry.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$finishEntryActivityIfExists$4(Activity activity) {
        if (allowsToFinish(activity)) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getActivityInMapEntryFirstly$6(Map.Entry entry) {
        return IDMUIEventInterface.UIACTIVITY.USER_INIT_ENTRY.getKey().equals(entry.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getActivityInMapEntryFirstly$7(Map.Entry entry) {
        return IDMUIEventInterface.UIACTIVITY.USER_INIT_ENTRY.getKey().equals(entry.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getActivityInMapWithoutEntry$5(Map.Entry entry) {
        return !IDMUIEventInterface.UIACTIVITY.USER_INIT_ENTRY.getKey().equals(entry.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$new$0(Message message) throws InterruptedException {
        idmHandleMessage(message);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Optional lambda$startActivity$1(Map.Entry entry) {
        return Optional.ofNullable((Activity) entry.getValue());
    }

    public void finish(IDMUIEventInterface.UIACTIVITY uiactivity) {
        finish(uiactivity.getKey());
    }

    public void finishAllActivities() {
        finishIf(new d(3));
    }

    public void finishEntryActivityIfExists() {
        getActivityMapStream().filter(new d(0)).findFirst().flatMap(new b(1)).ifPresent(new e());
    }

    public Optional<Map.Entry<String, Activity>> getActivityInMapWithoutEntry() {
        return getActivityMapStream().filter(new d(2)).findFirst();
    }

    public void put(Activity activity) {
        Activity activityPut = this.activityMap.put(activity.getClass().getName(), activity);
        if (allowsToFinish(activityPut)) {
            Log.W("previous activity[" + activityPut + "] still exists, finish it");
            activityPut.finish();
        }
    }

    public void remove(Activity activity) {
        String name = activity.getClass().getName();
        Activity activity2 = this.activityMap.get(name);
        if (activity == activity2) {
            this.activityMap.remove(name);
            return;
        }
        Log.W("[" + activity + "] is different from [" + activity2 + "] in map; do not remove.");
    }

    public void sendActivityMessage(IDMUIEventInterface.UIACTIVITY uiactivity) {
        sendActivityMessage(uiactivity, new BundleWrapper());
    }

    public void sendDelayedDialogMessage(IDMUIEventInterface.UIDIALOG uidialog) {
        sendDelayedDialogMessage(uidialog, new BundleWrapper(), 300L);
    }

    public void sendDialogMessage(IDMUIEventInterface.UIDIALOG uidialog) {
        sendDialogMessage(uidialog, new BundleWrapper());
    }

    public void startActivity(Intent intent) {
        ((Context) getActivityInMapEntryFirstly().flatMap(new b(2)).orElse(IDMApplication.idmGetContext())).startActivity(intent);
    }

    public boolean finish(IDMUIEventInterface.UIDIALOG uidialog) {
        Bundle bundleExtra;
        Activity activity = this.activityMap.get(IDMUIEventInterface.UIDIALOG.getKey());
        if (!allowsToFinish(activity) || (bundleExtra = activity.getIntent().getBundleExtra(IDMUIEventInterface.IDM_UI_EXTRA_KEY)) == null) {
            return false;
        }
        IDMUIEventInterface.UIDIALOG dialogType = new BundleWrapper(bundleExtra).getDialogType();
        if (uidialog == dialogType) {
            activity.finish();
            return true;
        }
        Log.W("[" + uidialog + "] is different from [" + dialogType + "]; do not finish.");
        return false;
    }

    public void sendActivityMessage(IDMUIEventInterface.UIACTIVITY uiactivity, BundleWrapper bundleWrapper) {
        Message messageObtainMessage = this.handler.obtainMessage();
        messageObtainMessage.obj = bundleWrapper;
        messageObtainMessage.what = uiactivity.ordinal();
        messageObtainMessage.arg1 = UiType.ACTIVITY.getType();
        this.handler.sendMessage(messageObtainMessage);
    }

    public void sendDelayedDialogMessage(IDMUIEventInterface.UIDIALOG uidialog, BundleWrapper bundleWrapper) {
        sendDelayedDialogMessage(uidialog, bundleWrapper, 300L);
    }

    public void sendDialogMessage(IDMUIEventInterface.UIDIALOG uidialog, BundleWrapper bundleWrapper) {
        Message messageObtainMessage = this.handler.obtainMessage();
        messageObtainMessage.obj = bundleWrapper;
        messageObtainMessage.what = uidialog.ordinal();
        messageObtainMessage.arg1 = UiType.DIALOG.getType();
        this.handler.sendMessage(messageObtainMessage);
    }

    public void sendDelayedDialogMessage(IDMUIEventInterface.UIDIALOG uidialog, BundleWrapper bundleWrapper, long j5) {
        if (j5 < 0) {
            Log.W("delayInMillis should be non-negative");
            j5 = 0;
        }
        Message messageObtainMessage = this.handler.obtainMessage();
        messageObtainMessage.obj = bundleWrapper;
        messageObtainMessage.what = uidialog.ordinal();
        messageObtainMessage.arg1 = UiType.DIALOG.getType();
        this.handler.sendMessageDelayed(messageObtainMessage, j5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finish(String str) {
        Activity activity = this.activityMap.get(str);
        if (allowsToFinish(activity)) {
            activity.finish();
        }
    }
}
