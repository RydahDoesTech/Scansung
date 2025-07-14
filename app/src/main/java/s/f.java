package s;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f8678a;

    /* renamed from: d, reason: collision with root package name */
    public C0821c f8681d;

    /* renamed from: e, reason: collision with root package name */
    public C0821c f8682e;
    public C0821c f;

    /* renamed from: g, reason: collision with root package name */
    public C0821c f8683g;

    /* renamed from: h, reason: collision with root package name */
    public int f8684h;

    /* renamed from: i, reason: collision with root package name */
    public int f8685i;

    /* renamed from: j, reason: collision with root package name */
    public int f8686j;

    /* renamed from: k, reason: collision with root package name */
    public int f8687k;

    /* renamed from: q, reason: collision with root package name */
    public int f8692q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f8693r;

    /* renamed from: b, reason: collision with root package name */
    public C0822d f8679b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f8680c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f8688l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f8689m = 0;
    public int n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f8690o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f8691p = 0;

    public f(g gVar, int i5, C0821c c0821c, C0821c c0821c2, C0821c c0821c3, C0821c c0821c4, int i6) {
        this.f8693r = gVar;
        this.f8684h = 0;
        this.f8685i = 0;
        this.f8686j = 0;
        this.f8687k = 0;
        this.f8692q = 0;
        this.f8678a = i5;
        this.f8681d = c0821c;
        this.f8682e = c0821c2;
        this.f = c0821c3;
        this.f8683g = c0821c4;
        this.f8684h = gVar.q0;
        this.f8685i = gVar.m0;
        this.f8686j = gVar.f8713r0;
        this.f8687k = gVar.n0;
        this.f8692q = i6;
    }

    public final void a(C0822d c0822d) {
        int i5 = this.f8678a;
        g gVar = this.f8693r;
        if (i5 == 0) {
            int iN = gVar.N(c0822d, this.f8692q);
            if (c0822d.f8651j0[0] == 3) {
                this.f8691p++;
                iN = 0;
            }
            this.f8688l = iN + (c0822d.f8635a0 != 8 ? gVar.f8702J0 : 0) + this.f8688l;
            int iM = gVar.M(c0822d, this.f8692q);
            if (this.f8679b == null || this.f8680c < iM) {
                this.f8679b = c0822d;
                this.f8680c = iM;
                this.f8689m = iM;
            }
        } else {
            int iN2 = gVar.N(c0822d, this.f8692q);
            int iM2 = gVar.M(c0822d, this.f8692q);
            if (c0822d.f8651j0[1] == 3) {
                this.f8691p++;
                iM2 = 0;
            }
            this.f8689m = iM2 + (c0822d.f8635a0 != 8 ? gVar.f8703K0 : 0) + this.f8689m;
            if (this.f8679b == null || this.f8680c < iN2) {
                this.f8679b = c0822d;
                this.f8680c = iN2;
                this.f8688l = iN2;
            }
        }
        this.f8690o++;
    }

    public final void b(int i5, boolean z4, boolean z5) {
        g gVar;
        int i6;
        C0822d c0822d;
        char c2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = this.f8690o;
        int i12 = 0;
        while (true) {
            gVar = this.f8693r;
            if (i12 >= i11 || (i10 = this.n + i12) >= gVar.V0) {
                break;
            }
            C0822d c0822d2 = gVar.f8712U0[i10];
            if (c0822d2 != null) {
                c0822d2.z();
            }
            i12++;
        }
        if (i11 == 0 || this.f8679b == null) {
            return;
        }
        boolean z6 = z5 && i5 == 0;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = this.n + (z4 ? (i11 - 1) - i15 : i15);
            if (i16 >= gVar.V0) {
                break;
            }
            if (gVar.f8712U0[i16].f8635a0 == 0) {
                if (i13 == -1) {
                    i13 = i15;
                }
                i14 = i15;
            }
        }
        if (this.f8678a != 0) {
            C0822d c0822d3 = this.f8679b;
            c0822d3.f8639c0 = gVar.f8718x0;
            int i17 = this.f8684h;
            if (i5 > 0) {
                i17 += gVar.f8702J0;
            }
            C0821c c0821c = c0822d3.f8611C;
            C0821c c0821c2 = c0822d3.E;
            if (z4) {
                c0821c2.a(this.f, i17);
                if (z5) {
                    c0821c.a(this.f8681d, this.f8686j);
                }
                if (i5 > 0) {
                    this.f.f8604d.f8611C.a(c0821c2, 0);
                }
            } else {
                c0821c.a(this.f8681d, i17);
                if (z5) {
                    c0821c2.a(this.f, this.f8686j);
                }
                if (i5 > 0) {
                    this.f8681d.f8604d.E.a(c0821c, 0);
                }
            }
            int i18 = 0;
            C0822d c0822d4 = null;
            while (i18 < i11) {
                int i19 = this.n + i18;
                if (i19 >= gVar.V0) {
                    return;
                }
                C0822d c0822d5 = gVar.f8712U0[i19];
                if (i18 == 0) {
                    c0822d5.f(c0822d5.f8612D, this.f8682e, this.f8685i);
                    int i20 = gVar.f8719y0;
                    float f = gVar.f8697E0;
                    if (this.n == 0) {
                        int i21 = gVar.A0;
                        i6 = -1;
                        if (i21 != -1) {
                            f = gVar.f8699G0;
                        }
                        i20 = i21;
                        c0822d5.f8641d0 = i20;
                        c0822d5.f8632Y = f;
                    } else {
                        i6 = -1;
                    }
                    if (z5 && (i21 = gVar.f8695C0) != i6) {
                        f = gVar.f8701I0;
                        i20 = i21;
                    }
                    c0822d5.f8641d0 = i20;
                    c0822d5.f8632Y = f;
                }
                if (i18 == i11 - 1) {
                    c0822d5.f(c0822d5.f8613F, this.f8683g, this.f8687k);
                }
                if (c0822d4 != null) {
                    C0821c c0821c3 = c0822d5.f8612D;
                    int i22 = gVar.f8703K0;
                    C0821c c0821c4 = c0822d4.f8613F;
                    c0821c3.a(c0821c4, i22);
                    C0821c c0821c5 = c0822d5.f8612D;
                    if (i18 == i13) {
                        int i23 = this.f8685i;
                        if (c0821c5.h()) {
                            c0821c5.f8607h = i23;
                        }
                    }
                    c0821c4.a(c0821c5, 0);
                    if (i18 == i14 + 1) {
                        int i24 = this.f8687k;
                        if (c0821c4.h()) {
                            c0821c4.f8607h = i24;
                        }
                    }
                }
                if (c0822d5 != c0822d3) {
                    if (z4) {
                        int i25 = gVar.f8704L0;
                        if (i25 == 0) {
                            c0822d5.E.a(c0821c2, 0);
                        } else if (i25 == 1) {
                            c0822d5.f8611C.a(c0821c, 0);
                        } else if (i25 == 2) {
                            c0822d5.f8611C.a(c0821c, 0);
                            c0822d5.E.a(c0821c2, 0);
                        }
                    } else {
                        int i26 = gVar.f8704L0;
                        if (i26 == 0) {
                            c0822d5.f8611C.a(c0821c, 0);
                        } else if (i26 == 1) {
                            c0822d5.E.a(c0821c2, 0);
                        } else if (i26 == 2) {
                            if (z6) {
                                c0822d5.f8611C.a(this.f8681d, this.f8684h);
                                c0822d5.E.a(this.f, this.f8686j);
                            } else {
                                c0822d5.f8611C.a(c0821c, 0);
                                c0822d5.E.a(c0821c2, 0);
                            }
                        }
                    }
                }
                i18++;
                c0822d4 = c0822d5;
            }
            return;
        }
        C0822d c0822d6 = this.f8679b;
        c0822d6.f8641d0 = gVar.f8719y0;
        int i27 = this.f8685i;
        if (i5 > 0) {
            i27 += gVar.f8703K0;
        }
        C0821c c0821c6 = this.f8682e;
        C0821c c0821c7 = c0822d6.f8612D;
        c0821c7.a(c0821c6, i27);
        C0821c c0821c8 = c0822d6.f8613F;
        if (z5) {
            c0821c8.a(this.f8683g, this.f8687k);
        }
        if (i5 > 0) {
            this.f8682e.f8604d.f8613F.a(c0821c7, 0);
        }
        if (gVar.f8705M0 != 3 || c0822d6.f8665y) {
            c0822d = c0822d6;
        } else {
            for (int i28 = 0; i28 < i11; i28++) {
                int i29 = this.n + (z4 ? (i11 - 1) - i28 : i28);
                if (i29 >= gVar.V0) {
                    break;
                }
                c0822d = gVar.f8712U0[i29];
                if (c0822d.f8665y) {
                    break;
                }
            }
            c0822d = c0822d6;
        }
        int i30 = 0;
        C0822d c0822d7 = null;
        while (i30 < i11) {
            int i31 = z4 ? (i11 - 1) - i30 : i30;
            int i32 = this.n + i31;
            if (i32 >= gVar.V0) {
                return;
            }
            C0822d c0822d8 = gVar.f8712U0[i32];
            if (i30 == 0) {
                c0822d8.f(c0822d8.f8611C, this.f8681d, this.f8684h);
            }
            if (i31 == 0) {
                int i33 = gVar.f8718x0;
                float f5 = gVar.f8696D0;
                if (this.n == 0) {
                    int i34 = gVar.f8720z0;
                    i7 = i33;
                    i8 = -1;
                    if (i34 != -1) {
                        f5 = gVar.f8698F0;
                    }
                    i9 = i34;
                    c0822d8.f8639c0 = i9;
                    c0822d8.f8631X = f5;
                } else {
                    i7 = i33;
                    i8 = -1;
                }
                if (!z5 || (i34 = gVar.f8694B0) == i8) {
                    i9 = i7;
                    c0822d8.f8639c0 = i9;
                    c0822d8.f8631X = f5;
                } else {
                    f5 = gVar.f8700H0;
                    i9 = i34;
                    c0822d8.f8639c0 = i9;
                    c0822d8.f8631X = f5;
                }
            }
            if (i30 == i11 - 1) {
                c0822d8.f(c0822d8.E, this.f, this.f8686j);
            }
            if (c0822d7 != null) {
                C0821c c0821c9 = c0822d8.f8611C;
                int i35 = gVar.f8702J0;
                C0821c c0821c10 = c0822d7.E;
                c0821c9.a(c0821c10, i35);
                C0821c c0821c11 = c0822d8.f8611C;
                if (i30 == i13) {
                    int i36 = this.f8684h;
                    if (c0821c11.h()) {
                        c0821c11.f8607h = i36;
                    }
                }
                c0821c10.a(c0821c11, 0);
                if (i30 == i14 + 1) {
                    int i37 = this.f8686j;
                    if (c0821c10.h()) {
                        c0821c10.f8607h = i37;
                    }
                }
            }
            if (c0822d8 != c0822d6) {
                int i38 = gVar.f8705M0;
                c2 = 3;
                if (i38 == 3 && c0822d.f8665y && c0822d8 != c0822d && c0822d8.f8665y) {
                    c0822d8.f8614G.a(c0822d.f8614G, 0);
                } else if (i38 == 0) {
                    c0822d8.f8612D.a(c0821c7, 0);
                } else if (i38 == 1) {
                    c0822d8.f8613F.a(c0821c8, 0);
                } else if (z6) {
                    c0822d8.f8612D.a(this.f8682e, this.f8685i);
                    c0822d8.f8613F.a(this.f8683g, this.f8687k);
                } else {
                    c0822d8.f8612D.a(c0821c7, 0);
                    c0822d8.f8613F.a(c0821c8, 0);
                }
            } else {
                c2 = 3;
            }
            i30++;
            c0822d7 = c0822d8;
        }
    }

    public final int c() {
        return this.f8678a == 1 ? this.f8689m - this.f8693r.f8703K0 : this.f8689m;
    }

    public final int d() {
        return this.f8678a == 0 ? this.f8688l - this.f8693r.f8702J0 : this.f8688l;
    }

    public final void e(int i5) {
        g gVar;
        int i6;
        int i7 = this.f8691p;
        if (i7 == 0) {
            return;
        }
        int i8 = this.f8690o;
        int i9 = i5 / i7;
        int i10 = 0;
        while (true) {
            gVar = this.f8693r;
            if (i10 >= i8 || (i6 = this.n + i10) >= gVar.V0) {
                break;
            }
            C0822d c0822d = gVar.f8712U0[i6];
            if (this.f8678a == 0) {
                if (c0822d != null) {
                    int[] iArr = c0822d.f8651j0;
                    if (iArr[0] == 3 && c0822d.f8653l == 0) {
                        gVar.O(1, i9, iArr[1], c0822d.k(), c0822d);
                    }
                }
            } else if (c0822d != null) {
                int[] iArr2 = c0822d.f8651j0;
                if (iArr2[1] == 3 && c0822d.f8654m == 0) {
                    gVar.O(iArr2[0], c0822d.n(), 1, i9, c0822d);
                }
            }
            i10++;
        }
        this.f8688l = 0;
        this.f8689m = 0;
        this.f8679b = null;
        this.f8680c = 0;
        int i11 = this.f8690o;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = this.n + i12;
            if (i13 >= gVar.V0) {
                return;
            }
            C0822d c0822d2 = gVar.f8712U0[i13];
            if (this.f8678a == 0) {
                int iN = c0822d2.n();
                int i14 = gVar.f8702J0;
                if (c0822d2.f8635a0 == 8) {
                    i14 = 0;
                }
                this.f8688l = iN + i14 + this.f8688l;
                int iM = gVar.M(c0822d2, this.f8692q);
                if (this.f8679b == null || this.f8680c < iM) {
                    this.f8679b = c0822d2;
                    this.f8680c = iM;
                    this.f8689m = iM;
                }
            } else {
                int iN2 = gVar.N(c0822d2, this.f8692q);
                int iM2 = gVar.M(c0822d2, this.f8692q);
                int i15 = gVar.f8703K0;
                if (c0822d2.f8635a0 == 8) {
                    i15 = 0;
                }
                this.f8689m = iM2 + i15 + this.f8689m;
                if (this.f8679b == null || this.f8680c < iN2) {
                    this.f8679b = c0822d2;
                    this.f8680c = iN2;
                    this.f8688l = iN2;
                }
            }
        }
    }

    public final void f(int i5, C0821c c0821c, C0821c c0821c2, C0821c c0821c3, C0821c c0821c4, int i6, int i7, int i8, int i9, int i10) {
        this.f8678a = i5;
        this.f8681d = c0821c;
        this.f8682e = c0821c2;
        this.f = c0821c3;
        this.f8683g = c0821c4;
        this.f8684h = i6;
        this.f8685i = i7;
        this.f8686j = i8;
        this.f8687k = i9;
        this.f8692q = i10;
    }
}
