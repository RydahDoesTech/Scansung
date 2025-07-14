package L3;

import O3.AbstractC0070b;
import O3.AbstractC0079k;
import O3.AbstractC0084p;
import O3.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends AbstractC0079k implements x {

    /* renamed from: e, reason: collision with root package name */
    public int f1765e;
    public List f;

    /* renamed from: g, reason: collision with root package name */
    public List f1766g;

    public static f g() {
        f fVar = new f();
        fVar.f = Collections.emptyList();
        fVar.f1766g = Collections.emptyList();
        return fVar;
    }

    @Override // O3.AbstractC0079k
    public final AbstractC0070b c() {
        j jVarF = f();
        if (jVarF.b()) {
            return jVarF;
        }
        throw new O2.d();
    }

    public final Object clone() {
        f fVarG = g();
        fVarG.h(f());
        return fVarG;
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
            I3.a r1 = L3.j.f1790k     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            L3.j r1 = new L3.j     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r2.h(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            O3.b r4 = r3.f2092d     // Catch: java.lang.Throwable -> Lf
            L3.j r4 = (L3.j) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: L3.f.d(O3.f, O3.i):O3.k");
    }

    @Override // O3.AbstractC0079k
    public final /* bridge */ /* synthetic */ AbstractC0079k e(AbstractC0084p abstractC0084p) {
        h((j) abstractC0084p);
        return this;
    }

    public final j f() {
        j jVar = new j(this);
        if ((this.f1765e & 1) == 1) {
            this.f = Collections.unmodifiableList(this.f);
            this.f1765e &= -2;
        }
        jVar.f1792e = this.f;
        if ((this.f1765e & 2) == 2) {
            this.f1766g = Collections.unmodifiableList(this.f1766g);
            this.f1765e &= -3;
        }
        jVar.f = this.f1766g;
        return jVar;
    }

    public final void h(j jVar) {
        if (jVar == j.f1789j) {
            return;
        }
        if (!jVar.f1792e.isEmpty()) {
            if (this.f.isEmpty()) {
                this.f = jVar.f1792e;
                this.f1765e &= -2;
            } else {
                if ((this.f1765e & 1) != 1) {
                    this.f = new ArrayList(this.f);
                    this.f1765e |= 1;
                }
                this.f.addAll(jVar.f1792e);
            }
        }
        if (!jVar.f.isEmpty()) {
            if (this.f1766g.isEmpty()) {
                this.f1766g = jVar.f;
                this.f1765e &= -3;
            } else {
                if ((this.f1765e & 2) != 2) {
                    this.f1766g = new ArrayList(this.f1766g);
                    this.f1765e |= 2;
                }
                this.f1766g.addAll(jVar.f);
            }
        }
        this.f2081d = this.f2081d.m(jVar.f1791d);
    }
}
