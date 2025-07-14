package j3;

import a3.InterfaceC0106a;

/* loaded from: classes.dex */
public final class Z extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0 f7366e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(a0 a0Var, int i5) {
        super(0);
        this.f7365d = i5;
        this.f7366e = a0Var;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        switch (this.f7365d) {
            case 0:
                return new Y(this.f7366e);
            default:
                return this.f7366e.p();
        }
    }
}
