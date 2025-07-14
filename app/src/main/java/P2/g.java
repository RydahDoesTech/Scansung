package P2;

import b3.AbstractC0219i;
import c3.InterfaceC0226a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g implements Collection, InterfaceC0226a {

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f2152d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2153e;

    public g(Object[] objArr, boolean z4) {
        AbstractC0219i.e("values", objArr);
        this.f2152d = objArr;
        this.f2153e = z4;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return i.k0(obj, this.f2152d);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        AbstractC0219i.e("elements", collection);
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!i.k0(it.next(), this.f2152d)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f2152d.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return b3.t.b(this.f2152d);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f2152d.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f2152d;
        AbstractC0219i.e("<this>", objArr);
        if (this.f2153e && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        AbstractC0219i.d("copyOf(this, this.size, Array<Any?>::class.java)", objArrCopyOf);
        return objArrCopyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC0219i.e("array", objArr);
        return AbstractC0219i.i(this, objArr);
    }
}
