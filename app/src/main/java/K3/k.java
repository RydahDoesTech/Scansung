package k3;

import b3.AbstractC0219i;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public abstract class k extends t {
    /* JADX WARN: Illegal instructions before constructor call */
    public k(Field field, boolean z4) {
        Type genericType = field.getGenericType();
        AbstractC0219i.d("field.genericType", genericType);
        super(field, genericType, z4 ? field.getDeclaringClass() : null, new Type[0]);
    }

    @Override // k3.InterfaceC0673e
    public Object i(Object[] objArr) {
        a(objArr);
        return ((Field) this.f7925a).get(this.f7927c != null ? P2.i.o0(objArr) : null);
    }
}
