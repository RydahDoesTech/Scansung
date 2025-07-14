package e;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class z extends ContentFrameLayout {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ B f6629m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(B b2, i.e eVar) {
        super(eVar, null);
        this.f6629m = b2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f6629m.v(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x4 = (int) motionEvent.getX();
            int y4 = (int) motionEvent.getY();
            if (x4 < -5 || y4 < -5 || x4 > getWidth() + 5 || y4 > getHeight() + 5) {
                B b2 = this.f6629m;
                b2.t(b2.A(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i5) {
        setBackgroundDrawable(AbstractC0415a.r(getContext(), i5));
    }
}
