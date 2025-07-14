package I1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import k.AbstractC0649q0;

/* loaded from: classes.dex */
public abstract class e extends AbstractC0649q0 {

    /* renamed from: s, reason: collision with root package name */
    public Drawable f926s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f927t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f928u;

    /* renamed from: v, reason: collision with root package name */
    public int f929v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f930w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f931x;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f927t = new Rect();
        this.f928u = new Rect();
        this.f929v = 119;
        this.f930w = true;
        this.f931x = false;
        int[] iArr = u1.a.f9166j;
        m.a(context, attributeSet, 0, 0);
        m.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f929v = typedArrayObtainStyledAttributes.getInt(1, this.f929v);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f930w = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f926s;
        if (drawable != null) {
            if (this.f931x) {
                this.f931x = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z4 = this.f930w;
                Rect rect = this.f927t;
                if (z4) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i5 = this.f929v;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f928u;
                Gravity.apply(i5, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f5) {
        super.drawableHotspotChanged(f, f5);
        Drawable drawable = this.f926s;
        if (drawable != null) {
            drawable.setHotspot(f, f5);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f926s;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f926s.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f926s;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f929v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f926s;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // k.AbstractC0649q0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        super.onLayout(z4, i5, i6, i7, i8);
        this.f931x = z4 | this.f931x;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        this.f931x = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f926s;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f926s);
            }
            this.f926s = drawable;
            this.f931x = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f929v == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i5) {
        if (this.f929v != i5) {
            if ((8388615 & i5) == 0) {
                i5 |= 8388611;
            }
            if ((i5 & 112) == 0) {
                i5 |= 48;
            }
            this.f929v = i5;
            if (i5 == 119 && this.f926s != null) {
                this.f926s.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f926s;
    }
}
