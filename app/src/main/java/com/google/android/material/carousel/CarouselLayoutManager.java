package com.google.android.material.carousel;

import A3.f;
import C1.c;
import C1.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import b4.d;
import com.google.android.material.carousel.CarouselLayoutManager;
import j0.AbstractC0519J;
import j0.C0520K;
import j0.C0525P;
import j0.InterfaceC0531W;
import j0.X;
import u1.a;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC0519J implements InterfaceC0531W {

    /* renamed from: p, reason: collision with root package name */
    public e f5816p;

    /* renamed from: q, reason: collision with root package name */
    public final View.OnLayoutChangeListener f5817q;

    public CarouselLayoutManager() {
        new d();
        new C1.d();
        this.f5817q = new View.OnLayoutChangeListener() { // from class: C1.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                CarouselLayoutManager carouselLayoutManager = this.f338a;
                carouselLayoutManager.getClass();
                if (i5 == i9 && i6 == i10 && i7 == i11 && i8 == i12) {
                    return;
                }
                view.post(new b(0, carouselLayoutManager));
            }
        };
        m0();
        D0(0);
    }

    public final boolean B0() {
        return this.f5816p.f345a == 0;
    }

    public final boolean C0() {
        return B0() && A() == 1;
    }

    public final void D0(int i5) {
        e eVar;
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException(f.l(i5, "invalid orientation:"));
        }
        c(null);
        e eVar2 = this.f5816p;
        if (eVar2 == null || i5 != eVar2.f345a) {
            if (i5 == 0) {
                eVar = new e(this, 1);
            } else {
                if (i5 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                eVar = new e(this, 0);
            }
            this.f5816p = eVar;
            m0();
        }
    }

    @Override // j0.AbstractC0519J
    public final void P(RecyclerView recyclerView) {
        m0();
        recyclerView.addOnLayoutChangeListener(this.f5817q);
    }

    @Override // j0.AbstractC0519J
    public final void Q(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f5817q);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    @Override // j0.AbstractC0519J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View R(android.view.View r5, int r6, j0.C0525P r7, j0.X r8) {
        /*
            r4 = this;
            int r7 = r4.v()
            r8 = 0
            if (r7 != 0) goto L8
            return r8
        L8:
            C1.e r7 = r4.f5816p
            int r7 = r7.f345a
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -1
            r2 = 1
            if (r6 == r2) goto L53
            r3 = 2
            if (r6 == r3) goto L51
            r3 = 17
            if (r6 == r3) goto L49
            r3 = 33
            if (r6 == r3) goto L46
            r3 = 66
            if (r6 == r3) goto L3d
            r3 = 130(0x82, float:1.82E-43)
            if (r6 == r3) goto L3a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown focus request:"
            r7.<init>(r3)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "CarouselLayoutManager"
            android.util.Log.d(r7, r6)
        L38:
            r6 = r0
            goto L54
        L3a:
            if (r7 != r2) goto L38
            goto L51
        L3d:
            if (r7 != 0) goto L38
            boolean r6 = r4.C0()
            if (r6 == 0) goto L51
            goto L53
        L46:
            if (r7 != r2) goto L38
            goto L53
        L49:
            if (r7 != 0) goto L38
            boolean r6 = r4.C0()
            if (r6 == 0) goto L53
        L51:
            r6 = r2
            goto L54
        L53:
            r6 = r1
        L54:
            if (r6 != r0) goto L57
            return r8
        L57:
            r7 = 0
            if (r6 != r1) goto L8b
            int r5 = j0.AbstractC0519J.F(r5)
            if (r5 != 0) goto L61
            return r8
        L61:
            android.view.View r5 = r4.u(r7)
            int r5 = j0.AbstractC0519J.F(r5)
            int r5 = r5 - r2
            if (r5 < 0) goto L7a
            int r6 = r4.z()
            if (r5 < r6) goto L73
            goto L7a
        L73:
            C1.e r4 = r4.f5816p
            r4.a()
            r4 = 0
            throw r4
        L7a:
            boolean r5 = r4.C0()
            if (r5 == 0) goto L86
            int r5 = r4.v()
            int r7 = r5 + (-1)
        L86:
            android.view.View r4 = r4.u(r7)
            goto Lc6
        L8b:
            int r5 = j0.AbstractC0519J.F(r5)
            int r6 = r4.z()
            int r6 = r6 - r2
            if (r5 != r6) goto L97
            return r8
        L97:
            int r5 = r4.v()
            int r5 = r5 - r2
            android.view.View r5 = r4.u(r5)
            int r5 = j0.AbstractC0519J.F(r5)
            int r5 = r5 + r2
            if (r5 < 0) goto Lb5
            int r6 = r4.z()
            if (r5 < r6) goto Lae
            goto Lb5
        Lae:
            C1.e r4 = r4.f5816p
            r4.a()
            r4 = 0
            throw r4
        Lb5:
            boolean r5 = r4.C0()
            if (r5 == 0) goto Lbc
            goto Lc2
        Lbc:
            int r5 = r4.v()
            int r7 = r5 + (-1)
        Lc2:
            android.view.View r4 = r4.u(r7)
        Lc6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.R(android.view.View, int, j0.P, j0.X):android.view.View");
    }

    @Override // j0.AbstractC0519J
    public final void S(AccessibilityEvent accessibilityEvent) {
        super.S(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(AbstractC0519J.F(u(0)));
            accessibilityEvent.setToIndex(AbstractC0519J.F(u(v() - 1)));
        }
    }

    @Override // j0.AbstractC0519J
    public final void W(int i5, int i6) {
        z();
    }

    @Override // j0.AbstractC0519J
    public final void Z(int i5, int i6) {
        z();
    }

    @Override // j0.InterfaceC0531W
    public final PointF a(int i5) {
        return null;
    }

    @Override // j0.AbstractC0519J
    public final void b0(C0525P c0525p, X x4) {
        if (x4.b() > 0) {
            if ((B0() ? this.n : this.f7074o) > 0.0f) {
                C0();
                View view = c0525p.k(0, Long.MAX_VALUE).f7128a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        h0(c0525p);
    }

    @Override // j0.AbstractC0519J
    public final void c0(X x4) {
        if (v() == 0) {
            return;
        }
        AbstractC0519J.F(u(0));
    }

    @Override // j0.AbstractC0519J
    public final boolean d() {
        return B0();
    }

    @Override // j0.AbstractC0519J
    public final boolean e() {
        return !B0();
    }

    @Override // j0.AbstractC0519J
    public final int j(X x4) {
        v();
        return 0;
    }

    @Override // j0.AbstractC0519J
    public final int k(X x4) {
        return 0;
    }

    @Override // j0.AbstractC0519J
    public final int l(X x4) {
        return 0;
    }

    @Override // j0.AbstractC0519J
    public final boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z4, boolean z5) {
        return false;
    }

    @Override // j0.AbstractC0519J
    public final int m(X x4) {
        v();
        return 0;
    }

    @Override // j0.AbstractC0519J
    public final int n(X x4) {
        return 0;
    }

    @Override // j0.AbstractC0519J
    public final int n0(int i5, C0525P c0525p, X x4) {
        if (!B0() || v() == 0 || i5 == 0) {
            return 0;
        }
        View view = c0525p.k(0, Long.MAX_VALUE).f7128a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // j0.AbstractC0519J
    public final int o(X x4) {
        return 0;
    }

    @Override // j0.AbstractC0519J
    public final void o0(int i5) {
    }

    @Override // j0.AbstractC0519J
    public final int p0(int i5, C0525P c0525p, X x4) {
        if (!e() || v() == 0 || i5 == 0) {
            return 0;
        }
        View view = c0525p.k(0, Long.MAX_VALUE).f7128a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // j0.AbstractC0519J
    public final C0520K r() {
        return new C0520K(-2, -2);
    }

    @Override // j0.AbstractC0519J
    public final void y(Rect rect, View view) {
        RecyclerView.W(rect, view);
        rect.centerY();
        if (B0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // j0.AbstractC0519J
    public final void y0(RecyclerView recyclerView, int i5) {
        c cVar = new c(this, recyclerView.getContext(), 0);
        cVar.f7300a = i5;
        z0(cVar);
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i5, int i6) {
        new C1.d();
        this.f5817q = new View.OnLayoutChangeListener() { // from class: C1.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i52, int i62, int i7, int i8, int i9, int i10, int i11, int i12) {
                CarouselLayoutManager carouselLayoutManager = this.f338a;
                carouselLayoutManager.getClass();
                if (i52 == i9 && i62 == i10 && i7 == i11 && i8 == i12) {
                    return;
                }
                view.post(new b(0, carouselLayoutManager));
            }
        };
        new d();
        m0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f9159b);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            m0();
            D0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
