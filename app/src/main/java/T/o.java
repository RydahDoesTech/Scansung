package t;

import k.Q0;
import s.C0821c;
import s.C0822d;

/* loaded from: classes.dex */
public abstract class o implements InterfaceC0872d {

    /* renamed from: a, reason: collision with root package name */
    public int f8950a;

    /* renamed from: b, reason: collision with root package name */
    public C0822d f8951b;

    /* renamed from: c, reason: collision with root package name */
    public l f8952c;

    /* renamed from: d, reason: collision with root package name */
    public int f8953d;

    /* renamed from: e, reason: collision with root package name */
    public final g f8954e = new g(this);
    public int f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8955g = false;

    /* renamed from: h, reason: collision with root package name */
    public final f f8956h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public final f f8957i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f8958j = 1;

    public o(C0822d c0822d) {
        this.f8951b = c0822d;
    }

    public static void b(f fVar, f fVar2, int i5) {
        fVar.f8937l.add(fVar2);
        fVar.f = i5;
        fVar2.f8936k.add(fVar);
    }

    public static f h(C0821c c0821c) {
        C0821c c0821c2 = c0821c.f;
        if (c0821c2 == null) {
            return null;
        }
        int iC = Q0.c(c0821c2.f8605e);
        C0822d c0822d = c0821c2.f8604d;
        if (iC == 1) {
            return c0822d.f8640d.f8956h;
        }
        if (iC == 2) {
            return c0822d.f8642e.f8956h;
        }
        if (iC == 3) {
            return c0822d.f8640d.f8957i;
        }
        if (iC == 4) {
            return c0822d.f8642e.f8957i;
        }
        if (iC != 5) {
            return null;
        }
        return c0822d.f8642e.f8943k;
    }

    public static f i(C0821c c0821c, int i5) {
        C0821c c0821c2 = c0821c.f;
        if (c0821c2 == null) {
            return null;
        }
        C0822d c0822d = c0821c2.f8604d;
        o oVar = i5 == 0 ? c0822d.f8640d : c0822d.f8642e;
        int iC = Q0.c(c0821c2.f8605e);
        if (iC == 1 || iC == 2) {
            return oVar.f8956h;
        }
        if (iC == 3 || iC == 4) {
            return oVar.f8957i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i5, g gVar) {
        fVar.f8937l.add(fVar2);
        fVar.f8937l.add(this.f8954e);
        fVar.f8933h = i5;
        fVar.f8934i = gVar;
        fVar2.f8936k.add(fVar);
        gVar.f8936k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i5, int i6) {
        int iMax;
        if (i6 == 0) {
            C0822d c0822d = this.f8951b;
            int i7 = c0822d.f8656p;
            iMax = Math.max(c0822d.f8655o, i5);
            if (i7 > 0) {
                iMax = Math.min(i7, i5);
            }
            if (iMax == i5) {
                return i5;
            }
        } else {
            C0822d c0822d2 = this.f8951b;
            int i8 = c0822d2.f8659s;
            iMax = Math.max(c0822d2.f8658r, i5);
            if (i8 > 0) {
                iMax = Math.min(i8, i5);
            }
            if (iMax == i5) {
                return i5;
            }
        }
        return iMax;
    }

    public long j() {
        if (this.f8954e.f8935j) {
            return r2.f8932g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(s.C0821c r12, s.C0821c r13, int r14) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.o.l(s.c, s.c, int):void");
    }
}
