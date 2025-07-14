package R1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import com.wssyncmldm.R;
import java.util.Locale;
import k.C0644o;
import k.C0662x0;

/* loaded from: classes.dex */
public final class v extends C0644o {

    /* renamed from: g, reason: collision with root package name */
    public final C0662x0 f2463g;

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f2464h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f2465i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2466j;

    /* renamed from: k, reason: collision with root package name */
    public final float f2467k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f2468l;

    /* renamed from: m, reason: collision with root package name */
    public int f2469m;
    public ColorStateList n;

    public v(Context context, AttributeSet attributeSet) {
        super(T1.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f2465i = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayF = I1.m.f(context2, attributeSet, u1.a.f9167k, R.attr.autoCompleteTextViewStyle, 2132018150, new int[0]);
        if (typedArrayF.hasValue(0) && typedArrayF.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f2466j = typedArrayF.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f2467k = typedArrayF.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayF.hasValue(2)) {
            this.f2468l = ColorStateList.valueOf(typedArrayF.getColor(2, 0));
        }
        this.f2469m = typedArrayF.getColor(4, 0);
        this.n = V1.a.z(context2, typedArrayF, 5);
        this.f2464h = (AccessibilityManager) context2.getSystemService("accessibility");
        C0662x0 c0662x0 = new C0662x0(context2, null, R.attr.listPopupWindowStyle);
        this.f2463g = c0662x0;
        c0662x0.f7858z = true;
        c0662x0.f7836A.setFocusable(true);
        c0662x0.f7848p = this;
        c0662x0.f7836A.setInputMethodMode(2);
        c0662x0.n(getAdapter());
        c0662x0.f7849q = new t(this);
        if (typedArrayF.hasValue(6)) {
            setSimpleItems(typedArrayF.getResourceId(6, 0));
        }
        typedArrayF.recycle();
    }

    public static void a(v vVar, Object obj) {
        vVar.setText(vVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        AccessibilityManager accessibilityManager = this.f2464h;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.dismissDropDown();
        } else {
            this.f2463g.dismiss();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f2468l;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutB = b();
        return (textInputLayoutB == null || !textInputLayoutB.f5995H) ? super.getHint() : textInputLayoutB.getHint();
    }

    public float getPopupElevation() {
        return this.f2467k;
    }

    public int getSimpleItemSelectedColor() {
        return this.f2469m;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.n;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null && textInputLayoutB.f5995H && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2463g.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        if (View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutB = b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutB != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C0662x0 c0662x0 = this.f2463g;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !c0662x0.f7836A.isShowing() ? -1 : c0662x0.f.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutB);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = c0662x0.f7836A.getBackground();
                if (background != null) {
                    Rect rect = this.f2465i;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutB.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i5)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        AccessibilityManager accessibilityManager = this.f2464h;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.onWindowFocusChanged(z4);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t4) {
        super.setAdapter(t4);
        this.f2463g.n(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C0662x0 c0662x0 = this.f2463g;
        if (c0662x0 != null) {
            c0662x0.l(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i5) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i5));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f2468l = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof O1.g) {
            ((O1.g) dropDownBackground).i(this.f2468l);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f2463g.f7850r = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i5) {
        super.setRawInputType(i5);
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null) {
            textInputLayoutB.s();
        }
    }

    public void setSimpleItemSelectedColor(int i5) {
        this.f2469m = i5;
        if (getAdapter() instanceof u) {
            ((u) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.n = colorStateList;
        if (getAdapter() instanceof u) {
            ((u) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i5) {
        setSimpleItems(getResources().getStringArray(i5));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f2464h;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f2463g.r();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new u(this, getContext(), this.f2466j, strArr));
    }
}
