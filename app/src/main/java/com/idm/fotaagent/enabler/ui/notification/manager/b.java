package com.idm.fotaagent.enabler.ui.notification.manager;

import android.app.AlarmManager;
import android.app.PendingIntent;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Consumer {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ PendingIntent f6339e;

    public /* synthetic */ b(int i5, PendingIntent pendingIntent) {
        this.f6338d = i5;
        this.f6339e = pendingIntent;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i5 = this.f6338d;
        PendingIntent pendingIntent = this.f6339e;
        AlarmManager alarmManager = (AlarmManager) obj;
        switch (i5) {
            case 0:
                alarmManager.cancel(pendingIntent);
                break;
            default:
                alarmManager.cancel(pendingIntent);
                break;
        }
    }
}
