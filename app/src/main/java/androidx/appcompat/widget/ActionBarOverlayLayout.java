package androidx.appcompat.widget;

import B0.q;
import J.C0059p;
import J.F;
import J.H;
import J.InterfaceC0057n;
import J.InterfaceC0058o;
import J.P;
import J.g0;
import J.n0;
import J.p0;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.wssyncmldm.R;
import e1.AbstractC0415a;
import i.l;
import j.InterfaceC0503t;
import j.MenuC0492i;
import java.util.WeakHashMap;
import k.C0615e;
import k.C0633k;
import k.D1;
import k.I1;
import k.InterfaceC0612d;
import k.InterfaceC0613d0;
import k.InterfaceC0616e0;
import k.RunnableC0609c;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0613d0, InterfaceC0057n, InterfaceC0058o {
    public static final int[] E = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: A, reason: collision with root package name */
    public final q f3257A;

    /* renamed from: B, reason: collision with root package name */
    public final RunnableC0609c f3258B;

    /* renamed from: C, reason: collision with root package name */
    public final RunnableC0609c f3259C;

    /* renamed from: D, reason: collision with root package name */
    public final C0059p f3260D;

    /* renamed from: d, reason: collision with root package name */
    public int f3261d;

    /* renamed from: e, reason: collision with root package name */
    public int f3262e;
    public ContentFrameLayout f;

    /* renamed from: g, reason: collision with root package name */
    public ActionBarContainer f3263g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0616e0 f3264h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f3265i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3266j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3267k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3268l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3269m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public int f3270o;

    /* renamed from: p, reason: collision with root package name */
    public int f3271p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f3272q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f3273r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f3274s;

    /* renamed from: t, reason: collision with root package name */
    public p0 f3275t;

    /* renamed from: u, reason: collision with root package name */
    public p0 f3276u;

    /* renamed from: v, reason: collision with root package name */
    public p0 f3277v;

    /* renamed from: w, reason: collision with root package name */
    public p0 f3278w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC0612d f3279x;

    /* renamed from: y, reason: collision with root package name */
    public OverScroller f3280y;

    /* renamed from: z, reason: collision with root package name */
    public ViewPropertyAnimator f3281z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3262e = 0;
        this.f3272q = new Rect();
        this.f3273r = new Rect();
        this.f3274s = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        p0 p0Var = p0.f1480b;
        this.f3275t = p0Var;
        this.f3276u = p0Var;
        this.f3277v = p0Var;
        this.f3278w = p0Var;
        this.f3257A = new q(4, this);
        this.f3258B = new RunnableC0609c(this, 0);
        this.f3259C = new RunnableC0609c(this, 1);
        i(context);
        this.f3260D = new C0059p();
    }

    public static boolean g(View view, Rect rect, boolean z4) {
        boolean z5;
        C0615e c0615e = (C0615e) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) c0615e).leftMargin;
        int i6 = rect.left;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0615e).leftMargin = i6;
            z5 = true;
        } else {
            z5 = false;
        }
        int i7 = ((ViewGroup.MarginLayoutParams) c0615e).topMargin;
        int i8 = rect.top;
        if (i7 != i8) {
            ((ViewGroup.MarginLayoutParams) c0615e).topMargin = i8;
            z5 = true;
        }
        int i9 = ((ViewGroup.MarginLayoutParams) c0615e).rightMargin;
        int i10 = rect.right;
        if (i9 != i10) {
            ((ViewGroup.MarginLayoutParams) c0615e).rightMargin = i10;
            z5 = true;
        }
        if (z4) {
            int i11 = ((ViewGroup.MarginLayoutParams) c0615e).bottomMargin;
            int i12 = rect.bottom;
            if (i11 != i12) {
                ((ViewGroup.MarginLayoutParams) c0615e).bottomMargin = i12;
                return true;
            }
        }
        return z5;
    }

    @Override // J.InterfaceC0057n
    public final void a(View view, View view2, int i5, int i6) {
        if (i6 == 0) {
            onNestedScrollAccepted(view, view2, i5);
        }
    }

    @Override // J.InterfaceC0057n
    public final void b(View view, int i5, int i6, int[] iArr, int i7) {
    }

    @Override // J.InterfaceC0057n
    public final void c(int i5, View view) {
        if (i5 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0615e;
    }

    @Override // J.InterfaceC0058o
    public final void d(View view, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
        e(view, i5, i6, i7, i8, i9);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f3265i == null || this.f3266j) {
            return;
        }
        if (this.f3263g.getVisibility() == 0) {
            translationY = (int) (this.f3263g.getTranslationY() + this.f3263g.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.f3265i.setBounds(0, translationY, getWidth(), this.f3265i.getIntrinsicHeight() + translationY);
        this.f3265i.draw(canvas);
    }

    @Override // J.InterfaceC0057n
    public final void e(View view, int i5, int i6, int i7, int i8, int i9) {
        if (i9 == 0) {
            onNestedScroll(view, i5, i6, i7, i8);
        }
    }

    @Override // J.InterfaceC0057n
    public final boolean f(View view, View view2, int i5, int i6) {
        return i6 == 0 && onStartNestedScroll(view, view2, i5);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0615e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0615e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f3263g;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0059p c0059p = this.f3260D;
        return c0059p.f1479b | c0059p.f1478a;
    }

    public CharSequence getTitle() {
        k();
        return ((I1) this.f3264h).f7507a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f3258B);
        removeCallbacks(this.f3259C);
        ViewPropertyAnimator viewPropertyAnimator = this.f3281z;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(E);
        this.f3261d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f3265i = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f3266j = context.getApplicationInfo().targetSdkVersion < 19;
        this.f3280y = new OverScroller(context);
    }

    public final void j(int i5) {
        k();
        if (i5 == 2) {
            ((I1) this.f3264h).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i5 == 5) {
            ((I1) this.f3264h).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i5 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0616e0 wrapper;
        if (this.f == null) {
            this.f = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f3263g = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC0616e0) {
                wrapper = (InterfaceC0616e0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f3264h = wrapper;
        }
    }

    public final void l(MenuC0492i menuC0492i, InterfaceC0503t interfaceC0503t) {
        k();
        I1 i12 = (I1) this.f3264h;
        C0633k c0633k = i12.f7518m;
        Toolbar toolbar = i12.f7507a;
        if (c0633k == null) {
            i12.f7518m = new C0633k(toolbar.getContext());
        }
        C0633k c0633k2 = i12.f7518m;
        c0633k2.f7694h = interfaceC0503t;
        if (menuC0492i == null && toolbar.f3495d == null) {
            return;
        }
        toolbar.f();
        MenuC0492i menuC0492i2 = toolbar.f3495d.f3293s;
        if (menuC0492i2 == menuC0492i) {
            return;
        }
        if (menuC0492i2 != null) {
            menuC0492i2.r(toolbar.f3485O);
            menuC0492i2.r(toolbar.f3486Q);
        }
        if (toolbar.f3486Q == null) {
            toolbar.f3486Q = new D1(toolbar);
        }
        c0633k2.f7705t = true;
        if (menuC0492i != null) {
            menuC0492i.b(c0633k2, toolbar.f3506m);
            menuC0492i.b(toolbar.f3486Q, toolbar.f3506m);
        } else {
            c0633k2.c(toolbar.f3506m, null);
            toolbar.f3486Q.c(toolbar.f3506m, null);
            c0633k2.f();
            toolbar.f3486Q.f();
        }
        toolbar.f3495d.setPopupTheme(toolbar.n);
        toolbar.f3495d.setPresenter(c0633k2);
        toolbar.f3485O = c0633k2;
        toolbar.x();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        p0 p0VarF = p0.f(windowInsets, this);
        boolean zG = g(this.f3263g, new Rect(p0VarF.b(), p0VarF.d(), p0VarF.c(), p0VarF.a()), false);
        WeakHashMap weakHashMap = P.f1421a;
        Rect rect = this.f3272q;
        H.b(this, p0VarF, rect);
        int i5 = rect.left;
        int i6 = rect.top;
        int i7 = rect.right;
        int i8 = rect.bottom;
        n0 n0Var = p0VarF.f1481a;
        p0 p0VarI = n0Var.i(i5, i6, i7, i8);
        this.f3275t = p0VarI;
        boolean z4 = true;
        if (!this.f3276u.equals(p0VarI)) {
            this.f3276u = this.f3275t;
            zG = true;
        }
        Rect rect2 = this.f3273r;
        if (rect2.equals(rect)) {
            z4 = zG;
        } else {
            rect2.set(rect);
        }
        if (z4) {
            requestLayout();
        }
        return n0Var.a().f1481a.c().f1481a.b().e();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = P.f1421a;
        F.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C0615e c0615e = (C0615e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i10 = ((ViewGroup.MarginLayoutParams) c0615e).leftMargin + paddingLeft;
                int i11 = ((ViewGroup.MarginLayoutParams) c0615e).topMargin + paddingTop;
                childAt.layout(i10, i11, measuredWidth + i10, measuredHeight + i11);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i6) {
        int measuredHeight;
        k();
        measureChildWithMargins(this.f3263g, i5, 0, i6, 0);
        C0615e c0615e = (C0615e) this.f3263g.getLayoutParams();
        int iMax = Math.max(0, this.f3263g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0615e).leftMargin + ((ViewGroup.MarginLayoutParams) c0615e).rightMargin);
        int iMax2 = Math.max(0, this.f3263g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0615e).topMargin + ((ViewGroup.MarginLayoutParams) c0615e).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f3263g.getMeasuredState());
        WeakHashMap weakHashMap = P.f1421a;
        boolean z4 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z4) {
            measuredHeight = this.f3261d;
            if (this.f3268l && this.f3263g.getTabContainer() != null) {
                measuredHeight += this.f3261d;
            }
        } else {
            measuredHeight = this.f3263g.getVisibility() != 8 ? this.f3263g.getMeasuredHeight() : 0;
        }
        Rect rect = this.f3272q;
        Rect rect2 = this.f3274s;
        rect2.set(rect);
        p0 p0Var = this.f3275t;
        this.f3277v = p0Var;
        if (this.f3267k || z4) {
            B.c cVarB = B.c.b(p0Var.b(), this.f3277v.d() + measuredHeight, this.f3277v.c(), this.f3277v.a());
            g0 g0Var = new g0(this.f3277v);
            g0Var.e(cVarB);
            this.f3277v = g0Var.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f3277v = p0Var.f1481a.i(0, measuredHeight, 0, 0);
        }
        g(this.f, rect2, true);
        if (!this.f3278w.equals(this.f3277v)) {
            p0 p0Var2 = this.f3277v;
            this.f3278w = p0Var2;
            P.b(this.f, p0Var2);
        }
        measureChildWithMargins(this.f, i5, 0, i6, 0);
        C0615e c0615e2 = (C0615e) this.f.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0615e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0615e2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0615e2).topMargin + ((ViewGroup.MarginLayoutParams) c0615e2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i5, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i6, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f5, boolean z4) {
        if (!this.f3269m || !z4) {
            return false;
        }
        this.f3280y.fling(0, 0, 0, (int) f5, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f3280y.getFinalY() > this.f3263g.getHeight()) {
            h();
            this.f3259C.run();
        } else {
            h();
            this.f3258B.run();
        }
        this.n = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f5) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i5, int i6, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i5, int i6, int i7, int i8) {
        int i9 = this.f3270o + i6;
        this.f3270o = i9;
        setActionBarHideOffset(i9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i5) {
        e.P p2;
        l lVar;
        this.f3260D.f1478a = i5;
        this.f3270o = getActionBarHideOffset();
        h();
        InterfaceC0612d interfaceC0612d = this.f3279x;
        if (interfaceC0612d == null || (lVar = (p2 = (e.P) interfaceC0612d).f6535s) == null) {
            return;
        }
        lVar.a();
        p2.f6535s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i5) {
        if ((i5 & 2) == 0 || this.f3263g.getVisibility() != 0) {
            return false;
        }
        return this.f3269m;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f3269m || this.n) {
            return;
        }
        if (this.f3270o <= this.f3263g.getHeight()) {
            h();
            postDelayed(this.f3258B, 600L);
        } else {
            h();
            postDelayed(this.f3259C, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i5) {
        super.onWindowSystemUiVisibilityChanged(i5);
        k();
        int i6 = this.f3271p ^ i5;
        this.f3271p = i5;
        boolean z4 = (i5 & 4) == 0;
        boolean z5 = (i5 & 256) != 0;
        InterfaceC0612d interfaceC0612d = this.f3279x;
        if (interfaceC0612d != null) {
            e.P p2 = (e.P) interfaceC0612d;
            p2.f6531o = !z5;
            if (z4 || !z5) {
                if (p2.f6532p) {
                    p2.f6532p = false;
                    p2.t(true);
                }
            } else if (!p2.f6532p) {
                p2.f6532p = true;
                p2.t(true);
            }
        }
        if ((i6 & 256) == 0 || this.f3279x == null) {
            return;
        }
        WeakHashMap weakHashMap = P.f1421a;
        F.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i5) {
        super.onWindowVisibilityChanged(i5);
        this.f3262e = i5;
        InterfaceC0612d interfaceC0612d = this.f3279x;
        if (interfaceC0612d != null) {
            ((e.P) interfaceC0612d).n = i5;
        }
    }

    public void setActionBarHideOffset(int i5) {
        h();
        this.f3263g.setTranslationY(-Math.max(0, Math.min(i5, this.f3263g.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0612d interfaceC0612d) {
        this.f3279x = interfaceC0612d;
        if (getWindowToken() != null) {
            ((e.P) this.f3279x).n = this.f3262e;
            int i5 = this.f3271p;
            if (i5 != 0) {
                onWindowSystemUiVisibilityChanged(i5);
                WeakHashMap weakHashMap = P.f1421a;
                F.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z4) {
        this.f3268l = z4;
    }

    public void setHideOnContentScrollEnabled(boolean z4) {
        if (z4 != this.f3269m) {
            this.f3269m = z4;
            if (z4) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i5) {
        k();
        I1 i12 = (I1) this.f3264h;
        i12.f7510d = i5 != 0 ? AbstractC0415a.r(i12.f7507a.getContext(), i5) : null;
        i12.c();
    }

    public void setLogo(int i5) {
        k();
        I1 i12 = (I1) this.f3264h;
        i12.f7511e = i5 != 0 ? AbstractC0415a.r(i12.f7507a.getContext(), i5) : null;
        i12.c();
    }

    public void setOverlayMode(boolean z4) {
        this.f3267k = z4;
        this.f3266j = z4 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z4) {
    }

    public void setUiOptions(int i5) {
    }

    @Override // k.InterfaceC0613d0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((I1) this.f3264h).f7516k = callback;
    }

    @Override // k.InterfaceC0613d0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        I1 i12 = (I1) this.f3264h;
        if (i12.f7512g) {
            return;
        }
        i12.f7513h = charSequence;
        if ((i12.f7508b & 8) != 0) {
            Toolbar toolbar = i12.f7507a;
            toolbar.setTitle(charSequence);
            if (i12.f7512g) {
                P.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0615e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        I1 i12 = (I1) this.f3264h;
        i12.f7510d = drawable;
        i12.c();
    }
}
