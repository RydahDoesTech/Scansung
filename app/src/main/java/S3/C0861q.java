package s3;

import a3.InterfaceC0107b;
import x3.EnumC0915b;

/* renamed from: s3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0861q implements InterfaceC0107b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0862r f8841e;

    public /* synthetic */ C0861q(C0862r c0862r, int i5) {
        this.f8840d = i5;
        this.f8841e = c0862r;
    }

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        switch (this.f8840d) {
            case 0:
                N3.f fVar = (N3.f) obj;
                C0862r c0862r = this.f8841e;
                if (fVar != null) {
                    return c0862r.j(fVar, c0862r.i().e(fVar, EnumC0915b.f9319i));
                }
                c0862r.getClass();
                C0862r.h(8);
                throw null;
            default:
                N3.f fVar2 = (N3.f) obj;
                C0862r c0862r2 = this.f8841e;
                if (fVar2 != null) {
                    return c0862r2.j(fVar2, c0862r2.i().c(fVar2, EnumC0915b.f9319i));
                }
                c0862r2.getClass();
                C0862r.h(4);
                throw null;
        }
    }
}
