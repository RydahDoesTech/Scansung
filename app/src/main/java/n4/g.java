package n4;

import P2.C0087a;
import b3.AbstractC0219i;
import b3.t;
import c3.InterfaceC0226a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g implements Iterator, InterfaceC0226a {

    /* renamed from: d, reason: collision with root package name */
    public final C0087a f8195d;

    public g(Object[] objArr) {
        AbstractC0219i.e("array", objArr);
        this.f8195d = t.b(objArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8195d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f8195d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
