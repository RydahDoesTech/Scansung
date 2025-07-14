package P2;

import b3.AbstractC0219i;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h extends e {

    /* renamed from: g, reason: collision with root package name */
    public static final Object[] f2154g = new Object[0];

    /* renamed from: d, reason: collision with root package name */
    public int f2155d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f2156e;
    public int f;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int length;
        int i6 = this.f;
        if (i5 < 0 || i5 > i6) {
            throw new IndexOutOfBoundsException("index: " + i5 + ", size: " + i6);
        }
        if (i5 == i6) {
            addLast(obj);
            return;
        }
        if (i5 == 0) {
            addFirst(obj);
            return;
        }
        o(i6 + 1);
        int iQ = q(this.f2155d + i5);
        int i7 = this.f;
        if (i5 < ((i7 + 1) >> 1)) {
            if (iQ == 0) {
                Object[] objArr = this.f2156e;
                AbstractC0219i.e("<this>", objArr);
                iQ = objArr.length;
            }
            int i8 = iQ - 1;
            int i9 = this.f2155d;
            if (i9 == 0) {
                Object[] objArr2 = this.f2156e;
                AbstractC0219i.e("<this>", objArr2);
                length = objArr2.length - 1;
            } else {
                length = i9 - 1;
            }
            int i10 = this.f2155d;
            if (i8 >= i10) {
                Object[] objArr3 = this.f2156e;
                objArr3[length] = objArr3[i10];
                i.l0(objArr3, objArr3, i10, i10 + 1, i8 + 1);
            } else {
                Object[] objArr4 = this.f2156e;
                i.l0(objArr4, objArr4, i10 - 1, i10, objArr4.length);
                Object[] objArr5 = this.f2156e;
                objArr5[objArr5.length - 1] = objArr5[0];
                i.l0(objArr5, objArr5, 0, 1, i8 + 1);
            }
            this.f2156e[i8] = obj;
            this.f2155d = length;
        } else {
            int iQ2 = q(i7 + this.f2155d);
            if (iQ < iQ2) {
                Object[] objArr6 = this.f2156e;
                i.l0(objArr6, objArr6, iQ + 1, iQ, iQ2);
            } else {
                Object[] objArr7 = this.f2156e;
                i.l0(objArr7, objArr7, 1, 0, iQ2);
                Object[] objArr8 = this.f2156e;
                objArr8[0] = objArr8[objArr8.length - 1];
                i.l0(objArr8, objArr8, iQ + 1, iQ, objArr8.length - 1);
            }
            this.f2156e[iQ] = obj;
        }
        this.f++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i5, Collection collection) {
        AbstractC0219i.e("elements", collection);
        int i6 = this.f;
        if (i5 < 0 || i5 > i6) {
            throw new IndexOutOfBoundsException("index: " + i5 + ", size: " + i6);
        }
        if (collection.isEmpty()) {
            return false;
        }
        int i7 = this.f;
        if (i5 == i7) {
            return addAll(collection);
        }
        o(collection.size() + i7);
        int iQ = q(this.f + this.f2155d);
        int iQ2 = q(this.f2155d + i5);
        int size = collection.size();
        if (i5 < ((this.f + 1) >> 1)) {
            int i8 = this.f2155d;
            int length = i8 - size;
            if (iQ2 < i8) {
                Object[] objArr = this.f2156e;
                i.l0(objArr, objArr, length, i8, objArr.length);
                if (size >= iQ2) {
                    Object[] objArr2 = this.f2156e;
                    i.l0(objArr2, objArr2, objArr2.length - size, 0, iQ2);
                } else {
                    Object[] objArr3 = this.f2156e;
                    i.l0(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f2156e;
                    i.l0(objArr4, objArr4, 0, size, iQ2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f2156e;
                i.l0(objArr5, objArr5, length, i8, iQ2);
            } else {
                Object[] objArr6 = this.f2156e;
                length += objArr6.length;
                int i9 = iQ2 - i8;
                int length2 = objArr6.length - length;
                if (length2 >= i9) {
                    i.l0(objArr6, objArr6, length, i8, iQ2);
                } else {
                    i.l0(objArr6, objArr6, length, i8, i8 + length2);
                    Object[] objArr7 = this.f2156e;
                    i.l0(objArr7, objArr7, 0, this.f2155d + length2, iQ2);
                }
            }
            this.f2155d = length;
            int length3 = iQ2 - size;
            if (length3 < 0) {
                length3 += this.f2156e.length;
            }
            n(length3, collection);
        } else {
            int i10 = iQ2 + size;
            if (iQ2 < iQ) {
                int i11 = size + iQ;
                Object[] objArr8 = this.f2156e;
                if (i11 <= objArr8.length) {
                    i.l0(objArr8, objArr8, i10, iQ2, iQ);
                } else if (i10 >= objArr8.length) {
                    i.l0(objArr8, objArr8, i10 - objArr8.length, iQ2, iQ);
                } else {
                    int length4 = iQ - (i11 - objArr8.length);
                    i.l0(objArr8, objArr8, 0, length4, iQ);
                    Object[] objArr9 = this.f2156e;
                    i.l0(objArr9, objArr9, i10, iQ2, length4);
                }
            } else {
                Object[] objArr10 = this.f2156e;
                i.l0(objArr10, objArr10, size, 0, iQ);
                Object[] objArr11 = this.f2156e;
                if (i10 >= objArr11.length) {
                    i.l0(objArr11, objArr11, i10 - objArr11.length, iQ2, objArr11.length);
                } else {
                    i.l0(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f2156e;
                    i.l0(objArr12, objArr12, i10, iQ2, objArr12.length - size);
                }
            }
            n(iQ2, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        o(this.f + 1);
        int length = this.f2155d;
        if (length == 0) {
            Object[] objArr = this.f2156e;
            AbstractC0219i.e("<this>", objArr);
            length = objArr.length;
        }
        int i5 = length - 1;
        this.f2155d = i5;
        this.f2156e[i5] = obj;
        this.f++;
    }

    public final void addLast(Object obj) {
        o(l() + 1);
        this.f2156e[q(l() + this.f2155d)] = obj;
        this.f = l() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int iQ = q(this.f + this.f2155d);
        int i5 = this.f2155d;
        if (i5 < iQ) {
            Object[] objArr = this.f2156e;
            AbstractC0219i.e("<this>", objArr);
            Arrays.fill(objArr, i5, iQ, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f2156e;
            Arrays.fill(objArr2, this.f2155d, objArr2.length, (Object) null);
            Object[] objArr3 = this.f2156e;
            AbstractC0219i.e("<this>", objArr3);
            Arrays.fill(objArr3, 0, iQ, (Object) null);
        }
        this.f2155d = 0;
        this.f = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        int iL = l();
        if (i5 >= 0 && i5 < iL) {
            return this.f2156e[q(this.f2155d + i5)];
        }
        throw new IndexOutOfBoundsException("index: " + i5 + ", size: " + iL);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i5;
        int iQ = q(l() + this.f2155d);
        int length = this.f2155d;
        if (length < iQ) {
            while (length < iQ) {
                if (AbstractC0219i.a(obj, this.f2156e[length])) {
                    i5 = this.f2155d;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iQ) {
            return -1;
        }
        int length2 = this.f2156e.length;
        while (true) {
            if (length >= length2) {
                for (int i6 = 0; i6 < iQ; i6++) {
                    if (AbstractC0219i.a(obj, this.f2156e[i6])) {
                        length = i6 + this.f2156e.length;
                        i5 = this.f2155d;
                    }
                }
                return -1;
            }
            if (AbstractC0219i.a(obj, this.f2156e[length])) {
                i5 = this.f2155d;
                break;
            }
            length++;
        }
        return length - i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return l() == 0;
    }

    @Override // P2.e
    public final int l() {
        return this.f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i5;
        int iQ = q(this.f + this.f2155d);
        int i6 = this.f2155d;
        if (i6 < iQ) {
            length = iQ - 1;
            if (i6 <= length) {
                while (!AbstractC0219i.a(obj, this.f2156e[length])) {
                    if (length != i6) {
                        length--;
                    }
                }
                i5 = this.f2155d;
                return length - i5;
            }
            return -1;
        }
        if (i6 > iQ) {
            int i7 = iQ - 1;
            while (true) {
                if (-1 >= i7) {
                    Object[] objArr = this.f2156e;
                    AbstractC0219i.e("<this>", objArr);
                    length = objArr.length - 1;
                    int i8 = this.f2155d;
                    if (i8 <= length) {
                        while (!AbstractC0219i.a(obj, this.f2156e[length])) {
                            if (length != i8) {
                                length--;
                            }
                        }
                        i5 = this.f2155d;
                    }
                } else {
                    if (AbstractC0219i.a(obj, this.f2156e[i7])) {
                        length = i7 + this.f2156e.length;
                        i5 = this.f2155d;
                        break;
                    }
                    i7--;
                }
            }
        }
        return -1;
    }

    @Override // P2.e
    public final Object m(int i5) {
        int i6 = this.f;
        if (i5 < 0 || i5 >= i6) {
            throw new IndexOutOfBoundsException("index: " + i5 + ", size: " + i6);
        }
        if (i5 == n.g0(this)) {
            return removeLast();
        }
        if (i5 == 0) {
            return removeFirst();
        }
        int iQ = q(this.f2155d + i5);
        Object[] objArr = this.f2156e;
        Object obj = objArr[iQ];
        if (i5 < (this.f >> 1)) {
            int i7 = this.f2155d;
            if (iQ >= i7) {
                i.l0(objArr, objArr, i7 + 1, i7, iQ);
            } else {
                i.l0(objArr, objArr, 1, 0, iQ);
                Object[] objArr2 = this.f2156e;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i8 = this.f2155d;
                i.l0(objArr2, objArr2, i8 + 1, i8, objArr2.length - 1);
            }
            Object[] objArr3 = this.f2156e;
            int i9 = this.f2155d;
            objArr3[i9] = null;
            this.f2155d = p(i9);
        } else {
            int iQ2 = q(n.g0(this) + this.f2155d);
            if (iQ <= iQ2) {
                Object[] objArr4 = this.f2156e;
                i.l0(objArr4, objArr4, iQ, iQ + 1, iQ2 + 1);
            } else {
                Object[] objArr5 = this.f2156e;
                i.l0(objArr5, objArr5, iQ, iQ + 1, objArr5.length);
                Object[] objArr6 = this.f2156e;
                objArr6[objArr6.length - 1] = objArr6[0];
                i.l0(objArr6, objArr6, 0, 1, iQ2 + 1);
            }
            this.f2156e[iQ2] = null;
        }
        this.f--;
        return obj;
    }

    public final void n(int i5, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f2156e.length;
        while (i5 < length && it.hasNext()) {
            this.f2156e[i5] = it.next();
            i5++;
        }
        int i6 = this.f2155d;
        for (int i7 = 0; i7 < i6 && it.hasNext(); i7++) {
            this.f2156e[i7] = it.next();
        }
        this.f = collection.size() + l();
    }

    public final void o(int i5) {
        if (i5 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f2156e;
        if (i5 <= objArr.length) {
            return;
        }
        if (objArr == f2154g) {
            if (i5 < 10) {
                i5 = 10;
            }
            this.f2156e = new Object[i5];
            return;
        }
        int length = objArr.length;
        int i6 = length + (length >> 1);
        if (i6 - i5 < 0) {
            i6 = i5;
        }
        if (i6 - 2147483639 > 0) {
            i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i6];
        i.l0(objArr, objArr2, 0, this.f2155d, objArr.length);
        Object[] objArr3 = this.f2156e;
        int length2 = objArr3.length;
        int i7 = this.f2155d;
        i.l0(objArr3, objArr2, length2 - i7, 0, i7);
        this.f2155d = 0;
        this.f2156e = objArr2;
    }

    public final int p(int i5) {
        AbstractC0219i.e("<this>", this.f2156e);
        if (i5 == r1.length - 1) {
            return 0;
        }
        return i5 + 1;
    }

    public final int q(int i5) {
        Object[] objArr = this.f2156e;
        return i5 >= objArr.length ? i5 - objArr.length : i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        m(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iQ;
        AbstractC0219i.e("elements", collection);
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f2156e.length != 0) {
            int iQ2 = q(this.f + this.f2155d);
            int i5 = this.f2155d;
            if (i5 < iQ2) {
                iQ = i5;
                while (i5 < iQ2) {
                    Object obj = this.f2156e[i5];
                    if (collection.contains(obj)) {
                        z4 = true;
                    } else {
                        this.f2156e[iQ] = obj;
                        iQ++;
                    }
                    i5++;
                }
                Object[] objArr = this.f2156e;
                AbstractC0219i.e("<this>", objArr);
                Arrays.fill(objArr, iQ, iQ2, (Object) null);
            } else {
                int length = this.f2156e.length;
                boolean z5 = false;
                int i6 = i5;
                while (i5 < length) {
                    Object[] objArr2 = this.f2156e;
                    Object obj2 = objArr2[i5];
                    objArr2[i5] = null;
                    if (collection.contains(obj2)) {
                        z5 = true;
                    } else {
                        this.f2156e[i6] = obj2;
                        i6++;
                    }
                    i5++;
                }
                iQ = q(i6);
                for (int i7 = 0; i7 < iQ2; i7++) {
                    Object[] objArr3 = this.f2156e;
                    Object obj3 = objArr3[i7];
                    objArr3[i7] = null;
                    if (collection.contains(obj3)) {
                        z5 = true;
                    } else {
                        this.f2156e[iQ] = obj3;
                        iQ = p(iQ);
                    }
                }
                z4 = z5;
            }
            if (z4) {
                int length2 = iQ - this.f2155d;
                if (length2 < 0) {
                    length2 += this.f2156e.length;
                }
                this.f = length2;
            }
        }
        return z4;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f2156e;
        int i5 = this.f2155d;
        Object obj = objArr[i5];
        objArr[i5] = null;
        this.f2155d = p(i5);
        this.f = l() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int iQ = q(n.g0(this) + this.f2155d);
        Object[] objArr = this.f2156e;
        Object obj = objArr[iQ];
        objArr[iQ] = null;
        this.f = l() - 1;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iQ;
        AbstractC0219i.e("elements", collection);
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f2156e.length != 0) {
            int iQ2 = q(this.f + this.f2155d);
            int i5 = this.f2155d;
            if (i5 < iQ2) {
                iQ = i5;
                while (i5 < iQ2) {
                    Object obj = this.f2156e[i5];
                    if (collection.contains(obj)) {
                        this.f2156e[iQ] = obj;
                        iQ++;
                    } else {
                        z4 = true;
                    }
                    i5++;
                }
                Object[] objArr = this.f2156e;
                AbstractC0219i.e("<this>", objArr);
                Arrays.fill(objArr, iQ, iQ2, (Object) null);
            } else {
                int length = this.f2156e.length;
                boolean z5 = false;
                int i6 = i5;
                while (i5 < length) {
                    Object[] objArr2 = this.f2156e;
                    Object obj2 = objArr2[i5];
                    objArr2[i5] = null;
                    if (collection.contains(obj2)) {
                        this.f2156e[i6] = obj2;
                        i6++;
                    } else {
                        z5 = true;
                    }
                    i5++;
                }
                iQ = q(i6);
                for (int i7 = 0; i7 < iQ2; i7++) {
                    Object[] objArr3 = this.f2156e;
                    Object obj3 = objArr3[i7];
                    objArr3[i7] = null;
                    if (collection.contains(obj3)) {
                        this.f2156e[iQ] = obj3;
                        iQ = p(iQ);
                    } else {
                        z5 = true;
                    }
                }
                z4 = z5;
            }
            if (z4) {
                int length2 = iQ - this.f2155d;
                if (length2 < 0) {
                    length2 += this.f2156e.length;
                }
                this.f = length2;
            }
        }
        return z4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        int iL = l();
        if (i5 < 0 || i5 >= iL) {
            throw new IndexOutOfBoundsException("index: " + i5 + ", size: " + iL);
        }
        int iQ = q(this.f2155d + i5);
        Object[] objArr = this.f2156e;
        Object obj2 = objArr[iQ];
        objArr[iQ] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[l()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) throws NegativeArraySizeException {
        AbstractC0219i.e("array", objArr);
        int length = objArr.length;
        int i5 = this.f;
        if (length < i5) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i5);
            AbstractC0219i.c("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>", objNewInstance);
            objArr = (Object[]) objNewInstance;
        }
        int iQ = q(this.f + this.f2155d);
        int i6 = this.f2155d;
        if (i6 < iQ) {
            Object[] objArr2 = this.f2156e;
            if ((2 & 4) != 0) {
                i6 = 0;
            }
            if ((2 & 8) != 0) {
                iQ = objArr2.length;
            }
            i.l0(objArr2, objArr, 0, i6, iQ);
        } else if (!isEmpty()) {
            Object[] objArr3 = this.f2156e;
            i.l0(objArr3, objArr, 0, this.f2155d, objArr3.length);
            Object[] objArr4 = this.f2156e;
            i.l0(objArr4, objArr, objArr4.length - this.f2155d, 0, iQ);
        }
        int length2 = objArr.length;
        int i7 = this.f;
        if (length2 > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC0219i.e("elements", collection);
        if (collection.isEmpty()) {
            return false;
        }
        o(collection.size() + l());
        n(q(l() + this.f2155d), collection);
        return true;
    }
}
