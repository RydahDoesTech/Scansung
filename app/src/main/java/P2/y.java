package P2;

import b3.AbstractC0219i;
import c3.InterfaceC0226a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class y implements Iterator, InterfaceC0226a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2168d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f2169e;
    public int f;

    public y(Iterator it) {
        AbstractC0219i.e("iterator", it);
        this.f2169e = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f2168d) {
            case 0:
                return this.f2169e.hasNext();
        }
        while (true) {
            int i5 = this.f;
            it = this.f2169e;
            if (i5 > 0 && it.hasNext()) {
                it.next();
                this.f--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f2168d) {
            case 0:
                int i5 = this.f;
                this.f = i5 + 1;
                if (i5 >= 0) {
                    return new x(i5, this.f2169e.next());
                }
                n.k0();
                throw null;
        }
        while (true) {
            int i6 = this.f;
            it = this.f2169e;
            if (i6 > 0 && it.hasNext()) {
                it.next();
                this.f--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2168d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public y(o4.b bVar) {
        this.f2169e = bVar.f8295a.iterator();
        this.f = bVar.f8296b;
    }
}
