package androidx.viewpager.widget;

import B1.e;
import E0.a;
import E0.b;
import E0.c;
import E0.d;
import E0.f;
import E0.g;
import E0.h;
import E0.i;
import E0.j;
import J.H;
import J.P;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.PathInterpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.picker.widget.C0168f;
import androidx.picker.widget.C0169g;
import androidx.picker.widget.F;
import androidx.picker.widget.HandlerC0165c;
import androidx.picker.widget.SeslDatePicker;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.fotaagent.enabler.interfaces.IDMEnablerInterface;
import com.samsung.android.knox.custom.CustomDeviceManager;
import com.samsung.android.knox.net.nap.NetworkAnalyticsConstants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.WeakHashMap;
import z.AbstractC0938a;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int[] g0 = {R.attr.layout_gravity};

    /* renamed from: h0, reason: collision with root package name */
    public static final b f4925h0 = new b(0);

    /* renamed from: i0, reason: collision with root package name */
    public static final c f4926i0 = new c(0);

    /* renamed from: A, reason: collision with root package name */
    public final int f4927A;

    /* renamed from: B, reason: collision with root package name */
    public int f4928B;

    /* renamed from: C, reason: collision with root package name */
    public final int f4929C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f4930D;
    public float E;

    /* renamed from: F, reason: collision with root package name */
    public float f4931F;

    /* renamed from: G, reason: collision with root package name */
    public float f4932G;

    /* renamed from: H, reason: collision with root package name */
    public float f4933H;

    /* renamed from: I, reason: collision with root package name */
    public int f4934I;

    /* renamed from: J, reason: collision with root package name */
    public VelocityTracker f4935J;

    /* renamed from: K, reason: collision with root package name */
    public final int f4936K;

    /* renamed from: L, reason: collision with root package name */
    public final int f4937L;

    /* renamed from: M, reason: collision with root package name */
    public final int f4938M;

    /* renamed from: N, reason: collision with root package name */
    public final int f4939N;

    /* renamed from: O, reason: collision with root package name */
    public final EdgeEffect f4940O;

    /* renamed from: Q, reason: collision with root package name */
    public final EdgeEffect f4941Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f4942R;

    /* renamed from: T, reason: collision with root package name */
    public boolean f4943T;

    /* renamed from: U, reason: collision with root package name */
    public int f4944U;

    /* renamed from: V, reason: collision with root package name */
    public h f4945V;

    /* renamed from: W, reason: collision with root package name */
    public final A1.h f4946W;

    /* renamed from: a0, reason: collision with root package name */
    public int f4947a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f4948b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f4949c0;

    /* renamed from: d, reason: collision with root package name */
    public int f4950d;

    /* renamed from: d0, reason: collision with root package name */
    public final float f4951d0;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f4952e;

    /* renamed from: e0, reason: collision with root package name */
    public int f4953e0;
    public final f f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f4954f0;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f4955g;

    /* renamed from: h, reason: collision with root package name */
    public a f4956h;

    /* renamed from: i, reason: collision with root package name */
    public int f4957i;

    /* renamed from: j, reason: collision with root package name */
    public int f4958j;

    /* renamed from: k, reason: collision with root package name */
    public Parcelable f4959k;

    /* renamed from: l, reason: collision with root package name */
    public final Scroller f4960l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4961m;
    public i n;

    /* renamed from: o, reason: collision with root package name */
    public int f4962o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f4963p;

    /* renamed from: q, reason: collision with root package name */
    public int f4964q;

    /* renamed from: r, reason: collision with root package name */
    public int f4965r;

    /* renamed from: s, reason: collision with root package name */
    public float f4966s;

    /* renamed from: t, reason: collision with root package name */
    public float f4967t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4968u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4969v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4970w;

    /* renamed from: x, reason: collision with root package name */
    public int f4971x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4972y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4973z;

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4952e = new ArrayList();
        this.f = new f();
        this.f4955g = new Rect();
        this.f4958j = -1;
        this.f4966s = -3.4028235E38f;
        this.f4967t = Float.MAX_VALUE;
        this.f4971x = 1;
        this.f4930D = true;
        this.f4934I = -1;
        this.f4942R = true;
        this.f4946W = new A1.h(1, this);
        this.f4947a0 = 0;
        this.f4948b0 = false;
        this.f4949c0 = false;
        this.f4951d0 = 0.5f;
        this.f4953e0 = -1;
        this.f4954f0 = false;
        setWillNotDraw(false);
        setDescendantFocusability(NetworkAnalyticsConstants.DataPoints.FLAG_PARENT_PROCESS_HASH);
        setFocusable(true);
        this.f4960l = new Scroller(context, f4926i0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f4929C = viewConfiguration.getScaledPagingTouchSlop();
        viewConfiguration.getScaledTouchSlop();
        viewConfiguration.getScaledPagingTouchSlop();
        this.f4936K = (int) (400.0f * f);
        this.f4937L = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f4940O = new EdgeEffect(context);
        this.f4941Q = new EdgeEffect(context);
        this.f4938M = (int) (25.0f * f);
        this.f4939N = (int) (2.0f * f);
        this.f4927A = (int) (f * 16.0f);
        P.h(this, new e(1, this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        H.u(this, new d(this));
    }

    public static boolean c(int i5, int i6, int i7, View view, boolean z4) {
        int i8;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i9 = i6 + scrollX;
                if (i9 >= childAt.getLeft() && i9 < childAt.getRight() && (i8 = i7 + scrollY) >= childAt.getTop() && i8 < childAt.getBottom() && c(i5, i9 - childAt.getLeft(), i8 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        return z4 && view.canScrollHorizontally(-i5);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private int getScrollStart() {
        return t() ? IDMEnablerInterface.FLAG_RECEIVER_INCLUDE_BACKGROUND - getScrollX() : getScrollX();
    }

    private void setScrollingCacheEnabled(boolean z4) {
        if (this.f4969v != z4) {
            this.f4969v = z4;
        }
    }

    public final f a(int i5, int i6) throws NoSuchMethodException, SecurityException {
        f fVar = new f();
        fVar.f522b = i5;
        a aVar = this.f4956h;
        aVar.getClass();
        C0169g c0169g = (C0169g) aVar;
        SeslDatePicker seslDatePicker = c0169g.f4472d;
        F f = new F(seslDatePicker.f4365e);
        f.setClickable(true);
        f.f4161a0 = seslDatePicker;
        f.f4163c0 = seslDatePicker;
        String strP = seslDatePicker.f4354Q;
        if (strP == null) {
            strP = V1.a.P();
        }
        for (int i7 = 0; i7 < 7; i7++) {
            char cCharAt = strP.charAt(i7);
            int i8 = (i7 + 2) % 7;
            int[] iArr = f.f4141A;
            if (cCharAt == 'R') {
                iArr[i8] = f.f4184w;
            } else if (cCharAt == 'B') {
                iArr[i8] = f.f4185x;
            } else {
                iArr[i8] = f.f4183v;
            }
        }
        int minMonth = seslDatePicker.getMinMonth() + i5;
        int minYear = (minMonth / 12) + seslDatePicker.getMinYear();
        int i9 = minMonth % 12;
        Calendar calendar = seslDatePicker.n;
        int i10 = (calendar.get(1) == minYear && calendar.get(2) == i9) ? calendar.get(5) : -1;
        Calendar calendar2 = seslDatePicker.f4378o;
        int i11 = calendar2.get(1);
        int i12 = calendar2.get(2);
        int i13 = calendar2.get(5);
        Calendar calendar3 = seslDatePicker.f4379p;
        f.j(i10, i9, minYear, seslDatePicker.getFirstDayOfWeek(), 1, 31, seslDatePicker.f4381r, seslDatePicker.f4383s, i11, i12, i13, 0, calendar3.get(1), calendar3.get(2), calendar3.get(5), 0, seslDatePicker.f4352N);
        if (i5 == 0) {
            f.f4165d0 = true;
        }
        if (i5 == seslDatePicker.f4351M - 1) {
            f.f4167e0 = true;
        }
        seslDatePicker.f4391y = 7;
        seslDatePicker.f4392z = f.f4145F;
        addView(f, 0);
        c0169g.f4471c.put(i5, f);
        fVar.f521a = f;
        this.f4956h.getClass();
        fVar.f524d = 1.0f;
        ArrayList arrayList = this.f4952e;
        if (i6 < 0 || i6 >= arrayList.size()) {
            arrayList.add(fVar);
        } else {
            arrayList.add(i6, fVar);
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i5, int i6) {
        f fVarG;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (childAt.getVisibility() == 0 && (fVarG = g(childAt)) != null && fVarG.f522b == this.f4957i) {
                    childAt.addFocusables(arrayList, i5, i6);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i6 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        f fVarG;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 0 && (fVarG = g(childAt)) != null && fVarG.f522b == this.f4957i) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        g gVar = (g) layoutParams;
        if (gVar != null) {
            boolean z4 = gVar.f526a | (view.getClass().getAnnotation(E0.e.class) != null);
            gVar.f526a = z4;
            if (!this.f4968u) {
                super.addView(view, i5, layoutParams);
            } else {
                if (z4) {
                    throw new IllegalStateException("Cannot add pager decor view during layout");
                }
                gVar.f529d = true;
                addViewInLayout(view, i5, layoutParams);
            }
        }
    }

    public final boolean b(int i5) throws NoSuchMethodException, Resources.NotFoundException, SecurityException {
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            for (ViewParent parent = viewFindFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                if (parent == this) {
                    break;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(viewFindFocus.getClass().getSimpleName());
            for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                sb.append(" => ");
                sb.append(parent2.getClass().getSimpleName());
            }
            Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i5);
        boolean zL = false;
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            Rect rect = this.f4955g;
            if (i5 == 17) {
                int i6 = f(rect, viewFindNextFocus).left;
                int i7 = f(rect, viewFindFocus).left;
                if (viewFindFocus == null || i6 < i7) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                    zL = zRequestFocus;
                } else {
                    int i8 = this.f4957i;
                    if (i8 > 0) {
                        u(i8 + this.f4953e0, true);
                        zL = true;
                    }
                }
            } else if (i5 == 66) {
                zRequestFocus = (viewFindFocus == null || f(rect, viewFindNextFocus).left > f(rect, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : l();
                zL = zRequestFocus;
            }
        } else if (i5 == 17 || i5 == 1) {
            int i9 = this.f4957i;
            if (i9 > 0) {
                u(i9 + this.f4953e0, true);
                zL = true;
            }
        } else if (i5 == 66 || i5 == 2) {
            zL = l();
        }
        if (zL) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i5));
        }
        return zL;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i5) {
        if (this.f4956h == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i5 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f4966s)) : i5 > 0 && scrollX < ((int) (((float) clientWidth) * this.f4967t));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() throws Resources.NotFoundException {
        this.f4961m = true;
        Scroller scroller = this.f4960l;
        if (scroller.isFinished() || !scroller.computeScrollOffset()) {
            d(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = scroller.getCurrX();
        int currY = scroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m(currX)) {
                scroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = P.f1421a;
        postInvalidateOnAnimation();
    }

    public final void d(boolean z4) throws Resources.NotFoundException {
        Scroller scroller = this.f4960l;
        boolean z5 = this.f4947a0 == 2;
        if (z5) {
            setScrollingCacheEnabled(false);
            if (!scroller.isFinished()) {
                scroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = scroller.getCurrX();
                int currY = scroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m(currX);
                    }
                }
            }
        }
        this.f4970w = false;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f4952e;
            if (i5 >= arrayList.size()) {
                break;
            }
            f fVar = (f) arrayList.get(i5);
            if (fVar.f523c) {
                fVar.f523c = false;
                z5 = true;
            }
            i5++;
        }
        if (z5) {
            A1.h hVar = this.f4946W;
            if (!z4) {
                hVar.run();
            } else {
                WeakHashMap weakHashMap = P.f1421a;
                postOnAnimation(hVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) throws java.lang.NoSuchMethodException, android.content.res.Resources.NotFoundException, java.lang.SecurityException {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L66
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L61
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L61
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r5 = r5.b(r4)
            goto L62
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L61
            boolean r5 = r5.b(r1)
            goto L62
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r5 = r5.l()
            goto L62
        L41:
            r6 = 66
            boolean r5 = r5.b(r6)
            goto L62
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L5a
            int r6 = r5.f4957i
            if (r6 <= 0) goto L61
            int r0 = r5.f4953e0
            int r6 = r6 + r0
            r5.u(r6, r1)
            r5 = r1
            goto L62
        L5a:
            r6 = 17
            boolean r5 = r5.b(r6)
            goto L62
        L61:
            r5 = r2
        L62:
            if (r5 == 0) goto L65
            goto L66
        L65:
            r1 = r2
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f fVarG;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 0 && (fVarG = g(childAt)) != null && fVarG.f522b == this.f4957i && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        a aVar;
        EdgeEffect edgeEffect = this.f4941Q;
        EdgeEffect edgeEffect2 = this.f4940O;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f4956h) != null && aVar.b() > 1)) {
            if (!edgeEffect2.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                if (t()) {
                    canvas.translate(getPaddingTop() + (-height), ((-(this.f4967t + 1.0f)) * width) + 1.6777216E7f);
                } else {
                    canvas.translate(getPaddingTop() + (-height), this.f4966s * width);
                }
                edgeEffect2.setSize(height, width);
                zDraw = edgeEffect2.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!edgeEffect.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                if (t()) {
                    canvas.translate(-getPaddingTop(), (this.f4966s * width2) - 1.6777216E7f);
                } else {
                    canvas.translate(-getPaddingTop(), (-(this.f4967t + 1.0f)) * width2);
                }
                edgeEffect.setSize(height2, width2);
                zDraw |= edgeEffect.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            edgeEffect2.finish();
            edgeEffect.finish();
        }
        if (zDraw) {
            WeakHashMap weakHashMap = P.f1421a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4963p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e() throws NoSuchMethodException, Resources.NotFoundException, SecurityException {
        int iB = this.f4956h.b();
        this.f4950d = iB;
        ArrayList arrayList = this.f4952e;
        boolean z4 = arrayList.size() < (this.f4971x * 2) + 1 && arrayList.size() < iB;
        int iMax = this.f4957i;
        boolean z5 = false;
        while (arrayList.size() > 0) {
            f fVar = (f) arrayList.get(0);
            a aVar = this.f4956h;
            F f = fVar.f521a;
            aVar.getClass();
            arrayList.remove(0);
            if (!z5) {
                a aVar2 = this.f4956h;
                aVar2.getClass();
                PathInterpolator pathInterpolator = SeslDatePicker.f4339v0;
                ((C0169g) aVar2).f4472d.getClass();
                z5 = true;
            }
            this.f4956h.a(this, fVar.f522b, fVar.f521a);
            int i5 = this.f4957i;
            if (i5 == fVar.f522b) {
                iMax = Math.max(0, Math.min(i5, iB - 1));
            }
            z4 = true;
        }
        if (z5) {
            a aVar3 = this.f4956h;
            aVar3.getClass();
            PathInterpolator pathInterpolator2 = SeslDatePicker.f4339v0;
            ((C0169g) aVar3).f4472d.getClass();
        }
        Collections.sort(arrayList, f4925h0);
        if (z4) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                g gVar = (g) getChildAt(i6).getLayoutParams();
                if (!gVar.f526a) {
                    gVar.f528c = 0.0f;
                }
            }
            v(iMax, 0, false, true);
            requestLayout();
        }
    }

    public final Rect f(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final f g(View view) {
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f4952e;
            if (i5 >= arrayList.size()) {
                return null;
            }
            f fVar = (f) arrayList.get(i5);
            a aVar = this.f4956h;
            F f = fVar.f521a;
            ((C0169g) aVar).getClass();
            if (view != null && view.equals(f)) {
                return fVar;
            }
            i5++;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        g gVar = new g(-1, -1);
        gVar.f528c = 0.0f;
        return gVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.f4956h;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i5, int i6) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f4957i;
    }

    public int getOffscreenPageLimit() {
        return this.f4971x;
    }

    public int getPageMargin() {
        return this.f4962o;
    }

    public final f h() {
        f fVar;
        int i5;
        int scrollStart = getScrollStart();
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float f5 = clientWidth > 0 ? scrollStart / clientWidth : 0.0f;
        float f6 = clientWidth > 0 ? this.f4962o / clientWidth : 0.0f;
        int i6 = 0;
        boolean z4 = true;
        f fVar2 = null;
        int i7 = -1;
        float f7 = 0.0f;
        while (true) {
            ArrayList arrayList = this.f4952e;
            if (i6 >= arrayList.size()) {
                return fVar2;
            }
            f fVar3 = (f) arrayList.get(i6);
            if (z4 || fVar3.f522b == (i5 = i7 + 1)) {
                fVar = fVar3;
            } else {
                float f8 = f + f7 + f6;
                f fVar4 = this.f;
                fVar4.f525e = f8;
                fVar4.f522b = i5;
                this.f4956h.getClass();
                fVar4.f524d = 1.0f;
                i6--;
                fVar = fVar4;
            }
            f = fVar.f525e;
            float f9 = fVar.f524d + f + f6;
            if (!z4 && f5 < f) {
                return fVar2;
            }
            if (f5 < f9 || i6 == arrayList.size() - 1) {
                break;
            }
            int i8 = fVar.f522b;
            float f10 = fVar.f524d;
            i6++;
            z4 = false;
            f fVar5 = fVar;
            i7 = i8;
            f7 = f10;
            fVar2 = fVar5;
        }
        return fVar;
    }

    public final f i(int i5) {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f4952e;
            if (i6 >= arrayList.size()) {
                return null;
            }
            f fVar = (f) arrayList.get(i6);
            if (fVar.f522b == i5) {
                return fVar;
            }
            i6++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r11 = this;
            int r0 = r11.f4944U
            r1 = 1
            if (r0 <= 0) goto L6b
            int r0 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = 0
        L1a:
            if (r6 >= r5) goto L6b
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            E0.g r8 = (E0.g) r8
            boolean r9 = r8.f526a
            if (r9 != 0) goto L2b
            goto L68
        L2b:
            int r8 = r8.f527b
            r8 = r8 & 7
            if (r8 == r1) goto L4f
            r9 = 3
            if (r8 == r9) goto L49
            r9 = 5
            if (r8 == r9) goto L39
            r8 = r2
            goto L5c
        L39:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
        L45:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L5c
        L49:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L5c
        L4f:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L45
        L5c:
            int r2 = r2 + r0
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L67
            r7.offsetLeftAndRight(r2)
        L67:
            r2 = r8
        L68:
            int r6 = r6 + 1
            goto L1a
        L6b:
            r11.f4943T = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.j():void");
    }

    public final void k(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4934I) {
            int i5 = actionIndex == 0 ? 1 : 0;
            this.E = motionEvent.getX(i5);
            this.f4934I = motionEvent.getPointerId(i5);
            VelocityTracker velocityTracker = this.f4935J;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean l() throws NoSuchMethodException, Resources.NotFoundException, SecurityException {
        a aVar = this.f4956h;
        if (aVar == null || this.f4957i >= aVar.b() - 1) {
            return false;
        }
        u(this.f4957i - this.f4953e0, true);
        return true;
    }

    public final boolean m(int i5) {
        if (this.f4952e.size() == 0) {
            if (this.f4942R) {
                return false;
            }
            this.f4943T = false;
            j();
            if (this.f4943T) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        t();
        f fVarH = h();
        getClientWidth();
        int i6 = fVarH.f522b;
        this.f4943T = false;
        j();
        if (this.f4943T) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(float r14, float r15) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.n(float, float):boolean");
    }

    public final void o() {
        p(this.f4957i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4942R = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f4946W);
        Scroller scroller = this.f4960l;
        if (scroller != null && !scroller.isFinished()) {
            this.f4960l.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i5;
        float f;
        ArrayList arrayList;
        float f5;
        super.onDraw(canvas);
        if (this.f4962o <= 0 || this.f4963p == null) {
            return;
        }
        ArrayList arrayList2 = this.f4952e;
        if (arrayList2.size() <= 0 || this.f4956h == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f6 = this.f4962o / width;
        int i6 = 0;
        f fVar = (f) arrayList2.get(0);
        float f7 = fVar.f525e;
        int size = arrayList2.size();
        int i7 = fVar.f522b;
        int i8 = ((f) arrayList2.get(size - 1)).f522b;
        while (i7 < i8) {
            while (true) {
                i5 = fVar.f522b;
                if (i7 <= i5 || i6 >= size) {
                    break;
                }
                i6++;
                fVar = (f) arrayList2.get(i6);
            }
            if (i7 == i5) {
                f = t() ? 1.6777216E7f - fVar.f525e : (fVar.f525e + fVar.f524d) * width;
                f7 = fVar.f525e + fVar.f524d + f6;
            } else {
                this.f4956h.getClass();
                f = t() ? 1.6777216E7f - f7 : (f7 + 1.0f) * width;
                f7 = 1.0f + f6 + f7;
            }
            if (this.f4962o + f > scrollX) {
                arrayList = arrayList2;
                f5 = f6;
                this.f4963p.setBounds(Math.round(f), this.f4964q, Math.round(this.f4962o + f), this.f4965r);
                this.f4963p.draw(canvas);
            } else {
                arrayList = arrayList2;
                f5 = f6;
            }
            if (f > scrollX + r3) {
                return;
            }
            i7++;
            arrayList2 = arrayList;
            f6 = f5;
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) throws NoSuchMethodException, Resources.NotFoundException, SecurityException {
        if (this.f4948b0 && (motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue > 0.0f) {
                u(this.f4957i - 1, true);
                return true;
            }
            if (axisValue < 0.0f) {
                u(this.f4957i + 1, true);
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int iFindPointerIndex;
        EdgeEffect edgeEffect = this.f4941Q;
        EdgeEffect edgeEffect2 = this.f4940O;
        int i5 = this.f4929C;
        Scroller scroller = this.f4960l;
        int action = motionEvent.getAction() & CustomDeviceManager.CALL_SCREEN_ALL;
        if (action == 3 || action == 1) {
            r();
            return false;
        }
        if (action != 0) {
            if (this.f4972y) {
                return true;
            }
            if (this.f4973z) {
                return false;
            }
        }
        if (action == 0) {
            float x4 = motionEvent.getX();
            this.f4932G = x4;
            this.E = x4;
            float y4 = motionEvent.getY();
            this.f4933H = y4;
            this.f4931F = y4;
            this.f4934I = motionEvent.getPointerId(0);
            this.f4973z = false;
            this.f4961m = true;
            scroller.computeScrollOffset();
            if (this.f4947a0 == 2 && Math.abs(scroller.getFinalX() - scroller.getCurrX()) > this.f4939N) {
                scroller.abortAnimation();
                this.f4970w = false;
                o();
                this.f4972y = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            } else if (J2.b.t(edgeEffect2) == 0.0f && J2.b.t(edgeEffect) == 0.0f) {
                d(false);
                this.f4972y = false;
            } else {
                this.f4972y = true;
                setScrollState(1);
                if (J2.b.t(edgeEffect2) != 0.0f) {
                    J2.b.O(edgeEffect2, 0.0f, 1.0f - (this.f4931F / getHeight()));
                }
                if (J2.b.t(edgeEffect) != 0.0f) {
                    J2.b.O(edgeEffect, 0.0f, this.f4931F / getHeight());
                }
            }
        } else if (action == 2) {
            int i6 = this.f4934I;
            if (i6 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i6)) != -1) {
                float x5 = motionEvent.getX(iFindPointerIndex);
                float f = x5 - this.E;
                float fAbs = Math.abs(f);
                float y5 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y5 - this.f4933H);
                if (f != 0.0f) {
                    float f5 = this.E;
                    if ((this.f4930D || ((f5 >= this.f4928B || f <= 0.0f) && (f5 <= getWidth() - this.f4928B || f >= 0.0f))) && c((int) f, (int) x5, (int) y5, this, false)) {
                        this.E = x5;
                        this.f4931F = y5;
                        this.f4973z = true;
                        return false;
                    }
                }
                float f6 = i5;
                if (fAbs > f6 && fAbs * this.f4951d0 > fAbs2) {
                    this.f4972y = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    this.E = f > 0.0f ? this.f4932G + i5 : this.f4932G - i5;
                    this.f4931F = y5;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > f6) {
                    this.f4973z = true;
                }
                if (this.f4972y && n(x5, y5)) {
                    WeakHashMap weakHashMap = P.f1421a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            k(motionEvent);
        }
        if (this.f4935J == null) {
            this.f4935J = VelocityTracker.obtain();
        }
        this.f4935J.addMovement(motionEvent);
        return this.f4972y;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i6) {
        g gVar;
        g gVar2;
        int i7;
        setMeasuredDimension(View.getDefaultSize(0, i5), View.getDefaultSize(0, i6));
        int measuredWidth = getMeasuredWidth();
        this.f4928B = Math.min(measuredWidth / 10, this.f4927A);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i8 = 0;
        while (true) {
            boolean z4 = true;
            int i9 = 1073741824;
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.f526a) {
                int i10 = gVar2.f527b;
                int i11 = i10 & 7;
                int i12 = i10 & 112;
                boolean z5 = i12 == 48 || i12 == 80;
                if (i11 != 3 && i11 != 5) {
                    z4 = false;
                }
                int i13 = Integer.MIN_VALUE;
                if (z5) {
                    i7 = Integer.MIN_VALUE;
                    i13 = 1073741824;
                } else {
                    i7 = z4 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i14 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i14 != -2) {
                    if (i14 == -1) {
                        i14 = paddingLeft;
                    }
                    i13 = 1073741824;
                } else {
                    i14 = paddingLeft;
                }
                int i15 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i15 == -2) {
                    i15 = measuredHeight;
                    i9 = i7;
                } else if (i15 == -1) {
                    i15 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i14, i13), View.MeasureSpec.makeMeasureSpec(i15, i9));
                if (z5) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z4) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i8++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f4968u = true;
        o();
        this.f4968u = false;
        int childCount2 = getChildCount();
        for (int i16 = 0; i16 < childCount2; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8 && (gVar = (g) childAt2.getLayoutParams()) != null && !gVar.f526a) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.f528c), 1073741824), iMakeMeasureSpec);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i5, Rect rect) {
        int i6;
        int i7;
        int i8;
        f fVarG;
        int childCount = getChildCount();
        if ((i5 & 2) != 0) {
            i7 = childCount;
            i6 = 0;
            i8 = 1;
        } else {
            i6 = childCount - 1;
            i7 = -1;
            i8 = -1;
        }
        while (i6 != i7) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 0 && (fVarG = g(childAt)) != null && fVarG.f522b == this.f4957i && childAt.requestFocus(i5, rect)) {
                return true;
            }
            i6 += i8;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws NoSuchMethodException, Resources.NotFoundException, SecurityException {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.f2363d);
        if (this.f4956h != null) {
            v(jVar.f, 0, false, true);
        } else {
            this.f4958j = jVar.f;
            this.f4959k = jVar.f532g;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i5) {
        super.onRtlPropertiesChanged(i5);
        if (this.f4954f0) {
            this.f4953e0 = i5 == 0 ? -1 : 1;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.f = this.f4957i;
        a aVar = this.f4956h;
        if (aVar != null) {
            aVar.getClass();
            jVar.f532g = null;
        }
        return jVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i6, int i7, int i8) throws Resources.NotFoundException, NoSuchMethodException, SecurityException {
        super.onSizeChanged(i5, i6, i7, i8);
        if (i5 != i7) {
            int i9 = this.f4962o;
            q(i5, i7, i9, i9);
            if (this.f4962o > 0) {
                v(this.f4957i, 0, false, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00e5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r13) throws android.content.res.Resources.NotFoundException, java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d1 A[PHI: r8 r11 r12
  0x00d1: PHI (r8v15 int) = (r8v14 int), (r8v4 int), (r8v17 int) binds: [B:65:0x00f2, B:62:0x00de, B:55:0x00c8] A[DONT_GENERATE, DONT_INLINE]
  0x00d1: PHI (r11v39 float) = (r11v37 float), (r11v38 float), (r11v2 float) binds: [B:65:0x00f2, B:62:0x00de, B:55:0x00c8] A[DONT_GENERATE, DONT_INLINE]
  0x00d1: PHI (r12v27 int) = (r12v1 int), (r12v26 int), (r12v29 int) binds: [B:65:0x00f2, B:62:0x00de, B:55:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0154 A[PHI: r3 r13
  0x0154: PHI (r3v20 float) = (r3v18 float), (r3v19 float), (r3v17 float) binds: [B:99:0x017b, B:96:0x0165, B:89:0x014b] A[DONT_GENERATE, DONT_INLINE]
  0x0154: PHI (r13v25 int) = (r13v23 int), (r13v24 int), (r13v22 int) binds: [B:99:0x017b, B:96:0x0165, B:89:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(int r18) throws java.lang.NoSuchMethodException, android.content.res.Resources.NotFoundException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.p(int):void");
    }

    public final void q(int i5, int i6, int i7, int i8) throws Resources.NotFoundException {
        if (i6 <= 0 || this.f4952e.isEmpty()) {
            f fVarI = i(this.f4957i);
            int iMin = (int) ((fVarI != null ? Math.min(fVarI.f525e, this.f4967t) : 0.0f) * ((i5 - getPaddingLeft()) - getPaddingRight()));
            if (iMin != getScrollX()) {
                d(false);
                scrollTo(iMin, getScrollY());
                return;
            }
            return;
        }
        if (!this.f4960l.isFinished()) {
            this.f4960l.setFinalX(getCurrentItem() * getClientWidth());
            return;
        }
        int paddingLeft = ((i5 - getPaddingLeft()) - getPaddingRight()) + i7;
        float scrollStart = getScrollStart() / (((i6 - getPaddingLeft()) - getPaddingRight()) + i8);
        scrollTo(t() ? (int) (1.6777216E7f - (scrollStart * paddingLeft)) : (int) (scrollStart * paddingLeft), getScrollY());
    }

    public final boolean r() {
        this.f4934I = -1;
        this.f4972y = false;
        this.f4973z = false;
        VelocityTracker velocityTracker = this.f4935J;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4935J = null;
        }
        this.f4940O.onRelease();
        this.f4941Q.onRelease();
        return (this.f4940O.isFinished() && this.f4941Q.isFinished()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f4968u) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s(int i5, int i6, boolean z4, boolean z5) throws Resources.NotFoundException {
        int i7;
        h hVar;
        int scrollX;
        int iAbs;
        h hVar2;
        Scroller scroller = this.f4960l;
        f fVarI = i(i5);
        if (fVarI != null) {
            float clientWidth = getClientWidth();
            float f = fVarI.f525e;
            float f5 = this.f4966s;
            float f6 = this.f4967t;
            if (f < f5) {
                f = f5;
            } else if (f > f6) {
                f = f6;
            }
            i7 = (int) (f * clientWidth);
            if (t()) {
                i7 = (IDMEnablerInterface.FLAG_RECEIVER_INCLUDE_BACKGROUND - ((int) ((clientWidth * fVarI.f524d) + 0.5f))) - i7;
            }
        } else {
            i7 = 0;
        }
        if (!z4) {
            if (z5 && (hVar = this.f4945V) != null) {
                SeslDatePicker seslDatePicker = (SeslDatePicker) ((C0168f) hVar).f4470a;
                if (seslDatePicker.f4375k) {
                    seslDatePicker.f4369h = false;
                }
                seslDatePicker.f4350L = i5;
                int minMonth = seslDatePicker.getMinMonth() + i5;
                int minYear = seslDatePicker.getMinYear() + (minMonth / 12);
                int i8 = minMonth % 12;
                int actualMaximum = seslDatePicker.n.get(5);
                Calendar calendar = seslDatePicker.f4380q;
                boolean z6 = minYear != calendar.get(1);
                calendar.set(1, minYear);
                calendar.set(2, i8);
                calendar.set(5, 1);
                if (actualMaximum > calendar.getActualMaximum(5)) {
                    actualMaximum = calendar.getActualMaximum(5);
                }
                calendar.set(5, actualMaximum);
                HandlerC0165c handlerC0165c = seslDatePicker.t0;
                Message messageObtainMessage = handlerC0165c.obtainMessage();
                messageObtainMessage.what = 1000;
                messageObtainMessage.obj = Boolean.valueOf(z6);
                handlerC0165c.sendMessage(messageObtainMessage);
                Message messageObtainMessage2 = handlerC0165c.obtainMessage();
                messageObtainMessage2.what = IDMCallbackStatusInterface.IDM_STATUS_INITIALIZING;
                handlerC0165c.sendMessage(messageObtainMessage2);
                SparseArray sparseArray = seslDatePicker.f4355R.f4471c;
                if (sparseArray.get(i5) != null) {
                    ((F) sparseArray.get(i5)).a();
                    ((F) sparseArray.get(i5)).setImportantForAccessibility(1);
                }
                if (i5 != 0) {
                    int i9 = i5 - 1;
                    if (sparseArray.get(i9) != null) {
                        ((F) sparseArray.get(i9)).a();
                        ((F) sparseArray.get(i9)).setImportantForAccessibility(2);
                    }
                }
                if (i5 != seslDatePicker.f4351M - 1) {
                    int i10 = i5 + 1;
                    if (sparseArray.get(i10) != null) {
                        ((F) sparseArray.get(i10)).a();
                        ((F) sparseArray.get(i10)).setImportantForAccessibility(2);
                    }
                }
            }
            d(false);
            scrollTo(i7, 0);
            m(i7);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.f4961m ? scroller.getCurrX() : scroller.getStartX();
                scroller.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i11 = scrollX;
            int scrollY = getScrollY();
            int i12 = i7 - i11;
            int i13 = 0 - scrollY;
            if (i12 == 0 && i13 == 0) {
                d(false);
                o();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth2 = getClientWidth();
                int i14 = clientWidth2 / 2;
                float f7 = clientWidth2;
                float f8 = i14;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i12) * 1.0f) / f7) - 0.5f) * 0.47123894f)) * f8) + f8;
                int iAbs2 = Math.abs(i6);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    this.f4956h.getClass();
                    iAbs = (int) (((Math.abs(i12) / ((f7 * 1.0f) + this.f4962o)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.f4961m = false;
                Scroller scroller2 = this.f4960l;
                if (scroller2 != null) {
                    scroller2.startScroll(i11, scrollY, i12, i13, iMin);
                }
                WeakHashMap weakHashMap = P.f1421a;
                postInvalidateOnAnimation();
            }
        }
        if (!z5 || (hVar2 = this.f4945V) == null) {
            return;
        }
        SeslDatePicker seslDatePicker2 = (SeslDatePicker) ((C0168f) hVar2).f4470a;
        if (seslDatePicker2.f4375k) {
            seslDatePicker2.f4369h = false;
        }
        seslDatePicker2.f4350L = i5;
        int minMonth2 = seslDatePicker2.getMinMonth() + i5;
        int minYear2 = seslDatePicker2.getMinYear() + (minMonth2 / 12);
        int i15 = minMonth2 % 12;
        int actualMaximum2 = seslDatePicker2.n.get(5);
        Calendar calendar2 = seslDatePicker2.f4380q;
        boolean z7 = minYear2 != calendar2.get(1);
        calendar2.set(1, minYear2);
        calendar2.set(2, i15);
        calendar2.set(5, 1);
        if (actualMaximum2 > calendar2.getActualMaximum(5)) {
            actualMaximum2 = calendar2.getActualMaximum(5);
        }
        calendar2.set(5, actualMaximum2);
        HandlerC0165c handlerC0165c2 = seslDatePicker2.t0;
        Message messageObtainMessage3 = handlerC0165c2.obtainMessage();
        messageObtainMessage3.what = 1000;
        messageObtainMessage3.obj = Boolean.valueOf(z7);
        handlerC0165c2.sendMessage(messageObtainMessage3);
        Message messageObtainMessage4 = handlerC0165c2.obtainMessage();
        messageObtainMessage4.what = IDMCallbackStatusInterface.IDM_STATUS_INITIALIZING;
        handlerC0165c2.sendMessage(messageObtainMessage4);
        SparseArray sparseArray2 = seslDatePicker2.f4355R.f4471c;
        if (sparseArray2.get(i5) != null) {
            ((F) sparseArray2.get(i5)).a();
            ((F) sparseArray2.get(i5)).setImportantForAccessibility(1);
        }
        if (i5 != 0) {
            int i16 = i5 - 1;
            if (sparseArray2.get(i16) != null) {
                ((F) sparseArray2.get(i16)).a();
                ((F) sparseArray2.get(i16)).setImportantForAccessibility(2);
            }
        }
        if (i5 != seslDatePicker2.f4351M - 1) {
            int i17 = i5 + 1;
            if (sparseArray2.get(i17) != null) {
                ((F) sparseArray2.get(i17)).a();
                ((F) sparseArray2.get(i17)).setImportantForAccessibility(2);
            }
        }
    }

    public void setAdapter(a aVar) throws NoSuchMethodException, Resources.NotFoundException, SecurityException {
        ArrayList arrayList;
        a aVar2 = this.f4956h;
        int i5 = 0;
        if (aVar2 != null) {
            synchronized (aVar2) {
                aVar2.f515b = null;
            }
            a aVar3 = this.f4956h;
            aVar3.getClass();
            PathInterpolator pathInterpolator = SeslDatePicker.f4339v0;
            ((C0169g) aVar3).f4472d.getClass();
            int i6 = 0;
            while (true) {
                arrayList = this.f4952e;
                if (i6 >= arrayList.size()) {
                    break;
                }
                f fVar = (f) arrayList.get(i6);
                this.f4956h.a(this, fVar.f522b, fVar.f521a);
                i6++;
            }
            a aVar4 = this.f4956h;
            aVar4.getClass();
            PathInterpolator pathInterpolator2 = SeslDatePicker.f4339v0;
            ((C0169g) aVar4).f4472d.getClass();
            arrayList.clear();
            int i7 = 0;
            while (i7 < getChildCount()) {
                if (!((g) getChildAt(i7).getLayoutParams()).f526a) {
                    removeViewAt(i7);
                    i7--;
                }
                i7++;
            }
            this.f4957i = 0;
            scrollTo(0, 0);
        }
        this.f4956h = aVar;
        this.f4950d = 0;
        if (aVar != null) {
            if (this.n == null) {
                this.n = new i(i5, this);
            }
            a aVar5 = this.f4956h;
            i iVar = this.n;
            synchronized (aVar5) {
                aVar5.f515b = iVar;
            }
            this.f4970w = false;
            boolean z4 = this.f4942R;
            this.f4942R = true;
            this.f4950d = this.f4956h.b();
            if (this.f4958j >= 0) {
                this.f4956h.getClass();
                v(this.f4958j, 0, false, true);
                this.f4958j = -1;
            } else if (z4) {
                requestLayout();
            } else {
                o();
            }
        }
    }

    public void setCurrentItem(int i5) throws NoSuchMethodException, Resources.NotFoundException, SecurityException {
        this.f4970w = false;
        v(i5, 0, !this.f4942R, false);
    }

    public void setDragInGutterEnabled(boolean z4) {
        this.f4930D = z4;
    }

    public void setOffscreenPageLimit(int i5) {
        if (i5 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i5 + " too small; defaulting to 1");
            i5 = 1;
        }
        if (i5 != this.f4971x) {
            this.f4971x = i5;
            o();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(h hVar) {
        this.f4945V = hVar;
    }

    public void setPageMargin(int i5) throws Resources.NotFoundException {
        int i6 = this.f4962o;
        this.f4962o = i5;
        int width = getWidth();
        q(width, width, i5, i6);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f4963p = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i5) {
        if (this.f4947a0 == i5) {
            return;
        }
        this.f4947a0 = i5;
    }

    public final boolean t() {
        if (this.f4954f0) {
            WeakHashMap weakHashMap = P.f1421a;
            if (getLayoutDirection() == 1) {
                return true;
            }
        }
        return false;
    }

    public final void u(int i5, boolean z4) throws NoSuchMethodException, Resources.NotFoundException, SecurityException {
        this.f4970w = false;
        v(i5, 0, z4, false);
    }

    public final void v(int i5, int i6, boolean z4, boolean z5) throws NoSuchMethodException, Resources.NotFoundException, SecurityException {
        h hVar;
        a aVar = this.f4956h;
        if (aVar == null || aVar.b() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.f4952e;
        if (!z5 && this.f4957i == i5 && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i5 < 0) {
            i5 = 0;
        } else if (i5 >= this.f4956h.b()) {
            i5 = this.f4956h.b() - 1;
        }
        int i7 = this.f4971x;
        int i8 = this.f4957i;
        if (i5 > i8 + i7 || i5 < i8 - i7) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                ((f) arrayList.get(i9)).f523c = true;
            }
        }
        boolean z6 = this.f4957i != i5;
        if (!this.f4942R) {
            p(i5);
            s(i5, i6, z4, z6);
            return;
        }
        this.f4957i = i5;
        if (z6 && (hVar = this.f4945V) != null) {
            SeslDatePicker seslDatePicker = (SeslDatePicker) ((C0168f) hVar).f4470a;
            if (seslDatePicker.f4375k) {
                seslDatePicker.f4369h = false;
            }
            seslDatePicker.f4350L = i5;
            int minMonth = seslDatePicker.getMinMonth() + i5;
            int minYear = seslDatePicker.getMinYear() + (minMonth / 12);
            int i10 = minMonth % 12;
            int actualMaximum = seslDatePicker.n.get(5);
            Calendar calendar = seslDatePicker.f4380q;
            boolean z7 = minYear != calendar.get(1);
            calendar.set(1, minYear);
            calendar.set(2, i10);
            calendar.set(5, 1);
            if (actualMaximum > calendar.getActualMaximum(5)) {
                actualMaximum = calendar.getActualMaximum(5);
            }
            calendar.set(5, actualMaximum);
            HandlerC0165c handlerC0165c = seslDatePicker.t0;
            Message messageObtainMessage = handlerC0165c.obtainMessage();
            messageObtainMessage.what = 1000;
            messageObtainMessage.obj = Boolean.valueOf(z7);
            handlerC0165c.sendMessage(messageObtainMessage);
            Message messageObtainMessage2 = handlerC0165c.obtainMessage();
            messageObtainMessage2.what = IDMCallbackStatusInterface.IDM_STATUS_INITIALIZING;
            handlerC0165c.sendMessage(messageObtainMessage2);
            SparseArray sparseArray = seslDatePicker.f4355R.f4471c;
            if (sparseArray.get(i5) != null) {
                ((F) sparseArray.get(i5)).a();
                ((F) sparseArray.get(i5)).setImportantForAccessibility(1);
            }
            if (i5 != 0) {
                int i11 = i5 - 1;
                if (sparseArray.get(i11) != null) {
                    ((F) sparseArray.get(i11)).a();
                    ((F) sparseArray.get(i11)).setImportantForAccessibility(2);
                }
            }
            if (i5 != seslDatePicker.f4351M - 1) {
                int i12 = i5 + 1;
                if (sparseArray.get(i12) != null) {
                    ((F) sparseArray.get(i12)).a();
                    ((F) sparseArray.get(i12)).setImportantForAccessibility(2);
                }
            }
        }
        requestLayout();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4963p;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        g gVar = new g(context, attributeSet);
        gVar.f528c = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0);
        gVar.f527b = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
        return gVar;
    }

    public void setPageMarginDrawable(int i5) {
        setPageMarginDrawable(AbstractC0938a.b(getContext(), i5));
    }
}
