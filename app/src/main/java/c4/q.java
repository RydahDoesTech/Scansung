package c4;

import I3.G;
import O3.AbstractC0070b;
import b3.AbstractC0219i;
import p3.C0770n;
import p3.InterfaceC0750L;
import p3.InterfaceC0752N;
import p3.InterfaceC0766j;
import q3.InterfaceC0798h;
import s3.C0834J;

/* loaded from: classes.dex */
public final class q extends C0834J implements b {

    /* renamed from: D, reason: collision with root package name */
    public final G f5197D;
    public final K3.f E;

    /* renamed from: F, reason: collision with root package name */
    public final K3.g f5198F;

    /* renamed from: G, reason: collision with root package name */
    public final K3.h f5199G;

    /* renamed from: H, reason: collision with root package name */
    public final G3.h f5200H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(InterfaceC0766j interfaceC0766j, InterfaceC0750L interfaceC0750L, InterfaceC0798h interfaceC0798h, int i5, C0770n c0770n, boolean z4, N3.f fVar, int i6, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, G g5, K3.f fVar2, K3.g gVar, K3.h hVar, G3.h hVar2) {
        super(interfaceC0766j, interfaceC0750L, interfaceC0798h, i5, c0770n, z4, fVar, i6, InterfaceC0752N.f8400b, z5, z6, z9, z7, z8);
        AbstractC0219i.e("containingDeclaration", interfaceC0766j);
        AbstractC0219i.e("annotations", interfaceC0798h);
        A3.f.q(i5, "modality");
        AbstractC0219i.e("visibility", c0770n);
        AbstractC0219i.e("name", fVar);
        A3.f.q(i6, "kind");
        AbstractC0219i.e("proto", g5);
        AbstractC0219i.e("nameResolver", fVar2);
        AbstractC0219i.e("typeTable", gVar);
        AbstractC0219i.e("versionRequirementTable", hVar);
        this.f5197D = g5;
        this.E = fVar2;
        this.f5198F = gVar;
        this.f5199G = hVar;
        this.f5200H = hVar2;
    }

    @Override // c4.k
    public final K3.f A0() {
        return this.E;
    }

    @Override // s3.C0834J, p3.InterfaceC0780x
    public final boolean E() {
        return K3.e.f1663D.c(this.f5197D.f1001g).booleanValue();
    }

    @Override // s3.C0834J
    public final C0834J Q0(InterfaceC0766j interfaceC0766j, int i5, C0770n c0770n, InterfaceC0750L interfaceC0750L, int i6, N3.f fVar) {
        AbstractC0219i.e("newOwner", interfaceC0766j);
        A3.f.q(i5, "newModality");
        AbstractC0219i.e("newVisibility", c0770n);
        A3.f.q(i6, "kind");
        AbstractC0219i.e("newName", fVar);
        return new q(interfaceC0766j, interfaceC0750L, s(), i5, c0770n, this.f8771i, fVar, i6, this.f8778q, this.f8779r, E(), this.f8782u, this.f8780s, this.f5197D, this.E, this.f5198F, this.f5199G, this.f5200H);
    }

    @Override // c4.k
    public final K3.g Y() {
        return this.f5198F;
    }

    @Override // c4.k
    public final AbstractC0070b j0() {
        return this.f5197D;
    }

    @Override // c4.k
    public final j y() {
        return this.f5200H;
    }
}
