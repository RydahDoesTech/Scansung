package S3;

import b3.AbstractC0219i;
import g3.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p3.InterfaceC0781y;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f2532a = new h();

    public final b a(List list, InterfaceC0781y interfaceC0781y, m3.j jVar) {
        List listO0 = P2.m.O0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listO0.iterator();
        while (it.hasNext()) {
            g gVarB = b(it.next(), null);
            if (gVarB != null) {
                arrayList.add(gVarB);
            }
        }
        return interfaceC0781y != null ? new w(arrayList, interfaceC0781y.g().p(jVar)) : new b(arrayList, new B3.d(10, jVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [P2.u] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [S3.h] */
    public final g b(Object obj, InterfaceC0781y interfaceC0781y) {
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new u(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new k(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new s(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            Character ch = (Character) obj;
            ch.getClass();
            return new e(ch);
        }
        if (obj instanceof Float) {
            return new c(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new c(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            return new c(bool);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            AbstractC0219i.e("value", str);
            return new v(str);
        }
        boolean z4 = obj instanceof byte[];
        ?? N4 = P2.u.f2163d;
        int i5 = 0;
        if (z4) {
            byte[] bArr = (byte[]) obj;
            AbstractC0219i.e("<this>", bArr);
            int length = bArr.length;
            if (length != 0) {
                if (length != 1) {
                    N4 = new ArrayList(bArr.length);
                    int length2 = bArr.length;
                    while (i5 < length2) {
                        N4.add(Byte.valueOf(bArr[i5]));
                        i5++;
                    }
                } else {
                    N4 = y.N(Byte.valueOf(bArr[0]));
                }
            }
            return a(N4, interfaceC0781y, m3.j.BYTE);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            AbstractC0219i.e("<this>", sArr);
            int length3 = sArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    N4 = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i5 < length4) {
                        N4.add(Short.valueOf(sArr[i5]));
                        i5++;
                    }
                } else {
                    N4 = y.N(Short.valueOf(sArr[0]));
                }
            }
            return a(N4, interfaceC0781y, m3.j.SHORT);
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            AbstractC0219i.e("<this>", iArr);
            int length5 = iArr.length;
            if (length5 != 0) {
                if (length5 != 1) {
                    N4 = new ArrayList(iArr.length);
                    int length6 = iArr.length;
                    while (i5 < length6) {
                        N4.add(Integer.valueOf(iArr[i5]));
                        i5++;
                    }
                } else {
                    N4 = y.N(Integer.valueOf(iArr[0]));
                }
            }
            return a(N4, interfaceC0781y, m3.j.INT);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            AbstractC0219i.e("<this>", jArr);
            int length7 = jArr.length;
            if (length7 != 0) {
                if (length7 != 1) {
                    N4 = new ArrayList(jArr.length);
                    int length8 = jArr.length;
                    while (i5 < length8) {
                        N4.add(Long.valueOf(jArr[i5]));
                        i5++;
                    }
                } else {
                    N4 = y.N(Long.valueOf(jArr[0]));
                }
            }
            return a(N4, interfaceC0781y, m3.j.LONG);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            AbstractC0219i.e("<this>", cArr);
            int length9 = cArr.length;
            if (length9 != 0) {
                if (length9 != 1) {
                    N4 = new ArrayList(cArr.length);
                    int length10 = cArr.length;
                    while (i5 < length10) {
                        N4.add(Character.valueOf(cArr[i5]));
                        i5++;
                    }
                } else {
                    N4 = y.N(Character.valueOf(cArr[0]));
                }
            }
            return a(N4, interfaceC0781y, m3.j.CHAR);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            AbstractC0219i.e("<this>", fArr);
            int length11 = fArr.length;
            if (length11 != 0) {
                if (length11 != 1) {
                    N4 = new ArrayList(fArr.length);
                    int length12 = fArr.length;
                    while (i5 < length12) {
                        N4.add(Float.valueOf(fArr[i5]));
                        i5++;
                    }
                } else {
                    N4 = y.N(Float.valueOf(fArr[0]));
                }
            }
            return a(N4, interfaceC0781y, m3.j.FLOAT);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            AbstractC0219i.e("<this>", dArr);
            int length13 = dArr.length;
            if (length13 != 0) {
                if (length13 != 1) {
                    N4 = new ArrayList(dArr.length);
                    int length14 = dArr.length;
                    while (i5 < length14) {
                        N4.add(Double.valueOf(dArr[i5]));
                        i5++;
                    }
                } else {
                    N4 = y.N(Double.valueOf(dArr[0]));
                }
            }
            return a(N4, interfaceC0781y, m3.j.DOUBLE);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new t(null);
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        AbstractC0219i.e("<this>", zArr);
        int length15 = zArr.length;
        if (length15 != 0) {
            if (length15 != 1) {
                N4 = new ArrayList(zArr.length);
                int length16 = zArr.length;
                while (i5 < length16) {
                    N4.add(Boolean.valueOf(zArr[i5]));
                    i5++;
                }
            } else {
                N4 = y.N(Boolean.valueOf(zArr[0]));
            }
        }
        return a(N4, interfaceC0781y, m3.j.BOOLEAN);
    }
}
