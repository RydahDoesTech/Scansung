package v3;

import a3.InterfaceC0107b;
import b3.AbstractC0217g;
import b3.AbstractC0219i;
import g3.InterfaceC0455e;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final /* synthetic */ class k extends AbstractC0217g implements InterfaceC0107b {

    /* renamed from: l, reason: collision with root package name */
    public static final k f9254l = new k(1);

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        Constructor constructor = (Constructor) obj;
        AbstractC0219i.e("p0", constructor);
        return new r(constructor);
    }

    @Override // b3.AbstractC0212b, g3.InterfaceC0452b
    public final String getName() {
        return "<init>";
    }

    @Override // b3.AbstractC0212b
    public final InterfaceC0455e j() {
        return b3.q.f5100a.b(r.class);
    }

    @Override // b3.AbstractC0212b
    public final String l() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }
}
