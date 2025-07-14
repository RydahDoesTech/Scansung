package t;

import java.util.ArrayList;
import java.util.Iterator;
import s.C0821c;
import s.C0822d;

/* renamed from: t.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0871c extends o {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f8918k;

    /* renamed from: l, reason: collision with root package name */
    public int f8919l;

    public C0871c(C0822d c0822d, int i5) {
        C0822d c0822d2;
        super(c0822d);
        this.f8918k = new ArrayList();
        this.f = i5;
        C0822d c0822d3 = this.f8951b;
        C0822d c0822dM = c0822d3.m(i5);
        while (true) {
            C0822d c0822d4 = c0822dM;
            c0822d2 = c0822d3;
            c0822d3 = c0822d4;
            if (c0822d3 == null) {
                break;
            } else {
                c0822dM = c0822d3.m(this.f);
            }
        }
        this.f8951b = c0822d2;
        int i6 = this.f;
        o oVar = i6 == 0 ? c0822d2.f8640d : i6 == 1 ? c0822d2.f8642e : null;
        ArrayList arrayList = this.f8918k;
        arrayList.add(oVar);
        C0822d c0822dL = c0822d2.l(this.f);
        while (c0822dL != null) {
            int i7 = this.f;
            arrayList.add(i7 == 0 ? c0822dL.f8640d : i7 == 1 ? c0822dL.f8642e : null);
            c0822dL = c0822dL.l(this.f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o oVar2 = (o) it.next();
            int i8 = this.f;
            if (i8 == 0) {
                oVar2.f8951b.f8636b = this;
            } else if (i8 == 1) {
                oVar2.f8951b.f8638c = this;
            }
        }
        if (this.f == 0 && ((s.e) this.f8951b.f8621N).o0 && arrayList.size() > 1) {
            this.f8951b = ((o) arrayList.get(arrayList.size() - 1)).f8951b;
        }
        this.f8919l = this.f == 0 ? this.f8951b.f8639c0 : this.f8951b.f8641d0;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01c2 A[PHI: r2 r25
  0x01c2: PHI (r2v43 int) = (r2v39 int), (r2v48 int) binds: [B:120:0x01c0, B:111:0x01a0] A[DONT_GENERATE, DONT_INLINE]
  0x01c2: PHI (r25v1 float) = (r25v0 float), (r25v3 float) binds: [B:120:0x01c0, B:111:0x01a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0155  */
    @Override // t.InterfaceC0872d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(t.InterfaceC0872d r27) {
        /*
            Method dump skipped, instructions count: 997
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C0871c.a(t.d):void");
    }

    @Override // t.o
    public final void d() {
        ArrayList arrayList = this.f8918k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((o) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C0822d c0822d = ((o) arrayList.get(0)).f8951b;
        C0822d c0822d2 = ((o) arrayList.get(size - 1)).f8951b;
        int i5 = this.f;
        f fVar = this.f8957i;
        f fVar2 = this.f8956h;
        if (i5 == 0) {
            C0821c c0821c = c0822d.f8611C;
            C0821c c0821c2 = c0822d2.E;
            f fVarI = o.i(c0821c, 0);
            int iE = c0821c.e();
            C0822d c0822dM = m();
            if (c0822dM != null) {
                iE = c0822dM.f8611C.e();
            }
            if (fVarI != null) {
                o.b(fVar2, fVarI, iE);
            }
            f fVarI2 = o.i(c0821c2, 0);
            int iE2 = c0821c2.e();
            C0822d c0822dN = n();
            if (c0822dN != null) {
                iE2 = c0822dN.E.e();
            }
            if (fVarI2 != null) {
                o.b(fVar, fVarI2, -iE2);
            }
        } else {
            C0821c c0821c3 = c0822d.f8612D;
            C0821c c0821c4 = c0822d2.f8613F;
            f fVarI3 = o.i(c0821c3, 1);
            int iE3 = c0821c3.e();
            C0822d c0822dM2 = m();
            if (c0822dM2 != null) {
                iE3 = c0822dM2.f8612D.e();
            }
            if (fVarI3 != null) {
                o.b(fVar2, fVarI3, iE3);
            }
            f fVarI4 = o.i(c0821c4, 1);
            int iE4 = c0821c4.e();
            C0822d c0822dN2 = n();
            if (c0822dN2 != null) {
                iE4 = c0822dN2.f8613F.e();
            }
            if (fVarI4 != null) {
                o.b(fVar, fVarI4, -iE4);
            }
        }
        fVar2.f8927a = this;
        fVar.f8927a = this;
    }

    @Override // t.o
    public final void e() {
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f8918k;
            if (i5 >= arrayList.size()) {
                return;
            }
            ((o) arrayList.get(i5)).e();
            i5++;
        }
    }

    @Override // t.o
    public final void f() {
        this.f8952c = null;
        Iterator it = this.f8918k.iterator();
        while (it.hasNext()) {
            ((o) it.next()).f();
        }
    }

    @Override // t.o
    public final long j() {
        ArrayList arrayList = this.f8918k;
        int size = arrayList.size();
        long j5 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            j5 = r4.f8957i.f + ((o) arrayList.get(i5)).j() + j5 + r4.f8956h.f;
        }
        return j5;
    }

    @Override // t.o
    public final boolean k() {
        ArrayList arrayList = this.f8918k;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (!((o) arrayList.get(i5)).k()) {
                return false;
            }
        }
        return true;
    }

    public final C0822d m() {
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f8918k;
            if (i5 >= arrayList.size()) {
                return null;
            }
            C0822d c0822d = ((o) arrayList.get(i5)).f8951b;
            if (c0822d.f8635a0 != 8) {
                return c0822d;
            }
            i5++;
        }
    }

    public final C0822d n() {
        ArrayList arrayList = this.f8918k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0822d c0822d = ((o) arrayList.get(size)).f8951b;
            if (c0822d.f8635a0 != 8) {
                return c0822d;
            }
        }
        return null;
    }

    public final String toString() {
        String strConcat = "ChainRun ".concat(this.f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f8918k.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            strConcat = g4.f.c(g4.f.c(strConcat, "<") + oVar, "> ");
        }
        return strConcat;
    }
}
