package y3;

import b3.AbstractC0219i;
import p3.InterfaceC0750L;
import p3.InterfaceC0758b;
import p3.InterfaceC0761e;

/* loaded from: classes.dex */
public final class l implements Q3.i {
    @Override // Q3.i
    public Q3.g a() {
        return Q3.g.f;
    }

    @Override // Q3.i
    public Q3.h b(InterfaceC0758b interfaceC0758b, InterfaceC0758b interfaceC0758b2, InterfaceC0761e interfaceC0761e) {
        AbstractC0219i.e("superDescriptor", interfaceC0758b);
        AbstractC0219i.e("subDescriptor", interfaceC0758b2);
        boolean z4 = interfaceC0758b2 instanceof InterfaceC0750L;
        Q3.h hVar = Q3.h.f;
        if (!z4 || !(interfaceC0758b instanceof InterfaceC0750L)) {
            return hVar;
        }
        InterfaceC0750L interfaceC0750L = (InterfaceC0750L) interfaceC0758b2;
        InterfaceC0750L interfaceC0750L2 = (InterfaceC0750L) interfaceC0758b;
        return !AbstractC0219i.a(interfaceC0750L.getName(), interfaceC0750L2.getName()) ? hVar : (g3.y.K(interfaceC0750L) && g3.y.K(interfaceC0750L2)) ? Q3.h.f2345d : (g3.y.K(interfaceC0750L) || g3.y.K(interfaceC0750L2)) ? Q3.h.f2346e : hVar;
    }
}
