package c4;

import I3.C0042y;
import O3.AbstractC0070b;
import b3.AbstractC0219i;
import p3.InterfaceC0752N;
import p3.InterfaceC0766j;
import p3.InterfaceC0776t;
import q3.InterfaceC0798h;
import s3.AbstractC0866v;
import s3.C0837M;

/* loaded from: classes.dex */
public final class r extends C0837M implements b {

    /* renamed from: G, reason: collision with root package name */
    public final C0042y f5201G;

    /* renamed from: H, reason: collision with root package name */
    public final K3.f f5202H;

    /* renamed from: I, reason: collision with root package name */
    public final K3.g f5203I;

    /* renamed from: J, reason: collision with root package name */
    public final K3.h f5204J;

    /* renamed from: K, reason: collision with root package name */
    public final G3.h f5205K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC0766j interfaceC0766j, C0837M c0837m, InterfaceC0798h interfaceC0798h, N3.f fVar, int i5, C0042y c0042y, K3.f fVar2, K3.g gVar, K3.h hVar, G3.h hVar2, InterfaceC0752N interfaceC0752N) {
        super(interfaceC0766j, c0837m, interfaceC0798h, fVar, i5, interfaceC0752N == null ? InterfaceC0752N.f8400b : interfaceC0752N);
        AbstractC0219i.e("containingDeclaration", interfaceC0766j);
        AbstractC0219i.e("annotations", interfaceC0798h);
        A3.f.q(i5, "kind");
        AbstractC0219i.e("proto", c0042y);
        AbstractC0219i.e("nameResolver", fVar2);
        AbstractC0219i.e("typeTable", gVar);
        AbstractC0219i.e("versionRequirementTable", hVar);
        this.f5201G = c0042y;
        this.f5202H = fVar2;
        this.f5203I = gVar;
        this.f5204J = hVar;
        this.f5205K = hVar2;
    }

    @Override // c4.k
    public final K3.f A0() {
        return this.f5202H;
    }

    @Override // s3.C0837M, s3.AbstractC0866v
    public final AbstractC0866v Q0(int i5, N3.f fVar, InterfaceC0766j interfaceC0766j, InterfaceC0776t interfaceC0776t, InterfaceC0752N interfaceC0752N, InterfaceC0798h interfaceC0798h) {
        N3.f fVar2;
        AbstractC0219i.e("newOwner", interfaceC0766j);
        A3.f.q(i5, "kind");
        AbstractC0219i.e("annotations", interfaceC0798h);
        C0837M c0837m = (C0837M) interfaceC0776t;
        if (fVar == null) {
            N3.f name = getName();
            AbstractC0219i.d("name", name);
            fVar2 = name;
        } else {
            fVar2 = fVar;
        }
        r rVar = new r(interfaceC0766j, c0837m, interfaceC0798h, fVar2, i5, this.f5201G, this.f5202H, this.f5203I, this.f5204J, this.f5205K, interfaceC0752N);
        rVar.f8893y = this.f8893y;
        return rVar;
    }

    @Override // c4.k
    public final K3.g Y() {
        return this.f5203I;
    }

    @Override // c4.k
    public final AbstractC0070b j0() {
        return this.f5201G;
    }

    @Override // c4.k
    public final j y() {
        return this.f5205K;
    }
}
