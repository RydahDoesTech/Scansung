package p3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import java.util.List;
import o3.C0728k;

/* renamed from: p3.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0741C extends b3.k implements InterfaceC0107b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.messaging.q f8391e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0741C(com.google.firebase.messaging.q qVar, int i5) {
        super(1);
        this.f8390d = i5;
        this.f8391e = qVar;
    }

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        InterfaceC0762f interfaceC0762fT;
        switch (this.f8390d) {
            case 0:
                C0739A c0739a = (C0739A) obj;
                AbstractC0219i.e("<name for destructuring parameter 0>", c0739a);
                N3.b bVar = c0739a.f8385a;
                if (bVar.f1832c) {
                    throw new UnsupportedOperationException("Unresolved local class: " + bVar);
                }
                N3.b bVarF = bVar.f();
                List list = c0739a.f8386b;
                com.google.firebase.messaging.q qVar = this.f8391e;
                if (bVarF != null) {
                    interfaceC0762fT = qVar.t(bVarF, P2.m.r0(list));
                } else {
                    d4.e eVar = (d4.e) qVar.f6169g;
                    N3.c cVarG = bVar.g();
                    AbstractC0219i.d("classId.packageFqName", cVarG);
                    interfaceC0762fT = (InterfaceC0762f) eVar.d(cVarG);
                }
                InterfaceC0762f interfaceC0762f = interfaceC0762fT;
                boolean z4 = !bVar.f1831b.e().d();
                d4.o oVar = (d4.o) qVar.f6168e;
                N3.f fVarI = bVar.i();
                AbstractC0219i.d("classId.shortClassName", fVarI);
                Integer num = (Integer) P2.m.w0(list);
                return new C0740B(oVar, interfaceC0762f, fVarI, z4, num != null ? num.intValue() : 0);
            default:
                N3.c cVar = (N3.c) obj;
                AbstractC0219i.e("fqName", cVar);
                return new C0728k((InterfaceC0781y) this.f8391e.f, cVar, 1);
        }
    }
}
