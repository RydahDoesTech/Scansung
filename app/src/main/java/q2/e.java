package Q2;

import b3.AbstractC0219i;
import c3.InterfaceC0226a;
import f3.C0447c;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class e implements Map, Serializable, InterfaceC0226a {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f2319d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f2320e;
    public int[] f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f2321g;

    /* renamed from: h, reason: collision with root package name */
    public int f2322h;

    /* renamed from: i, reason: collision with root package name */
    public int f2323i;

    /* renamed from: j, reason: collision with root package name */
    public int f2324j;

    /* renamed from: k, reason: collision with root package name */
    public int f2325k;

    /* renamed from: l, reason: collision with root package name */
    public f f2326l;

    /* renamed from: m, reason: collision with root package name */
    public g f2327m;
    public f n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2328o;

    public e() {
        int iHighestOneBit = Integer.highestOneBit(24);
        this.f2319d = new Object[8];
        this.f2320e = null;
        this.f = new int[8];
        this.f2321g = new int[iHighestOneBit];
        this.f2322h = 2;
        this.f2323i = 0;
        this.f2324j = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int a(Object obj) {
        b();
        while (true) {
            int iJ = j(obj);
            int i5 = this.f2322h * 2;
            int length = this.f2321g.length / 2;
            if (i5 > length) {
                i5 = length;
            }
            int i6 = 0;
            while (true) {
                int[] iArr = this.f2321g;
                int i7 = iArr[iJ];
                if (i7 <= 0) {
                    int i8 = this.f2323i;
                    Object[] objArr = this.f2319d;
                    if (i8 < objArr.length) {
                        int i9 = i8 + 1;
                        this.f2323i = i9;
                        objArr[i8] = obj;
                        this.f[i8] = iJ;
                        iArr[iJ] = i9;
                        this.f2325k++;
                        if (i6 > this.f2322h) {
                            this.f2322h = i6;
                        }
                        return i8;
                    }
                    f(1);
                } else {
                    if (AbstractC0219i.a(this.f2319d[i7 - 1], obj)) {
                        return -i7;
                    }
                    i6++;
                    if (i6 > i5) {
                        k(this.f2321g.length * 2);
                        break;
                    }
                    iJ = iJ == 0 ? this.f2321g.length - 1 : iJ - 1;
                }
            }
        }
    }

    public final void b() {
        if (this.f2328o) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean c(Collection collection) {
        AbstractC0219i.e("m", collection);
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!d((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final void clear() {
        int i5;
        b();
        boolean z4 = true;
        C0447c c0447c = new C0447c(0, this.f2323i - 1, 1);
        int i6 = c0447c.f;
        int i7 = c0447c.f6730e;
        if (i6 <= 0 ? i7 > 0 : i7 < 0) {
            z4 = false;
        }
        int i8 = z4 ? 0 : i7;
        while (z4) {
            if (i8 != i7) {
                i5 = i8 + i6;
            } else {
                if (!z4) {
                    throw new NoSuchElementException();
                }
                z4 = false;
                i5 = i8;
            }
            int[] iArr = this.f;
            int i9 = iArr[i8];
            if (i9 >= 0) {
                this.f2321g[i9] = 0;
                iArr[i8] = -1;
            }
            i8 = i5;
        }
        J2.b.Q(this.f2319d, 0, this.f2323i);
        Object[] objArr = this.f2320e;
        if (objArr != null) {
            J2.b.Q(objArr, 0, this.f2323i);
        }
        this.f2325k = 0;
        this.f2323i = 0;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final boolean d(Map.Entry entry) {
        AbstractC0219i.e("entry", entry);
        int iG = g(entry.getKey());
        if (iG < 0) {
            return false;
        }
        Object[] objArr = this.f2320e;
        AbstractC0219i.b(objArr);
        return AbstractC0219i.a(objArr[iG], entry.getValue());
    }

    @Override // java.util.Map
    public final Set entrySet() {
        f fVar = this.n;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this, 0);
        this.n = fVar2;
        return fVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f2325k != map.size() || !c(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    public final void f(int i5) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f2319d;
        int length = objArr.length;
        int i6 = this.f2323i;
        int i7 = length - i6;
        int i8 = i6 - this.f2325k;
        if (i7 < i5 && i7 + i8 >= i5 && i8 >= objArr.length / 4) {
            k(this.f2321g.length);
            return;
        }
        int i9 = i6 + i5;
        if (i9 < 0) {
            throw new OutOfMemoryError();
        }
        if (i9 > objArr.length) {
            int length2 = (objArr.length * 3) / 2;
            if (i9 <= length2) {
                i9 = length2;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i9);
            AbstractC0219i.d("copyOf(this, newSize)", objArrCopyOf2);
            this.f2319d = objArrCopyOf2;
            Object[] objArr2 = this.f2320e;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i9);
                AbstractC0219i.d("copyOf(this, newSize)", objArrCopyOf);
            } else {
                objArrCopyOf = null;
            }
            this.f2320e = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f, i9);
            AbstractC0219i.d("copyOf(this, newSize)", iArrCopyOf);
            this.f = iArrCopyOf;
            if (i9 < 1) {
                i9 = 1;
            }
            int iHighestOneBit = Integer.highestOneBit(i9 * 3);
            if (iHighestOneBit > this.f2321g.length) {
                k(iHighestOneBit);
            }
        }
    }

    public final int g(Object obj) {
        int iJ = j(obj);
        int i5 = this.f2322h;
        while (true) {
            int i6 = this.f2321g[iJ];
            if (i6 == 0) {
                return -1;
            }
            if (i6 > 0) {
                int i7 = i6 - 1;
                if (AbstractC0219i.a(this.f2319d[i7], obj)) {
                    return i7;
                }
            }
            i5--;
            if (i5 < 0) {
                return -1;
            }
            iJ = iJ == 0 ? this.f2321g.length - 1 : iJ - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iG = g(obj);
        if (iG < 0) {
            return null;
        }
        Object[] objArr = this.f2320e;
        AbstractC0219i.b(objArr);
        return objArr[iG];
    }

    @Override // java.util.Map
    public final int hashCode() {
        c cVar = new c(this, 0);
        int i5 = 0;
        while (cVar.hasNext()) {
            int i6 = cVar.f2315e;
            e eVar = cVar.f2314d;
            if (i6 >= eVar.f2323i) {
                throw new NoSuchElementException();
            }
            cVar.f2315e = i6 + 1;
            cVar.f = i6;
            Object obj = eVar.f2319d[i6];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = eVar.f2320e;
            AbstractC0219i.b(objArr);
            Object obj2 = objArr[cVar.f];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            cVar.a();
            i5 += iHashCode ^ iHashCode2;
        }
        return i5;
    }

    public final int i(Object obj) {
        int i5 = this.f2323i;
        while (true) {
            i5--;
            if (i5 < 0) {
                return -1;
            }
            if (this.f[i5] >= 0) {
                Object[] objArr = this.f2320e;
                AbstractC0219i.b(objArr);
                if (AbstractC0219i.a(objArr[i5], obj)) {
                    return i5;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f2325k == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f2324j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        r3[r0] = r7;
        r6.f[r2] = r0;
        r2 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r7) {
        /*
            r6 = this;
            int r0 = r6.f2323i
            int r1 = r6.f2325k
            r2 = 0
            if (r0 <= r1) goto L34
            java.lang.Object[] r0 = r6.f2320e
            r1 = r2
            r3 = r1
        Lb:
            int r4 = r6.f2323i
            if (r1 >= r4) goto L26
            int[] r4 = r6.f
            r4 = r4[r1]
            if (r4 < 0) goto L23
            java.lang.Object[] r4 = r6.f2319d
            r5 = r4[r1]
            r4[r3] = r5
            if (r0 == 0) goto L21
            r4 = r0[r1]
            r0[r3] = r4
        L21:
            int r3 = r3 + 1
        L23:
            int r1 = r1 + 1
            goto Lb
        L26:
            java.lang.Object[] r1 = r6.f2319d
            J2.b.Q(r1, r3, r4)
            if (r0 == 0) goto L32
            int r1 = r6.f2323i
            J2.b.Q(r0, r3, r1)
        L32:
            r6.f2323i = r3
        L34:
            int[] r0 = r6.f2321g
            int r1 = r0.length
            if (r7 == r1) goto L46
            int[] r0 = new int[r7]
            r6.f2321g = r0
            int r7 = java.lang.Integer.numberOfLeadingZeros(r7)
            int r7 = r7 + 1
            r6.f2324j = r7
            goto L4f
        L46:
            int r7 = r0.length
            java.lang.String r1 = "<this>"
            b3.AbstractC0219i.e(r1, r0)
            java.util.Arrays.fill(r0, r2, r7, r2)
        L4f:
            int r7 = r6.f2323i
            if (r2 >= r7) goto L83
            int r7 = r2 + 1
            java.lang.Object[] r0 = r6.f2319d
            r0 = r0[r2]
            int r0 = r6.j(r0)
            int r1 = r6.f2322h
        L5f:
            int[] r3 = r6.f2321g
            r4 = r3[r0]
            if (r4 != 0) goto L6d
            r3[r0] = r7
            int[] r1 = r6.f
            r1[r2] = r0
            r2 = r7
            goto L4f
        L6d:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L7b
            int r4 = r0 + (-1)
            if (r0 != 0) goto L79
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L5f
        L79:
            r0 = r4
            goto L5f
        L7b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r7)
            throw r6
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.e.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        f fVar = this.f2326l;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this, 1);
        this.f2326l = fVar2;
        return fVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[LOOP:0: B:6:0x001e->B:30:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f2319d
            java.lang.String r1 = "<this>"
            b3.AbstractC0219i.e(r1, r0)
            r1 = 0
            r0[r12] = r1
            int[] r0 = r11.f
            r0 = r0[r12]
            int r1 = r11.f2322h
            int r1 = r1 * 2
            int[] r2 = r11.f2321g
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L1a
            r1 = r2
        L1a:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L1e:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L28
            int[] r0 = r11.f2321g
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L29
        L28:
            r0 = r5
        L29:
            int r4 = r4 + 1
            int r5 = r11.f2322h
            r6 = -1
            if (r4 <= r5) goto L35
            int[] r0 = r11.f2321g
            r0[r1] = r2
            goto L66
        L35:
            int[] r5 = r11.f2321g
            r7 = r5[r0]
            if (r7 != 0) goto L3e
            r5[r1] = r2
            goto L66
        L3e:
            if (r7 >= 0) goto L45
            r5[r1] = r6
        L42:
            r1 = r0
            r4 = r2
            goto L5f
        L45:
            java.lang.Object[] r5 = r11.f2319d
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.j(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f2321g
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L5f
            r9[r1] = r7
            int[] r4 = r11.f
            r4[r8] = r1
            goto L42
        L5f:
            int r3 = r3 + r6
            if (r3 >= 0) goto L1e
            int[] r0 = r11.f2321g
            r0[r1] = r6
        L66:
            int[] r0 = r11.f
            r0[r12] = r6
            int r12 = r11.f2325k
            int r12 = r12 + r6
            r11.f2325k = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.e.l(int):void");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        int iA = a(obj);
        Object[] objArr = this.f2320e;
        if (objArr == null) {
            int length = this.f2319d.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f2320e = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i5 = (-iA) - 1;
        Object obj3 = objArr[i5];
        objArr[i5] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        AbstractC0219i.e("from", map);
        b();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        f(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f2320e;
            if (objArr == null) {
                int length = this.f2319d.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f2320e = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i5 = (-iA) - 1;
                if (!AbstractC0219i.a(entry.getValue(), objArr[i5])) {
                    objArr[i5] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        b();
        int iG = g(obj);
        if (iG < 0) {
            iG = -1;
        } else {
            l(iG);
        }
        if (iG < 0) {
            return null;
        }
        Object[] objArr = this.f2320e;
        AbstractC0219i.b(objArr);
        Object obj2 = objArr[iG];
        objArr[iG] = null;
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f2325k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f2325k * 3) + 2);
        sb.append("{");
        c cVar = new c(this, 0);
        int i5 = 0;
        while (cVar.hasNext()) {
            if (i5 > 0) {
                sb.append(", ");
            }
            int i6 = cVar.f2315e;
            e eVar = cVar.f2314d;
            if (i6 >= eVar.f2323i) {
                throw new NoSuchElementException();
            }
            cVar.f2315e = i6 + 1;
            cVar.f = i6;
            Object obj = eVar.f2319d[i6];
            if (AbstractC0219i.a(obj, eVar)) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = eVar.f2320e;
            AbstractC0219i.b(objArr);
            Object obj2 = objArr[cVar.f];
            if (AbstractC0219i.a(obj2, eVar)) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            cVar.a();
            i5++;
        }
        sb.append("}");
        String string = sb.toString();
        AbstractC0219i.d("sb.toString()", string);
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        g gVar = this.f2327m;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this);
        this.f2327m = gVar2;
        return gVar2;
    }
}
