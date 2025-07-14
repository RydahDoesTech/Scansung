package k4;

import b3.AbstractC0219i;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import e4.C0421d;
import e4.E;
import e4.G;
import e4.X;
import java.util.List;
import p3.AbstractC0779w;
import p3.InterfaceC0755Q;
import p3.InterfaceC0761e;
import p3.InterfaceC0781y;
import s3.C0843T;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: b, reason: collision with root package name */
    public static final l f7961b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f7962c = new l(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7963a;

    public /* synthetic */ l(int i5) {
        this.f7963a = i5;
    }

    @Override // k4.e
    public final boolean a(A3.g gVar) {
        AbstractC0442z abstractC0442zQ;
        switch (this.f7963a) {
            case 0:
                C0843T c0843t = (C0843T) gVar.v0().get(1);
                Y0.h hVar = m3.l.f8085d;
                AbstractC0219i.d("secondParameter", c0843t);
                InterfaceC0781y interfaceC0781yJ = U3.f.j(c0843t);
                hVar.getClass();
                InterfaceC0761e interfaceC0761eD = AbstractC0779w.d(interfaceC0781yJ, m3.m.f8105Q);
                if (interfaceC0761eD == null) {
                    abstractC0442zQ = null;
                } else {
                    G.f6646e.getClass();
                    G g5 = G.f;
                    List listK = interfaceC0761eD.I().k();
                    AbstractC0219i.d("kPropertyClass.typeConstructor.parameters", listK);
                    Object objJ0 = P2.m.J0(listK);
                    AbstractC0219i.d("kPropertyClass.typeConstructor.parameters.single()", objJ0);
                    abstractC0442zQ = C0421d.q(g5, interfaceC0761eD, g3.y.N(new E((InterfaceC0755Q) objJ0)));
                }
                if (abstractC0442zQ == null) {
                    return false;
                }
                AbstractC0438v abstractC0438vD = c0843t.d();
                AbstractC0219i.d("secondParameter.type", abstractC0438vD);
                return f4.d.f6737a.b(abstractC0442zQ, X.g(abstractC0438vD, false));
            default:
                List<C0843T> listV0 = gVar.v0();
                AbstractC0219i.d("functionDescriptor.valueParameters", listV0);
                if (listV0.isEmpty()) {
                    return true;
                }
                for (C0843T c0843t2 : listV0) {
                    AbstractC0219i.d("it", c0843t2);
                    if (U3.f.a(c0843t2) || c0843t2.f8804m != null) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // k4.e
    public final String b() {
        switch (this.f7963a) {
            case 0:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }

    @Override // k4.e
    public final String c(A3.g gVar) {
        switch (this.f7963a) {
        }
        return V1.a.V(this, gVar);
    }
}
