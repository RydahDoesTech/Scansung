package j3;

import a3.InterfaceC0106a;

/* loaded from: classes.dex */
public final class c0 extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0 f7382e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(d0 d0Var, int i5) {
        super(0);
        this.f7381d = i5;
        this.f7382e = d0Var;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        switch (this.f7381d) {
            case 0:
                return new b0(this.f7382e);
            default:
                return this.f7382e.p();
        }
    }
}
