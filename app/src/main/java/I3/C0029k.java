package I3;

import O3.AbstractC0070b;
import O3.AbstractC0079k;
import O3.AbstractC0080l;
import O3.AbstractC0084p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: I3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029k extends AbstractC0080l {

    /* renamed from: g, reason: collision with root package name */
    public int f1307g;

    /* renamed from: h, reason: collision with root package name */
    public int f1308h;

    /* renamed from: i, reason: collision with root package name */
    public List f1309i;

    /* renamed from: j, reason: collision with root package name */
    public List f1310j;

    public static C0029k h() {
        C0029k c0029k = new C0029k();
        c0029k.f1308h = 6;
        c0029k.f1309i = Collections.emptyList();
        c0029k.f1310j = Collections.emptyList();
        return c0029k;
    }

    @Override // O3.AbstractC0079k
    public final AbstractC0070b c() {
        C0030l c0030lG = g();
        if (c0030lG.b()) {
            return c0030lG;
        }
        throw new O2.d();
    }

    public final Object clone() {
        C0029k c0029kH = h();
        c0029kH.i(g());
        return c0029kH;
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
            I3.a r1 = I3.C0030l.f1312m     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            I3.l r1 = new I3.l     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            O3.b r4 = r3.f2092d     // Catch: java.lang.Throwable -> Lf
            I3.l r4 = (I3.C0030l) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: I3.C0029k.d(O3.f, O3.i):O3.k");
    }

    @Override // O3.AbstractC0079k
    public final /* bridge */ /* synthetic */ AbstractC0079k e(AbstractC0084p abstractC0084p) {
        i((C0030l) abstractC0084p);
        return this;
    }

    public final C0030l g() {
        C0030l c0030l = new C0030l(this);
        int i5 = this.f1307g;
        int i6 = (i5 & 1) != 1 ? 0 : 1;
        c0030l.f1314g = this.f1308h;
        if ((i5 & 2) == 2) {
            this.f1309i = Collections.unmodifiableList(this.f1309i);
            this.f1307g &= -3;
        }
        c0030l.f1315h = this.f1309i;
        if ((this.f1307g & 4) == 4) {
            this.f1310j = Collections.unmodifiableList(this.f1310j);
            this.f1307g &= -5;
        }
        c0030l.f1316i = this.f1310j;
        c0030l.f = i6;
        return c0030l;
    }

    public final void i(C0030l c0030l) {
        if (c0030l == C0030l.f1311l) {
            return;
        }
        if ((c0030l.f & 1) == 1) {
            int i5 = c0030l.f1314g;
            this.f1307g = 1 | this.f1307g;
            this.f1308h = i5;
        }
        if (!c0030l.f1315h.isEmpty()) {
            if (this.f1309i.isEmpty()) {
                this.f1309i = c0030l.f1315h;
                this.f1307g &= -3;
            } else {
                if ((this.f1307g & 2) != 2) {
                    this.f1309i = new ArrayList(this.f1309i);
                    this.f1307g |= 2;
                }
                this.f1309i.addAll(c0030l.f1315h);
            }
        }
        if (!c0030l.f1316i.isEmpty()) {
            if (this.f1310j.isEmpty()) {
                this.f1310j = c0030l.f1316i;
                this.f1307g &= -5;
            } else {
                if ((this.f1307g & 4) != 4) {
                    this.f1310j = new ArrayList(this.f1310j);
                    this.f1307g |= 4;
                }
                this.f1310j.addAll(c0030l.f1316i);
            }
        }
        f(c0030l);
        this.f2081d = this.f2081d.m(c0030l.f1313e);
    }
}
