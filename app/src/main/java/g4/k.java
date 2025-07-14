package g4;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import java.util.Collection;
import java.util.Set;
import p3.InterfaceC0763g;
import x3.EnumC0915b;

/* loaded from: classes.dex */
public final class k extends e {
    @Override // g4.e, X3.n
    public final Set a() {
        throw new IllegalStateException();
    }

    @Override // g4.e, X3.n
    public final Set b() {
        throw new IllegalStateException();
    }

    @Override // g4.e, X3.n
    public final /* bridge */ /* synthetic */ Collection c(N3.f fVar, EnumC0915b enumC0915b) {
        c(fVar, enumC0915b);
        throw null;
    }

    @Override // g4.e, X3.p
    public final Collection d(X3.f fVar, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("kindFilter", fVar);
        AbstractC0219i.e("nameFilter", interfaceC0107b);
        throw new IllegalStateException(this.f6798b);
    }

    @Override // g4.e, X3.n
    public final /* bridge */ /* synthetic */ Collection e(N3.f fVar, EnumC0915b enumC0915b) {
        e(fVar, enumC0915b);
        throw null;
    }

    @Override // g4.e, X3.n
    public final Set f() {
        throw new IllegalStateException();
    }

    @Override // g4.e, X3.p
    public final InterfaceC0763g g(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        AbstractC0219i.e("location", enumC0915b);
        throw new IllegalStateException(this.f6798b + ", required name: " + fVar);
    }

    @Override // g4.e
    /* renamed from: h */
    public final Set e(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        throw new IllegalStateException(this.f6798b + ", required name: " + fVar);
    }

    @Override // g4.e
    /* renamed from: i */
    public final Set c(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        throw new IllegalStateException(this.f6798b + ", required name: " + fVar);
    }

    @Override // g4.e
    public final String toString() {
        return "ThrowingScope{" + this.f6798b + '}';
    }
}
