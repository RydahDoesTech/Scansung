package com.google.firebase.messaging;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final class A implements Runnable {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f6105i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static Boolean f6106j;

    /* renamed from: k, reason: collision with root package name */
    public static Boolean f6107k;

    /* renamed from: d, reason: collision with root package name */
    public final Context f6108d;

    /* renamed from: e, reason: collision with root package name */
    public final m f6109e;
    public final PowerManager.WakeLock f;

    /* renamed from: g, reason: collision with root package name */
    public final y f6110g;

    /* renamed from: h, reason: collision with root package name */
    public final long f6111h;

    public A(y yVar, Context context, m mVar, long j5) {
        this.f6110g = yVar;
        this.f6108d = context;
        this.f6111h = j5;
        this.f6109e = mVar;
        this.f = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (f6105i) {
            try {
                Boolean bool = f6107k;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f6107k = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z4 = context.checkCallingOrSelfPermission(str) == 0;
        if (z4 || !Log.isLoggable("FirebaseMessaging", 3)) {
            return z4;
        }
        StringBuilder sb = new StringBuilder(str.length() + 142);
        sb.append("Missing Permission: ");
        sb.append(str);
        sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        Log.d("FirebaseMessaging", sb.toString());
        return false;
    }

    public static boolean c(Context context) {
        boolean zBooleanValue;
        synchronized (f6105i) {
            try {
                Boolean bool = f6106j;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f6106j = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public final synchronized boolean d() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f6108d.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        y yVar = this.f6110g;
        Context context = this.f6108d;
        boolean zC = c(context);
        PowerManager.WakeLock wakeLock = this.f;
        if (zC) {
            wakeLock.acquire(AbstractC0385b.f6135a);
        }
        try {
            try {
                yVar.d(true);
                if (!this.f6109e.d()) {
                    yVar.d(false);
                    if (c(context)) {
                        try {
                            wakeLock.release();
                            return;
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (a(context) && !d()) {
                    new z(this, this).a();
                    if (c(context)) {
                        try {
                            wakeLock.release();
                            return;
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (yVar.e()) {
                    yVar.d(false);
                } else {
                    yVar.f(this.f6111h);
                }
                if (c(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } catch (IOException e5) {
                String strValueOf = String.valueOf(e5.getMessage());
                Log.e("FirebaseMessaging", strValueOf.length() != 0 ? "Failed to sync topics. Won't retry sync. ".concat(strValueOf) : new String("Failed to sync topics. Won't retry sync. "));
                yVar.d(false);
                if (c(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused4) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (Throwable th) {
            if (c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused5) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
