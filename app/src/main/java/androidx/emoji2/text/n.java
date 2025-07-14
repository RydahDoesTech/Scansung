package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Handler;
import g3.y;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3673a;

    /* renamed from: b, reason: collision with root package name */
    public final B3.g f3674b;

    /* renamed from: c, reason: collision with root package name */
    public final O1.e f3675c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3676d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f3677e;
    public ThreadPoolExecutor f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f3678g;

    /* renamed from: h, reason: collision with root package name */
    public Y0.j f3679h;

    public n(Context context, B3.g gVar) {
        O1.e eVar = o.f3680d;
        this.f3676d = new Object();
        y.h("Context cannot be null", context);
        this.f3673a = context.getApplicationContext();
        this.f3674b = gVar;
        this.f3675c = eVar;
    }

    @Override // androidx.emoji2.text.h
    public final void a(Y0.j jVar) {
        synchronized (this.f3676d) {
            this.f3679h = jVar;
        }
        synchronized (this.f3676d) {
            try {
                if (this.f3679h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f3678g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new C1.b(10, this));
            } finally {
            }
        }
    }

    public final void b() {
        synchronized (this.f3676d) {
            try {
                this.f3679h = null;
                Handler handler = this.f3677e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f3677e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f3678g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.f3678g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final G.i c() throws Resources.NotFoundException {
        try {
            O1.e eVar = this.f3675c;
            Context context = this.f3673a;
            B3.g gVar = this.f3674b;
            eVar.getClass();
            A1.e eVarA = G.d.a(context, gVar);
            int i5 = eVarA.f56d;
            if (i5 != 0) {
                throw new RuntimeException("fetchFonts failed (" + i5 + ")");
            }
            G.i[] iVarArr = (G.i[]) eVarA.f57e;
            if (iVarArr == null || iVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return iVarArr[0];
        } catch (PackageManager.NameNotFoundException e5) {
            throw new RuntimeException("provider not found", e5);
        }
    }
}
