package androidx.lifecycle;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/u;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC0157u {

    /* renamed from: a, reason: collision with root package name */
    public final S f3992a;

    public SavedStateHandleAttacher(S s2) {
        this.f3992a = s2;
    }

    @Override // androidx.lifecycle.InterfaceC0157u
    public final void a(InterfaceC0159w interfaceC0159w, EnumC0153p enumC0153p) {
        if (enumC0153p == EnumC0153p.ON_CREATE) {
            interfaceC0159w.getLifecycle().b(this);
            this.f3992a.b();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0153p).toString());
        }
    }
}
