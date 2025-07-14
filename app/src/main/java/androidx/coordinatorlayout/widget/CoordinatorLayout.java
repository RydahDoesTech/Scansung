package androidx.coordinatorlayout.widget;

import E0.b;
import I.d;
import J.C0059p;
import J.F;
import J.H;
import J.InterfaceC0057n;
import J.InterfaceC0058o;
import J.M;
import J.P;
import J.p0;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import b0.C0198c;
import com.google.firebase.messaging.q;
import com.samsung.android.knox.ex.peripheral.PeripheralConstants;
import com.wssyncmldm.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import o.C0713k;
import v.AbstractC0885a;
import w.AbstractC0899a;
import w.InterfaceC0900b;
import w.c;
import w.e;
import w.f;
import w.g;
import z.AbstractC0938a;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0057n, InterfaceC0058o {

    /* renamed from: A, reason: collision with root package name */
    public static final b f3543A;

    /* renamed from: B, reason: collision with root package name */
    public static final d f3544B;

    /* renamed from: x, reason: collision with root package name */
    public static final String f3545x;

    /* renamed from: y, reason: collision with root package name */
    public static final Class[] f3546y;

    /* renamed from: z, reason: collision with root package name */
    public static final ThreadLocal f3547z;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3548d;

    /* renamed from: e, reason: collision with root package name */
    public final q f3549e;
    public final ArrayList f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f3550g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f3551h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3552i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3553j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f3554k;

    /* renamed from: l, reason: collision with root package name */
    public View f3555l;

    /* renamed from: m, reason: collision with root package name */
    public View f3556m;
    public View n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f3557o;

    /* renamed from: p, reason: collision with root package name */
    public e f3558p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3559q;

    /* renamed from: r, reason: collision with root package name */
    public p0 f3560r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3561s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f3562t;

    /* renamed from: u, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f3563u;

    /* renamed from: v, reason: collision with root package name */
    public C0198c f3564v;

    /* renamed from: w, reason: collision with root package name */
    public final C0059p f3565w;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f3545x = r02 != null ? r02.getName() : null;
        f3543A = new b(8);
        f3546y = new Class[]{Context.class, AttributeSet.class};
        f3547z = new ThreadLocal();
        f3544B = new d(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f3548d = new ArrayList();
        this.f3549e = new q(19);
        this.f = new ArrayList();
        this.f3550g = new int[2];
        this.f3551h = new int[2];
        this.f3557o = true;
        this.f3565w = new C0059p();
        int[] iArr = AbstractC0885a.f9195a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        WeakHashMap weakHashMap = P.f1421a;
        M.d(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f3554k = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i5 = 0; i5 < length; i5++) {
                this.f3554k[i5] = (int) (r1[i5] * f);
            }
        }
        this.f3562t = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        x();
        super.setOnHierarchyChangeListener(new c(this));
        WeakHashMap weakHashMap2 = P.f1421a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f3544B.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i5, Rect rect, Rect rect2, w.d dVar, int i6, int i7) {
        int i8 = dVar.f9272c;
        if (i8 == 0) {
            i8 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i8, i5);
        int i9 = dVar.f9273d;
        if ((i9 & 7) == 0) {
            i9 |= 8388611;
        }
        if ((i9 & 112) == 0) {
            i9 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i9, i5);
        int i10 = absoluteGravity & 7;
        int i11 = absoluteGravity & 112;
        int i12 = absoluteGravity2 & 7;
        int i13 = absoluteGravity2 & 112;
        int iWidth = i12 != 1 ? i12 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i13 != 16 ? i13 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i10 == 1) {
            iWidth -= i6 / 2;
        } else if (i10 != 5) {
            iWidth -= i6;
        }
        if (i11 == 16) {
            iHeight -= i7 / 2;
        } else if (i11 != 80) {
            iHeight -= i7;
        }
        rect2.set(iWidth, iHeight, i6 + iWidth, i7 + iHeight);
    }

    public static w.d n(View view) {
        w.d dVar = (w.d) view.getLayoutParams();
        if (!dVar.f9271b) {
            InterfaceC0900b interfaceC0900b = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC0900b = (InterfaceC0900b) superclass.getAnnotation(InterfaceC0900b.class);
                if (interfaceC0900b != null) {
                    break;
                }
            }
            if (interfaceC0900b != null) {
                try {
                    AbstractC0899a abstractC0899a = (AbstractC0899a) interfaceC0900b.value().getDeclaredConstructor(null).newInstance(null);
                    AbstractC0899a abstractC0899a2 = dVar.f9270a;
                    if (abstractC0899a2 != abstractC0899a) {
                        if (abstractC0899a2 != null) {
                            abstractC0899a2.f();
                        }
                        dVar.f9270a = abstractC0899a;
                        dVar.f9271b = true;
                        if (abstractC0899a != null) {
                            abstractC0899a.d(dVar);
                        }
                    }
                } catch (Exception e5) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC0900b.value().getName() + " could not be instantiated. Did you forget a default constructor?", e5);
                }
            }
            dVar.f9271b = true;
        }
        return dVar;
    }

    public static void v(int i5, View view) {
        w.d dVar = (w.d) view.getLayoutParams();
        int i6 = dVar.f9277i;
        if (i6 != i5) {
            WeakHashMap weakHashMap = P.f1421a;
            view.offsetLeftAndRight(i5 - i6);
            dVar.f9277i = i5;
        }
    }

    public static void w(int i5, View view) {
        w.d dVar = (w.d) view.getLayoutParams();
        int i6 = dVar.f9278j;
        if (i6 != i5) {
            WeakHashMap weakHashMap = P.f1421a;
            view.offsetTopAndBottom(i5 - i6);
            dVar.f9278j = i5;
        }
    }

    @Override // J.InterfaceC0057n
    public final void a(View view, View view2, int i5, int i6) {
        C0059p c0059p = this.f3565w;
        if (i6 == 1) {
            c0059p.f1479b = i5;
        } else {
            c0059p.f1478a = i5;
        }
        this.f3556m = view2;
        this.n = view2;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            ((w.d) getChildAt(i7).getLayoutParams()).getClass();
        }
    }

    @Override // J.InterfaceC0057n
    public final void b(View view, int i5, int i6, int[] iArr, int i7) {
        AbstractC0899a abstractC0899a;
        int childCount = getChildCount();
        boolean z4 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                w.d dVar = (w.d) childAt.getLayoutParams();
                if (dVar.a(i7) && (abstractC0899a = dVar.f9270a) != null) {
                    int[] iArr2 = this.f3550g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0899a.k(this, childAt, view, i5, i6, iArr2, i7);
                    iMax = i5 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i6 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z4 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z4) {
            p(1);
        }
    }

    @Override // J.InterfaceC0057n
    public final void c(int i5, View view) {
        C0059p c0059p = this.f3565w;
        if (i5 == 1) {
            c0059p.f1479b = 0;
        } else {
            c0059p.f1478a = 0;
        }
        this.n = view;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            w.d dVar = (w.d) childAt.getLayoutParams();
            if (dVar.a(i5)) {
                AbstractC0899a abstractC0899a = dVar.f9270a;
                if (abstractC0899a != null) {
                    abstractC0899a.q(this, childAt, view, i5);
                }
                if (i5 == 0) {
                    dVar.f9281m = false;
                } else if (i5 == 1) {
                    dVar.n = false;
                }
            }
        }
        this.f3556m = null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof w.d) && super.checkLayoutParams(layoutParams);
    }

    @Override // J.InterfaceC0058o
    public final void d(View view, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
        AbstractC0899a abstractC0899a;
        boolean z4;
        int iMin;
        int childCount = getChildCount();
        boolean z5 = false;
        int iMax = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                w.d dVar = (w.d) childAt.getLayoutParams();
                if (dVar.a(i9) && (abstractC0899a = dVar.f9270a) != null) {
                    int[] iArr2 = this.f3550g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0899a.l(this, childAt, view, i5, i6, i7, i8, i9, iArr2);
                    iMax = i7 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    if (i8 > 0) {
                        z4 = true;
                        iMin = Math.max(i10, iArr2[1]);
                    } else {
                        z4 = true;
                        iMin = Math.min(i10, iArr2[1]);
                    }
                    i10 = iMin;
                    z5 = z4;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + i10;
        if (z5) {
            p(1);
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            AbstractC0899a abstractC0899a = ((w.d) getChildAt(childCount).getLayoutParams()).f9270a;
            if (abstractC0899a != null) {
                abstractC0899a.a(motionEvent);
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f3557o && (keyEvent.getKeyCode() == 61 || keyEvent.getKeyCode() == 19 || keyEvent.getKeyCode() == 20 || keyEvent.getKeyCode() == 21 || keyEvent.getKeyCode() == 22)) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                getChildAt(i5);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j5) {
        AbstractC0899a abstractC0899a = ((w.d) view.getLayoutParams()).f9270a;
        if (abstractC0899a != null) {
            abstractC0899a.getClass();
        }
        return super.drawChild(canvas, view, j5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3562t;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // J.InterfaceC0057n
    public final void e(View view, int i5, int i6, int i7, int i8, int i9) {
        d(view, i5, i6, i7, i8, 0, this.f3551h);
    }

    @Override // J.InterfaceC0057n
    public final boolean f(View view, View view2, int i5, int i6) {
        int childCount = getChildCount();
        boolean z4 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                w.d dVar = (w.d) childAt.getLayoutParams();
                AbstractC0899a abstractC0899a = dVar.f9270a;
                if (abstractC0899a != null) {
                    boolean zP = abstractC0899a.p(this, childAt, view, view2, i5, i6);
                    z4 |= zP;
                    if (i6 == 0) {
                        dVar.f9281m = zP;
                    } else if (i6 == 1) {
                        dVar.n = zP;
                    }
                } else if (i6 == 0) {
                    dVar.f9281m = false;
                } else if (i6 == 1) {
                    dVar.n = false;
                }
            }
        }
        return z4;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new w.d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new w.d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        t();
        return Collections.unmodifiableList(this.f3548d);
    }

    public final p0 getLastWindowInsets() {
        return this.f3560r;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0059p c0059p = this.f3565w;
        return c0059p.f1479b | c0059p.f1478a;
    }

    public Drawable getStatusBarBackground() {
        return this.f3562t;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(w.d dVar, Rect rect, int i5, int i6) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i5) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i6) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin));
        rect.set(iMax, iMax2, i5 + iMax, i6 + iMax2);
    }

    public final void i(View view, Rect rect, boolean z4) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z4) {
            k(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final List j(View view) {
        C0713k c0713k = (C0713k) this.f3549e.f;
        int i5 = c0713k.f;
        ArrayList arrayList = null;
        for (int i6 = 0; i6 < i5; i6++) {
            ArrayList arrayList2 = (ArrayList) c0713k.j(i6);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c0713k.h(i6));
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public final void k(Rect rect, View view) {
        ThreadLocal threadLocal = g.f9284a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = g.f9284a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        g.a(this, view, matrix);
        ThreadLocal threadLocal3 = g.f9285b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i5) {
        int[] iArr = this.f3554k;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i5);
            return 0;
        }
        if (i5 >= 0 && i5 < iArr.length) {
            return iArr[i5];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i5 + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i5, int i6) {
        d dVar = f3544B;
        Rect rectG = g();
        k(rectG, view);
        try {
            return rectG.contains(i5, i6);
        } finally {
            rectG.setEmpty();
            dVar.c(rectG);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
        if (this.f3559q) {
            if (this.f3558p == null) {
                this.f3558p = new e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3558p);
        }
        if (this.f3560r == null) {
            WeakHashMap weakHashMap = P.f1421a;
            if (getFitsSystemWindows()) {
                F.c(this);
            }
        }
        this.f3553j = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
        if (this.f3559q && this.f3558p != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3558p);
        }
        View view = this.f3556m;
        if (view != null) {
            this.n = view;
            c(0, view);
        }
        this.f3553j = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f3561s || this.f3562t == null) {
            return;
        }
        p0 p0Var = this.f3560r;
        int iD = p0Var != null ? p0Var.d() : 0;
        if (iD > 0) {
            this.f3562t.setBounds(0, 0, getWidth(), iD);
            this.f3562t.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount);
            }
            u();
        }
        boolean zS = s(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3555l = null;
            u();
        }
        return zS;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        AbstractC0899a abstractC0899a;
        WeakHashMap weakHashMap = P.f1421a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f3548d;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            View view = (View) arrayList.get(i9);
            if (view.getVisibility() != 8 && ((abstractC0899a = ((w.d) view.getLayoutParams()).f9270a) == null || !abstractC0899a.h(this, view, layoutDirection))) {
                q(layoutDirection, view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0189  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r33, int r34) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f5, boolean z4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                w.d dVar = (w.d) childAt.getLayoutParams();
                if (dVar.a(0)) {
                    AbstractC0899a abstractC0899a = dVar.f9270a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f5) {
        AbstractC0899a abstractC0899a;
        int childCount = getChildCount();
        boolean zJ = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                w.d dVar = (w.d) childAt.getLayoutParams();
                if (dVar.a(0) && (abstractC0899a = dVar.f9270a) != null) {
                    zJ |= abstractC0899a.j(childAt, view, f5);
                }
            }
        }
        return zJ;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i5, int i6, int[] iArr) {
        b(view, i5, i6, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i5, int i6, int i7, int i8) {
        e(view, i5, i6, i7, i8, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i5) {
        a(view, view2, i5, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f2363d);
        SparseArray sparseArray = fVar.f;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int id = childAt.getId();
            AbstractC0899a abstractC0899a = n(childAt).f9270a;
            if (id != -1 && abstractC0899a != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC0899a.n(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableO;
        f fVar = new f(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int id = childAt.getId();
            AbstractC0899a abstractC0899a = ((w.d) childAt.getLayoutParams()).f9270a;
            if (id != -1 && abstractC0899a != null && (parcelableO = abstractC0899a.o(childAt)) != null) {
                sparseArray.append(id, parcelableO);
            }
        }
        fVar.f = sparseArray;
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i5) {
        return f(view, view2, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c(0, view);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zS;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.f3555l;
        boolean z4 = false;
        if (view != null) {
            AbstractC0899a abstractC0899a = ((w.d) view.getLayoutParams()).f9270a;
            zS = abstractC0899a != null ? abstractC0899a.r(this, this.f3555l, motionEvent) : false;
        } else {
            zS = s(motionEvent, 1);
            if (actionMasked != 0 && zS) {
                z4 = true;
            }
        }
        if (this.f3555l == null || actionMasked == 3) {
            zS |= super.onTouchEvent(motionEvent);
        } else if (z4) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            super.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3555l = null;
            u();
        }
        return zS;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x004b A[EDGE_INSN: B:134:0x004b->B:10:0x004b BREAK  A[LOOP:2: B:122:0x02db->B:127:0x02f2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(int r26) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(int i5, View view) {
        Rect rectG;
        Rect rectG2;
        w.d dVar = (w.d) view.getLayoutParams();
        View view2 = dVar.f9279k;
        if (view2 == null && dVar.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        d dVar2 = f3544B;
        if (view2 != null) {
            rectG = g();
            rectG2 = g();
            try {
                k(rectG, view2);
                w.d dVar3 = (w.d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i5, rectG, rectG2, dVar3, measuredWidth, measuredHeight);
                h(dVar3, rectG2, measuredWidth, measuredHeight);
                view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
                return;
            } finally {
                rectG.setEmpty();
                dVar2.c(rectG);
                rectG2.setEmpty();
                dVar2.c(rectG2);
            }
        }
        int i6 = dVar.f9274e;
        if (i6 < 0) {
            w.d dVar4 = (w.d) view.getLayoutParams();
            rectG = g();
            rectG.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) dVar4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) dVar4).bottomMargin);
            if (this.f3560r != null) {
                WeakHashMap weakHashMap = P.f1421a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectG.left = this.f3560r.b() + rectG.left;
                    rectG.top = this.f3560r.d() + rectG.top;
                    rectG.right -= this.f3560r.c();
                    rectG.bottom -= this.f3560r.a();
                }
            }
            rectG2 = g();
            int i7 = dVar4.f9272c;
            if ((i7 & 7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            Gravity.apply(i7, view.getMeasuredWidth(), view.getMeasuredHeight(), rectG, rectG2, i5);
            view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
            return;
        }
        w.d dVar5 = (w.d) view.getLayoutParams();
        int i8 = dVar5.f9272c;
        if (i8 == 0) {
            i8 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i8, i5);
        int i9 = absoluteGravity & 7;
        int i10 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i5 == 1) {
            i6 = width - i6;
        }
        int iM = m(i6) - measuredWidth2;
        if (i9 == 1) {
            iM += measuredWidth2 / 2;
        } else if (i9 == 5) {
            iM += measuredWidth2;
        }
        int i11 = i10 != 16 ? i10 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar5).leftMargin, Math.min(iM, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) dVar5).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar5).topMargin, Math.min(i11, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) dVar5).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final boolean r(AbstractC0899a abstractC0899a, View view, MotionEvent motionEvent, int i5) {
        if (i5 == 0) {
            return abstractC0899a.g(this, view, motionEvent);
        }
        if (i5 == 1) {
            return abstractC0899a.r(this, view, motionEvent);
        }
        throw new IllegalArgumentException();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        AbstractC0899a abstractC0899a = ((w.d) view.getLayoutParams()).f9270a;
        if (abstractC0899a != null) {
            abstractC0899a.m(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        super.requestDisallowInterceptTouchEvent(z4);
        if (!z4 || this.f3552i) {
            return;
        }
        if (this.f3555l == null) {
            int childCount = getChildCount();
            MotionEvent motionEventObtain = null;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                AbstractC0899a abstractC0899a = ((w.d) childAt.getLayoutParams()).f9270a;
                if (abstractC0899a != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    abstractC0899a.g(this, childAt, motionEventObtain);
                }
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
        }
        u();
        this.f3552i = true;
    }

    public final boolean s(MotionEvent motionEvent, int i5) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i6 = childCount - 1; i6 >= 0; i6--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i6) : i6));
        }
        b bVar = f3543A;
        if (bVar != null) {
            Collections.sort(arrayList, bVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zR = false;
        for (int i7 = 0; i7 < size; i7++) {
            View view = (View) arrayList.get(i7);
            AbstractC0899a abstractC0899a = ((w.d) view.getLayoutParams()).f9270a;
            if (zR && actionMasked != 0) {
                if (abstractC0899a != null) {
                    if (motionEventObtain == null) {
                        motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction(3);
                    }
                    r(abstractC0899a, view, motionEventObtain, i5);
                }
            } else if (!zR && abstractC0899a != null && (zR = r(abstractC0899a, view, motionEvent, i5))) {
                this.f3555l = view;
                if (actionMasked != 3 && actionMasked != 1) {
                    for (int i8 = 0; i8 < i7; i8++) {
                        View view2 = (View) arrayList.get(i8);
                        AbstractC0899a abstractC0899a2 = ((w.d) view2.getLayoutParams()).f9270a;
                        if (abstractC0899a2 != null) {
                            if (motionEventObtain == null) {
                                motionEventObtain = MotionEvent.obtain(motionEvent);
                                motionEventObtain.setAction(3);
                            }
                            r(abstractC0899a2, view2, motionEventObtain, i5);
                        }
                    }
                }
            }
        }
        arrayList.clear();
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        return zR;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z4) {
        super.setFitsSystemWindows(z4);
        x();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f3563u = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f3562t;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f3562t = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f3562t.setState(getDrawableState());
                }
                Drawable drawable3 = this.f3562t;
                WeakHashMap weakHashMap = P.f1421a;
                C.b.b(drawable3, getLayoutDirection());
                this.f3562t.setVisible(getVisibility() == 0, false);
                this.f3562t.setCallback(this);
            }
            WeakHashMap weakHashMap2 = P.f1421a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i5) {
        setStatusBarBackground(new ColorDrawable(i5));
    }

    public void setStatusBarBackgroundResource(int i5) {
        setStatusBarBackground(i5 != 0 ? AbstractC0938a.b(getContext(), i5) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        boolean z4 = i5 == 0;
        Drawable drawable = this.f3562t;
        if (drawable == null || drawable.isVisible() == z4) {
            return;
        }
        this.f3562t.setVisible(z4, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.t():void");
    }

    public final void u() {
        View view = this.f3555l;
        if (view != null) {
            AbstractC0899a abstractC0899a = ((w.d) view.getLayoutParams()).f9270a;
            if (abstractC0899a != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                abstractC0899a.r(this, this.f3555l, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.f3555l = null;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            ((w.d) getChildAt(i5).getLayoutParams()).getClass();
        }
        this.f3552i = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3562t;
    }

    public final void x() {
        WeakHashMap weakHashMap = P.f1421a;
        if (!getFitsSystemWindows()) {
            H.u(this, null);
            return;
        }
        if (this.f3564v == null) {
            this.f3564v = new C0198c(this);
        }
        H.u(this, this.f3564v);
        setSystemUiVisibility(PeripheralConstants.ErrorCode.ERROR_PLUGIN_CUSTOM_BASE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof w.d ? new w.d((w.d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new w.d((ViewGroup.MarginLayoutParams) layoutParams) : new w.d(layoutParams);
    }
}
