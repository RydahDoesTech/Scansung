package n3;

import P2.m;
import P2.w;
import b3.AbstractC0219i;
import d4.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p3.InterfaceC0761e;
import p4.h;
import r3.InterfaceC0817c;
import s3.C0826B;
import s3.y;

/* renamed from: n3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0696a implements InterfaceC0817c {

    /* renamed from: a, reason: collision with root package name */
    public final l f8168a;

    /* renamed from: b, reason: collision with root package name */
    public final C0826B f8169b;

    public C0696a(l lVar, C0826B c0826b) {
        AbstractC0219i.e("module", c0826b);
        this.f8168a = lVar;
        this.f8169b = c0826b;
    }

    @Override // r3.InterfaceC0817c
    public final boolean a(N3.c cVar, N3.f fVar) {
        AbstractC0219i.e("packageFqName", cVar);
        AbstractC0219i.e("name", fVar);
        String strB = fVar.b();
        AbstractC0219i.d("name.asString()", strB);
        if (h.o0(strB, "Function") || h.o0(strB, "KFunction") || h.o0(strB, "SuspendFunction") || h.o0(strB, "KSuspendFunction")) {
            EnumC0700e.f.getClass();
            if (O1.e.i(strB, cVar) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // r3.InterfaceC0817c
    public final InterfaceC0761e b(N3.b bVar) {
        AbstractC0219i.e("classId", bVar);
        if (bVar.f1832c || !bVar.f1831b.e().d()) {
            return null;
        }
        String strB = bVar.h().b();
        if (!h.g0(strB, "Function")) {
            return null;
        }
        N3.c cVarG = bVar.g();
        AbstractC0219i.d("classId.packageFqName", cVarG);
        EnumC0700e.f.getClass();
        C0699d c0699dI = O1.e.i(strB, cVarG);
        if (c0699dI == null) {
            return null;
        }
        List list = (List) V1.a.Q(((y) this.f8169b.D(cVarG)).f8901h, y.f8899k[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof b4.c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (m.w0(arrayList2) != null) {
            throw new ClassCastException();
        }
        return new C0698c(this.f8168a, (b4.c) m.u0(arrayList), c0699dI.f8179a, c0699dI.f8180b);
    }

    @Override // r3.InterfaceC0817c
    public final Collection c(N3.c cVar) {
        AbstractC0219i.e("packageFqName", cVar);
        return w.f2165d;
    }
}
