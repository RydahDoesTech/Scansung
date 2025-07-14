package q3;

import P2.t;
import b3.AbstractC0219i;
import java.util.Iterator;

/* renamed from: q3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0796f implements InterfaceC0798h {
    @Override // q3.InterfaceC0798h
    public final boolean e(N3.c cVar) {
        return V1.a.T(this, cVar);
    }

    @Override // q3.InterfaceC0798h
    public final InterfaceC0792b h(N3.c cVar) {
        AbstractC0219i.e("fqName", cVar);
        return null;
    }

    @Override // q3.InterfaceC0798h
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return t.f2162d;
    }

    public final String toString() {
        return "EMPTY";
    }
}
