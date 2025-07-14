package com.idm.fotaagent;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.idm.fotaagent.abupdate.manager.EnablerManager;
import com.idm.fotaagent.database.room.data.repository.AdminRepository;
import com.idm.fotaagent.database.room.data.repository.CampaignQueueRepository;
import com.idm.fotaagent.database.room.data.repository.DeviceRegistrationRepository;
import com.idm.fotaagent.database.room.data.repository.DmNotificationRepository;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.database.room.data.repository.GeneralRepository;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.database.room.data.repository.PostponeRepository;
import com.idm.fotaagent.database.room.data.repository.PropertyRepository;
import com.idm.fotaagent.database.room.data.repository.RegisteredDeviceRepository;
import com.idm.fotaagent.database.room.debug.repository.PostponeReasonsRepository;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseManager;
import com.idm.fotaagent.database.sqlite.database.settings.SettingsDatabaseManager;
import com.idm.fotaagent.enabler.fumo.expiration.SessionExpirationManager;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeManager;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTimer;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.receiver.dynamic.IDMDynamicReceivers;
import com.idm.fotaagent.restapi.registration.RegistrationHelper;
import com.idm.fotaagent.restapi.restclient.push.campaign.notification.CampaignNotificationHelper;
import com.idm.fotaagent.restapi.restclient.push.message.PushType;
import com.idm.fotaagent.tool.ddf.DDFManager;
import com.idm.fotaagent.utils.DeviceUtils;
import com.idm.fotaagent.utils.GeneralUtils;
import com.idm.fotaagent.utils.RebootChecker;
import com.idm.fotaagent.utils.storage.FileManager;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;

