package j3;

import O3.C0083o;
import b3.AbstractC0219i;
import com.idm.providers.mo.IDMMoInterface;
import e1.AbstractC0415a;
import g3.InterfaceC0453c;
import g3.InterfaceC0466p;
import java.util.Collection;
import o3.C0721d;
import p3.InterfaceC0750L;
import p3.InterfaceC0761e;
import v3.AbstractC0897d;
import x3.EnumC0915b;

/* renamed from: j3.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0585z extends D implements InterfaceC0453c, o0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f7459g = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Class f7460e;
    public final r0 f;

    public C0585z(Class cls) {
        AbstractC0219i.e("jClass", cls);
        this.f7460e = cls;
        this.f = new r0(new C0579t(this, 7));
    }

    @Override // b3.InterfaceC0213c
    public final Class a() {
        return this.f7460e;
    }

    @Override // j3.D
    public final Collection d() {
        InterfaceC0761e interfaceC0761eR = r();
        if (interfaceC0761eR.L() == 2 || interfaceC0761eR.L() == 6) {
            return P2.u.f2163d;
        }
        Collection collectionK = interfaceC0761eR.k();
        AbstractC0219i.d("descriptor.constructors", collectionK);
        return collectionK;
    }

    @Override // j3.D
    public final Collection e(N3.f fVar) {
        X3.n nVarP0 = r().q().p0();
        EnumC0915b enumC0915b = EnumC0915b.f9316e;
        Collection collectionE = nVarP0.e(fVar, enumC0915b);
        X3.n nVarW = r().W();
        AbstractC0219i.d("descriptor.staticScope", nVarW);
        return P2.m.G0(collectionE, nVarW.e(fVar, enumC0915b));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0585z) && g3.y.A(this).equals(g3.y.A((InterfaceC0453c) obj));
    }

    @Override // j3.D
    public final InterfaceC0750L f(int i5) {
        Class<?> declaringClass;
        Class cls = this.f7460e;
        if (cls.getSimpleName().equals("DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((C0585z) g3.y.F(declaringClass)).f(i5);
        }
        InterfaceC0761e interfaceC0761eR = r();
        c4.i iVar = interfaceC0761eR instanceof c4.i ? (c4.i) interfaceC0761eR : null;
        if (iVar == null) {
            return null;
        }
        C0083o c0083o = L3.k.f1804j;
        AbstractC0219i.d("classLocalVariable", c0083o);
        I3.G g5 = (I3.G) AbstractC0415a.t(iVar.f5159h, c0083o, i5);
        if (g5 == null) {
            return null;
        }
        a4.k kVar = iVar.f5165o;
        return (InterfaceC0750L) x0.f(this.f7460e, g5, (K3.f) kVar.f3059e, (K3.g) kVar.f3060g, iVar.f5160i, C0584y.f7456l);
    }

    public final int hashCode() {
        return g3.y.A(this).hashCode();
    }

    @Override // j3.D
    public final Collection i(N3.f fVar) {
        X3.n nVarP0 = r().q().p0();
        EnumC0915b enumC0915b = EnumC0915b.f9316e;
        Collection collectionC = nVarP0.c(fVar, enumC0915b);
        X3.n nVarW = r().W();
        AbstractC0219i.d("descriptor.staticScope", nVarW);
        return P2.m.G0(collectionC, nVarW.c(fVar, enumC0915b));
    }

    @Override // g3.InterfaceC0453c
    public final Collection k() {
        C0582w c0582w = (C0582w) this.f.a();
        c0582w.getClass();
        InterfaceC0466p interfaceC0466p = C0582w.f7444l[4];
        Object objA = c0582w.f7447e.a();
        AbstractC0219i.d("<get-constructors>(...)", objA);
        return (Collection) objA;
    }

    @Override // g3.InterfaceC0453c
    public final String l() {
        C0582w c0582w = (C0582w) this.f.a();
        c0582w.getClass();
        InterfaceC0466p interfaceC0466p = C0582w.f7444l[3];
        return (String) c0582w.f7446d.a();
    }

    public final N3.b q() {
        m3.j jVarD;
        N3.b bVar = v0.f7443a;
        Class cls = this.f7460e;
        AbstractC0219i.e("klass", cls);
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            AbstractC0219i.d("klass.componentType", componentType);
            jVarD = componentType.isPrimitive() ? V3.c.b(componentType.getSimpleName()).d() : null;
            return jVarD != null ? new N3.b(m3.n.f8150j, jVarD.f8081e) : N3.b.j(m3.m.f8123g.g());
        }
        if (cls.equals(Void.TYPE)) {
            return v0.f7443a;
        }
        jVarD = cls.isPrimitive() ? V3.c.b(cls.getSimpleName()).d() : null;
        if (jVarD != null) {
            return new N3.b(m3.n.f8150j, jVarD.f8080d);
        }
        N3.b bVarA = AbstractC0897d.a(cls);
        if (bVarA.f1832c) {
            return bVarA;
        }
        String str = C0721d.f8248a;
        N3.b bVar2 = (N3.b) C0721d.f8254h.get(bVarA.b().i());
        return bVar2 != null ? bVar2 : bVarA;
    }

    public final InterfaceC0761e r() {
        return ((C0582w) this.f.a()).a();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("class ");
        N3.b bVarQ = q();
        N3.c cVarG = bVarQ.g();
        AbstractC0219i.d("classId.packageFqName", cVarG);
        String strConcat = cVarG.d() ? "" : cVarG.b().concat(IDMMoInterface.IDM_MO_ROOT_PATH);
        sb.append(strConcat + p4.h.m0(bVarQ.h().b(), '.', '$'));
        return sb.toString();
    }
}
