package V2;

import b3.AbstractC0219i;
import d3.AbstractC0397d;
import d3.C0395b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class b {
    public void a(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC0219i.e("cause", th);
        AbstractC0219i.e("exception", th2);
        Method method = a.f2623a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public AbstractC0397d b() {
        return new C0395b();
    }
}
