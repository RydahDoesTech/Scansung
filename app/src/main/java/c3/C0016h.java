package C3;

import a3.InterfaceC0106a;
import java.util.ArrayList;
import java.util.Iterator;
import p3.AbstractC0779w;
import p3.InterfaceC0755Q;
import v3.C0891C;

/* renamed from: C3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0016h extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f398e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0016h(k kVar, int i5) {
        super(0);
        this.f397d = i5;
        this.f398e = kVar;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        switch (this.f397d) {
            case 0:
                return AbstractC0779w.c(this.f398e);
            case 1:
                k kVar = this.f398e;
                ArrayList arrayListU = kVar.f403k.u();
                ArrayList arrayList = new ArrayList(P2.o.l0(arrayListU));
                Iterator it = arrayListU.iterator();
                while (it.hasNext()) {
                    C0891C c0891c = (C0891C) it.next();
                    InterfaceC0755Q interfaceC0755QA = ((B3.i) kVar.f405m.f).a(c0891c);
                    if (interfaceC0755QA == null) {
                        throw new AssertionError("Parameter " + c0891c + " surely belongs to class " + kVar.f403k + ", so it must be resolved");
                    }
                    arrayList.add(interfaceC0755QA);
                }
                return arrayList;
            default:
                k kVar2 = this.f398e;
                if (U3.f.f(kVar2) == null) {
                    return null;
                }
                ((B3.b) kVar2.f402j.f255e).f243w.getClass();
                return null;
        }
    }
}
