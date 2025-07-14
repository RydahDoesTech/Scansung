package androidx.fragment.app;

import android.os.Bundle;

/* renamed from: androidx.fragment.app.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134w extends B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f3934a;

    public C0134w(Fragment fragment) {
        this.f3934a = fragment;
    }

    @Override // androidx.fragment.app.B
    public final void a() {
        Fragment fragment = this.f3934a;
        fragment.mSavedStateRegistryController.a();
        androidx.lifecycle.Q.d(fragment);
        Bundle bundle = fragment.mSavedFragmentState;
        fragment.mSavedStateRegistryController.b(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
