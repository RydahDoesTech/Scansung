package o;

import a4.v;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: o.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0710h implements Set {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f8227e;

    public /* synthetic */ C0710h(v vVar, int i5) {
        this.f8226d = i5;
        this.f8227e = vVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f8226d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f8226d) {
            case 0:
                v vVar = this.f8227e;
                int iD = vVar.d();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    vVar.g(entry.getKey(), entry.getValue());
                }
                return iD != vVar.d();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f8226d) {
            case 0:
                this.f8227e.a();
                break;
            default:
                this.f8227e.a();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f8226d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                v vVar = this.f8227e;
                int iE = vVar.e(key);
                if (iE < 0) {
                    return false;
                }
                Object objB = vVar.b(iE, 1);
                Object value = entry.getValue();
                return objB == value || (objB != null && objB.equals(value));
            default:
                return this.f8227e.e(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f8226d) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Map mapC = this.f8227e.c();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!mapC.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f8226d) {
        }
        return v.k(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f8226d) {
            case 0:
                v vVar = this.f8227e;
                int iHashCode = 0;
                for (int iD = vVar.d() - 1; iD >= 0; iD--) {
                    Object objB = vVar.b(iD, 0);
                    Object objB2 = vVar.b(iD, 1);
                    iHashCode += (objB == null ? 0 : objB.hashCode()) ^ (objB2 == null ? 0 : objB2.hashCode());
                }
                return iHashCode;
            default:
                v vVar2 = this.f8227e;
                int iHashCode2 = 0;
                for (int iD2 = vVar2.d() - 1; iD2 >= 0; iD2--) {
                    Object objB3 = vVar2.b(iD2, 0);
                    iHashCode2 += objB3 == null ? 0 : objB3.hashCode();
                }
                return iHashCode2;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f8226d) {
            case 0:
                if (this.f8227e.d() == 0) {
                }
                break;
            default:
                if (this.f8227e.d() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f8226d) {
            case 0:
                return new C0711i(this.f8227e);
            default:
                return new C0709g(this.f8227e, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f8226d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                v vVar = this.f8227e;
                int iE = vVar.e(obj);
                if (iE < 0) {
                    return false;
                }
                vVar.h(iE);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f8226d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map mapC = this.f8227e.c();
                int size = mapC.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    mapC.remove(it.next());
                }
                return size != mapC.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f8226d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return v.l(this.f8227e.c(), collection);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f8226d) {
        }
        return this.f8227e.d();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f8226d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f8227e.m(objArr, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f8226d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                v vVar = this.f8227e;
                int iD = vVar.d();
                Object[] objArr = new Object[iD];
                for (int i5 = 0; i5 < iD; i5++) {
                    objArr[i5] = vVar.b(i5, 0);
                }
                return objArr;
        }
    }
}
