package s3;

import b3.AbstractC0219i;
import g3.InterfaceC0466p;
import p3.InterfaceC0747I;
import p3.InterfaceC0766j;
import p3.InterfaceC0768l;
import q3.C0797g;

/* loaded from: classes.dex */
public final class y extends AbstractC0859o implements InterfaceC0747I {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0466p[] f8899k;
    public final C0826B f;

    /* renamed from: g, reason: collision with root package name */
    public final N3.c f8900g;

    /* renamed from: h, reason: collision with root package name */
    public final d4.i f8901h;

    /* renamed from: i, reason: collision with root package name */
    public final d4.i f8902i;

    /* renamed from: j, reason: collision with root package name */
    public final X3.j f8903j;

    static {
        b3.r rVar = b3.q.f5100a;
        f8899k = new InterfaceC0466p[]{rVar.e(new b3.n(rVar.b(y.class), "fragments", "getFragments()Ljava/util/List;")), rVar.e(new b3.n(rVar.b(y.class), "empty", "getEmpty()Z"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C0826B c0826b, N3.c cVar, d4.l lVar) {
        super(C0797g.f8481a, cVar.g());
        AbstractC0219i.e("module", c0826b);
        AbstractC0219i.e("fqName", cVar);
        AbstractC0219i.e("storageManager", lVar);
        this.f = c0826b;
        this.f8900g = cVar;
        this.f8901h = new d4.i(lVar, new C0868x(this, 1));
        this.f8902i = new d4.i(lVar, new C0868x(this, 0));
        this.f8903j = new X3.j(lVar, new C0868x(this, 2));
    }

    @Override // p3.InterfaceC0766j
    public final Object U(InterfaceC0768l interfaceC0768l, Object obj) {
        return interfaceC0768l.G(this, obj);
    }

    public final boolean equals(Object obj) {
        InterfaceC0747I interfaceC0747I = obj instanceof InterfaceC0747I ? (InterfaceC0747I) obj : null;
        if (interfaceC0747I == null) {
            return false;
        }
        y yVar = (y) interfaceC0747I;
        return AbstractC0219i.a(this.f8900g, yVar.f8900g) && AbstractC0219i.a(this.f, yVar.f);
    }

    public final int hashCode() {
        return this.f8900g.hashCode() + (this.f.hashCode() * 31);
    }

    @Override // p3.InterfaceC0766j
    public final InterfaceC0766j l() {
        N3.c cVar = this.f8900g;
        if (cVar.d()) {
            return null;
        }
        N3.c cVarE = cVar.e();
        AbstractC0219i.d("fqName.parent()", cVarE);
        return this.f.D(cVarE);
    }
}
