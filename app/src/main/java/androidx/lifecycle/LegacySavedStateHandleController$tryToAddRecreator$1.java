package androidx.lifecycle;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/LegacySavedStateHandleController$tryToAddRecreator$1", "Landroidx/lifecycle/u;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements InterfaceC0157u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f3973a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0.d f3974b;

    public LegacySavedStateHandleController$tryToAddRecreator$1(r rVar, w0.d dVar) {
        this.f3973a = rVar;
        this.f3974b = dVar;
    }

    @Override // androidx.lifecycle.InterfaceC0157u
    public final void a(InterfaceC0159w interfaceC0159w, EnumC0153p enumC0153p) throws NoSuchMethodException, SecurityException {
        if (enumC0153p == EnumC0153p.ON_START) {
            this.f3973a.b(this);
            this.f3974b.d();
        }
    }
}
