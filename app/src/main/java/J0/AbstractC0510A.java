package j0;

import android.view.ViewGroup;

/* renamed from: j0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0510A {

    /* renamed from: a, reason: collision with root package name */
    public final C0511B f7050a = new C0511B();

    /* renamed from: b, reason: collision with root package name */
    public boolean f7051b = false;

    /* renamed from: c, reason: collision with root package name */
    public final int f7052c = 1;

    public abstract int a();

    public long b(int i5) {
        return -1L;
    }

    public int c(int i5) {
        return 0;
    }

    public abstract void d(b0 b0Var, int i5);

    public abstract b0 e(ViewGroup viewGroup, int i5);

    public int f() {
        return a();
    }

    public int g(int i5) {
        return i5;
    }

    public final void h(boolean z4) {
        if (this.f7050a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f7051b = z4;
    }
}
