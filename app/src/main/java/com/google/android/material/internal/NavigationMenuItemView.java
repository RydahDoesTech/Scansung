package com.google.android.material.internal;

import A.k;
import A.r;
import C.a;
import I1.e;
import J.P;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import j.C0494k;
import j.InterfaceC0505v;
import java.util.WeakHashMap;
import k.C0647p0;
import k.J1;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends e implements InterfaceC0505v {

    /* renamed from: J, reason: collision with root package name */
    public static final int[] f5939J = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public boolean f5940A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f5941B;

    /* renamed from: C, reason: collision with root package name */
    public final CheckedTextView f5942C;

    /* renamed from: D, reason: collision with root package name */
    public FrameLayout f5943D;
    public C0494k E;

    /* renamed from: F, reason: collision with root package name */
    public ColorStateList f5944F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f5945G;

    /* renamed from: H, reason: collision with root package name */
    public Drawable f5946H;

    /* renamed from: I, reason: collision with root package name */
    public final B1.e f5947I;

    /* renamed from: y, reason: collision with root package name */
    public int f5948y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5949z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5941B = true;
        B1.e eVar = new B1.e(3, this);
        this.f5947I = eVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.wssyncmldm.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.wssyncmldm.R.id.design_menu_item_text);
        this.f5942C = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        P.h(checkedTextView, eVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f5943D == null) {
                this.f5943D = (FrameLayout) ((ViewStub) findViewById(com.wssyncmldm.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f5943D.removeAllViews();
            this.f5943D.addView(view);
        }
    }

    @Override // j.InterfaceC0505v
    public final void d(C0494k c0494k) {
        StateListDrawable stateListDrawable;
        this.E = c0494k;
        int i5 = c0494k.f6982a;
        if (i5 > 0) {
            setId(i5);
        }
        setVisibility(c0494k.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.wssyncmldm.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f5939J, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = P.f1421a;
            setBackground(stateListDrawable);
        }
        setCheckable(c0494k.isCheckable());
        setChecked(c0494k.isChecked());
        setEnabled(c0494k.isEnabled());
        setTitle(c0494k.f6986e);
        setIcon(c0494k.getIcon());
        setActionView(c0494k.getActionView());
        setContentDescription(c0494k.f6996q);
        J1.a(this, c0494k.f6997r);
        C0494k c0494k2 = this.E;
        CharSequence charSequence = c0494k2.f6986e;
        CheckedTextView checkedTextView = this.f5942C;
        if (charSequence == null && c0494k2.getIcon() == null && this.E.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f5943D;
            if (frameLayout != null) {
                C0647p0 c0647p0 = (C0647p0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0647p0).width = -1;
                this.f5943D.setLayoutParams(c0647p0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f5943D;
        if (frameLayout2 != null) {
            C0647p0 c0647p02 = (C0647p0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0647p02).width = -2;
            this.f5943D.setLayoutParams(c0647p02);
        }
    }

    @Override // j.InterfaceC0505v
    public C0494k getItemData() {
        return this.E;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i5) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i5 + 1);
        C0494k c0494k = this.E;
        if (c0494k != null && c0494k.isCheckable() && this.E.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5939J);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z4) {
        refreshDrawableState();
        if (this.f5940A != z4) {
            this.f5940A = z4;
            this.f5947I.h(this.f5942C, 2048);
        }
    }

    public void setChecked(boolean z4) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f5942C;
        checkedTextView.setChecked(z4);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z4 && this.f5941B) ? 1 : 0);
    }

    public void setHorizontalPadding(int i5) {
        setPadding(i5, getPaddingTop(), i5, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f5945G) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                a.h(drawable, this.f5944F);
            }
            int i5 = this.f5948y;
            drawable.setBounds(0, 0, i5, i5);
        } else if (this.f5949z) {
            if (this.f5946H == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = r.f34a;
                Drawable drawableA = k.a(resources, com.wssyncmldm.R.drawable.navigation_empty_icon, theme);
                this.f5946H = drawableA;
                if (drawableA != null) {
                    int i6 = this.f5948y;
                    drawableA.setBounds(0, 0, i6, i6);
                }
            }
            drawable = this.f5946H;
        }
        this.f5942C.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i5) {
        this.f5942C.setCompoundDrawablePadding(i5);
    }

    public void setIconSize(int i5) {
        this.f5948y = i5;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f5944F = colorStateList;
        this.f5945G = colorStateList != null;
        C0494k c0494k = this.E;
        if (c0494k != null) {
            setIcon(c0494k.getIcon());
        }
    }

    public void setMaxLines(int i5) {
        this.f5942C.setMaxLines(i5);
    }

    public void setNeedsEmptyIcon(boolean z4) {
        this.f5949z = z4;
    }

    public void setTextAppearance(int i5) {
        this.f5942C.setTextAppearance(i5);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f5942C.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f5942C.setText(charSequence);
    }
}