/* loaded from: classes.dex */
public class InitExecutor {
    private static final long UNBIND_GRACE_PERIOD_IN_MILLIS = 5000;
    private static final InitExecutor instance = new InitExecutor();
    private FutureTask<Void> futureTask;
    private InitService initService;
    private boolean isDmInitialized;
    private final Executor singleThreadExecutor;
    private final AtomicInteger numTasks = new AtomicInteger(0);
    private CountDownLatch initServiceUnbind = new CountDownLatch(1);
    private CountDownLatch initServiceInstantiation = new CountDownLatch(1);
    private final ServiceConnection serviceConnection = new ServiceConnection() { // from class: com.idm.fotaagent.InitExecutor.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.I("");
            InitExecutor.this.initService = ((InitService.LocalBinder) iBinder).getService();
            InitExecutor.this.initServiceInstantiation.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.I("");
            InitExecutor.this.initService = null;
            InitExecutor.this.initServiceInstantiation = new CountDownLatch(1);
            InitExecutor.this.initServiceUnbind = new CountDownLatch(1);
            InitExecutor.this.initServiceUnbind.countDown();
        }
    };

    public static class InitService extends Service {
        private Handler handler;
        private LocalBinder localBinder;
        private Looper looper;

        public class LocalBinder extends Binder {
            private LocalBinder() {
            }

            public InitService getService() {
                return InitService.this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onCreate$0(Message message) {
            Log.W("handleMessage() does not support");
            return true;
        }

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            return this.localBinder;
        }

        @Override // android.app.Service
        public void onCreate() {
            Log.I("");
            this.localBinder = new LocalBinder();
            HandlerThread handlerThread = new HandlerThread("InitService");
            handlerThread.setDaemon(true);
            handlerThread.start();
            this.looper = handlerThread.getLooper();
            this.handler = new Handler(this.looper, new d());
        }

        @Override // android.app.Service
        public void onDestroy() {
            Log.I("");
            this.looper.quit();
            super.onDestroy();
            InitExecutor.get().initServiceUnbind.countDown();
        }

        @Override // android.app.Service
        public boolean onUnbind(Intent intent) {
            Log.I("");
            stopSelf();
            return super.onUnbind(intent);
        }

        public void post(Runnable runnable) {
            postDelayed(runnable, 0L);
        }

        public void postDelayed(Runnable runnable, long j5) {
            Log.I(runnable.toString());
            this.handler.postDelayed(runnable, j5);
        }
    }

    public static class InitializationTask extends ResetTask {
        private InitializationTask() {
            super();
        }

        @Override // com.idm.fotaagent.InitExecutor.ResetTask, java.util.concurrent.Callable
        public Void call() throws Exception {
            if (IDMDatabaseManager.getInstance().isDBTableCorrupt()) {
                Log.W("Database corrupted");
                clear();
            }
            initialize();
            return null;
        }
    }

    public static class ResetTask implements Callable<Void> {
        private ResetTask() {
        }

        private void checkInitializationAllowed() throws RebootChecker.RebootRequiredException {
            if (RebootChecker.waitsReboot()) {
                throw new RebootChecker.RebootRequiredException();
            }
        }

        private void deleteFilesIfExists() {
            new FileManager().deleteDeltaAndMetadataFiles();
        }

        private void scheduleRegistrationIfNeeded() {
            if (new DeviceRegistrationRepository(InitExecutor.getContext()).isUnregistered()) {
                Log.I("schedule re-registering");
                RegistrationHelper.scheduleDeviceRegistrationIfNeeded(InitExecutor.getContext(), DeviceRegistrationRepository.Requester.FOTA_AGENT);
            }
        }

        public void clear() {
            Log.I("Clearing device starts");
            GeneralRepository generalRepository = new GeneralRepository(InitExecutor.getContext());
            generalRepository.setResetTaskStatusAsStarted();
            InitExecutor.get().isDmInitialized = false;
            IDMUIManager.getInstance().finishAllActivities();
            deleteFilesIfExists();
            IDMDatabaseManager.getInstance().resetManagedObjectDB();
            IDMDatabaseManager.getInstance().resetEnablerDB();
            Context context = InitExecutor.getContext();
            new PropertyRepository(context).deleteCategories(new String[]{AdminRepository.CATEGORY, RegisteredDeviceRepository.CATEGORY, InstallParamRepository.CATEGORY, DmNotificationRepository.CATEGORY, PostponeRepository.CATEGORY, CampaignQueueRepository.CATEGORY, DeviceRegistrationRepository.CATEGORY});
            PostponeReasonsRepository.get(context).deleteAll();
            new FotaJobRepository(context).deleteAll();
            NotificationTypeManager.cancelAll();
            new CampaignNotificationHelper(context).cancel();
            PostponeManager.cancel();
            new NotificationTimer(context).stop();
            GeneralUtils.resetBadgeAndPendingAfWSystemUpdate();
            SettingsDatabaseManager.disableFirstNetInstall(context);
            SessionExpirationManager.cancel(context);
            if (DeviceUtils.isABModel()) {
                EnablerManager.getInstance().resetUpdateEngine();
            }
            generalRepository.setResetTaskStatusAsFinished();
            Log.I("Clearing device ends");
        }

        public void initialize() throws Exception {
            checkInitializationAllowed();
            Log.I(">>>>>>>>>>   Initialization starts   <<<<<<<<<<");
            try {
                new DDFManager(InitExecutor.getContext()).execute(DeviceUtils.isUserShipBinary());
                if (DeviceUtils.isABModel()) {
                    EnablerManager.getInstance().bind();
                }
                if (!IDMDynamicReceivers.getInstance().isRegistered()) {
                    IDMDynamicReceivers.getInstance().register();
                }
                PushType.get().configFcmAutoInit();
                scheduleRegistrationIfNeeded();
                InitExecutor.get().isDmInitialized = true;
                Log.I(">>>>>>>>>>   Initialization ends   <<<<<<<<<<");
            } catch (Exception e5) {
                Log.printStackTrace(e5);
                throw e5;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            clear();
            initialize();
            return null;
        }
    }

    private InitExecutor() {
        this.initServiceUnbind.countDown();
        this.isDmInitialized = false;
        this.singleThreadExecutor = Executors.newSingleThreadExecutor(new c());
    }

    public static InitExecutor get() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Context getContext() {
        return IDMApplication.idmGetContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$execute$1() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$2() {
        Log.I("numTasks: " + this.numTasks.get());
        if (this.numTasks.decrementAndGet() == 0) {
            Log.I("no additional tasks bound -> start to unbind");
            this.initService = null;
            this.initServiceInstantiation = new CountDownLatch(1);
            getContext().unbindService(this.serviceConnection);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$3(FutureTask futureTask, BooleanSupplier booleanSupplier) {
        Log.I(futureTask.toString());
        if (booleanSupplier.getAsBoolean()) {
            futureTask.run();
        } else {
            Log.W("Precondition not satisfied; task cancelled - " + futureTask.cancel(false));
        }
        this.initService.postDelayed(new C1.b(13, this), UNBIND_GRACE_PERIOD_IN_MILLIS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$4(FutureTask futureTask, BooleanSupplier booleanSupplier) throws InterruptedException {
        try {
            Log.I("numTasks: " + this.numTasks.get());
            if (this.numTasks.incrementAndGet() == 1) {
                Log.I("not bound yet -> start to bind");
                this.initServiceUnbind.await();
                this.initServiceUnbind = new CountDownLatch(1);
                Intent intent = new Intent(getContext(), (Class<?>) InitService.class);
                getContext().startService(intent);
                getContext().bindService(intent, this.serviceConnection, 1);
                Log.I("initService not yet instantiated");
                this.initServiceInstantiation.await();
                Log.I("initService is instantiated");
            }
            this.initService.post(new a(this, futureTask, booleanSupplier, 1));
        } catch (InterruptedException e5) {
            Log.printStackTrace(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$new$0(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
        threadNewThread.setDaemon(true);
        return threadNewThread;
    }

    public synchronized void execute(Callable<Void> callable) {
        execute(callable, new b());
    }

    public void initialize() {
        execute(new InitializationTask());
    }

    public boolean isDmInitialized() {
        return this.isDmInitialized;
    }

    public void reset() {
        execute(new ResetTask());
    }

    public void waitForInitialization() throws ExecutionException, InterruptedException {
        if (this.futureTask == null) {
            Log.W("unexpected situation");
            initialize();
        }
        int i5 = 1;
        while (true) {
            FutureTask<Void> futureTask = this.futureTask;
            StringBuilder sb = new StringBuilder("turn: ");
            int i6 = i5 + 1;
            sb.append(i5);
            Log.W(sb.toString());
            futureTask.get();
            if (futureTask == this.futureTask) {
                return;
            } else {
                i5 = i6;
            }
        }
    }

    public synchronized void execute(Callable<Void> callable, BooleanSupplier booleanSupplier) {
        FutureTask<Void> futureTask = new FutureTask<>(callable);
        this.futureTask = futureTask;
        Log.I(getClass().getSimpleName() + " " + futureTask.toString());
        this.singleThreadExecutor.execute(new a(this, futureTask, booleanSupplier, 0));
    }
}
