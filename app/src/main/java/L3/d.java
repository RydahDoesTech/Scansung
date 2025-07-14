package L3;

import O3.AbstractC0070b;
import O3.AbstractC0079k;
import O3.AbstractC0084p;
import O3.x;

/* loaded from: classes.dex */
public final class d extends AbstractC0079k implements x {

    /* renamed from: e, reason: collision with root package name */
    public int f1751e;
    public b f;

    /* renamed from: g, reason: collision with root package name */
    public c f1752g;

    /* renamed from: h, reason: collision with root package name */
    public c f1753h;

    /* renamed from: i, reason: collision with root package name */
    public c f1754i;

    /* renamed from: j, reason: collision with root package name */
    public c f1755j;

    public static d g() {
        d dVar = new d();
        dVar.f = b.f1737j;
        c cVar = c.f1744j;
        dVar.f1752g = cVar;
        dVar.f1753h = cVar;
        dVar.f1754i = cVar;
        dVar.f1755j = cVar;
        return dVar;
    }

    @Override // O3.AbstractC0079k
    public final AbstractC0070b c() {
        e eVarF = f();
        if (eVarF.b()) {
            return eVarF;
        }
        throw new O2.d();
    }

    public final Object clone() {
        d dVarG = g();
        dVarG.h(f());
        return dVarG;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // O3.AbstractC0079k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final O3.AbstractC0079k d(O3.C0074f r3, O3.C0077i r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            I3.a r1 = L3.e.n     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            L3.e r1 = new L3.e     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r2.h(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            O3.b r4 = r3.f2092d     // Catch: java.lang.Throwable -> Lf
            L3.e r4 = (L3.e) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.h(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.d.d(O3.f, O3.i):O3.k");
    }

    @Override // O3.AbstractC0079k
    public final /* bridge */ /* synthetic */ AbstractC0079k e(AbstractC0084p abstractC0084p) {
        h((e) abstractC0084p);
        return this;
    }

    public final e f() {
        e eVar = new e(this);
        int i5 = this.f1751e;
        int i6 = (i5 & 1) != 1 ? 0 : 1;
        eVar.f = this.f;
        if ((i5 & 2) == 2) {
            i6 |= 2;
        }
        eVar.f1759g = this.f1752g;
        if ((i5 & 4) == 4) {
            i6 |= 4;
        }
        eVar.f1760h = this.f1753h;
        if ((i5 & 8) == 8) {
            i6 |= 8;
        }
        eVar.f1761i = this.f1754i;
        if ((i5 & 16) == 16) {
            i6 |= 16;
        }
        eVar.f1762j = this.f1755j;
        eVar.f1758e = i6;
        return eVar;
    }

    public final void h(e eVar) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        b bVar;
        if (eVar == e.f1756m) {
            return;
        }
        if ((eVar.f1758e & 1) == 1) {
            b bVar2 = eVar.f;
            if ((this.f1751e & 1) != 1 || (bVar = this.f) == b.f1737j) {
                this.f = bVar2;
            } else {
                a aVar = new a(0);
                aVar.h(bVar);
                aVar.h(bVar2);
                this.f = aVar.f();
            }
            this.f1751e |= 1;
        }
        if ((eVar.f1758e & 2) == 2) {
            c cVar5 = eVar.f1759g;
            if ((this.f1751e & 2) != 2 || (cVar4 = this.f1752g) == c.f1744j) {
                this.f1752g = cVar5;
            } else {
                a aVarI = c.i(cVar4);
                aVarI.i(cVar5);
                this.f1752g = aVarI.g();
            }
            this.f1751e |= 2;
        }
        if ((eVar.f1758e & 4) == 4) {
            c cVar6 = eVar.f1760h;
            if ((this.f1751e & 4) != 4 || (cVar3 = this.f1753h) == c.f1744j) {
                this.f1753h = cVar6;
            } else {
                a aVarI2 = c.i(cVar3);
                aVarI2.i(cVar6);
                this.f1753h = aVarI2.g();
            }
            this.f1751e |= 4;
        }
        if ((eVar.f1758e & 8) == 8) {
            c cVar7 = eVar.f1761i;
            if ((this.f1751e & 8) != 8 || (cVar2 = this.f1754i) == c.f1744j) {
                this.f1754i = cVar7;
            } else {
                a aVarI3 = c.i(cVar2);
                aVarI3.i(cVar7);
                this.f1754i = aVarI3.g();
            }
            this.f1751e |= 8;
        }
        if ((eVar.f1758e & 16) == 16) {
            c cVar8 = eVar.f1762j;
            if ((this.f1751e & 16) != 16 || (cVar = this.f1755j) == c.f1744j) {
                this.f1755j = cVar8;
            } else {
                a aVarI4 = c.i(cVar);
                aVarI4.i(cVar8);
                this.f1755j = aVarI4.g();
            }
            this.f1751e |= 16;
        }
        this.f2081d = this.f2081d.m(eVar.f1757d);
    }
}
