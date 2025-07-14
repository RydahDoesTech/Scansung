package s;

import com.google.android.gms.internal.p000firebaseauthapi.a5;
import java.util.ArrayList;
import t.C0870b;

/* loaded from: classes.dex */
public final class g extends i {
    public int A0;

    /* renamed from: B0, reason: collision with root package name */
    public int f8694B0;

    /* renamed from: C0, reason: collision with root package name */
    public int f8695C0;

    /* renamed from: D0, reason: collision with root package name */
    public float f8696D0;

    /* renamed from: E0, reason: collision with root package name */
    public float f8697E0;

    /* renamed from: F0, reason: collision with root package name */
    public float f8698F0;

    /* renamed from: G0, reason: collision with root package name */
    public float f8699G0;

    /* renamed from: H0, reason: collision with root package name */
    public float f8700H0;

    /* renamed from: I0, reason: collision with root package name */
    public float f8701I0;

    /* renamed from: J0, reason: collision with root package name */
    public int f8702J0;

    /* renamed from: K0, reason: collision with root package name */
    public int f8703K0;

    /* renamed from: L0, reason: collision with root package name */
    public int f8704L0;

    /* renamed from: M0, reason: collision with root package name */
    public int f8705M0;
    public int N0;

    /* renamed from: O0, reason: collision with root package name */
    public int f8706O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f8707P0;

    /* renamed from: Q0, reason: collision with root package name */
    public ArrayList f8708Q0;

    /* renamed from: R0, reason: collision with root package name */
    public C0822d[] f8709R0;

    /* renamed from: S0, reason: collision with root package name */
    public C0822d[] f8710S0;

    /* renamed from: T0, reason: collision with root package name */
    public int[] f8711T0;

    /* renamed from: U0, reason: collision with root package name */
    public C0822d[] f8712U0;
    public int V0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f8713r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f8714s0;
    public int t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f8715u0;

    /* renamed from: v0, reason: collision with root package name */
    public C0870b f8716v0;

    /* renamed from: w0, reason: collision with root package name */
    public a5 f8717w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f8718x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f8719y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f8720z0;

    @Override // s.i
    public final void L() {
        for (int i5 = 0; i5 < this.l0; i5++) {
            C0822d c0822d = this.k0[i5];
            if (c0822d != null) {
                c0822d.f8666z = true;
            }
        }
    }

    public final int M(C0822d c0822d, int i5) {
        if (c0822d == null) {
            return 0;
        }
        int[] iArr = c0822d.f8651j0;
        if (iArr[1] == 3) {
            int i6 = c0822d.f8654m;
            if (i6 == 0) {
                return 0;
            }
            if (i6 == 2) {
                int i7 = (int) (c0822d.f8660t * i5);
                if (i7 != c0822d.k()) {
                    c0822d.f8645g = true;
                    O(iArr[0], c0822d.n(), 1, i7, c0822d);
                }
                return i7;
            }
            if (i6 == 1) {
                return c0822d.k();
            }
            if (i6 == 3) {
                return (int) ((c0822d.n() * c0822d.f8624Q) + 0.5f);
            }
        }
        return c0822d.k();
    }

    public final int N(C0822d c0822d, int i5) {
        if (c0822d == null) {
            return 0;
        }
        int[] iArr = c0822d.f8651j0;
        if (iArr[0] == 3) {
            int i6 = c0822d.f8653l;
            if (i6 == 0) {
                return 0;
            }
            if (i6 == 2) {
                int i7 = (int) (c0822d.f8657q * i5);
                if (i7 != c0822d.n()) {
                    c0822d.f8645g = true;
                    O(1, i7, iArr[1], c0822d.k(), c0822d);
                }
                return i7;
            }
            if (i6 == 1) {
                return c0822d.n();
            }
            if (i6 == 3) {
                return (int) ((c0822d.k() * c0822d.f8624Q) + 0.5f);
            }
        }
        return c0822d.n();
    }

