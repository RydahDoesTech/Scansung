package com.google.android.material.timepicker;

import J.C0045b;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public final class c extends C0045b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f6078d;

    public c(ClockFaceView clockFaceView) {
        this.f6078d = clockFaceView;
    }

    @Override // J.C0045b
    public final void d(View view, K.h hVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f1437a;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f1615a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f6078d.f6050B.get(iIntValue - 1));
        }
        hVar.h(K.g.a(view.isSelected(), 0, 1, iIntValue, 1));
        accessibilityNodeInfo.setClickable(true);
        hVar.b(K.c.f1603e);
    }

    @Override // J.C0045b
    public final boolean g(View view, int i5, Bundle bundle) {
        if (i5 != 16) {
            return super.g(view, i5, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f6078d;
        view.getHitRect(clockFaceView.f6061y);
        float fCenterX = clockFaceView.f6061y.centerX();
        float fCenterY = clockFaceView.f6061y.centerY();
        clockFaceView.f6060x.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f6060x.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
