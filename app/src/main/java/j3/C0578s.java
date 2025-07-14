package j3;

import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import g3.InterfaceC0466p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p3.InterfaceC0761e;
import p3.InterfaceC0766j;

/* renamed from: j3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0578s extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0582w f7435e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0578s(C0582w c0582w, int i5) {
        super(0);
        this.f7434d = i5;
        this.f7435e = c0582w;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        switch (this.f7434d) {
            case 0:
                C0582w c0582w = this.f7435e;
                c0582w.getClass();
                InterfaceC0466p[] interfaceC0466pArr = C0582w.f7444l;
                InterfaceC0466p interfaceC0466p = interfaceC0466pArr[14];
                Object objA = c0582w.f7451j.a();
                AbstractC0219i.d("<get-allNonStaticMembers>(...)", objA);
                InterfaceC0466p interfaceC0466p2 = interfaceC0466pArr[15];
                Object objA2 = c0582w.f7452k.a();
                AbstractC0219i.d("<get-allStaticMembers>(...)", objA2);
                return P2.m.G0((Collection) objA, (Collection) objA2);
            case 1:
                C0582w c0582w2 = this.f7435e;
                c0582w2.getClass();
                InterfaceC0466p[] interfaceC0466pArr2 = C0582w.f7444l;
                InterfaceC0466p interfaceC0466p3 = interfaceC0466pArr2[10];
                Object objA3 = c0582w2.f.a();
                AbstractC0219i.d("<get-declaredNonStaticMembers>(...)", objA3);
                InterfaceC0466p interfaceC0466p4 = interfaceC0466pArr2[12];
                Object objA4 = c0582w2.f7449h.a();
                AbstractC0219i.d("<get-inheritedNonStaticMembers>(...)", objA4);
                return P2.m.G0((Collection) objA3, (Collection) objA4);
            case 2:
                C0582w c0582w3 = this.f7435e;
                c0582w3.getClass();
                InterfaceC0466p[] interfaceC0466pArr3 = C0582w.f7444l;
                InterfaceC0466p interfaceC0466p5 = interfaceC0466pArr3[11];
                Object objA5 = c0582w3.f7448g.a();
                AbstractC0219i.d("<get-declaredStaticMembers>(...)", objA5);
                InterfaceC0466p interfaceC0466p6 = interfaceC0466pArr3[13];
                Object objA6 = c0582w3.f7450i.a();
                AbstractC0219i.d("<get-inheritedStaticMembers>(...)", objA6);
                return P2.m.G0((Collection) objA5, (Collection) objA6);
            case 3:
                return x0.d(this.f7435e.a());
            case 4:
                C0582w c0582w4 = this.f7435e;
                c0582w4.getClass();
                InterfaceC0466p[] interfaceC0466pArr4 = C0582w.f7444l;
                InterfaceC0466p interfaceC0466p7 = interfaceC0466pArr4[10];
                Object objA7 = c0582w4.f.a();
                AbstractC0219i.d("<get-declaredNonStaticMembers>(...)", objA7);
                InterfaceC0466p interfaceC0466p8 = interfaceC0466pArr4[11];
                Object objA8 = c0582w4.f7448g.a();
                AbstractC0219i.d("<get-declaredStaticMembers>(...)", objA8);
                return P2.m.G0((Collection) objA7, (Collection) objA8);
            case 5:
                X3.n nVarR = this.f7435e.a().R();
                AbstractC0219i.d("descriptor.unsubstitutedInnerClassesScope", nVarR);
                Collection collectionA = V1.a.A(nVarR, null, 3);
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionA) {
                    if (!Q3.f.n((InterfaceC0766j) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    InterfaceC0766j interfaceC0766j = (InterfaceC0766j) it.next();
                    InterfaceC0761e interfaceC0761e = interfaceC0766j instanceof InterfaceC0761e ? (InterfaceC0761e) interfaceC0766j : null;
                    Class clsJ = interfaceC0761e != null ? x0.j(interfaceC0761e) : null;
                    C0585z c0585z = clsJ != null ? new C0585z(clsJ) : null;
                    if (c0585z != null) {
                        arrayList2.add(c0585z);
                    }
                }
                return arrayList2;
            default:
                Collection<InterfaceC0761e> collectionZ0 = this.f7435e.a().z0();
                AbstractC0219i.d("descriptor.sealedSubclasses", collectionZ0);
                ArrayList arrayList3 = new ArrayList();
                for (InterfaceC0761e interfaceC0761e2 : collectionZ0) {
                    AbstractC0219i.c("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", interfaceC0761e2);
                    Class clsJ2 = x0.j(interfaceC0761e2);
                    C0585z c0585z2 = clsJ2 != null ? new C0585z(clsJ2) : null;
                    if (c0585z2 != null) {
                        arrayList3.add(c0585z2);
                    }
                }
                return arrayList3;
        }
    }
}
