package I3;

import O3.AbstractC0070b;
import O3.AbstractC0079k;
import O3.AbstractC0084p;

/* loaded from: classes.dex */
public final class H extends AbstractC0079k implements O3.x {

    /* renamed from: e, reason: collision with root package name */
    public int f1017e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f1018g;

    /* renamed from: h, reason: collision with root package name */
    public I f1019h;

    public static H g() {
        H h3 = new H();
        h3.f = -1;
        h3.f1019h = I.PACKAGE;
        return h3;
    }

    @Override // O3.AbstractC0079k
    public final AbstractC0070b c() {
        J jF = f();
        if (jF.b()) {
            return jF;
        }
        throw new O2.d();
    }

    public final Object clone() {
        H hG = g();
        hG.h(f());
        return hG;
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
            I3.a r0 = I3.J.f1025l     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            I3.J r0 = new I3.J     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.h(r0)
            return r1
        Lf:
            r2 = move-exception
            goto L19
        L11:
            r2 = move-exception
            O3.b r0 = r2.f2092d     // Catch: java.lang.Throwable -> Lf
            I3.J r0 = (I3.J) r0     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: I3.H.d(O3.f, O3.i):O3.k");
    }

    @Override // O3.AbstractC0079k
    public final /* bridge */ /* synthetic */ AbstractC0079k e(AbstractC0084p abstractC0084p) {
        h((J) abstractC0084p);
        return this;
    }

    public final J f() {
        J j5 = new J(this);
        int i5 = this.f1017e;
        int i6 = (i5 & 1) != 1 ? 0 : 1;
        j5.f = this.f;
        if ((i5 & 2) == 2) {
            i6 |= 2;
        }
        j5.f1028g = this.f1018g;
        if ((i5 & 4) == 4) {
            i6 |= 4;
        }
        j5.f1029h = this.f1019h;
        j5.f1027e = i6;
        return j5;
    }

    public final void h(J j5) {
        if (j5 == J.f1024k) {
            return;
        }
        int i5 = j5.f1027e;
        if ((i5 & 1) == 1) {
            int i6 = j5.f;
            this.f1017e = 1 | this.f1017e;
            this.f = i6;
        }
        if ((i5 & 2) == 2) {
            int i7 = j5.f1028g;
            this.f1017e = 2 | this.f1017e;
            this.f1018g = i7;
        }
        if ((i5 & 4) == 4) {
            I i8 = j5.f1029h;
            i8.getClass();
            this.f1017e = 4 | this.f1017e;
            this.f1019h = i8;
        }
        this.f2081d = this.f2081d.m(j5.f1026d);
    }
}
