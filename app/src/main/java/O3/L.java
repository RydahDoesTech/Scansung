package O3;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class L extends AbstractList implements RandomAccess, u {

    /* renamed from: d, reason: collision with root package name */
    public final t f2042d;

    public L(t tVar) {
        this.f2042d = tVar;
    }

    @Override // O3.u
    public final L b() {
        return this;
    }

    @Override // O3.u
    public final void c(w wVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        return (String) this.f2042d.get(i5);
    }

    @Override // O3.u
    public final List i() {
        return Collections.unmodifiableList(this.f2042d.f2094d);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        K k5 = new K();
        k5.f2041d = this.f2042d.iterator();
        return k5;
    }

    @Override // O3.u
    public final AbstractC0073e j(int i5) {
        return this.f2042d.j(i5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i5) {
        J j5 = new J();
        j5.f2040d = this.f2042d.listIterator(i5);
        return j5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2042d.size();
    }
}
