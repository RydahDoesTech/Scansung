package U3;

import a3.InterfaceC0107b;
import b3.AbstractC0217g;
import b3.AbstractC0219i;
import b3.q;
import g3.InterfaceC0455e;
import s3.C0843T;

/* loaded from: classes.dex */
public final /* synthetic */ class c extends AbstractC0217g implements InterfaceC0107b {

    /* renamed from: l, reason: collision with root package name */
    public static final c f2565l = new c(1);

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        C0843T c0843t = (C0843T) obj;
        AbstractC0219i.e("p0", c0843t);
        return Boolean.valueOf(c0843t.P0());
    }

    @Override // b3.AbstractC0212b, g3.InterfaceC0452b
    public final String getName() {
        return "declaresDefaultValue";
    }

    @Override // b3.AbstractC0212b
    public final InterfaceC0455e j() {
        return q.f5100a.b(C0843T.class);
    }

    @Override // b3.AbstractC0212b
    public final String l() {
        return "declaresDefaultValue()Z";
    }
}
