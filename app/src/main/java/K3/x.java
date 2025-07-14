package k3;

import b3.AbstractC0219i;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes.dex */
public abstract class x implements InterfaceC0673e {

    /* renamed from: a, reason: collision with root package name */
    public final Method f7933a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7934b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f7935c;

    public x(Method method, List list) {
        this.f7933a = method;
        this.f7934b = list;
        Class<?> returnType = method.getReturnType();
        AbstractC0219i.d("unboxMethod.returnType", returnType);
        this.f7935c = returnType;
    }

    @Override // k3.InterfaceC0673e
    public final Type o() {
        return this.f7935c;
    }

    @Override // k3.InterfaceC0673e
    public final List p() {
        return this.f7934b;
    }

    @Override // k3.InterfaceC0673e
    public final /* bridge */ /* synthetic */ Member q() {
        return null;
    }
}
