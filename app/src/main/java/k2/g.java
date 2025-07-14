package k2;

import l2.C0682a;

/* loaded from: classes.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final k f7894a;

    /* renamed from: b, reason: collision with root package name */
    public final t1.i f7895b;

    public g(k kVar, t1.i iVar) {
        this.f7894a = kVar;
        this.f7895b = iVar;
    }

    @Override // k2.j
    public final boolean a(C0682a c0682a) {
        if (c0682a.f8015b != 4 || this.f7894a.a(c0682a)) {
            return false;
        }
        String str = c0682a.f8016c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f7895b.b(new C0668a(str, c0682a.f8018e, c0682a.f));
        return true;
    }

    @Override // k2.j
    public final boolean b(Exception exc) {
        this.f7895b.c(exc);
        return true;
    }
}
