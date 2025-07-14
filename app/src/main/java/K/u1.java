package k;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.appcompat.widget.SwitchCompat;

/* loaded from: classes.dex */
public final class u1 extends Animation {

    /* renamed from: d, reason: collision with root package name */
    public final float f7822d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7823e;
    public final /* synthetic */ SwitchCompat f;

    public u1(SwitchCompat switchCompat, float f, float f5) {
        this.f = switchCompat;
        this.f7822d = f;
        this.f7823e = f5 - f;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.f.setThumbPosition((this.f7823e * f) + this.f7822d);
    }
}
