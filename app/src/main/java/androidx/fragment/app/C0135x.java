package androidx.fragment.app;

import android.view.View;

/* renamed from: androidx.fragment.app.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0135x extends K {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Fragment f3936d;

    public C0135x(Fragment fragment) {
        this.f3936d = fragment;
    }

    @Override // androidx.fragment.app.K
    public final View b(int i5) {
        Fragment fragment = this.f3936d;
        View view = fragment.mView;
        if (view != null) {
            return view.findViewById(i5);
        }
        throw new IllegalStateException("Fragment " + fragment + " does not have a view");
    }

    @Override // androidx.fragment.app.K
    public final boolean c() {
        return this.f3936d.mView != null;
    }
}
