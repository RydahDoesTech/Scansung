package k2;

import l2.C0682a;

/* loaded from: classes.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final t1.i f7896a;

    public h(t1.i iVar) {
        this.f7896a = iVar;
    }

    @Override // k2.j
    public final boolean a(C0682a c0682a) {
        int i5 = c0682a.f8015b;
        if (i5 != 3 && i5 != 4 && i5 != 5) {
            return false;
        }
        this.f7896a.d(c0682a.f8014a);
        return true;
    }

    @Override // k2.j
    public final boolean b(Exception exc) {
        return false;
    }
}
