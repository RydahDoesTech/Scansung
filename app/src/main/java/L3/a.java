package L3;

import O3.AbstractC0070b;
import O3.AbstractC0079k;
import O3.AbstractC0084p;
import O3.x;

/* loaded from: classes.dex */
public final class a extends AbstractC0079k implements x {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1734e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f1735g;

    /* renamed from: h, reason: collision with root package name */
    public int f1736h;

    public /* synthetic */ a(int i5) {
        this.f1734e = i5;
    }

    @Override // O3.AbstractC0079k
    public final AbstractC0070b c() {
        switch (this.f1734e) {
            case 0:
                b bVarF = f();
                if (bVarF.b()) {
                    return bVarF;
                }
                throw new O2.d();
            default:
                c cVarG = g();
                if (cVarG.b()) {
                    return cVarG;
                }
                throw new O2.d();
        }
    }

    public final Object clone() {
        switch (this.f1734e) {
            case 0:
                a aVar = new a(0);
                aVar.h(f());
                return aVar;
            default:
                a aVar2 = new a(1);
                aVar2.i(g());
                return aVar2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    @Override // O3.AbstractC0079k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final O3.AbstractC0079k d(O3.C0074f r2, O3.C0077i r3) throws java.lang.Throwable {
        /*
            r1 = this;
            int r3 = r1.f1734e
            switch(r3) {
                case 0: goto L24;
                default: goto L5;
            }
        L5:
            r3 = 0
            I3.a r0 = L3.c.f1745k     // Catch: java.lang.Throwable -> L14 O3.C0086s -> L16
            r0.getClass()     // Catch: java.lang.Throwable -> L14 O3.C0086s -> L16
            L3.c r0 = new L3.c     // Catch: java.lang.Throwable -> L14 O3.C0086s -> L16
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L14 O3.C0086s -> L16
            r1.i(r0)
            return r1
        L14:
            r2 = move-exception
            goto L1e
        L16:
            r2 = move-exception
            O3.b r0 = r2.f2092d     // Catch: java.lang.Throwable -> L14
            L3.c r0 = (L3.c) r0     // Catch: java.lang.Throwable -> L14
            throw r2     // Catch: java.lang.Throwable -> L1c
        L1c:
            r2 = move-exception
            r3 = r0
        L1e:
            if (r3 == 0) goto L23
            r1.i(r3)
        L23:
            throw r2
        L24:
            r3 = 0
            I3.a r0 = L3.b.f1738k     // Catch: java.lang.Throwable -> L33 O3.C0086s -> L35
            r0.getClass()     // Catch: java.lang.Throwable -> L33 O3.C0086s -> L35
            L3.b r0 = new L3.b     // Catch: java.lang.Throwable -> L33 O3.C0086s -> L35
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L33 O3.C0086s -> L35
            r1.h(r0)
            return r1
        L33:
            r2 = move-exception
            goto L3d
        L35:
            r2 = move-exception
            O3.b r0 = r2.f2092d     // Catch: java.lang.Throwable -> L33
            L3.b r0 = (L3.b) r0     // Catch: java.lang.Throwable -> L33
            throw r2     // Catch: java.lang.Throwable -> L3b
        L3b:
            r2 = move-exception
            r3 = r0
        L3d:
            if (r3 == 0) goto L42
            r1.h(r3)
        L42:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.a.d(O3.f, O3.i):O3.k");
    }

    @Override // O3.AbstractC0079k
    public final /* bridge */ /* synthetic */ AbstractC0079k e(AbstractC0084p abstractC0084p) {
        switch (this.f1734e) {
            case 0:
                h((b) abstractC0084p);
                break;
            default:
                i((c) abstractC0084p);
                break;
        }
        return this;
    }

    public b f() {
        b bVar = new b(this);
        int i5 = this.f;
        int i6 = (i5 & 1) != 1 ? 0 : 1;
        bVar.f = this.f1735g;
        if ((i5 & 2) == 2) {
            i6 |= 2;
        }
        bVar.f1741g = this.f1736h;
        bVar.f1740e = i6;
        return bVar;
    }

    public c g() {
        c cVar = new c(this);
        int i5 = this.f;
        int i6 = (i5 & 1) != 1 ? 0 : 1;
        cVar.f = this.f1735g;
        if ((i5 & 2) == 2) {
            i6 |= 2;
        }
        cVar.f1748g = this.f1736h;
        cVar.f1747e = i6;
        return cVar;
    }

    public void h(b bVar) {
        if (bVar == b.f1737j) {
            return;
        }
        int i5 = bVar.f1740e;
        if ((i5 & 1) == 1) {
            int i6 = bVar.f;
            this.f = 1 | this.f;
            this.f1735g = i6;
        }
        if ((i5 & 2) == 2) {
            int i7 = bVar.f1741g;
            this.f = 2 | this.f;
            this.f1736h = i7;
        }
        this.f2081d = this.f2081d.m(bVar.f1739d);
    }

    public void i(c cVar) {
        if (cVar == c.f1744j) {
            return;
        }
        int i5 = cVar.f1747e;
        if ((i5 & 1) == 1) {
            int i6 = cVar.f;
            this.f = 1 | this.f;
            this.f1735g = i6;
        }
        if ((i5 & 2) == 2) {
            int i7 = cVar.f1748g;
            this.f = 2 | this.f;
            this.f1736h = i7;
        }
        this.f2081d = this.f2081d.m(cVar.f1746d);
    }
}
