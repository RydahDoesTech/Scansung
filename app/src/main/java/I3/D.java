package I3;

import O3.AbstractC0070b;
import O3.AbstractC0079k;
import O3.AbstractC0080l;
import O3.AbstractC0084p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class D extends AbstractC0080l {

    /* renamed from: g, reason: collision with root package name */
    public int f971g;

    /* renamed from: h, reason: collision with root package name */
    public L f972h;

    /* renamed from: i, reason: collision with root package name */
    public K f973i;

    /* renamed from: j, reason: collision with root package name */
    public C f974j;

    /* renamed from: k, reason: collision with root package name */
    public List f975k;

    public static D h() {
        D d5 = new D();
        d5.f972h = L.f1037h;
        d5.f973i = K.f1032h;
        d5.f974j = C.n;
        d5.f975k = Collections.emptyList();
        return d5;
    }

    @Override // O3.AbstractC0079k
    public final AbstractC0070b c() {
        E eG = g();
        if (eG.b()) {
            return eG;
        }
        throw new O2.d();
    }

    public final Object clone() {
        D dH = h();
        dH.i(g());
        return dH;
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
            I3.a r1 = I3.E.n     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            I3.E r1 = new I3.E     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            O3.b r4 = r3.f2092d     // Catch: java.lang.Throwable -> Lf
            I3.E r4 = (I3.E) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: I3.D.d(O3.f, O3.i):O3.k");
    }

    @Override // O3.AbstractC0079k
    public final /* bridge */ /* synthetic */ AbstractC0079k e(AbstractC0084p abstractC0084p) {
        i((E) abstractC0084p);
        return this;
    }

    public final E g() {
        E e5 = new E(this);
        int i5 = this.f971g;
        int i6 = (i5 & 1) != 1 ? 0 : 1;
        e5.f978g = this.f972h;
        if ((i5 & 2) == 2) {
            i6 |= 2;
        }
        e5.f979h = this.f973i;
        if ((i5 & 4) == 4) {
            i6 |= 4;
        }
        e5.f980i = this.f974j;
        if ((i5 & 8) == 8) {
            this.f975k = Collections.unmodifiableList(this.f975k);
            this.f971g &= -9;
        }
        e5.f981j = this.f975k;
        e5.f = i6;
        return e5;
    }

    public final void i(E e5) {
        C c2;
        K k5;
        L l4;
        if (e5 == E.f976m) {
            return;
        }
        if ((e5.f & 1) == 1) {
            L l5 = e5.f978g;
            if ((this.f971g & 1) != 1 || (l4 = this.f972h) == L.f1037h) {
                this.f972h = l5;
            } else {
                C0031m c0031m = new C0031m(3);
                c0031m.f1320g = O3.t.f2093e;
                c0031m.l(l4);
                c0031m.l(l5);
                this.f972h = c0031m.h();
            }
            this.f971g |= 1;
        }
        if ((e5.f & 2) == 2) {
            K k6 = e5.f979h;
            if ((this.f971g & 2) != 2 || (k5 = this.f973i) == K.f1032h) {
                this.f973i = k6;
            } else {
                C0031m c0031m2 = new C0031m(1);
                c0031m2.f1320g = Collections.emptyList();
                c0031m2.k(k5);
                c0031m2.k(k6);
                this.f973i = c0031m2.g();
            }
            this.f971g |= 2;
        }
        if ((e5.f & 4) == 4) {
            C c5 = e5.f980i;
            if ((this.f971g & 4) != 4 || (c2 = this.f974j) == C.n) {
                this.f974j = c5;
            } else {
                B bH = B.h();
                bH.i(c2);
                bH.i(c5);
                this.f974j = bH.g();
            }
            this.f971g |= 4;
        }
        if (!e5.f981j.isEmpty()) {
            if (this.f975k.isEmpty()) {
                this.f975k = e5.f981j;
                this.f971g &= -9;
            } else {
                if ((this.f971g & 8) != 8) {
                    this.f975k = new ArrayList(this.f975k);
                    this.f971g |= 8;
                }
                this.f975k.addAll(e5.f981j);
            }
        }
        f(e5);
        this.f2081d = this.f2081d.m(e5.f977e);
    }
}
