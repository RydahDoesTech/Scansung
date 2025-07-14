package androidx.lifecycle;

import b3.AbstractC0219i;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/u;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC0157u {

    /* renamed from: a, reason: collision with root package name */
    public final String f3993a;

    /* renamed from: b, reason: collision with root package name */
    public final O f3994b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3995c;

    public SavedStateHandleController(String str, O o5) {
        this.f3993a = str;
        this.f3994b = o5;
    }

    @Override // androidx.lifecycle.InterfaceC0157u
    public final void a(InterfaceC0159w interfaceC0159w, EnumC0153p enumC0153p) {
        if (enumC0153p == EnumC0153p.ON_DESTROY) {
            this.f3995c = false;
            interfaceC0159w.getLifecycle().b(this);
        }
    }

    public final void b(r rVar, w0.d dVar) {
        AbstractC0219i.e("registry", dVar);
        AbstractC0219i.e("lifecycle", rVar);
        if (this.f3995c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f3995c = true;
        rVar.a(this);
        dVar.c(this.f3993a, this.f3994b.f3981e);
    }
}
