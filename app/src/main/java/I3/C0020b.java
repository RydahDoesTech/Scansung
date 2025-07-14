package I3;

import O3.AbstractC0070b;
import O3.AbstractC0079k;
import O3.AbstractC0084p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: I3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0020b extends AbstractC0079k implements O3.x {

    /* renamed from: e, reason: collision with root package name */
    public int f1165e;
    public EnumC0021c f;

    /* renamed from: g, reason: collision with root package name */
    public long f1166g;

    /* renamed from: h, reason: collision with root package name */
    public float f1167h;

    /* renamed from: i, reason: collision with root package name */
    public double f1168i;

    /* renamed from: j, reason: collision with root package name */
    public int f1169j;

    /* renamed from: k, reason: collision with root package name */
    public int f1170k;

    /* renamed from: l, reason: collision with root package name */
    public int f1171l;

    /* renamed from: m, reason: collision with root package name */
    public C0025g f1172m;
    public List n;

    /* renamed from: o, reason: collision with root package name */
    public int f1173o;

    /* renamed from: p, reason: collision with root package name */
    public int f1174p;

    public static C0020b g() {
        C0020b c0020b = new C0020b();
        c0020b.f = EnumC0021c.BYTE;
        c0020b.f1172m = C0025g.f1238j;
        c0020b.n = Collections.emptyList();
        return c0020b;
    }

    @Override // O3.AbstractC0079k
    public final AbstractC0070b c() {
        C0022d c0022dF = f();
        if (c0022dF.b()) {
            return c0022dF;
        }
        throw new O2.d();
    }

    public final Object clone() {
        C0020b c0020bG = g();
        c0020bG.h(f());
        return c0020bG;
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
            I3.a r1 = I3.C0022d.f1197t     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            I3.d r1 = new I3.d     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r2.h(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            O3.b r4 = r3.f2092d     // Catch: java.lang.Throwable -> Lf
            I3.d r4 = (I3.C0022d) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: I3.C0020b.d(O3.f, O3.i):O3.k");
    }

    @Override // O3.AbstractC0079k
    public final /* bridge */ /* synthetic */ AbstractC0079k e(AbstractC0084p abstractC0084p) {
        h((C0022d) abstractC0084p);
        return this;
    }

    public final C0022d f() {
        C0022d c0022d = new C0022d(this);
        int i5 = this.f1165e;
        int i6 = (i5 & 1) != 1 ? 0 : 1;
        c0022d.f = this.f;
        if ((i5 & 2) == 2) {
            i6 |= 2;
        }
        c0022d.f1200g = this.f1166g;
        if ((i5 & 4) == 4) {
            i6 |= 4;
        }
        c0022d.f1201h = this.f1167h;
        if ((i5 & 8) == 8) {
            i6 |= 8;
        }
        c0022d.f1202i = this.f1168i;
        if ((i5 & 16) == 16) {
            i6 |= 16;
        }
        c0022d.f1203j = this.f1169j;
        if ((i5 & 32) == 32) {
            i6 |= 32;
        }
        c0022d.f1204k = this.f1170k;
        if ((i5 & 64) == 64) {
            i6 |= 64;
        }
        c0022d.f1205l = this.f1171l;
        if ((i5 & 128) == 128) {
            i6 |= 128;
        }
        c0022d.f1206m = this.f1172m;
        if ((i5 & 256) == 256) {
            this.n = Collections.unmodifiableList(this.n);
            this.f1165e &= -257;
        }
        c0022d.n = this.n;
        if ((i5 & 512) == 512) {
            i6 |= 256;
        }
        c0022d.f1207o = this.f1173o;
        if ((i5 & 1024) == 1024) {
            i6 |= 512;
        }
        c0022d.f1208p = this.f1174p;
        c0022d.f1199e = i6;
        return c0022d;
    }

    public final void h(C0022d c0022d) {
        C0025g c0025g;
        if (c0022d == C0022d.f1196s) {
            return;
        }
        if ((c0022d.f1199e & 1) == 1) {
            EnumC0021c enumC0021c = c0022d.f;
            enumC0021c.getClass();
            this.f1165e = 1 | this.f1165e;
            this.f = enumC0021c;
        }
        int i5 = c0022d.f1199e;
        if ((i5 & 2) == 2) {
            long j5 = c0022d.f1200g;
            this.f1165e |= 2;
            this.f1166g = j5;
        }
        if ((i5 & 4) == 4) {
            float f = c0022d.f1201h;
            this.f1165e = 4 | this.f1165e;
            this.f1167h = f;
        }
        if ((i5 & 8) == 8) {
            double d5 = c0022d.f1202i;
            this.f1165e |= 8;
            this.f1168i = d5;
        }
        if ((i5 & 16) == 16) {
            int i6 = c0022d.f1203j;
            this.f1165e = 16 | this.f1165e;
            this.f1169j = i6;
        }
        if ((i5 & 32) == 32) {
            int i7 = c0022d.f1204k;
            this.f1165e = 32 | this.f1165e;
            this.f1170k = i7;
        }
        if ((i5 & 64) == 64) {
            int i8 = c0022d.f1205l;
            this.f1165e = 64 | this.f1165e;
            this.f1171l = i8;
        }
        if ((i5 & 128) == 128) {
            C0025g c0025g2 = c0022d.f1206m;
            if ((this.f1165e & 128) != 128 || (c0025g = this.f1172m) == C0025g.f1238j) {
                this.f1172m = c0025g2;
            } else {
                C0024f c0024f = new C0024f(0);
                c0024f.f1234g = Collections.emptyList();
                c0024f.k(c0025g);
                c0024f.k(c0025g2);
                this.f1172m = c0024f.g();
            }
            this.f1165e |= 128;
        }
        if (!c0022d.n.isEmpty()) {
            if (this.n.isEmpty()) {
                this.n = c0022d.n;
                this.f1165e &= -257;
            } else {
                if ((this.f1165e & 256) != 256) {
                    this.n = new ArrayList(this.n);
                    this.f1165e |= 256;
                }
                this.n.addAll(c0022d.n);
            }
        }
        int i9 = c0022d.f1199e;
        if ((i9 & 256) == 256) {
            int i10 = c0022d.f1207o;
            this.f1165e |= 512;
            this.f1173o = i10;
        }
        if ((i9 & 512) == 512) {
            int i11 = c0022d.f1208p;
            this.f1165e |= 1024;
            this.f1174p = i11;
        }
        this.f2081d = this.f2081d.m(c0022d.f1198d);
    }
}
