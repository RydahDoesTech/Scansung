package Q2;

import P2.i;
import Y0.j;
import b3.AbstractC0219i;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class b extends P2.e implements RandomAccess, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f2309d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2310e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2311g;

    /* renamed from: h, reason: collision with root package name */
    public final b f2312h;

    /* renamed from: i, reason: collision with root package name */
    public final b f2313i;

    public b(Object[] objArr, int i5, int i6, boolean z4, b bVar, b bVar2) {
        this.f2309d = objArr;
        this.f2310e = i5;
        this.f = i6;
        this.f2311g = z4;
        this.f2312h = bVar;
        this.f2313i = bVar2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        p();
        o(this.f2310e + this.f, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC0219i.e("elements", collection);
        p();
        int size = collection.size();
        n(this.f2310e + this.f, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        p();
        s(this.f2310e, this.f);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            Object[] objArr = this.f2309d;
            int i5 = this.f;
            if (i5 != list.size()) {
                return false;
            }
            for (int i6 = 0; i6 < i5; i6++) {
                if (!AbstractC0219i.a(objArr[this.f2310e + i6], list.get(i6))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        int i6 = this.f;
        if (i5 >= 0 && i5 < i6) {
            return this.f2309d[this.f2310e + i5];
        }
        throw new IndexOutOfBoundsException("index: " + i5 + ", size: " + i6);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f2309d;
        int i5 = this.f;
        int iHashCode = 1;
        for (int i6 = 0; i6 < i5; i6++) {
            Object obj = objArr[this.f2310e + i6];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i5 = 0; i5 < this.f; i5++) {
            if (AbstractC0219i.a(this.f2309d[this.f2310e + i5], obj)) {
                return i5;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new a(this, 0);
    }

    @Override // P2.e
    public final int l() {
        return this.f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i5 = this.f - 1; i5 >= 0; i5--) {
            if (AbstractC0219i.a(this.f2309d[this.f2310e + i5], obj)) {
                return i5;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new a(this, 0);
    }

    @Override // P2.e
    public final Object m(int i5) {
        p();
        int i6 = this.f;
        if (i5 >= 0 && i5 < i6) {
            return r(this.f2310e + i5);
        }
        throw new IndexOutOfBoundsException("index: " + i5 + ", size: " + i6);
    }

    public final void n(int i5, Collection collection, int i6) {
        b bVar = this.f2312h;
        if (bVar != null) {
            bVar.n(i5, collection, i6);
            this.f2309d = bVar.f2309d;
            this.f += i6;
        } else {
            q(i5, i6);
            Iterator it = collection.iterator();
            for (int i7 = 0; i7 < i6; i7++) {
                this.f2309d[i5 + i7] = it.next();
            }
        }
    }

    public final void o(int i5, Object obj) {
        b bVar = this.f2312h;
        if (bVar == null) {
            q(i5, 1);
            this.f2309d[i5] = obj;
        } else {
            bVar.o(i5, obj);
            this.f2309d = bVar.f2309d;
            this.f++;
        }
    }

    public final void p() {
        b bVar;
        if (this.f2311g || ((bVar = this.f2313i) != null && bVar.f2311g)) {
            throw new UnsupportedOperationException();
        }
    }

    public final void q(int i5, int i6) {
        int i7 = this.f + i6;
        if (this.f2312h != null) {
            throw new IllegalStateException();
        }
        if (i7 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f2309d;
        if (i7 > objArr.length) {
            int length = objArr.length;
            int i8 = length + (length >> 1);
            if (i8 - i7 < 0) {
                i8 = i7;
            }
            if (i8 - 2147483639 > 0) {
                i8 = i7 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i8);
            AbstractC0219i.d("copyOf(this, newSize)", objArrCopyOf);
            this.f2309d = objArrCopyOf;
        }
        Object[] objArr2 = this.f2309d;
        i.l0(objArr2, objArr2, i5 + i6, i5, this.f2310e + this.f);
        this.f += i6;
    }

    public final Object r(int i5) {
        b bVar = this.f2312h;
        if (bVar != null) {
            this.f--;
            return bVar.r(i5);
        }
        Object[] objArr = this.f2309d;
        Object obj = objArr[i5];
        int i6 = this.f;
        int i7 = this.f2310e;
        i.l0(objArr, objArr, i5, i5 + 1, i6 + i7);
        Object[] objArr2 = this.f2309d;
        int i8 = (i7 + this.f) - 1;
        AbstractC0219i.e("<this>", objArr2);
        objArr2[i8] = null;
        this.f--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        p();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            m(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        AbstractC0219i.e("elements", collection);
        p();
        return t(this.f2310e, this.f, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        AbstractC0219i.e("elements", collection);
        p();
        return t(this.f2310e, this.f, collection, true) > 0;
    }

    public final void s(int i5, int i6) {
        b bVar = this.f2312h;
        if (bVar != null) {
            bVar.s(i5, i6);
        } else {
            Object[] objArr = this.f2309d;
            i.l0(objArr, objArr, i5, i5 + i6, this.f);
            Object[] objArr2 = this.f2309d;
            int i7 = this.f;
            J2.b.Q(objArr2, i7 - i6, i7);
        }
        this.f -= i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        p();
        int i6 = this.f;
        if (i5 < 0 || i5 >= i6) {
            throw new IndexOutOfBoundsException("index: " + i5 + ", size: " + i6);
        }
        Object[] objArr = this.f2309d;
        int i7 = this.f2310e;
        Object obj2 = objArr[i7 + i5];
        objArr[i7 + i5] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i5, int i6) {
        j.f(i5, i6, this.f);
        Object[] objArr = this.f2309d;
        int i7 = this.f2310e + i5;
        int i8 = i6 - i5;
        boolean z4 = this.f2311g;
        b bVar = this.f2313i;
        return new b(objArr, i7, i8, z4, this, bVar == null ? this : bVar);
    }

    public final int t(int i5, int i6, Collection collection, boolean z4) {
        b bVar = this.f2312h;
        if (bVar != null) {
            int iT = bVar.t(i5, i6, collection, z4);
            this.f -= iT;
            return iT;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < i6) {
            int i9 = i5 + i7;
            if (collection.contains(this.f2309d[i9]) == z4) {
                Object[] objArr = this.f2309d;
                i7++;
                objArr[i8 + i5] = objArr[i9];
                i8++;
            } else {
                i7++;
            }
        }
        int i10 = i6 - i8;
        Object[] objArr2 = this.f2309d;
        i.l0(objArr2, objArr2, i5 + i8, i6 + i5, this.f);
        Object[] objArr3 = this.f2309d;
        int i11 = this.f;
        J2.b.Q(objArr3, i11 - i10, i11);
        this.f -= i10;
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC0219i.e("destination", objArr);
        int length = objArr.length;
        int i5 = this.f;
        int i6 = this.f2310e;
        if (length < i5) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f2309d, i6, i5 + i6, objArr.getClass());
            AbstractC0219i.d("copyOfRange(array, offse…h, destination.javaClass)", objArrCopyOfRange);
            return objArrCopyOfRange;
        }
        i.l0(this.f2309d, objArr, 0, i6, i5 + i6);
        int length2 = objArr.length;
        int i7 = this.f;
        if (length2 > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        Object[] objArr = this.f2309d;
        int i5 = this.f;
        StringBuilder sb = new StringBuilder((i5 * 3) + 2);
        sb.append("[");
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            sb.append(objArr[this.f2310e + i6]);
        }
        sb.append("]");
        String string = sb.toString();
        AbstractC0219i.d("sb.toString()", string);
        return string;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i5) {
        int i6 = this.f;
        if (i5 >= 0 && i5 <= i6) {
            return new a(this, i5);
        }
        throw new IndexOutOfBoundsException("index: " + i5 + ", size: " + i6);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        p();
        int i6 = this.f;
        if (i5 >= 0 && i5 <= i6) {
            o(this.f2310e + i5, obj);
            return;
        }
        throw new IndexOutOfBoundsException("index: " + i5 + ", size: " + i6);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i5, Collection collection) {
        AbstractC0219i.e("elements", collection);
        p();
        int i6 = this.f;
        if (i5 >= 0 && i5 <= i6) {
            int size = collection.size();
            n(this.f2310e + i5, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException("index: " + i5 + ", size: " + i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        Object[] objArr = this.f2309d;
        int i5 = this.f;
        int i6 = this.f2310e;
        return i.m0(objArr, i6, i5 + i6);
    }
}
