package X3;

import C3.C0012d;
import P2.u;
import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import g3.InterfaceC0466p;
import java.util.Collection;
import java.util.List;
import p3.InterfaceC0750L;
import s3.AbstractC0846b;
import s3.C0837M;
import x3.EnumC0915b;

/* loaded from: classes.dex */
public abstract class h extends o {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0466p[] f2780d;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0846b f2781b;

    /* renamed from: c, reason: collision with root package name */
    public final d4.i f2782c;

    static {
        b3.r rVar = b3.q.f5100a;
        f2780d = new InterfaceC0466p[]{rVar.e(new b3.n(rVar.b(h.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    }

    public h(d4.l lVar, AbstractC0846b abstractC0846b) {
        this.f2781b = abstractC0846b;
        this.f2782c = new d4.i(lVar, new C0012d(6, this));
    }

    @Override // X3.o, X3.n
    public final Collection c(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        List list = (List) V1.a.Q(this.f2782c, f2780d[0]);
        n4.f fVar2 = new n4.f();
        for (Object obj : list) {
            if ((obj instanceof InterfaceC0750L) && AbstractC0219i.a(((InterfaceC0750L) obj).getName(), fVar)) {
                fVar2.add(obj);
            }
        }
        return fVar2;
    }

    @Override // X3.o, X3.p
    public final Collection d(f fVar, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("kindFilter", fVar);
        AbstractC0219i.e("nameFilter", interfaceC0107b);
        return !fVar.a(f.n.f2777b) ? u.f2163d : (List) V1.a.Q(this.f2782c, f2780d[0]);
    }

    @Override // X3.o, X3.n
    public final Collection e(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        List list = (List) V1.a.Q(this.f2782c, f2780d[0]);
        n4.f fVar2 = new n4.f();
        for (Object obj : list) {
            if ((obj instanceof C0837M) && AbstractC0219i.a(((C0837M) obj).getName(), fVar)) {
                fVar2.add(obj);
            }
        }
        return fVar2;
    }

    public abstract List h();
}
