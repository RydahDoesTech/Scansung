package O3;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: O3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0078j {

    /* renamed from: c, reason: collision with root package name */
    public static final C0078j f2078c = new C0078j(0);

    /* renamed from: a, reason: collision with root package name */
    public final C f2079a = new C(16);

    /* renamed from: b, reason: collision with root package name */
    public boolean f2080b;

    public C0078j() {
    }

    public static int c(Q q5, Object obj) throws UnsupportedEncodingException {
        switch (q5.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return A1.j.g(((Long) obj).longValue());
            case 3:
                return A1.j.g(((Long) obj).longValue());
            case 4:
                return A1.j.c(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return A1.j.f(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e5) {
                    throw new RuntimeException("UTF-8 not supported.", e5);
                }
            case 9:
                return ((AbstractC0070b) obj).c();
            case 10:
                return A1.j.e((AbstractC0070b) obj);
            case 11:
                if (obj instanceof AbstractC0073e) {
                    AbstractC0073e abstractC0073e = (AbstractC0073e) obj;
                    return abstractC0073e.size() + A1.j.f(abstractC0073e.size());
                }
                byte[] bArr = (byte[]) obj;
                return A1.j.f(bArr.length) + bArr.length;
            case 12:
                return A1.j.f(((Integer) obj).intValue());
            case 13:
                return obj instanceof InterfaceC0085q ? A1.j.c(((InterfaceC0085q) obj).a()) : A1.j.c(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return A1.j.f((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return A1.j.g((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(C0082n c0082n, Object obj) {
        Q q5 = c0082n.f2085e;
        boolean z4 = c0082n.f;
        int i5 = c0082n.f2084d;
        if (!z4) {
            int iH = A1.j.h(i5);
            if (q5 == Q.f2044h) {
                iH *= 2;
            }
            return c(q5, obj) + iH;
        }
        int iC = 0;
        for (Object obj2 : (List) obj) {
            int iH2 = A1.j.h(i5);
            if (q5 == Q.f2044h) {
                iH2 *= 2;
            }
            iC += c(q5, obj2) + iH2;
        }
        return iC;
    }

    public static boolean e(Map.Entry entry) {
        C0082n c0082n = (C0082n) entry.getKey();
        if (c0082n.f2085e.f2048d != S.MESSAGE) {
            return true;
        }
        if (!c0082n.f) {
            Object value = entry.getValue();
            if (value instanceof AbstractC0070b) {
                return ((AbstractC0070b) value).b();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((AbstractC0070b) it.next()).b()) {
                return false;
            }
        }
        return true;
    }

    public static Object h(C0074f c0074f, Q q5) {
        switch (q5.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(c0074f.j()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(c0074f.i()));
            case 2:
                return Long.valueOf(c0074f.l());
            case 3:
                return Long.valueOf(c0074f.l());
            case 4:
                return Integer.valueOf(c0074f.k());
            case 5:
                return Long.valueOf(c0074f.j());
            case 6:
                return Integer.valueOf(c0074f.i());
            case 7:
                return Boolean.valueOf(c0074f.l() != 0);
            case 8:
                int iK = c0074f.k();
                int i5 = c0074f.f2067b;
                int i6 = c0074f.f2069d;
                if (iK > i5 - i6 || iK <= 0) {
                    return iK == 0 ? "" : new String(c0074f.h(iK), "UTF-8");
                }
                String str = new String(c0074f.f2066a, i6, iK, "UTF-8");
                c0074f.f2069d += iK;
                return str;
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return c0074f.e();
            case 12:
                return Integer.valueOf(c0074f.k());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(c0074f.i());
            case 15:
                return Long.valueOf(c0074f.j());
            case 16:
                int iK2 = c0074f.k();
                return Integer.valueOf((-(iK2 & 1)) ^ (iK2 >>> 1));
            case 17:
                long jL = c0074f.l();
                return Long.valueOf((-(jL & 1)) ^ (jL >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void j(O3.Q r2, java.lang.Object r3) {
        /*
            r3.getClass()
            O3.S r2 = r2.f2048d
            int r2 = r2.ordinal()
            r0 = 1
            r1 = 0
            switch(r2) {
                case 0: goto L36;
                case 1: goto L33;
                case 2: goto L30;
                case 3: goto L2d;
                case 4: goto L2a;
                case 5: goto L27;
                case 6: goto L1e;
                case 7: goto L12;
                case 8: goto Lf;
                default: goto Le;
            }
        Le:
            goto L38
        Lf:
            boolean r1 = r3 instanceof O3.AbstractC0070b
            goto L38
        L12:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L1c
            boolean r2 = r3 instanceof O3.InterfaceC0085q
            if (r2 == 0) goto L1b
            goto L1c
        L1b:
            r0 = r1
        L1c:
            r1 = r0
            goto L38
        L1e:
            boolean r2 = r3 instanceof O3.AbstractC0073e
            if (r2 != 0) goto L1c
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L1b
            goto L1c
        L27:
            boolean r1 = r3 instanceof java.lang.String
            goto L38
        L2a:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L38
        L2d:
            boolean r1 = r3 instanceof java.lang.Double
            goto L38
        L30:
            boolean r1 = r3 instanceof java.lang.Float
            goto L38
        L33:
            boolean r1 = r3 instanceof java.lang.Long
            goto L38
        L36:
            boolean r1 = r3 instanceof java.lang.Integer
        L38:
            if (r1 == 0) goto L3b
            return
        L3b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0078j.j(O3.Q, java.lang.Object):void");
    }

    public static void k(A1.j jVar, Q q5, Object obj) {
        switch (q5.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                jVar.getClass();
                jVar.u(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                jVar.getClass();
                jVar.t(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                jVar.w(((Long) obj).longValue());
                break;
            case 3:
                jVar.w(((Long) obj).longValue());
                break;
            case 4:
                jVar.n(((Integer) obj).intValue());
                break;
            case 5:
                jVar.u(((Long) obj).longValue());
                break;
            case 6:
                jVar.t(((Integer) obj).intValue());
                break;
            case 7:
                jVar.q(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                jVar.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                jVar.v(bytes.length);
                jVar.s(bytes);
                break;
            case 9:
                jVar.getClass();
                ((AbstractC0070b) obj).f(jVar);
                break;
            case 10:
                jVar.p((AbstractC0070b) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC0073e)) {
                    byte[] bArr = (byte[]) obj;
                    jVar.getClass();
                    jVar.v(bArr.length);
                    jVar.s(bArr);
                    break;
                } else {
                    AbstractC0073e abstractC0073e = (AbstractC0073e) obj;
                    jVar.getClass();
                    jVar.v(abstractC0073e.size());
                    jVar.r(abstractC0073e);
                    break;
                }
            case 12:
                jVar.v(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof InterfaceC0085q)) {
                    jVar.n(((Integer) obj).intValue());
                    break;
                } else {
                    jVar.n(((InterfaceC0085q) obj).a());
                    break;
                }
            case 14:
                jVar.t(((Integer) obj).intValue());
                break;
            case 15:
                jVar.u(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                jVar.v((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                jVar.w((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a(C0082n c0082n, Object obj) {
        List arrayList;
        if (!c0082n.f) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        j(c0082n.f2085e, obj);
        C c2 = this.f2079a;
        Object obj2 = c2.get(c0082n);
        if (obj2 == null) {
            arrayList = new ArrayList();
            c2.put(c0082n, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0078j clone() {
        C c2;
        C0078j c0078j = new C0078j();
        int i5 = 0;
        while (true) {
            c2 = this.f2079a;
            if (i5 >= c2.f2029e.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c2.f2029e.get(i5);
            c0078j.i((C0082n) entry.getKey(), entry.getValue());
            i5++;
        }
        for (Map.Entry entry2 : c2.c()) {
            c0078j.i((C0082n) entry2.getKey(), entry2.getValue());
        }
        return c0078j;
    }

    public final void f() {
        if (this.f2080b) {
            return;
        }
        C c2 = this.f2079a;
        if (!c2.f2030g) {
            for (int i5 = 0; i5 < c2.f2029e.size(); i5++) {
                Map.Entry entry = (Map.Entry) c2.f2029e.get(i5);
                if (((C0082n) entry.getKey()).f) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : c2.c()) {
                if (((C0082n) entry2.getKey()).f) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!c2.f2030g) {
            c2.f = c2.f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c2.f);
            c2.f2030g = true;
        }
        this.f2080b = true;
    }

    public final void g(Map.Entry entry) {
        C0082n c0082n = (C0082n) entry.getKey();
        Object value = entry.getValue();
        boolean z4 = c0082n.f;
        C c2 = this.f2079a;
        if (z4) {
            Object arrayList = c2.get(c0082n);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            c2.put(c0082n, arrayList);
            return;
        }
        if (c0082n.f2085e.f2048d != S.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            c2.put(c0082n, value);
            return;
        }
        Object obj2 = c2.get(c0082n);
        if (obj2 != null) {
            c2.put(c0082n, ((AbstractC0070b) obj2).e().e((AbstractC0084p) ((AbstractC0070b) value)).c());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        c2.put(c0082n, value);
    }

    public final void i(C0082n c0082n, Object obj) {
        boolean z4 = c0082n.f;
        Q q5 = c0082n.f2085e;
        if (!z4) {
            j(q5, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j(q5, it.next());
            }
            obj = arrayList;
        }
        this.f2079a.put(c0082n, obj);
    }

    public C0078j(int i5) {
        f();
    }
}
