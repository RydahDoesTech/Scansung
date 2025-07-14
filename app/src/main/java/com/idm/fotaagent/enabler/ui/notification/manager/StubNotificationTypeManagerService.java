package com.idm.fotaagent.enabler.ui.notification.manager;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class StubNotificationTypeManagerService extends Service implements NotificationTypeManagerService {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Log.W("should not be called");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Log.I("");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i5, int i6) {
        Log.W("should not be called");
        stopSelf(i6);
        return 2;
    }
}
