package k;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: k.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0609c implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f7655e;

    public /* synthetic */ RunnableC0609c(ActionBarOverlayLayout actionBarOverlayLayout, int i5) {
        this.f7654d = i5;
        this.f7655e = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7654d) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f7655e;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f3281z = actionBarOverlayLayout.f3263g.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f3257A);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f7655e;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f3281z = actionBarOverlayLayout2.f3263g.animate().translationY(-actionBarOverlayLayout2.f3263g.getHeight()).setListener(actionBarOverlayLayout2.f3257A);
                break;
        }
    }
}
