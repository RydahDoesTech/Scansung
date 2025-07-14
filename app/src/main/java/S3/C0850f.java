package s3;

import a3.InterfaceC0106a;
import p3.C0753O;

/* renamed from: s3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0850f implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d4.o f8814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0753O f8815e;
    public final /* synthetic */ AbstractC0854j f;

    public C0850f(AbstractC0854j abstractC0854j, d4.o oVar, C0753O c0753o) {
        this.f = abstractC0854j;
        this.f8814d = oVar;
        this.f8815e = c0753o;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        return new C0853i(this.f, this.f8814d, this.f8815e);
    }
}
