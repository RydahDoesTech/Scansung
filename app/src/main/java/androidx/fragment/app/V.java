package androidx.fragment.app;

/* loaded from: classes.dex */
public final class V implements e0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Fragment f3744d;

    public V(Fragment fragment) {
        this.f3744d = fragment;
    }

    @Override // androidx.fragment.app.e0
    public final void a(Fragment fragment) {
        this.f3744d.onAttachFragment(fragment);
    }
}
