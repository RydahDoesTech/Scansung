package I3;

import O3.AbstractC0070b;
import O3.AbstractC0079k;
import O3.AbstractC0080l;
import O3.AbstractC0084p;

/* renamed from: I3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036s extends AbstractC0080l {

    /* renamed from: g, reason: collision with root package name */
    public int f1347g;

    /* renamed from: h, reason: collision with root package name */
    public int f1348h;

    @Override // O3.AbstractC0079k
    public final AbstractC0070b c() {
        C0037t c0037t = new C0037t(this);
        int i5 = (this.f1347g & 1) != 1 ? 0 : 1;
        c0037t.f1352g = this.f1348h;
        c0037t.f = i5;
        if (c0037t.b()) {
            return c0037t;
        }
        throw new O2.d();
    }

    public final Object clone() {
        C0036s c0036s = new C0036s();
        C0037t c0037t = new C0037t(this);
        int i5 = (this.f1347g & 1) != 1 ? 0 : 1;
        c0037t.f1352g = this.f1348h;
        c0037t.f = i5;
        c0036s.g(c0037t);
        return c0036s;
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
            I3.a r1 = I3.C0037t.f1350k     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            I3.t r1 = new I3.t     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r2.g(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            O3.b r4 = r3.f2092d     // Catch: java.lang.Throwable -> Lf
            I3.t r4 = (I3.C0037t) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.g(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.C0036s.d(O3.f, O3.i):O3.k");
    }

    @Override // O3.AbstractC0079k
    public final /* bridge */ /* synthetic */ AbstractC0079k e(AbstractC0084p abstractC0084p) {
        g((C0037t) abstractC0084p);
        return this;
    }

    public final void g(C0037t c0037t) {
        if (c0037t == C0037t.f1349j) {
            return;
        }
        if ((c0037t.f & 1) == 1) {
            int i5 = c0037t.f1352g;
            this.f1347g = 1 | this.f1347g;
            this.f1348h = i5;
        }
        f(c0037t);
        this.f2081d = this.f2081d.m(c0037t.f1351e);
    }
}
