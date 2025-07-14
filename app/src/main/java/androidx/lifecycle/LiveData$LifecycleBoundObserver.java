package androidx.lifecycle;

/* loaded from: classes.dex */
class LiveData$LifecycleBoundObserver extends B implements InterfaceC0157u {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0159w f3975e;
    public final /* synthetic */ C f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveData$LifecycleBoundObserver(C c2, InterfaceC0159w interfaceC0159w, G g5) {
        super(c2, g5);
        this.f = c2;
        this.f3975e = interfaceC0159w;
    }

    @Override // androidx.lifecycle.InterfaceC0157u
    public final void a(InterfaceC0159w interfaceC0159w, EnumC0153p enumC0153p) {
        InterfaceC0159w interfaceC0159w2 = this.f3975e;
        EnumC0154q enumC0154q = ((C0161y) interfaceC0159w2.getLifecycle()).f4031c;
        if (enumC0154q == EnumC0154q.f4021d) {
            this.f.j(this.f3945a);
            return;
        }
        EnumC0154q enumC0154q2 = null;
        while (enumC0154q2 != enumC0154q) {
            b(e());
            enumC0154q2 = enumC0154q;
            enumC0154q = ((C0161y) interfaceC0159w2.getLifecycle()).f4031c;
        }
    }

    @Override // androidx.lifecycle.B
    public final void c() {
        this.f3975e.getLifecycle().b(this);
    }

    @Override // androidx.lifecycle.B
    public final boolean d(InterfaceC0159w interfaceC0159w) {
        return this.f3975e == interfaceC0159w;
    }

    @Override // androidx.lifecycle.B
    public final boolean e() {
        return ((C0161y) this.f3975e.getLifecycle()).f4031c.a(EnumC0154q.f4023g);
    }
}
