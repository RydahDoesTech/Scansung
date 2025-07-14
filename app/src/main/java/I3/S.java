package I3;

import O3.AbstractC0070b;
import O3.AbstractC0079k;
import O3.AbstractC0080l;
import O3.AbstractC0084p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class S extends AbstractC0080l {

    /* renamed from: g, reason: collision with root package name */
    public int f1090g;

    /* renamed from: h, reason: collision with root package name */
    public int f1091h;

    /* renamed from: i, reason: collision with root package name */
    public int f1092i;

    /* renamed from: j, reason: collision with root package name */
    public List f1093j;

    /* renamed from: k, reason: collision with root package name */
    public Q f1094k;

    /* renamed from: l, reason: collision with root package name */
    public int f1095l;

    /* renamed from: m, reason: collision with root package name */
    public Q f1096m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public List f1097o;

    /* renamed from: p, reason: collision with root package name */
    public List f1098p;

    public static S h() {
        S s2 = new S();
        s2.f1091h = 6;
        s2.f1093j = Collections.emptyList();
        Q q5 = Q.f1072w;
        s2.f1094k = q5;
        s2.f1096m = q5;
        s2.f1097o = Collections.emptyList();
        s2.f1098p = Collections.emptyList();
        return s2;
    }

    @Override // O3.AbstractC0079k
    public final AbstractC0070b c() {
        T tG = g();
        if (tG.b()) {
            return tG;
        }
        throw new O2.d();
    }

    public final Object clone() {
        S sH = h();
        sH.i(g());
        return sH;
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
            I3.a r1 = I3.T.f1100s     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            I3.T r1 = new I3.T     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            O3.b r4 = r3.f2092d     // Catch: java.lang.Throwable -> Lf
            I3.T r4 = (I3.T) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: I3.S.d(O3.f, O3.i):O3.k");
    }

    @Override // O3.AbstractC0079k
    public final /* bridge */ /* synthetic */ AbstractC0079k e(AbstractC0084p abstractC0084p) {
        i((T) abstractC0084p);
        return this;
    }

    public final T g() {
        T t4 = new T(this);
        int i5 = this.f1090g;
        int i6 = (i5 & 1) != 1 ? 0 : 1;
        t4.f1102g = this.f1091h;
        if ((i5 & 2) == 2) {
            i6 |= 2;
        }
        t4.f1103h = this.f1092i;
        if ((i5 & 4) == 4) {
            this.f1093j = Collections.unmodifiableList(this.f1093j);
            this.f1090g &= -5;
        }
        t4.f1104i = this.f1093j;
        if ((i5 & 8) == 8) {
            i6 |= 4;
        }
        t4.f1105j = this.f1094k;
        if ((i5 & 16) == 16) {
            i6 |= 8;
        }
        t4.f1106k = this.f1095l;
        if ((i5 & 32) == 32) {
            i6 |= 16;
        }
        t4.f1107l = this.f1096m;
        if ((i5 & 64) == 64) {
            i6 |= 32;
        }
        t4.f1108m = this.n;
        if ((this.f1090g & 128) == 128) {
            this.f1097o = Collections.unmodifiableList(this.f1097o);
            this.f1090g &= -129;
        }
        t4.n = this.f1097o;
        if ((this.f1090g & 256) == 256) {
            this.f1098p = Collections.unmodifiableList(this.f1098p);
            this.f1090g &= -257;
        }
        t4.f1109o = this.f1098p;
        t4.f = i6;
        return t4;
    }

    public final void i(T t4) {
        Q q5;
        Q q6;
        if (t4 == T.f1099r) {
            return;
        }
        int i5 = t4.f;
        if ((i5 & 1) == 1) {
            int i6 = t4.f1102g;
            this.f1090g = 1 | this.f1090g;
            this.f1091h = i6;
        }
        if ((i5 & 2) == 2) {
            int i7 = t4.f1103h;
            this.f1090g = 2 | this.f1090g;
            this.f1092i = i7;
        }
        if (!t4.f1104i.isEmpty()) {
            if (this.f1093j.isEmpty()) {
                this.f1093j = t4.f1104i;
                this.f1090g &= -5;
            } else {
                if ((this.f1090g & 4) != 4) {
                    this.f1093j = new ArrayList(this.f1093j);
                    this.f1090g |= 4;
                }
                this.f1093j.addAll(t4.f1104i);
            }
        }
        if ((t4.f & 4) == 4) {
            Q q7 = t4.f1105j;
            if ((this.f1090g & 8) != 8 || (q6 = this.f1094k) == Q.f1072w) {
                this.f1094k = q7;
            } else {
                P pR = Q.r(q6);
                pR.i(q7);
                this.f1094k = pR.g();
            }
            this.f1090g |= 8;
        }
        int i8 = t4.f;
        if ((i8 & 8) == 8) {
            int i9 = t4.f1106k;
            this.f1090g |= 16;
            this.f1095l = i9;
        }
        if ((i8 & 16) == 16) {
            Q q8 = t4.f1107l;
            if ((this.f1090g & 32) != 32 || (q5 = this.f1096m) == Q.f1072w) {
                this.f1096m = q8;
            } else {
                P pR2 = Q.r(q5);
                pR2.i(q8);
                this.f1096m = pR2.g();
            }
            this.f1090g |= 32;
        }
        if ((t4.f & 32) == 32) {
            int i10 = t4.f1108m;
            this.f1090g |= 64;
            this.n = i10;
        }
        if (!t4.n.isEmpty()) {
            if (this.f1097o.isEmpty()) {
                this.f1097o = t4.n;
                this.f1090g &= -129;
            } else {
                if ((this.f1090g & 128) != 128) {
                    this.f1097o = new ArrayList(this.f1097o);
                    this.f1090g |= 128;
                }
                this.f1097o.addAll(t4.n);
            }
        }
        if (!t4.f1109o.isEmpty()) {
            if (this.f1098p.isEmpty()) {
                this.f1098p = t4.f1109o;
                this.f1090g &= -257;
            } else {
                if ((this.f1090g & 256) != 256) {
                    this.f1098p = new ArrayList(this.f1098p);
                    this.f1090g |= 256;
                }
                this.f1098p.addAll(t4.f1109o);
            }
        }
        f(t4);
        this.f2081d = this.f2081d.m(t4.f1101e);
    }
}
