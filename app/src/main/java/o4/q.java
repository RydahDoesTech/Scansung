package o4;

import c3.InterfaceC0226a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q implements Iterator, InterfaceC0226a {

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f8321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f8322e;

    public q(r rVar) {
        this.f8322e = rVar;
        this.f8321d = rVar.f8323a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8321d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f8322e.f8324b.d(this.f8321d.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
