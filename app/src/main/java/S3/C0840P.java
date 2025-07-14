package s3;

import b3.AbstractC0219i;
import e4.AbstractC0438v;
import e4.V;
import p3.C0770n;
import p3.InterfaceC0752N;
import p3.InterfaceC0759c;
import p3.InterfaceC0761e;
import p3.InterfaceC0764h;
import p3.InterfaceC0766j;
import p3.InterfaceC0776t;
import q3.InterfaceC0791a;
import q3.InterfaceC0798h;

/* renamed from: s3.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0840P extends AbstractC0866v implements InterfaceC0839O {

    /* renamed from: J, reason: collision with root package name */
    public static final C0829E f8794J;

    /* renamed from: G, reason: collision with root package name */
    public final d4.o f8795G;

    /* renamed from: H, reason: collision with root package name */
    public final c4.s f8796H;

    /* renamed from: I, reason: collision with root package name */
    public C0855k f8797I;

    static {
        b3.r rVar = b3.q.f5100a;
        rVar.e(new b3.n(rVar.b(C0840P.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"));
        f8794J = new C0829E();
    }

    public C0840P(d4.o oVar, c4.s sVar, C0855k c0855k, InterfaceC0839O interfaceC0839O, InterfaceC0798h interfaceC0798h, int i5, InterfaceC0752N interfaceC0752N) {
        super(i5, N3.h.f1849e, sVar, interfaceC0839O, interfaceC0752N, interfaceC0798h);
        this.f8795G = oVar;
        this.f8796H = sVar;
        B3.a aVar = new B3.a(this, 15, c0855k);
        d4.l lVar = (d4.l) oVar;
        lVar.getClass();
        new d4.h(lVar, aVar);
        this.f8797I = c0855k;
    }

    @Override // s3.AbstractC0866v
    public final AbstractC0866v Q0(int i5, N3.f fVar, InterfaceC0766j interfaceC0766j, InterfaceC0776t interfaceC0776t, InterfaceC0752N interfaceC0752N, InterfaceC0798h interfaceC0798h) {
        AbstractC0219i.e("newOwner", interfaceC0766j);
        A3.f.q(i5, "kind");
        AbstractC0219i.e("annotations", interfaceC0798h);
        if (i5 != 1) {
        }
        return new C0840P(this.f8795G, this.f8796H, this.f8797I, this, interfaceC0798h, 1, interfaceC0752N);
    }

    @Override // p3.InterfaceC0765i
    public final InterfaceC0761e X() {
        InterfaceC0761e interfaceC0761eX = this.f8797I.X();
        AbstractC0219i.d("underlyingConstructorDescriptor.constructedClass", interfaceC0761eX);
        return interfaceC0761eX;
    }

    @Override // s3.AbstractC0866v, s3.AbstractC0860p, s3.AbstractC0859o, p3.InterfaceC0766j, p3.InterfaceC0763g
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0839O a() {
        InterfaceC0776t interfaceC0776tA = super.a();
        AbstractC0219i.c("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor", interfaceC0776tA);
        return (InterfaceC0839O) interfaceC0776tA;
    }

    @Override // s3.AbstractC0866v, p3.InterfaceC0759c
    public final InterfaceC0759c a0(InterfaceC0761e interfaceC0761e, int i5, C0770n c0770n) {
        AbstractC0219i.e("newOwner", interfaceC0761e);
        A3.f.q(i5, "modality");
        AbstractC0219i.e("visibility", c0770n);
        A3.f.q(2, "kind");
        C0865u c0865uU0 = U0(V.f6667b);
        c0865uU0.f8852e = interfaceC0761e;
        c0865uU0.f = i5;
        c0865uU0.f8853g = c0770n;
        c0865uU0.f8855i = 2;
        c0865uU0.f8861p = false;
        InterfaceC0791a interfaceC0791aR0 = c0865uU0.f8850A.R0(c0865uU0);
        AbstractC0219i.c("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor", interfaceC0791aR0);
        return (InterfaceC0839O) interfaceC0791aR0;
    }

    @Override // s3.AbstractC0866v, p3.InterfaceC0776t, p3.InterfaceC0754P
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public final C0840P c(V v2) {
        AbstractC0219i.e("substitutor", v2);
        InterfaceC0776t interfaceC0776tC = super.c(v2);
        AbstractC0219i.c("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl", interfaceC0776tC);
        C0840P c0840p = (C0840P) interfaceC0776tC;
        AbstractC0438v abstractC0438v = c0840p.f8879j;
        AbstractC0219i.b(abstractC0438v);
        C0855k c0855kC = this.f8797I.N0().c(V.d(abstractC0438v));
        if (c0855kC == null) {
            return null;
        }
        c0840p.f8797I = c0855kC;
        return c0840p;
    }

    @Override // s3.AbstractC0860p, p3.InterfaceC0766j
    public final InterfaceC0764h l() {
        return this.f8796H;
    }

    @Override // s3.AbstractC0866v, p3.InterfaceC0758b
    public final AbstractC0438v o() {
        AbstractC0438v abstractC0438v = this.f8879j;
        AbstractC0219i.b(abstractC0438v);
        return abstractC0438v;
    }

    @Override // s3.AbstractC0860p, p3.InterfaceC0766j
    public final InterfaceC0766j l() {
        return this.f8796H;
    }
}
