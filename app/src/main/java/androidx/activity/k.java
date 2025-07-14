package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.H;

/* loaded from: classes.dex */
public final class k implements j, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: e, reason: collision with root package name */
    public Runnable f3125e;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ H f3126g;

    /* renamed from: d, reason: collision with root package name */
    public final long f3124d = SystemClock.uptimeMillis() + 10000;
    public boolean f = false;

    public k(H h3) {
        this.f3126g = h3;
    }

    @Override // androidx.activity.j
    public final void a(View view) {
        if (this.f) {
            return;
        }
        this.f = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f3125e = runnable;
        View decorView = this.f3126g.getWindow().getDecorView();
        if (!this.f) {
            decorView.postOnAnimation(new C1.b(8, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z4;
        Runnable runnable = this.f3125e;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f3124d) {
                this.f = false;
                this.f3126g.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f3125e = null;
        m mVar = this.f3126g.mFullyDrawnReporter;
        synchronized (mVar.f3129a) {
            z4 = mVar.f3130b;
        }
        if (z4) {
            this.f = false;
            this.f3126g.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3126g.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
