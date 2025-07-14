package I3;

import O3.AbstractC0070b;
import O3.AbstractC0079k;
import O3.AbstractC0080l;
import O3.AbstractC0084p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class B extends AbstractC0080l {

    /* renamed from: g, reason: collision with root package name */
    public int f956g;

    /* renamed from: h, reason: collision with root package name */
    public List f957h;

    /* renamed from: i, reason: collision with root package name */
    public List f958i;

    /* renamed from: j, reason: collision with root package name */
    public List f959j;

    /* renamed from: k, reason: collision with root package name */
    public X f960k;

    /* renamed from: l, reason: collision with root package name */
    public e0 f961l;

    public static B h() {
        B b2 = new B();
        b2.f957h = Collections.emptyList();
        b2.f958i = Collections.emptyList();
        b2.f959j = Collections.emptyList();
        b2.f960k = X.f1134j;
        b2.f961l = e0.f1228h;
        return b2;
    }

    @Override // O3.AbstractC0079k
    public final AbstractC0070b c() {
        C cG = g();
        if (cG.b()) {
            return cG;
        }
        throw new O2.d();
    }

    public final Object clone() {
        B bH = h();
        bH.i(g());
        return bH;
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
            I3.a r1 = I3.C.f962o     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            I3.C r1 = new I3.C     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            O3.b r4 = r3.f2092d     // Catch: java.lang.Throwable -> Lf
            I3.C r4 = (I3.C) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.i(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.B.d(O3.f, O3.i):O3.k");
    }

    @Override // O3.AbstractC0079k
    public final /* bridge */ /* synthetic */ AbstractC0079k e(AbstractC0084p abstractC0084p) {
        i((C) abstractC0084p);
        return this;
    }

    public final C g() {
        C c2 = new C(this);
        int i5 = this.f956g;
        if ((i5 & 1) == 1) {
            this.f957h = Collections.unmodifiableList(this.f957h);
            this.f956g &= -2;
        }
        c2.f964g = this.f957h;
        if ((this.f956g & 2) == 2) {
            this.f958i = Collections.unmodifiableList(this.f958i);
            this.f956g &= -3;
        }
        c2.f965h = this.f958i;
        if ((this.f956g & 4) == 4) {
            this.f959j = Collections.unmodifiableList(this.f959j);
            this.f956g &= -5;
        }
        c2.f966i = this.f959j;
        int i6 = (i5 & 8) != 8 ? 0 : 1;
        c2.f967j = this.f960k;
        if ((i5 & 16) == 16) {
            i6 |= 2;
        }
        c2.f968k = this.f961l;
        c2.f = i6;
        return c2;
    }

    public final void i(C c2) {
        e0 e0Var;
        X x4;
        if (c2 == C.n) {
            return;
        }
        if (!c2.f964g.isEmpty()) {
            if (this.f957h.isEmpty()) {
                this.f957h = c2.f964g;
                this.f956g &= -2;
            } else {
                if ((this.f956g & 1) != 1) {
                    this.f957h = new ArrayList(this.f957h);
                    this.f956g |= 1;
                }
                this.f957h.addAll(c2.f964g);
            }
        }
        if (!c2.f965h.isEmpty()) {
            if (this.f958i.isEmpty()) {
                this.f958i = c2.f965h;
                this.f956g &= -3;
            } else {
                if ((this.f956g & 2) != 2) {
                    this.f958i = new ArrayList(this.f958i);
                    this.f956g |= 2;
                }
                this.f958i.addAll(c2.f965h);
            }
        }
        if (!c2.f966i.isEmpty()) {
            if (this.f959j.isEmpty()) {
                this.f959j = c2.f966i;
                this.f956g &= -5;
            } else {
                if ((this.f956g & 4) != 4) {
                    this.f959j = new ArrayList(this.f959j);
                    this.f956g |= 4;
                }
                this.f959j.addAll(c2.f966i);
            }
        }
        if ((c2.f & 1) == 1) {
            X x5 = c2.f967j;
            if ((this.f956g & 8) != 8 || (x4 = this.f960k) == X.f1134j) {
                this.f960k = x5;
            } else {
                C0024f c0024fI = X.i(x4);
                c0024fI.l(x5);
                this.f960k = c0024fI.h();
            }
            this.f956g |= 8;
        }
        if ((c2.f & 2) == 2) {
            e0 e0Var2 = c2.f968k;
            if ((this.f956g & 16) != 16 || (e0Var = this.f961l) == e0.f1228h) {
                this.f961l = e0Var2;
            } else {
                C0031m c0031m = new C0031m(2);
                c0031m.f1320g = Collections.emptyList();
                c0031m.m(e0Var);
                c0031m.m(e0Var2);
                this.f961l = c0031m.i();
            }
            this.f956g |= 16;
        }
        f(c2);
        this.f2081d = this.f2081d.m(c2.f963e);
    }
}
