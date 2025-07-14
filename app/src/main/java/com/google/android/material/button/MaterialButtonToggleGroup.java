package com.google.android.material.button;

import B.g;
import B1.d;
import B1.e;
import B1.f;
import I1.m;
import J.P;
import O1.j;
import O1.k;
import T1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.wssyncmldm.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final /* synthetic */ int n = 0;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5807d;

    /* renamed from: e, reason: collision with root package name */
    public final g f5808e;
    public final LinkedHashSet f;

    /* renamed from: g, reason: collision with root package name */
    public final d f5809g;

    /* renamed from: h, reason: collision with root package name */
    public Integer[] f5810h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5811i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5812j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5813k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5814l;

    /* renamed from: m, reason: collision with root package name */
    public HashSet f5815m;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f5807d = new ArrayList();
        this.f5808e = new g(2, this);
        this.f = new LinkedHashSet();
        this.f5809g = new d(0, this);
        this.f5811i = false;
        this.f5815m = new HashSet();
        TypedArray typedArrayF = m.f(getContext(), attributeSet, u1.a.f9169m, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayF.getBoolean(3, false));
        this.f5814l = typedArrayF.getResourceId(1, -1);
        this.f5813k = typedArrayF.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayF.getBoolean(0, true));
        typedArrayF.recycle();
        WeakHashMap weakHashMap = P.f1421a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            if (c(i5)) {
                return i5;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i5 = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            if ((getChildAt(i6) instanceof MaterialButton) && c(i6)) {
                i5++;
            }
        }
        return i5;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = P.f1421a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f5808e);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i5 = firstVisibleChildIndex + 1; i5 < getChildCount(); i5++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i5);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i5 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i5, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.f5804s);
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f5807d.add(new f(shapeAppearanceModel.f1965e, shapeAppearanceModel.f1967h, shapeAppearanceModel.f, shapeAppearanceModel.f1966g));
        materialButton.setEnabled(isEnabled());
        P.h(materialButton, new e(0, this));
    }

    public final void b(int i5, boolean z4) {
        if (i5 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i5);
            return;
        }
        HashSet hashSet = new HashSet(this.f5815m);
        if (z4 && !hashSet.contains(Integer.valueOf(i5))) {
            if (this.f5812j && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i5));
        } else {
            if (z4 || !hashSet.contains(Integer.valueOf(i5))) {
                return;
            }
            if (!this.f5813k || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i5));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i5) {
        return getChildAt(i5).getVisibility() != 8;
    }

    public final void d(Set set) {
        HashSet hashSet = this.f5815m;
        this.f5815m = new HashSet(set);
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            int id = ((MaterialButton) getChildAt(i5)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f5811i = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f5811i = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f.iterator();
                while (it.hasNext()) {
                    ((com.google.android.material.timepicker.f) it.next()).a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f5809g);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            treeMap.put((MaterialButton) getChildAt(i5), Integer.valueOf(i5));
        }
        this.f5810h = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        f fVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i5 = 0; i5 < childCount; i5++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i5);
            if (materialButton.getVisibility() != 8) {
                j jVarE = materialButton.getShapeAppearanceModel().e();
                f fVar2 = (f) this.f5807d.get(i5);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z4 = getOrientation() == 0;
                    O1.a aVar = f.f211e;
                    if (i5 == firstVisibleChildIndex) {
                        fVar = z4 ? m.e(this) ? new f(aVar, aVar, fVar2.f213b, fVar2.f214c) : new f(fVar2.f212a, fVar2.f215d, aVar, aVar) : new f(fVar2.f212a, aVar, fVar2.f213b, aVar);
                    } else if (i5 == lastVisibleChildIndex) {
                        fVar = z4 ? m.e(this) ? new f(fVar2.f212a, fVar2.f215d, aVar, aVar) : new f(aVar, aVar, fVar2.f213b, fVar2.f214c) : new f(aVar, fVar2.f215d, aVar, fVar2.f214c);
                    } else {
                        fVar2 = null;
                    }
                    fVar2 = fVar;
                }
                if (fVar2 == null) {
                    jVarE.f1954e = new O1.a(0.0f);
                    jVarE.f = new O1.a(0.0f);
                    jVarE.f1955g = new O1.a(0.0f);
                    jVarE.f1956h = new O1.a(0.0f);
                } else {
                    jVarE.f1954e = fVar2.f212a;
                    jVarE.f1956h = fVar2.f215d;
                    jVarE.f = fVar2.f213b;
                    jVarE.f1955g = fVar2.f214c;
                }
                materialButton.setShapeAppearanceModel(jVarE.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f5812j || this.f5815m.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f5815m.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            int id = ((MaterialButton) getChildAt(i5)).getId();
            if (this.f5815m.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i5, int i6) {
        Integer[] numArr = this.f5810h;
        if (numArr != null && i6 < numArr.length) {
            return numArr[i6].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i6;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i5 = this.f5814l;
        if (i5 != -1) {
            d(Collections.singleton(Integer.valueOf(i5)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f5812j ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i5, int i6) {
        e();
        a();
        super.onMeasure(i5, i6);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f5807d.remove(iIndexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            ((MaterialButton) getChildAt(i5)).setEnabled(z4);
        }
    }

    public void setSelectionRequired(boolean z4) {
        this.f5813k = z4;
    }

    public void setSingleSelection(boolean z4) {
        if (this.f5812j != z4) {
            this.f5812j = z4;
            d(new HashSet());
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            ((MaterialButton) getChildAt(i5)).setA11yClassName((this.f5812j ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i5) {
        setSingleSelection(getResources().getBoolean(i5));
    }
}
