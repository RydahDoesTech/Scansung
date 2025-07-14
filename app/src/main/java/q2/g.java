package Q2;

import b3.AbstractC0219i;
import c3.InterfaceC0226a;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g extends AbstractCollection implements Collection, InterfaceC0226a {

    /* renamed from: d, reason: collision with root package name */
    public final e f2331d;

    public g(e eVar) {
        AbstractC0219i.e("backing", eVar);
        this.f2331d = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        AbstractC0219i.e("elements", collection);
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f2331d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f2331d.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f2331d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        e eVar = this.f2331d;
        eVar.getClass();
        return new c(eVar, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f2331d;
        eVar.b();
        int i5 = eVar.i(obj);
        if (i5 < 0) {
            return false;
        }
        eVar.l(i5);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        AbstractC0219i.e("elements", collection);
        this.f2331d.b();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        AbstractC0219i.e("elements", collection);
        this.f2331d.b();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f2331d.f2325k;
    }
}
