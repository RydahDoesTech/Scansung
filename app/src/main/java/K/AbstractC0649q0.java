package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import c.AbstractC0220a;
import java.util.WeakHashMap;

/* renamed from: k.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0649q0 extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public boolean f7770d;

    /* renamed from: e, reason: collision with root package name */
    public int f7771e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f7772g;

    /* renamed from: h, reason: collision with root package name */
    public int f7773h;

    /* renamed from: i, reason: collision with root package name */
    public int f7774i;

    /* renamed from: j, reason: collision with root package name */
    public float f7775j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7776k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f7777l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f7778m;
    public Drawable n;

    /* renamed from: o, reason: collision with root package name */
    public int f7779o;

    /* renamed from: p, reason: collision with root package name */
    public int f7780p;

    /* renamed from: q, reason: collision with root package name */
    public int f7781q;

    /* renamed from: r, reason: collision with root package name */
    public int f7782r;

    public AbstractC0649q0(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f7770d = true;
        this.f7771e = -1;
        this.f = 0;
        this.f7773h = 8388659;
        int[] iArr = AbstractC0220a.n;
        D3.c cVarL = D3.c.l(context, attributeSet, iArr, i5);
        WeakHashMap weakHashMap = J.P.f1421a;
        J.M.d(this, context, iArr, attributeSet, (TypedArray) cVarL.f, i5, 0);
        TypedArray typedArray = (TypedArray) cVarL.f;
        int i6 = typedArray.getInt(1, -1);
        if (i6 >= 0) {
            setOrientation(i6);
        }
        int i7 = typedArray.getInt(0, -1);
        if (i7 >= 0) {
            setGravity(i7);
        }
        boolean z4 = typedArray.getBoolean(2, true);
        if (!z4) {
            setBaselineAligned(z4);
        }
        this.f7775j = typedArray.getFloat(4, -1.0f);
        this.f7771e = typedArray.getInt(3, -1);
        this.f7776k = typedArray.getBoolean(7, false);
        setDividerDrawable(cVarL.g(5));
        this.f7781q = typedArray.getInt(8, 0);
        this.f7782r = typedArray.getDimensionPixelSize(6, 0);
        cVarL.m();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0647p0;
    }

    public final void f(Canvas canvas, int i5) {
        this.n.setBounds(getPaddingLeft() + this.f7782r, i5, (getWidth() - getPaddingRight()) - this.f7782r, this.f7780p + i5);
        this.n.draw(canvas);
    }

    public final void g(Canvas canvas, int i5) {
        this.n.setBounds(i5, getPaddingTop() + this.f7782r, this.f7779o + i5, (getHeight() - getPaddingBottom()) - this.f7782r);
        this.n.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i5;
        if (this.f7771e < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i6 = this.f7771e;
        if (childCount <= i6) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i6);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f7771e == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f;
        if (this.f7772g == 1 && (i5 = this.f7773h & 112) != 48) {
            if (i5 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f7774i) / 2;
            } else if (i5 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f7774i;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C0647p0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f7771e;
    }

    public Drawable getDividerDrawable() {
        return this.n;
    }

    public int getDividerPadding() {
        return this.f7782r;
    }

    public int getDividerWidth() {
        return this.f7779o;
    }

    public int getGravity() {
        return this.f7773h;
    }

    public int getOrientation() {
        return this.f7772g;
    }

    public int getShowDividers() {
        return this.f7781q;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f7775j;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0647p0 generateDefaultLayoutParams() {
        int i5 = this.f7772g;
        if (i5 == 0) {
            return new C0647p0(-2, -2);
        }
        if (i5 == 1) {
            return new C0647p0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0647p0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0647p0(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C0647p0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0647p0(layoutParams);
    }

    public final boolean k(int i5) {
        if (i5 == 0) {
            return (this.f7781q & 1) != 0;
        }
        if (i5 == getChildCount()) {
            return (this.f7781q & 4) != 0;
        }
        if ((this.f7781q & 2) == 0) {
            return false;
        }
        for (int i6 = i5 - 1; i6 >= 0; i6--) {
            if (getChildAt(i6).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i5;
        if (this.n == null) {
            return;
        }
        int i6 = 0;
        if (this.f7772g == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i6 < virtualChildCount) {
                View childAt = getChildAt(i6);
                if (childAt != null && childAt.getVisibility() != 8 && k(i6)) {
                    f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C0647p0) childAt.getLayoutParams())).topMargin) - this.f7780p);
                }
                i6++;
            }
            if (k(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                f(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f7780p : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0647p0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zA = M1.a(this);
        while (i6 < virtualChildCount2) {
            View childAt3 = getChildAt(i6);
            if (childAt3 != null && childAt3.getVisibility() != 8 && k(i6)) {
                C0647p0 c0647p0 = (C0647p0) childAt3.getLayoutParams();
                g(canvas, zA ? childAt3.getRight() + ((LinearLayout.LayoutParams) c0647p0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0647p0).leftMargin) - this.f7779o);
            }
            i6++;
        }
        if (k(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0647p0 c0647p02 = (C0647p0) childAt4.getLayoutParams();
                if (zA) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c0647p02).leftMargin;
                    i5 = this.f7779o;
                    right = left - i5;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c0647p02).rightMargin;
                }
            } else if (zA) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i5 = this.f7779o;
                right = left - i5;
            }
            g(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.AbstractC0649q0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:442:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 2208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.AbstractC0649q0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z4) {
        this.f7770d = z4;
    }

    public void setBaselineAlignedChildIndex(int i5) {
        if (i5 >= 0 && i5 < getChildCount()) {
            this.f7771e = i5;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.n) {
            return;
        }
        this.n = drawable;
        if (drawable != null) {
            this.f7779o = drawable.getIntrinsicWidth();
            this.f7780p = drawable.getIntrinsicHeight();
        } else {
            this.f7779o = 0;
            this.f7780p = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i5) {
        this.f7782r = i5;
    }

    public void setGravity(int i5) {
        if (this.f7773h != i5) {
            if ((8388615 & i5) == 0) {
                i5 |= 8388611;
            }
            if ((i5 & 112) == 0) {
                i5 |= 48;
            }
            this.f7773h = i5;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i5) {
        int i6 = i5 & 8388615;
        int i7 = this.f7773h;
        if ((8388615 & i7) != i6) {
            this.f7773h = i6 | ((-8388616) & i7);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z4) {
        this.f7776k = z4;
    }

    public void setOrientation(int i5) {
        if (this.f7772g != i5) {
            this.f7772g = i5;
            requestLayout();
        }
    }

    public void setShowDividers(int i5) {
        if (i5 != this.f7781q) {
            requestLayout();
        }
        this.f7781q = i5;
    }

    public void setVerticalGravity(int i5) {
        int i6 = i5 & 112;
        int i7 = this.f7773h;
        if ((i7 & 112) != i6) {
            this.f7773h = i6 | (i7 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f7775j = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
