package a4;

import I3.Q;
import a3.InterfaceC0107b;
import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class B extends b3.k implements InterfaceC0107b {

    /* renamed from: d, reason: collision with root package name */
    public static final B f3024d = new B(1);

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        Q q5 = (Q) obj;
        AbstractC0219i.e("it", q5);
        return Integer.valueOf(q5.f1075g.size());
    }
}
