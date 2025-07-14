package k3;

import b3.AbstractC0219i;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class p extends o implements InterfaceC0672d {

    /* renamed from: g, reason: collision with root package name */
    public final Object f7922g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Method method, Object obj) {
        super(method, false, 4);
        AbstractC0219i.e("method", method);
        this.f7922g = obj;
    }

    @Override // k3.o, k3.InterfaceC0673e
    public final Object i(Object[] objArr) {
        Y0.j.d(this, objArr);
        return c(this.f7922g, objArr);
    }
}
