package k;

import android.view.animation.Animation;
import androidx.appcompat.widget.SwitchCompat;

/* loaded from: classes.dex */
public final class t1 implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f7815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwitchCompat f7816b;

    public t1(SwitchCompat switchCompat, boolean z4) {
        this.f7816b = switchCompat;
        this.f7815a = z4;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        SwitchCompat switchCompat = this.f7816b;
        if (switchCompat.f3441O == animation) {
            switchCompat.setThumbPosition(this.f7815a ? 1.0f : 0.0f);
            switchCompat.f3441O = null;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
