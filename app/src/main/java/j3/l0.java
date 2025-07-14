package j3;

import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import java.lang.reflect.Type;
import v3.AbstractC0897d;

/* loaded from: classes.dex */
public final class l0 extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0 f7409e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i5, m0 m0Var) {
        super(0);
        this.f7408d = i5;
        this.f7409e = m0Var;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        switch (this.f7408d) {
            case 0:
                q0 q0Var = this.f7409e.f7417b;
                Type type = q0Var != null ? (Type) q0Var.a() : null;
                AbstractC0219i.b(type);
                return AbstractC0897d.c(type);
            default:
                m0 m0Var = this.f7409e;
                return m0Var.a(m0Var.f7416a);
        }
    }
}
