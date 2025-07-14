package com.google.android.gms.internal.p000firebaseauthapi;

import A3.f;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f5262a;

    /* renamed from: b, reason: collision with root package name */
    public static final E f5263b;

    /* renamed from: c, reason: collision with root package name */
    public static final E f5264c;

    /* renamed from: d, reason: collision with root package name */
    public static final E f5265d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f5262a = cls;
        f5263b = w(false);
        f5264c = w(true);
        f5265d = new E();
    }

    public static int A(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU0 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            iU0 += f5.u0(((Integer) list.get(i5)).intValue());
        }
        return iU0;
    }

    public static int B(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (f5.a0(i5 << 3) + 4) * size;
    }

    public static int C(List list) {
        return list.size() * 4;
    }

    public static int D(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (f5.a0(i5 << 3) + 8) * size;
    }

    public static int E(List list) {
        return list.size() * 8;
    }

    public static int F(int i5, List list, A a5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT0 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            iT0 += f5.t0(i5, (U4) list.get(i6), a5);
        }
        return iT0;
    }

    public static int G(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (f5.Z(i5) * size) + H(list);
    }

    public static int H(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU0 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            iU0 += f5.u0(((Integer) list.get(i5)).intValue());
        }
        return iU0;
    }

    public static int I(int i5, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (f5.Z(i5) * list.size()) + J(list);
    }

    public static int J(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            iB0 += f5.b0(((Long) list.get(i5)).longValue());
        }
        return iB0;
    }

    public static int K(int i5, A a5, Object obj) {
        U4 u4 = (U4) obj;
        int iA0 = f5.a0(i5 << 3);
        m5 m5Var = (m5) u4;
        int iJ = m5Var.zzd;
        if (iJ == -1) {
            iJ = a5.j(u4);
            m5Var.zzd = iJ;
        }
        return f.j(iJ, iJ, iA0);
    }

    public static int L(int i5, List list, A a5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZ = f5.Z(i5) * size;
        for (int i6 = 0; i6 < size; i6++) {
            U4 u4 = (U4) list.get(i6);
            m5 m5Var = (m5) u4;
            int iJ = m5Var.zzd;
            if (iJ == -1) {
                iJ = a5.j(u4);
                m5Var.zzd = iJ;
            }
            iZ = f.j(iJ, iJ, iZ);
        }
        return iZ;
    }

    public static int M(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (f5.Z(i5) * size) + N(list);
    }

    public static int N(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA0 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            int iIntValue = ((Integer) list.get(i5)).intValue();
            iA0 += f5.a0((iIntValue >> 31) ^ (iIntValue + iIntValue));
        }
        return iA0;
    }

    public static int O(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (f5.Z(i5) * size) + P(list);
    }

    public static int P(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            long jLongValue = ((Long) list.get(i5)).longValue();
            iB0 += f5.b0((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iB0;
    }

    public static int Q(int i5, List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        int iZ = f5.Z(i5) * size;
        if (list instanceof InterfaceC0276i) {
            InterfaceC0276i interfaceC0276i = (InterfaceC0276i) list;
            while (i6 < size) {
                Object objK = interfaceC0276i.k(i6);
                if (objK instanceof Z4) {
                    int iN = ((Z4) objK).n();
                    iZ = f.j(iN, iN, iZ);
                } else {
                    iZ = f5.Y((String) objK) + iZ;
                }
                i6++;
            }
        } else {
            while (i6 < size) {
                Object obj = list.get(i6);
                if (obj instanceof Z4) {
                    int iN2 = ((Z4) obj).n();
                    iZ = f.j(iN2, iN2, iZ);
                } else {
                    iZ = f5.Y((String) obj) + iZ;
                }
                i6++;
            }
        }
        return iZ;
    }

    public static int R(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (f5.Z(i5) * size) + S(list);
    }

    public static int S(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA0 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            iA0 += f5.a0(((Integer) list.get(i5)).intValue());
        }
        return iA0;
    }

    public static int T(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (f5.Z(i5) * size) + U(list);
    }

    public static int U(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            iB0 += f5.b0(((Long) list.get(i5)).longValue());
        }
        return iB0;
    }

    public static Object a(int i5, List list, Object obj, E e5) {
        return obj;
    }

    public static void b(E e5, m5 m5Var, m5 m5Var2) {
        e5.getClass();
        D d5 = m5Var.zzc;
        D d6 = m5Var2.zzc;
        if (!d6.equals(D.f)) {
            int i5 = d5.f5283a + d6.f5283a;
            int[] iArrCopyOf = Arrays.copyOf(d5.f5284b, i5);
            System.arraycopy(d6.f5284b, 0, iArrCopyOf, d5.f5283a, d6.f5283a);
            Object[] objArrCopyOf = Arrays.copyOf(d5.f5285c, i5);
            System.arraycopy(d6.f5285c, 0, objArrCopyOf, d5.f5283a, d6.f5283a);
            d5 = new D(i5, iArrCopyOf, objArrCopyOf, true);
        }
        m5Var.zzc = d5;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void d(int i5, List list, C0306n c0306n, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f5 f5Var = (f5) c0306n.f5568e;
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                f5Var.e0(i5, ((Boolean) list.get(i6)).booleanValue());
                i6++;
            }
            return;
        }
        f5Var.o0(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Boolean) list.get(i8)).getClass();
            i7++;
        }
        f5Var.q0(i7);
        while (i6 < list.size()) {
            f5Var.d0(((Boolean) list.get(i6)).booleanValue() ? (byte) 1 : (byte) 0);
            i6++;
        }
    }

    public static void e(int i5, List list, C0306n c0306n) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0306n.getClass();
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((f5) c0306n.f5568e).f0(i5, (Z4) list.get(i6));
        }
    }

    public static void f(int i5, List list, C0306n c0306n, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f5 f5Var = (f5) c0306n.f5568e;
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                f5Var.i0(i5, Double.doubleToRawLongBits(((Double) list.get(i6)).doubleValue()));
                i6++;
            }
            return;
        }
        f5Var.o0(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Double) list.get(i8)).getClass();
            i7 += 8;
        }
        f5Var.q0(i7);
        while (i6 < list.size()) {
            f5Var.j0(Double.doubleToRawLongBits(((Double) list.get(i6)).doubleValue()));
            i6++;
        }
    }

    public static void g(int i5, List list, C0306n c0306n, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f5 f5Var = (f5) c0306n.f5568e;
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                f5Var.k0(i5, ((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        f5Var.o0(i5, 2);
        int iU0 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            iU0 += f5.u0(((Integer) list.get(i7)).intValue());
        }
        f5Var.q0(iU0);
        while (i6 < list.size()) {
            f5Var.l0(((Integer) list.get(i6)).intValue());
            i6++;
        }
    }

    public static void h(int i5, List list, C0306n c0306n, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f5 f5Var = (f5) c0306n.f5568e;
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                f5Var.g0(i5, ((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        f5Var.o0(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Integer) list.get(i8)).getClass();
            i7 += 4;
        }
        f5Var.q0(i7);
        while (i6 < list.size()) {
            f5Var.h0(((Integer) list.get(i6)).intValue());
            i6++;
        }
    }

    public static void i(int i5, List list, C0306n c0306n, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f5 f5Var = (f5) c0306n.f5568e;
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                f5Var.i0(i5, ((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        f5Var.o0(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Long) list.get(i8)).getClass();
            i7 += 8;
        }
        f5Var.q0(i7);
        while (i6 < list.size()) {
            f5Var.j0(((Long) list.get(i6)).longValue());
            i6++;
        }
    }

    public static void j(int i5, List list, C0306n c0306n, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f5 f5Var = (f5) c0306n.f5568e;
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                f5Var.g0(i5, Float.floatToRawIntBits(((Float) list.get(i6)).floatValue()));
                i6++;
            }
            return;
        }
        f5Var.o0(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Float) list.get(i8)).getClass();
            i7 += 4;
        }
        f5Var.q0(i7);
        while (i6 < list.size()) {
            f5Var.h0(Float.floatToRawIntBits(((Float) list.get(i6)).floatValue()));
            i6++;
        }
    }

    public static void k(int i5, List list, C0306n c0306n, A a5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            c0306n.z(i5, a5, list.get(i6));
        }
    }

    public static void l(int i5, List list, C0306n c0306n, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f5 f5Var = (f5) c0306n.f5568e;
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                f5Var.k0(i5, ((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        f5Var.o0(i5, 2);
        int iU0 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            iU0 += f5.u0(((Integer) list.get(i7)).intValue());
        }
        f5Var.q0(iU0);
        while (i6 < list.size()) {
            f5Var.l0(((Integer) list.get(i6)).intValue());
            i6++;
        }
    }

    public static void m(int i5, List list, C0306n c0306n, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f5 f5Var = (f5) c0306n.f5568e;
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                f5Var.r0(i5, ((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        f5Var.o0(i5, 2);
        int iB0 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            iB0 += f5.b0(((Long) list.get(i7)).longValue());
        }
        f5Var.q0(iB0);
        while (i6 < list.size()) {
            f5Var.s0(((Long) list.get(i6)).longValue());
            i6++;
        }
    }

    public static void n(int i5, List list, C0306n c0306n, A a5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            c0306n.C(i5, a5, list.get(i6));
        }
    }

    public static void o(int i5, List list, C0306n c0306n, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f5 f5Var = (f5) c0306n.f5568e;
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                f5Var.g0(i5, ((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        f5Var.o0(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Integer) list.get(i8)).getClass();
            i7 += 4;
        }
        f5Var.q0(i7);
        while (i6 < list.size()) {
            f5Var.h0(((Integer) list.get(i6)).intValue());
            i6++;
        }
    }

    public static void p(int i5, List list, C0306n c0306n, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f5 f5Var = (f5) c0306n.f5568e;
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                f5Var.i0(i5, ((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        f5Var.o0(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Long) list.get(i8)).getClass();
            i7 += 8;
        }
        f5Var.q0(i7);
        while (i6 < list.size()) {
            f5Var.j0(((Long) list.get(i6)).longValue());
            i6++;
        }
    }

    public static void q(int i5, List list, C0306n c0306n, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f5 f5Var = (f5) c0306n.f5568e;
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                int iIntValue = ((Integer) list.get(i6)).intValue();
                f5Var.p0(i5, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i6++;
            }
            return;
        }
        f5Var.o0(i5, 2);
        int iA0 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            int iIntValue2 = ((Integer) list.get(i7)).intValue();
            iA0 += f5.a0((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        f5Var.q0(iA0);
        while (i6 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i6)).intValue();
            f5Var.q0((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i6++;
        }
    }

    public static void r(int i5, List list, C0306n c0306n, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f5 f5Var = (f5) c0306n.f5568e;
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                long jLongValue = ((Long) list.get(i6)).longValue();
                f5Var.r0(i5, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i6++;
            }
            return;
        }
        f5Var.o0(i5, 2);
        int iB0 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            long jLongValue2 = ((Long) list.get(i7)).longValue();
            iB0 += f5.b0((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        f5Var.q0(iB0);
        while (i6 < list.size()) {
            long jLongValue3 = ((Long) list.get(i6)).longValue();
            f5Var.s0((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i6++;
        }
    }

    public static void s(int i5, List list, C0306n c0306n) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0306n.getClass();
        boolean z4 = list instanceof InterfaceC0276i;
        int i6 = 0;
        f5 f5Var = (f5) c0306n.f5568e;
        if (!z4) {
            while (i6 < list.size()) {
                f5Var.n0(i5, (String) list.get(i6));
                i6++;
            }
            return;
        }
        InterfaceC0276i interfaceC0276i = (InterfaceC0276i) list;
        while (i6 < list.size()) {
            Object objK = interfaceC0276i.k(i6);
            if (objK instanceof String) {
                f5Var.n0(i5, (String) objK);
            } else {
                f5Var.f0(i5, (Z4) objK);
            }
            i6++;
        }
    }

    public static void t(int i5, List list, C0306n c0306n, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f5 f5Var = (f5) c0306n.f5568e;
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                f5Var.p0(i5, ((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        f5Var.o0(i5, 2);
        int iA0 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            iA0 += f5.a0(((Integer) list.get(i7)).intValue());
        }
        f5Var.q0(iA0);
        while (i6 < list.size()) {
            f5Var.q0(((Integer) list.get(i6)).intValue());
            i6++;
        }
    }

    public static int u(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (f5.a0(i5 << 3) + 1) * size;
    }

    public static void v(int i5, List list, C0306n c0306n, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f5 f5Var = (f5) c0306n.f5568e;
        int i6 = 0;
        if (!z4) {
            while (i6 < list.size()) {
                f5Var.r0(i5, ((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        f5Var.o0(i5, 2);
        int iB0 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            iB0 += f5.b0(((Long) list.get(i7)).longValue());
        }
        f5Var.q0(iB0);
        while (i6 < list.size()) {
            f5Var.s0(((Long) list.get(i6)).longValue());
            i6++;
        }
    }

    public static E w(boolean z4) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (E) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z4));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int x(List list) {
        return list.size();
    }

    public static int y(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZ = f5.Z(i5) * size;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int iN = ((Z4) list.get(i6)).n();
            iZ = f.j(iN, iN, iZ);
        }
        return iZ;
    }

    public static int z(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (f5.Z(i5) * size) + A(list);
    }
}
