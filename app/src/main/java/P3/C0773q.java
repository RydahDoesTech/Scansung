package p3;

import a3.InterfaceC0107b;
import b3.AbstractC0217g;
import b3.AbstractC0219i;
import g3.InterfaceC0455e;

/* renamed from: p3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0773q extends AbstractC0217g implements InterfaceC0107b {

    /* renamed from: l, reason: collision with root package name */
    public static final C0773q f8433l = new C0773q(1);

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        N3.b bVar = (N3.b) obj;
        AbstractC0219i.e("p0", bVar);
        return bVar.f();
    }

    @Override // b3.AbstractC0212b, g3.InterfaceC0452b
    public final String getName() {
        return "getOuterClassId";
    }

    @Override // b3.AbstractC0212b
    public final InterfaceC0455e j() {
        return b3.q.f5100a.b(N3.b.class);
    }

    @Override // b3.AbstractC0212b
    public final String l() {
        return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
    }
}
