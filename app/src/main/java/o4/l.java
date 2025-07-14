package o4;

import b3.AbstractC0219i;
import c3.InterfaceC0226a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class l implements Iterator, S2.a, InterfaceC0226a {

    /* renamed from: d, reason: collision with root package name */
    public int f8314d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8315e;
    public Iterator f;

    /* renamed from: g, reason: collision with root package name */
    public S2.a f8316g;

    @Override // S2.a
    public final S2.b a() {
        return S2.b.f2526d;
    }

    @Override // S2.a
    public final void b(Object obj) throws Throwable {
        J2.b.a0(obj);
        this.f8314d = 4;
    }

    public final RuntimeException c() {
        int i5 = this.f8314d;
        if (i5 == 4) {
            return new NoSuchElementException();
        }
        if (i5 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f8314d);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i5 = this.f8314d;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2 || i5 == 3) {
                        return true;
                    }
                    if (i5 == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator it = this.f;
                AbstractC0219i.b(it);
                if (it.hasNext()) {
                    this.f8314d = 2;
                    return true;
                }
                this.f = null;
            }
            this.f8314d = 5;
            S2.a aVar = this.f8316g;
            AbstractC0219i.b(aVar);
            this.f8316g = null;
            aVar.b(O2.l.f2016a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i5 = this.f8314d;
        if (i5 == 0 || i5 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i5 == 2) {
            this.f8314d = 1;
            Iterator it = this.f;
            AbstractC0219i.b(it);
            return it.next();
        }
        if (i5 != 3) {
            throw c();
        }
        this.f8314d = 0;
        Object obj = this.f8315e;
        this.f8315e = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
