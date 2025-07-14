package s3;

import a3.InterfaceC0106a;
import e4.C0421d;
import e4.X;
import java.util.List;

/* renamed from: s3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0845a implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0846b f8807e;

    public /* synthetic */ C0845a(AbstractC0846b abstractC0846b, int i5) {
        this.f8806d = i5;
        this.f8807e = abstractC0846b;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        AbstractC0846b abstractC0846b = this.f8807e;
        switch (this.f8806d) {
            case 0:
                X3.n nVarD0 = abstractC0846b.d0();
                Q3.m mVar = new Q3.m(2, this);
                g4.g gVar = X.f6670a;
                if (g4.j.f(abstractC0846b)) {
                    return g4.j.c(g4.i.n, abstractC0846b.toString());
                }
                e4.J jI = abstractC0846b.I();
                if (jI == null) {
                    X.a(12);
                    throw null;
                }
                if (nVarD0 == null) {
                    X.a(13);
                    throw null;
                }
                List listD = X.d(jI.k());
                e4.G.f6646e.getClass();
                return C0421d.t(e4.G.f, jI, listD, false, nVarD0, mVar);
            case 1:
                return new X3.i(abstractC0846b.d0());
            default:
                return new C0867w(abstractC0846b);
        }
    }
}
