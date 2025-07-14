package o3;

import b3.AbstractC0219i;
import g3.InterfaceC0466p;
import m3.AbstractC0695h;
import p3.InterfaceC0759c;
import p3.InterfaceC0761e;

/* renamed from: o3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0722e implements n4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final C0722e f8260d = new C0722e();

    public static InterfaceC0761e a(InterfaceC0761e interfaceC0761e) {
        N3.e eVarG = Q3.f.g(interfaceC0761e);
        String str = C0721d.f8248a;
        N3.c cVar = (N3.c) C0721d.f8257k.get(eVarG);
        if (cVar != null) {
            return U3.f.e(interfaceC0761e).i(cVar);
        }
        throw new IllegalArgumentException("Given class " + interfaceC0761e + " is not a read-only collection");
    }

    public static InterfaceC0761e b(N3.c cVar, AbstractC0695h abstractC0695h) {
        AbstractC0219i.e("builtIns", abstractC0695h);
        String str = C0721d.f8248a;
        N3.b bVar = (N3.b) C0721d.f8254h.get(cVar.i());
        if (bVar != null) {
            return abstractC0695h.i(bVar.b());
        }
        return null;
    }

    @Override // n4.a
    public Iterable p(Object obj) {
        InterfaceC0466p[] interfaceC0466pArr = C0730m.f8279g;
        return ((InterfaceC0759c) obj).a().p();
    }
}
