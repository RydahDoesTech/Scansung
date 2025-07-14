package k;

import androidx.appcompat.widget.SeslProgressBar;

/* renamed from: k.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0626h1 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SeslProgressBar f7671e;

    public /* synthetic */ RunnableC0626h1(SeslProgressBar seslProgressBar, int i5) {
        this.f7670d = i5;
        this.f7671e = seslProgressBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7670d) {
            case 0:
                this.f7671e.sendAccessibilityEvent(4);
                return;
            default:
                synchronized (this.f7671e) {
                    try {
                        int size = this.f7671e.f3399a0.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            C0641m1 c0641m1 = (C0641m1) this.f7671e.f3399a0.get(i5);
                            this.f7671e.e(c0641m1.f7746a, c0641m1.f7747b, c0641m1.f7748c, true, c0641m1.f7749d);
                            C0641m1.f7745e.c(c0641m1);
                        }
                        this.f7671e.f3399a0.clear();
                        this.f7671e.f3395T = false;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
