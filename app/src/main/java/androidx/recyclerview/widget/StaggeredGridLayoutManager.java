package androidx.recyclerview.widget;

import A1.h;
import J.P;
import K.g;
import Y0.j;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.f;
import com.google.android.gms.internal.p000firebaseauthapi.b5;
import com.google.firebase.messaging.C0388e;
import j0.AbstractC0519J;
import j0.C0518I;
import j0.C0520K;
import j0.C0525P;
import j0.C0548q;
import j0.C0553v;
import j0.InterfaceC0531W;
import j0.X;
import j0.g0;
import j0.h0;
import j0.j0;
import j0.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC0519J implements InterfaceC0531W {

    /* renamed from: B, reason: collision with root package name */
    public final C0388e f4861B;

    /* renamed from: C, reason: collision with root package name */
    public final int f4862C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f4863D;
    public boolean E;

    /* renamed from: F, reason: collision with root package name */
    public j0 f4864F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f4865G;

    /* renamed from: H, reason: collision with root package name */
    public final g0 f4866H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f4867I;

    /* renamed from: J, reason: collision with root package name */
    public int[] f4868J;

    /* renamed from: K, reason: collision with root package name */
    public final h f4869K;

    /* renamed from: p, reason: collision with root package name */
    public final int f4870p;

    /* renamed from: q, reason: collision with root package name */
    public final k0[] f4871q;

    /* renamed from: r, reason: collision with root package name */
    public final f f4872r;

    /* renamed from: s, reason: collision with root package name */
    public final f f4873s;

    /* renamed from: t, reason: collision with root package name */
    public final int f4874t;

    /* renamed from: u, reason: collision with root package name */
    public int f4875u;

    /* renamed from: v, reason: collision with root package name */
    public final C0548q f4876v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4877w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f4879y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4878x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f4880z = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f4860A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i5, int i6) {
        this.f4870p = -1;
        this.f4877w = false;
        C0388e c0388e = new C0388e(9, false);
        this.f4861B = c0388e;
        this.f4862C = 2;
        this.f4865G = new Rect();
        this.f4866H = new g0(this);
        this.f4867I = true;
        this.f4869K = new h(16, this);
        C0518I c0518iG = AbstractC0519J.G(context, attributeSet, i5, i6);
        int i7 = c0518iG.f7058a;
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i7 != this.f4874t) {
            this.f4874t = i7;
            f fVar = this.f4872r;
            this.f4872r = this.f4873s;
            this.f4873s = fVar;
            m0();
        }
        int i8 = c0518iG.f7059b;
        c(null);
        if (i8 != this.f4870p) {
            c0388e.k();
            m0();
            this.f4870p = i8;
            this.f4879y = new BitSet(this.f4870p);
            this.f4871q = new k0[this.f4870p];
            for (int i9 = 0; i9 < this.f4870p; i9++) {
                this.f4871q[i9] = new k0(this, i9);
            }
            m0();
        }
        boolean z4 = c0518iG.f7060c;
        c(null);
        j0 j0Var = this.f4864F;
        if (j0Var != null && j0Var.f7200k != z4) {
            j0Var.f7200k = z4;
        }
        this.f4877w = z4;
        m0();
        C0548q c0548q = new C0548q();
        c0548q.f7270a = true;
        c0548q.f = 0;
        c0548q.f7275g = 0;
        this.f4876v = c0548q;
        this.f4872r = f.a(this, this.f4874t);
        this.f4873s = f.a(this, 1 - this.f4874t);
    }

    public static int f1(int i5, int i6, int i7) {
        if (i6 == 0 && i7 == 0) {
            return i5;
        }
        int mode = View.MeasureSpec.getMode(i5);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i5) - i6) - i7), mode) : i5;
    }

    @Override // j0.AbstractC0519J
    public final boolean A0() {
        return this.f4864F == null;
    }

    public final int B0(int i5) {
        if (v() == 0) {
            return this.f4878x ? 1 : -1;
        }
        return (i5 < M0()) != this.f4878x ? -1 : 1;
    }

    public final boolean C0() {
        int iM0;
        if (v() != 0 && this.f4862C != 0 && this.f7067g) {
            if (this.f4878x) {
                iM0 = N0();
                M0();
            } else {
                iM0 = M0();
                N0();
            }
            C0388e c0388e = this.f4861B;
            if (iM0 == 0 && R0() != null) {
                c0388e.k();
                this.f = true;
                m0();
                return true;
            }
        }
        return false;
    }

    public final int D0(X x4) {
        if (v() == 0) {
            return 0;
        }
        f fVar = this.f4872r;
        boolean z4 = !this.f4867I;
        return j.j(x4, fVar, I0(z4), H0(z4), this, this.f4867I);
    }

    public final int E0(X x4) {
        if (v() == 0) {
            return 0;
        }
        f fVar = this.f4872r;
        boolean z4 = !this.f4867I;
        return j.k(x4, fVar, I0(z4), H0(z4), this, this.f4867I, this.f4878x);
    }

    public final int F0(X x4) {
        if (v() == 0) {
            return 0;
        }
        f fVar = this.f4872r;
        boolean z4 = !this.f4867I;
        return j.l(x4, fVar, I0(z4), H0(z4), this, this.f4867I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int G0(C0525P c0525p, C0548q c0548q, X x4) {
        k0 k0Var;
        ?? r6;
        int i5;
        int iH;
        int iC;
        int iK;
        int iC2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        int i11 = 1;
        this.f4879y.set(0, this.f4870p, true);
        C0548q c0548q2 = this.f4876v;
        int i12 = c0548q2.f7277i ? c0548q.f7274e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0548q.f7274e == 1 ? c0548q.f7275g + c0548q.f7271b : c0548q.f - c0548q.f7271b;
        int i13 = c0548q.f7274e;
        for (int i14 = 0; i14 < this.f4870p; i14++) {
            if (!this.f4871q[i14].f7216a.isEmpty()) {
                e1(this.f4871q[i14], i13, i12);
            }
        }
        int iG = this.f4878x ? this.f4872r.g() : this.f4872r.k();
        boolean z4 = false;
        while (true) {
            int i15 = c0548q.f7272c;
            if (((i15 < 0 || i15 >= x4.b()) ? i10 : i11) == 0 || (!c0548q2.f7277i && this.f4879y.isEmpty())) {
                break;
            }
            View view = c0525p.k(c0548q.f7272c, Long.MAX_VALUE).f7128a;
            c0548q.f7272c += c0548q.f7273d;
            h0 h0Var = (h0) view.getLayoutParams();
            int iB = h0Var.f7075a.b();
            C0388e c0388e = this.f4861B;
            int[] iArr = (int[]) c0388e.f6142e;
            int i16 = (iArr == null || iB >= iArr.length) ? -1 : iArr[iB];
            if (i16 == -1) {
                if (V0(c0548q.f7274e)) {
                    i9 = this.f4870p - i11;
                    i8 = -1;
                    i7 = -1;
                } else {
                    i7 = i11;
                    i8 = this.f4870p;
                    i9 = i10;
                }
                k0 k0Var2 = null;
                if (c0548q.f7274e == i11) {
                    int iK2 = this.f4872r.k();
                    int i17 = Integer.MAX_VALUE;
                    while (i9 != i8) {
                        k0 k0Var3 = this.f4871q[i9];
                        int iF = k0Var3.f(iK2);
                        if (iF < i17) {
                            i17 = iF;
                            k0Var2 = k0Var3;
                        }
                        i9 += i7;
                    }
                } else {
                    int iG2 = this.f4872r.g();
                    int i18 = Integer.MIN_VALUE;
                    while (i9 != i8) {
                        k0 k0Var4 = this.f4871q[i9];
                        int iH2 = k0Var4.h(iG2);
                        if (iH2 > i18) {
                            k0Var2 = k0Var4;
                            i18 = iH2;
                        }
                        i9 += i7;
                    }
                }
                k0Var = k0Var2;
                c0388e.m(iB);
                ((int[]) c0388e.f6142e)[iB] = k0Var.f7220e;
            } else {
                k0Var = this.f4871q[i16];
            }
            h0Var.f7180e = k0Var;
            if (c0548q.f7274e == 1) {
                r6 = 0;
                b(view, -1, false);
            } else {
                r6 = 0;
                b(view, 0, false);
            }
            if (this.f4874t == 1) {
                i5 = 1;
                T0(view, AbstractC0519J.w(r6, this.f4875u, this.f7072l, r6, ((ViewGroup.MarginLayoutParams) h0Var).width), AbstractC0519J.w(true, this.f7074o, this.f7073m, B() + E(), ((ViewGroup.MarginLayoutParams) h0Var).height));
            } else {
                i5 = 1;
                T0(view, AbstractC0519J.w(true, this.n, this.f7072l, D() + C(), ((ViewGroup.MarginLayoutParams) h0Var).width), AbstractC0519J.w(false, this.f4875u, this.f7073m, 0, ((ViewGroup.MarginLayoutParams) h0Var).height));
            }
            if (c0548q.f7274e == i5) {
                iC = k0Var.f(iG);
                iH = this.f4872r.c(view) + iC;
            } else {
                iH = k0Var.h(iG);
                iC = iH - this.f4872r.c(view);
            }
            if (c0548q.f7274e == 1) {
                k0 k0Var5 = h0Var.f7180e;
                k0Var5.getClass();
                h0 h0Var2 = (h0) view.getLayoutParams();
                h0Var2.f7180e = k0Var5;
                ArrayList arrayList = k0Var5.f7216a;
                arrayList.add(view);
                k0Var5.f7218c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    k0Var5.f7217b = Integer.MIN_VALUE;
                }
                if (h0Var2.f7075a.i() || h0Var2.f7075a.l()) {
                    k0Var5.f7219d = k0Var5.f.f4872r.c(view) + k0Var5.f7219d;
                }
            } else {
                k0 k0Var6 = h0Var.f7180e;
                k0Var6.getClass();
                h0 h0Var3 = (h0) view.getLayoutParams();
                h0Var3.f7180e = k0Var6;
                ArrayList arrayList2 = k0Var6.f7216a;
                arrayList2.add(0, view);
                k0Var6.f7217b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    k0Var6.f7218c = Integer.MIN_VALUE;
                }
                if (h0Var3.f7075a.i() || h0Var3.f7075a.l()) {
                    k0Var6.f7219d = k0Var6.f.f4872r.c(view) + k0Var6.f7219d;
                }
            }
            if (S0() && this.f4874t == 1) {
                iC2 = this.f4873s.g() - (((this.f4870p - 1) - k0Var.f7220e) * this.f4875u);
                iK = iC2 - this.f4873s.c(view);
            } else {
                iK = this.f4873s.k() + (k0Var.f7220e * this.f4875u);
                iC2 = this.f4873s.c(view) + iK;
            }
            if (this.f4874t == 1) {
                AbstractC0519J.L(view, iK, iC, iC2, iH);
            } else {
                AbstractC0519J.L(view, iC, iK, iH, iC2);
            }
            e1(k0Var, c0548q2.f7274e, i12);
            X0(c0525p, c0548q2);
            if (c0548q2.f7276h && view.hasFocusable()) {
                i6 = 0;
                this.f4879y.set(k0Var.f7220e, false);
            } else {
                i6 = 0;
            }
            i10 = i6;
            i11 = 1;
            z4 = true;
        }
        int i19 = i10;
        if (!z4) {
            X0(c0525p, c0548q2);
        }
        int iK3 = c0548q2.f7274e == -1 ? this.f4872r.k() - P0(this.f4872r.k()) : O0(this.f4872r.g()) - this.f4872r.g();
        return iK3 > 0 ? Math.min(c0548q.f7271b, iK3) : i19;
    }

    @Override // j0.AbstractC0519J
    public final int H(C0525P c0525p, X x4) {
        return this.f4874t == 0 ? this.f4870p : super.H(c0525p, x4);
    }

    public final View H0(boolean z4) {
        int iK = this.f4872r.k();
        int iG = this.f4872r.g();
        View view = null;
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            int iE = this.f4872r.e(viewU);
            int iB = this.f4872r.b(viewU);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z4) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final View I0(boolean z4) {
        int iK = this.f4872r.k();
        int iG = this.f4872r.g();
        int iV = v();
        View view = null;
        for (int i5 = 0; i5 < iV; i5++) {
            View viewU = u(i5);
            int iE = this.f4872r.e(viewU);
            if (this.f4872r.b(viewU) > iK && iE < iG) {
                if (iE >= iK || !z4) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    @Override // j0.AbstractC0519J
    public final boolean J() {
        return this.f4862C != 0;
    }

    public final int[] J0() {
        int[] iArr = new int[this.f4870p];
        for (int i5 = 0; i5 < this.f4870p; i5++) {
            k0 k0Var = this.f4871q[i5];
            boolean z4 = k0Var.f.f4877w;
            ArrayList arrayList = k0Var.f7216a;
            iArr[i5] = z4 ? k0Var.e(arrayList.size() - 1, -1, true, false) : k0Var.e(0, arrayList.size(), true, false);
        }
        return iArr;
    }

    public final void K0(C0525P c0525p, X x4, boolean z4) {
        int iG;
        int iO0 = O0(Integer.MIN_VALUE);
        if (iO0 != Integer.MIN_VALUE && (iG = this.f4872r.g() - iO0) > 0) {
            int i5 = iG - (-b1(-iG, c0525p, x4));
            if (!z4 || i5 <= 0) {
                return;
            }
            this.f4872r.p(i5);
        }
    }

    public final void L0(C0525P c0525p, X x4, boolean z4) {
        int iK;
        int iP0 = P0(Integer.MAX_VALUE);
        if (iP0 != Integer.MAX_VALUE && (iK = iP0 - this.f4872r.k()) > 0) {
            int iB1 = iK - b1(iK, c0525p, x4);
            if (!z4 || iB1 <= 0) {
                return;
            }
            this.f4872r.p(-iB1);
        }
    }

    @Override // j0.AbstractC0519J
    public final void M(int i5) {
        super.M(i5);
        for (int i6 = 0; i6 < this.f4870p; i6++) {
            k0 k0Var = this.f4871q[i6];
            int i7 = k0Var.f7217b;
            if (i7 != Integer.MIN_VALUE) {
                k0Var.f7217b = i7 + i5;
            }
            int i8 = k0Var.f7218c;
            if (i8 != Integer.MIN_VALUE) {
                k0Var.f7218c = i8 + i5;
            }
        }
    }

    public final int M0() {
        if (v() == 0) {
            return 0;
        }
        return AbstractC0519J.F(u(0));
    }

    @Override // j0.AbstractC0519J
    public final void N(int i5) {
        super.N(i5);
        for (int i6 = 0; i6 < this.f4870p; i6++) {
            k0 k0Var = this.f4871q[i6];
            int i7 = k0Var.f7217b;
            if (i7 != Integer.MIN_VALUE) {
                k0Var.f7217b = i7 + i5;
            }
            int i8 = k0Var.f7218c;
            if (i8 != Integer.MIN_VALUE) {
                k0Var.f7218c = i8 + i5;
            }
        }
    }

    public final int N0() {
        int iV = v();
        if (iV == 0) {
            return 0;
        }
        return AbstractC0519J.F(u(iV - 1));
    }

    @Override // j0.AbstractC0519J
    public final void O() {
        this.f4861B.k();
        for (int i5 = 0; i5 < this.f4870p; i5++) {
            this.f4871q[i5].b();
        }
    }

    public final int O0(int i5) {
        int iF = this.f4871q[0].f(i5);
        for (int i6 = 1; i6 < this.f4870p; i6++) {
            int iF2 = this.f4871q[i6].f(i5);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    public final int P0(int i5) {
        int iH = this.f4871q[0].h(i5);
        for (int i6 = 1; i6 < this.f4870p; i6++) {
            int iH2 = this.f4871q[i6].h(i5);
            if (iH2 < iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    @Override // j0.AbstractC0519J
    public final void Q(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f7063b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f4869K);
        }
        for (int i5 = 0; i5 < this.f4870p; i5++) {
            this.f4871q[i5].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q0(int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Q0(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0063  */
    @Override // j0.AbstractC0519J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View R(android.view.View r9, int r10, j0.C0525P r11, j0.X r12) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.R(android.view.View, int, j0.P, j0.X):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View R0() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.R0():android.view.View");
    }

    @Override // j0.AbstractC0519J
    public final void S(AccessibilityEvent accessibilityEvent) {
        super.S(accessibilityEvent);
        if (v() > 0) {
            View viewI0 = I0(false);
            View viewH0 = H0(false);
            if (viewI0 == null || viewH0 == null) {
                return;
            }
            int iF = AbstractC0519J.F(viewI0);
            int iF2 = AbstractC0519J.F(viewH0);
            if (iF < iF2) {
                accessibilityEvent.setFromIndex(iF);
                accessibilityEvent.setToIndex(iF2);
            } else {
                accessibilityEvent.setFromIndex(iF2);
                accessibilityEvent.setToIndex(iF);
            }
        }
    }

    public final boolean S0() {
        return A() == 1;
    }

    public final void T0(View view, int i5, int i6) {
        RecyclerView recyclerView = this.f7063b;
        Rect rect = this.f4865G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.X(view));
        }
        h0 h0Var = (h0) view.getLayoutParams();
        int iF1 = f1(i5, ((ViewGroup.MarginLayoutParams) h0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) h0Var).rightMargin + rect.right);
        int iF12 = f1(i6, ((ViewGroup.MarginLayoutParams) h0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) h0Var).bottomMargin + rect.bottom);
        if (v0(view, iF1, iF12, h0Var)) {
            view.measure(iF1, iF12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x043a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U0(j0.C0525P r17, j0.X r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1109
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.U0(j0.P, j0.X, boolean):void");
    }

    @Override // j0.AbstractC0519J
    public final void V(C0525P c0525p, X x4, View view, K.h hVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof h0)) {
            U(view, hVar);
            return;
        }
        h0 h0Var = (h0) layoutParams;
        if (this.f4874t == 0) {
            k0 k0Var = h0Var.f7180e;
            hVar.h(g.a(false, k0Var == null ? -1 : k0Var.f7220e, 1, -1, -1));
        } else {
            k0 k0Var2 = h0Var.f7180e;
            hVar.h(g.a(false, -1, -1, k0Var2 == null ? -1 : k0Var2.f7220e, 1));
        }
    }

    public final boolean V0(int i5) {
        if (this.f4874t == 0) {
            return (i5 == -1) != this.f4878x;
        }
        return ((i5 == -1) == this.f4878x) == S0();
    }

    @Override // j0.AbstractC0519J
    public final void W(int i5, int i6) {
        Q0(i5, i6, 1);
    }

    public final void W0(int i5, X x4) {
        int iM0;
        int i6;
        if (i5 > 0) {
            iM0 = N0();
            i6 = 1;
        } else {
            iM0 = M0();
            i6 = -1;
        }
        C0548q c0548q = this.f4876v;
        c0548q.f7270a = true;
        d1(iM0, x4);
        c1(i6);
        c0548q.f7272c = iM0 + c0548q.f7273d;
        c0548q.f7271b = Math.abs(i5);
    }

    @Override // j0.AbstractC0519J
    public final void X() {
        this.f4861B.k();
        m0();
    }

    public final void X0(C0525P c0525p, C0548q c0548q) {
        if (!c0548q.f7270a || c0548q.f7277i) {
            return;
        }
        if (c0548q.f7271b == 0) {
            if (c0548q.f7274e == -1) {
                Y0(c0525p, c0548q.f7275g);
                return;
            } else {
                Z0(c0525p, c0548q.f);
                return;
            }
        }
        int i5 = 1;
        if (c0548q.f7274e == -1) {
            int i6 = c0548q.f;
            int iH = this.f4871q[0].h(i6);
            while (i5 < this.f4870p) {
                int iH2 = this.f4871q[i5].h(i6);
                if (iH2 > iH) {
                    iH = iH2;
                }
                i5++;
            }
            int i7 = i6 - iH;
            Y0(c0525p, i7 < 0 ? c0548q.f7275g : c0548q.f7275g - Math.min(i7, c0548q.f7271b));
            return;
        }
        int i8 = c0548q.f7275g;
        int iF = this.f4871q[0].f(i8);
        while (i5 < this.f4870p) {
            int iF2 = this.f4871q[i5].f(i8);
            if (iF2 < iF) {
                iF = iF2;
            }
            i5++;
        }
        int i9 = iF - c0548q.f7275g;
        Z0(c0525p, i9 < 0 ? c0548q.f : Math.min(i9, c0548q.f7271b) + c0548q.f);
    }

    @Override // j0.AbstractC0519J
    public final void Y(int i5, int i6) {
        Q0(i5, i6, 8);
    }

    public final void Y0(C0525P c0525p, int i5) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            if (this.f4872r.e(viewU) < i5 || this.f4872r.o(viewU) < i5) {
                return;
            }
            h0 h0Var = (h0) viewU.getLayoutParams();
            h0Var.getClass();
            if (h0Var.f7180e.f7216a.size() == 1) {
                return;
            }
            k0 k0Var = h0Var.f7180e;
            ArrayList arrayList = k0Var.f7216a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            h0 h0Var2 = (h0) view.getLayoutParams();
            h0Var2.f7180e = null;
            if (h0Var2.f7075a.i() || h0Var2.f7075a.l()) {
                k0Var.f7219d -= k0Var.f.f4872r.c(view);
            }
            if (size == 1) {
                k0Var.f7217b = Integer.MIN_VALUE;
            }
            k0Var.f7218c = Integer.MIN_VALUE;
            j0(viewU, c0525p);
        }
    }

    @Override // j0.AbstractC0519J
    public final void Z(int i5, int i6) {
        Q0(i5, i6, 2);
    }

    public final void Z0(C0525P c0525p, int i5) {
        while (v() > 0) {
            View viewU = u(0);
            if (this.f4872r.b(viewU) > i5 || this.f4872r.n(viewU) > i5) {
                return;
            }
            h0 h0Var = (h0) viewU.getLayoutParams();
            h0Var.getClass();
            if (h0Var.f7180e.f7216a.size() == 1) {
                return;
            }
            k0 k0Var = h0Var.f7180e;
            ArrayList arrayList = k0Var.f7216a;
            View view = (View) arrayList.remove(0);
            h0 h0Var2 = (h0) view.getLayoutParams();
            h0Var2.f7180e = null;
            if (arrayList.size() == 0) {
                k0Var.f7218c = Integer.MIN_VALUE;
            }
            if (h0Var2.f7075a.i() || h0Var2.f7075a.l()) {
                k0Var.f7219d -= k0Var.f.f4872r.c(view);
            }
            k0Var.f7217b = Integer.MIN_VALUE;
            j0(viewU, c0525p);
        }
    }

    @Override // j0.InterfaceC0531W
    public final PointF a(int i5) {
        int iB0 = B0(i5);
        PointF pointF = new PointF();
        if (iB0 == 0) {
            return null;
        }
        if (this.f4874t == 0) {
            pointF.x = iB0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iB0;
        }
        return pointF;
    }

    @Override // j0.AbstractC0519J
    public final void a0(int i5, int i6) {
        Q0(i5, i6, 4);
    }

    public final void a1() {
        if (this.f4874t == 1 || !S0()) {
            this.f4878x = this.f4877w;
        } else {
            this.f4878x = !this.f4877w;
        }
    }

    @Override // j0.AbstractC0519J
    public final void b0(C0525P c0525p, X x4) {
        U0(c0525p, x4, true);
    }

    public final int b1(int i5, C0525P c0525p, X x4) {
        if (v() == 0 || i5 == 0) {
            return 0;
        }
        W0(i5, x4);
        C0548q c0548q = this.f4876v;
        int iG0 = G0(c0525p, c0548q, x4);
        if (c0548q.f7271b >= iG0) {
            i5 = i5 < 0 ? -iG0 : iG0;
        }
        this.f4872r.p(-i5);
        this.f4863D = this.f4878x;
        c0548q.f7271b = 0;
        X0(c0525p, c0548q);
        return i5;
    }

    @Override // j0.AbstractC0519J
    public final void c(String str) {
        if (this.f4864F == null) {
            super.c(str);
        }
    }

    @Override // j0.AbstractC0519J
    public final void c0(X x4) {
        this.f4880z = -1;
        this.f4860A = Integer.MIN_VALUE;
        this.f4864F = null;
        this.f4866H.a();
    }

    public final void c1(int i5) {
        C0548q c0548q = this.f4876v;
        c0548q.f7274e = i5;
        c0548q.f7273d = this.f4878x != (i5 == -1) ? -1 : 1;
    }

    @Override // j0.AbstractC0519J
    public final boolean d() {
        return this.f4874t == 0;
    }

    @Override // j0.AbstractC0519J
    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof j0) {
            j0 j0Var = (j0) parcelable;
            this.f4864F = j0Var;
            if (this.f4880z != -1) {
                j0Var.f7196g = null;
                j0Var.f = 0;
                j0Var.f7194d = -1;
                j0Var.f7195e = -1;
                j0Var.f7196g = null;
                j0Var.f = 0;
                j0Var.f7197h = 0;
                j0Var.f7198i = null;
                j0Var.f7199j = null;
            }
            m0();
        }
    }

    public final void d1(int i5, X x4) {
        int iL;
        int iL2;
        int i6;
        C0548q c0548q = this.f4876v;
        boolean z4 = false;
        c0548q.f7271b = 0;
        c0548q.f7272c = i5;
        C0553v c0553v = this.f7066e;
        if (!(c0553v != null && c0553v.f7304e) || (i6 = x4.f7100a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            if (this.f4878x == (i6 < i5)) {
                iL = this.f4872r.l();
                iL2 = 0;
            } else {
                iL2 = this.f4872r.l();
                iL = 0;
            }
        }
        RecyclerView recyclerView = this.f7063b;
        if (recyclerView == null || !recyclerView.f4822k) {
            c0548q.f7275g = this.f4872r.f() + iL;
            c0548q.f = -iL2;
        } else {
            c0548q.f = this.f4872r.k() - iL2;
            c0548q.f7275g = this.f4872r.g() + iL;
        }
        c0548q.f7276h = false;
        c0548q.f7270a = true;
        if (this.f4872r.i() == 0 && this.f4872r.f() == 0) {
            z4 = true;
        }
        c0548q.f7277i = z4;
    }

    @Override // j0.AbstractC0519J
    public final boolean e() {
        return this.f4874t == 1;
    }

    @Override // j0.AbstractC0519J
    public final Parcelable e0() {
        int iH;
        int iK;
        int[] iArr;
        j0 j0Var = this.f4864F;
        if (j0Var != null) {
            j0 j0Var2 = new j0();
            j0Var2.f = j0Var.f;
            j0Var2.f7194d = j0Var.f7194d;
            j0Var2.f7195e = j0Var.f7195e;
            j0Var2.f7196g = j0Var.f7196g;
            j0Var2.f7197h = j0Var.f7197h;
            j0Var2.f7198i = j0Var.f7198i;
            j0Var2.f7200k = j0Var.f7200k;
            j0Var2.f7201l = j0Var.f7201l;
            j0Var2.f7202m = j0Var.f7202m;
            j0Var2.f7199j = j0Var.f7199j;
            return j0Var2;
        }
        j0 j0Var3 = new j0();
        j0Var3.f7200k = this.f4877w;
        j0Var3.f7201l = this.f4863D;
        j0Var3.f7202m = this.E;
        C0388e c0388e = this.f4861B;
        if (c0388e == null || (iArr = (int[]) c0388e.f6142e) == null) {
            j0Var3.f7197h = 0;
        } else {
            j0Var3.f7198i = iArr;
            j0Var3.f7197h = iArr.length;
            j0Var3.f7199j = (ArrayList) c0388e.f;
        }
        if (v() > 0) {
            j0Var3.f7194d = this.f4863D ? N0() : M0();
            View viewH0 = this.f4878x ? H0(true) : I0(true);
            j0Var3.f7195e = viewH0 != null ? AbstractC0519J.F(viewH0) : -1;
            int i5 = this.f4870p;
            j0Var3.f = i5;
            j0Var3.f7196g = new int[i5];
            for (int i6 = 0; i6 < this.f4870p; i6++) {
                if (this.f4863D) {
                    iH = this.f4871q[i6].f(Integer.MIN_VALUE);
                    if (iH != Integer.MIN_VALUE) {
                        iK = this.f4872r.g();
                        iH -= iK;
                    }
                } else {
                    iH = this.f4871q[i6].h(Integer.MIN_VALUE);
                    if (iH != Integer.MIN_VALUE) {
                        iK = this.f4872r.k();
                        iH -= iK;
                    }
                }
                j0Var3.f7196g[i6] = iH;
            }
        } else {
            j0Var3.f7194d = -1;
            j0Var3.f7195e = -1;
            j0Var3.f = 0;
        }
        return j0Var3;
    }

    public final void e1(k0 k0Var, int i5, int i6) {
        int i7 = k0Var.f7219d;
        int i8 = k0Var.f7220e;
        if (i5 != -1) {
            int i9 = k0Var.f7218c;
            if (i9 == Integer.MIN_VALUE) {
                k0Var.a();
                i9 = k0Var.f7218c;
            }
            if (i9 - i7 >= i6) {
                this.f4879y.set(i8, false);
                return;
            }
            return;
        }
        int i10 = k0Var.f7217b;
        if (i10 == Integer.MIN_VALUE) {
            View view = (View) k0Var.f7216a.get(0);
            h0 h0Var = (h0) view.getLayoutParams();
            k0Var.f7217b = k0Var.f.f4872r.e(view);
            h0Var.getClass();
            i10 = k0Var.f7217b;
        }
        if (i10 + i7 <= i6) {
            this.f4879y.set(i8, false);
        }
    }

    @Override // j0.AbstractC0519J
    public final boolean f(C0520K c0520k) {
        return c0520k instanceof h0;
    }

    @Override // j0.AbstractC0519J
    public final void f0(int i5) {
        if (i5 == 0) {
            C0();
        }
    }

    @Override // j0.AbstractC0519J
    public final void h(int i5, int i6, X x4, b5 b5Var) {
        C0548q c0548q;
        int iF;
        int iH;
        if (this.f4874t != 0) {
            i5 = i6;
        }
        if (v() == 0 || i5 == 0) {
            return;
        }
        W0(i5, x4);
        int[] iArr = this.f4868J;
        if (iArr == null || iArr.length < this.f4870p) {
            this.f4868J = new int[this.f4870p];
        }
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = this.f4870p;
            c0548q = this.f4876v;
            if (i7 >= i9) {
                break;
            }
            if (c0548q.f7273d == -1) {
                iF = c0548q.f;
                iH = this.f4871q[i7].h(iF);
            } else {
                iF = this.f4871q[i7].f(c0548q.f7275g);
                iH = c0548q.f7275g;
            }
            int i10 = iF - iH;
            if (i10 >= 0) {
                this.f4868J[i8] = i10;
                i8++;
            }
            i7++;
        }
        Arrays.sort(this.f4868J, 0, i8);
        for (int i11 = 0; i11 < i8; i11++) {
            int i12 = c0548q.f7272c;
            if (i12 < 0 || i12 >= x4.b()) {
                return;
            }
            b5Var.a(c0548q.f7272c, this.f4868J[i11]);
            c0548q.f7272c += c0548q.f7273d;
        }
    }

    @Override // j0.AbstractC0519J
    public final int j(X x4) {
        return D0(x4);
    }

    @Override // j0.AbstractC0519J
    public final int k(X x4) {
        return E0(x4);
    }

    @Override // j0.AbstractC0519J
    public final int l(X x4) {
        return F0(x4);
    }

    @Override // j0.AbstractC0519J
    public final int m(X x4) {
        return D0(x4);
    }

    @Override // j0.AbstractC0519J
    public final int n(X x4) {
        return E0(x4);
    }

    @Override // j0.AbstractC0519J
    public final int n0(int i5, C0525P c0525p, X x4) {
        return b1(i5, c0525p, x4);
    }

    @Override // j0.AbstractC0519J
    public final int o(X x4) {
        return F0(x4);
    }

    @Override // j0.AbstractC0519J
    public final void o0(int i5) {
        j0 j0Var = this.f4864F;
        if (j0Var != null && j0Var.f7194d != i5) {
            j0Var.f7196g = null;
            j0Var.f = 0;
            j0Var.f7194d = -1;
            j0Var.f7195e = -1;
        }
        this.f4880z = i5;
        this.f4860A = Integer.MIN_VALUE;
        m0();
    }

    @Override // j0.AbstractC0519J
    public final int p0(int i5, C0525P c0525p, X x4) {
        return b1(i5, c0525p, x4);
    }

    @Override // j0.AbstractC0519J
    public final C0520K r() {
        return this.f4874t == 0 ? new h0(-2, -1) : new h0(-1, -2);
    }

    @Override // j0.AbstractC0519J
    public final C0520K s(Context context, AttributeSet attributeSet) {
        return new h0(context, attributeSet);
    }

    @Override // j0.AbstractC0519J
    public final void s0(Rect rect, int i5, int i6) {
        int iG;
        int iG2;
        int i7 = this.f4870p;
        int iD = D() + C();
        int iB = B() + E();
        if (this.f4874t == 1) {
            int iHeight = rect.height() + iB;
            RecyclerView recyclerView = this.f7063b;
            WeakHashMap weakHashMap = P.f1421a;
            iG2 = AbstractC0519J.g(i6, iHeight, recyclerView.getMinimumHeight());
            iG = AbstractC0519J.g(i5, (this.f4875u * i7) + iD, this.f7063b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iD;
            RecyclerView recyclerView2 = this.f7063b;
            WeakHashMap weakHashMap2 = P.f1421a;
            iG = AbstractC0519J.g(i5, iWidth, recyclerView2.getMinimumWidth());
            iG2 = AbstractC0519J.g(i6, (this.f4875u * i7) + iB, this.f7063b.getMinimumHeight());
        }
        this.f7063b.setMeasuredDimension(iG, iG2);
    }

    @Override // j0.AbstractC0519J
    public final C0520K t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new h0((ViewGroup.MarginLayoutParams) layoutParams) : new h0(layoutParams);
    }

    @Override // j0.AbstractC0519J
    public final int x(C0525P c0525p, X x4) {
        return this.f4874t == 1 ? this.f4870p : super.x(c0525p, x4);
    }

    @Override // j0.AbstractC0519J
    public final void y0(RecyclerView recyclerView, int i5) {
        if (recyclerView != null) {
            C0553v c0553v = new C0553v(recyclerView.getContext());
            c0553v.f7300a = i5;
            z0(c0553v);
        }
    }
}
