package f4;

import b3.AbstractC0219i;
import e4.AbstractC0420c;
import e4.AbstractC0442z;
import e4.I;
import e4.V;

/* loaded from: classes.dex */
public final class a extends AbstractC0420c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f6735a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V f6736b;

    public a(b bVar, V v2) {
        this.f6735a = bVar;
        this.f6736b = v2;
    }

    @Override // e4.AbstractC0420c
    public final h4.d x(I i5, h4.c cVar) {
        AbstractC0219i.e("state", i5);
        AbstractC0219i.e("type", cVar);
        b bVar = this.f6735a;
        AbstractC0442z abstractC0442zA0 = bVar.A0(this.f6736b.g(1, bVar.z(cVar)));
        AbstractC0219i.b(abstractC0442zA0);
        return abstractC0442zA0;
    }
}
