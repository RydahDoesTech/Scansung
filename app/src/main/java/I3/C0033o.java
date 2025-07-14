package I3;

import O3.AbstractC0070b;
import O3.AbstractC0079k;
import O3.AbstractC0084p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: I3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033o extends AbstractC0079k implements O3.x {

    /* renamed from: e, reason: collision with root package name */
    public int f1326e;
    public EnumC0034p f;

    /* renamed from: g, reason: collision with root package name */
    public List f1327g;

    /* renamed from: h, reason: collision with root package name */
    public C0040w f1328h;

    /* renamed from: i, reason: collision with root package name */
    public EnumC0035q f1329i;

    public static C0033o g() {
        C0033o c0033o = new C0033o();
        c0033o.f = EnumC0034p.RETURNS_CONSTANT;
        c0033o.f1327g = Collections.emptyList();
        c0033o.f1328h = C0040w.f1366o;
        c0033o.f1329i = EnumC0035q.AT_MOST_ONCE;
        return c0033o;
    }

    @Override // O3.AbstractC0079k
    public final AbstractC0070b c() {
        r rVarF = f();
        if (rVarF.b()) {
            return rVarF;
        }
        throw new O2.d();
    }

    public final Object clone() {
        C0033o c0033oG = g();
        c0033oG.h(f());
        return c0033oG;
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
            I3.a r1 = I3.r.f1339m     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            I3.r r1 = new I3.r     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r2.h(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            O3.b r4 = r3.f2092d     // Catch: java.lang.Throwable -> Lf
            I3.r r4 = (I3.r) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: I3.C0033o.d(O3.f, O3.i):O3.k");
    }

    @Override // O3.AbstractC0079k
    public final /* bridge */ /* synthetic */ AbstractC0079k e(AbstractC0084p abstractC0084p) {
        h((r) abstractC0084p);
        return this;
    }

    public final r f() {
        r rVar = new r(this);
        int i5 = this.f1326e;
        int i6 = (i5 & 1) != 1 ? 0 : 1;
        rVar.f = this.f;
        if ((i5 & 2) == 2) {
            this.f1327g = Collections.unmodifiableList(this.f1327g);
            this.f1326e &= -3;
        }
        rVar.f1342g = this.f1327g;
        if ((i5 & 4) == 4) {
            i6 |= 2;
        }
        rVar.f1343h = this.f1328h;
        if ((i5 & 8) == 8) {
            i6 |= 4;
        }
        rVar.f1344i = this.f1329i;
        rVar.f1341e = i6;
        return rVar;
    }

    public final void h(r rVar) {
        C0040w c0040w;
        if (rVar == r.f1338l) {
            return;
        }
        if ((rVar.f1341e & 1) == 1) {
            EnumC0034p enumC0034p = rVar.f;
            enumC0034p.getClass();
            this.f1326e |= 1;
            this.f = enumC0034p;
        }
        if (!rVar.f1342g.isEmpty()) {
            if (this.f1327g.isEmpty()) {
                this.f1327g = rVar.f1342g;
                this.f1326e &= -3;
            } else {
                if ((this.f1326e & 2) != 2) {
                    this.f1327g = new ArrayList(this.f1327g);
                    this.f1326e |= 2;
                }
                this.f1327g.addAll(rVar.f1342g);
            }
        }
        if ((rVar.f1341e & 2) == 2) {
            C0040w c0040w2 = rVar.f1343h;
            if ((this.f1326e & 4) != 4 || (c0040w = this.f1328h) == C0040w.f1366o) {
                this.f1328h = c0040w2;
            } else {
                C0038u c0038uG = C0038u.g();
                c0038uG.h(c0040w);
                c0038uG.h(c0040w2);
                this.f1328h = c0038uG.f();
            }
            this.f1326e |= 4;
        }
        if ((rVar.f1341e & 4) == 4) {
            EnumC0035q enumC0035q = rVar.f1344i;
            enumC0035q.getClass();
            this.f1326e |= 8;
            this.f1329i = enumC0035q;
        }
        this.f2081d = this.f2081d.m(rVar.f1340d);
    }
}
