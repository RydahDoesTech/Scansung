package C3;

import b3.AbstractC0219i;
import e4.AbstractC0420c;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import e4.N;
import g3.InterfaceC0466p;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import m3.AbstractC0695h;
import p3.InterfaceC0752N;
import p3.InterfaceC0755Q;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import q3.InterfaceC0792b;
import s3.C0843T;
import v3.AbstractC0897d;
import v3.C0893E;
import v3.C0898e;

/* renamed from: C3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0015g implements InterfaceC0792b, A3.i {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0466p[] f390h;

    /* renamed from: a, reason: collision with root package name */
    public final B3.g f391a;

    /* renamed from: b, reason: collision with root package name */
    public final C0898e f392b;

    /* renamed from: c, reason: collision with root package name */
    public final d4.h f393c;

    /* renamed from: d, reason: collision with root package name */
    public final d4.i f394d;

    /* renamed from: e, reason: collision with root package name */
    public final u3.g f395e;
    public final d4.i f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f396g;

    static {
        b3.r rVar = b3.q.f5100a;
        f390h = new InterfaceC0466p[]{rVar.e(new b3.n(rVar.b(C0015g.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), rVar.e(new b3.n(rVar.b(C0015g.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), rVar.e(new b3.n(rVar.b(C0015g.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public C0015g(B3.g gVar, C0898e c0898e, boolean z4) {
        AbstractC0219i.e("c", gVar);
        AbstractC0219i.e("javaAnnotation", c0898e);
        this.f391a = gVar;
        this.f392b = c0898e;
        B3.b bVar = (B3.b) gVar.f255e;
        d4.l lVar = bVar.f223a;
        C0014f c0014f = new C0014f(this, 1);
        lVar.getClass();
        this.f393c = new d4.h(lVar, c0014f);
        C0014f c0014f2 = new C0014f(this, 2);
        lVar.getClass();
        this.f394d = new d4.i(lVar, c0014f2);
        this.f395e = bVar.f231j.c(c0898e);
        C0014f c0014f3 = new C0014f(this, 0);
        lVar.getClass();
        this.f = new d4.i(lVar, c0014f3);
        this.f396g = z4;
    }

    @Override // q3.InterfaceC0792b
    public final N3.c a() {
        d4.h hVar = this.f393c;
        InterfaceC0466p interfaceC0466p = f390h[0];
        AbstractC0219i.e("<this>", hVar);
        AbstractC0219i.e("p", interfaceC0466p);
        return (N3.c) hVar.a();
    }

    @Override // q3.InterfaceC0792b
    public final Map b() {
        return (Map) V1.a.Q(this.f, f390h[2]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final S3.g c(E3.a aVar) {
        AbstractC0438v abstractC0438vH;
        if (aVar instanceof v3.v) {
            return S3.h.f2532a.b(((v3.v) aVar).f9265b, null);
        }
        if (aVar instanceof v3.t) {
            v3.t tVar = (v3.t) aVar;
            Class<?> enclosingClass = tVar.f9263b.getClass();
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            AbstractC0219i.d("enumClass", enclosingClass);
            return new S3.i(AbstractC0897d.a(enclosingClass), N3.f.e(tVar.f9263b.name()));
        }
        boolean z4 = aVar instanceof v3.h;
        B3.g gVar = this.f391a;
        if (!z4) {
            if (aVar instanceof v3.g) {
                return new S3.a((Object) new C0015g(gVar, new C0898e(((v3.g) aVar).f9248b), false));
            }
            if (!(aVar instanceof v3.p)) {
                return null;
            }
            Class cls = ((v3.p) aVar).f9259b;
            AbstractC0438v abstractC0438vR = ((D3.c) gVar.f258i).r(cls.isPrimitive() ? new v3.z(cls) : ((cls instanceof GenericArrayType) || cls.isArray()) ? new v3.i(cls) : cls instanceof WildcardType ? new C0893E((WildcardType) cls) : new v3.q(cls), V1.a.n0(2, false, false, null, 7));
            if (AbstractC0420c.i(abstractC0438vR)) {
                return null;
            }
            AbstractC0438v abstractC0438vB = abstractC0438vR;
            int i5 = 0;
            while (AbstractC0695h.x(abstractC0438vB)) {
                abstractC0438vB = ((N) P2.m.J0(abstractC0438vB.s0())).b();
                AbstractC0219i.d("type.arguments.single().type", abstractC0438vB);
                i5++;
            }
            InterfaceC0763g interfaceC0763gI = abstractC0438vB.I0().i();
            if (interfaceC0763gI instanceof InterfaceC0761e) {
                N3.b bVarF = U3.f.f(interfaceC0763gI);
                return bVarF == null ? new S3.r(new S3.o(abstractC0438vR)) : new S3.r(bVarF, i5);
            }
            if (interfaceC0763gI instanceof InterfaceC0755Q) {
                return new S3.r(N3.b.j(m3.m.f8115a.g()), 0);
            }
            return null;
        }
        v3.h hVar = (v3.h) aVar;
        N3.f fVar = hVar.f9247a;
        if (fVar == null) {
            fVar = y3.x.f9442b;
        }
        AbstractC0219i.d("argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME", fVar);
        ArrayList arrayListA = hVar.a();
        AbstractC0442z abstractC0442z = (AbstractC0442z) V1.a.Q(this.f394d, f390h[1]);
        AbstractC0219i.d("type", abstractC0442z);
        if (AbstractC0420c.i(abstractC0442z)) {
            return null;
        }
        InterfaceC0761e interfaceC0761eD = U3.f.d(this);
        AbstractC0219i.b(interfaceC0761eD);
        C0843T c0843tF = r2.d.f(fVar, interfaceC0761eD);
        if (c0843tF == null || (abstractC0438vH = c0843tF.d()) == null) {
            abstractC0438vH = ((B3.b) gVar.f255e).f235o.f8732g.h(g4.j.c(g4.i.f6813G, new String[0]));
        }
        ArrayList arrayList = new ArrayList(P2.o.l0(arrayListA));
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            S3.g gVarC = c((E3.a) it.next());
            if (gVarC == null) {
                gVarC = new S3.t(null);
            }
            arrayList.add(gVarC);
        }
        return new S3.w(arrayList, abstractC0438vH);
    }

    @Override // q3.InterfaceC0792b
    public final AbstractC0438v d() {
        return (AbstractC0442z) V1.a.Q(this.f394d, f390h[1]);
    }

    @Override // q3.InterfaceC0792b
    public final InterfaceC0752N n() {
        return this.f395e;
    }

    public final String toString() {
        return P3.g.f2193c.v(this, null);
    }
}
