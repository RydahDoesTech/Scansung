package O3;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class J implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public ListIterator f2040d;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f2040d.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2040d.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f2040d.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2040d.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f2040d.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2040d.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
