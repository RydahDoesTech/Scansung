package k;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class R0 extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final View f7539a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f7540b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f7541c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f7542d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7543e;
    public boolean f;

    public R0(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f7543e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f7540b = rect3;
        Rect rect4 = new Rect();
        this.f7542d = rect4;
        Rect rect5 = new Rect();
        this.f7541c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i5 = -scaledTouchSlop;
        rect4.inset(i5, i5);
        rect5.set(rect2);
        this.f7539a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z5;
        int x4 = (int) motionEvent.getX();
        int y4 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z6 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z5 = this.f;
                if (z5 && !this.f7542d.contains(x4, y4)) {
                    z6 = z5;
                    z4 = false;
                }
            } else {
                if (action == 3) {
                    z5 = this.f;
                    this.f = false;
                }
                z4 = true;
                z6 = false;
            }
            z6 = z5;
            z4 = true;
        } else if (this.f7540b.contains(x4, y4)) {
            this.f = true;
            z4 = true;
        } else {
            z4 = true;
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        Rect rect = this.f7541c;
        View view = this.f7539a;
        if (!z4 || rect.contains(x4, y4)) {
            motionEvent.setLocation(x4 - rect.left, y4 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
