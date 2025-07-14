package androidx.appcompat.widget;

import J.C0053j;
import J.InterfaceC0049f;
import J.InterfaceC0055l;
import J.M;
import J.P;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.T;
import c.AbstractC0220a;
import com.wssyncmldm.R;
import e.J;
import e1.AbstractC0415a;
import i.j;
import j.C0494k;
import j.MenuC0492i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k.A1;
import k.B1;
import k.C0633k;
import k.C0659w;
import k.C0661x;
import k.D1;
import k.E1;
import k.F0;
import k.F1;
import k.G1;
import k.I1;
import k.InterfaceC0616e0;
import k.J1;
import k.M1;
import k.RunnableC0634k0;
import k.ViewOnClickListenerC0606b;
import k.z1;
import r0.AbstractC0807a;
import r0.AbstractC0808b;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC0049f {
    public static final /* synthetic */ int g0 = 0;

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f3472A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f3473B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f3474C;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f3475D;
    public boolean E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f3476F;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f3477G;

    /* renamed from: H, reason: collision with root package name */
    public final ArrayList f3478H;

    /* renamed from: I, reason: collision with root package name */
    public final int[] f3479I;

    /* renamed from: J, reason: collision with root package name */
    public final C0053j f3480J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f3481K;

    /* renamed from: L, reason: collision with root package name */
    public F1 f3482L;

    /* renamed from: M, reason: collision with root package name */
    public final B1 f3483M;

    /* renamed from: N, reason: collision with root package name */
    public I1 f3484N;

    /* renamed from: O, reason: collision with root package name */
    public C0633k f3485O;

    /* renamed from: Q, reason: collision with root package name */
    public D1 f3486Q;

    /* renamed from: R, reason: collision with root package name */
    public A1.c f3487R;

    /* renamed from: T, reason: collision with root package name */
    public J f3488T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f3489U;

    /* renamed from: V, reason: collision with root package name */
    public OnBackInvokedCallback f3490V;

    /* renamed from: W, reason: collision with root package name */
    public OnBackInvokedDispatcher f3491W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3492a0;

    /* renamed from: b0, reason: collision with root package name */
    public final RunnableC0634k0 f3493b0;

    /* renamed from: c0, reason: collision with root package name */
    public final CharSequence f3494c0;

    /* renamed from: d, reason: collision with root package name */
    public ActionMenuView f3495d;

    /* renamed from: d0, reason: collision with root package name */
    public Drawable f3496d0;

    /* renamed from: e, reason: collision with root package name */
    public AppCompatTextView f3497e;

    /* renamed from: e0, reason: collision with root package name */
    public final int f3498e0;
    public AppCompatTextView f;

    /* renamed from: f0, reason: collision with root package name */
    public A1 f3499f0;

    /* renamed from: g, reason: collision with root package name */
    public C0659w f3500g;

    /* renamed from: h, reason: collision with root package name */
    public C0661x f3501h;

    /* renamed from: i, reason: collision with root package name */
    public final Drawable f3502i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f3503j;

    /* renamed from: k, reason: collision with root package name */
    public C0659w f3504k;

    /* renamed from: l, reason: collision with root package name */
    public View f3505l;

    /* renamed from: m, reason: collision with root package name */
    public Context f3506m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public int f3507o;

    /* renamed from: p, reason: collision with root package name */
    public int f3508p;

    /* renamed from: q, reason: collision with root package name */
    public final int f3509q;

    /* renamed from: r, reason: collision with root package name */
    public int f3510r;

    /* renamed from: s, reason: collision with root package name */
    public int f3511s;

    /* renamed from: t, reason: collision with root package name */
    public int f3512t;

    /* renamed from: u, reason: collision with root package name */
    public int f3513u;

    /* renamed from: v, reason: collision with root package name */
    public int f3514v;

    /* renamed from: w, reason: collision with root package name */
    public F0 f3515w;

    /* renamed from: x, reason: collision with root package name */
    public int f3516x;

    /* renamed from: y, reason: collision with root package name */
    public int f3517y;

    /* renamed from: z, reason: collision with root package name */
    public final int f3518z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i5 = 0; i5 < menu.size(); i5++) {
            arrayList.add(menu.getItem(i5));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new j(getContext());
    }

    public static E1 h() {
        E1 e12 = new E1(-2, -2);
        e12.f7490b = 0;
        e12.f7489a = 8388627;
        return e12;
    }

    public static E1 i(ViewGroup.LayoutParams layoutParams) {
        boolean z4 = layoutParams instanceof E1;
        if (z4) {
            E1 e12 = (E1) layoutParams;
            E1 e13 = new E1(e12);
            e13.f7490b = 0;
            e13.f7490b = e12.f7490b;
            return e13;
        }
        if (z4) {
            E1 e14 = new E1((E1) layoutParams);
            e14.f7490b = 0;
            return e14;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            E1 e15 = new E1(layoutParams);
            e15.f7490b = 0;
            return e15;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        E1 e16 = new E1(marginLayoutParams);
        e16.f7490b = 0;
        ((ViewGroup.MarginLayoutParams) e16).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) e16).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) e16).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) e16).bottomMargin = marginLayoutParams.bottomMargin;
        return e16;
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i5) {
        WeakHashMap weakHashMap = P.f1421a;
        boolean z4 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, getLayoutDirection());
        arrayList.clear();
        if (!z4) {
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                E1 e12 = (E1) childAt.getLayoutParams();
                if (e12.f7490b == 0 && v(childAt) && j(e12.f7489a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int i7 = childCount - 1; i7 >= 0; i7--) {
            View childAt2 = getChildAt(i7);
            E1 e13 = (E1) childAt2.getLayoutParams();
            if (e13.f7490b == 0 && v(childAt2) && j(e13.f7489a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    @Override // J.InterfaceC0049f
    public final void addMenuProvider(InterfaceC0055l interfaceC0055l) {
        C0053j c0053j = this.f3480J;
        c0053j.f1468b.add(interfaceC0055l);
        c0053j.f1467a.run();
    }

    public final void b(View view, boolean z4) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            E1 e1H = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (E1) layoutParams;
            e1H.f7490b = 1;
            if (z4 && this.f3505l != null) {
                view.setLayoutParams(e1H);
                this.f3478H.add(view);
            } else if (view.getParent() == null) {
                addView(view, e1H);
            }
        }
    }

    public final void c() {
        if (this.f3504k == null) {
            C0659w c0659w = new C0659w(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f3504k = c0659w;
            c0659w.setImageDrawable(this.f3502i);
            this.f3504k.setContentDescription(this.f3503j);
            E1 e1H = h();
            e1H.f7489a = (this.f3509q & 112) | 8388611;
            e1H.f7490b = 2;
            this.f3504k.setLayoutParams(e1H);
            this.f3504k.setOnClickListener(new ViewOnClickListenerC0606b(1, this));
            AbstractC0808b.m(AbstractC0807a.b(), this.f3504k);
            if (TextUtils.isEmpty(this.f3503j)) {
                return;
            }
            J1.a(this.f3504k, this.f3503j);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof E1);
    }

    public final void d() {
        if (this.f3515w == null) {
            F0 f02 = new F0();
            f02.f7491a = 0;
            f02.f7492b = 0;
            f02.f7493c = Integer.MIN_VALUE;
            f02.f7494d = Integer.MIN_VALUE;
            f02.f7495e = 0;
            f02.f = 0;
            f02.f7496g = false;
            f02.f7497h = false;
            this.f3515w = f02;
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f3495d;
        if (actionMenuView.f3293s == null) {
            MenuC0492i menuC0492i = (MenuC0492i) actionMenuView.getMenu();
            if (this.f3486Q == null) {
                this.f3486Q = new D1(this);
            }
            this.f3495d.setExpandedActionViewsExclusive(true);
            menuC0492i.b(this.f3486Q, this.f3506m);
            x();
        }
    }

    public final void f() {
        if (this.f3495d == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f3495d = actionMenuView;
            actionMenuView.setPopupTheme(this.n);
            this.f3495d.setOnMenuItemClickListener(this.f3483M);
            ActionMenuView actionMenuView2 = this.f3495d;
            A1.c cVar = this.f3487R;
            B1 b12 = new B1(this);
            actionMenuView2.f3298x = cVar;
            actionMenuView2.f3299y = b12;
            E1 e1H = h();
            e1H.f7489a = (this.f3509q & 112) | 8388613;
            this.f3495d.setLayoutParams(e1H);
            b(this.f3495d, false);
        }
    }

    public final void g() {
        if (this.f3500g == null) {
            this.f3500g = new C0659w(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            E1 e1H = h();
            e1H.f7489a = (this.f3509q & 112) | 8388611;
            this.f3500g.setLayoutParams(e1H);
            AbstractC0808b.m(AbstractC0807a.b(), this.f3500g);
            CharSequence charSequence = this.f3494c0;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            J1.a(this.f3500g, charSequence);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0659w c0659w = this.f3504k;
        if (c0659w != null) {
            return c0659w.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0659w c0659w = this.f3504k;
        if (c0659w != null) {
            return c0659w.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        F0 f02 = this.f3515w;
        if (f02 != null) {
            return f02.f7496g ? f02.f7491a : f02.f7492b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i5 = this.f3517y;
        return i5 != Integer.MIN_VALUE ? i5 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        F0 f02 = this.f3515w;
        if (f02 != null) {
            return f02.f7491a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        F0 f02 = this.f3515w;
        if (f02 != null) {
            return f02.f7492b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        F0 f02 = this.f3515w;
        if (f02 != null) {
            return f02.f7496g ? f02.f7492b : f02.f7491a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i5 = this.f3516x;
        return i5 != Integer.MIN_VALUE ? i5 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC0492i menuC0492i;
        ActionMenuView actionMenuView = this.f3495d;
        return (actionMenuView == null || (menuC0492i = actionMenuView.f3293s) == null || !menuC0492i.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f3517y, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = P.f1421a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = P.f1421a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f3516x, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0661x c0661x = this.f3501h;
        if (c0661x != null) {
            return c0661x.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0661x c0661x = this.f3501h;
        if (c0661x != null) {
            return c0661x.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f3495d.getMenu();
    }

    public View getNavButtonView() {
        return this.f3500g;
    }

    public CharSequence getNavigationContentDescription() {
        C0659w c0659w = this.f3500g;
        if (c0659w != null) {
            return c0659w.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0659w c0659w = this.f3500g;
        if (c0659w != null) {
            return c0659w.getDrawable();
        }
        return null;
    }

    public C0633k getOuterActionMenuPresenter() {
        return this.f3485O;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f3495d.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f3506m;
    }

    public int getPopupTheme() {
        return this.n;
    }

    public CharSequence getSubtitle() {
        return this.f3473B;
    }

    public final TextView getSubtitleTextView() {
        return this.f;
    }

    public CharSequence getTitle() {
        return this.f3472A;
    }

    public int getTitleMarginBottom() {
        return this.f3514v;
    }

    public int getTitleMarginEnd() {
        return this.f3512t;
    }

    public int getTitleMarginStart() {
        return this.f3511s;
    }

    public int getTitleMarginTop() {
        return this.f3513u;
    }

    public final TextView getTitleTextView() {
        return this.f3497e;
    }

    public InterfaceC0616e0 getWrapper() {
        if (this.f3484N == null) {
            this.f3484N = new I1(this, true);
        }
        return this.f3484N;
    }

    public final int j(int i5) {
        WeakHashMap weakHashMap = P.f1421a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    public final int k(int i5, View view) {
        E1 e12 = (E1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i6 = i5 > 0 ? (measuredHeight - i5) / 2 : 0;
        int i7 = e12.f7489a & 112;
        if (i7 != 16 && i7 != 48 && i7 != 80) {
            i7 = this.f3518z & 112;
        }
        if (i7 == 48) {
            return getPaddingTop();
        }
        if (i7 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) e12).bottomMargin) - i6;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i8 = ((ViewGroup.MarginLayoutParams) e12).topMargin;
        if (iMax < i8) {
            iMax = i8;
        } else {
            int i9 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i10 = ((ViewGroup.MarginLayoutParams) e12).bottomMargin;
            if (i9 < i10) {
                iMax = Math.max(0, iMax - (i10 - i9));
            }
        }
        return paddingTop + iMax;
    }

    public void n(int i5) {
        getMenuInflater().inflate(i5, getMenu());
    }

    public final void o() {
        Iterator it = this.f3481K.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        C0053j c0053j = this.f3480J;
        Iterator it2 = c0053j.f1468b.iterator();
        while (it2.hasNext()) {
            ((T) ((InterfaceC0055l) it2.next())).f3741a.j(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f3481K = currentMenuItems2;
        c0053j.b(menu);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() throws Resources.NotFoundException {
        super.onAttachedToWindow();
        x();
        int dimensionPixelSize = this.f3498e0;
        if (dimensionPixelSize == -1) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.sesl_action_bar_top_padding);
        }
        setPadding(0, dimensionPixelSize, 0, 0);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(AbstractC0220a.f5120j);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, 0);
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = dimensionPixelSize2 + dimensionPixelSize;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) throws Resources.NotFoundException {
        C0633k c0633k;
        C0633k c0633k2;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(AbstractC0220a.f5120j);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, 0);
        if (this.f3500g != null) {
            typedArrayObtainStyledAttributes.recycle();
            typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0220a.f5110C, R.attr.actionOverflowButtonStyle, 0);
            this.f3500g.setMinimumHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        int dimensionPixelSize2 = this.f3498e0;
        if (dimensionPixelSize2 == -1) {
            dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.sesl_action_bar_top_padding);
        }
        setPadding(0, dimensionPixelSize2, 0, 0);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = dimensionPixelSize + dimensionPixelSize2;
        setLayoutParams(layoutParams);
        TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(null, AbstractC0220a.f5109B, android.R.attr.toolbarStyle, 0);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(14, -1);
        if (dimensionPixelSize3 >= -1) {
            this.f3510r = dimensionPixelSize3;
        }
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize4 >= -1) {
            setMinimumHeight(dimensionPixelSize4);
        }
        typedArrayObtainStyledAttributes2.recycle();
        ActionMenuView actionMenuView = this.f3495d;
        if (actionMenuView == null || (c0633k = actionMenuView.f3297w) == null || !c0633k.j() || (c0633k2 = this.f3495d.f3297w) == null) {
            return;
        }
        c0633k2.i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f3493b0);
        x();
        if (this.f3499f0 != null) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.f3499f0);
            this.f3499f0 = null;
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3476F = false;
        }
        if (!this.f3476F) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f3476F = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3476F = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02b4 A[LOOP:0: B:109:0x02b2->B:110:0x02b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d1 A[LOOP:1: B:112:0x02cf->B:113:0x02d1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ef A[LOOP:2: B:115:0x02ed->B:116:0x02ef, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x033e A[LOOP:3: B:124:0x033c->B:125:0x033e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 847
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i6) throws Resources.NotFoundException {
        int iL;
        int iMax;
        int iCombineMeasuredStates;
        int iL2;
        int iM;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean zA = M1.a(this);
        int i7 = !zA ? 1 : 0;
        int i8 = 0;
        if (v(this.f3500g)) {
            u(this.f3500g, i5, 0, i6, this.f3510r);
            iL = l(this.f3500g) + this.f3500g.getMeasuredWidth();
            int iMax3 = Math.max(0, m(this.f3500g) + this.f3500g.getMeasuredHeight());
            int iCombineMeasuredStates3 = View.combineMeasuredStates(0, this.f3500g.getMeasuredState());
            Drawable drawable = this.f3500g.getDrawable();
            Drawable background = this.f3500g.getBackground();
            if (drawable != null && background != null) {
                int paddingLeft = (this.f3500g.getPaddingLeft() - this.f3500g.getPaddingRight()) / 2;
                C.a.f(background, paddingLeft, 0, paddingLeft + iL, iMax3);
            }
            iMax = iMax3;
            iCombineMeasuredStates = iCombineMeasuredStates3;
        } else {
            iL = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (v(this.f3504k)) {
            u(this.f3504k, i5, 0, i6, this.f3510r);
            iL = l(this.f3504k) + this.f3504k.getMeasuredWidth();
            iMax = Math.max(iMax, m(this.f3504k) + this.f3504k.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3504k.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax4 = Math.max(currentContentInsetStart, iL);
        int iMax5 = Math.max(0, currentContentInsetStart - iL);
        int[] iArr = this.f3479I;
        iArr[zA ? 1 : 0] = iMax5;
        if (v(this.f3495d)) {
            u(this.f3495d, i5, iMax4, i6, this.f3510r);
            iL2 = l(this.f3495d) + this.f3495d.getMeasuredWidth();
            iMax = Math.max(iMax, m(this.f3495d) + this.f3495d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3495d.getMeasuredState());
        } else {
            iL2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax6 = iMax4 + Math.max(currentContentInsetEnd, iL2);
        iArr[i7] = Math.max(0, currentContentInsetEnd - iL2);
        if (v(this.f3505l)) {
            iMax6 += t(this.f3505l, i5, iMax6, i6, 0, iArr);
            iMax = Math.max(iMax, m(this.f3505l) + this.f3505l.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3505l.getMeasuredState());
        }
        if (v(this.f3501h)) {
            iMax6 += t(this.f3501h, i5, iMax6, i6, 0, iArr);
            iMax = Math.max(iMax, m(this.f3501h) + this.f3501h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3501h.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (((E1) childAt.getLayoutParams()).f7490b == 0 && v(childAt)) {
                iMax6 += t(childAt, i5, iMax6, i6, 0, iArr);
                iMax = Math.max(iMax, m(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i10 = this.f3513u + this.f3514v;
        int i11 = this.f3511s + this.f3512t;
        if (v(this.f3497e)) {
            Context context = getContext();
            int i12 = this.f3507o;
            int[] iArr2 = AbstractC0220a.f5108A;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, iArr2);
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(0);
            float dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.sesl_toolbar_title_text_size);
            if (!TextUtils.isEmpty(this.f3473B)) {
                dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.sesl_toolbar_title_text_size_with_subtitle);
            }
            if (typedValuePeekValue != null && TextUtils.isEmpty(this.f3473B)) {
                dimensionPixelSize = TypedValue.complexToFloat(typedValuePeekValue.data);
            }
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(this.f3508p, iArr2);
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes2.peekValue(0);
            typedArrayObtainStyledAttributes2.recycle();
            float dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.sesl_toolbar_subtitle_text_size);
            if (typedValuePeekValue2 != null) {
                dimensionPixelSize2 = TypedValue.complexToFloat(typedValuePeekValue2.data);
            }
            float f = getContext().getResources().getConfiguration().fontScale;
            if (f > 1.2f) {
                f = 1.2f;
            }
            if (dimensionPixelSize == -1.0f || !TextUtils.isEmpty(this.f3473B)) {
                this.f3497e.setTextSize(0, dimensionPixelSize * f);
                this.f.setTextSize(1, dimensionPixelSize2 * f);
            } else {
                this.f3497e.setTextSize(1, dimensionPixelSize * f);
            }
            t(this.f3497e, i5, iMax6 + i11, i6, i10, iArr);
            int iL3 = l(this.f3497e) + this.f3497e.getMeasuredWidth();
            iM = m(this.f3497e) + this.f3497e.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f3497e.getMeasuredState());
            iMax2 = iL3;
        } else {
            iM = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (v(this.f)) {
            iMax2 = Math.max(iMax2, t(this.f, i5, iMax6 + i11, i6, iM + i10, iArr));
            iM += m(this.f) + this.f.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iM);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax6 + iMax2, getSuggestedMinimumWidth()), i5, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i6, iCombineMeasuredStates2 << 16);
        if (!this.f3489U) {
            i8 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (v(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i8 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i8);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof G1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        G1 g12 = (G1) parcelable;
        super.onRestoreInstanceState(g12.f2363d);
        ActionMenuView actionMenuView = this.f3495d;
        MenuC0492i menuC0492i = actionMenuView != null ? actionMenuView.f3293s : null;
        int i5 = g12.f;
        if (i5 != 0 && this.f3486Q != null && menuC0492i != null && (menuItemFindItem = menuC0492i.findItem(i5)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (g12.f7498g) {
            RunnableC0634k0 runnableC0634k0 = this.f3493b0;
            removeCallbacks(runnableC0634k0);
            post(runnableC0634k0);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i5) {
        super.onRtlPropertiesChanged(i5);
        d();
        F0 f02 = this.f3515w;
        boolean z4 = i5 == 1;
        if (z4 == f02.f7496g) {
            return;
        }
        f02.f7496g = z4;
        if (!f02.f7497h) {
            f02.f7491a = f02.f7495e;
            f02.f7492b = f02.f;
            return;
        }
        if (z4) {
            int i6 = f02.f7494d;
            if (i6 == Integer.MIN_VALUE) {
                i6 = f02.f7495e;
            }
            f02.f7491a = i6;
            int i7 = f02.f7493c;
            if (i7 == Integer.MIN_VALUE) {
                i7 = f02.f;
            }
            f02.f7492b = i7;
            return;
        }
        int i8 = f02.f7493c;
        if (i8 == Integer.MIN_VALUE) {
            i8 = f02.f7495e;
        }
        f02.f7491a = i8;
        int i9 = f02.f7494d;
        if (i9 == Integer.MIN_VALUE) {
            i9 = f02.f;
        }
        f02.f7492b = i9;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0494k c0494k;
        G1 g12 = new G1(super.onSaveInstanceState());
        D1 d1 = this.f3486Q;
        if (d1 != null && (c0494k = d1.f7486e) != null) {
            g12.f = c0494k.f6982a;
        }
        g12.f7498g = q();
        return g12;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.E = false;
        }
        if (!this.E) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.E = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.E = false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, k.A1] */
    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i5) {
        super.onWindowVisibilityChanged(i5);
        if (i5 != 0) {
            if (this.f3499f0 != null) {
                getViewTreeObserver().removeOnGlobalLayoutListener(this.f3499f0);
                this.f3499f0 = null;
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver == 0 || this.f3499f0 != null) {
            return;
        }
        ?? r02 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: k.A1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                int i6 = Toolbar.g0;
                Toolbar toolbar = this.f7473d;
                toolbar.getClass();
                toolbar.post(new A.o(toolbar, 18, toolbar));
            }
        };
        this.f3499f0 = r02;
        viewTreeObserver.addOnGlobalLayoutListener(r02);
    }

    public final boolean p(View view) {
        return view.getParent() == this || this.f3478H.contains(view);
    }

    public final boolean q() {
        C0633k c0633k;
        ActionMenuView actionMenuView = this.f3495d;
        return (actionMenuView == null || (c0633k = actionMenuView.f3297w) == null || !c0633k.j()) ? false : true;
    }

    public final int r(View view, int i5, int i6, int[] iArr) {
        E1 e12 = (E1) view.getLayoutParams();
        int i7 = ((ViewGroup.MarginLayoutParams) e12).leftMargin - iArr[0];
        int iMax = Math.max(0, i7) + i5;
        iArr[0] = Math.max(0, -i7);
        int iK = k(i6, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iK, iMax + measuredWidth, view.getMeasuredHeight() + iK);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) e12).rightMargin + iMax;
    }

    @Override // J.InterfaceC0049f
    public final void removeMenuProvider(InterfaceC0055l interfaceC0055l) {
        this.f3480J.c(interfaceC0055l);
    }

    public final int s(View view, int i5, int i6, int[] iArr) {
        E1 e12 = (E1) view.getLayoutParams();
        int i7 = ((ViewGroup.MarginLayoutParams) e12).rightMargin - iArr[1];
        int iMax = i5 - Math.max(0, i7);
        iArr[1] = Math.max(0, -i7);
        int iK = k(i6, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iK, iMax, view.getMeasuredHeight() + iK);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) e12).leftMargin);
    }

    public void setBackInvokedCallbackEnabled(boolean z4) {
        if (this.f3492a0 != z4) {
            this.f3492a0 = z4;
            x();
        }
    }

    public void setCollapseContentDescription(int i5) {
        setCollapseContentDescription(i5 != 0 ? getContext().getText(i5) : null);
    }

    public void setCollapseIcon(int i5) {
        setCollapseIcon(AbstractC0415a.r(getContext(), i5));
    }

    public void setCollapsible(boolean z4) {
        this.f3489U = z4;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i5) {
        if (i5 < 0) {
            i5 = Integer.MIN_VALUE;
        }
        if (i5 != this.f3517y) {
            this.f3517y = i5;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i5) {
        if (i5 < 0) {
            i5 = Integer.MIN_VALUE;
        }
        if (i5 != this.f3516x) {
            this.f3516x = i5;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i5) {
        setLogo(AbstractC0415a.r(getContext(), i5));
    }

    public void setLogoDescription(int i5) {
        setLogoDescription(getContext().getText(i5));
    }

    public void setNavigationContentDescription(int i5) {
        setNavigationContentDescription(i5 != 0 ? getContext().getText(i5) : null);
    }

    public void setNavigationIcon(int i5) {
        setNavigationIcon(AbstractC0415a.r(getContext(), i5));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f3500g.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(F1 f12) {
        this.f3482L = f12;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f3495d.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i5) {
        if (this.n != i5) {
            this.n = i5;
            if (i5 == 0) {
                this.f3506m = getContext();
            } else {
                this.f3506m = new ContextThemeWrapper(getContext(), i5);
            }
        }
    }

    public void setSubtitle(int i5) {
        setSubtitle(getContext().getText(i5));
    }

    public void setSubtitleTextColor(int i5) {
        setSubtitleTextColor(ColorStateList.valueOf(i5));
    }

    public void setTitle(int i5) {
        setTitle(getContext().getText(i5));
    }

    public void setTitleAccessibilityEnabled(boolean z4) {
        if (z4) {
            AppCompatTextView appCompatTextView = this.f3497e;
            if (appCompatTextView != null) {
                appCompatTextView.setImportantForAccessibility(1);
            }
            AppCompatTextView appCompatTextView2 = this.f;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setImportantForAccessibility(1);
                return;
            }
            return;
        }
        AppCompatTextView appCompatTextView3 = this.f3497e;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setImportantForAccessibility(2);
        }
        AppCompatTextView appCompatTextView4 = this.f;
        if (appCompatTextView4 != null) {
            appCompatTextView4.setImportantForAccessibility(2);
        }
    }

    public void setTitleMarginBottom(int i5) {
        this.f3514v = i5;
        requestLayout();
    }

    public void setTitleMarginEnd(int i5) {
        this.f3512t = i5;
        requestLayout();
    }

    public void setTitleMarginStart(int i5) {
        this.f3511s = i5;
        requestLayout();
    }

    public void setTitleMarginTop(int i5) {
        this.f3513u = i5;
        requestLayout();
    }

    public void setTitleTextColor(int i5) {
        setTitleTextColor(ColorStateList.valueOf(i5));
    }

    public final int t(View view, int i5, int i6, int i7, int i8, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i9 = marginLayoutParams.leftMargin - iArr[0];
        int i10 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i10) + Math.max(0, i9);
        iArr[0] = Math.max(0, -i9);
        iArr[1] = Math.max(0, -i10);
        view.measure(ViewGroup.getChildMeasureSpec(i5, getPaddingRight() + getPaddingLeft() + iMax + i6, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i7, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i8, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void u(View view, int i5, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i6, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i7, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i8 >= 0) {
            if (mode != 0) {
                i8 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i8);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean v(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean w() {
        C0633k c0633k;
        ActionMenuView actionMenuView = this.f3495d;
        return (actionMenuView == null || (c0633k = actionMenuView.f3297w) == null || !c0633k.l()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x() {
        /*
            r4 = this;
            r0 = 0
            android.window.OnBackInvokedDispatcher r1 = k.C1.a(r4)
            k.D1 r2 = r4.f3486Q
            if (r2 == 0) goto L1d
            j.k r2 = r2.f7486e
            if (r2 == 0) goto L1d
            if (r1 == 0) goto L1d
            java.util.WeakHashMap r2 = J.P.f1421a
            boolean r2 = r4.isAttachedToWindow()
            if (r2 == 0) goto L1d
            boolean r2 = r4.f3492a0
            if (r2 == 0) goto L1d
            r2 = 1
            goto L1e
        L1d:
            r2 = r0
        L1e:
            if (r2 == 0) goto L3b
            android.window.OnBackInvokedDispatcher r3 = r4.f3491W
            if (r3 != 0) goto L3b
            android.window.OnBackInvokedCallback r2 = r4.f3490V
            if (r2 != 0) goto L33
            k.z1 r2 = new k.z1
            r2.<init>(r4, r0)
            android.window.OnBackInvokedCallback r0 = k.C1.b(r2)
            r4.f3490V = r0
        L33:
            android.window.OnBackInvokedCallback r0 = r4.f3490V
            k.C1.c(r1, r0)
            r4.f3491W = r1
            goto L49
        L3b:
            if (r2 != 0) goto L49
            android.window.OnBackInvokedDispatcher r0 = r4.f3491W
            if (r0 == 0) goto L49
            android.window.OnBackInvokedCallback r1 = r4.f3490V
            k.C1.d(r0, r1)
            r0 = 0
            r4.f3491W = r0
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.x():void");
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f3518z = 8388627;
        this.f3477G = new ArrayList();
        this.f3478H = new ArrayList();
        this.f3479I = new int[2];
        this.f3480J = new C0053j(new z1(this, 1));
        this.f3481K = new ArrayList();
        this.f3483M = new B1(this);
        this.f3493b0 = new RunnableC0634k0(2, this);
        this.f3498e0 = -1;
        Context context2 = getContext();
        int[] iArr = AbstractC0220a.f5109B;
        D3.c cVarL = D3.c.l(context2, attributeSet, iArr, R.attr.toolbarStyle);
        WeakHashMap weakHashMap = P.f1421a;
        M.d(this, context, iArr, attributeSet, (TypedArray) cVarL.f, R.attr.toolbarStyle, 0);
        TypedArray typedArray = (TypedArray) cVarL.f;
        this.f3507o = typedArray.getResourceId(29, 0);
        this.f3508p = typedArray.getResourceId(20, 0);
        this.f3518z = typedArray.getInteger(0, 8388627);
        this.f3509q = typedArray.getInteger(3, 48);
        Drawable drawableG = cVarL.g(2);
        this.f3494c0 = typedArray.getText(31);
        setBackground(drawableG);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(23, 0);
        this.f3514v = dimensionPixelOffset;
        this.f3513u = dimensionPixelOffset;
        this.f3512t = dimensionPixelOffset;
        this.f3511s = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f3511s = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f3512t = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(27, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f3513u = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f3514v = dimensionPixelOffset5;
        }
        this.f3510r = typedArray.getDimensionPixelSize(14, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(8, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(9, 0);
        d();
        F0 f02 = this.f3515w;
        f02.f7497h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            f02.f7495e = dimensionPixelSize;
            f02.f7491a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            f02.f = dimensionPixelSize2;
            f02.f7492b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            f02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f3516x = typedArray.getDimensionPixelOffset(11, Integer.MIN_VALUE);
        this.f3517y = typedArray.getDimensionPixelOffset(7, Integer.MIN_VALUE);
        this.f3502i = cVarL.g(5);
        this.f3503j = typedArray.getText(4);
        CharSequence text = typedArray.getText(22);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(19);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f3506m = getContext();
        setPopupTheme(typedArray.getResourceId(18, 0));
        Drawable drawableG2 = cVarL.g(17);
        if (drawableG2 != null) {
            setNavigationIcon(drawableG2);
        }
        CharSequence text3 = typedArray.getText(16);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableG3 = cVarL.g(12);
        if (drawableG3 != null) {
            setLogo(drawableG3);
        }
        CharSequence text4 = typedArray.getText(13);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(30)) {
            setTitleTextColor(cVarL.f(30));
        }
        if (typedArray.hasValue(21)) {
            setSubtitleTextColor(cVarL.f(21));
        }
        if (typedArray.hasValue(15)) {
            n(typedArray.getResourceId(15, 0));
        }
        cVarL.m();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        E1 e12 = new E1(context, attributeSet);
        e12.f7489a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0220a.f5113b);
        e12.f7489a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        e12.f7490b = 0;
        return e12;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0659w c0659w = this.f3504k;
        if (c0659w != null) {
            c0659w.setContentDescription(charSequence);
            J1.a(this.f3504k, charSequence);
            this.f3503j = charSequence;
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f3504k.setImageDrawable(drawable);
        } else {
            C0659w c0659w = this.f3504k;
            if (c0659w != null) {
                c0659w.setImageDrawable(this.f3502i);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f3501h == null) {
                this.f3501h = new C0661x(getContext(), null, 0);
            }
            if (!p(this.f3501h)) {
                b(this.f3501h, true);
            }
        } else {
            C0661x c0661x = this.f3501h;
            if (c0661x != null && p(c0661x)) {
                removeView(this.f3501h);
                this.f3478H.remove(this.f3501h);
            }
        }
        C0661x c0661x2 = this.f3501h;
        if (c0661x2 != null) {
            c0661x2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f3501h == null) {
            this.f3501h = new C0661x(getContext(), null, 0);
        }
        C0661x c0661x = this.f3501h;
        if (c0661x != null) {
            c0661x.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C0659w c0659w = this.f3500g;
        if (c0659w != null) {
            c0659w.setContentDescription(charSequence);
            J1.a(this.f3500g, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!p(this.f3500g)) {
                b(this.f3500g, true);
            }
        } else {
            C0659w c0659w = this.f3500g;
            if (c0659w != null && p(c0659w)) {
                removeView(this.f3500g);
                this.f3478H.remove(this.f3500g);
            }
        }
        C0659w c0659w2 = this.f3500g;
        if (c0659w2 != null) {
            c0659w2.setImageDrawable(drawable);
            this.f3496d0 = drawable;
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f;
            if (appCompatTextView != null && p(appCompatTextView)) {
                removeView(this.f);
                this.f3478H.remove(this.f);
            }
        } else {
            if (this.f == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.f = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f.setEllipsize(TextUtils.TruncateAt.END);
                int i5 = this.f3508p;
                if (i5 != 0) {
                    this.f.setTextAppearance(context, i5);
                }
                ColorStateList colorStateList = this.f3475D;
                if (colorStateList != null) {
                    this.f.setTextColor(colorStateList);
                }
            }
            if (!p(this.f)) {
                b(this.f, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f3473B = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f3475D = colorStateList;
        AppCompatTextView appCompatTextView = this.f;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f3497e;
            if (appCompatTextView != null && p(appCompatTextView)) {
                removeView(this.f3497e);
                this.f3478H.remove(this.f3497e);
            }
        } else {
            if (this.f3497e == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.f3497e = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f3497e.setEllipsize(TextUtils.TruncateAt.END);
                int i5 = this.f3507o;
                if (i5 != 0) {
                    this.f3497e.setTextAppearance(context, i5);
                }
                ColorStateList colorStateList = this.f3474C;
                if (colorStateList != null) {
                    this.f3497e.setTextColor(colorStateList);
                }
            }
            if (!p(this.f3497e)) {
                b(this.f3497e, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f3497e;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f3472A = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f3474C = colorStateList;
        AppCompatTextView appCompatTextView = this.f3497e;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }
}
