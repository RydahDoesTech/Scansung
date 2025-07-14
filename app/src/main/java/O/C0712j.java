package o;

import a4.v;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: o.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0712j implements Collection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f8231d;

    public C0712j(v vVar) {
        this.f8231d = vVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f8231d.a();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8231d.f(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f8231d.d() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0709g(this.f8231d, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        v vVar = this.f8231d;
        int iF = vVar.f(obj);
        if (iF < 0) {
            return false;
        }
        vVar.h(iF);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        v vVar = this.f8231d;
        int iD = vVar.d();
        int i5 = 0;
        boolean z4 = false;
        while (i5 < iD) {
            if (collection.contains(vVar.b(i5, 1))) {
                vVar.h(i5);
                i5--;
                iD--;
                z4 = true;
            }
            i5++;
        }
        return z4;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        v vVar = this.f8231d;
        int iD = vVar.d();
        int i5 = 0;
        boolean z4 = false;
        while (i5 < iD) {
            if (!collection.contains(vVar.b(i5, 1))) {
                vVar.h(i5);
                i5--;
                iD--;
                z4 = true;
            }
            i5++;
        }
        return z4;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f8231d.d();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        v vVar = this.f8231d;
        int iD = vVar.d();
        Object[] objArr = new Object[iD];
        for (int i5 = 0; i5 < iD; i5++) {
            objArr[i5] = vVar.b(i5, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f8231d.m(objArr, 1);
    }
}
