package w1;

import android.os.CancellationSignal;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import com.google.android.material.appbar.SeslImmersiveScrollBehavior;

/* renamed from: w1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class WindowInsetsAnimationControlListenerC0902a implements WindowInsetsAnimationControlListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SeslImmersiveScrollBehavior f9295a;

    public WindowInsetsAnimationControlListenerC0902a(SeslImmersiveScrollBehavior seslImmersiveScrollBehavior) {
        this.f9295a = seslImmersiveScrollBehavior;
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public final void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
        SeslImmersiveScrollBehavior seslImmersiveScrollBehavior = this.f9295a;
        WindowInsetsAnimationController windowInsetsAnimationController2 = seslImmersiveScrollBehavior.f5717j;
        if (windowInsetsAnimationController2 != null) {
            windowInsetsAnimationController2.finish(seslImmersiveScrollBehavior.f5718k);
        }
        CancellationSignal cancellationSignal = seslImmersiveScrollBehavior.f5716i;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        seslImmersiveScrollBehavior.f5717j = null;
        seslImmersiveScrollBehavior.f5716i = null;
        seslImmersiveScrollBehavior.f5718k = false;
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public final void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
        SeslImmersiveScrollBehavior seslImmersiveScrollBehavior = this.f9295a;
        seslImmersiveScrollBehavior.f5717j = null;
        seslImmersiveScrollBehavior.f5716i = null;
        seslImmersiveScrollBehavior.f5718k = false;
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public final void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i5) {
        this.f9295a.getClass();
    }
}
