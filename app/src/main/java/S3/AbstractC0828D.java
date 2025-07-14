package s3;

import b3.AbstractC0219i;
import p3.InterfaceC0742D;
import p3.InterfaceC0752N;
import p3.InterfaceC0766j;
import p3.InterfaceC0768l;
import p3.InterfaceC0781y;
import q3.C0797g;

/* renamed from: s3.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0828D extends AbstractC0860p implements InterfaceC0742D {

    /* renamed from: h, reason: collision with root package name */
    public final N3.c f8745h;

    /* renamed from: i, reason: collision with root package name */
    public final String f8746i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0828D(InterfaceC0781y interfaceC0781y, N3.c cVar) {
        super(interfaceC0781y, C0797g.f8481a, cVar.g(), InterfaceC0752N.f8400b);
        AbstractC0219i.e("module", interfaceC0781y);
        AbstractC0219i.e("fqName", cVar);
        this.f8745h = cVar;
        this.f8746i = "package " + cVar + " of " + interfaceC0781y;
    }

    @Override // s3.AbstractC0860p, p3.InterfaceC0766j
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0781y l() {
        InterfaceC0766j interfaceC0766jL = super.l();
        AbstractC0219i.c("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor", interfaceC0766jL);
        return (InterfaceC0781y) interfaceC0766jL;
    }

    @Override // p3.InterfaceC0766j
    public final Object U(InterfaceC0768l interfaceC0768l, Object obj) {
        return interfaceC0768l.q(this, obj);
    }

    @Override // s3.AbstractC0860p, p3.InterfaceC0767k
    public InterfaceC0752N n() {
        return InterfaceC0752N.f8400b;
    }

    @Override // s3.AbstractC0859o
    public String toString() {
        return this.f8746i;
    }
}
