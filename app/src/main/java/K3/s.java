package k3;

import b3.AbstractC0219i;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class s extends o {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7924g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(int i5, Method method) {
        super(method, false, 6);
        this.f7924g = i5;
        switch (i5) {
            case 1:
                AbstractC0219i.e("method", method);
                super(method, true, 4);
                break;
            case 2:
                AbstractC0219i.e("method", method);
                super(method, false, 6);
                break;
            default:
                AbstractC0219i.e("method", method);
                break;
        }
    }

    @Override // k3.o, k3.InterfaceC0673e
    public final Object i(Object[] objArr) {
        switch (this.f7924g) {
            case 0:
                Y0.j.d(this, objArr);
                return c(objArr[0], objArr.length <= 1 ? new Object[0] : P2.i.m0(objArr, 1, objArr.length));
            case 1:
                Y0.j.d(this, objArr);
                b(objArr.length == 0 ? null : objArr[0]);
                return c(null, objArr.length <= 1 ? new Object[0] : P2.i.m0(objArr, 1, objArr.length));
            default:
                Y0.j.d(this, objArr);
                return c(null, objArr);
        }
    }
}
