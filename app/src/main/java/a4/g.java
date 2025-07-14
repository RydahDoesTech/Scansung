package a4;

import b3.AbstractC0219i;
import java.util.Set;
import p3.InterfaceC0761e;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final Set f3033c = V1.a.l0(N3.b.j(m3.m.f8119c.g()));

    /* renamed from: a, reason: collision with root package name */
    public final i f3034a;

    /* renamed from: b, reason: collision with root package name */
    public final d4.j f3035b;

    public g(i iVar) {
        AbstractC0219i.e("components", iVar);
        this.f3034a = iVar;
        this.f3035b = ((d4.l) iVar.f3037a).c(new B3.d(13, this));
    }

    public final InterfaceC0761e a(N3.b bVar, d dVar) {
        AbstractC0219i.e("classId", bVar);
        return (InterfaceC0761e) this.f3035b.d(new f(bVar, dVar));
    }
}
