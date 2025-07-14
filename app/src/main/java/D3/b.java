package D3;

import a3.InterfaceC0106a;
import b3.k;
import com.google.firebase.messaging.C0388e;
import e4.J;
import p3.InterfaceC0755Q;
import p3.InterfaceC0763g;
import v3.q;

/* loaded from: classes.dex */
public final class b extends k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0755Q f502e;
    public final /* synthetic */ a f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ J f503g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f504h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, InterfaceC0755Q interfaceC0755Q, a aVar, J j5, q qVar) {
        super(0);
        this.f501d = cVar;
        this.f502e = interfaceC0755Q;
        this.f = aVar;
        this.f503g = j5;
        this.f504h = qVar;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        C0388e c0388e = (C0388e) this.f501d.f508g;
        InterfaceC0763g interfaceC0763gI = this.f503g.i();
        return c0388e.p(this.f502e, a.a(a.a(this.f, 0, false, null, interfaceC0763gI != null ? interfaceC0763gI.q() : null, 31), 0, this.f504h.c(), null, null, 59));
    }
}
