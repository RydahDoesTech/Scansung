package k4;

import c3.InterfaceC0226a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class p implements Iterator, InterfaceC0226a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7970d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7971e = true;
    public final Object f;

    public /* synthetic */ p(int i5, Object obj) {
        this.f7970d = i5;
        this.f = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f7970d) {
        }
        return this.f7971e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f7970d) {
            case 0:
                if (!this.f7971e) {
                    throw new NoSuchElementException();
                }
                this.f7971e = false;
                return ((q) this.f).f7972d;
            default:
                if (!this.f7971e) {
                    throw new NoSuchElementException();
                }
                this.f7971e = false;
                return this.f;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f7970d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException();
        }
    }
}
