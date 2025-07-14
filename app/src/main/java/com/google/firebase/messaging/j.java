package com.google.firebase.messaging;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6152d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ FirebaseMessaging f6153e;

    public /* synthetic */ j(int i5) {
        this.f6152d = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f6152d) {
            case 0:
                FirebaseMessaging firebaseMessaging = this.f6153e;
                if (firebaseMessaging.f6131e.b()) {
                    firebaseMessaging.h();
                    break;
                }
                break;
            default:
                Context context = this.f6153e.f6128b;
                Context applicationContext2 = context.getApplicationContext();
                if (applicationContext2 == null) {
                    applicationContext2 = context;
                }
                if (!applicationContext2.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
                    try {
                        applicationContext = context.getApplicationContext();
                        packageManager = applicationContext.getPackageManager();
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    boolean z4 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                    t1.i iVar = new t1.i();
                    n nVar = new n();
                    nVar.f6162d = context;
                    nVar.f6163e = z4;
                    nVar.f = iVar;
                    nVar.run();
                    break;
                }
                break;
        }
    }
}
