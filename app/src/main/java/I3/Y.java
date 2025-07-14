package I3;

import O3.AbstractC0070b;
import O3.AbstractC0079k;
import O3.AbstractC0080l;
import O3.AbstractC0084p;

/* loaded from: classes.dex */
public final class Y extends AbstractC0080l {

    /* renamed from: g, reason: collision with root package name */
    public int f1141g;

    /* renamed from: h, reason: collision with root package name */
    public int f1142h;

    /* renamed from: i, reason: collision with root package name */
    public int f1143i;

    /* renamed from: j, reason: collision with root package name */
    public Q f1144j;

    /* renamed from: k, reason: collision with root package name */
    public int f1145k;

    /* renamed from: l, reason: collision with root package name */
    public Q f1146l;

    /* renamed from: m, reason: collision with root package name */
    public int f1147m;

    @Override // O3.AbstractC0079k
    public final AbstractC0070b c() {
        Z zG = g();
        if (zG.b()) {
            return zG;
        }
        throw new O2.d();
    }

    public final Object clone() {
        Y y4 = new Y();
        Q q5 = Q.f1072w;
        y4.f1144j = q5;
        y4.f1146l = q5;
        y4.h(g());
        return y4;
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
            I3.a r1 = I3.Z.f1149p     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            I3.Z r1 = new I3.Z     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r2.h(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            O3.b r4 = r3.f2092d     // Catch: java.lang.Throwable -> Lf
            I3.Z r4 = (I3.Z) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: I3.Y.d(O3.f, O3.i):O3.k");
    }

    @Override // O3.AbstractC0079k
    public final /* bridge */ /* synthetic */ AbstractC0079k e(AbstractC0084p abstractC0084p) {
        h((Z) abstractC0084p);
        return this;
    }

    public final Z g() {
        Z z4 = new Z(this);
        int i5 = this.f1141g;
        int i6 = (i5 & 1) != 1 ? 0 : 1;
        z4.f1151g = this.f1142h;
        if ((i5 & 2) == 2) {
            i6 |= 2;
        }
        z4.f1152h = this.f1143i;
        if ((i5 & 4) == 4) {
            i6 |= 4;
        }
        z4.f1153i = this.f1144j;
        if ((i5 & 8) == 8) {
            i6 |= 8;
        }
        z4.f1154j = this.f1145k;
        if ((i5 & 16) == 16) {
            i6 |= 16;
        }
        z4.f1155k = this.f1146l;
        if ((i5 & 32) == 32) {
            i6 |= 32;
        }
        z4.f1156l = this.f1147m;
        z4.f = i6;
        return z4;
    }

    public final void h(Z z4) {
        Q q5;
        Q q6;
        if (z4 == Z.f1148o) {
            return;
        }
        int i5 = z4.f;
        if ((i5 & 1) == 1) {
            int i6 = z4.f1151g;
            this.f1141g = 1 | this.f1141g;
            this.f1142h = i6;
        }
        if ((i5 & 2) == 2) {
            int i7 = z4.f1152h;
            this.f1141g = 2 | this.f1141g;
            this.f1143i = i7;
        }
        if ((i5 & 4) == 4) {
            Q q7 = z4.f1153i;
            if ((this.f1141g & 4) != 4 || (q6 = this.f1144j) == Q.f1072w) {
                this.f1144j = q7;
            } else {
                P pR = Q.r(q6);
                pR.i(q7);
                this.f1144j = pR.g();
            }
            this.f1141g |= 4;
        }
        int i8 = z4.f;
        if ((i8 & 8) == 8) {
            int i9 = z4.f1154j;
            this.f1141g = 8 | this.f1141g;
            this.f1145k = i9;
        }
        if ((i8 & 16) == 16) {
            Q q8 = z4.f1155k;
            if ((this.f1141g & 16) != 16 || (q5 = this.f1146l) == Q.f1072w) {
                this.f1146l = q8;
            } else {
                P pR2 = Q.r(q5);
                pR2.i(q8);
                this.f1146l = pR2.g();
            }
            this.f1141g |= 16;
        }
        if ((z4.f & 32) == 32) {
            int i10 = z4.f1156l;
            this.f1141g = 32 | this.f1141g;
            this.f1147m = i10;
        }
        f(z4);
        this.f2081d = this.f2081d.m(z4.f1150e);
    }
}
