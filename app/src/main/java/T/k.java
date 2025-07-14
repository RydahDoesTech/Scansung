package t;

import s.C0821c;
import s.C0822d;

/* loaded from: classes.dex */
public final class k extends o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f8940k = new int[2];

    public static void m(int[] iArr, int i5, int i6, int i7, int i8, float f, int i9) {
        int i10 = i6 - i5;
        int i11 = i8 - i7;
        if (i9 != -1) {
            if (i9 == 0) {
                iArr[0] = (int) ((i11 * f) + 0.5f);
                iArr[1] = i11;
                return;
            } else {
                if (i9 != 1) {
                    return;
                }
                iArr[0] = i10;
                iArr[1] = (int) ((i10 * f) + 0.5f);
                return;
            }
        }
        int i12 = (int) ((i11 * f) + 0.5f);
        int i13 = (int) ((i10 / f) + 0.5f);
        if (i12 <= i10) {
            iArr[0] = i12;
            iArr[1] = i11;
        } else if (i13 <= i11) {
            iArr[0] = i10;
            iArr[1] = i13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0267  */
    @Override // t.InterfaceC0872d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(t.InterfaceC0872d r24) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.k.a(t.d):void");
    }

    @Override // t.o
    public final void d() {
        C0822d c0822d;
        C0822d c0822d2;
        C0822d c0822d3;
        C0822d c0822d4;
        C0822d c0822d5 = this.f8951b;
        boolean z4 = c0822d5.f8634a;
        g gVar = this.f8954e;
        if (z4) {
            gVar.d(c0822d5.n());
        }
        boolean z5 = gVar.f8935j;
        f fVar = this.f8957i;
        f fVar2 = this.f8956h;
        if (!z5) {
            C0822d c0822d6 = this.f8951b;
            int i5 = c0822d6.f8651j0[0];
            this.f8953d = i5;
            if (i5 != 3) {
                if (i5 == 4 && (((c0822d4 = c0822d6.f8621N) != null && c0822d4.f8651j0[0] == 1) || c0822d4.f8651j0[0] == 4)) {
                    int iN = (c0822d4.n() - this.f8951b.f8611C.e()) - this.f8951b.E.e();
                    o.b(fVar2, c0822d4.f8640d.f8956h, this.f8951b.f8611C.e());
                    o.b(fVar, c0822d4.f8640d.f8957i, -this.f8951b.E.e());
                    gVar.d(iN);
                    return;
                }
                if (i5 == 1) {
                    gVar.d(c0822d6.n());
                }
            }
        } else if (this.f8953d == 4 && (((c0822d2 = (c0822d = this.f8951b).f8621N) != null && c0822d2.f8651j0[0] == 1) || c0822d2.f8651j0[0] == 4)) {
            o.b(fVar2, c0822d2.f8640d.f8956h, c0822d.f8611C.e());
            o.b(fVar, c0822d2.f8640d.f8957i, -this.f8951b.E.e());
            return;
        }
        if (gVar.f8935j) {
            C0822d c0822d7 = this.f8951b;
            if (c0822d7.f8634a) {
                C0821c[] c0821cArr = c0822d7.f8618K;
                C0821c c0821c = c0821cArr[0];
                C0821c c0821c2 = c0821c.f;
                if (c0821c2 != null && c0821cArr[1].f != null) {
                    if (c0822d7.t()) {
                        fVar2.f = this.f8951b.f8618K[0].e();
                        fVar.f = -this.f8951b.f8618K[1].e();
                        return;
                    }
                    f fVarH = o.h(this.f8951b.f8618K[0]);
                    if (fVarH != null) {
                        o.b(fVar2, fVarH, this.f8951b.f8618K[0].e());
                    }
                    f fVarH2 = o.h(this.f8951b.f8618K[1]);
                    if (fVarH2 != null) {
                        o.b(fVar, fVarH2, -this.f8951b.f8618K[1].e());
                    }
                    fVar2.f8928b = true;
                    fVar.f8928b = true;
                    return;
                }
                if (c0821c2 != null) {
                    f fVarH3 = o.h(c0821c);
                    if (fVarH3 != null) {
                        o.b(fVar2, fVarH3, this.f8951b.f8618K[0].e());
                        o.b(fVar, fVar2, gVar.f8932g);
                        return;
                    }
                    return;
                }
                C0821c c0821c3 = c0821cArr[1];
                if (c0821c3.f != null) {
                    f fVarH4 = o.h(c0821c3);
                    if (fVarH4 != null) {
                        o.b(fVar, fVarH4, -this.f8951b.f8618K[1].e());
                        o.b(fVar2, fVar, -gVar.f8932g);
                        return;
                    }
                    return;
                }
                if ((c0822d7 instanceof s.i) || c0822d7.f8621N == null || c0822d7.i(7).f != null) {
                    return;
                }
                C0822d c0822d8 = this.f8951b;
                o.b(fVar2, c0822d8.f8621N.f8640d.f8956h, c0822d8.o());
                o.b(fVar, fVar2, gVar.f8932g);
                return;
            }
        }
        if (this.f8953d == 3) {
            C0822d c0822d9 = this.f8951b;
            int i6 = c0822d9.f8653l;
            if (i6 == 2) {
                C0822d c0822d10 = c0822d9.f8621N;
                if (c0822d10 != null) {
                    g gVar2 = c0822d10.f8642e.f8954e;
                    gVar.f8937l.add(gVar2);
                    gVar2.f8936k.add(gVar);
                    gVar.f8928b = true;
                    gVar.f8936k.add(fVar2);
                    gVar.f8936k.add(fVar);
                }
            } else if (i6 == 3) {
                if (c0822d9.f8654m == 3) {
                    fVar2.f8927a = this;
                    fVar.f8927a = this;
                    m mVar = c0822d9.f8642e;
                    mVar.f8956h.f8927a = this;
                    mVar.f8957i.f8927a = this;
                    gVar.f8927a = this;
                    if (c0822d9.u()) {
                        gVar.f8937l.add(this.f8951b.f8642e.f8954e);
                        this.f8951b.f8642e.f8954e.f8936k.add(gVar);
                        m mVar2 = this.f8951b.f8642e;
                        mVar2.f8954e.f8927a = this;
                        gVar.f8937l.add(mVar2.f8956h);
                        gVar.f8937l.add(this.f8951b.f8642e.f8957i);
                        this.f8951b.f8642e.f8956h.f8936k.add(gVar);
                        this.f8951b.f8642e.f8957i.f8936k.add(gVar);
                    } else if (this.f8951b.t()) {
                        this.f8951b.f8642e.f8954e.f8937l.add(gVar);
                        gVar.f8936k.add(this.f8951b.f8642e.f8954e);
                    } else {
                        this.f8951b.f8642e.f8954e.f8937l.add(gVar);
                    }
                } else {
                    g gVar3 = c0822d9.f8642e.f8954e;
                    gVar.f8937l.add(gVar3);
                    gVar3.f8936k.add(gVar);
                    this.f8951b.f8642e.f8956h.f8936k.add(gVar);
                    this.f8951b.f8642e.f8957i.f8936k.add(gVar);
                    gVar.f8928b = true;
                    gVar.f8936k.add(fVar2);
                    gVar.f8936k.add(fVar);
                    fVar2.f8937l.add(gVar);
                    fVar.f8937l.add(gVar);
                }
            }
        }
        C0822d c0822d11 = this.f8951b;
        C0821c[] c0821cArr2 = c0822d11.f8618K;
        C0821c c0821c4 = c0821cArr2[0];
        C0821c c0821c5 = c0821c4.f;
        if (c0821c5 != null && c0821cArr2[1].f != null) {
            if (c0822d11.t()) {
                fVar2.f = this.f8951b.f8618K[0].e();
                fVar.f = -this.f8951b.f8618K[1].e();
                return;
            }
            f fVarH5 = o.h(this.f8951b.f8618K[0]);
            f fVarH6 = o.h(this.f8951b.f8618K[1]);
            fVarH5.b(this);
            fVarH6.b(this);
            this.f8958j = 4;
            return;
        }
        if (c0821c5 != null) {
            f fVarH7 = o.h(c0821c4);
            if (fVarH7 != null) {
                o.b(fVar2, fVarH7, this.f8951b.f8618K[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        C0821c c0821c6 = c0821cArr2[1];
        if (c0821c6.f != null) {
            f fVarH8 = o.h(c0821c6);
            if (fVarH8 != null) {
                o.b(fVar, fVarH8, -this.f8951b.f8618K[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((c0822d11 instanceof s.i) || (c0822d3 = c0822d11.f8621N) == null) {
            return;
        }
        o.b(fVar2, c0822d3.f8640d.f8956h, c0822d11.o());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // t.o
    public final void e() {
        f fVar = this.f8956h;
        if (fVar.f8935j) {
            this.f8951b.f8626S = fVar.f8932g;
        }
    }

    @Override // t.o
    public final void f() {
        this.f8952c = null;
        this.f8956h.c();
        this.f8957i.c();
        this.f8954e.c();
        this.f8955g = false;
    }

    @Override // t.o
    public final boolean k() {
        return this.f8953d != 3 || this.f8951b.f8653l == 0;
    }

    public final void n() {
        this.f8955g = false;
        f fVar = this.f8956h;
        fVar.c();
        fVar.f8935j = false;
        f fVar2 = this.f8957i;
        fVar2.c();
        fVar2.f8935j = false;
        this.f8954e.f8935j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f8951b.f8637b0;
    }
}
