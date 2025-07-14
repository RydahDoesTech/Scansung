package k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: k.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0643n0 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0645o0 f7751e;

    public /* synthetic */ RunnableC0643n0(AbstractViewOnTouchListenerC0645o0 abstractViewOnTouchListenerC0645o0, int i5) {
        this.f7750d = i5;
        this.f7751e = abstractViewOnTouchListenerC0645o0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7750d) {
            case 0:
                ViewParent parent = this.f7751e.f7758g.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC0645o0 abstractViewOnTouchListenerC0645o0 = this.f7751e;
                abstractViewOnTouchListenerC0645o0.a();
                View view = abstractViewOnTouchListenerC0645o0.f7758g;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0645o0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC0645o0.f7761j = true;
                    break;
                }
                break;
        }
    }
}
