package j3;

import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import e1.AbstractC0415a;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class W extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ X f7362e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(X x4, int i5) {
        super(0);
        this.f7361d = i5;
        this.f7362e = x4;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() throws V1.h, SecurityException {
        switch (this.f7361d) {
            case 0:
                return new V(this.f7362e);
            default:
                X x4 = this.f7362e;
                Object objP = x4.p();
                try {
                    Object obj = k0.f7401k;
                    Object objI = x4.o() ? g3.y.i(x4.f7404h, x4.l()) : null;
                    if (objI == obj) {
                        objI = null;
                    }
                    x4.o();
                    AccessibleObject accessibleObject = objP instanceof AccessibleObject ? (AccessibleObject) objP : null;
                    if (accessibleObject != null) {
                        accessibleObject.setAccessible(AbstractC0415a.D(x4));
                    }
                    if (objP == null) {
                        return null;
                    }
                    if (objP instanceof Field) {
                        return ((Field) objP).get(objI);
                    }
                    if (!(objP instanceof Method)) {
                        throw new AssertionError("delegate field/method " + objP + " neither field nor method");
                    }
                    int length = ((Method) objP).getParameterTypes().length;
                    if (length == 0) {
                        return ((Method) objP).invoke(null, null);
                    }
                    if (length == 1) {
                        Method method = (Method) objP;
                        if (objI == null) {
                            Class<?> cls = ((Method) objP).getParameterTypes()[0];
                            AbstractC0219i.d("fieldOrMethod.parameterTypes[0]", cls);
                            objI = x0.e(cls);
                        }
                        return method.invoke(null, objI);
                    }
                    if (length == 2) {
                        Method method2 = (Method) objP;
                        Class<?> cls2 = ((Method) objP).getParameterTypes()[1];
                        AbstractC0219i.d("fieldOrMethod.parameterTypes[1]", cls2);
                        return method2.invoke(null, objI, x0.e(cls2));
                    }
                    throw new AssertionError("delegate method " + objP + " should take 0, 1, or 2 parameters");
                } catch (IllegalAccessException e5) {
                    throw new V1.h("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e5);
                }
        }
    }
}
