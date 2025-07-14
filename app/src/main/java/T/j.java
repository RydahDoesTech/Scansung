package t;

import java.util.Iterator;
import s.C0819a;
import s.C0822d;

/* loaded from: classes.dex */
public final class j extends o {
    @Override // t.InterfaceC0872d
    public final void a(InterfaceC0872d interfaceC0872d) {
        C0819a c0819a = (C0819a) this.f8951b;
        int i5 = c0819a.m0;
        f fVar = this.f8956h;
        Iterator it = fVar.f8937l.iterator();
        int i6 = 0;
        int i7 = -1;
        while (it.hasNext()) {
            int i8 = ((f) it.next()).f8932g;
            if (i7 == -1 || i8 < i7) {
                i7 = i8;
            }
            if (i6 < i8) {
                i6 = i8;
            }
        }
        if (i5 == 0 || i5 == 2) {
            fVar.d(i7 + c0819a.o0);
        } else {
            fVar.d(i6 + c0819a.o0);
        }
    }

    @Override // t.o
    public final void d() {
        C0822d c0822d = this.f8951b;
        if (c0822d instanceof C0819a) {
            f fVar = this.f8956h;
            fVar.f8928b = true;
            C0819a c0819a = (C0819a) c0822d;
            int i5 = c0819a.m0;
            boolean z4 = c0819a.n0;
            int i6 = 0;
            if (i5 == 0) {
                fVar.f8931e = 4;
                while (i6 < c0819a.l0) {
                    C0822d c0822d2 = c0819a.k0[i6];
                    if (z4 || c0822d2.f8635a0 != 8) {
                        f fVar2 = c0822d2.f8640d.f8956h;
                        fVar2.f8936k.add(fVar);
                        fVar.f8937l.add(fVar2);
                    }
                    i6++;
                }
                m(this.f8951b.f8640d.f8956h);
                m(this.f8951b.f8640d.f8957i);
                return;
            }
            if (i5 == 1) {
                fVar.f8931e = 5;
                while (i6 < c0819a.l0) {
                    C0822d c0822d3 = c0819a.k0[i6];
                    if (z4 || c0822d3.f8635a0 != 8) {
                        f fVar3 = c0822d3.f8640d.f8957i;
                        fVar3.f8936k.add(fVar);
                        fVar.f8937l.add(fVar3);
                    }
                    i6++;
                }
                m(this.f8951b.f8640d.f8956h);
                m(this.f8951b.f8640d.f8957i);
                return;
            }
            if (i5 == 2) {
                fVar.f8931e = 6;
                while (i6 < c0819a.l0) {
                    C0822d c0822d4 = c0819a.k0[i6];
                    if (z4 || c0822d4.f8635a0 != 8) {
                        f fVar4 = c0822d4.f8642e.f8956h;
                        fVar4.f8936k.add(fVar);
                        fVar.f8937l.add(fVar4);
                    }
                    i6++;
                }
                m(this.f8951b.f8642e.f8956h);
                m(this.f8951b.f8642e.f8957i);
                return;
            }
            if (i5 != 3) {
                return;
            }
            fVar.f8931e = 7;
            while (i6 < c0819a.l0) {
                C0822d c0822d5 = c0819a.k0[i6];
                if (z4 || c0822d5.f8635a0 != 8) {
                    f fVar5 = c0822d5.f8642e.f8957i;
                    fVar5.f8936k.add(fVar);
                    fVar.f8937l.add(fVar5);
                }
                i6++;
            }
            m(this.f8951b.f8642e.f8956h);
            m(this.f8951b.f8642e.f8957i);
        }
    }

    @Override // t.o
    public final void e() {
        C0822d c0822d = this.f8951b;
        if (c0822d instanceof C0819a) {
            int i5 = ((C0819a) c0822d).m0;
            f fVar = this.f8956h;
            if (i5 == 0 || i5 == 1) {
                c0822d.f8626S = fVar.f8932g;
            } else {
                c0822d.f8627T = fVar.f8932g;
            }
        }
    }

    @Override // t.o
    public final void f() {
        this.f8952c = null;
        this.f8956h.c();
    }

    @Override // t.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f8956h;
        fVar2.f8936k.add(fVar);
        fVar.f8937l.add(fVar2);
    }
}
