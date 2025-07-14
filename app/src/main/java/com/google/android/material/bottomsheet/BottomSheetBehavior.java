package com.google.android.material.bottomsheet;

import A1.a;
import A1.e;
import A1.i;
import A1.j;
import A3.f;
import I1.n;
import I1.o;
import J.C0044a;
import J.C0045b;
import J.F;
import J.H;
import J.M;
import J.P;
import J.c0;
import J2.b;
import K.c;
import O1.g;
import O1.k;
import S.d;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.idm.agent.dm.IDMDmInterface;
import com.samsung.android.knox.net.nap.NetworkAnalyticsConstants;
import com.wssyncmldm.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import w.AbstractC0899a;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC0899a {

    /* renamed from: A, reason: collision with root package name */
    public final i f5739A;

    /* renamed from: B, reason: collision with root package name */
    public final ValueAnimator f5740B;

    /* renamed from: C, reason: collision with root package name */
    public final int f5741C;

    /* renamed from: D, reason: collision with root package name */
    public int f5742D;
    public int E;

    /* renamed from: F, reason: collision with root package name */
    public final float f5743F;

    /* renamed from: G, reason: collision with root package name */
    public int f5744G;

    /* renamed from: H, reason: collision with root package name */
    public final float f5745H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f5746I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f5747J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f5748K;

    /* renamed from: L, reason: collision with root package name */
    public int f5749L;

    /* renamed from: M, reason: collision with root package name */
    public d f5750M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f5751N;

    /* renamed from: O, reason: collision with root package name */
    public int f5752O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f5753P;

    /* renamed from: Q, reason: collision with root package name */
    public final float f5754Q;

    /* renamed from: R, reason: collision with root package name */
    public int f5755R;

    /* renamed from: S, reason: collision with root package name */
    public int f5756S;

    /* renamed from: T, reason: collision with root package name */
    public int f5757T;

    /* renamed from: U, reason: collision with root package name */
    public WeakReference f5758U;

    /* renamed from: V, reason: collision with root package name */
    public WeakReference f5759V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f5760W;

    /* renamed from: X, reason: collision with root package name */
    public VelocityTracker f5761X;

    /* renamed from: Y, reason: collision with root package name */
    public int f5762Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f5763Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f5764a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f5765a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5766b;

    /* renamed from: b0, reason: collision with root package name */
    public HashMap f5767b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f5768c;

    /* renamed from: c0, reason: collision with root package name */
    public final SparseIntArray f5769c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f5770d;

    /* renamed from: d0, reason: collision with root package name */
    public final A1.d f5771d0;

    /* renamed from: e, reason: collision with root package name */
    public int f5772e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public int f5773g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5774h;

    /* renamed from: i, reason: collision with root package name */
    public final g f5775i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f5776j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5777k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5778l;

    /* renamed from: m, reason: collision with root package name */
    public int f5779m;
    public final boolean n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f5780o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f5781p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f5782q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f5783r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f5784s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f5785t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f5786u;

    /* renamed from: v, reason: collision with root package name */
    public int f5787v;

    /* renamed from: w, reason: collision with root package name */
    public int f5788w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f5789x;

    /* renamed from: y, reason: collision with root package name */
    public final k f5790y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5791z;

    public BottomSheetBehavior() {
        this.f5764a = 0;
        this.f5766b = true;
        this.f5777k = -1;
        this.f5778l = -1;
        this.f5739A = new i(this);
        this.f5743F = 0.5f;
        this.f5745H = -1.0f;
        this.f5748K = true;
        this.f5749L = 4;
        this.f5754Q = 0.1f;
        this.f5760W = new ArrayList();
        this.f5763Z = -1;
        this.f5769c0 = new SparseIntArray();
        this.f5771d0 = new A1.d(this, 0);
    }

    public static View w(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = P.f1421a;
        if (H.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View viewW = w(viewGroup.getChildAt(i5));
                if (viewW != null) {
                    return viewW;
                }
            }
        }
        return null;
    }

    public static int x(int i5, int i6, int i7, int i8) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, i6, i8);
        if (i7 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i7), 1073741824);
        }
        if (size != 0) {
            i7 = Math.min(size, i7);
        }
        return View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
    }

    public final boolean A() {
        WeakReference weakReference = this.f5758U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f5758U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public final void B(int i5) {
        if (i5 == -1) {
            if (this.f) {
                return;
            } else {
                this.f = true;
            }
        } else {
            if (!this.f && this.f5772e == i5) {
                return;
            }
            this.f = false;
            this.f5772e = Math.max(0, i5);
        }
        J();
    }

    public final void C(int i5) {
        if (i5 == 1 || i5 == 2) {
            throw new IllegalArgumentException(f.p(new StringBuilder("STATE_"), i5 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f5746I && i5 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i5);
            return;
        }
        int i6 = (i5 == 6 && this.f5766b && z(i5) <= this.f5742D) ? 3 : i5;
        WeakReference weakReference = this.f5758U;
        if (weakReference == null || weakReference.get() == null) {
            D(i5);
            return;
        }
        View view = (View) this.f5758U.get();
        a aVar = new a(this, view, i6);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = P.f1421a;
            if (view.isAttachedToWindow()) {
                view.post(aVar);
                return;
            }
        }
        aVar.run();
    }

    public final void D(int i5) {
        if (this.f5749L == i5) {
            return;
        }
        this.f5749L = i5;
        if (i5 != 4 && i5 != 3 && i5 != 6) {
            boolean z4 = this.f5746I;
        }
        WeakReference weakReference = this.f5758U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i5 == 3) {
            I(true);
        } else if (i5 == 6 || i5 == 5 || i5 == 4) {
            I(false);
        }
        H(i5, true);
        ArrayList arrayList = this.f5760W;
        if (arrayList.size() <= 0) {
            G();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean E(View view, float f) {
        if (this.f5747J) {
            return true;
        }
        if (view.getTop() < this.f5744G) {
            return false;
        }
        return Math.abs(((f * this.f5754Q) + ((float) view.getTop())) - ((float) this.f5744G)) / ((float) u()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        D(2);
        H(r4, true);
        r2.f5739A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.o(r3.getLeft(), r0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.z(r4)
            S.d r1 = r2.f5750M
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.f2522r = r3
            r3 = -1
            r1.f2509c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f2507a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.f2522r
            if (r5 == 0) goto L30
            r5 = 0
            r1.f2522r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.D(r3)
            r3 = 1
            r2.H(r4, r3)
            A1.i r2 = r2.f5739A
            r2.a(r4)
            goto L43
        L40:
            r2.D(r4)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.F(android.view.View, int, boolean):void");
    }

    public final void G() throws Resources.NotFoundException {
        View view;
        int iA;
        WeakReference weakReference = this.f5758U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        P.f(NetworkAnalyticsConstants.DataPoints.FLAG_INTERFACE_NAME, view);
        P.d(0, view);
        P.f(NetworkAnalyticsConstants.DataPoints.FLAG_PARENT_PROCESS_HASH, view);
        P.d(0, view);
        P.f(IDMDmInterface.IDM_MAX_OBJ_SIZE, view);
        P.d(0, view);
        SparseIntArray sparseIntArray = this.f5769c0;
        int i5 = sparseIntArray.get(0, -1);
        if (i5 != -1) {
            P.f(i5, view);
            P.d(0, view);
            sparseIntArray.delete(0);
        }
        if (!this.f5766b && this.f5749L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            e eVar = new e(6, this);
            ArrayList arrayListC = P.c(view);
            int i6 = 0;
            while (true) {
                if (i6 >= arrayListC.size()) {
                    int i7 = -1;
                    for (int i8 = 0; i8 < 32 && i7 == -1; i8++) {
                        int i9 = P.f1422b[i8];
                        boolean z4 = true;
                        for (int i10 = 0; i10 < arrayListC.size(); i10++) {
                            z4 &= ((c) arrayListC.get(i10)).a() != i9;
                        }
                        if (z4) {
                            i7 = i9;
                        }
                    }
                    iA = i7;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((c) arrayListC.get(i6)).f1610a).getLabel())) {
                        iA = ((c) arrayListC.get(i6)).a();
                        break;
                    }
                    i6++;
                }
            }
            if (iA != -1) {
                c cVar = new c(null, iA, string, eVar, null);
                View.AccessibilityDelegate accessibilityDelegateA = M.a(view);
                C0045b c0045b = accessibilityDelegateA == null ? null : accessibilityDelegateA instanceof C0044a ? ((C0044a) accessibilityDelegateA).f1435a : new C0045b(accessibilityDelegateA);
                if (c0045b == null) {
                    c0045b = new C0045b();
                }
                P.h(view, c0045b);
                P.f(cVar.a(), view);
                P.c(view).add(cVar);
                P.d(0, view);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.f5746I && this.f5749L != 5) {
            P.g(view, c.f1607j, new e(5, this));
        }
        int i11 = this.f5749L;
        if (i11 == 3) {
            P.g(view, c.f1606i, new e(this.f5766b ? 4 : 6, this));
            return;
        }
        if (i11 == 4) {
            P.g(view, c.f1605h, new e(this.f5766b ? 3 : 6, this));
        } else {
            if (i11 != 6) {
                return;
            }
            P.g(view, c.f1606i, new e(4, this));
            P.g(view, c.f1605h, new e(3, this));
        }
    }

    public final void H(int i5, boolean z4) {
        g gVar = this.f5775i;
        ValueAnimator valueAnimator = this.f5740B;
        if (i5 == 2) {
            return;
        }
        boolean z5 = this.f5749L == 3 && (this.f5789x || A());
        if (this.f5791z == z5 || gVar == null) {
            return;
        }
        this.f5791z = z5;
        if (z4 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(gVar.f1931d.f1923i, z5 ? t() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fT = this.f5791z ? t() : 1.0f;
        O1.f fVar = gVar.f1931d;
        if (fVar.f1923i != fT) {
            fVar.f1923i = fT;
            gVar.f1934h = true;
            gVar.invalidateSelf();
        }
    }

    public final void I(boolean z4) {
        WeakReference weakReference = this.f5758U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z4) {
                if (this.f5767b0 != null) {
                    return;
                } else {
                    this.f5767b0 = new HashMap(childCount);
                }
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = coordinatorLayout.getChildAt(i5);
                if (childAt != this.f5758U.get() && z4) {
                    this.f5767b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z4) {
                return;
            }
            this.f5767b0 = null;
        }
    }

    public final void J() {
        View view;
        if (this.f5758U != null) {
            s();
            if (this.f5749L != 4 || (view = (View) this.f5758U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // w.AbstractC0899a
    public final void d(w.d dVar) {
        this.f5758U = null;
        this.f5750M = null;
    }

    @Override // w.AbstractC0899a
    public final void f() {
        this.f5758U = null;
        this.f5750M = null;
    }

    @Override // w.AbstractC0899a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i5;
        d dVar;
        if (!view.isShown() || !this.f5748K) {
            this.f5751N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5762Y = -1;
            this.f5763Z = -1;
            VelocityTracker velocityTracker = this.f5761X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f5761X = null;
            }
        }
        if (this.f5761X == null) {
            this.f5761X = VelocityTracker.obtain();
        }
        this.f5761X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x4 = (int) motionEvent.getX();
            this.f5763Z = (int) motionEvent.getY();
            if (this.f5749L != 2) {
                WeakReference weakReference = this.f5759V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x4, this.f5763Z)) {
                    this.f5762Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f5765a0 = true;
                }
            }
            this.f5751N = this.f5762Y == -1 && !coordinatorLayout.o(view, x4, this.f5763Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f5765a0 = false;
            this.f5762Y = -1;
            if (this.f5751N) {
                this.f5751N = false;
                return false;
            }
        }
        if (!this.f5751N && (dVar = this.f5750M) != null && dVar.p(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f5759V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f5751N || this.f5749L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f5750M == null || (i5 = this.f5763Z) == -1 || Math.abs(((float) i5) - motionEvent.getY()) <= ((float) this.f5750M.f2508b)) ? false : true;
    }

    @Override // w.AbstractC0899a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i5) throws Resources.NotFoundException {
        int i6 = this.f5778l;
        g gVar = this.f5775i;
        int i7 = 5;
        WeakHashMap weakHashMap = P.f1421a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f5758U == null) {
            this.f5773g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z4 = (this.n || this.f) ? false : true;
            if (this.f5780o || this.f5781p || this.f5782q || this.f5784s || this.f5785t || this.f5786u || z4) {
                A1.c cVar = new A1.c(this, z4, 0);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                o oVar = new o();
                oVar.f951a = paddingStart;
                oVar.f952b = paddingEnd;
                oVar.f953c = paddingBottom;
                H.u(view, new E0.d(cVar, i7, oVar));
                if (view.isAttachedToWindow()) {
                    F.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new n(0));
                }
            }
            view.setWindowInsetsAnimationCallback(new c0(new j(view)));
            this.f5758U = new WeakReference(view);
            Context context = view.getContext();
            b.U(context, R.attr.motionEasingStandardDecelerateInterpolator, L.a.b(0.0f, 0.0f, 0.0f, 1.0f));
            b.T(context, R.attr.motionDurationMedium2, 300);
            b.T(context, R.attr.motionDurationShort3, 150);
            b.T(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float fI = this.f5745H;
                if (fI == -1.0f) {
                    fI = H.i(view);
                }
                gVar.h(fI);
            } else {
                ColorStateList colorStateList = this.f5776j;
                if (colorStateList != null) {
                    H.q(view, colorStateList);
                }
            }
            G();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f5750M == null) {
            this.f5750M = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f5771d0);
        }
        int top = view.getTop();
        coordinatorLayout.q(i5, view);
        this.f5756S = coordinatorLayout.getWidth();
        this.f5757T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f5755R = height;
        int iMin = this.f5757T;
        int i8 = iMin - height;
        int i9 = this.f5788w;
        if (i8 < i9) {
            if (this.f5783r) {
                if (i6 != -1) {
                    iMin = Math.min(iMin, i6);
                }
                this.f5755R = iMin;
            } else {
                int iMin2 = iMin - i9;
                if (i6 != -1) {
                    iMin2 = Math.min(iMin2, i6);
                }
                this.f5755R = iMin2;
            }
        }
        this.f5742D = Math.max(0, this.f5757T - this.f5755R);
        this.E = (int) ((1.0f - this.f5743F) * this.f5757T);
        s();
        int i10 = this.f5749L;
        if (i10 == 3) {
            view.offsetTopAndBottom(y());
        } else if (i10 == 6) {
            view.offsetTopAndBottom(this.E);
        } else if (this.f5746I && i10 == 5) {
            view.offsetTopAndBottom(this.f5757T);
        } else if (i10 == 4) {
            view.offsetTopAndBottom(this.f5744G);
        } else if (i10 == 1 || i10 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        H(this.f5749L, false);
        this.f5759V = new WeakReference(w(view));
        ArrayList arrayList = this.f5760W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // w.AbstractC0899a
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(x(i5, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i6, this.f5777k, marginLayoutParams.width), x(i7, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f5778l, marginLayoutParams.height));
        return true;
    }

    @Override // w.AbstractC0899a
    public final boolean j(View view, View view2, float f) {
        WeakReference weakReference = this.f5759V;
        return (weakReference == null || view2 != weakReference.get() || this.f5749L == 3) ? false : true;
    }

    @Override // w.AbstractC0899a
    public final void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i5, int i6, int[] iArr, int i7) {
        boolean z4 = this.f5748K;
        if (i7 == 1) {
            return;
        }
        WeakReference weakReference = this.f5759V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i8 = top - i6;
        if (i6 > 0) {
            if (i8 < y()) {
                int iY = top - y();
                iArr[1] = iY;
                WeakHashMap weakHashMap = P.f1421a;
                view.offsetTopAndBottom(-iY);
                D(3);
            } else {
                if (!z4) {
                    return;
                }
                iArr[1] = i6;
                WeakHashMap weakHashMap2 = P.f1421a;
                view.offsetTopAndBottom(-i6);
                D(1);
            }
        } else if (i6 < 0 && !view2.canScrollVertically(-1)) {
            int i9 = this.f5744G;
            if (i8 > i9 && !this.f5746I) {
                int i10 = top - i9;
                iArr[1] = i10;
                WeakHashMap weakHashMap3 = P.f1421a;
                view.offsetTopAndBottom(-i10);
                D(4);
            } else {
                if (!z4) {
                    return;
                }
                iArr[1] = i6;
                WeakHashMap weakHashMap4 = P.f1421a;
                view.offsetTopAndBottom(-i6);
                D(1);
            }
        }
        v(view.getTop());
        this.f5752O = i6;
        this.f5753P = true;
    }

    @Override // w.AbstractC0899a
    public final void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
    }

    @Override // w.AbstractC0899a
    public final void n(View view, Parcelable parcelable) {
        A1.g gVar = (A1.g) parcelable;
        int i5 = this.f5764a;
        if (i5 != 0) {
            if (i5 == -1 || (i5 & 1) == 1) {
                this.f5772e = gVar.f59g;
            }
            if (i5 == -1 || (i5 & 2) == 2) {
                this.f5766b = gVar.f60h;
            }
            if (i5 == -1 || (i5 & 4) == 4) {
                this.f5746I = gVar.f61i;
            }
            if (i5 == -1 || (i5 & 8) == 8) {
                this.f5747J = gVar.f62j;
            }
        }
        int i6 = gVar.f;
        if (i6 == 1 || i6 == 2) {
            this.f5749L = 4;
        } else {
            this.f5749L = i6;
        }
    }

    @Override // w.AbstractC0899a
    public final Parcelable o(View view) {
        return new A1.g(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // w.AbstractC0899a
    public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i5, int i6) {
        this.f5752O = 0;
        this.f5753P = false;
        return (i5 & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // w.AbstractC0899a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.y()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.D(r0)
            return
        Lf:
            java.lang.ref.WeakReference r3 = r2.f5759V
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb5
            boolean r3 = r2.f5753P
            if (r3 != 0) goto L1f
            goto Lb5
        L1f:
            int r3 = r2.f5752O
            r5 = 6
            if (r3 <= 0) goto L34
            boolean r3 = r2.f5766b
            if (r3 == 0) goto L2a
            goto Laf
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.E
            if (r3 <= r6) goto Laf
            goto Lae
        L34:
            boolean r3 = r2.f5746I
            if (r3 == 0) goto L55
            android.view.VelocityTracker r3 = r2.f5761X
            if (r3 != 0) goto L3e
            r3 = 0
            goto L4d
        L3e:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.f5768c
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.f5761X
            int r6 = r2.f5762Y
            float r3 = r3.getYVelocity(r6)
        L4d:
            boolean r3 = r2.E(r4, r3)
            if (r3 == 0) goto L55
            r0 = 5
            goto Laf
        L55:
            int r3 = r2.f5752O
            r6 = 4
            if (r3 != 0) goto L93
            int r3 = r4.getTop()
            boolean r1 = r2.f5766b
            if (r1 == 0) goto L74
            int r5 = r2.f5742D
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f5744G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L97
            goto Laf
        L74:
            int r1 = r2.E
            if (r3 >= r1) goto L83
            int r6 = r2.f5744G
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto Lae
            goto Laf
        L83:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f5744G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
            goto Lae
        L93:
            boolean r3 = r2.f5766b
            if (r3 == 0) goto L99
        L97:
            r0 = r6
            goto Laf
        L99:
            int r3 = r4.getTop()
            int r0 = r2.E
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f5744G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
        Lae:
            r0 = r5
        Laf:
            r3 = 0
            r2.F(r4, r0, r3)
            r2.f5753P = r3
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.q(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // w.AbstractC0899a
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i5 = this.f5749L;
        if (i5 == 1 && actionMasked == 0) {
            return true;
        }
        d dVar = this.f5750M;
        if (dVar != null && (this.f5748K || i5 == 1)) {
            dVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f5762Y = -1;
            this.f5763Z = -1;
            VelocityTracker velocityTracker = this.f5761X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f5761X = null;
            }
        }
        if (this.f5761X == null) {
            this.f5761X = VelocityTracker.obtain();
        }
        this.f5761X.addMovement(motionEvent);
        if (this.f5750M != null && ((this.f5748K || this.f5749L == 1) && actionMasked == 2 && !this.f5751N)) {
            float fAbs = Math.abs(this.f5763Z - motionEvent.getY());
            d dVar2 = this.f5750M;
            if (fAbs > dVar2.f2508b) {
                dVar2.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.f5751N;
    }

    public final void s() {
        int iU = u();
        if (this.f5766b) {
            this.f5744G = Math.max(this.f5757T - iU, this.f5742D);
        } else {
            this.f5744G = this.f5757T - iU;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float t() {
        /*
            r5 = this;
            O1.g r0 = r5.f5775i
            r1 = 0
            if (r0 == 0) goto L75
            java.lang.ref.WeakReference r0 = r5.f5758U
            if (r0 == 0) goto L75
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L75
            java.lang.ref.WeakReference r0 = r5.f5758U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.A()
            if (r2 == 0) goto L75
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L75
            O1.g r2 = r5.f5775i
            O1.f r3 = r2.f1931d
            O1.k r3 = r3.f1916a
            O1.c r3 = r3.f1965e
            android.graphics.RectF r2 = r2.e()
            float r2 = r3.a(r2)
            r3 = 0
            android.view.RoundedCorner r3 = r0.getRoundedCorner(r3)
            if (r3 == 0) goto L49
            int r3 = r3.getRadius()
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L49
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L49
            float r3 = r3 / r2
            goto L4a
        L49:
            r3 = r1
        L4a:
            O1.g r5 = r5.f5775i
            O1.f r2 = r5.f1931d
            O1.k r2 = r2.f1916a
            O1.c r2 = r2.f
            android.graphics.RectF r5 = r5.e()
            float r5 = r2.a(r5)
            r2 = 1
            android.view.RoundedCorner r0 = r0.getRoundedCorner(r2)
            if (r0 == 0) goto L70
            int r0 = r0.getRadius()
            float r0 = (float) r0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L70
            int r2 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r2 <= 0) goto L70
            float r1 = r0 / r5
        L70:
            float r5 = java.lang.Math.max(r3, r1)
            return r5
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.t():float");
    }

    public final int u() {
        int iMin;
        int i5;
        int i6;
        if (this.f) {
            iMin = Math.min(Math.max(this.f5773g, this.f5757T - ((this.f5756S * 9) / 16)), this.f5755R);
            i5 = this.f5787v;
        } else {
            if (!this.n && !this.f5780o && (i6 = this.f5779m) > 0) {
                return Math.max(this.f5772e, i6 + this.f5774h);
            }
            iMin = this.f5772e;
            i5 = this.f5787v;
        }
        return iMin + i5;
    }

    public final void v(int i5) {
        if (((View) this.f5758U.get()) != null) {
            ArrayList arrayList = this.f5760W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i6 = this.f5744G;
            if (i5 <= i6 && i6 != y()) {
                y();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final int y() {
        if (this.f5766b) {
            return this.f5742D;
        }
        return Math.max(this.f5741C, this.f5783r ? 0 : this.f5788w);
    }

    public final int z(int i5) {
        if (i5 == 3) {
            return y();
        }
        if (i5 == 4) {
            return this.f5744G;
        }
        if (i5 == 5) {
            return this.f5757T;
        }
        if (i5 == 6) {
            return this.E;
        }
        throw new IllegalArgumentException(f.l(i5, "Invalid state to get top offset: "));
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i5;
        int i6 = 0;
        this.f5764a = 0;
        this.f5766b = true;
        this.f5777k = -1;
        this.f5778l = -1;
        this.f5739A = new i(this);
        this.f5743F = 0.5f;
        this.f5745H = -1.0f;
        this.f5748K = true;
        this.f5749L = 4;
        this.f5754Q = 0.1f;
        this.f5760W = new ArrayList();
        this.f5763Z = -1;
        this.f5769c0 = new SparseIntArray();
        this.f5771d0 = new A1.d(this, i6);
        this.f5774h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u1.a.f9158a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f5776j = V1.a.z(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f5790y = k.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        k kVar = this.f5790y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f5775i = gVar;
            gVar.g(context);
            ColorStateList colorStateList = this.f5776j;
            if (colorStateList != null) {
                this.f5775i.i(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f5775i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(t(), 1.0f);
        this.f5740B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f5740B.addUpdateListener(new A1.b(i6, this));
        this.f5745H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f5777k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f5778l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i5 = typedValuePeekValue.data) == -1) {
            B(i5);
        } else {
            B(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.f5746I != z4) {
            this.f5746I = z4;
            if (!z4 && this.f5749L == 5) {
                C(4);
            }
            G();
        }
        this.n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f5766b != z5) {
            this.f5766b = z5;
            if (this.f5758U != null) {
                s();
            }
            D((this.f5766b && this.f5749L == 6) ? 3 : this.f5749L);
            H(this.f5749L, true);
            G();
        }
        this.f5747J = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.f5748K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f5764a = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.f5743F = f;
            if (this.f5758U != null) {
                this.E = (int) ((1.0f - f) * this.f5757T);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i7 = typedValuePeekValue2.data;
                if (i7 >= 0) {
                    this.f5741C = i7;
                    H(this.f5749L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f5741C = dimensionPixelOffset;
                    H(this.f5749L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f5770d = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.f5780o = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f5781p = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f5782q = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f5783r = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.f5784s = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f5785t = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f5786u = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f5789x = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f5768c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
