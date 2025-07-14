package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f6077d;

    public b(ClockFaceView clockFaceView) {
        this.f6077d = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f6077d;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f6060x.f6065g) - clockFaceView.f6053F;
        if (height != clockFaceView.f6080v) {
            clockFaceView.f6080v = height;
            clockFaceView.g();
            int i5 = clockFaceView.f6080v;
            ClockHandView clockHandView = clockFaceView.f6060x;
            clockHandView.f6072o = i5;
            clockHandView.invalidate();
        }
        return true;
    }
}
