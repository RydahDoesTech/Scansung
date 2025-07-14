package F3;

import e4.AbstractC0438v;
import java.util.Map;
import p3.InterfaceC0752N;
import p3.InterfaceC0761e;
import q3.InterfaceC0792b;

/* loaded from: classes.dex */
public final class b implements InterfaceC0792b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f631a = new b();

    @Override // q3.InterfaceC0792b
    public final N3.c a() {
        InterfaceC0761e interfaceC0761eD = U3.f.d(this);
        if (interfaceC0761eD == null) {
            return null;
        }
        if (g4.j.f(interfaceC0761eD)) {
            interfaceC0761eD = null;
        }
        if (interfaceC0761eD != null) {
            return U3.f.c(interfaceC0761eD);
        }
        return null;
    }

    @Override // q3.InterfaceC0792b
    public final Map b() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // q3.InterfaceC0792b
    public final AbstractC0438v d() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // q3.InterfaceC0792b
    public final InterfaceC0752N n() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
