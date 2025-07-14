package U3;

import P2.u;
import java.util.Collection;
import p3.InterfaceC0759c;

/* loaded from: classes.dex */
public final class b implements n4.a {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2564d;

    public b(boolean z4) {
        this.f2564d = z4;
    }

    @Override // n4.a
    public final Iterable p(Object obj) {
        InterfaceC0759c interfaceC0759cA = (InterfaceC0759c) obj;
        if (this.f2564d) {
            interfaceC0759cA = interfaceC0759cA != null ? interfaceC0759cA.a() : null;
        }
        Collection collectionP = interfaceC0759cA != null ? interfaceC0759cA.p() : null;
        return collectionP == null ? u.f2163d : collectionP;
    }
}
