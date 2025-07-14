package I1;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class d extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public int f924d;

    /* renamed from: e, reason: collision with root package name */
    public int f925e;
    public boolean f;

    public int getItemSpacing() {
        return this.f925e;
    }

    public int getLineSpacing() {
        return this.f924d;
    }

    public int getRowCount() {
        return 0;
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i5);
        int mode = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i6);
        int mode2 = View.MeasureSpec.getMode(i6);
        int i10 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i10 - getPaddingRight();
        int i11 = paddingTop;
        int i12 = 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i5, i6);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i9 = marginLayoutParams.leftMargin;
                    i8 = marginLayoutParams.rightMargin;
                } else {
                    i8 = 0;
                    i9 = 0;
                }
                int i14 = paddingLeft2;
                if (childAt.getMeasuredWidth() + paddingLeft2 + i9 <= paddingRight || ((E1.k) this).f) {
                    paddingLeft = i14;
                } else {
                    paddingLeft = getPaddingLeft();
                    i11 = this.f924d + paddingTop;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i9;
                int measuredHeight = childAt.getMeasuredHeight() + i11;
                if (measuredWidth > i12) {
                    i12 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i9 + i8 + this.f925e + paddingLeft;
                if (i13 == getChildCount() - 1) {
                    i12 += i8;
                }
                paddingLeft2 = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i12;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i7 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i7 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i7) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i5) {
        this.f925e = i5;
    }

    public void setLineSpacing(int i5) {
        this.f924d = i5;
    }

    public void setSingleLine(boolean z4) {
        this.f = z4;
    }
}
