package t;

import s.C0822d;

/* loaded from: classes.dex */
public final class i extends o {
    @Override // t.InterfaceC0872d
    public final void a(InterfaceC0872d interfaceC0872d) {
        f fVar = this.f8956h;
        if (fVar.f8929c && !fVar.f8935j) {
            fVar.d((int) ((((f) fVar.f8937l.get(0)).f8932g * ((s.h) this.f8951b).k0) + 0.5f));
        }
    }

    @Override // t.o
    public final void d() {
        C0822d c0822d = this.f8951b;
        s.h hVar = (s.h) c0822d;
        int i5 = hVar.l0;
        int i6 = hVar.m0;
        int i7 = hVar.o0;
        f fVar = this.f8956h;
        if (i7 == 1) {
            if (i5 != -1) {
                fVar.f8937l.add(c0822d.f8621N.f8640d.f8956h);
                this.f8951b.f8621N.f8640d.f8956h.f8936k.add(fVar);
                fVar.f = i5;
            } else if (i6 != -1) {
                fVar.f8937l.add(c0822d.f8621N.f8640d.f8957i);
                this.f8951b.f8621N.f8640d.f8957i.f8936k.add(fVar);
                fVar.f = -i6;
            } else {
                fVar.f8928b = true;
                fVar.f8937l.add(c0822d.f8621N.f8640d.f8957i);
                this.f8951b.f8621N.f8640d.f8957i.f8936k.add(fVar);
            }
            m(this.f8951b.f8640d.f8956h);
            m(this.f8951b.f8640d.f8957i);
            return;
        }
        if (i5 != -1) {
            fVar.f8937l.add(c0822d.f8621N.f8642e.f8956h);
            this.f8951b.f8621N.f8642e.f8956h.f8936k.add(fVar);
            fVar.f = i5;
        } else if (i6 != -1) {
            fVar.f8937l.add(c0822d.f8621N.f8642e.f8957i);
            this.f8951b.f8621N.f8642e.f8957i.f8936k.add(fVar);
            fVar.f = -i6;
        } else {
            fVar.f8928b = true;
            fVar.f8937l.add(c0822d.f8621N.f8642e.f8957i);
            this.f8951b.f8621N.f8642e.f8957i.f8936k.add(fVar);
        }
        m(this.f8951b.f8642e.f8956h);
        m(this.f8951b.f8642e.f8957i);
    }

    @Override // t.o
    public final void e() {
        C0822d c0822d = this.f8951b;
        int i5 = ((s.h) c0822d).o0;
        f fVar = this.f8956h;
        if (i5 == 1) {
            c0822d.f8626S = fVar.f8932g;
        } else {
            c0822d.f8627T = fVar.f8932g;
        }
    }

    @Override // t.o
    public final void f() {
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
