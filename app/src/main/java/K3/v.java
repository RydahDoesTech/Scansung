package k3;

import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class v extends x implements InterfaceC0672d {

    /* renamed from: d, reason: collision with root package name */
    public final Object f7932d;

    public v(Method method, Object obj) {
        super(method, P2.u.f2163d);
        this.f7932d = obj;
    }

    @Override // k3.InterfaceC0673e
    public final Object i(Object[] objArr) {
        Y0.j.d(this, objArr);
        return this.f7933a.invoke(this.f7932d, Arrays.copyOf(objArr, objArr.length));
    }
}
