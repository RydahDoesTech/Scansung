package f4;

import b3.AbstractC0219i;
import e4.AbstractC0438v;
import e4.C0421d;

/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: c, reason: collision with root package name */
    public final e f6755c = e.f6738d;

    /* renamed from: d, reason: collision with root package name */
    public final Q3.p f6756d = new Q3.p(Q3.p.f2359d);

    public final boolean a(AbstractC0438v abstractC0438v, AbstractC0438v abstractC0438v2) {
        AbstractC0219i.e("a", abstractC0438v);
        AbstractC0219i.e("b", abstractC0438v2);
        return C0421d.g(g.l(false, false, null, this.f6755c, f.f6740a, 6), abstractC0438v.L0(), abstractC0438v2.L0());
    }

    public final boolean b(AbstractC0438v abstractC0438v, AbstractC0438v abstractC0438v2) {
        AbstractC0219i.e("subtype", abstractC0438v);
        AbstractC0219i.e("supertype", abstractC0438v2);
        return C0421d.n(C0421d.f6675a, g.l(true, false, null, this.f6755c, f.f6740a, 6), abstractC0438v.L0(), abstractC0438v2.L0());
    }
}
