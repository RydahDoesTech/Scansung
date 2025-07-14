package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import s1.C0824a;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final long f6112a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f6113b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static C0824a f6114c;

    public static ComponentName a(Context context, Intent intent) {
        synchronized (f6113b) {
            try {
                if (f6114c == null) {
                    C0824a c0824a = new C0824a(context);
                    f6114c = c0824a;
                    c0824a.f8724b.setReferenceCounted(true);
                    c0824a.f8728g = true;
                }
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f6114c.a(f6112a);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
