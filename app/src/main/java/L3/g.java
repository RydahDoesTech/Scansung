package L3;

import O3.AbstractC0070b;
import O3.AbstractC0079k;
import O3.AbstractC0084p;
import O3.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends AbstractC0079k implements x {

    /* renamed from: e, reason: collision with root package name */
    public int f1767e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f1768g;

    /* renamed from: h, reason: collision with root package name */
    public Object f1769h;

    /* renamed from: i, reason: collision with root package name */
    public h f1770i;

    /* renamed from: j, reason: collision with root package name */
    public List f1771j;

    /* renamed from: k, reason: collision with root package name */
    public List f1772k;

    public static g g() {
        g gVar = new g();
        gVar.f = 1;
        gVar.f1769h = "";
        gVar.f1770i = h.NONE;
        gVar.f1771j = Collections.emptyList();
        gVar.f1772k = Collections.emptyList();
        return gVar;
    }

    @Override // O3.AbstractC0079k
    public final AbstractC0070b c() {
        i iVarF = f();
        if (iVarF.b()) {
            return iVarF;
        }
        throw new O2.d();
    }

    public final Object clone() {
        g gVarG = g();
        gVarG.h(f());
        return gVarG;
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
            I3.a r0 = L3.i.f1778q     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            L3.i r0 = new L3.i     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.h(r0)
            return r1
        Lf:
            r2 = move-exception
            goto L19
        L11:
            r2 = move-exception
            O3.b r0 = r2.f2092d     // Catch: java.lang.Throwable -> Lf
            L3.i r0 = (L3.i) r0     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: L3.g.d(O3.f, O3.i):O3.k");
    }

    @Override // O3.AbstractC0079k
    public final /* bridge */ /* synthetic */ AbstractC0079k e(AbstractC0084p abstractC0084p) {
        h((i) abstractC0084p);
        return this;
    }

    public final i f() {
        i iVar = new i(this);
        int i5 = this.f1767e;
        int i6 = (i5 & 1) != 1 ? 0 : 1;
        iVar.f = this.f;
        if ((i5 & 2) == 2) {
            i6 |= 2;
        }
        iVar.f1781g = this.f1768g;
        if ((i5 & 4) == 4) {
            i6 |= 4;
        }
        iVar.f1782h = this.f1769h;
        if ((i5 & 8) == 8) {
            i6 |= 8;
        }
        iVar.f1783i = this.f1770i;
        if ((i5 & 16) == 16) {
            this.f1771j = Collections.unmodifiableList(this.f1771j);
            this.f1767e &= -17;
        }
        iVar.f1784j = this.f1771j;
        if ((this.f1767e & 32) == 32) {
            this.f1772k = Collections.unmodifiableList(this.f1772k);
            this.f1767e &= -33;
        }
        iVar.f1786l = this.f1772k;
        iVar.f1780e = i6;
        return iVar;
    }

    public final void h(i iVar) {
        if (iVar == i.f1777p) {
            return;
        }
        int i5 = iVar.f1780e;
        if ((i5 & 1) == 1) {
            int i6 = iVar.f;
            this.f1767e = 1 | this.f1767e;
            this.f = i6;
        }
        if ((i5 & 2) == 2) {
            int i7 = iVar.f1781g;
            this.f1767e = 2 | this.f1767e;
            this.f1768g = i7;
        }
        if ((i5 & 4) == 4) {
            this.f1767e |= 4;
            this.f1769h = iVar.f1782h;
        }
        if ((i5 & 8) == 8) {
            h hVar = iVar.f1783i;
            hVar.getClass();
            this.f1767e = 8 | this.f1767e;
            this.f1770i = hVar;
        }
        if (!iVar.f1784j.isEmpty()) {
            if (this.f1771j.isEmpty()) {
                this.f1771j = iVar.f1784j;
                this.f1767e &= -17;
            } else {
                if ((this.f1767e & 16) != 16) {
                    this.f1771j = new ArrayList(this.f1771j);
                    this.f1767e |= 16;
                }
                this.f1771j.addAll(iVar.f1784j);
            }
        }
        if (!iVar.f1786l.isEmpty()) {
            if (this.f1772k.isEmpty()) {
                this.f1772k = iVar.f1786l;
                this.f1767e &= -33;
            } else {
                if ((this.f1767e & 32) != 32) {
                    this.f1772k = new ArrayList(this.f1772k);
                    this.f1767e |= 32;
                }
                this.f1772k.addAll(iVar.f1786l);
            }
        }
        this.f2081d = this.f2081d.m(iVar.f1779d);
    }
}
