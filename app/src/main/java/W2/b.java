package W2;

import b3.AbstractC0219i;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class b extends V2.b {
    @Override // V2.b
    public final void a(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC0219i.e("cause", th);
        AbstractC0219i.e("exception", th2);
        Integer num = a.f2648a;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
