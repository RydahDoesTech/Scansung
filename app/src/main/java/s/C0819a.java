package s;

import r.C0806b;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0819a extends i {
    public int m0;
    public boolean n0;
    public int o0;
    public boolean p0;

    public final boolean M() {
        int i5;
        int i6;
        int i7;
        boolean z4 = true;
        int i8 = 0;
        while (true) {
            i5 = this.l0;
            if (i8 >= i5) {
                break;
            }
            C0822d c0822d = this.k0[i8];
            if ((this.n0 || c0822d.c()) && ((((i6 = this.m0) == 0 || i6 == 1) && !c0822d.w()) || (((i7 = this.m0) == 2 || i7 == 3) && !c0822d.x()))) {
                z4 = false;
            }
            i8++;
        }
        if (!z4 || i5 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z5 = false;
        for (int i9 = 0; i9 < this.l0; i9++) {
            C0822d c0822d2 = this.k0[i9];
            if (this.n0 || c0822d2.c()) {
                if (!z5) {
                    int i10 = this.m0;
                    if (i10 == 0) {
                        iMax = c0822d2.i(2).d();
                    } else if (i10 == 1) {
                        iMax = c0822d2.i(4).d();
                    } else if (i10 == 2) {
                        iMax = c0822d2.i(3).d();
                    } else if (i10 == 3) {
                        iMax = c0822d2.i(5).d();
                    }
                    z5 = true;
                }
                int i11 = this.m0;
                if (i11 == 0) {
                    iMax = Math.min(iMax, c0822d2.i(2).d());
                } else if (i11 == 1) {
                    iMax = Math.max(iMax, c0822d2.i(4).d());
                } else if (i11 == 2) {
                    iMax = Math.min(iMax, c0822d2.i(3).d());
                } else if (i11 == 3) {
                    iMax = Math.max(iMax, c0822d2.i(5).d());
                }
            }
        }
        int i12 = iMax + this.o0;
        int i13 = this.m0;
        if (i13 == 0 || i13 == 1) {
            C(i12, i12);
        } else {
            D(i12, i12);
        }
        this.p0 = true;
        return true;
    }

    public final int N() {
        int i5 = this.m0;
        if (i5 == 0 || i5 == 1) {
            return 0;
        }
        return (i5 == 2 || i5 == 3) ? 1 : -1;
    }

    @Override // s.C0822d
    public final void b(r.c cVar, boolean z4) {
        boolean z5;
        int i5;
        int i6;
        C0821c[] c0821cArr = this.f8618K;
        C0821c c0821c = this.f8611C;
        c0821cArr[0] = c0821c;
        C0821c c0821c2 = this.f8612D;
        int i7 = 2;
        c0821cArr[2] = c0821c2;
        C0821c c0821c3 = this.E;
        c0821cArr[1] = c0821c3;
        C0821c c0821c4 = this.f8613F;
        c0821cArr[3] = c0821c4;
        for (C0821c c0821c5 : c0821cArr) {
            c0821c5.f8608i = cVar.k(c0821c5);
        }
        int i8 = this.m0;
        if (i8 < 0 || i8 >= 4) {
            return;
        }
        C0821c c0821c6 = c0821cArr[i8];
        if (!this.p0) {
            M();
        }
        if (this.p0) {
            this.p0 = false;
            int i9 = this.m0;
            if (i9 == 0 || i9 == 1) {
                cVar.d(c0821c.f8608i, this.f8626S);
                cVar.d(c0821c3.f8608i, this.f8626S);
                return;
            } else {
                if (i9 == 2 || i9 == 3) {
                    cVar.d(c0821c2.f8608i, this.f8627T);
                    cVar.d(c0821c4.f8608i, this.f8627T);
                    return;
                }
                return;
            }
        }
        for (int i10 = 0; i10 < this.l0; i10++) {
            C0822d c0822d = this.k0[i10];
            if ((this.n0 || c0822d.c()) && ((((i6 = this.m0) == 0 || i6 == 1) && c0822d.f8651j0[0] == 3 && c0822d.f8611C.f != null && c0822d.E.f != null) || ((i6 == 2 || i6 == 3) && c0822d.f8651j0[1] == 3 && c0822d.f8612D.f != null && c0822d.f8613F.f != null))) {
                z5 = true;
                break;
            }
        }
        z5 = false;
        boolean z6 = c0821c.g() || c0821c3.g();
        boolean z7 = c0821c2.g() || c0821c4.g();
        int i11 = (z5 || !(((i5 = this.m0) == 0 && z6) || ((i5 == 2 && z7) || ((i5 == 1 && z6) || (i5 == 3 && z7))))) ? 4 : 5;
        int i12 = 0;
        while (i12 < this.l0) {
            C0822d c0822d2 = this.k0[i12];
            if (this.n0 || c0822d2.c()) {
                r.f fVarK = cVar.k(c0822d2.f8618K[this.m0]);
                int i13 = this.m0;
                C0821c c0821c7 = c0822d2.f8618K[i13];
                c0821c7.f8608i = fVarK;
                C0821c c0821c8 = c0821c7.f;
                int i14 = (c0821c8 == null || c0821c8.f8604d != this) ? 0 : c0821c7.f8606g;
                if (i13 == 0 || i13 == i7) {
                    r.f fVar = c0821c6.f8608i;
                    int i15 = this.o0 - i14;
                    C0806b c0806bL = cVar.l();
                    r.f fVarM = cVar.m();
                    fVarM.f8553d = 0;
                    c0806bL.c(fVar, fVarK, fVarM, i15);
                    cVar.c(c0806bL);
                } else {
                    r.f fVar2 = c0821c6.f8608i;
                    int i16 = this.o0 + i14;
                    C0806b c0806bL2 = cVar.l();
                    r.f fVarM2 = cVar.m();
                    fVarM2.f8553d = 0;
                    c0806bL2.b(fVar2, fVarK, fVarM2, i16);
                    cVar.c(c0806bL2);
                }
                cVar.e(c0821c6.f8608i, fVarK, this.o0 + i14, i11);
            }
            i12++;
            i7 = 2;
        }
        int i17 = this.m0;
        if (i17 == 0) {
            cVar.e(c0821c3.f8608i, c0821c.f8608i, 0, 8);
            cVar.e(c0821c.f8608i, this.f8621N.E.f8608i, 0, 4);
            cVar.e(c0821c.f8608i, this.f8621N.f8611C.f8608i, 0, 0);
            return;
        }
        if (i17 == 1) {
            cVar.e(c0821c.f8608i, c0821c3.f8608i, 0, 8);
            cVar.e(c0821c.f8608i, this.f8621N.f8611C.f8608i, 0, 4);
            cVar.e(c0821c.f8608i, this.f8621N.E.f8608i, 0, 0);
        } else if (i17 == 2) {
            cVar.e(c0821c4.f8608i, c0821c2.f8608i, 0, 8);
            cVar.e(c0821c2.f8608i, this.f8621N.f8613F.f8608i, 0, 4);
            cVar.e(c0821c2.f8608i, this.f8621N.f8612D.f8608i, 0, 0);
        } else if (i17 == 3) {
            cVar.e(c0821c2.f8608i, c0821c4.f8608i, 0, 8);
            cVar.e(c0821c2.f8608i, this.f8621N.f8612D.f8608i, 0, 4);
            cVar.e(c0821c2.f8608i, this.f8621N.f8613F.f8608i, 0, 0);
        }
    }

    @Override // s.C0822d
    public final boolean c() {
        return true;
    }

    @Override // s.C0822d
    public final String toString() {
        String strP = A3.f.p(new StringBuilder("[Barrier] "), this.f8637b0, " {");
        for (int i5 = 0; i5 < this.l0; i5++) {
            C0822d c0822d = this.k0[i5];
            if (i5 > 0) {
                strP = g4.f.c(strP, ", ");
            }
            strP = strP + c0822d.f8637b0;
        }
        return g4.f.c(strP, "}");
    }

    @Override // s.C0822d
    public final boolean w() {
        return this.p0;
    }

    @Override // s.C0822d
    public final boolean x() {
        return this.p0;
    }
}
