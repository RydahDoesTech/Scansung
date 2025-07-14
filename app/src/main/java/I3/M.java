package I3;

import O3.AbstractC0070b;
import O3.AbstractC0079k;
import O3.AbstractC0084p;

/* loaded from: classes.dex */
public final class M extends AbstractC0079k implements O3.x {

    /* renamed from: e, reason: collision with root package name */
    public int f1042e;
    public N f;

    /* renamed from: g, reason: collision with root package name */
    public Q f1043g;

    /* renamed from: h, reason: collision with root package name */
    public int f1044h;

    public static M g() {
        M m4 = new M();
        m4.f = N.INV;
        m4.f1043g = Q.f1072w;
        return m4;
    }

    @Override // O3.AbstractC0079k
    public final AbstractC0070b c() {
        O oF = f();
        if (oF.b()) {
            return oF;
        }
        throw new O2.d();
    }

    public final Object clone() {
        M mG = g();
        mG.h(f());
        return mG;
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
            I3.a r1 = I3.O.f1051l     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            I3.O r1 = new I3.O     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r2.h(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            O3.b r4 = r3.f2092d     // Catch: java.lang.Throwable -> Lf
            I3.O r4 = (I3.O) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: I3.M.d(O3.f, O3.i):O3.k");
    }

    @Override // O3.AbstractC0079k
    public final /* bridge */ /* synthetic */ AbstractC0079k e(AbstractC0084p abstractC0084p) {
        h((O) abstractC0084p);
        return this;
    }

    public final O f() {
        O o5 = new O(this);
        int i5 = this.f1042e;
        int i6 = (i5 & 1) != 1 ? 0 : 1;
        o5.f = this.f;
        if ((i5 & 2) == 2) {
            i6 |= 2;
        }
        o5.f1054g = this.f1043g;
        if ((i5 & 4) == 4) {
            i6 |= 4;
        }
        o5.f1055h = this.f1044h;
        o5.f1053e = i6;
        return o5;
    }

    public final void h(O o5) {
        Q q5;
        if (o5 == O.f1050k) {
            return;
        }
        if ((o5.f1053e & 1) == 1) {
            N n = o5.f;
            n.getClass();
            this.f1042e = 1 | this.f1042e;
            this.f = n;
        }
        if ((o5.f1053e & 2) == 2) {
            Q q6 = o5.f1054g;
            if ((this.f1042e & 2) != 2 || (q5 = this.f1043g) == Q.f1072w) {
                this.f1043g = q6;
            } else {
                P pR = Q.r(q5);
                pR.i(q6);
                this.f1043g = pR.g();
            }
            this.f1042e |= 2;
        }
        if ((o5.f1053e & 4) == 4) {
            int i5 = o5.f1055h;
            this.f1042e = 4 | this.f1042e;
            this.f1044h = i5;
        }
        this.f2081d = this.f2081d.m(o5.f1052d);
    }
}
