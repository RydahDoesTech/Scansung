package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Context f6162d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ boolean f6163e;
    public /* synthetic */ t1.i f;

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f6162d;
        t1.i iVar = this.f;
        try {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                SharedPreferences.Editor editorEdit = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                editorEdit.putBoolean("proxy_notification_initialized", true);
                editorEdit.apply();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (this.f6163e) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate(null);
                }
            } else {
                String strValueOf = String.valueOf(context.getPackageName());
                Log.e("FirebaseMessaging", strValueOf.length() != 0 ? "error configuring notification delegate for package ".concat(strValueOf) : new String("error configuring notification delegate for package "));
            }
            iVar.d(null);
        } catch (Throwable th) {
            iVar.d(null);
            throw th;
        }
    }
}
