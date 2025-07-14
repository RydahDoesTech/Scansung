package com.google.android.material.sidesheet;

import A1.i;
import J.H;
import J.L;
import J.P;
import J2.b;
import K.q;
import O1.g;
import O1.j;
import O1.k;
import P1.c;
import S.d;
import V1.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.idm.agent.dm.IDMDmInterface;
import com.samsung.android.knox.net.nap.NetworkAnalyticsConstants;
import com.wssyncmldm.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import w.AbstractC0899a;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC0899a {

    /* renamed from: a, reason: collision with root package name */
    public a f5951a;

    /* renamed from: b, reason: collision with root package name */
    public final g f5952b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f5953c;

    /* renamed from: d, reason: collision with root package name */
    public final k f5954d;

    /* renamed from: e, reason: collision with root package name */
    public final i f5955e;
    public final float f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5956g;

    /* renamed from: h, reason: collision with root package name */
    public int f5957h;

    /* renamed from: i, reason: collision with root package name */
    public d f5958i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5959j;

    /* renamed from: k, reason: collision with root package name */
    public final float f5960k;

    /* renamed from: l, reason: collision with root package name */
    public int f5961l;

    /* renamed from: m, reason: collision with root package name */
    public int f5962m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public int f5963o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f5964p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f5965q;

    /* renamed from: r, reason: collision with root package name */
    public final int f5966r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f5967s;

    /* renamed from: t, reason: collision with root package name */
    public int f5968t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f5969u;

    /* renamed from: v, reason: collision with root package name */
    public final A1.d f5970v;

    public SideSheetBehavior() {
        this.f5955e = new i(this);
        this.f5956g = true;
        this.f5957h = 5;
        this.f5960k = 0.1f;
        this.f5966r = -1;
        this.f5969u = new LinkedHashSet();
        this.f5970v = new A1.d(this, 1);
    }

    @Override // w.AbstractC0899a
    public final void d(w.d dVar) {
        this.f5964p = null;
        this.f5958i = null;
    }

    @Override // w.AbstractC0899a
    public final void f() {
        this.f5964p = null;
        this.f5958i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    @Override // w.AbstractC0899a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.MotionEvent r5) {
        /*
            r2 = this;
            boolean r3 = r4.isShown()
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L10
            java.util.WeakHashMap r3 = J.P.f1421a
            java.lang.CharSequence r3 = J.L.b(r4)
            if (r3 == 0) goto L5a
        L10:
            boolean r3 = r2.f5956g
            if (r3 == 0) goto L5a
            int r3 = r5.getActionMasked()
            if (r3 != 0) goto L24
            android.view.VelocityTracker r4 = r2.f5967s
            if (r4 == 0) goto L24
            r4.recycle()
            r4 = 0
            r2.f5967s = r4
        L24:
            android.view.VelocityTracker r4 = r2.f5967s
            if (r4 != 0) goto L2e
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r2.f5967s = r4
        L2e:
            android.view.VelocityTracker r4 = r2.f5967s
            r4.addMovement(r5)
            if (r3 == 0) goto L42
            if (r3 == r0) goto L3b
            r4 = 3
            if (r3 == r4) goto L3b
            goto L49
        L3b:
            boolean r3 = r2.f5959j
            if (r3 == 0) goto L49
            r2.f5959j = r1
            return r1
        L42:
            float r3 = r5.getX()
            int r3 = (int) r3
            r2.f5968t = r3
        L49:
            boolean r3 = r2.f5959j
            if (r3 != 0) goto L58
            S.d r2 = r2.f5958i
            if (r2 == 0) goto L58
            boolean r2 = r2.p(r5)
            if (r2 == 0) goto L58
            goto L59
        L58:
            r0 = r1
        L59:
            return r0
        L5a:
            r2.f5959j = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.g(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // w.AbstractC0899a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i5) throws Resources.NotFoundException {
        View view2;
        View view3;
        int i6;
        View viewFindViewById;
        int iH = 0;
        int i7 = 1;
        g gVar = this.f5952b;
        WeakHashMap weakHashMap = P.f1421a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f5964p == null) {
            this.f5964p = new WeakReference(view);
            Context context = view.getContext();
            b.U(context, R.attr.motionEasingStandardDecelerateInterpolator, L.a.b(0.0f, 0.0f, 0.0f, 1.0f));
            b.T(context, R.attr.motionDurationMedium2, 300);
            b.T(context, R.attr.motionDurationShort3, 150);
            b.T(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float fI = this.f;
                if (fI == -1.0f) {
                    fI = H.i(view);
                }
                gVar.h(fI);
            } else {
                ColorStateList colorStateList = this.f5953c;
                if (colorStateList != null) {
                    H.q(view, colorStateList);
                }
            }
            int i8 = this.f5957h == 5 ? 4 : 0;
            if (view.getVisibility() != i8) {
                view.setVisibility(i8);
            }
            v();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (L.b(view) == null) {
                P.i(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i9 = Gravity.getAbsoluteGravity(((w.d) view.getLayoutParams()).f9272c, i5) == 3 ? 1 : 0;
        a aVar = this.f5951a;
        if (aVar == null || aVar.O() != i9) {
            k kVar = this.f5954d;
            w.d dVar = null;
            if (i9 == 0) {
                this.f5951a = new P1.a(this, i7);
                if (kVar != null) {
                    WeakReference weakReference = this.f5964p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof w.d)) {
                        dVar = (w.d) view3.getLayoutParams();
                    }
                    if (dVar == null || ((ViewGroup.MarginLayoutParams) dVar).rightMargin <= 0) {
                        j jVarE = kVar.e();
                        jVarE.f = new O1.a(0.0f);
                        jVarE.f1955g = new O1.a(0.0f);
                        k kVarA = jVarE.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(kVarA);
                        }
                    }
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalArgumentException("Invalid sheet edge position value: " + i9 + ". Must be 0 or 1.");
                }
                this.f5951a = new P1.a(this, iH);
                if (kVar != null) {
                    WeakReference weakReference2 = this.f5964p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof w.d)) {
                        dVar = (w.d) view2.getLayoutParams();
                    }
                    if (dVar == null || ((ViewGroup.MarginLayoutParams) dVar).leftMargin <= 0) {
                        j jVarE2 = kVar.e();
                        jVarE2.f1954e = new O1.a(0.0f);
                        jVarE2.f1956h = new O1.a(0.0f);
                        k kVarA2 = jVarE2.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(kVarA2);
                        }
                    }
                }
            }
        }
        if (this.f5958i == null) {
            this.f5958i = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f5970v);
        }
        int iH2 = this.f5951a.H(view);
        coordinatorLayout.q(i5, view);
        this.f5962m = coordinatorLayout.getWidth();
        this.n = this.f5951a.I(coordinatorLayout);
        this.f5961l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f5963o = marginLayoutParams != null ? this.f5951a.b(marginLayoutParams) : 0;
        int i10 = this.f5957h;
        if (i10 == 1 || i10 == 2) {
            iH = iH2 - this.f5951a.H(view);
        } else if (i10 != 3) {
            if (i10 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f5957h);
            }
            iH = this.f5951a.E();
        }
        view.offsetLeftAndRight(iH);
        if (this.f5965q == null && (i6 = this.f5966r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i6)) != null) {
            this.f5965q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f5969u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // w.AbstractC0899a
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i5, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i6, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i7, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // w.AbstractC0899a
    public final void n(View view, Parcelable parcelable) {
        int i5 = ((c) parcelable).f;
        if (i5 == 1 || i5 == 2) {
            i5 = 5;
        }
        this.f5957h = i5;
    }

    @Override // w.AbstractC0899a
    public final Parcelable o(View view) {
        return new c(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // w.AbstractC0899a
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f5957h == 1 && actionMasked == 0) {
            return true;
        }
        if (t()) {
            this.f5958i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f5967s) != null) {
            velocityTracker.recycle();
            this.f5967s = null;
        }
        if (this.f5967s == null) {
            this.f5967s = VelocityTracker.obtain();
        }
        this.f5967s.addMovement(motionEvent);
        if (t() && actionMasked == 2 && !this.f5959j && t()) {
            float fAbs = Math.abs(this.f5968t - motionEvent.getX());
            d dVar = this.f5958i;
            if (fAbs > dVar.f2508b) {
                dVar.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.f5959j;
    }

    public final void s(int i5) {
        View view;
        if (this.f5957h == i5) {
            return;
        }
        this.f5957h = i5;
        WeakReference weakReference = this.f5964p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i6 = this.f5957h == 5 ? 4 : 0;
        if (view.getVisibility() != i6) {
            view.setVisibility(i6);
        }
        Iterator it = this.f5969u.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        v();
    }

    public final boolean t() {
        return this.f5958i != null && (this.f5956g || this.f5957h == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        s(2);
        r2.f5955e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L19
            r0 = 5
            if (r4 != r0) goto Ld
            V1.a r0 = r2.f5951a
            int r0 = r0.E()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Invalid state to get outer edge offset: "
            java.lang.String r3 = A3.f.l(r4, r3)
            r2.<init>(r3)
            throw r2
        L19:
            V1.a r0 = r2.f5951a
            int r0 = r0.D()
        L1f:
            S.d r1 = r2.f5958i
            if (r1 == 0) goto L57
            if (r5 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r5 = r3.getTop()
            r1.f2522r = r3
            r3 = -1
            r1.f2509c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L4b
            int r5 = r1.f2507a
            if (r5 != 0) goto L4b
            android.view.View r5 = r1.f2522r
            if (r5 == 0) goto L4b
            r5 = 0
            r1.f2522r = r5
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.s(r3)
            A1.i r2 = r2.f5955e
            r2.a(r4)
            goto L5a
        L57:
            r2.s(r4)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.u(android.view.View, int, boolean):void");
    }

    public final void v() {
        View view;
        WeakReference weakReference = this.f5964p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        P.f(NetworkAnalyticsConstants.DataPoints.FLAG_PARENT_PROCESS_HASH, view);
        P.d(0, view);
        P.f(IDMDmInterface.IDM_MAX_OBJ_SIZE, view);
        P.d(0, view);
        final int i5 = 5;
        if (this.f5957h != 5) {
            P.g(view, K.c.f1607j, new q() { // from class: P1.b
                /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
                @Override // K.q
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final boolean h(android.view.View r4) {
                    /*
                        r3 = this;
                        r4 = 1
                        com.google.android.material.sidesheet.SideSheetBehavior r0 = r3.f2144d
                        r0.getClass()
                        int r3 = r2
                        if (r3 == r4) goto L46
                        r1 = 2
                        if (r3 != r1) goto Le
                        goto L46
                    Le:
                        java.lang.ref.WeakReference r1 = r0.f5964p
                        if (r1 == 0) goto L42
                        java.lang.Object r1 = r1.get()
                        if (r1 != 0) goto L19
                        goto L42
                    L19:
                        java.lang.ref.WeakReference r1 = r0.f5964p
                        java.lang.Object r1 = r1.get()
                        android.view.View r1 = (android.view.View) r1
                        A.p r2 = new A.p
                        r2.<init>(r3, r0, r4)
                        android.view.ViewParent r3 = r1.getParent()
                        if (r3 == 0) goto L3e
                        boolean r3 = r3.isLayoutRequested()
                        if (r3 == 0) goto L3e
                        java.util.WeakHashMap r3 = J.P.f1421a
                        boolean r3 = r1.isAttachedToWindow()
                        if (r3 == 0) goto L3e
                        r1.post(r2)
                        goto L45
                    L3e:
                        r2.run()
                        goto L45
                    L42:
                        r0.s(r3)
                    L45:
                        return r4
                    L46:
                        java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        java.lang.String r2 = "STATE_"
                        r1.<init>(r2)
                        if (r3 != r4) goto L54
                        java.lang.String r3 = "DRAGGING"
                        goto L56
                    L54:
                        java.lang.String r3 = "SETTLING"
                    L56:
                        java.lang.String r4 = " should not be set externally."
                        java.lang.String r3 = A3.f.p(r1, r3, r4)
                        r0.<init>(r3)
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: P1.b.h(android.view.View):boolean");
                }
            });
        }
        final int i6 = 3;
        if (this.f5957h != 3) {
            P.g(view, K.c.f1605h, new q() { // from class: P1.b
                @Override // K.q
                public final boolean h(View v2) {
                    /*
                        this = this;
                        r4 = 1
                        com.google.android.material.sidesheet.SideSheetBehavior r0 = r3.f2144d
                        r0.getClass()
                        int r3 = r2
                        if (r3 == r4) goto L46
                        r1 = 2
                        if (r3 != r1) goto Le
                        goto L46
                    Le:
                        java.lang.ref.WeakReference r1 = r0.f5964p
                        if (r1 == 0) goto L42
                        java.lang.Object r1 = r1.get()
                        if (r1 != 0) goto L19
                        goto L42
                    L19:
                        java.lang.ref.WeakReference r1 = r0.f5964p
                        java.lang.Object r1 = r1.get()
                        android.view.View r1 = (android.view.View) r1
                        A.p r2 = new A.p
                        r2.<init>(r3, r0, r4)
                        android.view.ViewParent r3 = r1.getParent()
                        if (r3 == 0) goto L3e
                        boolean r3 = r3.isLayoutRequested()
                        if (r3 == 0) goto L3e
                        java.util.WeakHashMap r3 = J.P.f1421a
                        boolean r3 = r1.isAttachedToWindow()
                        if (r3 == 0) goto L3e
                        r1.post(r2)
                        goto L45
                    L3e:
                        r2.run()
                        goto L45
                    L42:
                        r0.s(r3)
                    L45:
                        return r4
                    L46:
                        java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        java.lang.String r2 = "STATE_"
                        r1.<init>(r2)
                        if (r3 != r4) goto L54
                        java.lang.String r3 = "DRAGGING"
                        goto L56
                    L54:
                        java.lang.String r3 = "SETTLING"
                    L56:
                        java.lang.String r4 = " should not be set externally."
                        java.lang.String r3 = A3.f.p(r1, r3, r4)
                        r0.<init>(r3)
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: P1.b.h(android.view.View):boolean");
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f5955e = new i(this);
        this.f5956g = true;
        this.f5957h = 5;
        this.f5960k = 0.1f;
        this.f5966r = -1;
        this.f5969u = new LinkedHashSet();
        this.f5970v = new A1.d(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u1.a.f9180y);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f5953c = a.z(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f5954d = k.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f5966r = resourceId;
            WeakReference weakReference = this.f5965q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f5965q = null;
            WeakReference weakReference2 = this.f5964p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = P.f1421a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.f5954d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f5952b = gVar;
            gVar.g(context);
            ColorStateList colorStateList = this.f5953c;
            if (colorStateList != null) {
                this.f5952b.i(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f5952b.setTint(typedValue.data);
            }
        }
        this.f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f5956g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
