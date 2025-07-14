package androidx.recyclerview.widget;

import A3.f;
import J.P;
import K.g;
import K.h;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.google.android.gms.internal.p000firebaseauthapi.b5;
import com.google.firebase.messaging.C0388e;
import j0.AbstractC0519J;
import j0.C0520K;
import j0.C0525P;
import j0.C0547p;
import j0.C0549r;
import j0.C0550s;
import j0.C0551t;
import j0.X;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;

    /* renamed from: F, reason: collision with root package name */
    public int f4697F;

    /* renamed from: G, reason: collision with root package name */
    public int[] f4698G;

    /* renamed from: H, reason: collision with root package name */
    public View[] f4699H;

    /* renamed from: I, reason: collision with root package name */
    public final SparseIntArray f4700I;

    /* renamed from: J, reason: collision with root package name */
    public final SparseIntArray f4701J;

    /* renamed from: K, reason: collision with root package name */
    public final C0388e f4702K;

    /* renamed from: L, reason: collision with root package name */
    public final Rect f4703L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i5, int i6) {
        super(context, attributeSet, i5, i6);
        this.E = false;
        this.f4697F = -1;
        this.f4700I = new SparseIntArray();
        this.f4701J = new SparseIntArray();
        this.f4702K = new C0388e(8);
        this.f4703L = new Rect();
        n1(AbstractC0519J.G(context, attributeSet, i5, i6).f7059b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, j0.AbstractC0519J
    public final boolean A0() {
        return this.f4718z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void C0(X x4, C0551t c0551t, b5 b5Var) {
        int i5;
        int i6 = this.f4697F;
        for (int i7 = 0; i7 < this.f4697F && (i5 = c0551t.f7290d) >= 0 && i5 < x4.b() && i6 > 0; i7++) {
            b5Var.a(c0551t.f7290d, Math.max(0, c0551t.f7292g));
            this.f4702K.getClass();
            i6--;
            c0551t.f7290d += c0551t.f7291e;
        }
    }

    @Override // j0.AbstractC0519J
    public final int H(C0525P c0525p, X x4) {
        if (this.f4708p == 0) {
            return this.f4697F;
        }
        if (x4.b() < 1) {
            return 0;
        }
        return j1(x4.b() - 1, c0525p, x4) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View P0(C0525P c0525p, X x4, boolean z4, boolean z5) {
        int i5;
        int iV;
        int iV2 = v();
        int i6 = 1;
        if (z5) {
            iV = v() - 1;
            i5 = -1;
            i6 = -1;
        } else {
            i5 = iV2;
            iV = 0;
        }
        int iB = x4.b();
        H0();
        int iK = this.f4710r.k();
        int iG = this.f4710r.g();
        View view = null;
        View view2 = null;
        while (iV != i5) {
            View viewU = u(iV);
            int iF = AbstractC0519J.F(viewU);
            if (iF >= 0 && iF < iB && k1(iF, c0525p, x4) == 0) {
                if (((C0520K) viewU.getLayoutParams()).f7075a.i()) {
                    if (view2 == null) {
                        view2 = viewU;
                    }
                } else {
                    if (this.f4710r.e(viewU) < iG && this.f4710r.b(viewU) > iK) {
                        return viewU;
                    }
                    if (view == null) {
                        view = viewU;
                    }
                }
            }
            iV += i6;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e1, code lost:
    
        if (r13 == (r2 > r15)) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011c  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, j0.AbstractC0519J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View R(android.view.View r23, int r24, j0.C0525P r25, j0.X r26) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.R(android.view.View, int, j0.P, j0.X):android.view.View");
    }

    @Override // j0.AbstractC0519J
    public final void T(C0525P c0525p, X x4, h hVar) {
        super.T(c0525p, x4, hVar);
        hVar.g(GridView.class.getName());
    }

    @Override // j0.AbstractC0519J
    public final void V(C0525P c0525p, X x4, View view, h hVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0547p)) {
            U(view, hVar);
            return;
        }
        C0547p c0547p = (C0547p) layoutParams;
        int iJ1 = j1(c0547p.f7075a.b(), c0525p, x4);
        if (this.f4708p == 0) {
            hVar.h(g.a(false, c0547p.f7269e, c0547p.f, iJ1, 1));
        } else {
            hVar.h(g.a(false, iJ1, 1, c0547p.f7269e, c0547p.f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v37 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V0(C0525P c0525p, X x4, C0551t c0551t, C0550s c0550s) {
        int i5;
        int i6;
        int i7;
        int iD;
        int iC;
        int iE;
        int iD2;
        int iW;
        int iW2;
        ?? r8;
        int i8;
        View viewB;
        int iJ = this.f4710r.j();
        boolean z4 = iJ != 1073741824;
        int i9 = v() > 0 ? this.f4698G[this.f4697F] : 0;
        if (z4) {
            o1();
        }
        boolean z5 = c0551t.f7291e == 1;
        int iK1 = this.f4697F;
        if (!z5) {
            iK1 = k1(c0551t.f7290d, c0525p, x4) + l1(c0551t.f7290d, c0525p, x4);
        }
        int i10 = 0;
        while (i10 < this.f4697F && (i8 = c0551t.f7290d) >= 0 && i8 < x4.b() && iK1 > 0) {
            int i11 = c0551t.f7290d;
            int iL1 = l1(i11, c0525p, x4);
            if (iL1 > this.f4697F) {
                throw new IllegalArgumentException("Item at position " + i11 + " requires " + iL1 + " spans but GridLayoutManager has only " + this.f4697F + " spans.");
            }
            iK1 -= iL1;
            if (iK1 < 0 || (viewB = c0551t.b(c0525p)) == null) {
                break;
            }
            this.f4699H[i10] = viewB;
            i10++;
        }
        if (i10 == 0) {
            c0550s.f7284b = true;
            return;
        }
        if (z5) {
            i7 = 1;
            i6 = i10;
            i5 = 0;
        } else {
            i5 = i10 - 1;
            i6 = -1;
            i7 = -1;
        }
        int i12 = 0;
        while (i5 != i6) {
            View view = this.f4699H[i5];
            C0547p c0547p = (C0547p) view.getLayoutParams();
            int iL12 = l1(AbstractC0519J.F(view), c0525p, x4);
            c0547p.f = iL12;
            c0547p.f7269e = i12;
            i12 += iL12;
            i5 += i7;
        }
        float f = 0.0f;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            View view2 = this.f4699H[i14];
            if (c0551t.f7296k != null) {
                r8 = 0;
                r8 = 0;
                if (z5) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z5) {
                r8 = 0;
                b(view2, -1, false);
            } else {
                r8 = 0;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f7063b;
            Rect rect = this.f4703L;
            if (recyclerView == null) {
                rect.set(r8, r8, r8, r8);
            } else {
                rect.set(recyclerView.X(view2));
            }
            m1(view2, iJ, r8);
            int iC2 = this.f4710r.c(view2);
            if (iC2 > i13) {
                i13 = iC2;
            }
            float fD = (this.f4710r.d(view2) * 1.0f) / ((C0547p) view2.getLayoutParams()).f;
            if (fD > f) {
                f = fD;
            }
        }
        if (z4) {
            g1(Math.max(Math.round(f * this.f4697F), i9));
            i13 = 0;
            for (int i15 = 0; i15 < i10; i15++) {
                View view3 = this.f4699H[i15];
                m1(view3, 1073741824, true);
                int iC3 = this.f4710r.c(view3);
                if (iC3 > i13) {
                    i13 = iC3;
                }
            }
        }
        for (int i16 = 0; i16 < i10; i16++) {
            View view4 = this.f4699H[i16];
            if (this.f4710r.c(view4) != i13) {
                C0547p c0547p2 = (C0547p) view4.getLayoutParams();
                Rect rect2 = c0547p2.f7076b;
                int i17 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0547p2).topMargin + ((ViewGroup.MarginLayoutParams) c0547p2).bottomMargin;
                int i18 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c0547p2).leftMargin + ((ViewGroup.MarginLayoutParams) c0547p2).rightMargin;
                int iI1 = i1(c0547p2.f7269e, c0547p2.f);
                if (this.f4708p == 1) {
                    iW2 = AbstractC0519J.w(false, iI1, 1073741824, i18, ((ViewGroup.MarginLayoutParams) c0547p2).width);
                    iW = View.MeasureSpec.makeMeasureSpec(i13 - i17, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13 - i18, 1073741824);
                    iW = AbstractC0519J.w(false, iI1, 1073741824, i17, ((ViewGroup.MarginLayoutParams) c0547p2).height);
                    iW2 = iMakeMeasureSpec;
                }
                if (x0(view4, iW2, iW, (C0520K) view4.getLayoutParams())) {
                    view4.measure(iW2, iW);
                }
            }
        }
        c0550s.f7283a = i13;
        if (this.f4708p != 1) {
            if (c0551t.f == -1) {
                int i19 = c0551t.f7288b;
                iC = i19 - i13;
                iD = i19;
            } else {
                int i20 = c0551t.f7288b;
                iD = i20 + i13;
                iC = i20;
            }
            iE = 0;
            iD2 = 0;
        } else if (c0551t.f == -1) {
            iD2 = c0551t.f7288b;
            iE = iD2 - i13;
            iC = 0;
            iD = 0;
        } else {
            int i21 = c0551t.f7288b;
            iE = i21;
            iD = 0;
            iD2 = i21 + i13;
            iC = 0;
        }
        for (int i22 = 0; i22 < i10; i22++) {
            View view5 = this.f4699H[i22];
            C0547p c0547p3 = (C0547p) view5.getLayoutParams();
            if (this.f4708p != 1) {
                iE = E() + this.f4698G[c0547p3.f7269e];
                iD2 = this.f4710r.d(view5) + iE;
            } else if (U0()) {
                int iC4 = C() + this.f4698G[this.f4697F - c0547p3.f7269e];
                iD = iC4;
                iC = iC4 - this.f4710r.d(view5);
            } else {
                iC = C() + this.f4698G[c0547p3.f7269e];
                iD = this.f4710r.d(view5) + iC;
            }
            AbstractC0519J.L(view5, iC, iE, iD, iD2);
            if (c0547p3.f7075a.i() || c0547p3.f7075a.l()) {
                c0550s.f7285c = true;
            }
            c0550s.f7286d = view5.hasFocusable() | c0550s.f7286d;
        }
        Arrays.fill(this.f4699H, (Object) null);
    }

    @Override // j0.AbstractC0519J
    public final void W(int i5, int i6) {
        C0388e c0388e = this.f4702K;
        c0388e.t();
        ((SparseIntArray) c0388e.f).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void W0(C0525P c0525p, X x4, C0549r c0549r, int i5) {
        o1();
        if (x4.b() > 0 && !x4.f7105g) {
            boolean z4 = i5 == 1;
            int iK1 = k1(c0549r.f7279b, c0525p, x4);
            if (z4) {
                while (iK1 > 0) {
                    int i6 = c0549r.f7279b;
                    if (i6 <= 0) {
                        break;
                    }
                    int i7 = i6 - 1;
                    c0549r.f7279b = i7;
                    iK1 = k1(i7, c0525p, x4);
                }
            } else {
                int iB = x4.b() - 1;
                int i8 = c0549r.f7279b;
                while (i8 < iB) {
                    int i9 = i8 + 1;
                    int iK12 = k1(i9, c0525p, x4);
                    if (iK12 <= iK1) {
                        break;
                    }
                    i8 = i9;
                    iK1 = iK12;
                }
                c0549r.f7279b = i8;
            }
        }
        h1();
    }

    @Override // j0.AbstractC0519J
    public final void X() {
        C0388e c0388e = this.f4702K;
        c0388e.t();
        ((SparseIntArray) c0388e.f).clear();
    }

    @Override // j0.AbstractC0519J
    public final void Y(int i5, int i6) {
        C0388e c0388e = this.f4702K;
        c0388e.t();
        ((SparseIntArray) c0388e.f).clear();
    }

    @Override // j0.AbstractC0519J
    public final void Z(int i5, int i6) {
        C0388e c0388e = this.f4702K;
        c0388e.t();
        ((SparseIntArray) c0388e.f).clear();
    }

    @Override // j0.AbstractC0519J
    public final void a0(int i5, int i6) {
        C0388e c0388e = this.f4702K;
        c0388e.t();
        ((SparseIntArray) c0388e.f).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, j0.AbstractC0519J
    public final void b0(C0525P c0525p, X x4) {
        boolean z4 = x4.f7105g;
        SparseIntArray sparseIntArray = this.f4701J;
        SparseIntArray sparseIntArray2 = this.f4700I;
        if (z4) {
            int iV = v();
            for (int i5 = 0; i5 < iV; i5++) {
                C0547p c0547p = (C0547p) u(i5).getLayoutParams();
                int iB = c0547p.f7075a.b();
                sparseIntArray2.put(iB, c0547p.f);
                sparseIntArray.put(iB, c0547p.f7269e);
            }
        }
        super.b0(c0525p, x4);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, j0.AbstractC0519J
    public final void c0(X x4) {
        super.c0(x4);
        this.E = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void c1(boolean z4) {
        if (z4) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.c1(false);
    }

    @Override // j0.AbstractC0519J
    public final boolean f(C0520K c0520k) {
        return c0520k instanceof C0547p;
    }

    public final void g1(int i5) {
        int i6;
        int[] iArr = this.f4698G;
        int i7 = this.f4697F;
        if (iArr == null || iArr.length != i7 + 1 || iArr[iArr.length - 1] != i5) {
            iArr = new int[i7 + 1];
        }
        int i8 = 0;
        iArr[0] = 0;
        int i9 = i5 / i7;
        int i10 = i5 % i7;
        int i11 = 0;
        for (int i12 = 1; i12 <= i7; i12++) {
            i8 += i10;
            if (i8 <= 0 || i7 - i8 >= i10) {
                i6 = i9;
            } else {
                i6 = i9 + 1;
                i8 -= i7;
            }
            i11 += i6;
            iArr[i12] = i11;
        }
        this.f4698G = iArr;
    }

    public final void h1() {
        View[] viewArr = this.f4699H;
        if (viewArr == null || viewArr.length != this.f4697F) {
            this.f4699H = new View[this.f4697F];
        }
    }

    public final int i1(int i5, int i6) {
        if (this.f4708p != 1 || !U0()) {
            int[] iArr = this.f4698G;
            return iArr[i6 + i5] - iArr[i5];
        }
        int[] iArr2 = this.f4698G;
        int i7 = this.f4697F;
        return iArr2[i7 - i5] - iArr2[(i7 - i5) - i6];
    }

    public final int j1(int i5, C0525P c0525p, X x4) {
        boolean z4 = x4.f7105g;
        C0388e c0388e = this.f4702K;
        if (!z4) {
            int i6 = this.f4697F;
            c0388e.getClass();
            return C0388e.s(i5, i6);
        }
        int iB = c0525p.b(i5);
        if (iB != -1) {
            int i7 = this.f4697F;
            c0388e.getClass();
            return C0388e.s(iB, i7);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i5);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, j0.AbstractC0519J
    public final int k(X x4) {
        return E0(x4);
    }

    public final int k1(int i5, C0525P c0525p, X x4) {
        boolean z4 = x4.f7105g;
        C0388e c0388e = this.f4702K;
        if (!z4) {
            int i6 = this.f4697F;
            c0388e.getClass();
            return i5 % i6;
        }
        int i7 = this.f4701J.get(i5, -1);
        if (i7 != -1) {
            return i7;
        }
        int iB = c0525p.b(i5);
        if (iB != -1) {
            int i8 = this.f4697F;
            c0388e.getClass();
            return iB % i8;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i5);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, j0.AbstractC0519J
    public final int l(X x4) {
        return F0(x4);
    }

    public final int l1(int i5, C0525P c0525p, X x4) {
        boolean z4 = x4.f7105g;
        C0388e c0388e = this.f4702K;
        if (!z4) {
            c0388e.getClass();
            return 1;
        }
        int i6 = this.f4700I.get(i5, -1);
        if (i6 != -1) {
            return i6;
        }
        if (c0525p.b(i5) != -1) {
            c0388e.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i5);
        return 1;
    }

    public final void m1(View view, int i5, boolean z4) {
        int iW;
        int iW2;
        C0547p c0547p = (C0547p) view.getLayoutParams();
        Rect rect = c0547p.f7076b;
        int i6 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0547p).topMargin + ((ViewGroup.MarginLayoutParams) c0547p).bottomMargin;
        int i7 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0547p).leftMargin + ((ViewGroup.MarginLayoutParams) c0547p).rightMargin;
        int iI1 = i1(c0547p.f7269e, c0547p.f);
        if (this.f4708p == 1) {
            iW2 = AbstractC0519J.w(false, iI1, i5, i7, ((ViewGroup.MarginLayoutParams) c0547p).width);
            iW = AbstractC0519J.w(true, this.f4710r.l(), this.f7073m, i6, ((ViewGroup.MarginLayoutParams) c0547p).height);
        } else {
            int iW3 = AbstractC0519J.w(false, iI1, i5, i6, ((ViewGroup.MarginLayoutParams) c0547p).height);
            int iW4 = AbstractC0519J.w(true, this.f4710r.l(), this.f7072l, i7, ((ViewGroup.MarginLayoutParams) c0547p).width);
            iW = iW3;
            iW2 = iW4;
        }
        C0520K c0520k = (C0520K) view.getLayoutParams();
        if (z4 ? x0(view, iW2, iW, c0520k) : v0(view, iW2, iW, c0520k)) {
            view.measure(iW2, iW);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, j0.AbstractC0519J
    public final int n(X x4) {
        return E0(x4);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, j0.AbstractC0519J
    public final int n0(int i5, C0525P c0525p, X x4) {
        o1();
        h1();
        return super.n0(i5, c0525p, x4);
    }

    public final void n1(int i5) {
        if (i5 == this.f4697F) {
            return;
        }
        this.E = true;
        if (i5 < 1) {
            throw new IllegalArgumentException(f.l(i5, "Span count should be at least 1. Provided "));
        }
        this.f4697F = i5;
        this.f4702K.t();
        m0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, j0.AbstractC0519J
    public final int o(X x4) {
        return F0(x4);
    }

    public final void o1() {
        int iB;
        int iE;
        if (this.f4708p == 1) {
            iB = this.n - D();
            iE = C();
        } else {
            iB = this.f7074o - B();
            iE = E();
        }
        g1(iB - iE);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, j0.AbstractC0519J
    public final int p0(int i5, C0525P c0525p, X x4) {
        o1();
        h1();
        return super.p0(i5, c0525p, x4);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, j0.AbstractC0519J
    public final C0520K r() {
        return this.f4708p == 0 ? new C0547p(-2, -1) : new C0547p(-1, -2);
    }

    @Override // j0.AbstractC0519J
    public final C0520K s(Context context, AttributeSet attributeSet) {
        C0547p c0547p = new C0547p(context, attributeSet);
        c0547p.f7269e = -1;
        c0547p.f = 0;
        return c0547p;
    }

    @Override // j0.AbstractC0519J
    public final void s0(Rect rect, int i5, int i6) {
        int iG;
        int iG2;
        if (this.f4698G == null) {
            super.s0(rect, i5, i6);
        }
        int iD = D() + C();
        int iB = B() + E();
        if (this.f4708p == 1) {
            int iHeight = rect.height() + iB;
            RecyclerView recyclerView = this.f7063b;
            WeakHashMap weakHashMap = P.f1421a;
            iG2 = AbstractC0519J.g(i6, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.f4698G;
            iG = AbstractC0519J.g(i5, iArr[iArr.length - 1] + iD, this.f7063b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iD;
            RecyclerView recyclerView2 = this.f7063b;
            WeakHashMap weakHashMap2 = P.f1421a;
            iG = AbstractC0519J.g(i5, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f4698G;
            iG2 = AbstractC0519J.g(i6, iArr2[iArr2.length - 1] + iB, this.f7063b.getMinimumHeight());
        }
        this.f7063b.setMeasuredDimension(iG, iG2);
    }

    @Override // j0.AbstractC0519J
    public final C0520K t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0547p c0547p = new C0547p((ViewGroup.MarginLayoutParams) layoutParams);
            c0547p.f7269e = -1;
            c0547p.f = 0;
            return c0547p;
        }
        C0547p c0547p2 = new C0547p(layoutParams);
        c0547p2.f7269e = -1;
        c0547p2.f = 0;
        return c0547p2;
    }

    @Override // j0.AbstractC0519J
    public final int x(C0525P c0525p, X x4) {
        if (this.f4708p == 1) {
            return x4.b() < 1 ? this.f4697F : (j1(x4.b() - 1, c0525p, x4) + 1 != 1 || x4.b() >= this.f4697F) ? this.f4697F : x4.b();
        }
        if (x4.b() < 1) {
            return 0;
        }
        return j1(x4.b() - 1, c0525p, x4) + 1;
    }

    public GridLayoutManager(int i5) {
        super(1);
        this.E = false;
        this.f4697F = -1;
        this.f4700I = new SparseIntArray();
        this.f4701J = new SparseIntArray();
        this.f4702K = new C0388e(8);
        this.f4703L = new Rect();
        n1(i5);
    }
}
