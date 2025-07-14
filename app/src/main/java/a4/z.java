package a4;

import I3.Q;
import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import e1.AbstractC0415a;
import p3.AbstractC0779w;
import p3.InterfaceC0763g;
import p3.InterfaceC0781y;

/* loaded from: classes.dex */
public final class z extends b3.k implements InterfaceC0107b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ G3.c f3102e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(G3.c cVar, int i5) {
        super(1);
        this.f3101d = i5;
        this.f3102e = cVar;
    }

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        switch (this.f3101d) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                k kVar = (k) this.f3102e.f740e;
                N3.b bVarM = AbstractC0415a.m((K3.f) kVar.f3059e, iIntValue);
                boolean z4 = bVarM.f1832c;
                i iVar = (i) kVar.f3058d;
                return z4 ? iVar.b(bVarM) : AbstractC0779w.e(iVar.f3038b, bVarM);
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                k kVar2 = (k) this.f3102e.f740e;
                N3.b bVarM2 = AbstractC0415a.m((K3.f) kVar2.f3059e, iIntValue2);
                if (bVarM2.f1832c) {
                    return null;
                }
                InterfaceC0781y interfaceC0781y = ((i) kVar2.f3058d).f3038b;
                AbstractC0219i.e("<this>", interfaceC0781y);
                InterfaceC0763g interfaceC0763gE = AbstractC0779w.e(interfaceC0781y, bVarM2);
                if (interfaceC0763gE instanceof c4.s) {
                    return (c4.s) interfaceC0763gE;
                }
                return null;
            default:
                Q q5 = (Q) obj;
                AbstractC0219i.e("it", q5);
                return g3.y.S(q5, (K3.g) ((k) this.f3102e.f740e).f3060g);
        }
    }
}
