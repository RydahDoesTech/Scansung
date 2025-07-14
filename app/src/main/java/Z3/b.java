package z3;

import P2.m;
import P2.v;
import b3.AbstractC0219i;
import b3.n;
import b3.q;
import b3.r;
import d4.l;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import g3.InterfaceC0466p;
import java.util.Map;
import p3.InterfaceC0752N;
import q3.InterfaceC0792b;
import v3.C0898e;

/* loaded from: classes.dex */
public class b implements InterfaceC0792b, A3.i {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0466p[] f9482e;

    /* renamed from: a, reason: collision with root package name */
    public final N3.c f9483a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0752N f9484b;

    /* renamed from: c, reason: collision with root package name */
    public final d4.i f9485c;

    /* renamed from: d, reason: collision with root package name */
    public final E3.a f9486d;

    static {
        r rVar = q.f5100a;
        f9482e = new InterfaceC0466p[]{rVar.e(new n(rVar.b(b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};
    }

    public b(B3.g gVar, C0898e c0898e, N3.c cVar) {
        AbstractC0219i.e("c", gVar);
        AbstractC0219i.e("fqName", cVar);
        this.f9483a = cVar;
        B3.b bVar = (B3.b) gVar.f255e;
        this.f9484b = c0898e != null ? bVar.f231j.c(c0898e) : InterfaceC0752N.f8400b;
        l lVar = bVar.f223a;
        B3.a aVar = new B3.a(gVar, 16, this);
        lVar.getClass();
        this.f9485c = new d4.i(lVar, aVar);
        this.f9486d = c0898e != null ? (E3.a) m.v0(c0898e.a()) : null;
    }

    @Override // q3.InterfaceC0792b
    public final N3.c a() {
        return this.f9483a;
    }

    @Override // q3.InterfaceC0792b
    public Map b() {
        return v.f2164d;
    }

    @Override // q3.InterfaceC0792b
    public final AbstractC0438v d() {
        return (AbstractC0442z) V1.a.Q(this.f9485c, f9482e[0]);
    }

    @Override // q3.InterfaceC0792b
    public final InterfaceC0752N n() {
        return this.f9484b;
    }
}
