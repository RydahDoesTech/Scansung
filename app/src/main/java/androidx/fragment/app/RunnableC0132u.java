package androidx.fragment.app;

import java.util.ArrayList;

/* renamed from: androidx.fragment.app.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0132u implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3922e;

    public /* synthetic */ RunnableC0132u(int i5, Object obj) {
        this.f3921d = i5;
        this.f3922e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3921d) {
            case 0:
                Fragment fragment = (Fragment) this.f3922e;
                t0 t0Var = fragment.mViewLifecycleOwner;
                t0Var.f3920h.b(fragment.mSavedViewRegistryState);
                fragment.mSavedViewRegistryState = null;
                break;
            default:
                l0.a((ArrayList) this.f3922e, 4);
                break;
        }
    }
}
