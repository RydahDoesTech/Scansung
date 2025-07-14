package com.google.android.material.timepicker;

import A.r;
import J.P;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.wssyncmldm.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import u.l;

/* loaded from: classes.dex */
class ClockFaceView extends e implements d {

    /* renamed from: A, reason: collision with root package name */
    public final Rect f6049A;

    /* renamed from: B, reason: collision with root package name */
    public final SparseArray f6050B;

    /* renamed from: C, reason: collision with root package name */
    public final c f6051C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f6052D;
    public final float[] E;

    /* renamed from: F, reason: collision with root package name */
    public final int f6053F;

    /* renamed from: G, reason: collision with root package name */
    public final int f6054G;

    /* renamed from: H, reason: collision with root package name */
    public final int f6055H;

    /* renamed from: I, reason: collision with root package name */
    public final int f6056I;

    /* renamed from: J, reason: collision with root package name */
    public final String[] f6057J;

    /* renamed from: K, reason: collision with root package name */
    public float f6058K;

    /* renamed from: L, reason: collision with root package name */
    public final ColorStateList f6059L;

    /* renamed from: x, reason: collision with root package name */
    public final ClockHandView f6060x;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f6061y;

    /* renamed from: z, reason: collision with root package name */
    public final RectF f6062z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6061y = new Rect();
        this.f6062z = new RectF();
        this.f6049A = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f6050B = sparseArray;
        this.E = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u1.a.f9162e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListZ = V1.a.z(context, typedArrayObtainStyledAttributes, 1);
        this.f6059L = colorStateListZ;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f6060x = clockHandView;
        this.f6053F = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListZ.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListZ.getDefaultColor());
        this.f6052D = new int[]{colorForState, colorForState, colorStateListZ.getDefaultColor()};
        clockHandView.f.add(this);
        int defaultColor = r.a(context.getResources(), R.color.material_timepicker_clockface, context.getTheme()).getDefaultColor();
        ColorStateList colorStateListZ2 = V1.a.z(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListZ2 != null ? colorStateListZ2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f6051C = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f6057J = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z4 = false;
        for (int i5 = 0; i5 < Math.max(this.f6057J.length, size); i5++) {
            TextView textView = (TextView) sparseArray.get(i5);
            if (i5 >= this.f6057J.length) {
                removeView(textView);
                sparseArray.remove(i5);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i5, textView);
                    addView(textView);
                }
                textView.setText(this.f6057J[i5]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i5));
                int i6 = (i5 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i6));
                z4 = i6 > 1 ? true : z4;
                P.h(textView, this.f6051C);
                textView.setTextColor(this.f6059L);
            }
        }
        ClockHandView clockHandView2 = this.f6060x;
        if (clockHandView2.f6064e && !z4) {
            clockHandView2.f6073p = 1;
        }
        clockHandView2.f6064e = z4;
        clockHandView2.invalidate();
        this.f6054G = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f6055H = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f6056I = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.e
    public final void g() {
        l lVar = new l();
        lVar.b(this);
        HashMap map = new HashMap();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i6 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i6 == null) {
                    i6 = 1;
                }
                if (!map.containsKey(i6)) {
                    map.put(i6, new ArrayList());
                }
                ((List) map.get(i6)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f6080v * 0.66f) : this.f6080v;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap map2 = lVar.f9144c;
                if (!map2.containsKey(Integer.valueOf(id))) {
                    map2.put(Integer.valueOf(id), new u.g());
                }
                u.h hVar = ((u.g) map2.get(Integer.valueOf(id))).f9059d;
                hVar.f9115w = R.id.circle_center;
                hVar.f9116x = iRound;
                hVar.f9117y = size;
                size += 360.0f / list.size();
            }
        }
        lVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f6050B;
            if (i7 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i7)).setVisibility(0);
            i7++;
        }
    }

    public final void h() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f6060x.f6068j;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i5 = 0;
        while (true) {
            sparseArray = this.f6050B;
            int size = sparseArray.size();
            rectF = this.f6062z;
            rect = this.f6061y;
            if (i5 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i5);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
            i5++;
        }
        for (int i6 = 0; i6 < sparseArray.size(); i6++) {
            TextView textView3 = (TextView) sparseArray.get(i6);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f6049A);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f6052D, this.E, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f6057J.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        super.onLayout(z4, i5, i6, i7, i8);
        h();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i5, int i6) throws Resources.NotFoundException, NumberFormatException {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f6056I / Math.max(Math.max(this.f6054G / displayMetrics.heightPixels, this.f6055H / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
