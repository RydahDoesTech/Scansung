package b3;

import g3.InterfaceC0453c;
import g3.InterfaceC0455e;
import g3.InterfaceC0456f;
import g3.InterfaceC0459i;
import g3.InterfaceC0465o;

/* loaded from: classes.dex */
public class r {
    public InterfaceC0456f a(AbstractC0217g abstractC0217g) {
        return abstractC0217g;
    }

    public InterfaceC0453c b(Class cls) {
        return new C0214d(cls);
    }

    public InterfaceC0455e c(Class cls, String str) {
        return new m(cls, str);
    }

    public InterfaceC0459i d(l lVar) {
        return lVar;
    }

    public InterfaceC0465o e(n nVar) {
        return nVar;
    }

    public String f(InterfaceC0216f interfaceC0216f) {
        String string = interfaceC0216f.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String g(k kVar) {
        return f(kVar);
    }
}
