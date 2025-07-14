package o;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: o.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0713k {

    /* renamed from: g, reason: collision with root package name */
    public static Object[] f8232g;

    /* renamed from: h, reason: collision with root package name */
    public static int f8233h;

    /* renamed from: i, reason: collision with root package name */
    public static Object[] f8234i;

    /* renamed from: j, reason: collision with root package name */
    public static int f8235j;

    /* renamed from: d, reason: collision with root package name */
    public int[] f8236d = AbstractC0706d.f8211a;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f8237e = AbstractC0706d.f8212b;
    public int f = 0;

    public static void c(int[] iArr, Object[] objArr, int i5) {
        if (iArr.length == 8) {
            synchronized (C0713k.class) {
                try {
                    if (f8235j < 10) {
                        objArr[0] = f8234i;
                        objArr[1] = iArr;
                        for (int i6 = (i5 << 1) - 1; i6 >= 2; i6--) {
                            objArr[i6] = null;
                        }
                        f8234i = objArr;
                        f8235j++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0713k.class) {
                try {
                    if (f8233h < 10) {
                        objArr[0] = f8232g;
                        objArr[1] = iArr;
                        for (int i7 = (i5 << 1) - 1; i7 >= 2; i7--) {
                            objArr[i7] = null;
                        }
                        f8232g = objArr;
                        f8233h++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i5) {
        if (i5 == 8) {
            synchronized (C0713k.class) {
                try {
                    Object[] objArr = f8234i;
                    if (objArr != null) {
                        this.f8237e = objArr;
                        f8234i = (Object[]) objArr[0];
                        this.f8236d = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f8235j--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i5 == 4) {
            synchronized (C0713k.class) {
                try {
                    Object[] objArr2 = f8232g;
                    if (objArr2 != null) {
                        this.f8237e = objArr2;
                        f8232g = (Object[]) objArr2[0];
                        this.f8236d = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f8233h--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f8236d = new int[i5];
        this.f8237e = new Object[i5 << 1];
    }

    public final void b(int i5) {
        int i6 = this.f;
        int[] iArr = this.f8236d;
        if (iArr.length < i5) {
            Object[] objArr = this.f8237e;
            a(i5);
            if (this.f > 0) {
                System.arraycopy(iArr, 0, this.f8236d, 0, i6);
                System.arraycopy(objArr, 0, this.f8237e, 0, i6 << 1);
            }
            c(iArr, objArr, i6);
        }
        if (this.f != i6) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i5 = this.f;
        if (i5 > 0) {
            int[] iArr = this.f8236d;
            Object[] objArr = this.f8237e;
            this.f8236d = AbstractC0706d.f8211a;
            this.f8237e = AbstractC0706d.f8212b;
            this.f = 0;
            c(iArr, objArr, i5);
        }
        if (this.f > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final int d(int i5, Object obj) {
        int i6 = this.f;
        if (i6 == 0) {
            return -1;
        }
        try {
            int iA = AbstractC0706d.a(this.f8236d, i6, i5);
            if (iA < 0 || obj.equals(this.f8237e[iA << 1])) {
                return iA;
            }
            int i7 = iA + 1;
            while (i7 < i6 && this.f8236d[i7] == i5) {
                if (obj.equals(this.f8237e[i7 << 1])) {
                    return i7;
                }
                i7++;
            }
            for (int i8 = iA - 1; i8 >= 0 && this.f8236d[i8] == i5; i8--) {
                if (obj.equals(this.f8237e[i8 << 1])) {
                    return i8;
                }
            }
            return ~i7;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0713k) {
            C0713k c0713k = (C0713k) obj;
            if (this.f != c0713k.f) {
                return false;
            }
            for (int i5 = 0; i5 < this.f; i5++) {
                try {
                    Object objH = h(i5);
                    Object objJ = j(i5);
                    Object orDefault = c0713k.getOrDefault(objH, null);
                    if (objJ == null) {
                        if (orDefault != null || !c0713k.containsKey(objH)) {
                            return false;
                        }
                    } else if (!objJ.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f != map.size()) {
                return false;
            }
            for (int i6 = 0; i6 < this.f; i6++) {
                try {
                    Object objH2 = h(i6);
                    Object objJ2 = j(i6);
                    Object obj2 = map.get(objH2);
                    if (objJ2 == null) {
                        if (obj2 != null || !map.containsKey(objH2)) {
                            return false;
                        }
                    } else if (!objJ2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i5 = this.f;
        if (i5 == 0) {
            return -1;
        }
        try {
            int iA = AbstractC0706d.a(this.f8236d, i5, 0);
            if (iA < 0 || this.f8237e[iA << 1] == null) {
                return iA;
            }
            int i6 = iA + 1;
            while (i6 < i5 && this.f8236d[i6] == 0) {
                if (this.f8237e[i6 << 1] == null) {
                    return i6;
                }
                i6++;
            }
            for (int i7 = iA - 1; i7 >= 0 && this.f8236d[i7] == 0; i7--) {
                if (this.f8237e[i7 << 1] == null) {
                    return i7;
                }
            }
            return ~i6;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int g(Object obj) {
        int i5 = this.f * 2;
        Object[] objArr = this.f8237e;
        if (obj == null) {
            for (int i6 = 1; i6 < i5; i6 += 2) {
                if (objArr[i6] == null) {
                    return i6 >> 1;
                }
            }
            return -1;
        }
        for (int i7 = 1; i7 < i5; i7 += 2) {
            if (obj.equals(objArr[i7])) {
                return i7 >> 1;
            }
        }
        return -1;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iE = e(obj);
        return iE >= 0 ? this.f8237e[(iE << 1) + 1] : obj2;
    }

    public final Object h(int i5) {
        return this.f8237e[i5 << 1];
    }

    public final int hashCode() {
        int[] iArr = this.f8236d;
        Object[] objArr = this.f8237e;
        int i5 = this.f;
        int i6 = 1;
        int i7 = 0;
        int iHashCode = 0;
        while (i7 < i5) {
            Object obj = objArr[i6];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i7];
            i7++;
            i6 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i5) {
        Object[] objArr = this.f8237e;
        int i6 = i5 << 1;
        Object obj = objArr[i6 + 1];
        int i7 = this.f;
        int i8 = 0;
        if (i7 <= 1) {
            c(this.f8236d, objArr, i7);
            this.f8236d = AbstractC0706d.f8211a;
            this.f8237e = AbstractC0706d.f8212b;
        } else {
            int i9 = i7 - 1;
            int[] iArr = this.f8236d;
            if (iArr.length <= 8 || i7 >= iArr.length / 3) {
                if (i5 < i9) {
                    int i10 = i5 + 1;
                    int i11 = i9 - i5;
                    System.arraycopy(iArr, i10, iArr, i5, i11);
                    Object[] objArr2 = this.f8237e;
                    System.arraycopy(objArr2, i10 << 1, objArr2, i6, i11 << 1);
                }
                Object[] objArr3 = this.f8237e;
                int i12 = i9 << 1;
                objArr3[i12] = null;
                objArr3[i12 + 1] = null;
            } else {
                a(i7 > 8 ? i7 + (i7 >> 1) : 8);
                if (i7 != this.f) {
                    throw new ConcurrentModificationException();
                }
                if (i5 > 0) {
                    System.arraycopy(iArr, 0, this.f8236d, 0, i5);
                    System.arraycopy(objArr, 0, this.f8237e, 0, i6);
                }
                if (i5 < i9) {
                    int i13 = i5 + 1;
                    int i14 = i9 - i5;
                    System.arraycopy(iArr, i13, this.f8236d, i5, i14);
                    System.arraycopy(objArr, i13 << 1, this.f8237e, i6, i14 << 1);
                }
            }
            i8 = i9;
        }
        if (i7 != this.f) {
            throw new ConcurrentModificationException();
        }
        this.f = i8;
        return obj;
    }

    public final boolean isEmpty() {
        return this.f <= 0;
    }

    public final Object j(int i5) {
        return this.f8237e[(i5 << 1) + 1];
    }

    public final Object put(Object obj, Object obj2) {
        int i5;
        int iD;
        int i6 = this.f;
        if (obj == null) {
            iD = f();
            i5 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i5 = iHashCode;
            iD = d(iHashCode, obj);
        }
        if (iD >= 0) {
            int i7 = (iD << 1) + 1;
            Object[] objArr = this.f8237e;
            Object obj3 = objArr[i7];
            objArr[i7] = obj2;
            return obj3;
        }
        int i8 = ~iD;
        int[] iArr = this.f8236d;
        if (i6 >= iArr.length) {
            int i9 = 8;
            if (i6 >= 8) {
                i9 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i9 = 4;
            }
            Object[] objArr2 = this.f8237e;
            a(i9);
            if (i6 != this.f) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f8236d;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f8237e, 0, objArr2.length);
            }
            c(iArr, objArr2, i6);
        }
        if (i8 < i6) {
            int[] iArr3 = this.f8236d;
            int i10 = i8 + 1;
            System.arraycopy(iArr3, i8, iArr3, i10, i6 - i8);
            Object[] objArr3 = this.f8237e;
            System.arraycopy(objArr3, i8 << 1, objArr3, i10 << 1, (this.f - i8) << 1);
        }
        int i11 = this.f;
        if (i6 == i11) {
            int[] iArr4 = this.f8236d;
            if (i8 < iArr4.length) {
                iArr4[i8] = i5;
                Object[] objArr4 = this.f8237e;
                int i12 = i8 << 1;
                objArr4[i12] = obj;
                objArr4[i12 + 1] = obj2;
                this.f = i11 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object remove(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return i(iE);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE < 0) {
            return null;
        }
        int i5 = (iE << 1) + 1;
        Object[] objArr = this.f8237e;
        Object obj3 = objArr[i5];
        objArr[i5] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f * 28);
        sb.append('{');
        for (int i5 = 0; i5 < this.f; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            Object objH = h(i5);
            if (objH != this) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objJ = j(i5);
            if (objJ != this) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE < 0) {
            return false;
        }
        Object objJ = j(iE);
        if (obj2 != objJ && (obj2 == null || !obj2.equals(objJ))) {
            return false;
        }
        i(iE);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iE = e(obj);
        if (iE < 0) {
            return false;
        }
        Object objJ = j(iE);
        if (objJ != obj2 && (obj2 == null || !obj2.equals(objJ))) {
            return false;
        }
        int i5 = (iE << 1) + 1;
        Object[] objArr = this.f8237e;
        Object obj4 = objArr[i5];
        objArr[i5] = obj3;
        return true;
    }
}
