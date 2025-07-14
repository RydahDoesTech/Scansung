package androidx.lifecycle;

/* renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0143f extends C {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC0144g f4018l;

    public C0143f(AbstractC0144g abstractC0144g) {
        this.f4018l = abstractC0144g;
    }

    @Override // androidx.lifecycle.C
    public final void g() {
        AbstractC0144g abstractC0144g = this.f4018l;
        abstractC0144g.getExecutor$lifecycle_livedata_release().execute(abstractC0144g.refreshRunnable);
    }
}
