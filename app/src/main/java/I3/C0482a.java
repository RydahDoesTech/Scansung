package i3;

import I3.C0042y;
import a3.InterfaceC0108c;
import a4.s;
import b3.AbstractC0217g;
import b3.AbstractC0219i;
import b3.q;
import g3.InterfaceC0455e;

/* renamed from: i3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0482a extends AbstractC0217g implements InterfaceC0108c {

    /* renamed from: l, reason: collision with root package name */
    public static final C0482a f6920l = new C0482a(2);

    @Override // a3.InterfaceC0108c
    public final Object c(Object obj, Object obj2) {
        s sVar = (s) obj;
        C0042y c0042y = (C0042y) obj2;
        AbstractC0219i.e("p0", sVar);
        AbstractC0219i.e("p1", c0042y);
        return sVar.e(c0042y);
    }

    @Override // b3.AbstractC0212b, g3.InterfaceC0452b
    public final String getName() {
        return "loadFunction";
    }

    @Override // b3.AbstractC0212b
    public final InterfaceC0455e j() {
        return q.f5100a.b(s.class);
    }

    @Override // b3.AbstractC0212b
    public final String l() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }
}
