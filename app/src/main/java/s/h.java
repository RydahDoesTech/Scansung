package s;

import java.util.ArrayList;
import k.Q0;
import r.C0806b;

/* loaded from: classes.dex */
public final class h extends C0822d {
    public float k0 = -1.0f;
    public int l0 = -1;
    public int m0 = -1;
    public C0821c n0 = this.f8612D;
    public int o0 = 0;
    public boolean p0;

    public h() {
        this.f8619L.clear();
        this.f8619L.add(this.n0);
        int length = this.f8618K.length;
        for (int i5 = 0; i5 < length; i5++) {
            this.f8618K[i5] = this.n0;
        }
    }

    @Override // s.C0822d
    public final void J(r.c cVar, boolean z4) {
        if (this.f8621N == null) {
            return;
        }
        C0821c c0821c = this.n0;
        cVar.getClass();
        int iN = r.c.n(c0821c);
        if (this.o0 == 1) {
            this.f8626S = iN;
            this.f8627T = 0;
            E(this.f8621N.k());
            H(0);
            return;
        }
        this.f8626S = 0;
        this.f8627T = iN;
        H(this.f8621N.n());
        E(0);
    }

    public final void K(int i5) {
        this.n0.l(i5);
        this.p0 = true;
    }

    public final void L(int i5) {
        if (this.o0 == i5) {
            return;
        }
        this.o0 = i5;
        ArrayList arrayList = this.f8619L;
        arrayList.clear();
        if (this.o0 == 1) {
            this.n0 = this.f8611C;
        } else {
            this.n0 = this.f8612D;
        }
        arrayList.add(this.n0);
        C0821c[] c0821cArr = this.f8618K;
        int length = c0821cArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            c0821cArr[i6] = this.n0;
        }
    }

    @Override // s.C0822d
    public final void b(r.c cVar, boolean z4) {
        e eVar = (e) this.f8621N;
        if (eVar == null) {
            return;
        }
        Object objI = eVar.i(2);
        Object objI2 = eVar.i(4);
        C0822d c0822d = this.f8621N;
        boolean z5 = c0822d != null && c0822d.f8651j0[0] == 2;
        if (this.o0 == 0) {
            objI = eVar.i(3);
            objI2 = eVar.i(5);
            C0822d c0822d2 = this.f8621N;
            z5 = c0822d2 != null && c0822d2.f8651j0[1] == 2;
        }
        if (this.p0) {
            C0821c c0821c = this.n0;
            if (c0821c.f8603c) {
                r.f fVarK = cVar.k(c0821c);
                cVar.d(fVarK, this.n0.d());
                if (this.l0 != -1) {
                    if (z5) {
                        cVar.f(cVar.k(objI2), fVarK, 0, 5);
                    }
                } else if (this.m0 != -1 && z5) {
                    r.f fVarK2 = cVar.k(objI2);
                    cVar.f(fVarK, cVar.k(objI), 0, 5);
                    cVar.f(fVarK2, fVarK, 0, 5);
                }
                this.p0 = false;
                return;
            }
        }
        if (this.l0 != -1) {
            r.f fVarK3 = cVar.k(this.n0);
            cVar.e(fVarK3, cVar.k(objI), this.l0, 8);
            if (z5) {
                cVar.f(cVar.k(objI2), fVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.m0 != -1) {
            r.f fVarK4 = cVar.k(this.n0);
            r.f fVarK5 = cVar.k(objI2);
            cVar.e(fVarK4, fVarK5, -this.m0, 8);
            if (z5) {
                cVar.f(fVarK4, cVar.k(objI), 0, 5);
                cVar.f(fVarK5, fVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.k0 != -1.0f) {
            r.f fVarK6 = cVar.k(this.n0);
            r.f fVarK7 = cVar.k(objI2);
            float f = this.k0;
            C0806b c0806bL = cVar.l();
            c0806bL.f8528d.g(fVarK6, -1.0f);
            c0806bL.f8528d.g(fVarK7, f);
            cVar.c(c0806bL);
        }
    }

    @Override // s.C0822d
    public final boolean c() {
        return true;
    }

    @Override // s.C0822d
    public final C0821c i(int i5) {
        switch (Q0.c(i5)) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.o0 == 1) {
                    return this.n0;
                }
                break;
            case 2:
            case 4:
                if (this.o0 == 0) {
                    return this.n0;
                }
                break;
        }
        throw new AssertionError(g4.f.e(i5));
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
