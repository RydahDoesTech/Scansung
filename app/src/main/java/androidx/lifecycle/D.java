package androidx.lifecycle;

/* loaded from: classes.dex */
public final class D implements G {

    /* renamed from: a, reason: collision with root package name */
    public final C f3960a;

    /* renamed from: b, reason: collision with root package name */
    public final W f3961b;

    /* renamed from: c, reason: collision with root package name */
    public int f3962c = -1;

    public D(C c2, W w3) {
        this.f3960a = c2;
        this.f3961b = w3;
    }

    @Override // androidx.lifecycle.G
    public final void c(Object obj) {
        int i5 = this.f3962c;
        int i6 = this.f3960a.f3955g;
        if (i5 != i6) {
            this.f3962c = i6;
            this.f3961b.c(obj);
        }
    }
}
