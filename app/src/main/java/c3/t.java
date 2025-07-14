package C3;

import b3.AbstractC0219i;
import g3.InterfaceC0466p;
import p3.InterfaceC0752N;
import q3.C0797g;
import q3.InterfaceC0798h;
import s3.AbstractC0828D;

/* loaded from: classes.dex */
public final class t extends AbstractC0828D {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0466p[] f440p;

    /* renamed from: j, reason: collision with root package name */
    public final v3.y f441j;

    /* renamed from: k, reason: collision with root package name */
    public final B3.g f442k;

    /* renamed from: l, reason: collision with root package name */
    public final d4.i f443l;

    /* renamed from: m, reason: collision with root package name */
    public final C0013e f444m;
    public final d4.c n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC0798h f445o;

    static {
        b3.r rVar = b3.q.f5100a;
        f440p = new InterfaceC0466p[]{rVar.e(new b3.n(rVar.b(t.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), rVar.e(new b3.n(rVar.b(t.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public t(B3.g gVar, v3.y yVar) {
        AbstractC0219i.e("outerContext", gVar);
        B3.b bVar = (B3.b) gVar.f255e;
        super(bVar.f235o, yVar.f9267a);
        this.f441j = yVar;
        B3.g gVarG = V1.a.g(gVar, this, null, 6);
        this.f442k = gVarG;
        AbstractC0219i.e("<this>", bVar.f226d.c().f3039c);
        M3.f fVar = M3.f.f1821g;
        B3.b bVar2 = (B3.b) gVarG.f255e;
        d4.l lVar = bVar2.f223a;
        s sVar = new s(this, 0);
        lVar.getClass();
        this.f443l = new d4.i(lVar, sVar);
        this.f444m = new C0013e(gVarG, yVar, this);
        s sVar2 = new s(this, 2);
        lVar.getClass();
        this.n = new d4.c(lVar, sVar2);
        this.f445o = bVar2.f242v.f9433b ? C0797g.f8481a : Y0.j.N(gVarG, yVar);
        lVar.a(new s(this, 1));
    }

    @Override // s3.AbstractC0828D, s3.AbstractC0860p, p3.InterfaceC0767k
    public final InterfaceC0752N n() {
        return new B.g(this);
    }

    @Override // p3.InterfaceC0742D
    public final X3.n p0() {
        return this.f444m;
    }

    @Override // H3.c, q3.InterfaceC0791a
    public final InterfaceC0798h s() {
        return this.f445o;
    }

    @Override // s3.AbstractC0828D, s3.AbstractC0859o
    public final String toString() {
        return "Lazy Java package fragment: " + this.f8745h + " of module " + ((B3.b) this.f442k.f255e).f235o;
    }
}
