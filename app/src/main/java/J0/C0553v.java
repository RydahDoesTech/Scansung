package j0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: j0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0553v {

    /* renamed from: a, reason: collision with root package name */
    public int f7300a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f7301b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC0519J f7302c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7303d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7304e;
    public View f;

    /* renamed from: g, reason: collision with root package name */
    public final C0530V f7305g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7306h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f7307i;

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f7308j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f7309k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f7310l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7311m;
    public float n;

    /* renamed from: o, reason: collision with root package name */
    public int f7312o;

    /* renamed from: p, reason: collision with root package name */
    public int f7313p;

    public C0553v(Context context) {
        C0530V c0530v = new C0530V();
        c0530v.f7097d = -1;
        c0530v.f = false;
        c0530v.f7099g = 0;
        c0530v.f7094a = 0;
        c0530v.f7095b = 0;
        c0530v.f7096c = Integer.MIN_VALUE;
        c0530v.f7098e = null;
        this.f7305g = c0530v;
        this.f7307i = new LinearInterpolator();
        this.f7308j = new DecelerateInterpolator();
        this.f7311m = false;
        this.f7312o = 0;
        this.f7313p = 0;
        this.f7310l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i5, int i6, int i7, int i8, int i9) {
        if (i9 == -1) {
            return i7 - i5;
        }
        if (i9 != 0) {
            if (i9 == 1) {
                return i8 - i6;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i10 = i7 - i5;
        if (i10 > 0) {
            return i10;
        }
        int i11 = i8 - i6;
        if (i11 < 0) {
            return i11;
        }
        return 0;
    }

    public int b(View view, int i5) {
        AbstractC0519J abstractC0519J = this.f7302c;
        if (abstractC0519J == null || !abstractC0519J.d()) {
            return 0;
        }
        C0520K c0520k = (C0520K) view.getLayoutParams();
        return a((view.getLeft() - ((C0520K) view.getLayoutParams()).f7076b.left) - ((ViewGroup.MarginLayoutParams) c0520k).leftMargin, view.getRight() + ((C0520K) view.getLayoutParams()).f7076b.right + ((ViewGroup.MarginLayoutParams) c0520k).rightMargin, abstractC0519J.C(), abstractC0519J.n - abstractC0519J.D(), i5);
    }

    public int c(View view, int i5) {
        AbstractC0519J abstractC0519J = this.f7302c;
        if (abstractC0519J == null || !abstractC0519J.e()) {
            return 0;
        }
        C0520K c0520k = (C0520K) view.getLayoutParams();
        return a((view.getTop() - ((C0520K) view.getLayoutParams()).f7076b.top) - ((ViewGroup.MarginLayoutParams) c0520k).topMargin, view.getBottom() + ((C0520K) view.getLayoutParams()).f7076b.bottom + ((ViewGroup.MarginLayoutParams) c0520k).bottomMargin, abstractC0519J.E(), abstractC0519J.f7074o - abstractC0519J.B(), i5);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i5) {
        float fAbs = Math.abs(i5);
        if (!this.f7311m) {
            this.n = d(this.f7310l);
            this.f7311m = true;
        }
        return (int) Math.ceil(fAbs * this.n);
    }

    public PointF f(int i5) {
        Object obj = this.f7302c;
        if (obj instanceof InterfaceC0531W) {
            return ((InterfaceC0531W) obj).a(i5);
        }
        Log.w("SeslRecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC0531W.class.getCanonicalName());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r8, int r9) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.C0553v.g(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(android.view.View r8, j0.C0530V r9) {
        /*
            r7 = this;
            android.graphics.PointF r0 = r7.f7309k
            r1 = 0
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = r4
            goto L16
        L13:
            r0 = r2
            goto L16
        L15:
            r0 = r1
        L16:
            int r0 = r7.b(r8, r0)
            android.graphics.PointF r5 = r7.f7309k
            if (r5 == 0) goto L2a
            float r5 = r5.y
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 != 0) goto L25
            goto L2a
        L25:
            if (r3 <= 0) goto L29
            r1 = r4
            goto L2a
        L29:
            r1 = r2
        L2a:
            int r8 = r7.c(r8, r1)
            int r1 = r0 * r0
            int r2 = r8 * r8
            int r2 = r2 + r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            int r1 = (int) r1
            int r1 = r7.e(r1)
            double r1 = (double) r1
            r5 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r1 = r1 / r5
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            if (r1 <= 0) goto L59
            int r0 = -r0
            int r8 = -r8
            android.view.animation.DecelerateInterpolator r7 = r7.f7308j
            r9.f7094a = r0
            r9.f7095b = r8
            r9.f7096c = r1
            r9.f7098e = r7
            r9.f = r4
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.C0553v.h(android.view.View, j0.V):void");
    }

    public final void i() {
        if (this.f7304e) {
            this.f7304e = false;
            this.f7313p = 0;
            this.f7312o = 0;
            this.f7309k = null;
            this.f7301b.m0.f7100a = -1;
            this.f = null;
            this.f7300a = -1;
            this.f7303d = false;
            AbstractC0519J abstractC0519J = this.f7302c;
            if (abstractC0519J.f7066e == this) {
                abstractC0519J.f7066e = null;
            }
            this.f7302c = null;
            this.f7301b = null;
        }
    }
}
