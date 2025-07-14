package q3;

import C3.C0012d;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import g3.y;
import java.util.Map;
import m3.AbstractC0695h;
import p3.InterfaceC0752N;

/* renamed from: q3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0800j implements InterfaceC0792b {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0695h f8484a;

    /* renamed from: b, reason: collision with root package name */
    public final N3.c f8485b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f8486c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8487d;

    public C0800j(AbstractC0695h abstractC0695h, N3.c cVar, Map map) {
        AbstractC0219i.e("fqName", cVar);
        this.f8484a = abstractC0695h;
        this.f8485b = cVar;
        this.f8486c = map;
        this.f8487d = y.M(2, new C0012d(28, this));
    }

    @Override // q3.InterfaceC0792b
    public final N3.c a() {
        return this.f8485b;
    }

    @Override // q3.InterfaceC0792b
    public final Map b() {
        return this.f8486c;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [O2.c, java.lang.Object] */
    @Override // q3.InterfaceC0792b
    public final AbstractC0438v d() {
        Object value = this.f8487d.getValue();
        AbstractC0219i.d("<get-type>(...)", value);
        return (AbstractC0438v) value;
    }

    @Override // q3.InterfaceC0792b
    public final InterfaceC0752N n() {
        return InterfaceC0752N.f8400b;
    }
}
