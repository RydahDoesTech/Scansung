package o3;

import P2.w;
import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p3.InterfaceC0742D;
import p3.InterfaceC0746H;
import s3.C0826B;
import u3.C0880b;

/* renamed from: o3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0731n implements InterfaceC0746H {

    /* renamed from: a, reason: collision with root package name */
    public final d4.l f8285a;

    /* renamed from: b, reason: collision with root package name */
    public final C0826B f8286b;

    /* renamed from: c, reason: collision with root package name */
    public a4.i f8287c;

    /* renamed from: d, reason: collision with root package name */
    public final d4.j f8288d;

    public C0731n(d4.l lVar, C0880b c0880b, C0826B c0826b) {
        this.f8285a = lVar;
        this.f8286b = c0826b;
        this.f8288d = lVar.c(new B3.d(12, this));
    }

    @Override // p3.InterfaceC0743E
    public final List a(N3.c cVar) {
        AbstractC0219i.e("fqName", cVar);
        return P2.n.i0(this.f8288d.d(cVar));
    }

    @Override // p3.InterfaceC0746H
    public final boolean b(N3.c cVar) {
        AbstractC0219i.e("fqName", cVar);
        d4.j jVar = this.f8288d;
        Object obj = jVar.f6413e.get(cVar);
        return ((obj == null || obj == d4.k.f6415e) ? d(cVar) : (InterfaceC0742D) jVar.d(cVar)) == null;
    }

    @Override // p3.InterfaceC0746H
    public final void c(N3.c cVar, ArrayList arrayList) {
        AbstractC0219i.e("fqName", cVar);
        n4.k.a(arrayList, this.f8288d.d(cVar));
    }

    public final b4.c d(N3.c cVar) throws IOException {
        InputStream inputStreamE;
        AbstractC0219i.e("fqName", cVar);
        if (cVar.h(m3.n.f8149i)) {
            b4.a.f5101m.getClass();
            inputStreamE = b4.d.e(b4.a.a(cVar));
        } else {
            inputStreamE = null;
        }
        if (inputStreamE != null) {
            return V1.a.q(cVar, this.f8285a, this.f8286b, inputStreamE);
        }
        return null;
    }

    @Override // p3.InterfaceC0743E
    public final Collection t(N3.c cVar, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("fqName", cVar);
        AbstractC0219i.e("nameFilter", interfaceC0107b);
        return w.f2165d;
    }
}
