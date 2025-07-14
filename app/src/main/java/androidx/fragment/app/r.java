package androidx.fragment.app;

import android.view.View;

/* loaded from: classes.dex */
public final class r extends K {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ K f3909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0130s f3910e;

    public r(DialogInterfaceOnCancelListenerC0130s dialogInterfaceOnCancelListenerC0130s, K k5) {
        this.f3910e = dialogInterfaceOnCancelListenerC0130s;
        this.f3909d = k5;
    }

    @Override // androidx.fragment.app.K
    public final View b(int i5) {
        K k5 = this.f3909d;
        return k5.c() ? k5.b(i5) : this.f3910e.onFindViewById(i5);
    }

    @Override // androidx.fragment.app.K
    public final boolean c() {
        return this.f3909d.c() || this.f3910e.onHasView();
    }
}
