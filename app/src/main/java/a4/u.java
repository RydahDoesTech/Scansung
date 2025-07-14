package a4;

import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class u extends v {

    /* renamed from: e, reason: collision with root package name */
    public final N3.c f3091e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(N3.c cVar, K3.f fVar, K3.g gVar, G3.h hVar) {
        super(fVar, gVar, hVar);
        AbstractC0219i.e("fqName", cVar);
        AbstractC0219i.e("nameResolver", fVar);
        AbstractC0219i.e("typeTable", gVar);
        this.f3091e = cVar;
    }

    @Override // a4.v
    public final N3.c j() {
        return this.f3091e;
    }
}
