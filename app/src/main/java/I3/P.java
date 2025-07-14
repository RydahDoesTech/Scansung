package I3;

import O3.AbstractC0070b;
import O3.AbstractC0079k;
import O3.AbstractC0080l;
import O3.AbstractC0084p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class P extends AbstractC0080l {

    /* renamed from: g, reason: collision with root package name */
    public int f1058g;

    /* renamed from: h, reason: collision with root package name */
    public List f1059h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1060i;

    /* renamed from: j, reason: collision with root package name */
    public int f1061j;

    /* renamed from: k, reason: collision with root package name */
    public Q f1062k;

    /* renamed from: l, reason: collision with root package name */
    public int f1063l;

    /* renamed from: m, reason: collision with root package name */
    public int f1064m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public int f1065o;

    /* renamed from: p, reason: collision with root package name */
    public int f1066p;

    /* renamed from: q, reason: collision with root package name */
    public Q f1067q;

    /* renamed from: r, reason: collision with root package name */
    public int f1068r;

    /* renamed from: s, reason: collision with root package name */
    public Q f1069s;

    /* renamed from: t, reason: collision with root package name */
    public int f1070t;

    /* renamed from: u, reason: collision with root package name */
    public int f1071u;

    public static P h() {
        P p2 = new P();
        p2.f1059h = Collections.emptyList();
        Q q5 = Q.f1072w;
        p2.f1062k = q5;
        p2.f1067q = q5;
        p2.f1069s = q5;
        return p2;
    }

    @Override // O3.AbstractC0079k
    public final AbstractC0070b c() {
        Q qG = g();
        if (qG.b()) {
            return qG;
        }
        throw new O2.d();
    }

    public final Object clone() {
        P pH = h();
        pH.i(g());
        return pH;
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
            I3.a r1 = I3.Q.f1073x     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            I3.Q r1 = new I3.Q     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            O3.b r4 = r3.f2092d     // Catch: java.lang.Throwable -> Lf
            I3.Q r4 = (I3.Q) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: I3.P.d(O3.f, O3.i):O3.k");
    }

    @Override // O3.AbstractC0079k
    public final /* bridge */ /* synthetic */ AbstractC0079k e(AbstractC0084p abstractC0084p) {
        i((Q) abstractC0084p);
        return this;
    }

    public final Q g() {
        Q q5 = new Q(this);
        int i5 = this.f1058g;
        if ((i5 & 1) == 1) {
            this.f1059h = Collections.unmodifiableList(this.f1059h);
            this.f1058g &= -2;
        }
        q5.f1075g = this.f1059h;
        int i6 = (i5 & 2) != 2 ? 0 : 1;
        q5.f1076h = this.f1060i;
        if ((i5 & 4) == 4) {
            i6 |= 2;
        }
        q5.f1077i = this.f1061j;
        if ((i5 & 8) == 8) {
            i6 |= 4;
        }
        q5.f1078j = this.f1062k;
        if ((i5 & 16) == 16) {
            i6 |= 8;
        }
        q5.f1079k = this.f1063l;
        if ((i5 & 32) == 32) {
            i6 |= 16;
        }
        q5.f1080l = this.f1064m;
        if ((i5 & 64) == 64) {
            i6 |= 32;
        }
        q5.f1081m = this.n;
        if ((i5 & 128) == 128) {
            i6 |= 64;
        }
        q5.n = this.f1065o;
        if ((i5 & 256) == 256) {
            i6 |= 128;
        }
        q5.f1082o = this.f1066p;
        if ((i5 & 512) == 512) {
            i6 |= 256;
        }
        q5.f1083p = this.f1067q;
        if ((i5 & 1024) == 1024) {
            i6 |= 512;
        }
        q5.f1084q = this.f1068r;
        if ((i5 & 2048) == 2048) {
            i6 |= 1024;
        }
        q5.f1085r = this.f1069s;
        if ((i5 & 4096) == 4096) {
            i6 |= 2048;
        }
        q5.f1086s = this.f1070t;
        if ((i5 & 8192) == 8192) {
            i6 |= 4096;
        }
        q5.f1087t = this.f1071u;
        q5.f = i6;
        return q5;
    }

    public final P i(Q q5) {
        Q q6;
        Q q7;
        Q q8;
        Q q9 = Q.f1072w;
        if (q5 == q9) {
            return this;
        }
        if (!q5.f1075g.isEmpty()) {
            if (this.f1059h.isEmpty()) {
                this.f1059h = q5.f1075g;
                this.f1058g &= -2;
            } else {
                if ((this.f1058g & 1) != 1) {
                    this.f1059h = new ArrayList(this.f1059h);
                    this.f1058g |= 1;
                }
                this.f1059h.addAll(q5.f1075g);
            }
        }
        int i5 = q5.f;
        if ((i5 & 1) == 1) {
            boolean z4 = q5.f1076h;
            this.f1058g |= 2;
            this.f1060i = z4;
        }
        if ((i5 & 2) == 2) {
            int i6 = q5.f1077i;
            this.f1058g |= 4;
            this.f1061j = i6;
        }
        if ((i5 & 4) == 4) {
            Q q10 = q5.f1078j;
            if ((this.f1058g & 8) != 8 || (q8 = this.f1062k) == q9) {
                this.f1062k = q10;
            } else {
                P pR = Q.r(q8);
                pR.i(q10);
                this.f1062k = pR.g();
            }
            this.f1058g |= 8;
        }
        if ((q5.f & 8) == 8) {
            int i7 = q5.f1079k;
            this.f1058g |= 16;
            this.f1063l = i7;
        }
        if (q5.p()) {
            int i8 = q5.f1080l;
            this.f1058g |= 32;
            this.f1064m = i8;
        }
        int i9 = q5.f;
        if ((i9 & 32) == 32) {
            int i10 = q5.f1081m;
            this.f1058g |= 64;
            this.n = i10;
        }
        if ((i9 & 64) == 64) {
            int i11 = q5.n;
            this.f1058g |= 128;
            this.f1065o = i11;
        }
        if ((i9 & 128) == 128) {
            int i12 = q5.f1082o;
            this.f1058g |= 256;
            this.f1066p = i12;
        }
        if ((i9 & 256) == 256) {
            Q q11 = q5.f1083p;
            if ((this.f1058g & 512) != 512 || (q7 = this.f1067q) == q9) {
                this.f1067q = q11;
            } else {
                P pR2 = Q.r(q7);
                pR2.i(q11);
                this.f1067q = pR2.g();
            }
            this.f1058g |= 512;
        }
        int i13 = q5.f;
        if ((i13 & 512) == 512) {
            int i14 = q5.f1084q;
            this.f1058g |= 1024;
            this.f1068r = i14;
        }
        if ((i13 & 1024) == 1024) {
            Q q12 = q5.f1085r;
            if ((this.f1058g & 2048) != 2048 || (q6 = this.f1069s) == q9) {
                this.f1069s = q12;
            } else {
                P pR3 = Q.r(q6);
                pR3.i(q12);
                this.f1069s = pR3.g();
            }
            this.f1058g |= 2048;
        }
        int i15 = q5.f;
        if ((i15 & 2048) == 2048) {
            int i16 = q5.f1086s;
            this.f1058g |= 4096;
            this.f1070t = i16;
        }
        if ((i15 & 4096) == 4096) {
            int i17 = q5.f1087t;
            this.f1058g |= 8192;
            this.f1071u = i17;
        }
        f(q5);
        this.f2081d = this.f2081d.m(q5.f1074e);
        return this;
    }
}
