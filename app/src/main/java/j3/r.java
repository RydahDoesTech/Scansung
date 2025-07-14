package j3;

import b3.AbstractC0219i;
import g3.InterfaceC0452b;
import java.util.List;
import k3.InterfaceC0673e;
import p3.InterfaceC0759c;

/* loaded from: classes.dex */
public abstract class r implements InterfaceC0452b, o0 {

    /* renamed from: d, reason: collision with root package name */
    public final q0 f7432d;

    public r() {
        s0.h(null, new C0575o(this, 1));
        this.f7432d = s0.h(null, new C0575o(this, 2));
        s0.h(null, new C0575o(this, 4));
        s0.h(null, new C0575o(this, 5));
        s0.h(null, new C0575o(this, 0));
    }

    public abstract InterfaceC0673e g();

    @Override // g3.InterfaceC0452b
    public final Object i(Object... objArr) throws V1.h {
        try {
            return g().i(objArr);
        } catch (IllegalAccessException e5) {
            throw new V1.h(e5);
        }
    }

    public abstract D j();

    public abstract InterfaceC0673e k();

    public abstract InterfaceC0759c l();

    public final List m() {
        Object objA = this.f7432d.a();
        AbstractC0219i.d("_parameters()", objA);
        return (List) objA;
    }

    public final boolean n() {
        return AbstractC0219i.a(getName(), "<init>") && j().a().isAnnotation();
    }

    public abstract boolean o();
}
