package C3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import java.util.Collection;
import java.util.Set;
import p3.InterfaceC0761e;

/* loaded from: classes.dex */
public final class G extends n4.k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f370b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f371c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b3.k f372d;

    /* JADX WARN: Multi-variable type inference failed */
    public G(k kVar, Set set, InterfaceC0107b interfaceC0107b) {
        this.f370b = kVar;
        this.f371c = set;
        this.f372d = (b3.k) interfaceC0107b;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [a3.b, b3.k] */
    @Override // n4.k
    public final boolean c(Object obj) {
        InterfaceC0761e interfaceC0761e = (InterfaceC0761e) obj;
        AbstractC0219i.e("current", interfaceC0761e);
        if (interfaceC0761e == this.f370b) {
            return true;
        }
        X3.n nVarW = interfaceC0761e.W();
        AbstractC0219i.d("current.staticScope", nVarW);
        if (!(nVarW instanceof I)) {
            return true;
        }
        this.f371c.addAll((Collection) this.f372d.d(nVarW));
        return false;
    }

    @Override // n4.k
    public final /* bridge */ /* synthetic */ Object i() {
        return O2.l.f2016a;
    }
}
