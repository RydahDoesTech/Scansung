package androidx.fragment.app;

import b.AbstractC0195a;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.fragment.app.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0137z extends B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0136y f3940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f3941b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0195a f3942c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.result.b f3943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Fragment f3944e;

    public C0137z(Fragment fragment, C0136y c0136y, AtomicReference atomicReference, AbstractC0195a abstractC0195a, androidx.activity.result.b bVar) {
        this.f3944e = fragment;
        this.f3940a = c0136y;
        this.f3941b = atomicReference;
        this.f3942c = abstractC0195a;
        this.f3943d = bVar;
    }

    @Override // androidx.fragment.app.B
    public final void a() {
        androidx.activity.result.h activityResultRegistry;
        Fragment fragment = this.f3944e;
        String strGenerateActivityResultKey = fragment.generateActivityResultKey();
        C0136y c0136y = this.f3940a;
        switch (c0136y.f3938a) {
            case 0:
                Fragment fragment2 = (Fragment) c0136y.f3939b;
                Object obj = fragment2.mHost;
                if (!(obj instanceof androidx.activity.result.i)) {
                    activityResultRegistry = fragment2.requireActivity().getActivityResultRegistry();
                    break;
                } else {
                    activityResultRegistry = ((androidx.activity.result.i) obj).getActivityResultRegistry();
                    break;
                }
            default:
                activityResultRegistry = (androidx.activity.result.h) c0136y.f3939b;
                break;
        }
        this.f3941b.set(activityResultRegistry.c(strGenerateActivityResultKey, fragment, this.f3942c, this.f3943d));
    }
}
