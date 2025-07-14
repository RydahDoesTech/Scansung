package b1;

/* loaded from: classes.dex */
public final class g extends AbstractC0207c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k f5017g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, int i5) {
        super(kVar, i5, null);
        this.f5017g = kVar;
    }

    @Override // b1.AbstractC0207c
    public final void b(Y0.a aVar) {
        k kVar = this.f5017g;
        kVar.getClass();
        kVar.f5038h.d(aVar);
        System.currentTimeMillis();
    }

    @Override // b1.AbstractC0207c
    public final boolean c() {
        this.f5017g.f5038h.d(Y0.a.f2805h);
        return true;
    }
}
