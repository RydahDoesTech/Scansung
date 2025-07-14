package androidx.picker.widget;

import android.animation.ObjectAnimator;
import android.view.View;

/* renamed from: androidx.picker.widget.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0167e implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SeslDatePicker f4469d;

    public ViewOnClickListenerC0167e(SeslDatePicker seslDatePicker) {
        this.f4469d = seslDatePicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SeslDatePicker seslDatePicker = this.f4469d;
        seslDatePicker.setCurrentViewType((seslDatePicker.f4386u + 1) % 2);
        int i5 = seslDatePicker.f4386u;
        ObjectAnimator objectAnimator = seslDatePicker.m0;
        ObjectAnimator objectAnimator2 = seslDatePicker.n0;
        if (i5 == 0) {
            if (objectAnimator2.isRunning()) {
                objectAnimator2.cancel();
            }
            objectAnimator.start();
        } else {
            if (objectAnimator.isRunning()) {
                objectAnimator.cancel();
            }
            objectAnimator2.start();
        }
    }
}
