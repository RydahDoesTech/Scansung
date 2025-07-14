package com.google.android.gms.internal.p000firebaseauthapi;

import A3.f;
import I0.d;
import com.samsung.android.knox.custom.CustomDeviceManager;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0341t implements A {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f5623m = new int[0];
    public static final Unsafe n = L.j();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f5624a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f5625b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5626c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5627d;

    /* renamed from: e, reason: collision with root package name */
    public final U4 f5628e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5629g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f5630h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5631i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5632j;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0294l f5633k;

    /* renamed from: l, reason: collision with root package name */
    public final E f5634l;

    public C0341t(int[] iArr, Object[] objArr, int i5, int i6, U4 u4, boolean z4, int[] iArr2, int i7, int i8, AbstractC0294l abstractC0294l, E e5, h5 h5Var, C0318p c0318p) {
        this.f5624a = iArr;
        this.f5625b = objArr;
        this.f5626c = i5;
        this.f5627d = i6;
        this.f = u4 instanceof m5;
        this.f5629g = z4;
        this.f5630h = iArr2;
        this.f5631i = i7;
        this.f5632j = i8;
        this.f5633k = abstractC0294l;
        this.f5634l = e5;
        this.f5628e = u4;
    }

    public static boolean A(int i5, A a5, Object obj) {
        return a5.h(L.f5338c.m(i5 & 1048575, obj));
    }

    public static final void D(int i5, Object obj, C0306n c0306n) {
        if (!(obj instanceof String)) {
            c0306n.o(i5, (Z4) obj);
        } else {
            ((f5) c0306n.f5568e).n0(i5, (String) obj);
        }
    }

    public static C0341t F(C0377z c0377z, AbstractC0294l abstractC0294l, E e5, h5 h5Var, C0318p c0318p) {
        if (c0377z instanceof C0377z) {
            return G(c0377z, abstractC0294l, e5, h5Var, c0318p);
        }
        c0377z.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x037a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.p000firebaseauthapi.C0341t G(com.google.android.gms.internal.p000firebaseauthapi.C0377z r32, com.google.android.gms.internal.p000firebaseauthapi.AbstractC0294l r33, com.google.android.gms.internal.p000firebaseauthapi.E r34, com.google.android.gms.internal.p000firebaseauthapi.h5 r35, com.google.android.gms.internal.p000firebaseauthapi.C0318p r36) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.C0341t.G(com.google.android.gms.internal.firebase-auth-api.z, com.google.android.gms.internal.firebase-auth-api.l, com.google.android.gms.internal.firebase-auth-api.E, com.google.android.gms.internal.firebase-auth-api.h5, com.google.android.gms.internal.firebase-auth-api.p):com.google.android.gms.internal.firebase-auth-api.t");
    }

    public static int J(long j5, Object obj) {
        return ((Integer) L.f5338c.m(j5, obj)).intValue();
    }

    public static int l(int i5) {
        return (i5 >>> 20) & CustomDeviceManager.CALL_SCREEN_ALL;
    }

    public static long n(long j5, Object obj) {
        return ((Long) L.f5338c.m(j5, obj)).longValue();
    }

    public static Field s(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            throw new RuntimeException(f.p(sb, " not found. Known fields are ", string));
        }
    }

    public final boolean B(int i5, Object obj, int i6) {
        return L.f5338c.j((long) (this.f5624a[i6 + 2] & 1048575), obj) == i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void C(Object obj, C0306n c0306n) {
        int i5;
        boolean z4;
        int[] iArr = this.f5624a;
        int length = iArr.length;
        Unsafe unsafe = n;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int iM = m(i8);
            int i10 = iArr[i8];
            int iL = l(iM);
            if (iL <= 17) {
                int i11 = iArr[i8 + 2];
                int i12 = i11 & i6;
                if (i12 != i7) {
                    i9 = unsafe.getInt(obj, i12);
                    i7 = i12;
                }
                i5 = 1 << (i11 >>> 20);
            } else {
                i5 = 0;
            }
            int i13 = i5;
            long j5 = iM & i6;
            switch (iL) {
                case 0:
                    if ((i9 & i13) != 0) {
                        c0306n.r(i10, L.d(j5, obj));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 1:
                    if ((i9 & i13) != 0) {
                        c0306n.y(i10, L.e(j5, obj));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 2:
                    if ((i9 & i13) != 0) {
                        c0306n.B(i10, unsafe.getLong(obj, j5));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 3:
                    if ((i9 & i13) != 0) {
                        c0306n.g(i10, unsafe.getLong(obj, j5));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 4:
                    if ((i9 & i13) != 0) {
                        c0306n.A(i10, unsafe.getInt(obj, j5));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 5:
                    if ((i9 & i13) != 0) {
                        c0306n.x(i10, unsafe.getLong(obj, j5));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 6:
                    if ((i9 & i13) != 0) {
                        c0306n.w(i10, unsafe.getInt(obj, j5));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 7:
                    if ((i9 & i13) != 0) {
                        c0306n.k(i10, L.v(j5, obj));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 8:
                    if ((i9 & i13) != 0) {
                        D(i10, unsafe.getObject(obj, j5), c0306n);
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 9:
                    if ((i9 & i13) != 0) {
                        c0306n.C(i10, p(i8), unsafe.getObject(obj, j5));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 10:
                    if ((i9 & i13) != 0) {
                        c0306n.o(i10, (Z4) unsafe.getObject(obj, j5));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 11:
                    if ((i9 & i13) != 0) {
                        c0306n.f(i10, unsafe.getInt(obj, j5));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 12:
                    if ((i9 & i13) != 0) {
                        c0306n.v(i10, unsafe.getInt(obj, j5));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 13:
                    if ((i9 & i13) != 0) {
                        c0306n.D(i10, unsafe.getInt(obj, j5));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 14:
                    if ((i9 & i13) != 0) {
                        c0306n.E(i10, unsafe.getLong(obj, j5));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 15:
                    if ((i9 & i13) != 0) {
                        c0306n.c(i10, unsafe.getInt(obj, j5));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 16:
                    if ((i9 & i13) != 0) {
                        c0306n.d(i10, unsafe.getLong(obj, j5));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 17:
                    if ((i9 & i13) != 0) {
                        c0306n.z(i10, p(i8), unsafe.getObject(obj, j5));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 18:
                    B.f(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, false);
                    i8 += 3;
                    i6 = 1048575;
                case 19:
                    B.j(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, false);
                    i8 += 3;
                    i6 = 1048575;
                case 20:
                    B.m(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, false);
                    i8 += 3;
                    i6 = 1048575;
                case 21:
                    B.v(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, false);
                    i8 += 3;
                    i6 = 1048575;
                case 22:
                    B.l(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, false);
                    i8 += 3;
                    i6 = 1048575;
                case 23:
                    B.i(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, false);
                    i8 += 3;
                    i6 = 1048575;
                case 24:
                    B.h(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, false);
                    i8 += 3;
                    i6 = 1048575;
                case 25:
                    B.d(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, false);
                    i8 += 3;
                    i6 = 1048575;
                case 26:
                    B.s(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n);
                    i8 += 3;
                    i6 = 1048575;
                case 27:
                    B.n(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, p(i8));
                    i8 += 3;
                    i6 = 1048575;
                case 28:
                    B.e(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n);
                    i8 += 3;
                    i6 = 1048575;
                case 29:
                    z4 = false;
                    B.t(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, false);
                    i8 += 3;
                    i6 = 1048575;
                case 30:
                    z4 = false;
                    B.g(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, false);
                    i8 += 3;
                    i6 = 1048575;
                case 31:
                    z4 = false;
                    B.o(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, false);
                    i8 += 3;
                    i6 = 1048575;
                case 32:
                    z4 = false;
                    B.p(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, false);
                    i8 += 3;
                    i6 = 1048575;
                case 33:
                    z4 = false;
                    B.q(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, false);
                    i8 += 3;
                    i6 = 1048575;
                case 34:
                    z4 = false;
                    B.r(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, false);
                    i8 += 3;
                    i6 = 1048575;
                case 35:
                    B.f(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, true);
                    i8 += 3;
                    i6 = 1048575;
                case 36:
                    B.j(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, true);
                    i8 += 3;
                    i6 = 1048575;
                case 37:
                    B.m(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, true);
                    i8 += 3;
                    i6 = 1048575;
                case 38:
                    B.v(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, true);
                    i8 += 3;
                    i6 = 1048575;
                case 39:
                    B.l(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, true);
                    i8 += 3;
                    i6 = 1048575;
                case 40:
                    B.i(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, true);
                    i8 += 3;
                    i6 = 1048575;
                case 41:
                    B.h(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, true);
                    i8 += 3;
                    i6 = 1048575;
                case 42:
                    B.d(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, true);
                    i8 += 3;
                    i6 = 1048575;
                case 43:
                    B.t(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, true);
                    i8 += 3;
                    i6 = 1048575;
                case 44:
                    B.g(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, true);
                    i8 += 3;
                    i6 = 1048575;
                case 45:
                    B.o(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, true);
                    i8 += 3;
                    i6 = 1048575;
                case 46:
                    B.p(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, true);
                    i8 += 3;
                    i6 = 1048575;
                case 47:
                    B.q(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, true);
                    i8 += 3;
                    i6 = 1048575;
                case 48:
                    B.r(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, true);
                    i8 += 3;
                    i6 = 1048575;
                case 49:
                    B.k(iArr[i8], (List) unsafe.getObject(obj, j5), c0306n, p(i8));
                    i8 += 3;
                    i6 = 1048575;
                case 50:
                    if (unsafe.getObject(obj, j5) != null) {
                        r(i8).getClass();
                        throw new ClassCastException();
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 51:
                    if (B(i10, obj, i8)) {
                        c0306n.r(i10, ((Double) L.f5338c.m(j5, obj)).doubleValue());
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 52:
                    if (B(i10, obj, i8)) {
                        c0306n.y(i10, ((Float) L.f5338c.m(j5, obj)).floatValue());
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 53:
                    if (B(i10, obj, i8)) {
                        c0306n.B(i10, n(j5, obj));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 54:
                    if (B(i10, obj, i8)) {
                        c0306n.g(i10, n(j5, obj));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 55:
                    if (B(i10, obj, i8)) {
                        c0306n.A(i10, J(j5, obj));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 56:
                    if (B(i10, obj, i8)) {
                        c0306n.x(i10, n(j5, obj));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 57:
                    if (B(i10, obj, i8)) {
                        c0306n.w(i10, J(j5, obj));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 58:
                    if (B(i10, obj, i8)) {
                        c0306n.k(i10, ((Boolean) L.f5338c.m(j5, obj)).booleanValue());
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 59:
                    if (B(i10, obj, i8)) {
                        D(i10, unsafe.getObject(obj, j5), c0306n);
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 60:
                    if (B(i10, obj, i8)) {
                        c0306n.C(i10, p(i8), unsafe.getObject(obj, j5));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 61:
                    if (B(i10, obj, i8)) {
                        c0306n.o(i10, (Z4) unsafe.getObject(obj, j5));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 62:
                    if (B(i10, obj, i8)) {
                        c0306n.f(i10, J(j5, obj));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 63:
                    if (B(i10, obj, i8)) {
                        c0306n.v(i10, J(j5, obj));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 64:
                    if (B(i10, obj, i8)) {
                        c0306n.D(i10, J(j5, obj));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 65:
                    if (B(i10, obj, i8)) {
                        c0306n.E(i10, n(j5, obj));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 66:
                    if (B(i10, obj, i8)) {
                        c0306n.c(i10, J(j5, obj));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 67:
                    if (B(i10, obj, i8)) {
                        c0306n.d(i10, n(j5, obj));
                    }
                    i8 += 3;
                    i6 = 1048575;
                case 68:
                    if (B(i10, obj, i8)) {
                        c0306n.z(i10, p(i8), unsafe.getObject(obj, j5));
                    }
                    i8 += 3;
                    i6 = 1048575;
                default:
                    i8 += 3;
                    i6 = 1048575;
            }
        }
        this.f5634l.getClass();
        E.e(E.b(obj), c0306n);
    }

    public final int E(Object obj, byte[] bArr, int i5, int i6, int i7, d dVar) {
        Unsafe unsafe;
        int i8;
        Object obj2;
        int i9;
        int iU;
        int i10;
        int iK;
        int iK2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        char c2;
        int i21;
        int i22;
        int iW;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        C0341t c0341t = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i28 = i6;
        int i29 = i7;
        d dVar2 = dVar;
        Unsafe unsafe2 = n;
        int iS = i5;
        int i30 = 0;
        int i31 = -1;
        int i32 = 0;
        int i33 = 0;
        int i34 = 1048575;
        while (true) {
            if (iS < i28) {
                int i35 = iS + 1;
                byte b2 = bArr2[iS];
                if (b2 < 0) {
                    iU = AbstractC0335s.U(b2, bArr2, i35, dVar2);
                    i9 = dVar2.f858a;
                } else {
                    i9 = b2;
                    iU = i35;
                }
                int i36 = i9 >>> 3;
                int i37 = i9 & 7;
                int i38 = c0341t.f5627d;
                int i39 = iU;
                int i40 = c0341t.f5626c;
                int i41 = i9;
                if (i36 > i31) {
                    iK2 = (i36 < i40 || i36 > i38) ? -1 : c0341t.k(i36, i32 / 3);
                    i11 = -1;
                    i10 = 0;
                } else {
                    if (i36 < i40 || i36 > i38) {
                        i10 = 0;
                        iK = -1;
                    } else {
                        i10 = 0;
                        iK = c0341t.k(i36, 0);
                    }
                    iK2 = iK;
                    i11 = -1;
                }
                if (iK2 == i11) {
                    i12 = i33;
                    i13 = i34;
                    i14 = i36;
                    i15 = i10;
                    unsafe = unsafe2;
                    i8 = i29;
                    obj2 = obj3;
                    i16 = i41;
                    i17 = i39;
                } else {
                    int[] iArr = c0341t.f5624a;
                    int i42 = iArr[iK2 + 1];
                    int iL = l(i42);
                    long j5 = i42 & 1048575;
                    if (iL <= 17) {
                        int i43 = iArr[iK2 + 2];
                        int i44 = 1 << (i43 >>> 20);
                        int i45 = i43 & 1048575;
                        if (i45 != i34) {
                            i18 = iL;
                            if (i34 != 1048575) {
                                unsafe2.putInt(obj3, i34, i33);
                            }
                            i13 = i45;
                            i19 = unsafe2.getInt(obj3, i45);
                        } else {
                            i18 = iL;
                            i19 = i33;
                            i13 = i34;
                        }
                        switch (i18) {
                            case 0:
                                i21 = i39;
                                c2 = 65535;
                                i20 = iK2;
                                i22 = i41;
                                bArr2 = bArr;
                                if (i37 == 1) {
                                    L.n(obj3, j5, Double.longBitsToDouble(AbstractC0335s.X(i21, bArr2)));
                                    iS = i21 + 8;
                                    i33 = i19 | i44;
                                    i31 = i36;
                                    i30 = i22;
                                    i32 = i20;
                                    i34 = i13;
                                    i28 = i6;
                                    i29 = i7;
                                    break;
                                } else {
                                    i17 = i21;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i12 = i19;
                                    i14 = i36;
                                    i8 = i7;
                                    break;
                                }
                            case 1:
                                i21 = i39;
                                c2 = 65535;
                                i20 = iK2;
                                i22 = i41;
                                bArr2 = bArr;
                                if (i37 == 5) {
                                    L.o(obj3, j5, Float.intBitsToFloat(AbstractC0335s.o(i21, bArr2)));
                                    iS = i21 + 4;
                                    i33 = i19 | i44;
                                    i31 = i36;
                                    i30 = i22;
                                    i32 = i20;
                                    i34 = i13;
                                    i28 = i6;
                                    i29 = i7;
                                    break;
                                } else {
                                    i17 = i21;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i12 = i19;
                                    i14 = i36;
                                    i8 = i7;
                                    break;
                                }
                            case 2:
                            case 3:
                                i21 = i39;
                                c2 = 65535;
                                i20 = iK2;
                                i22 = i41;
                                bArr2 = bArr;
                                if (i37 == 0) {
                                    iW = AbstractC0335s.W(bArr2, i21, dVar2);
                                    unsafe2.putLong(obj, j5, dVar2.f859b);
                                    i33 = i19 | i44;
                                    i31 = i36;
                                    iS = iW;
                                    i30 = i22;
                                    i32 = i20;
                                    i34 = i13;
                                    i28 = i6;
                                    i29 = i7;
                                    break;
                                } else {
                                    i17 = i21;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i12 = i19;
                                    i14 = i36;
                                    i8 = i7;
                                    break;
                                }
                            case 4:
                            case 11:
                                i21 = i39;
                                c2 = 65535;
                                i20 = iK2;
                                i22 = i41;
                                bArr2 = bArr;
                                if (i37 == 0) {
                                    iS = AbstractC0335s.T(bArr2, i21, dVar2);
                                    unsafe2.putInt(obj3, j5, dVar2.f858a);
                                    i33 = i19 | i44;
                                    i31 = i36;
                                    i30 = i22;
                                    i32 = i20;
                                    i34 = i13;
                                    i28 = i6;
                                    i29 = i7;
                                    break;
                                } else {
                                    i17 = i21;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i12 = i19;
                                    i14 = i36;
                                    i8 = i7;
                                    break;
                                }
                            case 5:
                            case 14:
                                i23 = i39;
                                c2 = 65535;
                                i20 = iK2;
                                i22 = i41;
                                bArr2 = bArr;
                                if (i37 == 1) {
                                    unsafe2.putLong(obj, j5, AbstractC0335s.X(i23, bArr2));
                                    iS = i23 + 8;
                                    i33 = i19 | i44;
                                    i31 = i36;
                                    i30 = i22;
                                    i32 = i20;
                                    i34 = i13;
                                    i28 = i6;
                                    i29 = i7;
                                    break;
                                } else {
                                    i21 = i23;
                                    i17 = i21;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i12 = i19;
                                    i14 = i36;
                                    i8 = i7;
                                    break;
                                }
                            case 6:
                            case 13:
                                i24 = i6;
                                i23 = i39;
                                c2 = 65535;
                                i20 = iK2;
                                i22 = i41;
                                bArr2 = bArr;
                                if (i37 == 5) {
                                    unsafe2.putInt(obj3, j5, AbstractC0335s.o(i23, bArr2));
                                    iS = i23 + 4;
                                    i31 = i36;
                                    i32 = i20;
                                    i34 = i13;
                                    i28 = i24;
                                    i33 = i19 | i44;
                                    i30 = i22;
                                    i29 = i7;
                                    break;
                                } else {
                                    i21 = i23;
                                    i17 = i21;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i12 = i19;
                                    i14 = i36;
                                    i8 = i7;
                                    break;
                                }
                            case 7:
                                i23 = i39;
                                c2 = 65535;
                                i20 = iK2;
                                i22 = i41;
                                bArr2 = bArr;
                                if (i37 == 0) {
                                    int iW2 = AbstractC0335s.W(bArr2, i23, dVar2);
                                    L.l(obj3, j5, dVar2.f859b != 0);
                                    i31 = i36;
                                    i30 = i22;
                                    i32 = i20;
                                    i34 = i13;
                                    i29 = i7;
                                    i28 = i6;
                                    i33 = i19 | i44;
                                    iS = iW2;
                                    break;
                                } else {
                                    i21 = i23;
                                    i17 = i21;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i12 = i19;
                                    i14 = i36;
                                    i8 = i7;
                                    break;
                                }
                            case 8:
                                i24 = i6;
                                i23 = i39;
                                c2 = 65535;
                                i20 = iK2;
                                i22 = i41;
                                bArr2 = bArr;
                                if (i37 == 2) {
                                    iS = (i42 & 536870912) == 0 ? AbstractC0335s.P(bArr2, i23, dVar2) : AbstractC0335s.R(bArr2, i23, dVar2);
                                    unsafe2.putObject(obj3, j5, dVar2.f860c);
                                    i31 = i36;
                                    i32 = i20;
                                    i34 = i13;
                                    i28 = i24;
                                    i33 = i19 | i44;
                                    i30 = i22;
                                    i29 = i7;
                                    break;
                                } else {
                                    i21 = i23;
                                    i17 = i21;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i12 = i19;
                                    i14 = i36;
                                    i8 = i7;
                                    break;
                                }
                            case 9:
                                i20 = iK2;
                                i23 = i39;
                                i22 = i41;
                                c2 = 65535;
                                bArr2 = bArr;
                                if (i37 == 2) {
                                    i24 = i6;
                                    iS = AbstractC0335s.E(c0341t.p(i20), bArr2, i23, i24, dVar2);
                                    if ((i19 & i44) == 0) {
                                        unsafe2.putObject(obj3, j5, dVar2.f860c);
                                    } else {
                                        unsafe2.putObject(obj3, j5, AbstractC0246d.b(unsafe2.getObject(obj3, j5), dVar2.f860c));
                                    }
                                    i31 = i36;
                                    i32 = i20;
                                    i34 = i13;
                                    i28 = i24;
                                    i33 = i19 | i44;
                                    i30 = i22;
                                    i29 = i7;
                                    break;
                                } else {
                                    i21 = i23;
                                    i17 = i21;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i12 = i19;
                                    i14 = i36;
                                    i8 = i7;
                                    break;
                                }
                            case 10:
                                i20 = iK2;
                                i25 = i39;
                                i22 = i41;
                                c2 = 65535;
                                bArr2 = bArr;
                                if (i37 == 2) {
                                    iS = AbstractC0335s.a(bArr2, i25, dVar2);
                                    unsafe2.putObject(obj3, j5, dVar2.f860c);
                                    i33 = i19 | i44;
                                    i31 = i36;
                                    i30 = i22;
                                    i32 = i20;
                                    i34 = i13;
                                    i28 = i6;
                                    i29 = i7;
                                    break;
                                } else {
                                    i21 = i25;
                                    i17 = i21;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i12 = i19;
                                    i14 = i36;
                                    i8 = i7;
                                    break;
                                }
                            case 12:
                                i20 = iK2;
                                i25 = i39;
                                i22 = i41;
                                c2 = 65535;
                                bArr2 = bArr;
                                if (i37 == 0) {
                                    iS = AbstractC0335s.T(bArr2, i25, dVar2);
                                    int i46 = dVar2.f858a;
                                    c0341t.o(i20);
                                    unsafe2.putInt(obj3, j5, i46);
                                    i33 = i19 | i44;
                                    i31 = i36;
                                    i30 = i22;
                                    i32 = i20;
                                    i34 = i13;
                                    i28 = i6;
                                    i29 = i7;
                                    break;
                                } else {
                                    i21 = i25;
                                    i17 = i21;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i12 = i19;
                                    i14 = i36;
                                    i8 = i7;
                                    break;
                                }
                            case 15:
                                i20 = iK2;
                                i25 = i39;
                                i22 = i41;
                                c2 = 65535;
                                bArr2 = bArr;
                                if (i37 == 0) {
                                    iS = AbstractC0335s.T(bArr2, i25, dVar2);
                                    unsafe2.putInt(obj3, j5, a5.k(dVar2.f858a));
                                    i33 = i19 | i44;
                                    i31 = i36;
                                    i30 = i22;
                                    i32 = i20;
                                    i34 = i13;
                                    i28 = i6;
                                    i29 = i7;
                                    break;
                                } else {
                                    i21 = i25;
                                    i17 = i21;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i12 = i19;
                                    i14 = i36;
                                    i8 = i7;
                                    break;
                                }
                            case 16:
                                i20 = iK2;
                                i25 = i39;
                                c2 = 65535;
                                if (i37 == 0) {
                                    bArr2 = bArr;
                                    iW = AbstractC0335s.W(bArr2, i25, dVar2);
                                    i22 = i41;
                                    unsafe2.putLong(obj, j5, a5.l(dVar2.f859b));
                                    i33 = i19 | i44;
                                    i31 = i36;
                                    iS = iW;
                                    i30 = i22;
                                    i32 = i20;
                                    i34 = i13;
                                    i28 = i6;
                                    i29 = i7;
                                    break;
                                } else {
                                    i22 = i41;
                                    i21 = i25;
                                    i17 = i21;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i12 = i19;
                                    i14 = i36;
                                    i8 = i7;
                                    break;
                                }
                            default:
                                if (i37 == 3) {
                                    int i47 = iK2;
                                    iS = AbstractC0335s.y(c0341t.p(iK2), bArr, i39, i6, (i36 << 3) | 4, dVar);
                                    if ((i19 & i44) == 0) {
                                        unsafe2.putObject(obj3, j5, dVar2.f860c);
                                    } else {
                                        unsafe2.putObject(obj3, j5, AbstractC0246d.b(unsafe2.getObject(obj3, j5), dVar2.f860c));
                                    }
                                    i33 = i19 | i44;
                                    bArr2 = bArr;
                                    i29 = i7;
                                    i31 = i36;
                                    i30 = i41;
                                    i32 = i47;
                                    i34 = i13;
                                    i28 = i6;
                                    break;
                                } else {
                                    i20 = iK2;
                                    c2 = 65535;
                                    i21 = i39;
                                    i22 = i41;
                                    i17 = i21;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i12 = i19;
                                    i14 = i36;
                                    i8 = i7;
                                    break;
                                }
                        }
                    } else {
                        int i48 = iK2;
                        bArr2 = bArr;
                        if (iL != 27) {
                            i12 = i33;
                            i13 = i34;
                            i14 = i36;
                            if (iL <= 49) {
                                unsafe = unsafe2;
                                i15 = i48;
                                iS = N(obj, bArr, i39, i6, i41, i14, i37, i48, i42, iL, j5, dVar);
                                if (iS != i39) {
                                    c0341t = this;
                                    obj3 = obj;
                                    bArr2 = bArr;
                                    i30 = i41;
                                    i28 = i6;
                                    i29 = i7;
                                    dVar2 = dVar;
                                    i33 = i12;
                                    i31 = i14;
                                    i34 = i13;
                                    unsafe2 = unsafe;
                                    i32 = i15;
                                } else {
                                    obj2 = obj;
                                    i16 = i41;
                                    i8 = i7;
                                    i17 = iS;
                                }
                            } else {
                                i26 = i39;
                                unsafe = unsafe2;
                                i27 = i41;
                                i15 = i48;
                                if (iL != 50) {
                                    obj2 = obj;
                                    iS = L(obj, bArr, i26, i6, i27, i14, i37, i42, iL, j5, i15, dVar);
                                    if (iS != i26) {
                                        bArr2 = bArr;
                                        i30 = i27;
                                        i28 = i6;
                                        i29 = i7;
                                        dVar2 = dVar;
                                        obj3 = obj2;
                                        i33 = i12;
                                        i31 = i14;
                                        i32 = i15;
                                        i34 = i13;
                                        unsafe2 = unsafe;
                                        c0341t = this;
                                    } else {
                                        i16 = i27;
                                        i8 = i7;
                                        i17 = iS;
                                        i15 = i15;
                                    }
                                } else if (i37 == 2) {
                                    K(i15, j5, obj);
                                    throw null;
                                }
                            }
                        } else if (i37 == 2) {
                            V4 v4 = (V4) ((InterfaceC0240c) unsafe2.getObject(obj3, j5));
                            boolean zM = v4.m();
                            InterfaceC0240c interfaceC0240c = v4;
                            if (!zM) {
                                int size = v4.size();
                                InterfaceC0240c interfaceC0240cD = v4.d(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj3, j5, interfaceC0240cD);
                                interfaceC0240c = interfaceC0240cD;
                            }
                            i30 = i41;
                            i13 = i34;
                            iS = AbstractC0335s.K(c0341t.p(i48), i30, bArr, i39, i6, interfaceC0240c, dVar);
                            i32 = i48;
                            i33 = i33;
                            i31 = i36;
                            i34 = i13;
                            i28 = i6;
                            i29 = i7;
                        } else {
                            i12 = i33;
                            i13 = i34;
                            i14 = i36;
                            i26 = i39;
                            unsafe = unsafe2;
                            i27 = i41;
                            i15 = i48;
                        }
                        i16 = i27;
                        i8 = i7;
                        i17 = i26;
                        obj2 = obj;
                    }
                }
                if (i16 != i8 || i8 == 0) {
                    m5 m5Var = (m5) obj2;
                    D dB = m5Var.zzc;
                    if (dB == D.f) {
                        dB = D.b();
                        m5Var.zzc = dB;
                    }
                    iS = AbstractC0335s.S(i16, bArr, i17, i6, dB, dVar);
                    bArr2 = bArr;
                    i28 = i6;
                    dVar2 = dVar;
                    i29 = i8;
                    i30 = i16;
                    obj3 = obj2;
                    i33 = i12;
                    i31 = i14;
                    i34 = i13;
                    unsafe2 = unsafe;
                    i32 = i15;
                    c0341t = this;
                } else {
                    iS = i17;
                    i30 = i16;
                    i33 = i12;
                    i34 = i13;
                }
            } else {
                unsafe = unsafe2;
                i8 = i29;
                obj2 = obj3;
            }
        }
        if (i34 != 1048575) {
            unsafe.putInt(obj2, i34, i33);
        }
        for (int i49 = this.f5631i; i49 < this.f5632j; i49++) {
            q(obj2, this.f5630h[i49], null);
        }
        if (i8 == 0) {
            if (iS != i6) {
                throw C0258f.d();
            }
        } else if (iS > i6 || i30 != i8) {
            throw C0258f.d();
        }
        return iS;
    }

    public final int H(U4 u4) {
        int i5;
        int iA0;
        int iB0;
        int iA02;
        int iU0;
        int iK;
        Unsafe unsafe = n;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int iJ = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.f5624a;
            if (i8 >= iArr.length) {
                this.f5634l.getClass();
                return E.a(E.b(u4)) + iJ;
            }
            int iM = m(i8);
            int i10 = iArr[i8];
            int iL = l(iM);
            if (iL <= 17) {
                int i11 = iArr[i8 + 2];
                int i12 = i11 & i6;
                i5 = 1 << (i11 >>> 20);
                if (i12 != i7) {
                    i9 = unsafe.getInt(u4, i12);
                    i7 = i12;
                }
            } else {
                i5 = 0;
            }
            long j5 = iM & i6;
            switch (iL) {
                case 0:
                    if ((i9 & i5) == 0) {
                        break;
                    } else {
                        iJ = f.j(i10 << 3, 8, iJ);
                        break;
                    }
                case 1:
                    if ((i9 & i5) == 0) {
                        break;
                    } else {
                        iJ = f.j(i10 << 3, 4, iJ);
                        break;
                    }
                case 2:
                    if ((i5 & i9) == 0) {
                        break;
                    } else {
                        long j6 = unsafe.getLong(u4, j5);
                        iA0 = f5.a0(i10 << 3);
                        iB0 = f5.b0(j6);
                        iK = iB0 + iA0;
                        iJ += iK;
                        break;
                    }
                case 3:
                    if ((i5 & i9) == 0) {
                        break;
                    } else {
                        long j7 = unsafe.getLong(u4, j5);
                        iA0 = f5.a0(i10 << 3);
                        iB0 = f5.b0(j7);
                        iK = iB0 + iA0;
                        iJ += iK;
                        break;
                    }
                case 4:
                    if ((i5 & i9) == 0) {
                        break;
                    } else {
                        int i13 = unsafe.getInt(u4, j5);
                        iA02 = f5.a0(i10 << 3);
                        iU0 = f5.u0(i13);
                        iK = iU0 + iA02;
                        iJ += iK;
                        break;
                    }
                case 5:
                    if ((i9 & i5) == 0) {
                        break;
                    } else {
                        iJ = f.j(i10 << 3, 8, iJ);
                        break;
                    }
                case 6:
                    if ((i9 & i5) == 0) {
                        break;
                    } else {
                        iJ = f.j(i10 << 3, 4, iJ);
                        break;
                    }
                case 7:
                    if ((i9 & i5) == 0) {
                        break;
                    } else {
                        iJ = f.j(i10 << 3, 1, iJ);
                        break;
                    }
                case 8:
                    if ((i5 & i9) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(u4, j5);
                        if (!(object instanceof Z4)) {
                            iA02 = f5.a0(i10 << 3);
                            iU0 = f5.Y((String) object);
                            iK = iU0 + iA02;
                            iJ += iK;
                            break;
                        } else {
                            int iA03 = f5.a0(i10 << 3);
                            int iN = ((Z4) object).n();
                            iJ = f.k(iN, iN, iA03, iJ);
                            break;
                        }
                    }
                case 9:
                    if ((i5 & i9) == 0) {
                        break;
                    } else {
                        iK = B.K(i10, p(i8), unsafe.getObject(u4, j5));
                        iJ += iK;
                        break;
                    }
                case 10:
                    if ((i5 & i9) == 0) {
                        break;
                    } else {
                        Z4 z4 = (Z4) unsafe.getObject(u4, j5);
                        int iA04 = f5.a0(i10 << 3);
                        int iN2 = z4.n();
                        iJ = f.k(iN2, iN2, iA04, iJ);
                        break;
                    }
                case 11:
                    if ((i5 & i9) == 0) {
                        break;
                    } else {
                        iJ = f.j(unsafe.getInt(u4, j5), f5.a0(i10 << 3), iJ);
                        break;
                    }
                case 12:
                    if ((i5 & i9) == 0) {
                        break;
                    } else {
                        int i14 = unsafe.getInt(u4, j5);
                        iA02 = f5.a0(i10 << 3);
                        iU0 = f5.u0(i14);
                        iK = iU0 + iA02;
                        iJ += iK;
                        break;
                    }
                case 13:
                    if ((i9 & i5) == 0) {
                        break;
                    } else {
                        iJ = f.j(i10 << 3, 4, iJ);
                        break;
                    }
                case 14:
                    if ((i9 & i5) == 0) {
                        break;
                    } else {
                        iJ = f.j(i10 << 3, 8, iJ);
                        break;
                    }
                case 15:
                    if ((i5 & i9) == 0) {
                        break;
                    } else {
                        int i15 = unsafe.getInt(u4, j5);
                        iJ = f.j((i15 >> 31) ^ (i15 + i15), f5.a0(i10 << 3), iJ);
                        break;
                    }
                case 16:
                    if ((i5 & i9) == 0) {
                        break;
                    } else {
                        long j8 = unsafe.getLong(u4, j5);
                        iA0 = f5.a0(i10 << 3);
                        iB0 = f5.b0((j8 >> 63) ^ (j8 + j8));
                        iK = iB0 + iA0;
                        iJ += iK;
                        break;
                    }
                case 17:
                    if ((i5 & i9) == 0) {
                        break;
                    } else {
                        iK = f5.t0(i10, (U4) unsafe.getObject(u4, j5), p(i8));
                        iJ += iK;
                        break;
                    }
                case 18:
                    iK = B.D(i10, (List) unsafe.getObject(u4, j5));
                    iJ += iK;
                    break;
                case 19:
                    iK = B.B(i10, (List) unsafe.getObject(u4, j5));
                    iJ += iK;
                    break;
                case 20:
                    iK = B.I(i10, (List) unsafe.getObject(u4, j5));
                    iJ += iK;
                    break;
                case 21:
                    iK = B.T(i10, (List) unsafe.getObject(u4, j5));
                    iJ += iK;
                    break;
                case 22:
                    iK = B.G(i10, (List) unsafe.getObject(u4, j5));
                    iJ += iK;
                    break;
                case 23:
                    iK = B.D(i10, (List) unsafe.getObject(u4, j5));
                    iJ += iK;
                    break;
                case 24:
                    iK = B.B(i10, (List) unsafe.getObject(u4, j5));
                    iJ += iK;
                    break;
                case 25:
                    iK = B.u(i10, (List) unsafe.getObject(u4, j5));
                    iJ += iK;
                    break;
                case 26:
                    iK = B.Q(i10, (List) unsafe.getObject(u4, j5));
                    iJ += iK;
                    break;
                case 27:
                    iK = B.L(i10, (List) unsafe.getObject(u4, j5), p(i8));
                    iJ += iK;
                    break;
                case 28:
                    iK = B.y(i10, (List) unsafe.getObject(u4, j5));
                    iJ += iK;
                    break;
                case 29:
                    iK = B.R(i10, (List) unsafe.getObject(u4, j5));
                    iJ += iK;
                    break;
                case 30:
                    iK = B.z(i10, (List) unsafe.getObject(u4, j5));
                    iJ += iK;
                    break;
                case 31:
                    iK = B.B(i10, (List) unsafe.getObject(u4, j5));
                    iJ += iK;
                    break;
                case 32:
                    iK = B.D(i10, (List) unsafe.getObject(u4, j5));
                    iJ += iK;
                    break;
                case 33:
                    iK = B.M(i10, (List) unsafe.getObject(u4, j5));
                    iJ += iK;
                    break;
                case 34:
                    iK = B.O(i10, (List) unsafe.getObject(u4, j5));
                    iJ += iK;
                    break;
                case 35:
                    int iE = B.E((List) unsafe.getObject(u4, j5));
                    if (iE <= 0) {
                        break;
                    } else {
                        iJ = f.k(iE, f5.Z(i10), iE, iJ);
                        break;
                    }
                case 36:
                    int iC = B.C((List) unsafe.getObject(u4, j5));
                    if (iC <= 0) {
                        break;
                    } else {
                        iJ = f.k(iC, f5.Z(i10), iC, iJ);
                        break;
                    }
                case 37:
                    int iJ2 = B.J((List) unsafe.getObject(u4, j5));
                    if (iJ2 <= 0) {
                        break;
                    } else {
                        iJ = f.k(iJ2, f5.Z(i10), iJ2, iJ);
                        break;
                    }
                case 38:
                    int iU = B.U((List) unsafe.getObject(u4, j5));
                    if (iU <= 0) {
                        break;
                    } else {
                        iJ = f.k(iU, f5.Z(i10), iU, iJ);
                        break;
                    }
                case 39:
                    int iH = B.H((List) unsafe.getObject(u4, j5));
                    if (iH <= 0) {
                        break;
                    } else {
                        iJ = f.k(iH, f5.Z(i10), iH, iJ);
                        break;
                    }
                case 40:
                    int iE2 = B.E((List) unsafe.getObject(u4, j5));
                    if (iE2 <= 0) {
                        break;
                    } else {
                        iJ = f.k(iE2, f5.Z(i10), iE2, iJ);
                        break;
                    }
                case 41:
                    int iC2 = B.C((List) unsafe.getObject(u4, j5));
                    if (iC2 <= 0) {
                        break;
                    } else {
                        iJ = f.k(iC2, f5.Z(i10), iC2, iJ);
                        break;
                    }
                case 42:
                    int iX = B.x((List) unsafe.getObject(u4, j5));
                    if (iX <= 0) {
                        break;
                    } else {
                        iJ = f.k(iX, f5.Z(i10), iX, iJ);
                        break;
                    }
                case 43:
                    int iS = B.S((List) unsafe.getObject(u4, j5));
                    if (iS <= 0) {
                        break;
                    } else {
                        iJ = f.k(iS, f5.Z(i10), iS, iJ);
                        break;
                    }
                case 44:
                    int iA = B.A((List) unsafe.getObject(u4, j5));
                    if (iA <= 0) {
                        break;
                    } else {
                        iJ = f.k(iA, f5.Z(i10), iA, iJ);
                        break;
                    }
                case 45:
                    int iC3 = B.C((List) unsafe.getObject(u4, j5));
                    if (iC3 <= 0) {
                        break;
                    } else {
                        iJ = f.k(iC3, f5.Z(i10), iC3, iJ);
                        break;
                    }
                case 46:
                    int iE3 = B.E((List) unsafe.getObject(u4, j5));
                    if (iE3 <= 0) {
                        break;
                    } else {
                        iJ = f.k(iE3, f5.Z(i10), iE3, iJ);
                        break;
                    }
                case 47:
                    int iN3 = B.N((List) unsafe.getObject(u4, j5));
                    if (iN3 <= 0) {
                        break;
                    } else {
                        iJ = f.k(iN3, f5.Z(i10), iN3, iJ);
                        break;
                    }
                case 48:
                    int iP = B.P((List) unsafe.getObject(u4, j5));
                    if (iP <= 0) {
                        break;
                    } else {
                        iJ = f.k(iP, f5.Z(i10), iP, iJ);
                        break;
                    }
                case 49:
                    iK = B.F(i10, (List) unsafe.getObject(u4, j5), p(i8));
                    iJ += iK;
                    break;
                case 50:
                    C0318p.a(unsafe.getObject(u4, j5), r(i8));
                    break;
                case 51:
                    if (!B(i10, u4, i8)) {
                        break;
                    } else {
                        iJ = f.j(i10 << 3, 8, iJ);
                        break;
                    }
                case 52:
                    if (!B(i10, u4, i8)) {
                        break;
                    } else {
                        iJ = f.j(i10 << 3, 4, iJ);
                        break;
                    }
                case 53:
                    if (!B(i10, u4, i8)) {
                        break;
                    } else {
                        long jN = n(j5, u4);
                        iA0 = f5.a0(i10 << 3);
                        iB0 = f5.b0(jN);
                        iK = iB0 + iA0;
                        iJ += iK;
                        break;
                    }
                case 54:
                    if (!B(i10, u4, i8)) {
                        break;
                    } else {
                        long jN2 = n(j5, u4);
                        iA0 = f5.a0(i10 << 3);
                        iB0 = f5.b0(jN2);
                        iK = iB0 + iA0;
                        iJ += iK;
                        break;
                    }
                case 55:
                    if (!B(i10, u4, i8)) {
                        break;
                    } else {
                        int iJ3 = J(j5, u4);
                        iA02 = f5.a0(i10 << 3);
                        iU0 = f5.u0(iJ3);
                        iK = iU0 + iA02;
                        iJ += iK;
                        break;
                    }
                case 56:
                    if (!B(i10, u4, i8)) {
                        break;
                    } else {
                        iJ = f.j(i10 << 3, 8, iJ);
                        break;
                    }
                case 57:
                    if (!B(i10, u4, i8)) {
                        break;
                    } else {
                        iJ = f.j(i10 << 3, 4, iJ);
                        break;
                    }
                case 58:
                    if (!B(i10, u4, i8)) {
                        break;
                    } else {
                        iJ = f.j(i10 << 3, 1, iJ);
                        break;
                    }
                case 59:
                    if (!B(i10, u4, i8)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(u4, j5);
                        if (!(object2 instanceof Z4)) {
                            iA02 = f5.a0(i10 << 3);
                            iU0 = f5.Y((String) object2);
                            iK = iU0 + iA02;
                            iJ += iK;
                            break;
                        } else {
                            int iA05 = f5.a0(i10 << 3);
                            int iN4 = ((Z4) object2).n();
                            iJ = f.k(iN4, iN4, iA05, iJ);
                            break;
                        }
                    }
                case 60:
                    if (!B(i10, u4, i8)) {
                        break;
                    } else {
                        iK = B.K(i10, p(i8), unsafe.getObject(u4, j5));
                        iJ += iK;
                        break;
                    }
                case 61:
                    if (!B(i10, u4, i8)) {
                        break;
                    } else {
                        Z4 z42 = (Z4) unsafe.getObject(u4, j5);
                        int iA06 = f5.a0(i10 << 3);
                        int iN5 = z42.n();
                        iJ = f.k(iN5, iN5, iA06, iJ);
                        break;
                    }
                case 62:
                    if (!B(i10, u4, i8)) {
                        break;
                    } else {
                        iJ = f.j(J(j5, u4), f5.a0(i10 << 3), iJ);
                        break;
                    }
                case 63:
                    if (!B(i10, u4, i8)) {
                        break;
                    } else {
                        int iJ4 = J(j5, u4);
                        iA02 = f5.a0(i10 << 3);
                        iU0 = f5.u0(iJ4);
                        iK = iU0 + iA02;
                        iJ += iK;
                        break;
                    }
                case 64:
                    if (!B(i10, u4, i8)) {
                        break;
                    } else {
                        iJ = f.j(i10 << 3, 4, iJ);
                        break;
                    }
                case 65:
                    if (!B(i10, u4, i8)) {
                        break;
                    } else {
                        iJ = f.j(i10 << 3, 8, iJ);
                        break;
                    }
                case 66:
                    if (!B(i10, u4, i8)) {
                        break;
                    } else {
                        int iJ5 = J(j5, u4);
                        iJ = f.j((iJ5 >> 31) ^ (iJ5 + iJ5), f5.a0(i10 << 3), iJ);
                        break;
                    }
                case 67:
                    if (!B(i10, u4, i8)) {
                        break;
                    } else {
                        long jN3 = n(j5, u4);
                        iA0 = f5.a0(i10 << 3);
                        iB0 = f5.b0((jN3 >> 63) ^ (jN3 + jN3));
                        iK = iB0 + iA0;
                        iJ += iK;
                        break;
                    }
                case 68:
                    if (!B(i10, u4, i8)) {
                        break;
                    } else {
                        iK = f5.t0(i10, (U4) unsafe.getObject(u4, j5), p(i8));
                        iJ += iK;
                        break;
                    }
            }
            i8 += 3;
            i6 = 1048575;
        }
    }

    public final int I(U4 u4) {
        int iA0;
        int iB0;
        int iA02;
        int iU0;
        int iK;
        int iA03;
        int iB02;
        Unsafe unsafe = n;
        int i5 = 0;
        int iJ = 0;
        while (true) {
            int[] iArr = this.f5624a;
            if (i5 >= iArr.length) {
                this.f5634l.getClass();
                return E.a(E.b(u4)) + iJ;
            }
            int iM = m(i5);
            int iL = l(iM);
            int i6 = iArr[i5];
            long j5 = iM & 1048575;
            if (iL >= j5.f5531e.a() && iL <= j5.f.a()) {
                int i7 = iArr[i5 + 2];
            }
            switch (iL) {
                case 0:
                    if (!z(i5, u4)) {
                        break;
                    } else {
                        iJ = f.j(i6 << 3, 8, iJ);
                        break;
                    }
                case 1:
                    if (!z(i5, u4)) {
                        break;
                    } else {
                        iJ = f.j(i6 << 3, 4, iJ);
                        break;
                    }
                case 2:
                    if (!z(i5, u4)) {
                        break;
                    } else {
                        long jG = L.g(u4, j5);
                        iA0 = f5.a0(i6 << 3);
                        iB0 = f5.b0(jG);
                        iK = iB0 + iA0;
                        iJ = iK + iJ;
                        break;
                    }
                case 3:
                    if (!z(i5, u4)) {
                        break;
                    } else {
                        long jG2 = L.g(u4, j5);
                        iA0 = f5.a0(i6 << 3);
                        iB0 = f5.b0(jG2);
                        iK = iB0 + iA0;
                        iJ = iK + iJ;
                        break;
                    }
                case 4:
                    if (!z(i5, u4)) {
                        break;
                    } else {
                        int iF = L.f(u4, j5);
                        iA02 = f5.a0(i6 << 3);
                        iU0 = f5.u0(iF);
                        iK = iU0 + iA02;
                        iJ = iK + iJ;
                        break;
                    }
                case 5:
                    if (!z(i5, u4)) {
                        break;
                    } else {
                        iJ = f.j(i6 << 3, 8, iJ);
                        break;
                    }
                case 6:
                    if (!z(i5, u4)) {
                        break;
                    } else {
                        iJ = f.j(i6 << 3, 4, iJ);
                        break;
                    }
                case 7:
                    if (!z(i5, u4)) {
                        break;
                    } else {
                        iJ = f.j(i6 << 3, 1, iJ);
                        break;
                    }
                case 8:
                    if (!z(i5, u4)) {
                        break;
                    } else {
                        Object objI = L.i(j5, u4);
                        if (!(objI instanceof Z4)) {
                            iA02 = f5.a0(i6 << 3);
                            iU0 = f5.Y((String) objI);
                            iK = iU0 + iA02;
                            iJ = iK + iJ;
                            break;
                        } else {
                            int iA04 = f5.a0(i6 << 3);
                            int iN = ((Z4) objI).n();
                            iJ = f.k(iN, iN, iA04, iJ);
                            break;
                        }
                    }
                case 9:
                    if (!z(i5, u4)) {
                        break;
                    } else {
                        iK = B.K(i6, p(i5), L.i(j5, u4));
                        iJ = iK + iJ;
                        break;
                    }
                case 10:
                    if (!z(i5, u4)) {
                        break;
                    } else {
                        Z4 z4 = (Z4) L.i(j5, u4);
                        int iA05 = f5.a0(i6 << 3);
                        int iN2 = z4.n();
                        iJ = f.k(iN2, iN2, iA05, iJ);
                        break;
                    }
                case 11:
                    if (!z(i5, u4)) {
                        break;
                    } else {
                        iJ = f.j(L.f(u4, j5), f5.a0(i6 << 3), iJ);
                        break;
                    }
                case 12:
                    if (!z(i5, u4)) {
                        break;
                    } else {
                        int iF2 = L.f(u4, j5);
                        iA02 = f5.a0(i6 << 3);
                        iU0 = f5.u0(iF2);
                        iK = iU0 + iA02;
                        iJ = iK + iJ;
                        break;
                    }
                case 13:
                    if (!z(i5, u4)) {
                        break;
                    } else {
                        iJ = f.j(i6 << 3, 4, iJ);
                        break;
                    }
                case 14:
                    if (!z(i5, u4)) {
                        break;
                    } else {
                        iJ = f.j(i6 << 3, 8, iJ);
                        break;
                    }
                case 15:
                    if (!z(i5, u4)) {
                        break;
                    } else {
                        int iF3 = L.f(u4, j5);
                        iJ = f.j((iF3 >> 31) ^ (iF3 + iF3), f5.a0(i6 << 3), iJ);
                        break;
                    }
                case 16:
                    if (!z(i5, u4)) {
                        break;
                    } else {
                        long jG3 = L.g(u4, j5);
                        iA03 = f5.a0(i6 << 3);
                        iB02 = f5.b0((jG3 + jG3) ^ (jG3 >> 63));
                        iJ = iB02 + iA03 + iJ;
                        break;
                    }
                case 17:
                    if (!z(i5, u4)) {
                        break;
                    } else {
                        iK = f5.t0(i6, (U4) L.i(j5, u4), p(i5));
                        iJ = iK + iJ;
                        break;
                    }
                case 18:
                    iK = B.D(i6, (List) L.i(j5, u4));
                    iJ = iK + iJ;
                    break;
                case 19:
                    iK = B.B(i6, (List) L.i(j5, u4));
                    iJ = iK + iJ;
                    break;
                case 20:
                    iK = B.I(i6, (List) L.i(j5, u4));
                    iJ = iK + iJ;
                    break;
                case 21:
                    iK = B.T(i6, (List) L.i(j5, u4));
                    iJ = iK + iJ;
                    break;
                case 22:
                    iK = B.G(i6, (List) L.i(j5, u4));
                    iJ = iK + iJ;
                    break;
                case 23:
                    iK = B.D(i6, (List) L.i(j5, u4));
                    iJ = iK + iJ;
                    break;
                case 24:
                    iK = B.B(i6, (List) L.i(j5, u4));
                    iJ = iK + iJ;
                    break;
                case 25:
                    iK = B.u(i6, (List) L.i(j5, u4));
                    iJ = iK + iJ;
                    break;
                case 26:
                    iK = B.Q(i6, (List) L.i(j5, u4));
                    iJ = iK + iJ;
                    break;
                case 27:
                    iK = B.L(i6, (List) L.i(j5, u4), p(i5));
                    iJ = iK + iJ;
                    break;
                case 28:
                    iK = B.y(i6, (List) L.i(j5, u4));
                    iJ = iK + iJ;
                    break;
                case 29:
                    iK = B.R(i6, (List) L.i(j5, u4));
                    iJ = iK + iJ;
                    break;
                case 30:
                    iK = B.z(i6, (List) L.i(j5, u4));
                    iJ = iK + iJ;
                    break;
                case 31:
                    iK = B.B(i6, (List) L.i(j5, u4));
                    iJ = iK + iJ;
                    break;
                case 32:
                    iK = B.D(i6, (List) L.i(j5, u4));
                    iJ = iK + iJ;
                    break;
                case 33:
                    iK = B.M(i6, (List) L.i(j5, u4));
                    iJ = iK + iJ;
                    break;
                case 34:
                    iK = B.O(i6, (List) L.i(j5, u4));
                    iJ = iK + iJ;
                    break;
                case 35:
                    int iE = B.E((List) unsafe.getObject(u4, j5));
                    if (iE <= 0) {
                        break;
                    } else {
                        iJ = f.k(iE, f5.Z(i6), iE, iJ);
                        break;
                    }
                case 36:
                    int iC = B.C((List) unsafe.getObject(u4, j5));
                    if (iC <= 0) {
                        break;
                    } else {
                        iJ = f.k(iC, f5.Z(i6), iC, iJ);
                        break;
                    }
                case 37:
                    int iJ2 = B.J((List) unsafe.getObject(u4, j5));
                    if (iJ2 <= 0) {
                        break;
                    } else {
                        iJ = f.k(iJ2, f5.Z(i6), iJ2, iJ);
                        break;
                    }
                case 38:
                    int iU = B.U((List) unsafe.getObject(u4, j5));
                    if (iU <= 0) {
                        break;
                    } else {
                        iJ = f.k(iU, f5.Z(i6), iU, iJ);
                        break;
                    }
                case 39:
                    int iH = B.H((List) unsafe.getObject(u4, j5));
                    if (iH <= 0) {
                        break;
                    } else {
                        iJ = f.k(iH, f5.Z(i6), iH, iJ);
                        break;
                    }
                case 40:
                    int iE2 = B.E((List) unsafe.getObject(u4, j5));
                    if (iE2 <= 0) {
                        break;
                    } else {
                        iJ = f.k(iE2, f5.Z(i6), iE2, iJ);
                        break;
                    }
                case 41:
                    int iC2 = B.C((List) unsafe.getObject(u4, j5));
                    if (iC2 <= 0) {
                        break;
                    } else {
                        iJ = f.k(iC2, f5.Z(i6), iC2, iJ);
                        break;
                    }
                case 42:
                    int iX = B.x((List) unsafe.getObject(u4, j5));
                    if (iX <= 0) {
                        break;
                    } else {
                        iJ = f.k(iX, f5.Z(i6), iX, iJ);
                        break;
                    }
                case 43:
                    int iS = B.S((List) unsafe.getObject(u4, j5));
                    if (iS <= 0) {
                        break;
                    } else {
                        iJ = f.k(iS, f5.Z(i6), iS, iJ);
                        break;
                    }
                case 44:
                    int iA = B.A((List) unsafe.getObject(u4, j5));
                    if (iA <= 0) {
                        break;
                    } else {
                        iJ = f.k(iA, f5.Z(i6), iA, iJ);
                        break;
                    }
                case 45:
                    int iC3 = B.C((List) unsafe.getObject(u4, j5));
                    if (iC3 <= 0) {
                        break;
                    } else {
                        iJ = f.k(iC3, f5.Z(i6), iC3, iJ);
                        break;
                    }
                case 46:
                    int iE3 = B.E((List) unsafe.getObject(u4, j5));
                    if (iE3 <= 0) {
                        break;
                    } else {
                        iJ = f.k(iE3, f5.Z(i6), iE3, iJ);
                        break;
                    }
                case 47:
                    int iN3 = B.N((List) unsafe.getObject(u4, j5));
                    if (iN3 <= 0) {
                        break;
                    } else {
                        iJ = f.k(iN3, f5.Z(i6), iN3, iJ);
                        break;
                    }
                case 48:
                    int iP = B.P((List) unsafe.getObject(u4, j5));
                    if (iP <= 0) {
                        break;
                    } else {
                        iJ = f.k(iP, f5.Z(i6), iP, iJ);
                        break;
                    }
                case 49:
                    iK = B.F(i6, (List) L.i(j5, u4), p(i5));
                    iJ = iK + iJ;
                    break;
                case 50:
                    C0318p.a(L.i(j5, u4), r(i5));
                    break;
                case 51:
                    if (!B(i6, u4, i5)) {
                        break;
                    } else {
                        iJ = f.j(i6 << 3, 8, iJ);
                        break;
                    }
                case 52:
                    if (!B(i6, u4, i5)) {
                        break;
                    } else {
                        iJ = f.j(i6 << 3, 4, iJ);
                        break;
                    }
                case 53:
                    if (!B(i6, u4, i5)) {
                        break;
                    } else {
                        long jN = n(j5, u4);
                        iA0 = f5.a0(i6 << 3);
                        iB0 = f5.b0(jN);
                        iK = iB0 + iA0;
                        iJ = iK + iJ;
                        break;
                    }
                case 54:
                    if (!B(i6, u4, i5)) {
                        break;
                    } else {
                        long jN2 = n(j5, u4);
                        iA0 = f5.a0(i6 << 3);
                        iB0 = f5.b0(jN2);
                        iK = iB0 + iA0;
                        iJ = iK + iJ;
                        break;
                    }
                case 55:
                    if (!B(i6, u4, i5)) {
                        break;
                    } else {
                        int iJ3 = J(j5, u4);
                        iA02 = f5.a0(i6 << 3);
                        iU0 = f5.u0(iJ3);
                        iK = iU0 + iA02;
                        iJ = iK + iJ;
                        break;
                    }
                case 56:
                    if (!B(i6, u4, i5)) {
                        break;
                    } else {
                        iJ = f.j(i6 << 3, 8, iJ);
                        break;
                    }
                case 57:
                    if (!B(i6, u4, i5)) {
                        break;
                    } else {
                        iJ = f.j(i6 << 3, 4, iJ);
                        break;
                    }
                case 58:
                    if (!B(i6, u4, i5)) {
                        break;
                    } else {
                        iJ = f.j(i6 << 3, 1, iJ);
                        break;
                    }
                case 59:
                    if (!B(i6, u4, i5)) {
                        break;
                    } else {
                        Object objI2 = L.i(j5, u4);
                        if (!(objI2 instanceof Z4)) {
                            iA02 = f5.a0(i6 << 3);
                            iU0 = f5.Y((String) objI2);
                            iK = iU0 + iA02;
                            iJ = iK + iJ;
                            break;
                        } else {
                            int iA06 = f5.a0(i6 << 3);
                            int iN4 = ((Z4) objI2).n();
                            iJ = f.k(iN4, iN4, iA06, iJ);
                            break;
                        }
                    }
                case 60:
                    if (!B(i6, u4, i5)) {
                        break;
                    } else {
                        iK = B.K(i6, p(i5), L.i(j5, u4));
                        iJ = iK + iJ;
                        break;
                    }
                case 61:
                    if (!B(i6, u4, i5)) {
                        break;
                    } else {
                        Z4 z42 = (Z4) L.i(j5, u4);
                        int iA07 = f5.a0(i6 << 3);
                        int iN5 = z42.n();
                        iJ = f.k(iN5, iN5, iA07, iJ);
                        break;
                    }
                case 62:
                    if (!B(i6, u4, i5)) {
                        break;
                    } else {
                        iJ = f.j(J(j5, u4), f5.a0(i6 << 3), iJ);
                        break;
                    }
                case 63:
                    if (!B(i6, u4, i5)) {
                        break;
                    } else {
                        int iJ4 = J(j5, u4);
                        iA02 = f5.a0(i6 << 3);
                        iU0 = f5.u0(iJ4);
                        iK = iU0 + iA02;
                        iJ = iK + iJ;
                        break;
                    }
                case 64:
                    if (!B(i6, u4, i5)) {
                        break;
                    } else {
                        iJ = f.j(i6 << 3, 4, iJ);
                        break;
                    }
                case 65:
                    if (!B(i6, u4, i5)) {
                        break;
                    } else {
                        iJ = f.j(i6 << 3, 8, iJ);
                        break;
                    }
                case 66:
                    if (!B(i6, u4, i5)) {
                        break;
                    } else {
                        int iJ5 = J(j5, u4);
                        iJ = f.j((iJ5 >> 31) ^ (iJ5 + iJ5), f5.a0(i6 << 3), iJ);
                        break;
                    }
                case 67:
                    if (!B(i6, u4, i5)) {
                        break;
                    } else {
                        long jN3 = n(j5, u4);
                        iA03 = f5.a0(i6 << 3);
                        iB02 = f5.b0((jN3 + jN3) ^ (jN3 >> 63));
                        iJ = iB02 + iA03 + iJ;
                        break;
                    }
                case 68:
                    if (!B(i6, u4, i5)) {
                        break;
                    } else {
                        iK = f5.t0(i6, (U4) L.i(j5, u4), p(i5));
                        iJ = iK + iJ;
                        break;
                    }
            }
            i5 += 3;
        }
    }

    public final void K(int i5, long j5, Object obj) {
        Unsafe unsafe = n;
        Object objR = r(i5);
        Object object = unsafe.getObject(obj, j5);
        if (C0318p.b(object)) {
            C0312o c0312oB = C0312o.a().b();
            C0318p.c(c0312oB, object);
            unsafe.putObject(obj, j5, c0312oB);
        }
        f.s(objR);
        throw null;
    }

    public final int L(Object obj, byte[] bArr, int i5, int i6, int i7, int i8, int i9, int i10, int i11, long j5, int i12, d dVar) throws C0258f {
        Unsafe unsafe = n;
        long j6 = this.f5624a[i12 + 2] & 1048575;
        switch (i11) {
            case 51:
                if (i9 == 1) {
                    unsafe.putObject(obj, j5, Double.valueOf(Double.longBitsToDouble(AbstractC0335s.X(i5, bArr))));
                    unsafe.putInt(obj, j6, i8);
                    return i5 + 8;
                }
                break;
            case 52:
                if (i9 == 5) {
                    unsafe.putObject(obj, j5, Float.valueOf(Float.intBitsToFloat(AbstractC0335s.o(i5, bArr))));
                    unsafe.putInt(obj, j6, i8);
                    return i5 + 4;
                }
                break;
            case 53:
            case 54:
                if (i9 == 0) {
                    int iW = AbstractC0335s.W(bArr, i5, dVar);
                    unsafe.putObject(obj, j5, Long.valueOf(dVar.f859b));
                    unsafe.putInt(obj, j6, i8);
                    return iW;
                }
                break;
            case 55:
            case 62:
                if (i9 == 0) {
                    int iT = AbstractC0335s.T(bArr, i5, dVar);
                    unsafe.putObject(obj, j5, Integer.valueOf(dVar.f858a));
                    unsafe.putInt(obj, j6, i8);
                    return iT;
                }
                break;
            case 56:
            case 65:
                if (i9 == 1) {
                    unsafe.putObject(obj, j5, Long.valueOf(AbstractC0335s.X(i5, bArr)));
                    unsafe.putInt(obj, j6, i8);
                    return i5 + 8;
                }
                break;
            case 57:
            case 64:
                if (i9 == 5) {
                    unsafe.putObject(obj, j5, Integer.valueOf(AbstractC0335s.o(i5, bArr)));
                    unsafe.putInt(obj, j6, i8);
                    return i5 + 4;
                }
                break;
            case 58:
                if (i9 == 0) {
                    int iW2 = AbstractC0335s.W(bArr, i5, dVar);
                    unsafe.putObject(obj, j5, Boolean.valueOf(dVar.f859b != 0));
                    unsafe.putInt(obj, j6, i8);
                    return iW2;
                }
                break;
            case 59:
                if (i9 == 2) {
                    int iT2 = AbstractC0335s.T(bArr, i5, dVar);
                    int i13 = dVar.f858a;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j5, "");
                    } else {
                        if ((i10 & 536870912) != 0 && !O.e(bArr, iT2, iT2 + i13)) {
                            throw C0258f.b();
                        }
                        unsafe.putObject(obj, j5, new String(bArr, iT2, i13, AbstractC0246d.f5451a));
                        iT2 += i13;
                    }
                    unsafe.putInt(obj, j6, i8);
                    return iT2;
                }
                break;
            case 60:
                if (i9 == 2) {
                    int iE = AbstractC0335s.E(p(i12), bArr, i5, i6, dVar);
                    Object object = unsafe.getInt(obj, j6) == i8 ? unsafe.getObject(obj, j5) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j5, dVar.f860c);
                    } else {
                        unsafe.putObject(obj, j5, AbstractC0246d.b(object, dVar.f860c));
                    }
                    unsafe.putInt(obj, j6, i8);
                    return iE;
                }
                break;
            case 61:
                if (i9 == 2) {
                    int iA = AbstractC0335s.a(bArr, i5, dVar);
                    unsafe.putObject(obj, j5, dVar.f860c);
                    unsafe.putInt(obj, j6, i8);
                    return iA;
                }
                break;
            case 63:
                if (i9 == 0) {
                    int iT3 = AbstractC0335s.T(bArr, i5, dVar);
                    int i14 = dVar.f858a;
                    o(i12);
                    unsafe.putObject(obj, j5, Integer.valueOf(i14));
                    unsafe.putInt(obj, j6, i8);
                    return iT3;
                }
                break;
            case 66:
                if (i9 == 0) {
                    int iT4 = AbstractC0335s.T(bArr, i5, dVar);
                    unsafe.putObject(obj, j5, Integer.valueOf(a5.k(dVar.f858a)));
                    unsafe.putInt(obj, j6, i8);
                    return iT4;
                }
                break;
            case 67:
                if (i9 == 0) {
                    int iW3 = AbstractC0335s.W(bArr, i5, dVar);
                    unsafe.putObject(obj, j5, Long.valueOf(a5.l(dVar.f859b)));
                    unsafe.putInt(obj, j6, i8);
                    return iW3;
                }
                break;
            case 68:
                if (i9 == 3) {
                    int iY = AbstractC0335s.y(p(i12), bArr, i5, i6, (i7 & (-8)) | 4, dVar);
                    Object object2 = unsafe.getInt(obj, j6) == i8 ? unsafe.getObject(obj, j5) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j5, dVar.f860c);
                    } else {
                        unsafe.putObject(obj, j5, AbstractC0246d.b(object2, dVar.f860c));
                    }
                    unsafe.putInt(obj, j6, i8);
                    return iY;
                }
                break;
        }
        return i5;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x00a2. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(java.lang.Object r32, byte[] r33, int r34, int r35, I0.d r36) throws com.google.android.gms.internal.p000firebaseauthapi.C0258f {
        /*
            Method dump skipped, instructions count: 960
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.C0341t.M(java.lang.Object, byte[], int, int, I0.d):void");
    }

    public final int N(Object obj, byte[] bArr, int i5, int i6, int i7, int i8, int i9, int i10, long j5, int i11, long j6, d dVar) throws C0258f {
        int iT;
        Unsafe unsafe = n;
        V4 v4 = (V4) ((InterfaceC0240c) unsafe.getObject(obj, j6));
        boolean zM = v4.m();
        InterfaceC0240c interfaceC0240c = v4;
        if (!zM) {
            int size = v4.size();
            InterfaceC0240c interfaceC0240cD = v4.d(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j6, interfaceC0240cD);
            interfaceC0240c = interfaceC0240cD;
        }
        switch (i11) {
            case 18:
            case 35:
                if (i9 == 2) {
                    f.r(interfaceC0240c);
                    int iT2 = AbstractC0335s.T(bArr, i5, dVar);
                    int i12 = dVar.f858a + iT2;
                    if (iT2 < i12) {
                        Double.longBitsToDouble(AbstractC0335s.X(iT2, bArr));
                        throw null;
                    }
                    if (iT2 == i12) {
                        return iT2;
                    }
                    throw C0258f.e();
                }
                if (i9 == 1) {
                    f.r(interfaceC0240c);
                    Double.longBitsToDouble(AbstractC0335s.X(i5, bArr));
                    throw null;
                }
                break;
            case 19:
            case 36:
                if (i9 == 2) {
                    f.r(interfaceC0240c);
                    int iT3 = AbstractC0335s.T(bArr, i5, dVar);
                    int i13 = dVar.f858a + iT3;
                    if (iT3 < i13) {
                        Float.intBitsToFloat(AbstractC0335s.o(iT3, bArr));
                        throw null;
                    }
                    if (iT3 == i13) {
                        return iT3;
                    }
                    throw C0258f.e();
                }
                if (i9 == 5) {
                    f.r(interfaceC0240c);
                    Float.intBitsToFloat(AbstractC0335s.o(i5, bArr));
                    throw null;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i9 == 2) {
                    f.r(interfaceC0240c);
                    int iT4 = AbstractC0335s.T(bArr, i5, dVar);
                    int i14 = dVar.f858a + iT4;
                    if (iT4 < i14) {
                        AbstractC0335s.W(bArr, iT4, dVar);
                        throw null;
                    }
                    if (iT4 == i14) {
                        return iT4;
                    }
                    throw C0258f.e();
                }
                if (i9 == 0) {
                    f.r(interfaceC0240c);
                    AbstractC0335s.W(bArr, i5, dVar);
                    throw null;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i9 == 2) {
                    return AbstractC0335s.N(bArr, i5, interfaceC0240c, dVar);
                }
                if (i9 == 0) {
                    AbstractC0335s.V(bArr, i5, interfaceC0240c, dVar);
                    throw null;
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i9 == 2) {
                    f.r(interfaceC0240c);
                    int iT5 = AbstractC0335s.T(bArr, i5, dVar);
                    int i15 = dVar.f858a + iT5;
                    if (iT5 < i15) {
                        AbstractC0335s.X(iT5, bArr);
                        throw null;
                    }
                    if (iT5 == i15) {
                        return iT5;
                    }
                    throw C0258f.e();
                }
                if (i9 == 1) {
                    f.r(interfaceC0240c);
                    AbstractC0335s.X(i5, bArr);
                    throw null;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i9 == 2) {
                    f.r(interfaceC0240c);
                    int iT6 = AbstractC0335s.T(bArr, i5, dVar);
                    int i16 = dVar.f858a + iT6;
                    if (iT6 < i16) {
                        AbstractC0335s.o(iT6, bArr);
                        throw null;
                    }
                    if (iT6 == i16) {
                        return iT6;
                    }
                    throw C0258f.e();
                }
                if (i9 == 5) {
                    f.r(interfaceC0240c);
                    AbstractC0335s.o(i5, bArr);
                    throw null;
                }
                break;
            case 25:
            case 42:
                if (i9 == 2) {
                    f.r(interfaceC0240c);
                    int iT7 = AbstractC0335s.T(bArr, i5, dVar);
                    int i17 = dVar.f858a + iT7;
                    if (iT7 < i17) {
                        AbstractC0335s.W(bArr, iT7, dVar);
                        throw null;
                    }
                    if (iT7 == i17) {
                        return iT7;
                    }
                    throw C0258f.e();
                }
                if (i9 == 0) {
                    f.r(interfaceC0240c);
                    AbstractC0335s.W(bArr, i5, dVar);
                    throw null;
                }
                break;
            case 26:
                if (i9 == 2) {
                    if ((j5 & 536870912) == 0) {
                        int iT8 = AbstractC0335s.T(bArr, i5, dVar);
                        int i18 = dVar.f858a;
                        if (i18 < 0) {
                            throw C0258f.c();
                        }
                        if (i18 == 0) {
                            interfaceC0240c.add("");
                        } else {
                            interfaceC0240c.add(new String(bArr, iT8, i18, AbstractC0246d.f5451a));
                            iT8 += i18;
                        }
                        while (iT8 < i6) {
                            int iT9 = AbstractC0335s.T(bArr, iT8, dVar);
                            if (i7 != dVar.f858a) {
                                return iT8;
                            }
                            iT8 = AbstractC0335s.T(bArr, iT9, dVar);
                            int i19 = dVar.f858a;
                            if (i19 < 0) {
                                throw C0258f.c();
                            }
                            if (i19 == 0) {
                                interfaceC0240c.add("");
                            } else {
                                interfaceC0240c.add(new String(bArr, iT8, i19, AbstractC0246d.f5451a));
                                iT8 += i19;
                            }
                        }
                        return iT8;
                    }
                    int iT10 = AbstractC0335s.T(bArr, i5, dVar);
                    int i20 = dVar.f858a;
                    if (i20 < 0) {
                        throw C0258f.c();
                    }
                    if (i20 == 0) {
                        interfaceC0240c.add("");
                        iT = iT10;
                    } else {
                        iT = iT10 + i20;
                        if (!O.e(bArr, iT10, iT)) {
                            throw C0258f.b();
                        }
                        interfaceC0240c.add(new String(bArr, iT10, i20, AbstractC0246d.f5451a));
                    }
                    while (iT < i6) {
                        int iT11 = AbstractC0335s.T(bArr, iT, dVar);
                        if (i7 != dVar.f858a) {
                            return iT;
                        }
                        iT = AbstractC0335s.T(bArr, iT11, dVar);
                        int i21 = dVar.f858a;
                        if (i21 < 0) {
                            throw C0258f.c();
                        }
                        if (i21 == 0) {
                            interfaceC0240c.add("");
                        } else {
                            int i22 = iT + i21;
                            if (!O.e(bArr, iT, i22)) {
                                throw C0258f.b();
                            }
                            interfaceC0240c.add(new String(bArr, iT, i21, AbstractC0246d.f5451a));
                            iT = i22;
                        }
                    }
                    return iT;
                }
                break;
            case 27:
                if (i9 == 2) {
                    return AbstractC0335s.K(p(i10), i7, bArr, i5, i6, interfaceC0240c, dVar);
                }
                break;
            case 28:
                if (i9 == 2) {
                    int iT12 = AbstractC0335s.T(bArr, i5, dVar);
                    int i23 = dVar.f858a;
                    if (i23 < 0) {
                        throw C0258f.c();
                    }
                    if (i23 > bArr.length - iT12) {
                        throw C0258f.e();
                    }
                    if (i23 == 0) {
                        interfaceC0240c.add(Z4.f5416e);
                    } else {
                        interfaceC0240c.add(Z4.q(bArr, iT12, i23));
                        iT12 += i23;
                    }
                    while (iT12 < i6) {
                        int iT13 = AbstractC0335s.T(bArr, iT12, dVar);
                        if (i7 != dVar.f858a) {
                            return iT12;
                        }
                        iT12 = AbstractC0335s.T(bArr, iT13, dVar);
                        int i24 = dVar.f858a;
                        if (i24 < 0) {
                            throw C0258f.c();
                        }
                        if (i24 > bArr.length - iT12) {
                            throw C0258f.e();
                        }
                        if (i24 == 0) {
                            interfaceC0240c.add(Z4.f5416e);
                        } else {
                            interfaceC0240c.add(Z4.q(bArr, iT12, i24));
                            iT12 += i24;
                        }
                    }
                    return iT12;
                }
                break;
            case 30:
            case 44:
                if (i9 == 2) {
                    int iN = AbstractC0335s.N(bArr, i5, interfaceC0240c, dVar);
                    m5 m5Var = (m5) obj;
                    D d5 = m5Var.zzc;
                    D d6 = d5 != D.f ? d5 : null;
                    o(i10);
                    B.a(i8, interfaceC0240c, d6, this.f5634l);
                    if (d6 == null) {
                        return iN;
                    }
                    m5Var.zzc = d6;
                    return iN;
                }
                if (i9 == 0) {
                    AbstractC0335s.V(bArr, i5, interfaceC0240c, dVar);
                    throw null;
                }
                break;
            case 33:
            case 47:
                if (i9 == 2) {
                    f.r(interfaceC0240c);
                    int iT14 = AbstractC0335s.T(bArr, i5, dVar);
                    int i25 = dVar.f858a + iT14;
                    if (iT14 < i25) {
                        AbstractC0335s.T(bArr, iT14, dVar);
                        throw null;
                    }
                    if (iT14 == i25) {
                        return iT14;
                    }
                    throw C0258f.e();
                }
                if (i9 == 0) {
                    f.r(interfaceC0240c);
                    AbstractC0335s.T(bArr, i5, dVar);
                    throw null;
                }
                break;
            case 34:
            case 48:
                if (i9 == 2) {
                    f.r(interfaceC0240c);
                    int iT15 = AbstractC0335s.T(bArr, i5, dVar);
                    int i26 = dVar.f858a + iT15;
                    if (iT15 < i26) {
                        AbstractC0335s.W(bArr, iT15, dVar);
                        throw null;
                    }
                    if (iT15 == i26) {
                        return iT15;
                    }
                    throw C0258f.e();
                }
                if (i9 == 0) {
                    f.r(interfaceC0240c);
                    AbstractC0335s.W(bArr, i5, dVar);
                    throw null;
                }
                break;
            default:
                if (i9 == 3) {
                    A aP = p(i10);
                    int i27 = (i7 & (-8)) | 4;
                    int iY = AbstractC0335s.y(aP, bArr, i5, i6, i27, dVar);
                    interfaceC0240c.add(dVar.f860c);
                    while (iY < i6) {
                        int iT16 = AbstractC0335s.T(bArr, iY, dVar);
                        if (i7 != dVar.f858a) {
                            return iY;
                        }
                        iY = AbstractC0335s.y(aP, bArr, iT16, i6, i27, dVar);
                        interfaceC0240c.add(dVar.f860c);
                    }
                    return iY;
                }
                break;
        }
        return i5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.A
    public final Object a() {
        return ((m5) this.f5628e).h(4);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.A
    public final void b(Object obj) {
        int[] iArr;
        int i5;
        int i6 = this.f5631i;
        while (true) {
            iArr = this.f5630h;
            i5 = this.f5632j;
            if (i6 >= i5) {
                break;
            }
            long jM = m(iArr[i6]) & 1048575;
            Object objM = L.f5338c.m(jM, obj);
            if (objM != null) {
                ((C0312o) objM).f5575d = false;
                L.r(obj, jM, objM);
            }
            i6++;
        }
        int length = iArr.length;
        while (i5 < length) {
            this.f5633k.b(iArr[i5], obj);
            i5++;
        }
        this.f5634l.getClass();
        ((m5) obj).zzc.f5287e = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x06c2 A[Catch: all -> 0x052b, TryCatch #3 {all -> 0x052b, blocks: (B:160:0x06bd, B:162:0x06c2, B:164:0x06c9, B:166:0x06d0, B:131:0x051f, B:136:0x0531, B:137:0x054b, B:138:0x0561, B:139:0x0577, B:140:0x0590, B:141:0x05a6, B:142:0x05b8, B:144:0x05c1, B:145:0x05dd, B:146:0x05f4, B:147:0x05ff, B:151:0x0614, B:152:0x061c, B:153:0x0632, B:154:0x0648, B:155:0x065d, B:156:0x0672, B:157:0x0687, B:158:0x06a0), top: B:190:0x06bd }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x06f1 A[LOOP:3: B:177:0x06ef->B:178:0x06f1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06d6 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r23, com.google.android.gms.internal.p000firebaseauthapi.b5 r24, com.google.android.gms.internal.p000firebaseauthapi.g5 r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1938
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.C0341t.c(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.b5, com.google.android.gms.internal.firebase-auth-api.g5):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(com.google.android.gms.internal.p000firebaseauthapi.m5 r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.C0341t.d(com.google.android.gms.internal.firebase-auth-api.m5):int");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.A
    public final void e(Object obj, byte[] bArr, int i5, int i6, d dVar) throws C0258f {
        if (this.f5629g) {
            M(obj, bArr, i5, i6, dVar);
        } else {
            E(obj, bArr, i5, i6, 0, dVar);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.A
    public final void f(Object obj, C0306n c0306n) {
        if (!this.f5629g) {
            C(obj, c0306n);
            return;
        }
        int[] iArr = this.f5624a;
        int length = iArr.length;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int iM = m(i5);
            int i6 = iArr[i5];
            switch (l(iM)) {
                case 0:
                    if (z(i5, obj)) {
                        c0306n.r(i6, L.f5338c.a(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (z(i5, obj)) {
                        c0306n.y(i6, L.f5338c.b(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (z(i5, obj)) {
                        c0306n.B(i6, L.f5338c.k(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (z(i5, obj)) {
                        c0306n.g(i6, L.f5338c.k(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (z(i5, obj)) {
                        c0306n.A(i6, L.f5338c.j(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (z(i5, obj)) {
                        c0306n.x(i6, L.f5338c.k(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (z(i5, obj)) {
                        c0306n.w(i6, L.f5338c.j(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (z(i5, obj)) {
                        c0306n.k(i6, L.f5338c.g(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (z(i5, obj)) {
                        D(i6, L.f5338c.m(iM & 1048575, obj), c0306n);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (z(i5, obj)) {
                        c0306n.C(i6, p(i5), L.f5338c.m(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (z(i5, obj)) {
                        c0306n.o(i6, (Z4) L.f5338c.m(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (z(i5, obj)) {
                        c0306n.f(i6, L.f5338c.j(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (z(i5, obj)) {
                        c0306n.v(i6, L.f5338c.j(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (z(i5, obj)) {
                        c0306n.D(i6, L.f5338c.j(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (z(i5, obj)) {
                        c0306n.E(i6, L.f5338c.k(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (z(i5, obj)) {
                        c0306n.c(i6, L.f5338c.j(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (z(i5, obj)) {
                        c0306n.d(i6, L.f5338c.k(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (z(i5, obj)) {
                        c0306n.z(i6, p(i5), L.f5338c.m(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    B.f(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, false);
                    break;
                case 19:
                    B.j(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, false);
                    break;
                case 20:
                    B.m(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, false);
                    break;
                case 21:
                    B.v(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, false);
                    break;
                case 22:
                    B.l(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, false);
                    break;
                case 23:
                    B.i(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, false);
                    break;
                case 24:
                    B.h(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, false);
                    break;
                case 25:
                    B.d(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, false);
                    break;
                case 26:
                    B.s(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n);
                    break;
                case 27:
                    B.n(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, p(i5));
                    break;
                case 28:
                    B.e(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n);
                    break;
                case 29:
                    B.t(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, false);
                    break;
                case 30:
                    B.g(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, false);
                    break;
                case 31:
                    B.o(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, false);
                    break;
                case 32:
                    B.p(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, false);
                    break;
                case 33:
                    B.q(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, false);
                    break;
                case 34:
                    B.r(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, false);
                    break;
                case 35:
                    B.f(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, true);
                    break;
                case 36:
                    B.j(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, true);
                    break;
                case 37:
                    B.m(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, true);
                    break;
                case 38:
                    B.v(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, true);
                    break;
                case 39:
                    B.l(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, true);
                    break;
                case 40:
                    B.i(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, true);
                    break;
                case 41:
                    B.h(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, true);
                    break;
                case 42:
                    B.d(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, true);
                    break;
                case 43:
                    B.t(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, true);
                    break;
                case 44:
                    B.g(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, true);
                    break;
                case 45:
                    B.o(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, true);
                    break;
                case 46:
                    B.p(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, true);
                    break;
                case 47:
                    B.q(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, true);
                    break;
                case 48:
                    B.r(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, true);
                    break;
                case 49:
                    B.k(iArr[i5], (List) L.f5338c.m(iM & 1048575, obj), c0306n, p(i5));
                    break;
                case 50:
                    if (L.f5338c.m(iM & 1048575, obj) != null) {
                        r(i5).getClass();
                        throw new ClassCastException();
                    }
                    break;
                case 51:
                    if (B(i6, obj, i5)) {
                        c0306n.r(i6, ((Double) L.f5338c.m(iM & 1048575, obj)).doubleValue());
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (B(i6, obj, i5)) {
                        c0306n.y(i6, ((Float) L.f5338c.m(iM & 1048575, obj)).floatValue());
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (B(i6, obj, i5)) {
                        c0306n.B(i6, n(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (B(i6, obj, i5)) {
                        c0306n.g(i6, n(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (B(i6, obj, i5)) {
                        c0306n.A(i6, J(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (B(i6, obj, i5)) {
                        c0306n.x(i6, n(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (B(i6, obj, i5)) {
                        c0306n.w(i6, J(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (B(i6, obj, i5)) {
                        c0306n.k(i6, ((Boolean) L.f5338c.m(iM & 1048575, obj)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (B(i6, obj, i5)) {
                        D(i6, L.f5338c.m(iM & 1048575, obj), c0306n);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (B(i6, obj, i5)) {
                        c0306n.C(i6, p(i5), L.f5338c.m(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (B(i6, obj, i5)) {
                        c0306n.o(i6, (Z4) L.f5338c.m(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (B(i6, obj, i5)) {
                        c0306n.f(i6, J(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (B(i6, obj, i5)) {
                        c0306n.v(i6, J(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (B(i6, obj, i5)) {
                        c0306n.D(i6, J(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (B(i6, obj, i5)) {
                        c0306n.E(i6, n(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (B(i6, obj, i5)) {
                        c0306n.c(i6, J(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (B(i6, obj, i5)) {
                        c0306n.d(i6, n(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (B(i6, obj, i5)) {
                        c0306n.z(i6, p(i5), L.f5338c.m(iM & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f5634l.getClass();
        ((m5) obj).zzc.d(c0306n);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.A
    public final boolean g(m5 m5Var, Object obj) {
        boolean zC;
        int[] iArr = this.f5624a;
        int length = iArr.length;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int iM = m(i5);
            long j5 = iM & 1048575;
            switch (l(iM)) {
                case 0:
                    if (y(m5Var, obj, i5)) {
                        K k5 = L.f5338c;
                        if (Double.doubleToLongBits(k5.a(j5, m5Var)) == Double.doubleToLongBits(k5.a(j5, obj))) {
                            continue;
                        }
                    }
                    return false;
                case 1:
                    if (y(m5Var, obj, i5)) {
                        K k6 = L.f5338c;
                        if (Float.floatToIntBits(k6.b(j5, m5Var)) == Float.floatToIntBits(k6.b(j5, obj))) {
                            continue;
                        }
                    }
                    return false;
                case 2:
                    if (y(m5Var, obj, i5)) {
                        K k7 = L.f5338c;
                        if (k7.k(j5, m5Var) == k7.k(j5, obj)) {
                            continue;
                        }
                    }
                    return false;
                case 3:
                    if (y(m5Var, obj, i5)) {
                        K k8 = L.f5338c;
                        if (k8.k(j5, m5Var) == k8.k(j5, obj)) {
                            continue;
                        }
                    }
                    return false;
                case 4:
                    if (y(m5Var, obj, i5)) {
                        K k9 = L.f5338c;
                        if (k9.j(j5, m5Var) == k9.j(j5, obj)) {
                            continue;
                        }
                    }
                    return false;
                case 5:
                    if (y(m5Var, obj, i5)) {
                        K k10 = L.f5338c;
                        if (k10.k(j5, m5Var) == k10.k(j5, obj)) {
                            continue;
                        }
                    }
                    return false;
                case 6:
                    if (y(m5Var, obj, i5)) {
                        K k11 = L.f5338c;
                        if (k11.j(j5, m5Var) == k11.j(j5, obj)) {
                            continue;
                        }
                    }
                    return false;
                case 7:
                    if (y(m5Var, obj, i5)) {
                        K k12 = L.f5338c;
                        if (k12.g(j5, m5Var) == k12.g(j5, obj)) {
                            continue;
                        }
                    }
                    return false;
                case 8:
                    if (y(m5Var, obj, i5)) {
                        K k13 = L.f5338c;
                        if (B.c(k13.m(j5, m5Var), k13.m(j5, obj))) {
                            continue;
                        }
                    }
                    return false;
                case 9:
                    if (y(m5Var, obj, i5)) {
                        K k14 = L.f5338c;
                        if (B.c(k14.m(j5, m5Var), k14.m(j5, obj))) {
                            continue;
                        }
                    }
                    return false;
                case 10:
                    if (y(m5Var, obj, i5)) {
                        K k15 = L.f5338c;
                        if (B.c(k15.m(j5, m5Var), k15.m(j5, obj))) {
                            continue;
                        }
                    }
                    return false;
                case 11:
                    if (y(m5Var, obj, i5)) {
                        K k16 = L.f5338c;
                        if (k16.j(j5, m5Var) == k16.j(j5, obj)) {
                            continue;
                        }
                    }
                    return false;
                case 12:
                    if (y(m5Var, obj, i5)) {
                        K k17 = L.f5338c;
                        if (k17.j(j5, m5Var) == k17.j(j5, obj)) {
                            continue;
                        }
                    }
                    return false;
                case 13:
                    if (y(m5Var, obj, i5)) {
                        K k18 = L.f5338c;
                        if (k18.j(j5, m5Var) == k18.j(j5, obj)) {
                            continue;
                        }
                    }
                    return false;
                case 14:
                    if (y(m5Var, obj, i5)) {
                        K k19 = L.f5338c;
                        if (k19.k(j5, m5Var) == k19.k(j5, obj)) {
                            continue;
                        }
                    }
                    return false;
                case 15:
                    if (y(m5Var, obj, i5)) {
                        K k20 = L.f5338c;
                        if (k20.j(j5, m5Var) == k20.j(j5, obj)) {
                            continue;
                        }
                    }
                    return false;
                case 16:
                    if (y(m5Var, obj, i5)) {
                        K k21 = L.f5338c;
                        if (k21.k(j5, m5Var) == k21.k(j5, obj)) {
                            continue;
                        }
                    }
                    return false;
                case 17:
                    if (y(m5Var, obj, i5)) {
                        K k22 = L.f5338c;
                        if (B.c(k22.m(j5, m5Var), k22.m(j5, obj))) {
                            continue;
                        }
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    K k23 = L.f5338c;
                    zC = B.c(k23.m(j5, m5Var), k23.m(j5, obj));
                    break;
                case 50:
                    K k24 = L.f5338c;
                    zC = B.c(k24.m(j5, m5Var), k24.m(j5, obj));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j6 = iArr[i5 + 2] & 1048575;
                    K k25 = L.f5338c;
                    if (k25.j(j6, m5Var) != k25.j(j6, obj) || !B.c(k25.m(j5, m5Var), k25.m(j5, obj))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zC) {
                return false;
            }
        }
        this.f5634l.getClass();
        return m5Var.zzc.equals(((m5) obj).zzc);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.C0341t.h(java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.A
    public final void i(m5 m5Var, m5 m5Var2) {
        m5Var2.getClass();
        int i5 = 0;
        while (true) {
            int[] iArr = this.f5624a;
            if (i5 >= iArr.length) {
                B.b(this.f5634l, m5Var, m5Var2);
                return;
            }
            int iM = m(i5);
            long j5 = 1048575 & iM;
            int i6 = iArr[i5];
            switch (l(iM)) {
                case 0:
                    if (!z(i5, m5Var2)) {
                        break;
                    } else {
                        L.n(m5Var, j5, L.f5338c.a(j5, m5Var2));
                        w(i5, m5Var);
                        break;
                    }
                case 1:
                    if (!z(i5, m5Var2)) {
                        break;
                    } else {
                        L.o(m5Var, j5, L.f5338c.b(j5, m5Var2));
                        w(i5, m5Var);
                        break;
                    }
                case 2:
                    if (!z(i5, m5Var2)) {
                        break;
                    } else {
                        L.q(m5Var, j5, L.f5338c.k(j5, m5Var2));
                        w(i5, m5Var);
                        break;
                    }
                case 3:
                    if (!z(i5, m5Var2)) {
                        break;
                    } else {
                        L.q(m5Var, j5, L.f5338c.k(j5, m5Var2));
                        w(i5, m5Var);
                        break;
                    }
                case 4:
                    if (!z(i5, m5Var2)) {
                        break;
                    } else {
                        L.p(L.f5338c.j(j5, m5Var2), j5, m5Var);
                        w(i5, m5Var);
                        break;
                    }
                case 5:
                    if (!z(i5, m5Var2)) {
                        break;
                    } else {
                        L.q(m5Var, j5, L.f5338c.k(j5, m5Var2));
                        w(i5, m5Var);
                        break;
                    }
                case 6:
                    if (!z(i5, m5Var2)) {
                        break;
                    } else {
                        L.p(L.f5338c.j(j5, m5Var2), j5, m5Var);
                        w(i5, m5Var);
                        break;
                    }
                case 7:
                    if (!z(i5, m5Var2)) {
                        break;
                    } else {
                        L.l(m5Var, j5, L.f5338c.g(j5, m5Var2));
                        w(i5, m5Var);
                        break;
                    }
                case 8:
                    if (!z(i5, m5Var2)) {
                        break;
                    } else {
                        L.r(m5Var, j5, L.f5338c.m(j5, m5Var2));
                        w(i5, m5Var);
                        break;
                    }
                case 9:
                    t(m5Var, m5Var2, i5);
                    break;
                case 10:
                    if (!z(i5, m5Var2)) {
                        break;
                    } else {
                        L.r(m5Var, j5, L.f5338c.m(j5, m5Var2));
                        w(i5, m5Var);
                        break;
                    }
                case 11:
                    if (!z(i5, m5Var2)) {
                        break;
                    } else {
                        L.p(L.f5338c.j(j5, m5Var2), j5, m5Var);
                        w(i5, m5Var);
                        break;
                    }
                case 12:
                    if (!z(i5, m5Var2)) {
                        break;
                    } else {
                        L.p(L.f5338c.j(j5, m5Var2), j5, m5Var);
                        w(i5, m5Var);
                        break;
                    }
                case 13:
                    if (!z(i5, m5Var2)) {
                        break;
                    } else {
                        L.p(L.f5338c.j(j5, m5Var2), j5, m5Var);
                        w(i5, m5Var);
                        break;
                    }
                case 14:
                    if (!z(i5, m5Var2)) {
                        break;
                    } else {
                        L.q(m5Var, j5, L.f5338c.k(j5, m5Var2));
                        w(i5, m5Var);
                        break;
                    }
                case 15:
                    if (!z(i5, m5Var2)) {
                        break;
                    } else {
                        L.p(L.f5338c.j(j5, m5Var2), j5, m5Var);
                        w(i5, m5Var);
                        break;
                    }
                case 16:
                    if (!z(i5, m5Var2)) {
                        break;
                    } else {
                        L.q(m5Var, j5, L.f5338c.k(j5, m5Var2));
                        w(i5, m5Var);
                        break;
                    }
                case 17:
                    t(m5Var, m5Var2, i5);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f5633k.c(m5Var, m5Var2, j5);
                    break;
                case 50:
                    Class cls = B.f5262a;
                    K k5 = L.f5338c;
                    L.r(m5Var, j5, C0318p.c(k5.m(j5, m5Var), k5.m(j5, m5Var2)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!B(i6, m5Var2, i5)) {
                        break;
                    } else {
                        L.r(m5Var, j5, L.f5338c.m(j5, m5Var2));
                        x(i6, m5Var, i5);
                        break;
                    }
                case 60:
                    u(m5Var, m5Var2, i5);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!B(i6, m5Var2, i5)) {
                        break;
                    } else {
                        L.r(m5Var, j5, L.f5338c.m(j5, m5Var2));
                        x(i6, m5Var, i5);
                        break;
                    }
                case 68:
                    u(m5Var, m5Var2, i5);
                    break;
            }
            i5 += 3;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.A
    public final int j(U4 u4) {
        return this.f5629g ? I(u4) : H(u4);
    }

    public final int k(int i5, int i6) {
        int[] iArr = this.f5624a;
        int length = (iArr.length / 3) - 1;
        while (i6 <= length) {
            int i7 = (length + i6) >>> 1;
            int i8 = i7 * 3;
            int i9 = iArr[i8];
            if (i5 == i9) {
                return i8;
            }
            if (i5 < i9) {
                length = i7 - 1;
            } else {
                i6 = i7 + 1;
            }
        }
        return -1;
    }

    public final int m(int i5) {
        return this.f5624a[i5 + 1];
    }

    public final void o(int i5) {
        int i6 = i5 / 3;
        if (this.f5625b[i6 + i6 + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final A p(int i5) {
        int i6 = i5 / 3;
        int i7 = i6 + i6;
        Object[] objArr = this.f5625b;
        A a5 = (A) objArr[i7];
        if (a5 != null) {
            return a5;
        }
        A a6 = C0365x.f5676c.a((Class) objArr[i7 + 1]);
        objArr[i7] = a6;
        return a6;
    }

    public final void q(Object obj, int i5, Object obj2) {
        int i6 = this.f5624a[i5];
        if (L.f5338c.m(m(i5) & 1048575, obj) == null) {
            return;
        }
        o(i5);
    }

    public final Object r(int i5) {
        int i6 = i5 / 3;
        return this.f5625b[i6 + i6];
    }

    public final void t(m5 m5Var, m5 m5Var2, int i5) {
        long jM = m(i5) & 1048575;
        if (z(i5, m5Var2)) {
            K k5 = L.f5338c;
            Object objM = k5.m(jM, m5Var);
            Object objM2 = k5.m(jM, m5Var2);
            if (objM != null && objM2 != null) {
                L.r(m5Var, jM, AbstractC0246d.b(objM, objM2));
                w(i5, m5Var);
            } else if (objM2 != null) {
                L.r(m5Var, jM, objM2);
                w(i5, m5Var);
            }
        }
    }

    public final void u(m5 m5Var, m5 m5Var2, int i5) {
        int iM = m(i5);
        int i6 = this.f5624a[i5];
        long j5 = iM & 1048575;
        if (B(i6, m5Var2, i5)) {
            Object objM = B(i6, m5Var, i5) ? L.f5338c.m(j5, m5Var) : null;
            Object objM2 = L.f5338c.m(j5, m5Var2);
            if (objM != null && objM2 != null) {
                L.r(m5Var, j5, AbstractC0246d.b(objM, objM2));
                x(i6, m5Var, i5);
            } else if (objM2 != null) {
                L.r(m5Var, j5, objM2);
                x(i6, m5Var, i5);
            }
        }
    }

    public final void v(Object obj, int i5, b5 b5Var) {
        if ((536870912 & i5) != 0) {
            L.r(obj, i5 & 1048575, b5Var.w());
        } else if (this.f) {
            L.r(obj, i5 & 1048575, b5Var.v());
        } else {
            L.r(obj, i5 & 1048575, b5Var.u());
        }
    }

    public final void w(int i5, Object obj) {
        int i6 = this.f5624a[i5 + 2];
        long j5 = 1048575 & i6;
        if (j5 == 1048575) {
            return;
        }
        L.p((1 << (i6 >>> 20)) | L.f5338c.j(j5, obj), j5, obj);
    }

    public final void x(int i5, Object obj, int i6) {
        L.p(i5, this.f5624a[i6 + 2] & 1048575, obj);
    }

    public final boolean y(m5 m5Var, Object obj, int i5) {
        return z(i5, m5Var) == z(i5, obj);
    }

    public final boolean z(int i5, Object obj) {
        int i6 = this.f5624a[i5 + 2];
        long j5 = i6 & 1048575;
        if (j5 != 1048575) {
            return (L.f5338c.j(j5, obj) & (1 << (i6 >>> 20))) != 0;
        }
        int iM = m(i5);
        long j6 = iM & 1048575;
        switch (l(iM)) {
            case 0:
                return L.f5338c.a(j6, obj) != 0.0d;
            case 1:
                return L.f5338c.b(j6, obj) != 0.0f;
            case 2:
                return L.f5338c.k(j6, obj) != 0;
            case 3:
                return L.f5338c.k(j6, obj) != 0;
            case 4:
                return L.f5338c.j(j6, obj) != 0;
            case 5:
                return L.f5338c.k(j6, obj) != 0;
            case 6:
                return L.f5338c.j(j6, obj) != 0;
            case 7:
                return L.f5338c.g(j6, obj);
            case 8:
                Object objM = L.f5338c.m(j6, obj);
                if (objM instanceof String) {
                    return !((String) objM).isEmpty();
                }
                if (objM instanceof Z4) {
                    return !Z4.f5416e.equals(objM);
                }
                throw new IllegalArgumentException();
            case 9:
                return L.f5338c.m(j6, obj) != null;
            case 10:
                return !Z4.f5416e.equals(L.f5338c.m(j6, obj));
            case 11:
                return L.f5338c.j(j6, obj) != 0;
            case 12:
                return L.f5338c.j(j6, obj) != 0;
            case 13:
                return L.f5338c.j(j6, obj) != 0;
            case 14:
                return L.f5338c.k(j6, obj) != 0;
            case 15:
                return L.f5338c.j(j6, obj) != 0;
            case 16:
                return L.f5338c.k(j6, obj) != 0;
            case 17:
                return L.f5338c.m(j6, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }
}
