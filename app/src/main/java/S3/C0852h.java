package s3;

import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import e4.C0421d;
import e4.V;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p3.InterfaceC0776t;

/* renamed from: s3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0852h implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8819e;
    public final /* synthetic */ AbstractC0860p f;

    public /* synthetic */ C0852h(AbstractC0860p abstractC0860p, Object obj, int i5) {
        this.f8818d = i5;
        this.f = abstractC0860p;
        this.f8819e = obj;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        switch (this.f8818d) {
            case 0:
                e4.G.f6646e.getClass();
                e4.G g5 = e4.G.f;
                e4.J jI = ((AbstractC0854j) this.f).I();
                List listEmptyList = Collections.emptyList();
                C0851g c0851g = new C0851g(0, this);
                d4.b bVar = d4.l.f6418e;
                AbstractC0219i.d("NO_LOCKS", bVar);
                return C0421d.s(new X3.j(bVar, c0851g), g5, jI, listEmptyList, false);
            default:
                n4.f fVar = new n4.f();
                Iterator it = ((AbstractC0866v) this.f).p().iterator();
                while (it.hasNext()) {
                    fVar.add(((InterfaceC0776t) it.next()).c((V) this.f8819e));
                }
                return fVar;
        }
    }
}
