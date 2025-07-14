package a4;

import I3.G;
import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import p3.InterfaceC0766j;

/* loaded from: classes.dex */
public final class q extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f3078e;
    public final /* synthetic */ G f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c4.q f3079g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(s sVar, G g5, c4.q qVar, int i5) {
        super(0);
        this.f3077d = i5;
        this.f3078e = sVar;
        this.f = g5;
        this.f3079g = qVar;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        switch (this.f3077d) {
            case 0:
                s sVar = this.f3078e;
                v vVarA = sVar.a((InterfaceC0766j) sVar.f3085a.f);
                AbstractC0219i.b(vVarA);
                InterfaceC0110a interfaceC0110a = ((i) sVar.f3085a.f3058d).f3041e;
                AbstractC0438v abstractC0438vO = this.f3079g.o();
                AbstractC0219i.d("property.returnType", abstractC0438vO);
                return (S3.g) interfaceC0110a.K(vVarA, this.f, abstractC0438vO);
            case 1:
                s sVar2 = this.f3078e;
                d4.o oVar = ((i) sVar2.f3085a.f3058d).f3037a;
                q qVar = new q(sVar2, this.f, this.f3079g, 0);
                d4.l lVar = (d4.l) oVar;
                lVar.getClass();
                return new d4.h(lVar, qVar);
            case 2:
                s sVar3 = this.f3078e;
                v vVarA2 = sVar3.a((InterfaceC0766j) sVar3.f3085a.f);
                AbstractC0219i.b(vVarA2);
                InterfaceC0110a interfaceC0110a2 = ((i) sVar3.f3085a.f3058d).f3041e;
                AbstractC0438v abstractC0438vO2 = this.f3079g.o();
                AbstractC0219i.d("property.returnType", abstractC0438vO2);
                return (S3.g) interfaceC0110a2.t0(vVarA2, this.f, abstractC0438vO2);
            default:
                s sVar4 = this.f3078e;
                d4.o oVar2 = ((i) sVar4.f3085a.f3058d).f3037a;
                q qVar2 = new q(sVar4, this.f, this.f3079g, 2);
                d4.l lVar2 = (d4.l) oVar2;
                lVar2.getClass();
                return new d4.h(lVar2, qVar2);
        }
    }
}
