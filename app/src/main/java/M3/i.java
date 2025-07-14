package m3;

import a3.InterfaceC0106a;

/* loaded from: classes.dex */
public final class i extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f8070e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, int i5) {
        super(0);
        this.f8069d = i5;
        this.f8070e = jVar;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        switch (this.f8069d) {
            case 0:
                return n.f8150j.c(this.f8070e.f8081e);
            default:
                return n.f8150j.c(this.f8070e.f8080d);
        }
    }
}
