package V2;

import b3.AbstractC0219i;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f2623a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        AbstractC0219i.d("throwableMethods", methods);
        int length = methods.length;
        int i5 = 0;
        while (true) {
            method = null;
            if (i5 >= length) {
                break;
            }
            Method method2 = methods[i5];
            if (AbstractC0219i.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                AbstractC0219i.d("it.parameterTypes", parameterTypes);
                if (AbstractC0219i.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i5++;
        }
        f2623a = method;
        int length2 = methods.length;
        for (int i6 = 0; i6 < length2 && !AbstractC0219i.a(methods[i6].getName(), "getSuppressed"); i6++) {
        }
    }
}
