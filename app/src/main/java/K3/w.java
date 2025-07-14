package k3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class w extends x {
    @Override // k3.InterfaceC0673e
    public final Object i(Object[] objArr) {
        Y0.j.d(this, objArr);
        Object obj = objArr[0];
        Object[] objArrM0 = objArr.length <= 1 ? new Object[0] : P2.i.m0(objArr, 1, objArr.length);
        return this.f7933a.invoke(obj, Arrays.copyOf(objArrM0, objArrM0.length));
    }
}
