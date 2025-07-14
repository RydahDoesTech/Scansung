package l;

import Y0.j;
import android.os.Handler;
import android.os.Looper;
import h0.ExecutorC0470a;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0677a extends j {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0677a f8003d;

    /* renamed from: e, reason: collision with root package name */
    public static final ExecutorC0470a f8004e = new ExecutorC0470a(1);

    /* renamed from: c, reason: collision with root package name */
    public final b f8005c;

    public C0677a() {
        super(25);
        this.f8005c = new b();
    }

    public static C0677a X() {
        if (f8003d != null) {
            return f8003d;
        }
        synchronized (C0677a.class) {
            try {
                if (f8003d == null) {
                    f8003d = new C0677a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f8003d;
    }

    public final void Y(Runnable runnable) {
        b bVar = this.f8005c;
        if (bVar.f8008e == null) {
            synchronized (bVar.f8006c) {
                try {
                    if (bVar.f8008e == null) {
                        bVar.f8008e = Handler.createAsync(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        bVar.f8008e.post(runnable);
    }
}
