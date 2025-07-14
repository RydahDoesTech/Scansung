package androidx.fragment.app;

/* renamed from: androidx.fragment.app.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0133v implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Fragment f3926e;

    public /* synthetic */ RunnableC0133v(Fragment fragment, int i5) {
        this.f3925d = i5;
        this.f3926e = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3925d) {
            case 0:
                this.f3926e.startPostponedEnterTransition();
                break;
            default:
                this.f3926e.callStartTransitionListener(false);
                break;
        }
    }
}
