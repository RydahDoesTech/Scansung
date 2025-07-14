package g3;

import a3.InterfaceC0107b;
import b3.AbstractC0218h;
import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final /* synthetic */ class x extends AbstractC0218h implements InterfaceC0107b {

    /* renamed from: l, reason: collision with root package name */
    public static final x f6790l = new x(Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        Class cls = (Class) obj;
        AbstractC0219i.e("p0", cls);
        return cls.getComponentType();
    }
}
