package c4;

import I3.C0030l;
import O3.AbstractC0070b;
import b3.AbstractC0219i;
import p3.InterfaceC0752N;
import p3.InterfaceC0761e;
import p3.InterfaceC0765i;
import p3.InterfaceC0766j;
import p3.InterfaceC0776t;
import q3.InterfaceC0798h;
import s3.AbstractC0866v;
import s3.C0855k;

/* loaded from: classes.dex */
public final class c extends C0855k implements b {

    /* renamed from: H, reason: collision with root package name */
    public final C0030l f5142H;

    /* renamed from: I, reason: collision with root package name */
    public final K3.f f5143I;

    /* renamed from: J, reason: collision with root package name */
    public final K3.g f5144J;

    /* renamed from: K, reason: collision with root package name */
    public final K3.h f5145K;

    /* renamed from: L, reason: collision with root package name */
    public final G3.h f5146L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC0761e interfaceC0761e, InterfaceC0765i interfaceC0765i, InterfaceC0798h interfaceC0798h, boolean z4, int i5, C0030l c0030l, K3.f fVar, K3.g gVar, K3.h hVar, G3.h hVar2, InterfaceC0752N interfaceC0752N) {
        super(interfaceC0761e, interfaceC0765i, interfaceC0798h, z4, i5, interfaceC0752N == null ? InterfaceC0752N.f8400b : interfaceC0752N);
        AbstractC0219i.e("containingDeclaration", interfaceC0761e);
        AbstractC0219i.e("annotations", interfaceC0798h);
        A3.f.q(i5, "kind");
        AbstractC0219i.e("proto", c0030l);
        AbstractC0219i.e("nameResolver", fVar);
        AbstractC0219i.e("typeTable", gVar);
        AbstractC0219i.e("versionRequirementTable", hVar);
        this.f5142H = c0030l;
        this.f5143I = fVar;
        this.f5144J = gVar;
        this.f5145K = hVar;
        this.f5146L = hVar2;
    }

    @Override // c4.k
    public final K3.f A0() {
        return this.f5143I;
    }

    @Override // s3.AbstractC0866v, p3.InterfaceC0780x
    public final boolean E() {
        return false;
    }

    @Override // s3.AbstractC0866v, p3.InterfaceC0776t
    public final boolean O() {
        return false;
    }

    @Override // s3.C0855k, s3.AbstractC0866v
    public final /* bridge */ /* synthetic */ AbstractC0866v Q0(int i5, N3.f fVar, InterfaceC0766j interfaceC0766j, InterfaceC0776t interfaceC0776t, InterfaceC0752N interfaceC0752N, InterfaceC0798h interfaceC0798h) {
        return f1(interfaceC0766j, interfaceC0776t, i5, interfaceC0798h, interfaceC0752N);
    }

    @Override // c4.k
    public final K3.g Y() {
        return this.f5144J;
    }

    @Override // s3.C0855k
    /* renamed from: Z0 */
    public final /* bridge */ /* synthetic */ C0855k Q0(int i5, N3.f fVar, InterfaceC0766j interfaceC0766j, InterfaceC0776t interfaceC0776t, InterfaceC0752N interfaceC0752N, InterfaceC0798h interfaceC0798h) {
        return f1(interfaceC0766j, interfaceC0776t, i5, interfaceC0798h, interfaceC0752N);
    }

    public final c f1(InterfaceC0766j interfaceC0766j, InterfaceC0776t interfaceC0776t, int i5, InterfaceC0798h interfaceC0798h, InterfaceC0752N interfaceC0752N) {
        AbstractC0219i.e("newOwner", interfaceC0766j);
        A3.f.q(i5, "kind");
        AbstractC0219i.e("annotations", interfaceC0798h);
        c cVar = new c((InterfaceC0761e) interfaceC0766j, (InterfaceC0765i) interfaceC0776t, interfaceC0798h, this.f8828G, i5, this.f5142H, this.f5143I, this.f5144J, this.f5145K, this.f5146L, interfaceC0752N);
        cVar.f8893y = this.f8893y;
        return cVar;
    }

    @Override // s3.AbstractC0866v, p3.InterfaceC0776t
    public final boolean h() {
        return false;
    }

    @Override // s3.AbstractC0866v, p3.InterfaceC0776t
    public final boolean j() {
        return false;
    }

    @Override // c4.k
    public final AbstractC0070b j0() {
        return this.f5142H;
    }

    @Override // c4.k
    public final j y() {
        return this.f5146L;
    }
}
