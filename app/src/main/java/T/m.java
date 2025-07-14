package t;

import k.Q0;
import s.C0821c;
import s.C0822d;

/* loaded from: classes.dex */
public final class m extends o {

    /* renamed from: k, reason: collision with root package name */
    public f f8943k;

    /* renamed from: l, reason: collision with root package name */
    public C0869a f8944l;

    @Override // t.InterfaceC0872d
    public final void a(InterfaceC0872d interfaceC0872d) {
        float f;
        float f5;
        float f6;
        int i5;
        if (Q0.c(this.f8958j) == 3) {
            C0822d c0822d = this.f8951b;
            l(c0822d.f8612D, c0822d.f8613F, 1);
            return;
        }
        g gVar = this.f8954e;
        if (gVar.f8929c && !gVar.f8935j && this.f8953d == 3) {
            C0822d c0822d2 = this.f8951b;
            int i6 = c0822d2.f8654m;
            if (i6 == 2) {
                C0822d c0822d3 = c0822d2.f8621N;
                if (c0822d3 != null) {
                    if (c0822d3.f8642e.f8954e.f8935j) {
                        gVar.d((int) ((r5.f8932g * c0822d2.f8660t) + 0.5f));
                    }
                }
            } else if (i6 == 3) {
                g gVar2 = c0822d2.f8640d.f8954e;
                if (gVar2.f8935j) {
                    int i7 = c0822d2.f8625R;
                    if (i7 == -1) {
                        f = gVar2.f8932g;
                        f5 = c0822d2.f8624Q;
                    } else if (i7 == 0) {
                        f6 = gVar2.f8932g * c0822d2.f8624Q;
                        i5 = (int) (f6 + 0.5f);
                        gVar.d(i5);
                    } else if (i7 != 1) {
                        i5 = 0;
                        gVar.d(i5);
                    } else {
                        f = gVar2.f8932g;
                        f5 = c0822d2.f8624Q;
                    }
                    f6 = f / f5;
                    i5 = (int) (f6 + 0.5f);
                    gVar.d(i5);
                }
            }
        }
        f fVar = this.f8956h;
        if (fVar.f8929c) {
            f fVar2 = this.f8957i;
            if (fVar2.f8929c) {
                if (fVar.f8935j && fVar2.f8935j && gVar.f8935j) {
                    return;
                }
                if (!gVar.f8935j && this.f8953d == 3) {
                    C0822d c0822d4 = this.f8951b;
                    if (c0822d4.f8653l == 0 && !c0822d4.u()) {
                        f fVar3 = (f) fVar.f8937l.get(0);
                        f fVar4 = (f) fVar2.f8937l.get(0);
                        int i8 = fVar3.f8932g + fVar.f;
                        int i9 = fVar4.f8932g + fVar2.f;
                        fVar.d(i8);
                        fVar2.d(i9);
                        gVar.d(i9 - i8);
                        return;
                    }
                }
                if (!gVar.f8935j && this.f8953d == 3 && this.f8950a == 1 && fVar.f8937l.size() > 0 && fVar2.f8937l.size() > 0) {
                    f fVar5 = (f) fVar.f8937l.get(0);
                    int i10 = (((f) fVar2.f8937l.get(0)).f8932g + fVar2.f) - (fVar5.f8932g + fVar.f);
                    int i11 = gVar.f8938m;
                    if (i10 < i11) {
                        gVar.d(i10);
                    } else {
                        gVar.d(i11);
                    }
                }
                if (gVar.f8935j && fVar.f8937l.size() > 0 && fVar2.f8937l.size() > 0) {
                    f fVar6 = (f) fVar.f8937l.get(0);
                    f fVar7 = (f) fVar2.f8937l.get(0);
                    int i12 = fVar6.f8932g;
                    int i13 = fVar.f + i12;
                    int i14 = fVar7.f8932g;
                    int i15 = fVar2.f + i14;
                    float f7 = this.f8951b.f8632Y;
                    if (fVar6 == fVar7) {
                        f7 = 0.5f;
                    } else {
                        i12 = i13;
                        i14 = i15;
                    }
                    fVar.d((int) ((((i14 - i12) - gVar.f8932g) * f7) + i12 + 0.5f));
                    fVar2.d(fVar.f8932g + gVar.f8932g);
                }
            }
        }
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
            gVar.d(c0822d5.k());
        }
        boolean z5 = gVar.f8935j;
        f fVar = this.f8957i;
        f fVar2 = this.f8956h;
        if (!z5) {
            C0822d c0822d6 = this.f8951b;
            this.f8953d = c0822d6.f8651j0[1];
            if (c0822d6.f8665y) {
                this.f8944l = new C0869a(this);
            }
            int i5 = this.f8953d;
            if (i5 != 3) {
                if (i5 == 4 && (c0822d4 = this.f8951b.f8621N) != null && c0822d4.f8651j0[1] == 1) {
                    int iK = (c0822d4.k() - this.f8951b.f8612D.e()) - this.f8951b.f8613F.e();
                    o.b(fVar2, c0822d4.f8642e.f8956h, this.f8951b.f8612D.e());
                    o.b(fVar, c0822d4.f8642e.f8957i, -this.f8951b.f8613F.e());
                    gVar.d(iK);
                    return;
                }
                if (i5 == 1) {
                    gVar.d(this.f8951b.k());
                }
            }
        } else if (this.f8953d == 4 && (c0822d2 = (c0822d = this.f8951b).f8621N) != null && c0822d2.f8651j0[1] == 1) {
            o.b(fVar2, c0822d2.f8642e.f8956h, c0822d.f8612D.e());
            o.b(fVar, c0822d2.f8642e.f8957i, -this.f8951b.f8613F.e());
            return;
        }
        boolean z6 = gVar.f8935j;
        f fVar3 = this.f8943k;
        if (z6) {
            C0822d c0822d7 = this.f8951b;
            if (c0822d7.f8634a) {
                C0821c[] c0821cArr = c0822d7.f8618K;
                C0821c c0821c = c0821cArr[2];
                C0821c c0821c2 = c0821c.f;
                if (c0821c2 != null && c0821cArr[3].f != null) {
                    if (c0822d7.u()) {
                        fVar2.f = this.f8951b.f8618K[2].e();
                        fVar.f = -this.f8951b.f8618K[3].e();
                    } else {
                        f fVarH = o.h(this.f8951b.f8618K[2]);
                        if (fVarH != null) {
                            o.b(fVar2, fVarH, this.f8951b.f8618K[2].e());
                        }
                        f fVarH2 = o.h(this.f8951b.f8618K[3]);
                        if (fVarH2 != null) {
                            o.b(fVar, fVarH2, -this.f8951b.f8618K[3].e());
                        }
                        fVar2.f8928b = true;
                        fVar.f8928b = true;
                    }
                    C0822d c0822d8 = this.f8951b;
                    if (c0822d8.f8665y) {
                        o.b(fVar3, fVar2, c0822d8.f8628U);
                        return;
                    }
                    return;
                }
                if (c0821c2 != null) {
                    f fVarH3 = o.h(c0821c);
                    if (fVarH3 != null) {
                        o.b(fVar2, fVarH3, this.f8951b.f8618K[2].e());
                        o.b(fVar, fVar2, gVar.f8932g);
                        C0822d c0822d9 = this.f8951b;
                        if (c0822d9.f8665y) {
                            o.b(fVar3, fVar2, c0822d9.f8628U);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0821c c0821c3 = c0821cArr[3];
                if (c0821c3.f != null) {
                    f fVarH4 = o.h(c0821c3);
                    if (fVarH4 != null) {
                        o.b(fVar, fVarH4, -this.f8951b.f8618K[3].e());
                        o.b(fVar2, fVar, -gVar.f8932g);
                    }
                    C0822d c0822d10 = this.f8951b;
                    if (c0822d10.f8665y) {
                        o.b(fVar3, fVar2, c0822d10.f8628U);
                        return;
                    }
                    return;
                }
                C0821c c0821c4 = c0821cArr[4];
                if (c0821c4.f != null) {
                    f fVarH5 = o.h(c0821c4);
                    if (fVarH5 != null) {
                        o.b(fVar3, fVarH5, 0);
                        o.b(fVar2, fVar3, -this.f8951b.f8628U);
                        o.b(fVar, fVar2, gVar.f8932g);
                        return;
                    }
                    return;
                }
                if ((c0822d7 instanceof s.i) || c0822d7.f8621N == null || c0822d7.i(7).f != null) {
                    return;
                }
                C0822d c0822d11 = this.f8951b;
                o.b(fVar2, c0822d11.f8621N.f8642e.f8956h, c0822d11.p());
                o.b(fVar, fVar2, gVar.f8932g);
                C0822d c0822d12 = this.f8951b;
                if (c0822d12.f8665y) {
                    o.b(fVar3, fVar2, c0822d12.f8628U);
                    return;
                }
                return;
            }
        }
        if (z6 || this.f8953d != 3) {
            gVar.b(this);
        } else {
            C0822d c0822d13 = this.f8951b;
            int i6 = c0822d13.f8654m;
            if (i6 == 2) {
                C0822d c0822d14 = c0822d13.f8621N;
                if (c0822d14 != null) {
                    g gVar2 = c0822d14.f8642e.f8954e;
                    gVar.f8937l.add(gVar2);
                    gVar2.f8936k.add(gVar);
                    gVar.f8928b = true;
                    gVar.f8936k.add(fVar2);
                    gVar.f8936k.add(fVar);
                }
            } else if (i6 == 3 && !c0822d13.u()) {
                C0822d c0822d15 = this.f8951b;
                if (c0822d15.f8653l != 3) {
                    g gVar3 = c0822d15.f8640d.f8954e;
                    gVar.f8937l.add(gVar3);
                    gVar3.f8936k.add(gVar);
                    gVar.f8928b = true;
                    gVar.f8936k.add(fVar2);
                    gVar.f8936k.add(fVar);
                }
            }
        }
        C0822d c0822d16 = this.f8951b;
        C0821c[] c0821cArr2 = c0822d16.f8618K;
        C0821c c0821c5 = c0821cArr2[2];
        C0821c c0821c6 = c0821c5.f;
        if (c0821c6 != null && c0821cArr2[3].f != null) {
            if (c0822d16.u()) {
                fVar2.f = this.f8951b.f8618K[2].e();
                fVar.f = -this.f8951b.f8618K[3].e();
            } else {
                f fVarH6 = o.h(this.f8951b.f8618K[2]);
                f fVarH7 = o.h(this.f8951b.f8618K[3]);
                fVarH6.b(this);
                fVarH7.b(this);
                this.f8958j = 4;
            }
            if (this.f8951b.f8665y) {
                c(fVar3, fVar2, 1, this.f8944l);
            }
        } else if (c0821c6 != null) {
            f fVarH8 = o.h(c0821c5);
            if (fVarH8 != null) {
                o.b(fVar2, fVarH8, this.f8951b.f8618K[2].e());
                c(fVar, fVar2, 1, gVar);
                if (this.f8951b.f8665y) {
                    c(fVar3, fVar2, 1, this.f8944l);
                }
                if (this.f8953d == 3) {
                    C0822d c0822d17 = this.f8951b;
                    if (c0822d17.f8624Q > 0.0f) {
                        k kVar = c0822d17.f8640d;
                        if (kVar.f8953d == 3) {
                            kVar.f8954e.f8936k.add(gVar);
                            gVar.f8937l.add(this.f8951b.f8640d.f8954e);
                            gVar.f8927a = this;
                        }
                    }
                }
            }
        } else {
            C0821c c0821c7 = c0821cArr2[3];
            if (c0821c7.f != null) {
                f fVarH9 = o.h(c0821c7);
                if (fVarH9 != null) {
                    o.b(fVar, fVarH9, -this.f8951b.f8618K[3].e());
                    c(fVar2, fVar, -1, gVar);
                    if (this.f8951b.f8665y) {
                        c(fVar3, fVar2, 1, this.f8944l);
                    }
                }
            } else {
                C0821c c0821c8 = c0821cArr2[4];
                if (c0821c8.f != null) {
                    f fVarH10 = o.h(c0821c8);
                    if (fVarH10 != null) {
                        o.b(fVar3, fVarH10, 0);
                        c(fVar2, fVar3, -1, this.f8944l);
                        c(fVar, fVar2, 1, gVar);
                    }
                } else if (!(c0822d16 instanceof s.i) && (c0822d3 = c0822d16.f8621N) != null) {
                    o.b(fVar2, c0822d3.f8642e.f8956h, c0822d16.p());
                    c(fVar, fVar2, 1, gVar);
                    if (this.f8951b.f8665y) {
                        c(fVar3, fVar2, 1, this.f8944l);
                    }
                    if (this.f8953d == 3) {
                        C0822d c0822d18 = this.f8951b;
                        if (c0822d18.f8624Q > 0.0f) {
                            k kVar2 = c0822d18.f8640d;
                            if (kVar2.f8953d == 3) {
                                kVar2.f8954e.f8936k.add(gVar);
                                gVar.f8937l.add(this.f8951b.f8640d.f8954e);
                                gVar.f8927a = this;
                            }
                        }
                    }
                }
            }
        }
        if (gVar.f8937l.size() == 0) {
            gVar.f8929c = true;
        }
    }

    @Override // t.o
    public final void e() {
        f fVar = this.f8956h;
        if (fVar.f8935j) {
            this.f8951b.f8627T = fVar.f8932g;
        }
    }

    @Override // t.o
    public final void f() {
        this.f8952c = null;
        this.f8956h.c();
        this.f8957i.c();
        this.f8943k.c();
        this.f8954e.c();
        this.f8955g = false;
    }

    @Override // t.o
    public final boolean k() {
        return this.f8953d != 3 || this.f8951b.f8654m == 0;
    }

    public final void m() {
        this.f8955g = false;
        f fVar = this.f8956h;
        fVar.c();
        fVar.f8935j = false;
        f fVar2 = this.f8957i;
        fVar2.c();
        fVar2.f8935j = false;
        f fVar3 = this.f8943k;
        fVar3.c();
        fVar3.f8935j = false;
        this.f8954e.f8935j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f8951b.f8637b0;
    }
}
