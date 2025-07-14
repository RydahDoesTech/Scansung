package j3;

import a3.InterfaceC0108c;
import b3.AbstractC0217g;
import b3.AbstractC0219i;
import g3.InterfaceC0455e;

/* loaded from: classes.dex */
public final /* synthetic */ class Q extends AbstractC0217g implements InterfaceC0108c {

    /* renamed from: l, reason: collision with root package name */
    public static final Q f7351l = new Q(2);

    @Override // a3.InterfaceC0108c
    public final Object c(Object obj, Object obj2) {
        a4.s sVar = (a4.s) obj;
        I3.G g5 = (I3.G) obj2;
        AbstractC0219i.e("p0", sVar);
        AbstractC0219i.e("p1", g5);
        return sVar.f(g5);
    }

    @Override // b3.AbstractC0212b, g3.InterfaceC0452b
    public final String getName() {
        return "loadProperty";
    }

    @Override // b3.AbstractC0212b
    public final InterfaceC0455e j() {
        return b3.q.f5100a.b(a4.s.class);
    }

    @Override // b3.AbstractC0212b
    public final String l() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }
}
