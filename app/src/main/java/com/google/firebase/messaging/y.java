package com.google.firebase.messaging;

import android.content.Context;
import android.os.Bundle;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.C0704b;
import r0.AbstractC0809c;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: i, reason: collision with root package name */
    public static final long f6192i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f6193j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f6194a;

    /* renamed from: b, reason: collision with root package name */
    public final m f6195b;

    /* renamed from: c, reason: collision with root package name */
    public final G3.d f6196c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f6197d;
    public final ScheduledThreadPoolExecutor f;

    /* renamed from: h, reason: collision with root package name */
    public final w f6200h;

    /* renamed from: e, reason: collision with root package name */
    public final C0704b f6198e = new C0704b();

    /* renamed from: g, reason: collision with root package name */
    public boolean f6199g = false;

    public y(FirebaseMessaging firebaseMessaging, m mVar, w wVar, G3.d dVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f6197d = firebaseMessaging;
        this.f6195b = mVar;
        this.f6200h = wVar;
        this.f6196c = dVar;
        this.f6194a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static void a(t1.n nVar) throws IOException {
        try {
            AbstractC0809c.b(nVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e5) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e5);
        } catch (ExecutionException e6) {
            Throwable cause = e6.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e6);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) throws IOException {
        String strA = this.f6197d.a();
        G3.d dVar = this.f6196c;
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf(str);
        bundle.putString("gcm.topic", strValueOf.length() != 0 ? "/topics/".concat(strValueOf) : new String("/topics/"));
        String strValueOf2 = String.valueOf(str);
        a(dVar.f(dVar.t(strA, strValueOf2.length() != 0 ? "/topics/".concat(strValueOf2) : new String("/topics/"), bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.f6197d.a();
        G3.d dVar = this.f6196c;
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf(str);
        bundle.putString("gcm.topic", strValueOf.length() != 0 ? "/topics/".concat(strValueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String strValueOf2 = String.valueOf(str);
        a(dVar.f(dVar.t(strA, strValueOf2.length() != 0 ? "/topics/".concat(strValueOf2) : new String("/topics/"), bundle)));
    }

    public final synchronized void d(boolean z4) {
        this.f6199g = z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.y.e():boolean");
    }

    public final void f(long j5) {
        long jMin = Math.min(Math.max(30L, j5 + j5), f6192i);
        this.f.schedule(new A(this, this.f6194a, this.f6195b, jMin), j5, TimeUnit.SECONDS);
        d(true);
    }
}
