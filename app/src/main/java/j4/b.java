package j4;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import b3.k;
import e4.Z;

/* loaded from: classes.dex */
public final class b extends k implements InterfaceC0107b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f7463d = new b(1);

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        Z z4 = (Z) obj;
        AbstractC0219i.d("it", z4);
        return Boolean.valueOf(z4.I0() instanceof R3.b);
    }
}
