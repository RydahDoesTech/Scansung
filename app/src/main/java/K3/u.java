package k3;

import b3.AbstractC0219i;
import f3.C0447c;
import j3.x0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class u implements InterfaceC0673e {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0673e f7929a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7930b;

    /* renamed from: c, reason: collision with root package name */
    public final D3.c f7931c;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public u(k3.InterfaceC0673e r9, p3.InterfaceC0776t r10, boolean r11) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.u.<init>(k3.e, p3.t, boolean):void");
    }

    @Override // k3.InterfaceC0673e
    public final Object i(Object[] objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        D3.c cVar = this.f7931c;
        C0447c c0447c = (C0447c) cVar.f507e;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC0219i.d("copyOf(this, size)", objArrCopyOf);
        int i5 = c0447c.f6729d;
        int i6 = c0447c.f6730e;
        if (i5 <= i6) {
            while (true) {
                Method method = ((Method[]) cVar.f)[i5];
                Object objE = objArr[i5];
                if (method != null) {
                    if (objE != null) {
                        objE = method.invoke(objE, null);
                    } else {
                        Class<?> returnType = method.getReturnType();
                        AbstractC0219i.d("method.returnType", returnType);
                        objE = x0.e(returnType);
                    }
                }
                objArrCopyOf[i5] = objE;
                if (i5 == i6) {
                    break;
                }
                i5++;
            }
        }
        Object objI = this.f7929a.i(objArrCopyOf);
        Method method2 = (Method) cVar.f508g;
        return (method2 == null || (objInvoke = method2.invoke(null, objI)) == null) ? objI : objInvoke;
    }

    @Override // k3.InterfaceC0673e
    public final Type o() {
        return this.f7929a.o();
    }

    @Override // k3.InterfaceC0673e
    public final List p() {
        return this.f7929a.p();
    }

    @Override // k3.InterfaceC0673e
    public final Member q() {
        return this.f7929a.q();
    }
}
