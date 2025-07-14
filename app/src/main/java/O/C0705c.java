package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: o.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0705c implements Collection, Set {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f8202h = new int[0];

    /* renamed from: i, reason: collision with root package name */
    public static final Object[] f8203i = new Object[0];

    /* renamed from: j, reason: collision with root package name */
    public static Object[] f8204j;

    /* renamed from: k, reason: collision with root package name */
    public static int f8205k;

    /* renamed from: l, reason: collision with root package name */
    public static Object[] f8206l;

    /* renamed from: m, reason: collision with root package name */
    public static int f8207m;

    /* renamed from: d, reason: collision with root package name */
    public int[] f8208d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f8209e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public C0703a f8210g;

    public C0705c(int i5) {
        if (i5 == 0) {
            this.f8208d = f8202h;
            this.f8209e = f8203i;
        } else {
            l(i5);
        }
        this.f = 0;
    }

    public static void m(int[] iArr, Object[] objArr, int i5) {
        if (iArr.length == 8) {
            synchronized (C0705c.class) {
                try {
                    if (f8207m < 10) {
                        objArr[0] = f8206l;
                        objArr[1] = iArr;
                        for (int i6 = i5 - 1; i6 >= 2; i6--) {
                            objArr[i6] = null;
                        }
                        f8206l = objArr;
                        f8207m++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0705c.class) {
                try {
                    if (f8205k < 10) {
                        objArr[0] = f8204j;
                        objArr[1] = iArr;
                        for (int i7 = i5 - 1; i7 >= 2; i7--) {
                            objArr[i7] = null;
                        }
                        f8204j = objArr;
                        f8205k++;
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i5;
        int iN;
        if (obj == null) {
            iN = o();
            i5 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i5 = iHashCode;
            iN = n(iHashCode, obj);
        }
        if (iN >= 0) {
            return false;
        }
        int i6 = ~iN;
        int i7 = this.f;
        int[] iArr = this.f8208d;
        if (i7 >= iArr.length) {
            int i8 = 8;
            if (i7 >= 8) {
                i8 = (i7 >> 1) + i7;
            } else if (i7 < 4) {
                i8 = 4;
            }
            Object[] objArr = this.f8209e;
            l(i8);
            int[] iArr2 = this.f8208d;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f8209e, 0, objArr.length);
            }
            m(iArr, objArr, this.f);
        }
        int i9 = this.f;
        if (i6 < i9) {
            int[] iArr3 = this.f8208d;
            int i10 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i10, i9 - i6);
            Object[] objArr2 = this.f8209e;
            System.arraycopy(objArr2, i6, objArr2, i10, this.f - i6);
        }
        this.f8208d[i6] = i5;
        this.f8209e[i6] = obj;
        this.f++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f;
        int[] iArr = this.f8208d;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f8209e;
            l(size);
            int i5 = this.f;
            if (i5 > 0) {
                System.arraycopy(iArr, 0, this.f8208d, 0, i5);
                System.arraycopy(objArr, 0, this.f8209e, 0, this.f);
            }
            m(iArr, objArr, this.f);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i5 = this.f;
        if (i5 != 0) {
            m(this.f8208d, this.f8209e, i5);
            this.f8208d = f8202h;
            this.f8209e = f8203i;
            this.f = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f != set.size()) {
                return false;
            }
            for (int i5 = 0; i5 < this.f; i5++) {
                try {
                    if (!set.contains(this.f8209e[i5])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f8208d;
        int i5 = this.f;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            i6 += iArr[i7];
        }
        return i6;
    }

    public final int indexOf(Object obj) {
        return obj == null ? o() : n(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f8210g == null) {
            this.f8210g = new C0703a(1, this);
        }
        C0703a c0703a = this.f8210g;
        if (((C0710h) c0703a.f3094c) == null) {
            c0703a.f3094c = new C0710h(c0703a, 1);
        }
        return ((C0710h) c0703a.f3094c).iterator();
    }

    public final void l(int i5) {
        if (i5 == 8) {
            synchronized (C0705c.class) {
                try {
                    Object[] objArr = f8206l;
                    if (objArr != null) {
                        this.f8209e = objArr;
                        f8206l = (Object[]) objArr[0];
                        this.f8208d = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f8207m--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i5 == 4) {
            synchronized (C0705c.class) {
                try {
                    Object[] objArr2 = f8204j;
                    if (objArr2 != null) {
                        this.f8209e = objArr2;
                        f8204j = (Object[]) objArr2[0];
                        this.f8208d = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f8205k--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f8208d = new int[i5];
        this.f8209e = new Object[i5];
    }

    public final int n(int i5, Object obj) {
        int i6 = this.f;
        if (i6 == 0) {
            return -1;
        }
        int iA = AbstractC0706d.a(this.f8208d, i6, i5);
        if (iA < 0 || obj.equals(this.f8209e[iA])) {
            return iA;
        }
        int i7 = iA + 1;
        while (i7 < i6 && this.f8208d[i7] == i5) {
            if (obj.equals(this.f8209e[i7])) {
                return i7;
            }
            i7++;
        }
        for (int i8 = iA - 1; i8 >= 0 && this.f8208d[i8] == i5; i8--) {
            if (obj.equals(this.f8209e[i8])) {
                return i8;
            }
        }
        return ~i7;
    }

    public final int o() {
        int i5 = this.f;
        if (i5 == 0) {
            return -1;
        }
        int iA = AbstractC0706d.a(this.f8208d, i5, 0);
        if (iA < 0 || this.f8209e[iA] == null) {
            return iA;
        }
        int i6 = iA + 1;
        while (i6 < i5 && this.f8208d[i6] == 0) {
            if (this.f8209e[i6] == null) {
                return i6;
            }
            i6++;
        }
        for (int i7 = iA - 1; i7 >= 0 && this.f8208d[i7] == 0; i7--) {
            if (this.f8209e[i7] == null) {
                return i7;
            }
        }
        return ~i6;
    }

    public final void p(int i5) {
        Object[] objArr = this.f8209e;
        Object obj = objArr[i5];
        int i6 = this.f;
        if (i6 <= 1) {
            m(this.f8208d, objArr, i6);
            this.f8208d = f8202h;
            this.f8209e = f8203i;
            this.f = 0;
            return;
        }
        int[] iArr = this.f8208d;
        if (iArr.length <= 8 || i6 >= iArr.length / 3) {
            int i7 = i6 - 1;
            this.f = i7;
            if (i5 < i7) {
                int i8 = i5 + 1;
                System.arraycopy(iArr, i8, iArr, i5, i7 - i5);
                Object[] objArr2 = this.f8209e;
                System.arraycopy(objArr2, i8, objArr2, i5, this.f - i5);
            }
            this.f8209e[this.f] = null;
            return;
        }
        l(i6 > 8 ? i6 + (i6 >> 1) : 8);
        this.f--;
        if (i5 > 0) {
            System.arraycopy(iArr, 0, this.f8208d, 0, i5);
            System.arraycopy(objArr, 0, this.f8209e, 0, i5);
        }
        int i9 = this.f;
        if (i5 < i9) {
            int i10 = i5 + 1;
            System.arraycopy(iArr, i10, this.f8208d, i5, i9 - i5);
            System.arraycopy(objArr, i10, this.f8209e, i5, this.f - i5);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        p(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z4 = false;
        for (int i5 = this.f - 1; i5 >= 0; i5--) {
            if (!collection.contains(this.f8209e[i5])) {
                p(i5);
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i5 = this.f;
        Object[] objArr = new Object[i5];
        System.arraycopy(this.f8209e, 0, objArr, 0, i5);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f * 14);
        sb.append('{');
        for (int i5 = 0; i5 < this.f; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            Object obj = this.f8209e[i5];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f);
        }
        System.arraycopy(this.f8209e, 0, objArr, 0, this.f);
        int length = objArr.length;
        int i5 = this.f;
        if (length > i5) {
            objArr[i5] = null;
        }
        return objArr;
    }
}
