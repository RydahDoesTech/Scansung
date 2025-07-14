package k3;

import b0.C0198c;
import b3.AbstractC0219i;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r extends o implements InterfaceC0672d {

    /* renamed from: g, reason: collision with root package name */
    public final Object f7923g;

    /* JADX WARN: Illegal instructions before constructor call */
    public r(Method method, Object obj) {
        AbstractC0219i.e("method", method);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        AbstractC0219i.d("method.genericParameterTypes", genericParameterTypes);
        super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : P2.i.m0(genericParameterTypes, 1, genericParameterTypes.length)));
        this.f7923g = obj;
    }

    @Override // k3.o, k3.InterfaceC0673e
    public final Object i(Object[] objArr) {
        Y0.j.d(this, objArr);
        C0198c c0198c = new C0198c(2);
        c0198c.P(this.f7923g);
        c0198c.Q(objArr);
        ArrayList arrayList = (ArrayList) c0198c.f5001d;
        return c(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
