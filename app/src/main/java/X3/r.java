package X3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import g3.InterfaceC0466p;
import java.util.Collection;
import java.util.List;
import p3.InterfaceC0750L;
import p3.InterfaceC0763g;
import s3.C0837M;
import x3.EnumC0915b;

/* loaded from: classes.dex */
public final class r extends o {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0466p[] f2795e;

    /* renamed from: b, reason: collision with root package name */
    public final c4.i f2796b;

    /* renamed from: c, reason: collision with root package name */
    public final d4.i f2797c;

    /* renamed from: d, reason: collision with root package name */
    public final d4.i f2798d;

    static {
        b3.r rVar = b3.q.f5100a;
        f2795e = new InterfaceC0466p[]{rVar.e(new b3.n(rVar.b(r.class), "functions", "getFunctions()Ljava/util/List;")), rVar.e(new b3.n(rVar.b(r.class), "properties", "getProperties()Ljava/util/List;"))};
    }

    public r(d4.o oVar, c4.i iVar) {
        AbstractC0219i.e("storageManager", oVar);
        this.f2796b = iVar;
        d4.l lVar = (d4.l) oVar;
        this.f2797c = new d4.i(lVar, new q(this, 0));
        this.f2798d = new d4.i(lVar, new q(this, 1));
    }

    @Override // X3.o, X3.n
    public final Collection c(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        List list = (List) V1.a.Q(this.f2798d, f2795e[1]);
        n4.f fVar2 = new n4.f();
        for (Object obj : list) {
            if (AbstractC0219i.a(((InterfaceC0750L) obj).getName(), fVar)) {
                fVar2.add(obj);
            }
        }
        return fVar2;
    }

    @Override // X3.o, X3.p
    public final Collection d(f fVar, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("kindFilter", fVar);
        AbstractC0219i.e("nameFilter", interfaceC0107b);
        d4.i iVar = this.f2797c;
        InterfaceC0466p[] interfaceC0466pArr = f2795e;
        return P2.m.G0((List) V1.a.Q(iVar, interfaceC0466pArr[0]), (List) V1.a.Q(this.f2798d, interfaceC0466pArr[1]));
    }

    @Override // X3.o, X3.n
    public final Collection e(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        List list = (List) V1.a.Q(this.f2797c, f2795e[0]);
        n4.f fVar2 = new n4.f();
        for (Object obj : list) {
            if (AbstractC0219i.a(((C0837M) obj).getName(), fVar)) {
                fVar2.add(obj);
            }
        }
        return fVar2;
    }

    @Override // X3.o, X3.p
    public final InterfaceC0763g g(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        AbstractC0219i.e("location", enumC0915b);
        return null;
    }
}
