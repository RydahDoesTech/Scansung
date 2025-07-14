package com.google.android.gms.internal.p000firebaseauthapi;

import A3.f;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class D {
    public static final D f = new D(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f5283a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f5284b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f5285c;

    /* renamed from: d, reason: collision with root package name */
    public int f5286d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5287e;

    public D(int i5, int[] iArr, Object[] objArr, boolean z4) {
        this.f5283a = i5;
        this.f5284b = iArr;
        this.f5285c = objArr;
        this.f5287e = z4;
    }

    public static D b() {
        return new D(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iA0;
        int iB0;
        int i5 = this.f5286d;
        if (i5 != -1) {
            return i5;
        }
        int iJ = 0;
        for (int i6 = 0; i6 < this.f5283a; i6++) {
            int i7 = this.f5284b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f5285c[i6]).getClass();
                    iJ = f.j(i8 << 3, 8, iJ);
                } else if (i9 == 2) {
                    Z4 z4 = (Z4) this.f5285c[i6];
                    int iA02 = f5.a0(i8 << 3);
                    int iN = z4.n();
                    iJ = f.k(iN, iN, iA02, iJ);
                } else if (i9 == 3) {
                    int iZ = f5.Z(i8);
                    iA0 = iZ + iZ;
                    iB0 = ((D) this.f5285c[i6]).a();
                } else {
                    if (i9 != 5) {
                        throw new IllegalStateException(C0258f.a());
                    }
                    ((Integer) this.f5285c[i6]).getClass();
                    iJ = f.j(i8 << 3, 4, iJ);
                }
            } else {
                long jLongValue = ((Long) this.f5285c[i6]).longValue();
                iA0 = f5.a0(i8 << 3);
                iB0 = f5.b0(jLongValue);
            }
            iJ = iB0 + iA0 + iJ;
        }
        this.f5286d = iJ;
        return iJ;
    }

    public final void c(int i5, Object obj) {
        if (!this.f5287e) {
            throw new UnsupportedOperationException();
        }
        int i6 = this.f5283a;
        int[] iArr = this.f5284b;
        if (i6 == iArr.length) {
            int i7 = i6 + (i6 < 4 ? 8 : i6 >> 1);
            this.f5284b = Arrays.copyOf(iArr, i7);
            this.f5285c = Arrays.copyOf(this.f5285c, i7);
        }
        int[] iArr2 = this.f5284b;
        int i8 = this.f5283a;
        iArr2[i8] = i5;
        this.f5285c[i8] = obj;
        this.f5283a = i8 + 1;
    }

    public final void d(C0306n c0306n) {
        if (this.f5283a != 0) {
            for (int i5 = 0; i5 < this.f5283a; i5++) {
                int i6 = this.f5284b[i5];
                Object obj = this.f5285c[i5];
                int i7 = i6 >>> 3;
                int i8 = i6 & 7;
                if (i8 == 0) {
                    c0306n.B(i7, ((Long) obj).longValue());
                } else if (i8 == 1) {
                    c0306n.x(i7, ((Long) obj).longValue());
                } else if (i8 == 2) {
                    c0306n.o(i7, (Z4) obj);
                } else if (i8 == 3) {
                    ((f5) c0306n.f5568e).o0(i7, 3);
                    ((D) obj).d(c0306n);
                    ((f5) c0306n.f5568e).o0(i7, 4);
                } else {
                    if (i8 != 5) {
                        throw new RuntimeException(C0258f.a());
                    }
                    c0306n.w(i7, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof D)) {
            return false;
        }
        D d5 = (D) obj;
        int i5 = this.f5283a;
        if (i5 == d5.f5283a) {
            int[] iArr = this.f5284b;
            int[] iArr2 = d5.f5284b;
            int i6 = 0;
            while (true) {
                if (i6 >= i5) {
                    Object[] objArr = this.f5285c;
                    Object[] objArr2 = d5.f5285c;
                    int i7 = this.f5283a;
                    for (int i8 = 0; i8 < i7; i8++) {
                        if (objArr[i8].equals(objArr2[i8])) {
                        }
                    }
                    return true;
                }
                if (iArr[i6] != iArr2[i6]) {
                    break;
                }
                i6++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.f5283a;
        int i6 = (i5 + 527) * 31;
        int[] iArr = this.f5284b;
        int iHashCode = 17;
        int i7 = 17;
        for (int i8 = 0; i8 < i5; i8++) {
            i7 = (i7 * 31) + iArr[i8];
        }
        int i9 = (i6 + i7) * 31;
        Object[] objArr = this.f5285c;
        int i10 = this.f5283a;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + objArr[i11].hashCode();
        }
        return i9 + iHashCode;
    }
}
