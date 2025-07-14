package C3;

import b3.AbstractC0219i;
import java.util.Collection;
import p3.InterfaceC0761e;

/* loaded from: classes.dex */
public final class E implements n4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final E f367d = new E();

    @Override // n4.a
    public final Iterable p(Object obj) {
        int i5 = H.f373p;
        Collection collectionJ = ((InterfaceC0761e) obj).I().j();
        AbstractC0219i.d("it.typeConstructor.supertypes", collectionJ);
        return new P2.k(2, o4.m.j0(P2.m.p0(collectionJ), l.f420i));
    }
}