    public final void O(int i5, int i6, int i7, int i8, C0822d c0822d) {
        a5 a5Var;
        C0822d c0822d2;
        while (true) {
            a5Var = this.f8717w0;
            if (a5Var != null || (c0822d2 = this.f8621N) == null) {
                break;
            } else {
                this.f8717w0 = ((e) c0822d2).n0;
            }
        }
        C0870b c0870b = this.f8716v0;
        c0870b.f8909a = i5;
        c0870b.f8910b = i7;
        c0870b.f8911c = i6;
        c0870b.f8912d = i8;
        a5Var.b(c0822d, c0870b);
        c0822d.H(c0870b.f8913e);
        c0822d.E(c0870b.f);
        c0822d.f8665y = c0870b.f8915h;
        c0822d.B(c0870b.f8914g);
    }

    @Override // s.C0822d
    public final void b(r.c cVar, boolean z4) {
        C0822d c0822d;
        super.b(cVar, z4);
        C0822d c0822d2 = this.f8621N;
        boolean z5 = c0822d2 != null ? ((e) c0822d2).o0 : false;
        int i5 = this.N0;
        ArrayList arrayList = this.f8708Q0;
        if (i5 != 0) {
            if (i5 == 1) {
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    ((f) arrayList.get(i6)).b(i6, z5, i6 == size + (-1));
                    i6++;
                }
            } else if (i5 == 2 && this.f8711T0 != null && this.f8710S0 != null && this.f8709R0 != null) {
                for (int i7 = 0; i7 < this.V0; i7++) {
                    this.f8712U0[i7].z();
                }
                int[] iArr = this.f8711T0;
                int i8 = iArr[0];
                int i9 = iArr[1];
                C0822d c0822d3 = null;
                for (int i10 = 0; i10 < i8; i10++) {
                    C0822d c0822d4 = this.f8710S0[z5 ? (i8 - i10) - 1 : i10];
                    if (c0822d4 != null && c0822d4.f8635a0 != 8) {
                        C0821c c0821c = c0822d4.f8611C;
                        if (i10 == 0) {
                            c0822d4.f(c0821c, this.f8611C, this.q0);
                            c0822d4.f8639c0 = this.f8718x0;
                            c0822d4.f8631X = this.f8696D0;
                        }
                        if (i10 == i8 - 1) {
                            c0822d4.f(c0822d4.E, this.E, this.f8713r0);
                        }
                        if (i10 > 0) {
                            c0822d4.f(c0821c, c0822d3.E, this.f8702J0);
                            c0822d3.f(c0822d3.E, c0821c, 0);
                        }
                        c0822d3 = c0822d4;
                    }
                }
                for (int i11 = 0; i11 < i9; i11++) {
                    C0822d c0822d5 = this.f8709R0[i11];
                    if (c0822d5 != null && c0822d5.f8635a0 != 8) {
                        C0821c c0821c2 = c0822d5.f8612D;
                        if (i11 == 0) {
                            c0822d5.f(c0821c2, this.f8612D, this.m0);
                            c0822d5.f8641d0 = this.f8719y0;
                            c0822d5.f8632Y = this.f8697E0;
                        }
                        if (i11 == i9 - 1) {
                            c0822d5.f(c0822d5.f8613F, this.f8613F, this.n0);
                        }
                        if (i11 > 0) {
                            c0822d5.f(c0821c2, c0822d3.f8613F, this.f8703K0);
                            c0822d3.f(c0822d3.f8613F, c0821c2, 0);
                        }
                        c0822d3 = c0822d5;
                    }
                }
                for (int i12 = 0; i12 < i8; i12++) {
                    for (int i13 = 0; i13 < i9; i13++) {
                        int i14 = (i13 * i8) + i12;
                        if (this.f8707P0 == 1) {
                            i14 = (i12 * i9) + i13;
                        }
                        C0822d[] c0822dArr = this.f8712U0;
                        if (i14 < c0822dArr.length && (c0822d = c0822dArr[i14]) != null && c0822d.f8635a0 != 8) {
                            C0822d c0822d6 = this.f8710S0[i12];
                            C0822d c0822d7 = this.f8709R0[i13];
                            if (c0822d != c0822d6) {
                                c0822d.f(c0822d.f8611C, c0822d6.f8611C, 0);
                                c0822d.f(c0822d.E, c0822d6.E, 0);
                            }
                            if (c0822d != c0822d7) {
                                c0822d.f(c0822d.f8612D, c0822d7.f8612D, 0);
                                c0822d.f(c0822d.f8613F, c0822d7.f8613F, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z5, true);
        }
        this.f8714s0 = false;
    }
}
