package k3;

import b3.AbstractC0219i;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class l extends o implements InterfaceC0672d {

    /* renamed from: g, reason: collision with root package name */
    public final Object f7919g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Field field, boolean z4, Object obj) {
        super(field, z4, false);
        AbstractC0219i.e("field", field);
        this.f7919g = obj;
    }

    @Override // k3.o, k3.InterfaceC0673e
    public final Object i(Object[] objArr) throws IllegalAccessException, IllegalArgumentException {
        a(objArr);
        ((Field) this.f7925a).set(this.f7919g, P2.i.o0(objArr));
        return O2.l.f2016a;
    }
}
