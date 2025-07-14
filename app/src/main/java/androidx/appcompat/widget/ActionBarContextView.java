package androidx.appcompat.widget;

import J.P;
import J.Z;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.AbstractC0220a;
import com.wssyncmldm.R;
import e1.AbstractC0415a;
import i.AbstractC0476b;
import j.InterfaceC0506w;
import j.MenuC0492i;
import java.util.WeakHashMap;
import k.C0618f;
import k.C0633k;
import k.M1;
import k.ViewOnClickListenerC0606b;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final F3.c f3237d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f3238e;
    public ActionMenuView f;

    /* renamed from: g, reason: collision with root package name */
    public C0633k f3239g;

    /* renamed from: h, reason: collision with root package name */
    public int f3240h;

    /* renamed from: i, reason: collision with root package name */
    public Z f3241i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3242j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3243k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f3244l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f3245m;
    public View n;

    /* renamed from: o, reason: collision with root package name */
    public View f3246o;

    /* renamed from: p, reason: collision with root package name */
    public View f3247p;

    /* renamed from: q, reason: collision with root package name */
    public LinearLayout f3248q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f3249r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f3250s;

    /* renamed from: t, reason: collision with root package name */
    public final int f3251t;

    /* renamed from: u, reason: collision with root package name */
    public final int f3252u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3253v;

    /* renamed from: w, reason: collision with root package name */
    public final int f3254w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3255x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3256y;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.f3237d = new F3.c(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f3238e = context;
        } else {
            this.f3238e = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0220a.f5115d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC0415a.r(context, resourceId);
        WeakHashMap weakHashMap = P.f1421a;
        setBackground(drawable);
        this.f3251t = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f3252u = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f3240h = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f3254w = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.sesl_action_mode_close_item);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i5, int i6) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), i6);
        return Math.max(0, i5 - view.getMeasuredWidth());
    }

    public static int h(int i5, int i6, int i7, View view, boolean z4) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i8 = ((i7 - measuredHeight) / 2) + i6;
        if (z4) {
            view.layout(i5 - measuredWidth, i8, i5, measuredHeight + i8);
        } else {
            view.layout(i5, i8, i5 + measuredWidth, measuredHeight + i8);
        }
        return z4 ? -measuredWidth : measuredWidth;
    }

    public final void c(AbstractC0476b abstractC0476b) {
        this.f3256y = true;
        View view = this.n;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f3254w, (ViewGroup) this, false);
            this.n = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.n);
        }
        View viewFindViewById = this.n.findViewById(R.id.action_mode_close_button);
        this.f3246o = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0606b(0, abstractC0476b));
        MenuC0492i menuC0492iE = abstractC0476b.e();
        C0633k c0633k = this.f3239g;
        if (c0633k != null) {
            c0633k.i();
            C0618f c0618f = c0633k.f7708w;
            if (c0618f != null && c0618f.b()) {
                c0618f.f7024i.dismiss();
            }
        }
        C0633k c0633k2 = new C0633k(getContext());
        this.f3239g = c0633k2;
        c0633k2.f7700o = true;
        c0633k2.f7701p = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuC0492iE.b(this.f3239g, this.f3238e);
        C0633k c0633k3 = this.f3239g;
        InterfaceC0506w interfaceC0506w = c0633k3.f7697k;
        if (interfaceC0506w == null) {
            InterfaceC0506w interfaceC0506w2 = (InterfaceC0506w) c0633k3.f7693g.inflate(c0633k3.f7695i, (ViewGroup) this, false);
            c0633k3.f7697k = interfaceC0506w2;
            interfaceC0506w2.a(c0633k3.f);
            c0633k3.f();
        }
        InterfaceC0506w interfaceC0506w3 = c0633k3.f7697k;
        if (interfaceC0506w != interfaceC0506w3) {
            ((ActionMenuView) interfaceC0506w3).setPresenter(c0633k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC0506w3;
        this.f = actionMenuView;
        WeakHashMap weakHashMap = P.f1421a;
        actionMenuView.setBackground(null);
        addView(this.f, layoutParams);
    }

    public final void d() {
        if (this.f3248q == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.sesl_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f3248q = linearLayout;
            this.f3249r = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f3250s = (TextView) this.f3248q.findViewById(R.id.action_bar_subtitle);
            int i5 = this.f3251t;
            if (i5 != 0) {
                this.f3249r.setTextAppearance(getContext(), i5);
            }
            int i6 = this.f3252u;
            if (i6 != 0) {
                this.f3250s.setTextAppearance(getContext(), i6);
            }
        }
        this.f3249r.setText(this.f3244l);
        this.f3250s.setText(this.f3245m);
        boolean zIsEmpty = TextUtils.isEmpty(this.f3244l);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f3245m);
        this.f3250s.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f3248q.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f3248q.getParent() == null) {
            addView(this.f3248q);
        }
    }

    public final void e() {
        removeAllViews();
        this.f3247p = null;
        this.f = null;
        this.f3239g = null;
        View view = this.f3246o;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public final void g(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0220a.f5112a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C0633k c0633k = this.f3239g;
        if (c0633k != null) {
            c0633k.k();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f3241i != null ? this.f3237d.f633b : getVisibility();
    }

    public int getContentHeight() {
        return this.f3240h;
    }

    public boolean getIsActionModeAccessibilityOn() {
        return this.f3255x;
    }

    public CharSequence getSubtitle() {
        return this.f3245m;
    }

    public CharSequence getTitle() {
        return this.f3244l;
    }

    @Override // android.view.View
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i5) {
        if (i5 != getVisibility()) {
            Z z4 = this.f3241i;
            if (z4 != null) {
                z4.b();
            }
            super.setVisibility(i5);
        }
    }

    public final Z j(int i5, long j5) {
        Z z4 = this.f3241i;
        if (z4 != null) {
            z4.b();
        }
        F3.c cVar = this.f3237d;
        if (i5 != 0) {
            Z zA = P.a(this);
            zA.a(0.0f);
            zA.c(j5);
            ((ActionBarContextView) cVar.f634c).f3241i = zA;
            cVar.f633b = i5;
            zA.d(cVar);
            return zA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        Z zA2 = P.a(this);
        zA2.a(1.0f);
        zA2.c(j5);
        ((ActionBarContextView) cVar.f634c).f3241i = zA2;
        cVar.f633b = i5;
        zA2.d(cVar);
        return zA2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() throws Resources.NotFoundException {
        super.onAttachedToWindow();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.sesl_action_bar_top_padding);
        setPadding(0, dimensionPixelSize, 0, 0);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0220a.f5115d, android.R.attr.actionModeStyle, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1);
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = dimensionPixelSize2 + dimensionPixelSize;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        g(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0220a.f5115d, android.R.attr.actionModeStyle, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1);
        if (dimensionPixelSize >= 0) {
            setContentHeight(dimensionPixelSize);
        }
        setPadding(0, getResources().getDimensionPixelSize(R.dimen.sesl_action_bar_top_padding), 0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0633k c0633k = this.f3239g;
        if (c0633k != null) {
            c0633k.i();
            C0618f c0618f = this.f3239g.f7708w;
            if (c0618f == null || !c0618f.b()) {
                return;
            }
            c0618f.f7024i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3243k = false;
        }
        if (!this.f3243k) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f3243k = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3243k = false;
        }
        return true;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        Log.d("ActionBarContextView", "onInitializeAccessibilityEvent Check ActionMode :" + this.f3256y);
        if (this.f3256y) {
            this.f3255x = true;
            this.f3256y = false;
        } else {
            this.f3255x = false;
        }
        Log.d("ActionBarContextView", "onInitializeAccessibilityEvent mIsActionModeAccessibilityOn :" + this.f3255x);
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f3244l);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        boolean zA = M1.a(this);
        int paddingRight = zA ? (i7 - i5) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i8 - i6) - getPaddingTop()) - getPaddingBottom();
        View view = this.n;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.n.getLayoutParams();
            int i9 = zA ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i10 = zA ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i11 = zA ? paddingRight - i9 : paddingRight + i9;
            int iH = h(i11, paddingTop, paddingTop2, this.n, zA) + i11;
            paddingRight = zA ? iH - i10 : iH + i10;
        }
        LinearLayout linearLayout = this.f3248q;
        if (linearLayout != null && this.f3247p == null && linearLayout.getVisibility() != 8) {
            paddingRight += h(paddingRight, paddingTop, paddingTop2, this.f3248q, zA);
        }
        View view2 = this.f3247p;
        if (view2 != null) {
            h(paddingRight, paddingTop, paddingTop2, view2, zA);
        }
        int paddingLeft = zA ? getPaddingLeft() : (i7 - i5) - getPaddingRight();
        ActionMenuView actionMenuView = this.f;
        if (actionMenuView != null) {
            h(paddingLeft, paddingTop, paddingTop2, actionMenuView, !zA);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i6) throws Resources.NotFoundException {
        if (View.MeasureSpec.getMode(i5) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i6) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i5);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.sesl_action_bar_top_padding);
        int i7 = this.f3240h;
        int size2 = i7 > 0 ? i7 + dimensionPixelSize : View.MeasureSpec.getSize(i6);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.n;
        if (view != null && view.getVisibility() == 0) {
            int iF = f(this.n, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.n.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f, paddingLeft, iMakeMeasureSpec);
        }
        if (this.f3248q != null && this.f3247p == null) {
            Context context = getContext();
            if (this.f3249r != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(this.f3251t, AbstractC0220a.f5108A);
                TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(0);
                typedArrayObtainStyledAttributes.recycle();
                float fComplexToFloat = TypedValue.complexToFloat(typedValuePeekValue.data);
                if (TextUtils.isEmpty(this.f3245m)) {
                    this.f3249r.setTextSize(1, fComplexToFloat * Math.min(context.getResources().getConfiguration().fontScale, 1.2f));
                } else {
                    this.f3249r.setTextSize(1, fComplexToFloat);
                }
            }
            View view2 = this.n;
            if (view2 == null || view2.getVisibility() == 8) {
                int dimension = (int) context.getResources().getDimension(R.dimen.sesl_toolbar_content_inset);
                WeakHashMap weakHashMap = P.f1421a;
                boolean z4 = getLayoutDirection() == 0;
                TextView textView = this.f3249r;
                if (textView != null && textView.getVisibility() == 0) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3249r.getLayoutParams();
                    if (z4) {
                        layoutParams.leftMargin = dimension;
                    } else {
                        layoutParams.rightMargin = dimension;
                    }
                    this.f3249r.setLayoutParams(layoutParams);
                }
                TextView textView2 = this.f3250s;
                if (textView2 != null && textView2.getVisibility() == 0) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f3250s.getLayoutParams();
                    if (z4) {
                        layoutParams2.leftMargin = dimension;
                    } else {
                        layoutParams2.rightMargin = dimension;
                    }
                    this.f3250s.setLayoutParams(layoutParams2);
                }
            }
            if (this.f3253v) {
                this.f3248q.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f3248q.getMeasuredWidth();
                boolean z5 = measuredWidth <= paddingLeft;
                if (z5) {
                    paddingLeft -= measuredWidth;
                }
                this.f3248q.setVisibility(z5 ? 0 : 8);
            } else {
                paddingLeft = f(this.f3248q, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view3 = this.f3247p;
        if (view3 != null) {
            ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
            int i8 = layoutParams3.width;
            int i9 = i8 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i8 >= 0) {
                paddingLeft = Math.min(i8, paddingLeft);
            }
            int i10 = layoutParams3.height;
            int i11 = i10 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i10 >= 0) {
                iMin = Math.min(i10, iMin);
            }
            this.f3247p.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i9), View.MeasureSpec.makeMeasureSpec(iMin, i11));
        }
        if (this.f3240h > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            int measuredHeight = getChildAt(i13).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i12) {
                i12 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3242j = false;
        }
        if (!this.f3242j) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f3242j = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3242j = false;
        }
        return true;
    }

    public void setContentHeight(int i5) {
        this.f3240h = i5;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f3247p;
        if (view2 != null) {
            removeView(view2);
        }
        this.f3247p = view;
        if (view != null && (linearLayout = this.f3248q) != null) {
            removeView(linearLayout);
            this.f3248q = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f3245m = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f3244l = charSequence;
        d();
        P.i(this, charSequence);
    }

    public void setTitleOptional(boolean z4) {
        if (z4 != this.f3253v) {
            requestLayout();
        }
        this.f3253v = z4;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
