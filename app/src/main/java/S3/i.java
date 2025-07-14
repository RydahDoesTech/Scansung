package S3;

import b3.AbstractC0219i;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import p3.AbstractC0779w;
import p3.InterfaceC0761e;
import p3.InterfaceC0781y;

/* loaded from: classes.dex */
public final class i extends g {

    /* renamed from: b, reason: collision with root package name */
    public final N3.b f2533b;

    /* renamed from: c, reason: collision with root package name */
    public final N3.f f2534c;

    public i(N3.b bVar, N3.f fVar) {
        super(new O2.f(bVar, fVar));
        this.f2533b = bVar;
        this.f2534c = fVar;
    }

    @Override // S3.g
    public final AbstractC0438v a(InterfaceC0781y interfaceC0781y) {
        AbstractC0219i.e("module", interfaceC0781y);
        N3.b bVar = this.f2533b;
        InterfaceC0761e interfaceC0761eD = AbstractC0779w.d(interfaceC0781y, bVar);
        AbstractC0442z abstractC0442zQ = null;
        if (interfaceC0761eD != null) {
            if (!Q3.f.o(interfaceC0761eD, 3)) {
                interfaceC0761eD = null;
            }
            if (interfaceC0761eD != null) {
                abstractC0442zQ = interfaceC0761eD.q();
            }
        }
        if (abstractC0442zQ != null) {
            return abstractC0442zQ;
        }
        g4.i iVar = g4.i.f6811D;
        String string = bVar.toString();
        AbstractC0219i.d("enumClassId.toString()", string);
        String str = this.f2534c.f1842d;
        AbstractC0219i.d("enumEntryName.toString()", str);
        return g4.j.c(iVar, string, str);
    }

    @Override // S3.g
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2533b.i());
        sb.append('.');
        sb.append(this.f2534c);
        return sb.toString();
    }
}
