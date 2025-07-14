package j3;

import a3.InterfaceC0106a;

/* loaded from: classes.dex */
public final class r0 extends s0 {

    /* renamed from: e, reason: collision with root package name */
    public final b3.k f7433e;
    public volatile Object f = null;

    /* JADX WARN: Multi-variable type inference failed */
    public r0(InterfaceC0106a interfaceC0106a) {
        this.f7433e = (b3.k) interfaceC0106a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [a3.a, b3.k] */
    public final Object a() {
        Object obj = this.f;
        Object obj2 = s0.f7436d;
        if (obj != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object objA = this.f7433e.a();
        if (objA != null) {
            obj2 = objA;
        }
        this.f = obj2;
        return objA;
    }
}
