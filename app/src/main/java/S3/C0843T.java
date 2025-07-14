package s3;

import b3.AbstractC0219i;
import e4.AbstractC0438v;
import e4.V;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import n3.C0702g;
import p3.AbstractC0771o;
import p3.C0753O;
import p3.C0770n;
import p3.InterfaceC0748J;
import p3.InterfaceC0752N;
import p3.InterfaceC0758b;
import p3.InterfaceC0759c;
import p3.InterfaceC0766j;
import p3.InterfaceC0767k;
import p3.InterfaceC0768l;
import q3.InterfaceC0798h;

/* renamed from: s3.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0843T extends AbstractC0844U implements InterfaceC0748J, p3.U {

    /* renamed from: i, reason: collision with root package name */
    public final int f8800i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f8801j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f8802k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f8803l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC0438v f8804m;
    public final C0843T n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0843T(InterfaceC0758b interfaceC0758b, C0843T c0843t, int i5, InterfaceC0798h interfaceC0798h, N3.f fVar, AbstractC0438v abstractC0438v, boolean z4, boolean z5, boolean z6, AbstractC0438v abstractC0438v2, InterfaceC0752N interfaceC0752N) {
        super(interfaceC0758b, interfaceC0798h, fVar, abstractC0438v, interfaceC0752N);
        AbstractC0219i.e("containingDeclaration", interfaceC0758b);
        AbstractC0219i.e("annotations", interfaceC0798h);
        AbstractC0219i.e("name", fVar);
        AbstractC0219i.e("outType", abstractC0438v);
        AbstractC0219i.e("source", interfaceC0752N);
        this.f8800i = i5;
        this.f8801j = z4;
        this.f8802k = z5;
        this.f8803l = z6;
        this.f8804m = abstractC0438v2;
        this.n = c0843t == null ? this : c0843t;
    }

    public C0843T O0(C0702g c0702g, N3.f fVar, int i5) {
        InterfaceC0798h interfaceC0798hS = s();
        AbstractC0219i.d("annotations", interfaceC0798hS);
        AbstractC0438v abstractC0438vD = d();
        AbstractC0219i.d("type", abstractC0438vD);
        boolean zP0 = P0();
        C0753O c0753o = InterfaceC0752N.f8400b;
        return new C0843T(c0702g, null, i5, interfaceC0798hS, fVar, abstractC0438vD, zP0, this.f8802k, this.f8803l, this.f8804m, c0753o);
    }

    public final boolean P0() {
        return this.f8801j && ((InterfaceC0759c) l()).i0() != 2;
    }

    @Override // s3.AbstractC0860p, p3.InterfaceC0766j
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0758b l() {
        InterfaceC0766j interfaceC0766jL = super.l();
        AbstractC0219i.c("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor", interfaceC0766jL);
        return (InterfaceC0758b) interfaceC0766jL;
    }

    @Override // s3.AbstractC0860p, s3.AbstractC0859o, p3.InterfaceC0766j, p3.InterfaceC0763g
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public final C0843T a() {
        C0843T c0843t = this.n;
        return c0843t == this ? this : c0843t.a();
    }

    @Override // p3.U
    public final boolean T() {
        return false;
    }

    @Override // p3.InterfaceC0766j
    public final Object U(InterfaceC0768l interfaceC0768l, Object obj) {
        return interfaceC0768l.l(this, obj);
    }

    @Override // p3.InterfaceC0769m, p3.InterfaceC0780x
    public final C0770n b() {
        C0770n c0770n = AbstractC0771o.f;
        AbstractC0219i.d("LOCAL", c0770n);
        return c0770n;
    }

    @Override // p3.InterfaceC0754P
    public final InterfaceC0767k c(V v2) {
        AbstractC0219i.e("substitutor", v2);
        if (v2.f6668a.e()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // p3.U
    public final /* bridge */ /* synthetic */ S3.g e0() {
        return null;
    }

    @Override // p3.InterfaceC0758b
    public final Collection p() {
        Collection collectionP = l().p();
        AbstractC0219i.d("containingDeclaration.overriddenDescriptors", collectionP);
        ArrayList arrayList = new ArrayList(P2.o.l0(collectionP));
        Iterator it = collectionP.iterator();
        while (it.hasNext()) {
            arrayList.add((C0843T) ((InterfaceC0758b) it.next()).v0().get(this.f8800i));
        }
        return arrayList;
    }
}
