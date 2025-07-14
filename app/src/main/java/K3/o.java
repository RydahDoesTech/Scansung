package k3;

import b3.AbstractC0219i;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class o extends t {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7921e = 0;
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ o(Method method, boolean z4, int i5) {
        z4 = (i5 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z4;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        AbstractC0219i.d("method.genericParameterTypes", genericParameterTypes);
        this(method, z4, genericParameterTypes);
    }

    @Override // k3.t
    public void a(Object[] objArr) {
        switch (this.f7921e) {
            case 0:
                Y0.j.d(this, objArr);
                if (this.f && P2.i.u0(objArr) == null) {
                    throw new IllegalArgumentException("null is not allowed as a value for this property.");
                }
                return;
            default:
                super.a(objArr);
                return;
        }
    }

    public Object c(Object obj, Object[] objArr) {
        AbstractC0219i.e("args", objArr);
        return this.f ? O2.l.f2016a : ((Method) this.f7925a).invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // k3.InterfaceC0673e
    public Object i(Object[] objArr) throws IllegalAccessException, IllegalArgumentException {
        a(objArr);
        ((Field) this.f7925a).set(this.f7927c != null ? P2.i.o0(objArr) : null, P2.i.u0(objArr));
        return O2.l.f2016a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(Method method, boolean z4, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        AbstractC0219i.d("method.genericReturnType", genericReturnType);
        super(method, genericReturnType, z4 ? method.getDeclaringClass() : null, typeArr);
        this.f = genericReturnType.equals(Void.TYPE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(Field field, boolean z4, boolean z5) {
        Class cls = Void.TYPE;
        AbstractC0219i.d("TYPE", cls);
        Class<?> declaringClass = z5 ? field.getDeclaringClass() : null;
        Type genericType = field.getGenericType();
        AbstractC0219i.d("field.genericType", genericType);
        super(field, cls, declaringClass, new Type[]{genericType});
        this.f = z4;
    }
}
