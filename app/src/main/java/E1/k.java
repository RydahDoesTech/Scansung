package E1;

import J.P;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.SeslChipGroup;
import com.wssyncmldm.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class k extends I1.d {

    /* renamed from: g, reason: collision with root package name */
    public int f591g;

    /* renamed from: h, reason: collision with root package name */
    public int f592h;

    /* renamed from: i, reason: collision with root package name */
    public i f593i;

    /* renamed from: j, reason: collision with root package name */
    public final F3.p f594j;

    /* renamed from: k, reason: collision with root package name */
    public final int f595k;

    /* renamed from: l, reason: collision with root package name */
    public final j f596l;

    /* JADX WARN: Illegal instructions before constructor call */
    public k(Context context, AttributeSet attributeSet) {
        Context contextA = T1.a.a(context, attributeSet, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup);
        super(contextA, attributeSet, R.attr.chipGroupStyle);
        this.f = false;
        TypedArray typedArrayObtainStyledAttributes = contextA.getTheme().obtainStyledAttributes(attributeSet, u1.a.f9165i, 0, 0);
        this.f924d = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f925e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        F3.p pVar = new F3.p();
        this.f594j = pVar;
        SeslChipGroup seslChipGroup = (SeslChipGroup) this;
        j jVar = new j(seslChipGroup);
        this.f596l = jVar;
        TypedArray typedArrayF = I1.m.f(getContext(), attributeSet, u1.a.f9161d, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayF.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayF.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayF.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayF.getBoolean(5, false));
        setSingleSelection(typedArrayF.getBoolean(6, false));
        setSelectionRequired(typedArrayF.getBoolean(4, false));
        this.f595k = typedArrayF.getResourceId(0, -1);
        typedArrayF.recycle();
        pVar.f669e = new B.g(4, seslChipGroup);
        super.setOnHierarchyChangeListener(jVar);
        WeakHashMap weakHashMap = P.f1421a;
        setImportantForAccessibility(1);
    }

    private int getVisibleChipCount() {
        int i5 = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            if ((getChildAt(i6) instanceof Chip) && getChildAt(i6).getVisibility() == 0) {
                i5++;
            }
        }
        return i5;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f594j.g();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f594j.d(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f591g;
    }

    public int getChipSpacingVertical() {
        return this.f592h;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i5 = this.f595k;
        if (i5 != -1) {
            F3.p pVar = this.f594j;
            I1.g gVar = (I1.g) ((HashMap) pVar.f667c).get(Integer.valueOf(i5));
            if (gVar != null && pVar.a(gVar)) {
                pVar.i();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(getRowCount(), this.f ? getVisibleChipCount() : -1, false, this.f594j.f665a ? 1 : 2));
    }

    public void setChipSpacing(int i5) {
        setChipSpacingHorizontal(i5);
        setChipSpacingVertical(i5);
    }

    public void setChipSpacingHorizontal(int i5) {
        if (this.f591g != i5) {
            this.f591g = i5;
            setItemSpacing(i5);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i5) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i5));
    }

    public void setChipSpacingResource(int i5) {
        setChipSpacing(getResources().getDimensionPixelOffset(i5));
    }

    public void setChipSpacingVertical(int i5) {
        if (this.f592h != i5) {
            this.f592h = i5;
            setLineSpacing(i5);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i5) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i5));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i5) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(h hVar) {
        if (hVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new B.g(5, this));
        }
    }

    public void setOnCheckedStateChangeListener(i iVar) {
        this.f593i = iVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f596l.f589a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z4) {
        this.f594j.f666b = z4;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i5) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i5) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // I1.d
    public void setSingleLine(boolean z4) {
        super.setSingleLine(z4);
    }

    public void setSingleSelection(boolean z4) {
        F3.p pVar = this.f594j;
        if (pVar.f665a != z4) {
            pVar.f665a = z4;
            boolean zIsEmpty = ((HashSet) pVar.f668d).isEmpty();
            Iterator it = ((HashMap) pVar.f667c).values().iterator();
            while (it.hasNext()) {
                pVar.k((I1.g) it.next(), false);
            }
            if (zIsEmpty) {
                return;
            }
            pVar.i();
        }
    }

    public void setSingleLine(int i5) {
        setSingleLine(getResources().getBoolean(i5));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new g(layoutParams);
    }

    public void setSingleSelection(int i5) {
        setSingleSelection(getResources().getBoolean(i5));
    }
}
