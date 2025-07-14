package Q2;

import b3.AbstractC0219i;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends P2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2329d;

    /* renamed from: e, reason: collision with root package name */
    public final e f2330e;

    public f(e eVar, int i5) {
        this.f2329d = i5;
        switch (i5) {
            case 1:
                AbstractC0219i.e("backing", eVar);
                this.f2330e = eVar;
                break;
            default:
                AbstractC0219i.e("backing", eVar);
                this.f2330e = eVar;
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f2329d) {
            case 0:
                AbstractC0219i.e("element", (Map.Entry) obj);
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f2329d) {
            case 0:
                AbstractC0219i.e("elements", collection);
                throw new UnsupportedOperationException();
            default:
                AbstractC0219i.e("elements", collection);
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f2329d) {
            case 0:
                this.f2330e.clear();
                break;
            default:
                this.f2330e.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f2329d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                AbstractC0219i.e("element", entry);
                return this.f2330e.d(entry);
            default:
                return this.f2330e.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f2329d) {
            case 0:
                AbstractC0219i.e("elements", collection);
                return this.f2330e.c(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f2329d) {
        }
        return this.f2330e.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f2329d) {
            case 0:
                e eVar = this.f2330e;
                eVar.getClass();
                return new c(eVar, 0);
            default:
                e eVar2 = this.f2330e;
                eVar2.getClass();
                return new c(eVar2, 1);
        }
    }

    @Override // P2.f
    public final int l() {
        switch (this.f2329d) {
        }
        return this.f2330e.f2325k;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f2329d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                AbstractC0219i.e("element", entry);
                e eVar = this.f2330e;
                eVar.getClass();
                eVar.b();
                int iG = eVar.g(entry.getKey());
                if (iG < 0) {
                    return false;
                }
                Object[] objArr = eVar.f2320e;
                AbstractC0219i.b(objArr);
                if (!AbstractC0219i.a(objArr[iG], entry.getValue())) {
                    return false;
                }
                eVar.l(iG);
                return true;
            default:
                e eVar2 = this.f2330e;
                eVar2.b();
                int iG2 = eVar2.g(obj);
                if (iG2 < 0) {
                    iG2 = -1;
                } else {
                    eVar2.l(iG2);
                }
                return iG2 >= 0;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f2329d) {
            case 0:
                AbstractC0219i.e("elements", collection);
                this.f2330e.b();
                break;
            default:
                AbstractC0219i.e("elements", collection);
                this.f2330e.b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f2329d) {
            case 0:
                AbstractC0219i.e("elements", collection);
                this.f2330e.b();
                break;
            default:
                AbstractC0219i.e("elements", collection);
                this.f2330e.b();
                break;
        }
        return super.retainAll(collection);
    }
}
