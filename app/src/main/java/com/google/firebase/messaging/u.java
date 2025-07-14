package com.google.firebase.messaging;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import h1.ThreadFactoryC0474a;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f6179d;

    /* renamed from: e, reason: collision with root package name */
    public final PowerManager.WakeLock f6180e;
    public final FirebaseMessaging f;

    public u(FirebaseMessaging firebaseMessaging, long j5) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0474a("firebase-iid-executor"));
        this.f = firebaseMessaging;
        this.f6179d = j5;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f6128b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f6180e = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f.f6128b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() throws IOException {
        try {
            if (this.f.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e5) {
            String message = e5.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e5.getMessage() != null) {
                    throw e5;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            String message2 = e5.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message2).length() + 52);
            sb.append("Token retrieval failed: ");
            sb.append(message2);
            sb.append(". Will retry token retrieval");
            Log.w("FirebaseMessaging", sb.toString());
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVarU = q.u();
        FirebaseMessaging firebaseMessaging = this.f;
        boolean zW = qVarU.w(firebaseMessaging.f6128b);
        PowerManager.WakeLock wakeLock = this.f6180e;
        if (zW) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f6133h = true;
                }
                if (!firebaseMessaging.f6132g.d()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.f6133h = false;
                    }
                    if (q.u().w(firebaseMessaging.f6128b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (q.u().v(firebaseMessaging.f6128b) && !a()) {
                    t tVar = new t();
                    tVar.f6178b = this;
                    tVar.a();
                    if (q.u().w(firebaseMessaging.f6128b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (b()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.f6133h = false;
                    }
                } else {
                    firebaseMessaging.i(this.f6179d);
                }
                if (q.u().w(firebaseMessaging.f6128b)) {
                    wakeLock.release();
                }
            } catch (IOException e5) {
                String message = e5.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
                sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb.append(message);
                sb.append(". Won't retry the operation.");
                Log.e("FirebaseMessaging", sb.toString());
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f6133h = false;
                    if (q.u().w(firebaseMessaging.f6128b)) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th) {
            if (q.u().w(firebaseMessaging.f6128b)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
