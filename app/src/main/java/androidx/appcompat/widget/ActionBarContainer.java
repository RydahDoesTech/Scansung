package androidx.appcompat.widget;

import J.P;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import c.AbstractC0220a;
import com.samsung.android.knox.net.nap.NetworkAnalyticsConstants;
import com.wssyncmldm.R;
import java.util.WeakHashMap;
import k.C0603a;
import k.G0;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f3229d;

    /* renamed from: e, reason: collision with root package name */
    public View f3230e;
    public View f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f3231g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f3232h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f3233i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3234j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3235k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3236l;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0603a c0603a = new C0603a(this);
        WeakHashMap weakHashMap = P.f1421a;
        setBackground(c0603a);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0220a.f5112a);
        boolean z4 = false;
        this.f3231g = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f3232h = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f3236l = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f3234j = true;
            this.f3233i = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f3234j ? !(this.f3231g != null || this.f3232h != null) : this.f3233i == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3231g;
        if (drawable != null && drawable.isStateful()) {
            this.f3231g.setState(getDrawableState());
        }
        Drawable drawable2 = this.f3232h;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f3232h.setState(getDrawableState());
        }
        Drawable drawable3 = this.f3233i;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f3233i.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3231g;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3232h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f3233i;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3230e = findViewById(R.id.action_bar);
        this.f = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f3229d || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        super.onLayout(z4, i5, i6, i7, i8);
        boolean z5 = true;
        if (this.f3234j) {
            Drawable drawable = this.f3233i;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z5 = false;
            }
        } else {
            if (this.f3231g == null) {
                z5 = false;
            } else if (this.f3230e.getVisibility() == 0) {
                this.f3231g.setBounds(this.f3230e.getLeft(), this.f3230e.getTop(), this.f3230e.getRight(), getPaddingBottom() + this.f3230e.getBottom());
            } else {
                View view = this.f;
                if (view == null || view.getVisibility() != 0) {
                    this.f3231g.setBounds(0, 0, 0, 0);
                } else {
                    this.f3231g.setBounds(this.f.getLeft(), this.f.getTop(), this.f.getRight(), getPaddingBottom() + this.f.getBottom());
                }
            }
            this.f3235k = false;
        }
        if (z5) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i5, int i6) {
        int i7;
        if (this.f3230e == null && View.MeasureSpec.getMode(i6) == Integer.MIN_VALUE && (i7 = this.f3236l) >= 0) {
            i6 = View.MeasureSpec.makeMeasureSpec(Math.min(i7, View.MeasureSpec.getSize(i6)), Integer.MIN_VALUE);
        }
        super.onMeasure(i5, i6);
        if (this.f3230e == null) {
            return;
        }
        View.MeasureSpec.getMode(i6);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f3231g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f3231g);
        }
        this.f3231g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f3230e;
            if (view != null) {
                this.f3231g.setBounds(view.getLeft(), this.f3230e.getTop(), this.f3230e.getRight(), this.f3230e.getBottom());
            }
        }
        boolean z4 = false;
        if (!this.f3234j ? !(this.f3231g != null || this.f3232h != null) : this.f3233i == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f3233i;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f3233i);
        }
        this.f3233i = drawable;
        boolean z4 = this.f3234j;
        boolean z5 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z4 && (drawable2 = this.f3233i) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getPaddingBottom() + getMeasuredHeight());
            }
        }
        if (!z4 ? !(this.f3231g != null || this.f3232h != null) : this.f3233i == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f3232h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f3232h);
        }
        this.f3232h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f3235k && this.f3232h != null) {
                throw null;
            }
        }
        boolean z4 = false;
        if (!this.f3234j ? !(this.f3231g != null || this.f3232h != null) : this.f3233i == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(G0 g0) {
    }

    public void setTransitioning(boolean z4) {
        this.f3229d = z4;
        setDescendantFocusability(z4 ? 393216 : NetworkAnalyticsConstants.DataPoints.FLAG_PARENT_PROCESS_HASH);
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        boolean z4 = i5 == 0;
        Drawable drawable = this.f3231g;
        if (drawable != null) {
            drawable.setVisible(z4, false);
        }
        Drawable drawable2 = this.f3232h;
        if (drawable2 != null) {
            drawable2.setVisible(z4, false);
        }
        Drawable drawable3 = this.f3233i;
        if (drawable3 != null) {
            drawable3.setVisible(z4, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3231g;
        boolean z4 = this.f3234j;
        return (drawable == drawable2 && !z4) || (drawable == this.f3232h && this.f3235k) || ((drawable == this.f3233i && z4) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i5) {
        if (i5 != 0) {
            return super.startActionModeForChild(view, callback, i5);
        }
        return null;
    }
}
