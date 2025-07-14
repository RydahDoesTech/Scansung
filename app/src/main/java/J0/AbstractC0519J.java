package j0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.p000firebaseauthapi.b5;
import com.google.firebase.messaging.C0388e;
import i0.AbstractC0479a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import r0.AbstractC0808b;

/* renamed from: j0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0519J {

    /* renamed from: a, reason: collision with root package name */
    public B3.h f7062a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f7063b;

    /* renamed from: c, reason: collision with root package name */
    public final C0388e f7064c;

    /* renamed from: d, reason: collision with root package name */
    public final C0388e f7065d;

    /* renamed from: e, reason: collision with root package name */
    public C0553v f7066e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7067g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7068h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7069i;

    /* renamed from: j, reason: collision with root package name */
    public int f7070j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7071k;

    /* renamed from: l, reason: collision with root package name */
    public int f7072l;

    /* renamed from: m, reason: collision with root package name */
    public int f7073m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public int f7074o;

    public AbstractC0519J() {
        C0517H c0517h = new C0517H(this, 0);
        C0517H c0517h2 = new C0517H(this, 1);
        this.f7064c = new C0388e(c0517h);
        this.f7065d = new C0388e(c0517h2);
        this.f = false;
        this.f7067g = false;
        this.f7068h = true;
        this.f7069i = true;
    }

    public static int F(View view) {
        if (view != null) {
            return ((C0520K) view.getLayoutParams()).f7075a.b();
        }
        Log.e("SeslRecyclerView", "View is null.");
        return -1;
    }

    public static C0518I G(Context context, AttributeSet attributeSet, int i5, int i6) {
        C0518I c0518i = new C0518I();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0479a.f6917a, i5, i6);
        c0518i.f7058a = typedArrayObtainStyledAttributes.getInt(0, 1);
        c0518i.f7059b = typedArrayObtainStyledAttributes.getInt(10, 1);
        c0518i.f7060c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c0518i.f7061d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c0518i;
    }

    public static boolean K(int i5, int i6, int i7) {
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        if (i7 > 0 && i5 != i7) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i5;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i5;
        }
        return true;
    }

    public static void L(View view, int i5, int i6, int i7, int i8) {
        C0520K c0520k = (C0520K) view.getLayoutParams();
        Rect rect = c0520k.f7076b;
        view.layout(i5 + rect.left + ((ViewGroup.MarginLayoutParams) c0520k).leftMargin, i6 + rect.top + ((ViewGroup.MarginLayoutParams) c0520k).topMargin, (i7 - rect.right) - ((ViewGroup.MarginLayoutParams) c0520k).rightMargin, (i8 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0520k).bottomMargin);
    }

    public static int g(int i5, int i6, int i7) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i6, i7) : size : Math.min(size, Math.max(i6, i7));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.AbstractC0519J.w(boolean, int, int, int, int):int");
    }

    public final int A() {
        RecyclerView recyclerView = this.f7063b;
        if (recyclerView == null) {
            Log.e("SeslRecyclerView", "RecyclerView is null.");
            return 0;
        }
        WeakHashMap weakHashMap = J.P.f1421a;
        return recyclerView.getLayoutDirection();
    }

    public boolean A0() {
        return false;
    }

    public final int B() {
        RecyclerView recyclerView = this.f7063b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f7063b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.f7063b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f7063b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int H(C0525P c0525p, X x4) {
        AbstractC0510A abstractC0510A;
        RecyclerView recyclerView = this.f7063b;
        if (recyclerView == null || (abstractC0510A = recyclerView.f4831p) == null) {
            return 1;
        }
        if (abstractC0510A instanceof androidx.preference.D) {
            if (e()) {
                return this.f7063b.f4831p.f();
            }
            return 1;
        }
        if (e()) {
            return this.f7063b.f4831p.a();
        }
        return 1;
    }

    public final void I(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((C0520K) view.getLayoutParams()).f7076b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f7063b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f7063b.f4829o;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public boolean J() {
        return false;
    }

    public void M(int i5) {
        RecyclerView recyclerView = this.f7063b;
        if (recyclerView != null) {
            int iG = recyclerView.f4814i.g();
            for (int i6 = 0; i6 < iG; i6++) {
                recyclerView.f4814i.f(i6).offsetLeftAndRight(i5);
            }
        }
    }

    public void N(int i5) {
        RecyclerView recyclerView = this.f7063b;
        if (recyclerView != null) {
            int iG = recyclerView.f4814i.g();
            for (int i6 = 0; i6 < iG; i6++) {
                recyclerView.f4814i.f(i6).offsetTopAndBottom(i5);
            }
        }
    }

    public void O() {
    }

    public void P(RecyclerView recyclerView) {
    }

    public abstract void Q(RecyclerView recyclerView);

    public abstract View R(View view, int i5, C0525P c0525p, X x4);

    public void S(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f7063b;
        C0525P c0525p = recyclerView.f;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z4 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f7063b.canScrollVertically(-1) && !this.f7063b.canScrollHorizontally(-1) && !this.f7063b.canScrollHorizontally(1)) {
            z4 = false;
        }
        accessibilityEvent.setScrollable(z4);
        AbstractC0510A abstractC0510A = this.f7063b.f4831p;
        if (abstractC0510A != null) {
            if (abstractC0510A instanceof androidx.preference.D) {
                accessibilityEvent.setItemCount(abstractC0510A.f());
            } else {
                accessibilityEvent.setItemCount(abstractC0510A.a());
            }
        }
    }

    public void T(C0525P c0525p, X x4, K.h hVar) {
        if (this.f7063b.canScrollVertically(-1) || this.f7063b.canScrollHorizontally(-1)) {
            hVar.a(8192);
            hVar.i(true);
        }
        if (this.f7063b.canScrollVertically(1) || this.f7063b.canScrollHorizontally(1)) {
            hVar.a(4096);
            hVar.i(true);
        }
        hVar.f1615a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(H(c0525p, x4), x(c0525p, x4), false, 0));
    }

    public final void U(View view, K.h hVar) {
        b0 b0VarV = RecyclerView.V(view);
        if (b0VarV == null || b0VarV.i() || ((ArrayList) this.f7062a.f263e).contains(b0VarV.f7128a)) {
            return;
        }
        RecyclerView recyclerView = this.f7063b;
        V(recyclerView.f, recyclerView.m0, view, hVar);
    }

    public void V(C0525P c0525p, X x4, View view, K.h hVar) {
        int iF = e() ? F(view) : 0;
        int iF2 = d() ? F(view) : 0;
        AbstractC0510A abstractC0510A = this.f7063b.f4831p;
        abstractC0510A.getClass();
        if (abstractC0510A instanceof androidx.preference.D) {
            iF = this.f7063b.f4831p.g(iF);
            iF2 = this.f7063b.f4831p.g(iF2);
        }
        hVar.h(K.g.a(false, iF, 1, iF2, 1));
    }

    public void W(int i5, int i6) {
    }

    public void X() {
    }

    public void Y(int i5, int i6) {
    }

    public void Z(int i5, int i6) {
    }

    public void a0(int i5, int i6) {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.view.View r10, int r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.AbstractC0519J.b(android.view.View, int, boolean):void");
    }

    public abstract void b0(C0525P c0525p, X x4);

    public void c(String str) {
        RecyclerView recyclerView = this.f7063b;
        if (recyclerView != null) {
            recyclerView.n(str);
        }
    }

    public abstract void c0(X x4);

    public abstract boolean d();

    public void d0(Parcelable parcelable) {
    }

    public abstract boolean e();

    public Parcelable e0() {
        return null;
    }

    public boolean f(C0520K c0520k) {
        return c0520k != null;
    }

    public void f0(int i5) {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0061 A[PHI: r3
  0x0061: PHI (r3v8 int) = (r3v5 int), (r3v11 int) binds: [B:28:0x007d, B:20:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g0(j0.C0525P r3, j0.X r4, int r5, android.os.Bundle r6) {
        /*
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r3 = r2.f7063b
            r4 = 0
            if (r3 != 0) goto L6
            return r4
        L6:
            int r3 = r2.f7074o
            int r6 = r2.n
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            androidx.recyclerview.widget.RecyclerView r1 = r2.f7063b
            android.graphics.Matrix r1 = r1.getMatrix()
            boolean r1 = r1.isIdentity()
            if (r1 == 0) goto L2b
            androidx.recyclerview.widget.RecyclerView r1 = r2.f7063b
            boolean r1 = r1.getGlobalVisibleRect(r0)
            if (r1 == 0) goto L2b
            int r3 = r0.height()
            int r6 = r0.width()
        L2b:
            r0 = 4096(0x1000, float:5.74E-42)
            r1 = 1
            if (r5 == r0) goto L63
            r0 = 8192(0x2000, float:1.148E-41)
            if (r5 == r0) goto L37
            r3 = r4
            r5 = r3
            goto L8a
        L37:
            androidx.recyclerview.widget.RecyclerView r5 = r2.f7063b
            r0 = -1
            boolean r5 = r5.canScrollVertically(r0)
            if (r5 == 0) goto L4c
            int r5 = r2.E()
            int r3 = r3 - r5
            int r5 = r2.B()
            int r3 = r3 - r5
            int r3 = -r3
            goto L4d
        L4c:
            r3 = r4
        L4d:
            androidx.recyclerview.widget.RecyclerView r5 = r2.f7063b
            boolean r5 = r5.canScrollHorizontally(r0)
            if (r5 == 0) goto L61
            int r5 = r2.C()
            int r6 = r6 - r5
            int r5 = r2.D()
            int r6 = r6 - r5
            int r5 = -r6
            goto L8a
        L61:
            r5 = r4
            goto L8a
        L63:
            androidx.recyclerview.widget.RecyclerView r5 = r2.f7063b
            boolean r5 = r5.canScrollVertically(r1)
            if (r5 == 0) goto L76
            int r5 = r2.E()
            int r3 = r3 - r5
            int r5 = r2.B()
            int r3 = r3 - r5
            goto L77
        L76:
            r3 = r4
        L77:
            androidx.recyclerview.widget.RecyclerView r5 = r2.f7063b
            boolean r5 = r5.canScrollHorizontally(r1)
            if (r5 == 0) goto L61
            int r5 = r2.C()
            int r6 = r6 - r5
            int r5 = r2.D()
            int r5 = r6 - r5
        L8a:
            if (r3 != 0) goto L8f
            if (r5 != 0) goto L8f
            return r4
        L8f:
            androidx.recyclerview.widget.RecyclerView r2 = r2.f7063b
            r2.z0(r5, r1, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.AbstractC0519J.g0(j0.P, j0.X, int, android.os.Bundle):boolean");
    }

    public void h(int i5, int i6, X x4, b5 b5Var) {
    }

    public final void h0(C0525P c0525p) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            if (!RecyclerView.V(u(iV)).p()) {
                View viewU = u(iV);
                k0(iV);
                c0525p.h(viewU);
            }
        }
    }

    public void i(int i5, b5 b5Var) {
    }

    public final void i0(C0525P c0525p) {
        ArrayList arrayList;
        int size = c0525p.f7086a.size();
        int i5 = size - 1;
        while (true) {
            arrayList = c0525p.f7086a;
            if (i5 < 0) {
                break;
            }
            View view = ((b0) arrayList.get(i5)).f7128a;
            b0 b0VarV = RecyclerView.V(view);
            if (!b0VarV.p()) {
                b0VarV.o(false);
                if (b0VarV.k()) {
                    this.f7063b.removeDetachedView(view, false);
                }
                AbstractC0515F abstractC0515F = this.f7063b.f4767Q;
                if (abstractC0515F != null) {
                    abstractC0515F.d(b0VarV);
                }
                b0VarV.o(true);
                b0 b0VarV2 = RecyclerView.V(view);
                b0VarV2.n = null;
                b0VarV2.f7140o = false;
                b0VarV2.f7136j &= -33;
                c0525p.i(b0VarV2);
            }
            i5--;
        }
        arrayList.clear();
        ArrayList arrayList2 = c0525p.f7087b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f7063b.invalidate();
        }
    }

    public abstract int j(X x4);

    public final void j0(View view, C0525P c0525p) {
        B3.h hVar = this.f7062a;
        C0556y c0556y = (C0556y) hVar.f261c;
        int i5 = hVar.f260b;
        if (i5 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i5 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            hVar.f260b = 1;
            hVar.f = view;
            int iIndexOfChild = c0556y.f7319a.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (((C0534c) hVar.f262d).f(iIndexOfChild)) {
                    hVar.m(view);
                }
                c0556y.h(iIndexOfChild);
            }
            hVar.f260b = 0;
            hVar.f = null;
            c0525p.h(view);
        } catch (Throwable th) {
            hVar.f260b = 0;
            hVar.f = null;
            throw th;
        }
    }

    public abstract int k(X x4);

    public final void k0(int i5) {
        if (u(i5) != null) {
            B3.h hVar = this.f7062a;
            C0556y c0556y = (C0556y) hVar.f261c;
            int i6 = hVar.f260b;
            if (i6 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i6 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int iH = hVar.h(i5);
                View childAt = c0556y.f7319a.getChildAt(iH);
                if (childAt != null) {
                    hVar.f260b = 1;
                    hVar.f = childAt;
                    if (((C0534c) hVar.f262d).f(iH)) {
                        hVar.m(childAt);
                    }
                    c0556y.h(iH);
                }
            } finally {
                hVar.f260b = 0;
                hVar.f = null;
            }
        }
    }

    public abstract int l(X x4);

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean l0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.C()
            int r1 = r8.E()
            int r2 = r8.n
            int r3 = r8.D()
            int r2 = r2 - r3
            int r3 = r8.f7074o
            int r4 = r8.B()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.A()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7c
            goto Lb3
        L7c:
            int r1 = r8.C()
            int r2 = r8.E()
            int r3 = r8.n
            int r4 = r8.D()
            int r3 = r3 - r4
            int r4 = r8.f7074o
            int r5 = r8.B()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f7063b
            android.graphics.Rect r5 = r5.f4827m
            r8.y(r5, r13)
            int r8 = r5.left
            int r8 = r8 - r11
            if (r8 >= r3) goto Lb3
            int r8 = r5.right
            int r8 = r8 - r11
            if (r8 <= r1) goto Lb3
            int r8 = r5.top
            int r8 = r8 - r10
            if (r8 >= r4) goto Lb3
            int r8 = r5.bottom
            int r8 = r8 - r10
            if (r8 > r2) goto Lae
            goto Lb3
        Lae:
            if (r11 != 0) goto Lb4
            if (r10 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r0
        Lb4:
            if (r12 == 0) goto Lba
            r9.scrollBy(r11, r10)
            goto Lbd
        Lba:
            r9.z0(r11, r0, r10)
        Lbd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.AbstractC0519J.l0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int m(X x4);

    public final void m0() {
        RecyclerView recyclerView = this.f7063b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int n(X x4);

    public abstract int n0(int i5, C0525P c0525p, X x4);

    public abstract int o(X x4);

    public abstract void o0(int i5);

    public final void p(C0525P c0525p) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            b0 b0VarV = RecyclerView.V(viewU);
            if (b0VarV.p()) {
                if (RecyclerView.f4720m2) {
                    Log.d("SeslRecyclerView", "ignoring view " + b0VarV);
                }
            } else if (!b0VarV.g() || b0VarV.i() || this.f7063b.f4831p.f7051b) {
                u(iV);
                this.f7062a.e(iV);
                c0525p.j(viewU);
                this.f7063b.f4818j.C(b0VarV);
            } else {
                k0(iV);
                c0525p.i(b0VarV);
            }
        }
    }

    public abstract int p0(int i5, C0525P c0525p, X x4);

    public View q(int i5) {
        int iV = v();
        for (int i6 = 0; i6 < iV; i6++) {
            View viewU = u(i6);
            b0 b0VarV = RecyclerView.V(viewU);
            if (b0VarV != null && b0VarV.b() == i5 && !b0VarV.p() && (this.f7063b.m0.f7105g || !b0VarV.i())) {
                return viewU;
            }
        }
        return null;
    }

    public final void q0(RecyclerView recyclerView) {
        r0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract C0520K r();

    public final void r0(int i5, int i6) {
        this.n = View.MeasureSpec.getSize(i5);
        int mode = View.MeasureSpec.getMode(i5);
        this.f7072l = mode;
        if (mode == 0 && !RecyclerView.p2) {
            this.n = 0;
        }
        this.f7074o = View.MeasureSpec.getSize(i6);
        int mode2 = View.MeasureSpec.getMode(i6);
        this.f7073m = mode2;
        if (mode2 != 0 || RecyclerView.p2) {
            return;
        }
        this.f7074o = 0;
    }

    public C0520K s(Context context, AttributeSet attributeSet) {
        return new C0520K(context, attributeSet);
    }

    public void s0(Rect rect, int i5, int i6) {
        int iD = D() + C() + rect.width();
        int iB = B() + E() + rect.height();
        RecyclerView recyclerView = this.f7063b;
        WeakHashMap weakHashMap = J.P.f1421a;
        this.f7063b.setMeasuredDimension(g(i5, iD, recyclerView.getMinimumWidth()), g(i6, iB, this.f7063b.getMinimumHeight()));
    }

    public C0520K t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0520K ? new C0520K((C0520K) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0520K((ViewGroup.MarginLayoutParams) layoutParams) : new C0520K(layoutParams);
    }

    public final void t0(int i5, int i6) {
        int iV = v();
        if (iV == 0) {
            this.f7063b.v(i5, i6);
            return;
        }
        int i7 = Integer.MIN_VALUE;
        int i8 = Integer.MAX_VALUE;
        int i9 = Integer.MIN_VALUE;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < iV; i11++) {
            View viewU = u(i11);
            Rect rect = this.f7063b.f4827m;
            y(rect, viewU);
            int i12 = rect.left;
            if (i12 < i10) {
                i10 = i12;
            }
            int i13 = rect.right;
            if (i13 > i7) {
                i7 = i13;
            }
            int i14 = rect.top;
            if (i14 < i8) {
                i8 = i14;
            }
            int i15 = rect.bottom;
            if (i15 > i9) {
                i9 = i15;
            }
        }
        this.f7063b.f4827m.set(i10, i8, i7, i9);
        s0(this.f7063b.f4827m, i5, i6);
    }

    public final View u(int i5) {
        B3.h hVar = this.f7062a;
        if (hVar != null) {
            return hVar.f(i5);
        }
        return null;
    }

    public final void u0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f7063b = null;
            this.f7062a = null;
            this.n = 0;
            this.f7074o = 0;
        } else {
            this.f7063b = recyclerView;
            this.f7062a = recyclerView.f4814i;
            this.n = recyclerView.getWidth();
            this.f7074o = recyclerView.getHeight();
        }
        this.f7072l = 1073741824;
        this.f7073m = 1073741824;
    }

    public final int v() {
        B3.h hVar = this.f7062a;
        if (hVar != null) {
            return hVar.g();
        }
        return 0;
    }

    public final boolean v0(View view, int i5, int i6, C0520K c0520k) {
        return (!view.isLayoutRequested() && this.f7068h && K(view.getWidth(), i5, ((ViewGroup.MarginLayoutParams) c0520k).width) && K(view.getHeight(), i6, ((ViewGroup.MarginLayoutParams) c0520k).height)) ? false : true;
    }

    public boolean w0() {
        return false;
    }

    public int x(C0525P c0525p, X x4) {
        RecyclerView recyclerView = this.f7063b;
        if (recyclerView == null || recyclerView.f4831p == null || !d()) {
            return 1;
        }
        return this.f7063b.f4831p.a();
    }

    public final boolean x0(View view, int i5, int i6, C0520K c0520k) {
        return (this.f7068h && K(view.getMeasuredWidth(), i5, ((ViewGroup.MarginLayoutParams) c0520k).width) && K(view.getMeasuredHeight(), i6, ((ViewGroup.MarginLayoutParams) c0520k).height)) ? false : true;
    }

    public void y(Rect rect, View view) {
        RecyclerView.W(rect, view);
    }

    public abstract void y0(RecyclerView recyclerView, int i5);

    public final int z() {
        RecyclerView recyclerView = this.f7063b;
        AbstractC0510A adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final void z0(C0553v c0553v) {
        C0553v c0553v2 = this.f7066e;
        if (c0553v2 != null && c0553v != c0553v2 && c0553v2.f7304e) {
            c0553v2.i();
        }
        this.f7066e = c0553v;
        RecyclerView recyclerView = this.f7063b;
        a0 a0Var = recyclerView.f4819j0;
        RecyclerView recyclerView2 = a0Var.f7121j;
        recyclerView2.removeCallbacks(a0Var);
        a0Var.f.abortAnimation();
        AbstractC0808b.o(recyclerView2, 0.0f);
        if (c0553v.f7306h) {
            Log.w("SeslRecyclerView", "An instance of " + c0553v.getClass().getSimpleName() + " was started more than once. Each instance of" + c0553v.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0553v.f7301b = recyclerView;
        c0553v.f7302c = this;
        int i5 = c0553v.f7300a;
        if (i5 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.m0.f7100a = i5;
        c0553v.f7304e = true;
        c0553v.f7303d = true;
        c0553v.f = recyclerView.f4833q.q(i5);
        c0553v.f7301b.f4819j0.b();
        c0553v.f7306h = true;
    }
}
