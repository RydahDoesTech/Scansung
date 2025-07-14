package I3;

import O3.AbstractC0070b;
import O3.AbstractC0079k;
import O3.AbstractC0084p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: I3.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0038u extends AbstractC0079k implements O3.x {

    /* renamed from: e, reason: collision with root package name */
    public int f1355e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f1356g;

    /* renamed from: h, reason: collision with root package name */
    public EnumC0039v f1357h;

    /* renamed from: i, reason: collision with root package name */
    public Q f1358i;

    /* renamed from: j, reason: collision with root package name */
    public int f1359j;

    /* renamed from: k, reason: collision with root package name */
    public List f1360k;

    /* renamed from: l, reason: collision with root package name */
    public List f1361l;

    public static C0038u g() {
        C0038u c0038u = new C0038u();
        c0038u.f1357h = EnumC0039v.TRUE;
        c0038u.f1358i = Q.f1072w;
        c0038u.f1360k = Collections.emptyList();
        c0038u.f1361l = Collections.emptyList();
        return c0038u;
    }

    @Override // O3.AbstractC0079k
    public final AbstractC0070b c() {
        C0040w c0040wF = f();
        if (c0040wF.b()) {
            return c0040wF;
        }
        throw new O2.d();
    }

    public final Object clone() {
        C0038u c0038uG = g();
        c0038uG.h(f());
        return c0038uG;
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
            I3.a r1 = I3.C0040w.f1367p     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            I3.w r1 = new I3.w     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r2.h(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            O3.b r4 = r3.f2092d     // Catch: java.lang.Throwable -> Lf
            I3.w r4 = (I3.C0040w) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: I3.C0038u.d(O3.f, O3.i):O3.k");
    }

    @Override // O3.AbstractC0079k
    public final /* bridge */ /* synthetic */ AbstractC0079k e(AbstractC0084p abstractC0084p) {
        h((C0040w) abstractC0084p);
        return this;
    }

    public final C0040w f() {
        C0040w c0040w = new C0040w(this);
        int i5 = this.f1355e;
        int i6 = (i5 & 1) != 1 ? 0 : 1;
        c0040w.f = this.f;
        if ((i5 & 2) == 2) {
            i6 |= 2;
        }
        c0040w.f1370g = this.f1356g;
        if ((i5 & 4) == 4) {
            i6 |= 4;
        }
        c0040w.f1371h = this.f1357h;
        if ((i5 & 8) == 8) {
            i6 |= 8;
        }
        c0040w.f1372i = this.f1358i;
        if ((i5 & 16) == 16) {
            i6 |= 16;
        }
        c0040w.f1373j = this.f1359j;
        if ((i5 & 32) == 32) {
            this.f1360k = Collections.unmodifiableList(this.f1360k);
            this.f1355e &= -33;
        }
        c0040w.f1374k = this.f1360k;
        if ((this.f1355e & 64) == 64) {
            this.f1361l = Collections.unmodifiableList(this.f1361l);
            this.f1355e &= -65;
        }
        c0040w.f1375l = this.f1361l;
        c0040w.f1369e = i6;
        return c0040w;
    }

    public final void h(C0040w c0040w) {
        Q q5;
        if (c0040w == C0040w.f1366o) {
            return;
        }
        int i5 = c0040w.f1369e;
        if ((i5 & 1) == 1) {
            int i6 = c0040w.f;
            this.f1355e = 1 | this.f1355e;
            this.f = i6;
        }
        if ((i5 & 2) == 2) {
            int i7 = c0040w.f1370g;
            this.f1355e = 2 | this.f1355e;
            this.f1356g = i7;
        }
        if ((i5 & 4) == 4) {
            EnumC0039v enumC0039v = c0040w.f1371h;
            enumC0039v.getClass();
            this.f1355e = 4 | this.f1355e;
            this.f1357h = enumC0039v;
        }
        if ((c0040w.f1369e & 8) == 8) {
            Q q6 = c0040w.f1372i;
            if ((this.f1355e & 8) != 8 || (q5 = this.f1358i) == Q.f1072w) {
                this.f1358i = q6;
            } else {
                P pR = Q.r(q5);
                pR.i(q6);
                this.f1358i = pR.g();
            }
            this.f1355e |= 8;
        }
        if ((c0040w.f1369e & 16) == 16) {
            int i8 = c0040w.f1373j;
            this.f1355e = 16 | this.f1355e;
            this.f1359j = i8;
        }
        if (!c0040w.f1374k.isEmpty()) {
            if (this.f1360k.isEmpty()) {
                this.f1360k = c0040w.f1374k;
                this.f1355e &= -33;
            } else {
                if ((this.f1355e & 32) != 32) {
                    this.f1360k = new ArrayList(this.f1360k);
                    this.f1355e |= 32;
                }
                this.f1360k.addAll(c0040w.f1374k);
            }
        }
        if (!c0040w.f1375l.isEmpty()) {
            if (this.f1361l.isEmpty()) {
                this.f1361l = c0040w.f1375l;
                this.f1355e &= -65;
            } else {
                if ((this.f1355e & 64) != 64) {
                    this.f1361l = new ArrayList(this.f1361l);
                    this.f1355e |= 64;
                }
                this.f1361l.addAll(c0040w.f1375l);
            }
        }
        this.f2081d = this.f2081d.m(c0040w.f1368d);
    }
}
