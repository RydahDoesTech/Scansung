package k;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CheckedTextView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import z.AbstractC0938a;

/* renamed from: k.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0605a1 extends TextView implements Checkable {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f7636q = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public boolean f7637d;

    /* renamed from: e, reason: collision with root package name */
    public int f7638e;
    public Drawable f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f7639g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f7640h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7641i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7642j;

    /* renamed from: k, reason: collision with root package name */
    public int f7643k;

    /* renamed from: l, reason: collision with root package name */
    public int f7644l;

    /* renamed from: m, reason: collision with root package name */
    public int f7645m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public int f7646o;

    /* renamed from: p, reason: collision with root package name */
    public int f7647p;

    private void setBasePadding(boolean z4) {
        if (z4) {
            this.f7643k = getPaddingLeft();
        } else {
            this.f7643k = getPaddingRight();
        }
    }

    public final void a() {
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.f7641i || this.f7642j) {
                Drawable drawableMutate = drawable.mutate();
                this.f = drawableMutate;
                if (this.f7641i) {
                    drawableMutate.setTintList(this.f7639g);
                }
                if (this.f7642j) {
                    this.f.setTintMode(this.f7640h);
                }
                if (this.f.isStateful()) {
                    this.f.setState(getDrawableState());
                }
            }
        }
    }

    public final boolean b() {
        WeakHashMap weakHashMap = J.P.f1421a;
        return (Gravity.getAbsoluteGravity(this.f7645m, getLayoutDirection()) & 7) == 3;
    }

    public final void c(Drawable drawable, int i5) throws NoSuchMethodException, SecurityException {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f);
        }
        this.n = drawable != this.f;
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setVisible(getVisibility() == 0, false);
            drawable.setState(f7636q);
            setMinHeight(drawable.getIntrinsicHeight());
            this.f7644l = drawable.getIntrinsicWidth();
            drawable.setState(getDrawableState());
        } else {
            this.f7644l = 0;
        }
        this.f = drawable;
        this.f7638e = i5;
        a();
        Method methodR = J2.b.r(View.class, "hidden_resolvePadding", new Class[0]);
        if (methodR != null) {
            J2.b.E(this, methodR, new Object[0]);
        }
        setBasePadding(b());
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f5) {
        super.drawableHotspotChanged(f, f5);
        Drawable drawable = this.f;
        if (drawable != null) {
            C.a.e(drawable, f, f5);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() throws NoSuchFieldException, SecurityException {
        super.drawableStateChanged();
        Drawable drawable = this.f;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return CheckedTextView.class.getName();
    }

    public Drawable getCheckMarkDrawable() {
        return this.f;
    }

    public ColorStateList getCheckMarkTintList() {
        return this.f7639g;
    }

    public PorterDuff.Mode getCheckMarkTintMode() {
        return this.f7640h;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invalidateDrawable(android.graphics.drawable.Drawable r4) throws java.lang.NoSuchFieldException, java.lang.SecurityException {
        /*
            r3 = this;
            super.invalidateDrawable(r4)
            boolean r0 = r3.verifyDrawable(r4)
            if (r0 == 0) goto L3a
            android.graphics.Rect r4 = r4.getBounds()
            boolean r0 = k.M1.a(r3)
            if (r0 == 0) goto L3a
            java.lang.Class<android.widget.TextView> r0 = android.widget.TextView.class
            java.lang.String r1 = "mSingleLine"
            java.lang.reflect.Field r0 = J2.b.q(r0, r1)
            if (r0 == 0) goto L2c
            java.lang.Object r0 = J2.b.n(r3, r0)
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L2c
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L2d
        L2c:
            r0 = 0
        L2d:
            if (r0 == 0) goto L3a
            int r0 = r4.left
            int r1 = r4.top
            int r2 = r4.right
            int r4 = r4.bottom
            r3.invalidate(r0, r1, r2, r4)
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.AbstractC0605a1.invalidateDrawable(android.graphics.drawable.Drawable):void");
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f7637d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i5) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i5 + 1);
        if (this.f7637d) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7636q);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i5;
        int i6;
        super.onDraw(canvas);
        Drawable drawable = this.f;
        if (drawable != null) {
            int gravity = getGravity() & 112;
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int height = gravity != 16 ? gravity != 80 ? 0 : getHeight() - intrinsicHeight : (getHeight() - intrinsicHeight) / 2;
            boolean zB = b();
            int width = getWidth();
            int i7 = intrinsicHeight + height;
            if (zB) {
                i6 = this.f7643k;
                i5 = this.f7644l + i6;
            } else {
                i5 = width - this.f7643k;
                i6 = i5 - this.f7644l;
            }
            int scrollX = getScrollX();
            if (M1.a(this)) {
                drawable.setBounds(scrollX + i6, height, scrollX + i5, i7);
            } else {
                drawable.setBounds(i6, height, i5, i7);
            }
            drawable.draw(canvas);
            Drawable background = getBackground();
            if (background != null) {
                C.a.f(background, i6 + scrollX, height, scrollX + i5, i7);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setChecked(this.f7637d);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f7637d);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Z0 z02 = (Z0) parcelable;
        super.onRestoreInstanceState(z02.getSuperState());
        setChecked(z02.f7627d);
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onRtlPropertiesChanged(int r8) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            r7 = this;
            super.onRtlPropertiesChanged(r8)
            r8 = 0
            java.lang.Class[] r0 = new java.lang.Class[r8]
            java.lang.String r1 = "resetPaddingToInitialValues"
            java.lang.Class<android.view.View> r2 = android.view.View.class
            java.lang.reflect.Method r0 = J2.b.r(r2, r1, r0)
            if (r0 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r8]
            J2.b.E(r7, r0, r1)
        L15:
            android.graphics.drawable.Drawable r0 = r7.f
            if (r0 == 0) goto L25
            int r0 = r7.f7644l
            int r1 = r7.f7643k
            int r0 = r0 + r1
            int r1 = r7.f7647p
            int r0 = r0 + r1
            int r1 = r7.f7646o
            int r0 = r0 + r1
            goto L27
        L25:
            int r0 = r7.f7643k
        L27:
            boolean r1 = r7.b()
            r3 = 1
            if (r1 == 0) goto L5d
            boolean r1 = r7.n
            java.lang.String r4 = "mPaddingLeft"
            java.lang.reflect.Field r5 = J2.b.q(r2, r4)
            if (r5 == 0) goto L47
            java.lang.Object r5 = J2.b.n(r7, r5)
            boolean r6 = r5 instanceof java.lang.Integer
            if (r6 == 0) goto L47
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L48
        L47:
            r5 = r8
        L48:
            if (r5 == r0) goto L4b
            goto L4c
        L4b:
            r3 = r8
        L4c:
            r1 = r1 | r3
            r7.n = r1
            java.lang.reflect.Field r1 = J2.b.q(r2, r4)
            if (r1 == 0) goto L8b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            J2.b.X(r7, r1, r0)
            goto L8b
        L5d:
            boolean r1 = r7.n
            java.lang.String r4 = "mPaddingRight"
            java.lang.reflect.Field r5 = J2.b.q(r2, r4)
            if (r5 == 0) goto L76
            java.lang.Object r5 = J2.b.n(r7, r5)
            boolean r6 = r5 instanceof java.lang.Integer
            if (r6 == 0) goto L76
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L77
        L76:
            r5 = r8
        L77:
            if (r5 == r0) goto L7a
            goto L7b
        L7a:
            r3 = r8
        L7b:
            r1 = r1 | r3
            r7.n = r1
            java.lang.reflect.Field r1 = J2.b.q(r2, r4)
            if (r1 == 0) goto L8b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            J2.b.X(r7, r1, r0)
        L8b:
            boolean r0 = r7.n
            if (r0 == 0) goto L94
            r7.requestLayout()
            r7.n = r8
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.AbstractC0605a1.onRtlPropertiesChanged(int):void");
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Z0 z02 = new Z0(super.onSaveInstanceState());
        z02.f7627d = this.f7637d;
        return z02;
    }

    public void setCheckMarkDrawable(int i5) throws NoSuchMethodException, SecurityException {
        if (i5 == 0 || i5 != this.f7638e) {
            c(i5 != 0 ? AbstractC0938a.b(getContext(), i5) : null, i5);
        }
    }

    public void setCheckMarkTintList(ColorStateList colorStateList) {
        this.f7639g = colorStateList;
        this.f7641i = true;
        a();
    }

    public void setCheckMarkTintMode(PorterDuff.Mode mode) {
        this.f7640h = mode;
        this.f7642j = true;
        a();
    }

    public void setChecked(boolean z4) {
        if (this.f7637d != z4) {
            this.f7637d = z4;
            refreshDrawableState();
            Method methodZ = J2.b.z(View.class, "hidden_notifyViewAccessibilityStateChangedIfNeeded", Integer.TYPE);
            if (methodZ != null) {
                J2.b.E(this, methodZ, 0);
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setVisible(i5 == 0, false);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f7637d);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f || super.verifyDrawable(drawable);
    }

    public void setCheckMarkDrawable(Drawable drawable) throws NoSuchMethodException, SecurityException {
        c(drawable, 0);
    }
}
