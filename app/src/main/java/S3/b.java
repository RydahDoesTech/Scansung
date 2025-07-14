package S3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import java.util.List;
import m3.AbstractC0695h;
import p3.InterfaceC0763g;
import p3.InterfaceC0781y;

/* loaded from: classes.dex */
public class b extends g {

    /* renamed from: b, reason: collision with root package name */
    public final b3.k f2527b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(List list, InterfaceC0107b interfaceC0107b) {
        super(list);
        this.f2527b = (b3.k) interfaceC0107b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [a3.b, b3.k] */
    @Override // S3.g
    public final AbstractC0438v a(InterfaceC0781y interfaceC0781y) {
        InterfaceC0763g interfaceC0763gI;
        AbstractC0219i.e("module", interfaceC0781y);
        AbstractC0438v abstractC0438v = (AbstractC0438v) this.f2527b.d(interfaceC0781y);
        if (!AbstractC0695h.x(abstractC0438v) && (((interfaceC0763gI = abstractC0438v.I0().i()) == null || AbstractC0695h.q(interfaceC0763gI) == null) && !AbstractC0695h.A(abstractC0438v, m3.m.f8110V.i()) && !AbstractC0695h.A(abstractC0438v, m3.m.f8111W.i()) && !AbstractC0695h.A(abstractC0438v, m3.m.f8112X.i()))) {
            AbstractC0695h.A(abstractC0438v, m3.m.f8113Y.i());
        }
        return abstractC0438v;
    }
}
