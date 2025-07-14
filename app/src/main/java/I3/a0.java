package I3;

import O3.AbstractC0070b;
import O3.AbstractC0079k;
import O3.AbstractC0084p;

/* loaded from: classes.dex */
public final class a0 extends AbstractC0079k implements O3.x {

    /* renamed from: e, reason: collision with root package name */
    public int f1159e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f1160g;

    /* renamed from: h, reason: collision with root package name */
    public b0 f1161h;

    /* renamed from: i, reason: collision with root package name */
    public int f1162i;

    /* renamed from: j, reason: collision with root package name */
    public int f1163j;

    /* renamed from: k, reason: collision with root package name */
    public c0 f1164k;

    public static a0 g() {
        a0 a0Var = new a0();
        a0Var.f1161h = b0.ERROR;
        a0Var.f1164k = c0.LANGUAGE_VERSION;
        return a0Var;
    }

    @Override // O3.AbstractC0079k
    public final AbstractC0070b c() {
        d0 d0VarF = f();
        if (d0VarF.b()) {
            return d0VarF;
        }
        throw new O2.d();
    }

    public final Object clone() {
        a0 a0VarG = g();
        a0VarG.h(f());
        return a0VarG;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // O3.AbstractC0079k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final O3.AbstractC0079k d(O3.C0074f r2, O3.C0077i r3) throws java.lang.Throwable {
        /*
            r1 = this;
            r3 = 0
            I3.a r0 = I3.d0.f1211o     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            I3.d0 r0 = new I3.d0     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.h(r0)
            return r1
        Lf:
            r2 = move-exception
            goto L19
        L11:
            r2 = move-exception
            O3.b r0 = r2.f2092d     // Catch: java.lang.Throwable -> Lf
            I3.d0 r0 = (I3.d0) r0     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> L17
        L17:
            r2 = move-exception
            r3 = r0
        L19:
            if (r3 == 0) goto L1e
            r1.h(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.a0.d(O3.f, O3.i):O3.k");
    }

    @Override // O3.AbstractC0079k
    public final /* bridge */ /* synthetic */ AbstractC0079k e(AbstractC0084p abstractC0084p) {
        h((d0) abstractC0084p);
        return this;
    }

    public final d0 f() {
        d0 d0Var = new d0(this);
        int i5 = this.f1159e;
        int i6 = (i5 & 1) != 1 ? 0 : 1;
        d0Var.f = this.f;
        if ((i5 & 2) == 2) {
            i6 |= 2;
        }
        d0Var.f1214g = this.f1160g;
        if ((i5 & 4) == 4) {
            i6 |= 4;
        }
        d0Var.f1215h = this.f1161h;
        if ((i5 & 8) == 8) {
            i6 |= 8;
        }
        d0Var.f1216i = this.f1162i;
        if ((i5 & 16) == 16) {
            i6 |= 16;
        }
        d0Var.f1217j = this.f1163j;
        if ((i5 & 32) == 32) {
            i6 |= 32;
        }
        d0Var.f1218k = this.f1164k;
        d0Var.f1213e = i6;
        return d0Var;
    }

    public final void h(d0 d0Var) {
        if (d0Var == d0.n) {
            return;
        }
        int i5 = d0Var.f1213e;
        if ((i5 & 1) == 1) {
            int i6 = d0Var.f;
            this.f1159e = 1 | this.f1159e;
            this.f = i6;
        }
        if ((i5 & 2) == 2) {
            int i7 = d0Var.f1214g;
            this.f1159e = 2 | this.f1159e;
            this.f1160g = i7;
        }
        if ((i5 & 4) == 4) {
            b0 b0Var = d0Var.f1215h;
            b0Var.getClass();
            this.f1159e = 4 | this.f1159e;
            this.f1161h = b0Var;
        }
        int i8 = d0Var.f1213e;
        if ((i8 & 8) == 8) {
            int i9 = d0Var.f1216i;
            this.f1159e = 8 | this.f1159e;
            this.f1162i = i9;
        }
        if ((i8 & 16) == 16) {
            int i10 = d0Var.f1217j;
            this.f1159e = 16 | this.f1159e;
            this.f1163j = i10;
        }
        if ((i8 & 32) == 32) {
            c0 c0Var = d0Var.f1218k;
            c0Var.getClass();
            this.f1159e = 32 | this.f1159e;
            this.f1164k = c0Var;
        }
        this.f2081d = this.f2081d.m(d0Var.f1212d);
    }
}
