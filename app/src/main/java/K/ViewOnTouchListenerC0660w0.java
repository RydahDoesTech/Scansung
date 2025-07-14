package k;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: k.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0660w0 implements View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0662x0 f7830d;

    public ViewOnTouchListenerC0660w0(C0662x0 c0662x0) {
        this.f7830d = c0662x0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0665z c0665z;
        int action = motionEvent.getAction();
        int x4 = (int) motionEvent.getX();
        int y4 = (int) motionEvent.getY();
        C0662x0 c0662x0 = this.f7830d;
        if (action == 0 && (c0665z = c0662x0.f7836A) != null && c0665z.isShowing() && x4 >= 0 && x4 < c0662x0.f7836A.getWidth() && y4 >= 0 && y4 < c0662x0.f7836A.getHeight()) {
            c0662x0.f7855w.postDelayed(c0662x0.f7851s, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        c0662x0.f7855w.removeCallbacks(c0662x0.f7851s);
        return false;
    }
}
