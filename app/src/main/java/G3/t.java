package g3;

import a3.InterfaceC0107b;
import b3.AbstractC0218h;
import b3.AbstractC0219i;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final /* synthetic */ class t extends AbstractC0218h implements InterfaceC0107b {

    /* renamed from: l, reason: collision with root package name */
    public static final t f6784l = new t(y.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        Type type = (Type) obj;
        AbstractC0219i.e("p0", type);
        return y.a(type);
    }
}
