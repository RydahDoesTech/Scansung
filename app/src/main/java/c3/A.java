package C3;

import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import java.util.LinkedHashSet;
import java.util.List;
import x3.EnumC0915b;

/* loaded from: classes.dex */
public final class A extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D f350e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(D d5, int i5) {
        super(0);
        this.f349d = i5;
        this.f350e = d5;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        switch (this.f349d) {
            case 0:
                X3.f fVar = X3.f.f2770m;
                X3.n.f2792a.getClass();
                X3.k kVar = X3.k.f2786e;
                D d5 = this.f350e;
                d5.getClass();
                AbstractC0219i.e("kindFilter", fVar);
                EnumC0915b enumC0915b = EnumC0915b.f9317g;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (fVar.a(X3.f.f2769l)) {
                    for (N3.f fVar2 : d5.h(fVar, kVar)) {
                        kVar.d(fVar2);
                        n4.k.a(linkedHashSet, d5.g(fVar2, enumC0915b));
                    }
                }
                boolean zA = fVar.a(X3.f.f2766i);
                List list = fVar.f2776a;
                if (zA && !list.contains(X3.b.f2756a)) {
                    for (N3.f fVar3 : d5.i(fVar, kVar)) {
                        kVar.d(fVar3);
                        linkedHashSet.addAll(d5.e(fVar3, enumC0915b));
                    }
                }
                if (fVar.a(X3.f.f2767j) && !list.contains(X3.b.f2756a)) {
                    for (N3.f fVar4 : d5.o(fVar)) {
                        kVar.d(fVar4);
                        linkedHashSet.addAll(d5.c(fVar4, enumC0915b));
                    }
                }
                return P2.m.O0(linkedHashSet);
            case 1:
                return this.f350e.h(X3.f.f2771o, null);
            case 2:
                return this.f350e.k();
            case 3:
                return this.f350e.i(X3.f.f2772p, null);
            case 4:
                return this.f350e.o(X3.f.f2773q);
            default:
                ((B3.b) this.f350e.f357b.f255e).f229h.getClass();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(D d5, v3.u uVar, A3.h hVar) {
        super(0);
        this.f349d = 5;
        this.f350e = d5;
    }
}
