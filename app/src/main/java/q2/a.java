package Q2;

import b3.AbstractC0219i;
import c3.InterfaceC0226a;
import com.idm.core.syncml.Constants;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements ListIterator, InterfaceC0226a {

    /* renamed from: d, reason: collision with root package name */
    public final b f2307d;

    /* renamed from: e, reason: collision with root package name */
    public int f2308e;
    public int f;

    public a(b bVar, int i5) {
        AbstractC0219i.e(Constants.SYNCML_PROPERTY_LIST, bVar);
        this.f2307d = bVar;
        this.f2308e = i5;
        this.f = -1;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i5 = this.f2308e;
        this.f2308e = i5 + 1;
        this.f2307d.add(i5, obj);
        this.f = -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f2308e < this.f2307d.f;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2308e > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i5 = this.f2308e;
        b bVar = this.f2307d;
        if (i5 >= bVar.f) {
            throw new NoSuchElementException();
        }
        this.f2308e = i5 + 1;
        this.f = i5;
        return bVar.f2309d[bVar.f2310e + i5];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2308e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i5 = this.f2308e;
        if (i5 <= 0) {
            throw new NoSuchElementException();
        }
        int i6 = i5 - 1;
        this.f2308e = i6;
        this.f = i6;
        b bVar = this.f2307d;
        return bVar.f2309d[bVar.f2310e + i6];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2308e - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i5 = this.f;
        if (i5 == -1) {
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
        this.f2307d.m(i5);
        this.f2308e = this.f;
        this.f = -1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i5 = this.f;
        if (i5 == -1) {
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
        this.f2307d.set(i5, obj);
    }
}
