package androidx.appcompat.widget;

import J.P;
import O1.e;
import Y0.j;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import c.AbstractC0220a;
import com.wssyncmldm.R;
import j.C0494k;
import j.InterfaceC0490g;
import j.InterfaceC0491h;
import j.InterfaceC0503t;
import j.InterfaceC0506w;
import j.MenuC0492i;
import java.util.WeakHashMap;
import k.AbstractC0649q0;
import k.C0586A;
import k.C0618f;
import k.C0627i;
import k.C0633k;
import k.C0639m;
import k.C0647p0;
import k.C0661x;
import k.InterfaceC0636l;
import k.InterfaceC0642n;
import k.M1;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC0649q0 implements InterfaceC0491h, InterfaceC0506w {

    /* renamed from: A, reason: collision with root package name */
    public int f3282A;

    /* renamed from: B, reason: collision with root package name */
    public final int f3283B;

    /* renamed from: C, reason: collision with root package name */
    public final int f3284C;

    /* renamed from: D, reason: collision with root package name */
    public InterfaceC0642n f3285D;
    public int E;

    /* renamed from: F, reason: collision with root package name */
    public int f3286F;

    /* renamed from: G, reason: collision with root package name */
    public int f3287G;

    /* renamed from: H, reason: collision with root package name */
    public int f3288H;

    /* renamed from: I, reason: collision with root package name */
    public int f3289I;

    /* renamed from: J, reason: collision with root package name */
    public int f3290J;

    /* renamed from: K, reason: collision with root package name */
    public final String f3291K;

    /* renamed from: L, reason: collision with root package name */
    public final boolean f3292L;

    /* renamed from: s, reason: collision with root package name */
    public MenuC0492i f3293s;

    /* renamed from: t, reason: collision with root package name */
    public Context f3294t;

    /* renamed from: u, reason: collision with root package name */
    public int f3295u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3296v;

    /* renamed from: w, reason: collision with root package name */
    public C0633k f3297w;

    /* renamed from: x, reason: collision with root package name */
    public A1.c f3298x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC0490g f3299y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3300z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f3283B = (int) (56.0f * f);
        this.f3284C = (int) (f * 4.0f);
        this.f3294t = context;
        this.f3295u = 0;
        boolean z4 = j.B() >= 130100;
        this.f3292L = z4;
        int[] iArr = AbstractC0220a.f5110C;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.actionButtonStyle, 0);
        this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.f3286F = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, R.attr.actionOverflowButtonStyle, 0);
        this.f3287G = typedArrayObtainStyledAttributes2.getDimensionPixelSize(7, 0);
        this.f3288H = typedArrayObtainStyledAttributes2.getDimensionPixelSize(6, 0);
        this.f3290J = typedArrayObtainStyledAttributes2.getDimensionPixelSize(3, 0);
        typedArrayObtainStyledAttributes2.recycle();
        this.f3291K = context.getResources().getString(R.string.sesl_action_menu_overflow_badge_text_n);
        if (z4) {
            this.E = getResources().getDimensionPixelSize(R.dimen.sesl_action_button_side_padding);
            this.f3286F = getResources().getDimensionPixelSize(R.dimen.sesl_action_button_side_padding);
            this.f3287G = getResources().getDimensionPixelSize(R.dimen.sesl_action_bar_overflow_side_padding);
            this.f3288H = getResources().getDimensionPixelSize(R.dimen.sesl_action_bar_overflow_padding_end);
        }
        this.f3289I = getResources().getDimensionPixelSize(R.dimen.sesl_action_bar_last_padding);
    }

    public static C0639m l() {
        C0639m c0639m = new C0639m(-2, -2);
        c0639m.f7740a = false;
        ((LinearLayout.LayoutParams) c0639m).gravity = 16;
        return c0639m;
    }

    public static C0639m m(ViewGroup.LayoutParams layoutParams) {
        C0639m c0639m;
        if (layoutParams == null) {
            return l();
        }
        if (layoutParams instanceof C0639m) {
            C0639m c0639m2 = (C0639m) layoutParams;
            c0639m = new C0639m(c0639m2);
            c0639m.f7740a = c0639m2.f7740a;
        } else {
            c0639m = new C0639m(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0639m).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0639m).gravity = 16;
        }
        return c0639m;
    }

    @Override // j.InterfaceC0506w
    public final void a(MenuC0492i menuC0492i) {
        this.f3293s = menuC0492i;
    }

    @Override // j.InterfaceC0491h
    public final boolean b(C0494k c0494k) {
        MenuC0492i menuC0492i = this.f3293s;
        if (menuC0492i != null) {
            return menuC0492i.q(c0494k, null, 0);
        }
        return false;
    }

    @Override // k.AbstractC0649q0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0639m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // k.AbstractC0649q0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return l();
    }

    @Override // k.AbstractC0649q0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public Menu getMenu() {
        if (this.f3293s == null) {
            Context context = getContext();
            MenuC0492i menuC0492i = new MenuC0492i(context);
            this.f3293s = menuC0492i;
            menuC0492i.f6959e = new C0586A(this);
            C0633k c0633k = new C0633k(context);
            this.f3297w = c0633k;
            c0633k.f7700o = true;
            c0633k.f7701p = true;
            InterfaceC0503t eVar = this.f3298x;
            if (eVar == null) {
                eVar = new e(15);
            }
            c0633k.f7694h = eVar;
            this.f3293s.b(c0633k, this.f3294t);
            C0633k c0633k2 = this.f3297w;
            c0633k2.f7697k = this;
            this.f3293s = c0633k2.f;
        }
        return this.f3293s;
    }

    public String getOverflowBadgeText() {
        return this.f3291K;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0633k c0633k = this.f3297w;
        if (c0633k.f7689A) {
            return null;
        }
        C0627i c0627i = c0633k.f7698l;
        if (c0627i != null) {
            return ((C0661x) c0627i.f).getDrawable();
        }
        if (c0633k.n) {
            return c0633k.f7699m;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f3295u;
    }

    public int getSumOfDigitsInBadges() {
        if (this.f3293s == null) {
            return 0;
        }
        for (int i5 = 0; i5 < this.f3293s.f.size(); i5++) {
            ((C0494k) this.f3293s.getItem(i5)).isVisible();
        }
        return 0;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // k.AbstractC0649q0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C0647p0 generateDefaultLayoutParams() {
        return l();
    }

    @Override // k.AbstractC0649q0
    /* renamed from: i */
    public final C0647p0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0639m(getContext(), attributeSet);
    }

    @Override // k.AbstractC0649q0
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C0647p0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public final boolean n(int i5) {
        boolean zA = false;
        if (i5 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i5 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i5);
        if (i5 < getChildCount() && (childAt instanceof InterfaceC0636l)) {
            zA = ((InterfaceC0636l) childAt).a();
        }
        return (i5 <= 0 || !(childAt2 instanceof InterfaceC0636l)) ? zA : zA | ((InterfaceC0636l) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0633k c0633k = this.f3297w;
        if (c0633k != null) {
            c0633k.k();
            this.f3297w.f();
            if (this.f3297w.j()) {
                this.f3297w.i();
                this.f3297w.l();
            }
        }
        Context context = getContext();
        int[] iArr = AbstractC0220a.f5110C;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.actionButtonStyle, 0);
        this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.f3286F = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(null, iArr, R.attr.actionOverflowButtonStyle, 0);
        this.f3287G = typedArrayObtainStyledAttributes2.getDimensionPixelSize(7, 0);
        this.f3288H = typedArrayObtainStyledAttributes2.getDimensionPixelSize(6, 0);
        this.f3290J = typedArrayObtainStyledAttributes2.getDimensionPixelSize(3, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (this.f3292L) {
            this.E = getResources().getDimensionPixelSize(R.dimen.sesl_action_button_side_padding);
            this.f3286F = getResources().getDimensionPixelSize(R.dimen.sesl_action_button_side_padding);
            this.f3287G = getResources().getDimensionPixelSize(R.dimen.sesl_action_bar_overflow_side_padding);
            this.f3288H = getResources().getDimensionPixelSize(R.dimen.sesl_action_bar_overflow_padding_end);
        }
        this.f3289I = getResources().getDimensionPixelSize(R.dimen.sesl_action_bar_last_padding);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0633k c0633k = this.f3297w;
        if (c0633k != null) {
            c0633k.i();
            C0618f c0618f = c0633k.f7708w;
            if (c0618f == null || !c0618f.b()) {
                return;
            }
            c0618f.f7024i.dismiss();
        }
    }

    @Override // k.AbstractC0649q0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        int width;
        int paddingLeft;
        if (!this.f3300z) {
            super.onLayout(z4, i5, i6, i7, i8);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i8 - i6) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i7 - i5;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean zA = M1.a(this);
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C0639m c0639m = (C0639m) childAt.getLayoutParams();
                if (c0639m.f7740a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (n(i13)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zA) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c0639m).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0639m).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i14 = i9 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i14, width, measuredHeight + i14);
                    paddingRight -= measuredWidth;
                    i11 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0639m).leftMargin) + ((LinearLayout.LayoutParams) c0639m).rightMargin;
                    n(i13);
                    i12++;
                }
            }
        }
        if (childCount == 1 && i11 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i15 = (i10 / 2) - (measuredWidth2 / 2);
            int i16 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i15, i16, measuredWidth2 + i15, measuredHeight2 + i16);
            return;
        }
        int i17 = i12 - (i11 ^ 1);
        int iMax = Math.max(0, i17 > 0 ? paddingRight / i17 : 0);
        if (zA) {
            int width2 = getWidth() - getPaddingRight();
            for (int i18 = 0; i18 < childCount; i18++) {
                View childAt3 = getChildAt(i18);
                C0639m c0639m2 = (C0639m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0639m2.f7740a) {
                    int i19 = width2 - ((LinearLayout.LayoutParams) c0639m2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width2 = i19 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0639m2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt4 = getChildAt(i21);
            C0639m c0639m3 = (C0639m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0639m3.f7740a) {
                int i22 = paddingLeft2 + ((LinearLayout.LayoutParams) c0639m3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i23 = i9 - (measuredHeight4 / 2);
                childAt4.layout(i22, i23, i22 + measuredWidth4, measuredHeight4 + i23);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c0639m3).rightMargin + iMax + i22;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31, types: [int] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    @Override // k.AbstractC0649q0, android.view.View
    public final void onMeasure(int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ?? r22;
        int i16;
        int i17;
        int i18;
        int i19;
        MenuC0492i menuC0492i;
        boolean z4 = this.f3300z;
        boolean z5 = View.MeasureSpec.getMode(i5) == 1073741824;
        this.f3300z = z5;
        if (z4 != z5) {
            this.f3282A = 0;
        }
        int size = View.MeasureSpec.getSize(i5);
        if (this.f3300z && (menuC0492i = this.f3293s) != null && size != this.f3282A) {
            this.f3282A = size;
            menuC0492i.p(true);
        }
        int childCount = getChildCount();
        if (!this.f3300z || childCount <= 0) {
            int i20 = 0;
            while (i20 < childCount) {
                ?? childAt = getChildAt(i20);
                C0639m c0639m = (C0639m) childAt.getLayoutParams();
                ((LinearLayout.LayoutParams) c0639m).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0639m).leftMargin = 0;
                if (childAt instanceof ActionMenuItemView) {
                    int i21 = this.E;
                    int i22 = this.f3286F;
                    WeakHashMap weakHashMap = P.f1421a;
                    childAt.setPaddingRelative(i21, 0, i22, 0);
                    int i23 = childCount - 1;
                    if (i20 == i23) {
                        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) childAt;
                        if (actionMenuItemView.g()) {
                            if (getLayoutDirection() == 0) {
                                ((LinearLayout.LayoutParams) c0639m).rightMargin = this.f3289I;
                                childAt.setLayoutParams(c0639m);
                            } else {
                                ((LinearLayout.LayoutParams) c0639m).leftMargin = this.f3289I;
                                childAt.setLayoutParams(c0639m);
                            }
                            i7 = 1;
                        } else if (this.f3292L) {
                            actionMenuItemView.setIsLastItem(true);
                            childAt.setLayoutParams(c0639m);
                            childAt.setPaddingRelative(this.E, 0, this.f3288H, 0);
                            i7 = 1;
                        } else {
                            actionMenuItemView.setIsLastItem(true);
                            actionMenuItemView.setMinWidth(this.f3290J);
                            childAt.setLayoutParams(c0639m);
                            childAt.setPaddingRelative(this.f3287G, 0, this.f3288H, 0);
                        }
                        i20 += i7;
                    } else if (i20 < i23) {
                        ActionMenuItemView actionMenuItemView2 = (ActionMenuItemView) childAt;
                        if (!actionMenuItemView2.g()) {
                            actionMenuItemView2.setIsLastItem(false);
                        }
                    }
                } else if (c0639m.f7740a) {
                    if (childAt instanceof C0627i) {
                        ViewGroup viewGroup = (ViewGroup) childAt;
                        viewGroup.getChildAt(0).setPaddingRelative(this.f3287G, 0, this.f3288H, 0);
                        viewGroup.getChildAt(0).setMinimumWidth(this.f3290J);
                    } else {
                        int i24 = this.f3287G;
                        int i25 = this.f3288H;
                        WeakHashMap weakHashMap2 = P.f1421a;
                        childAt.setPaddingRelative(i24, 0, i25, 0);
                        childAt.setMinimumWidth(this.f3290J);
                    }
                }
                i7 = 1;
                i20 += i7;
            }
            super.onMeasure(i5, i6);
            return;
        }
        int mode = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i5);
        int size3 = View.MeasureSpec.getSize(i6);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, paddingBottom, -2);
        int i26 = size2 - paddingRight;
        int i27 = this.f3283B;
        int i28 = i26 / i27;
        int i29 = i26 % i27;
        if (i28 == 0) {
            setMeasuredDimension(i26, 0);
            return;
        }
        int i30 = (i29 / i28) + i27;
        int childCount2 = getChildCount();
        int i31 = 0;
        int iMax = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int iMax2 = 0;
        long j5 = 0;
        while (true) {
            i8 = this.f3284C;
            if (i32 >= childCount2) {
                break;
            }
            View childAt2 = getChildAt(i32);
            if (childAt2.getVisibility() == 8) {
                i16 = size3;
                i17 = paddingBottom;
                i19 = 1;
            } else {
                boolean z6 = childAt2 instanceof ActionMenuItemView;
                int i35 = i31 + 1;
                if (z6) {
                    childAt2.setPadding(i8, 0, i8, 0);
                }
                C0639m c0639m2 = (C0639m) childAt2.getLayoutParams();
                c0639m2.f = false;
                c0639m2.f7742c = 0;
                c0639m2.f7741b = 0;
                c0639m2.f7743d = false;
                ((LinearLayout.LayoutParams) c0639m2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0639m2).rightMargin = 0;
                c0639m2.f7744e = z6 && ((ActionMenuItemView) childAt2).g();
                int i36 = c0639m2.f7740a ? 1 : i28;
                i16 = size3;
                C0639m c0639m3 = (C0639m) childAt2.getLayoutParams();
                i17 = paddingBottom;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView3 = z6 ? (ActionMenuItemView) childAt2 : null;
                boolean z7 = actionMenuItemView3 != null && actionMenuItemView3.g();
                if (i36 <= 0 || (z7 && i36 < 2)) {
                    i18 = 0;
                } else {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i36 * i30, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt2.getMeasuredWidth();
                    i18 = measuredWidth / i30;
                    if (measuredWidth % i30 != 0) {
                        i18++;
                    }
                    if (z7 && i18 < 2) {
                        i18 = 2;
                    }
                }
                c0639m3.f7743d = !c0639m3.f7740a && z7;
                c0639m3.f7741b = i18;
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i18 * i30, 1073741824), iMakeMeasureSpec);
                iMax = Math.max(iMax, i18);
                if (c0639m2.f7743d) {
                    i19 = 1;
                    i34++;
                } else {
                    i19 = 1;
                }
                if (c0639m2.f7740a) {
                    i33 = i19;
                }
                i28 -= i18;
                iMax2 = Math.max(iMax2, childAt2.getMeasuredHeight());
                if (i18 == i19) {
                    j5 |= i19 << i32;
                }
                i31 = i35;
            }
            i32 += i19;
            paddingBottom = i17;
            size3 = i16;
        }
        int i37 = size3;
        int i38 = iMax2;
        boolean z8 = i33 != 0 && i31 == 2;
        int i39 = 0;
        while (i34 > 0 && i28 > 0) {
            int i40 = Integer.MAX_VALUE;
            int i41 = 0;
            int i42 = 0;
            long j6 = 0;
            while (i41 < childCount2) {
                int i43 = i39;
                C0639m c0639m4 = (C0639m) getChildAt(i41).getLayoutParams();
                int i44 = i38;
                if (c0639m4.f7743d) {
                    int i45 = c0639m4.f7741b;
                    if (i45 < i40) {
                        j6 = 1 << i41;
                        i40 = i45;
                        i42 = 1;
                    } else if (i45 == i40) {
                        i42++;
                        j6 |= 1 << i41;
                    }
                }
                i41++;
                i38 = i44;
                i39 = i43;
            }
            i11 = i39;
            i12 = i38;
            int i46 = 1;
            j5 |= j6;
            if (i42 > i28) {
                i9 = mode;
                i10 = i26;
                i13 = 1;
                break;
            }
            int i47 = i40 + 1;
            int i48 = 0;
            while (i48 < childCount2) {
                View childAt3 = getChildAt(i48);
                C0639m c0639m5 = (C0639m) childAt3.getLayoutParams();
                int i49 = mode;
                int i50 = i26;
                long j7 = i46 << i48;
                if ((j6 & j7) == 0) {
                    if (c0639m5.f7741b == i47) {
                        j5 |= j7;
                    }
                    r22 = 1;
                } else {
                    if (z8 && c0639m5.f7744e) {
                        r22 = 1;
                        r22 = 1;
                        if (i28 == 1) {
                            childAt3.setPadding(i8 + i30, 0, i8, 0);
                        }
                    } else {
                        r22 = 1;
                    }
                    c0639m5.f7741b += r22 == true ? 1 : 0;
                    c0639m5.f = r22;
                    i28--;
                }
                i48 += r22;
                i46 = r22;
                mode = i49;
                i26 = i50;
            }
            i39 = i46;
            i38 = i12;
            mode = mode;
        }
        i9 = mode;
        i10 = i26;
        i11 = i39;
        i12 = i38;
        i13 = 1;
        int i51 = (i33 == 0 && i31 == i13) ? i13 : 0;
        if (i28 > 0 && j5 != 0 && (i28 < i31 - i13 || i51 != 0 || iMax > i13)) {
            float fBitCount = Long.bitCount(j5);
            if (i51 == 0) {
                if ((j5 & 1) != 0 && !((C0639m) getChildAt(0).getLayoutParams()).f7744e) {
                    fBitCount -= 0.5f;
                }
                int i52 = childCount2 - 1;
                if ((j5 & (1 << i52)) != 0 && !((C0639m) getChildAt(i52).getLayoutParams()).f7744e) {
                    fBitCount -= 0.5f;
                }
            }
            int i53 = fBitCount > 0.0f ? (int) ((i28 * i30) / fBitCount) : 0;
            int i54 = 0;
            while (i54 < childCount2) {
                if ((j5 & (1 << i54)) == 0) {
                    i15 = 1;
                } else {
                    View childAt4 = getChildAt(i54);
                    C0639m c0639m6 = (C0639m) childAt4.getLayoutParams();
                    if (childAt4 instanceof ActionMenuItemView) {
                        c0639m6.f7742c = i53;
                        c0639m6.f = true;
                        if (i54 == 0 && !c0639m6.f7744e) {
                            ((LinearLayout.LayoutParams) c0639m6).leftMargin = (-i53) / 2;
                        }
                        i15 = 1;
                        i11 = 1;
                    } else if (c0639m6.f7740a) {
                        c0639m6.f7742c = i53;
                        i15 = 1;
                        c0639m6.f = true;
                        ((LinearLayout.LayoutParams) c0639m6).rightMargin = (-i53) / 2;
                        i11 = 1;
                    } else {
                        i15 = 1;
                        if (i54 != 0) {
                            ((LinearLayout.LayoutParams) c0639m6).leftMargin = i53 / 2;
                        }
                        if (i54 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c0639m6).rightMargin = i53 / 2;
                        }
                    }
                }
                i54 += i15;
            }
        }
        if (i11 != 0) {
            int i55 = 0;
            while (i55 < childCount2) {
                View childAt5 = getChildAt(i55);
                C0639m c0639m7 = (C0639m) childAt5.getLayoutParams();
                if (c0639m7.f) {
                    childAt5.measure(View.MeasureSpec.makeMeasureSpec((c0639m7.f7741b * i30) + c0639m7.f7742c, 1073741824), childMeasureSpec);
                    i14 = 1;
                } else {
                    i14 = 1;
                }
                i55 += i14;
            }
        }
        setMeasuredDimension(i10, i9 != 1073741824 ? i12 : i37);
    }

    public void setExpandedActionViewsExclusive(boolean z4) {
        this.f3297w.f7705t = z4;
    }

    public void setOnMenuItemClickListener(InterfaceC0642n interfaceC0642n) {
        this.f3285D = interfaceC0642n;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0633k c0633k = this.f3297w;
        if (c0633k.f7689A) {
            return;
        }
        C0627i c0627i = c0633k.f7698l;
        if (c0627i != null) {
            ((C0661x) c0627i.f).setImageDrawable(drawable);
        } else {
            c0633k.n = true;
            c0633k.f7699m = drawable;
        }
    }

    public void setOverflowReserved(boolean z4) {
        this.f3296v = z4;
    }

    public void setPopupTheme(int i5) {
        if (this.f3295u != i5) {
            this.f3295u = i5;
            if (i5 == 0) {
                this.f3294t = getContext();
            } else {
                this.f3294t = new ContextThemeWrapper(getContext(), i5);
            }
        }
    }

    public void setPresenter(C0633k c0633k) {
        this.f3297w = c0633k;
        c0633k.f7697k = this;
        this.f3293s = c0633k.f;
    }

    @Override // k.AbstractC0649q0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0639m(getContext(), attributeSet);
    }
}
