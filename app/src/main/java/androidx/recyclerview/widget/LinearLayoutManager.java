package androidx.recyclerview.widget;

import Y0.j;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.PathInterpolator;
import androidx.emoji2.text.f;
import com.google.android.gms.internal.p000firebaseauthapi.b5;
import com.samsung.android.knox.ex.peripheral.PeripheralConstants;
import j0.AbstractC0519J;
import j0.C0518I;
import j0.C0520K;
import j0.C0525P;
import j0.C0549r;
import j0.C0550s;
import j0.C0551t;
import j0.C0552u;
import j0.C0553v;
import j0.InterfaceC0531W;
import j0.X;

/* loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC0519J implements InterfaceC0531W {

    /* renamed from: A, reason: collision with root package name */
    public final C0549r f4704A;

    /* renamed from: B, reason: collision with root package name */
    public final C0550s f4705B;

    /* renamed from: C, reason: collision with root package name */
    public final int f4706C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f4707D;

    /* renamed from: q, reason: collision with root package name */
    public C0551t f4709q;

    /* renamed from: r, reason: collision with root package name */
    public f f4710r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4711s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f4712t;

    /* renamed from: z, reason: collision with root package name */
    public C0552u f4718z;

    /* renamed from: p, reason: collision with root package name */
    public int f4708p = 1;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4713u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4714v = false;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f4715w = true;

    /* renamed from: x, reason: collision with root package name */
    public int f4716x = -1;

    /* renamed from: y, reason: collision with root package name */
    public int f4717y = Integer.MIN_VALUE;

    public LinearLayoutManager(int i5) {
        this.f4712t = false;
        new PathInterpolator(0.22f, 0.5f, 0.0f, 1.0f);
        this.f4718z = null;
        this.f4704A = new C0549r();
        this.f4705B = new C0550s();
        this.f4706C = 2;
        this.f4707D = new int[2];
        b1(i5);
        c(null);
        if (this.f4712t) {
            this.f4712t = false;
            m0();
        }
    }

    @Override // j0.AbstractC0519J
    public boolean A0() {
        return this.f4718z == null && this.f4711s == this.f4714v;
    }

    public void B0(X x4, int[] iArr) {
        int i5;
        int iL = x4.f7100a != -1 ? this.f4710r.l() : 0;
        if (this.f4709q.f == -1) {
            i5 = 0;
        } else {
            i5 = iL;
            iL = 0;
        }
        iArr[0] = iL;
        iArr[1] = i5;
    }

    public void C0(X x4, C0551t c0551t, b5 b5Var) {
        int i5 = c0551t.f7290d;
        if (i5 < 0 || i5 >= x4.b()) {
            return;
        }
        b5Var.a(i5, Math.max(0, c0551t.f7292g));
    }

    public final int D0(X x4) {
        if (v() == 0) {
            return 0;
        }
        H0();
        f fVar = this.f4710r;
        boolean z4 = !this.f4715w;
        return j.j(x4, fVar, K0(z4), J0(z4), this, this.f4715w);
    }

    public final int E0(X x4) {
        if (v() == 0) {
            return 0;
        }
        H0();
        f fVar = this.f4710r;
        boolean z4 = !this.f4715w;
        return j.k(x4, fVar, K0(z4), J0(z4), this, this.f4715w, this.f4713u);
    }

    public final int F0(X x4) {
        if (v() == 0) {
            return 0;
        }
        H0();
        f fVar = this.f4710r;
        boolean z4 = !this.f4715w;
        return j.l(x4, fVar, K0(z4), J0(z4), this, this.f4715w);
    }

    public final int G0(int i5) {
        return i5 != 1 ? i5 != 2 ? i5 != 17 ? i5 != 33 ? i5 != 66 ? (i5 == 130 && this.f4708p == 1) ? 1 : Integer.MIN_VALUE : this.f4708p == 0 ? 1 : Integer.MIN_VALUE : this.f4708p == 1 ? -1 : Integer.MIN_VALUE : this.f4708p == 0 ? -1 : Integer.MIN_VALUE : (this.f4708p != 1 && U0()) ? -1 : 1 : (this.f4708p != 1 && U0()) ? 1 : -1;
    }

    public final void H0() {
        if (this.f4709q == null) {
            C0551t c0551t = new C0551t();
            c0551t.f7287a = true;
            c0551t.f7293h = 0;
            c0551t.f7294i = 0;
            c0551t.f7296k = null;
            this.f4709q = c0551t;
        }
    }

    public final int I0(C0525P c0525p, C0551t c0551t, X x4, boolean z4) {
        int i5;
        int i6 = c0551t.f7289c;
        int i7 = c0551t.f7292g;
        if (i7 != Integer.MIN_VALUE) {
            if (i6 < 0) {
                c0551t.f7292g = i7 + i6;
            }
            X0(c0525p, c0551t);
        }
        int i8 = c0551t.f7289c + c0551t.f7293h;
        while (true) {
            if ((!c0551t.f7297l && i8 <= 0) || (i5 = c0551t.f7290d) < 0 || i5 >= x4.b()) {
                break;
            }
            C0550s c0550s = this.f4705B;
            c0550s.f7283a = 0;
            c0550s.f7284b = false;
            c0550s.f7285c = false;
            c0550s.f7286d = false;
            V0(c0525p, x4, c0551t, c0550s);
            if (!c0550s.f7284b) {
                int i9 = c0551t.f7288b;
                int i10 = c0550s.f7283a;
                c0551t.f7288b = (c0551t.f * i10) + i9;
                if (!c0550s.f7285c || c0551t.f7296k != null || !x4.f7105g) {
                    c0551t.f7289c -= i10;
                    i8 -= i10;
                }
                int i11 = c0551t.f7292g;
                if (i11 != Integer.MIN_VALUE) {
                    int i12 = i11 + i10;
                    c0551t.f7292g = i12;
                    int i13 = c0551t.f7289c;
                    if (i13 < 0) {
                        c0551t.f7292g = i12 + i13;
                    }
                    X0(c0525p, c0551t);
                }
                if (z4 && c0550s.f7286d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i6 - c0551t.f7289c;
    }

    @Override // j0.AbstractC0519J
    public final boolean J() {
        return true;
    }

    public final View J0(boolean z4) {
        return this.f4713u ? O0(0, z4, v()) : O0(v() - 1, z4, -1);
    }

    public final View K0(boolean z4) {
        return this.f4713u ? O0(v() - 1, z4, -1) : O0(0, z4, v());
    }

    public final int L0() {
        View viewO0 = O0(0, false, v());
        if (viewO0 == null) {
            return -1;
        }
        return AbstractC0519J.F(viewO0);
    }

    public final int M0() {
        View viewO0 = O0(v() - 1, false, -1);
        if (viewO0 == null) {
            return -1;
        }
        return AbstractC0519J.F(viewO0);
    }

    public final View N0(int i5, int i6) {
        int i7;
        int i8;
        H0();
        if (i6 <= i5 && i6 >= i5) {
            return u(i5);
        }
        if (this.f4710r.e(u(i5)) < this.f4710r.k()) {
            i7 = 16644;
            i8 = 16388;
        } else {
            i7 = 4161;
            i8 = PeripheralConstants.ErrorCode.ERROR_PERIPHERAL_NOT_FOUND;
        }
        return this.f4708p == 0 ? this.f7064c.n(i5, i6, i7, i8) : this.f7065d.n(i5, i6, i7, i8);
    }

    public final View O0(int i5, boolean z4, int i6) {
        H0();
        int i7 = z4 ? 24579 : 320;
        return this.f4708p == 0 ? this.f7064c.n(i5, i6, i7, 320) : this.f7065d.n(i5, i6, i7, 320);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View P0(j0.C0525P r17, j0.X r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r16.H0()
            int r1 = r16.v()
            r2 = 0
            int r1 = java.lang.Math.max(r1, r2)
            r3 = 1
            if (r20 == 0) goto L16
            int r1 = r1 + (-1)
            r4 = -1
            r5 = r4
            goto L19
        L16:
            r4 = r1
            r1 = r2
            r5 = r3
        L19:
            int r6 = r18.b()
            androidx.emoji2.text.f r7 = r0.f4710r
            int r7 = r7.k()
            androidx.emoji2.text.f r8 = r0.f4710r
            int r8 = r8.g()
            r9 = 0
            r10 = r9
            r11 = r10
        L2c:
            if (r1 == r4) goto L7d
            android.view.View r12 = r0.u(r1)
            int r13 = j0.AbstractC0519J.F(r12)
            if (r13 < 0) goto L7b
            if (r13 >= r6) goto L7b
            androidx.emoji2.text.f r13 = r0.f4710r
            int r13 = r13.e(r12)
            androidx.emoji2.text.f r14 = r0.f4710r
            int r14 = r14.b(r12)
            android.view.ViewGroup$LayoutParams r15 = r12.getLayoutParams()
            j0.K r15 = (j0.C0520K) r15
            j0.b0 r15 = r15.f7075a
            boolean r15 = r15.i()
            if (r15 == 0) goto L58
            if (r11 != 0) goto L7b
            r11 = r12
            goto L7b
        L58:
            if (r14 > r7) goto L5e
            if (r13 >= r7) goto L5e
            r15 = r3
            goto L5f
        L5e:
            r15 = r2
        L5f:
            if (r13 < r8) goto L65
            if (r14 <= r8) goto L65
            r13 = r3
            goto L66
        L65:
            r13 = r2
        L66:
            if (r15 != 0) goto L6c
            if (r13 == 0) goto L6b
            goto L6c
        L6b:
            return r12
        L6c:
            if (r19 == 0) goto L74
            if (r13 == 0) goto L71
            goto L76
        L71:
            if (r9 != 0) goto L7b
            goto L7a
        L74:
            if (r15 == 0) goto L78
        L76:
            r10 = r12
            goto L7b
        L78:
            if (r9 != 0) goto L7b
        L7a:
            r9 = r12
        L7b:
            int r1 = r1 + r5
            goto L2c
        L7d:
            if (r9 == 0) goto L80
            goto L85
        L80:
            if (r10 == 0) goto L84
            r9 = r10
            goto L85
        L84:
            r9 = r11
        L85:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.P0(j0.P, j0.X, boolean, boolean):android.view.View");
    }

    @Override // j0.AbstractC0519J
    public final void Q(RecyclerView recyclerView) {
    }

    public final int Q0(int i5, C0525P c0525p, X x4, boolean z4) {
        int iG;
        int iG2 = this.f4710r.g() - i5;
        if (iG2 <= 0) {
            return 0;
        }
        int i6 = -a1(-iG2, c0525p, x4);
        int i7 = i5 + i6;
        if (!z4 || (iG = this.f4710r.g() - i7) <= 0) {
            return i6;
        }
        this.f4710r.p(iG);
        return iG + i6;
    }

    @Override // j0.AbstractC0519J
    public View R(View view, int i5, C0525P c0525p, X x4) {
        int iG0;
        Z0();
        if (v() == 0 || (iG0 = G0(i5)) == Integer.MIN_VALUE) {
            return null;
        }
        H0();
        d1(iG0, (int) (this.f4710r.l() * 0.33333334f), false, x4);
        C0551t c0551t = this.f4709q;
        c0551t.f7292g = Integer.MIN_VALUE;
        c0551t.f7287a = false;
        I0(c0525p, c0551t, x4, true);
        View viewN0 = iG0 == -1 ? this.f4713u ? N0(v() - 1, -1) : N0(0, v()) : this.f4713u ? N0(0, v()) : N0(v() - 1, -1);
        View viewT0 = iG0 == -1 ? T0() : S0();
        if (!viewT0.hasFocusable()) {
            return viewN0;
        }
        if (viewN0 == null) {
            return null;
        }
        return viewT0;
    }

    public final int R0(int i5, C0525P c0525p, X x4, boolean z4) {
        int iK;
        int iK2 = i5 - this.f4710r.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i6 = -a1(iK2, c0525p, x4);
        int i7 = i5 + i6;
        if (!z4 || (iK = i7 - this.f4710r.k()) <= 0) {
            return i6;
        }
        this.f4710r.p(-iK);
        return i6 - iK;
    }

    @Override // j0.AbstractC0519J
    public final void S(AccessibilityEvent accessibilityEvent) {
        super.S(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(L0());
            accessibilityEvent.setToIndex(M0());
        }
    }

    public final View S0() {
        return u(this.f4713u ? 0 : v() - 1);
    }

    public final View T0() {
        return u(this.f4713u ? v() - 1 : 0);
    }

    public final boolean U0() {
        return A() == 1;
    }

    public void V0(C0525P c0525p, X x4, C0551t c0551t, C0550s c0550s) {
        int iE;
        int i5;
        int iD;
        int i6;
        int iD2;
        View viewB = c0551t.b(c0525p);
        if (viewB == null) {
            c0550s.f7284b = true;
            return;
        }
        C0520K c0520k = (C0520K) viewB.getLayoutParams();
        if (c0551t.f7296k == null) {
            if (this.f4713u == (c0551t.f == -1)) {
                b(viewB, -1, false);
            } else {
                b(viewB, 0, false);
            }
        } else {
            if (this.f4713u == (c0551t.f == -1)) {
                b(viewB, -1, true);
            } else {
                b(viewB, 0, true);
            }
        }
        C0520K c0520k2 = (C0520K) viewB.getLayoutParams();
        Rect rectX = this.f7063b.X(viewB);
        int i7 = rectX.left + rectX.right;
        int i8 = rectX.top + rectX.bottom;
        int iW = AbstractC0519J.w(d(), this.n, this.f7072l, D() + C() + ((ViewGroup.MarginLayoutParams) c0520k2).leftMargin + ((ViewGroup.MarginLayoutParams) c0520k2).rightMargin + i7, ((ViewGroup.MarginLayoutParams) c0520k2).width);
        int iW2 = AbstractC0519J.w(e(), this.f7074o, this.f7073m, B() + E() + ((ViewGroup.MarginLayoutParams) c0520k2).topMargin + ((ViewGroup.MarginLayoutParams) c0520k2).bottomMargin + i8, ((ViewGroup.MarginLayoutParams) c0520k2).height);
        if (v0(viewB, iW, iW2, c0520k2)) {
            viewB.measure(iW, iW2);
        }
        c0550s.f7283a = this.f4710r.c(viewB);
        if (this.f4708p == 1) {
            if (U0()) {
                iD = this.n - D();
                iD2 = iD - this.f4710r.d(viewB);
            } else {
                int iC = C();
                iD = this.f4710r.d(viewB) + iC;
                iD2 = iC;
            }
            if (c0551t.f == -1) {
                i6 = c0551t.f7288b;
                iE = i6 - c0550s.f7283a;
            } else {
                iE = c0551t.f7288b;
                i6 = c0550s.f7283a + iE;
            }
        } else {
            iE = E();
            int iD3 = this.f4710r.d(viewB) + iE;
            if (c0551t.f == -1) {
                iD = c0551t.f7288b;
                i5 = iD - c0550s.f7283a;
            } else {
                i5 = c0551t.f7288b;
                iD = c0550s.f7283a + i5;
            }
            int i9 = i5;
            i6 = iD3;
            iD2 = i9;
        }
        AbstractC0519J.L(viewB, iD2, iE, iD, i6);
        if (c0520k.f7075a.i() || c0520k.f7075a.l()) {
            c0550s.f7285c = true;
        }
        c0550s.f7286d = viewB.hasFocusable();
    }

    public void W0(C0525P c0525p, X x4, C0549r c0549r, int i5) {
    }

    public final void X0(C0525P c0525p, C0551t c0551t) {
        if (!c0551t.f7287a || c0551t.f7297l) {
            return;
        }
        int i5 = c0551t.f7292g;
        int i6 = c0551t.f7294i;
        if (c0551t.f == -1) {
            int iV = v();
            if (i5 < 0) {
                return;
            }
            int iF = (this.f4710r.f() - i5) + i6;
            if (this.f4713u) {
                for (int i7 = 0; i7 < iV; i7++) {
                    View viewU = u(i7);
                    if (this.f4710r.e(viewU) < iF || this.f4710r.o(viewU) < iF) {
                        Y0(c0525p, 0, i7);
                        return;
                    }
                }
                return;
            }
            int i8 = iV - 1;
            for (int i9 = i8; i9 >= 0; i9--) {
                View viewU2 = u(i9);
                if (this.f4710r.e(viewU2) < iF || this.f4710r.o(viewU2) < iF) {
                    Y0(c0525p, i8, i9);
                    return;
                }
            }
            return;
        }
        if (i5 < 0) {
            return;
        }
        int i10 = i5 - i6;
        int iV2 = v();
        if (!this.f4713u) {
            for (int i11 = 0; i11 < iV2; i11++) {
                View viewU3 = u(i11);
                if (this.f4710r.b(viewU3) > i10 || this.f4710r.n(viewU3) > i10) {
                    Y0(c0525p, 0, i11);
                    return;
                }
            }
            return;
        }
        int i12 = iV2 - 1;
        for (int i13 = i12; i13 >= 0; i13--) {
            View viewU4 = u(i13);
            if (this.f4710r.b(viewU4) > i10 || this.f4710r.n(viewU4) > i10) {
                Y0(c0525p, i12, i13);
                return;
            }
        }
    }

    public final void Y0(C0525P c0525p, int i5, int i6) {
        if (i5 == i6) {
            return;
        }
        if (i6 <= i5) {
            while (i5 > i6) {
                View viewU = u(i5);
                k0(i5);
                c0525p.h(viewU);
                i5--;
            }
            return;
        }
        for (int i7 = i6 - 1; i7 >= i5; i7--) {
            View viewU2 = u(i7);
            k0(i7);
            c0525p.h(viewU2);
        }
    }

    public final void Z0() {
        if (this.f4708p == 1 || !U0()) {
            this.f4713u = this.f4712t;
        } else {
            this.f4713u = !this.f4712t;
        }
    }

    @Override // j0.InterfaceC0531W
    public final PointF a(int i5) {
        if (v() == 0) {
            return null;
        }
        int i6 = (i5 < AbstractC0519J.F(u(0))) != this.f4713u ? -1 : 1;
        return this.f4708p == 0 ? new PointF(i6, 0.0f) : new PointF(0.0f, i6);
    }

    public final int a1(int i5, C0525P c0525p, X x4) {
        if (v() == 0 || i5 == 0) {
            return 0;
        }
        H0();
        this.f4709q.f7287a = true;
        int i6 = i5 > 0 ? 1 : -1;
        int iAbs = Math.abs(i5);
        d1(i6, iAbs, true, x4);
        C0551t c0551t = this.f4709q;
        int iI0 = I0(c0525p, c0551t, x4, false) + c0551t.f7292g;
        if (iI0 < 0) {
            return 0;
        }
        if (iAbs > iI0) {
            i5 = i6 * iI0;
        }
        this.f4710r.p(-i5);
        this.f4709q.f7295j = i5;
        if (x4.f7103d != 2) {
            this.f7063b.getClass();
        }
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018c  */
    @Override // j0.AbstractC0519J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b0(j0.C0525P r18, j0.X r19) {
        /*
            Method dump skipped, instructions count: 1078
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.b0(j0.P, j0.X):void");
    }

    public final void b1(int i5) {
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException(A3.f.l(i5, "invalid orientation:"));
        }
        c(null);
        if (i5 != this.f4708p || this.f4710r == null) {
            f fVarA = f.a(this, i5);
            this.f4710r = fVarA;
            this.f4704A.f7278a = fVarA;
            this.f4708p = i5;
            m0();
        }
    }

    @Override // j0.AbstractC0519J
    public final void c(String str) {
        if (this.f4718z == null) {
            super.c(str);
        }
    }

    @Override // j0.AbstractC0519J
    public void c0(X x4) {
        this.f4718z = null;
        this.f4716x = -1;
        this.f4717y = Integer.MIN_VALUE;
        this.f4704A.d();
    }

    public void c1(boolean z4) {
        c(null);
        if (this.f4714v == z4) {
            return;
        }
        this.f4714v = z4;
        m0();
    }

    @Override // j0.AbstractC0519J
    public final boolean d() {
        return this.f4708p == 0;
    }

    @Override // j0.AbstractC0519J
    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof C0552u) {
            C0552u c0552u = (C0552u) parcelable;
            this.f4718z = c0552u;
            if (this.f4716x != -1) {
                c0552u.f7298d = -1;
            }
            m0();
        }
    }

    public final void d1(int i5, int i6, boolean z4, X x4) {
        int iK;
        this.f4709q.f7297l = this.f4710r.i() == 0 && this.f4710r.f() == 0;
        this.f4709q.f = i5;
        int[] iArr = this.f4707D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(x4, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z5 = i5 == 1;
        C0551t c0551t = this.f4709q;
        int i7 = z5 ? iMax2 : iMax;
        c0551t.f7293h = i7;
        if (!z5) {
            iMax = iMax2;
        }
        c0551t.f7294i = iMax;
        if (z5) {
            c0551t.f7293h = this.f4710r.h() + i7;
            View viewS0 = S0();
            C0551t c0551t2 = this.f4709q;
            c0551t2.f7291e = this.f4713u ? -1 : 1;
            int iF = AbstractC0519J.F(viewS0);
            C0551t c0551t3 = this.f4709q;
            c0551t2.f7290d = iF + c0551t3.f7291e;
            c0551t3.f7288b = this.f4710r.b(viewS0);
            iK = this.f4710r.b(viewS0) - this.f4710r.g();
        } else {
            View viewT0 = T0();
            C0551t c0551t4 = this.f4709q;
            c0551t4.f7293h = this.f4710r.k() + c0551t4.f7293h;
            C0551t c0551t5 = this.f4709q;
            c0551t5.f7291e = this.f4713u ? 1 : -1;
            int iF2 = AbstractC0519J.F(viewT0);
            C0551t c0551t6 = this.f4709q;
            c0551t5.f7290d = iF2 + c0551t6.f7291e;
            c0551t6.f7288b = this.f4710r.e(viewT0);
            iK = (-this.f4710r.e(viewT0)) + this.f4710r.k();
        }
        C0551t c0551t7 = this.f4709q;
        c0551t7.f7289c = i6;
        if (z4) {
            c0551t7.f7289c = i6 - iK;
        }
        c0551t7.f7292g = iK;
    }

    @Override // j0.AbstractC0519J
    public final boolean e() {
        return this.f4708p == 1;
    }

    @Override // j0.AbstractC0519J
    public final Parcelable e0() {
        C0552u c0552u = this.f4718z;
        if (c0552u != null) {
            C0552u c0552u2 = new C0552u();
            c0552u2.f7298d = c0552u.f7298d;
            c0552u2.f7299e = c0552u.f7299e;
            c0552u2.f = c0552u.f;
            return c0552u2;
        }
        C0552u c0552u3 = new C0552u();
        if (v() > 0) {
            H0();
            boolean z4 = this.f4711s ^ this.f4713u;
            c0552u3.f = z4;
            if (z4) {
                View viewS0 = S0();
                c0552u3.f7299e = this.f4710r.g() - this.f4710r.b(viewS0);
                c0552u3.f7298d = AbstractC0519J.F(viewS0);
            } else {
                View viewT0 = T0();
                c0552u3.f7298d = AbstractC0519J.F(viewT0);
                c0552u3.f7299e = this.f4710r.e(viewT0) - this.f4710r.k();
            }
        } else {
            c0552u3.f7298d = -1;
        }
        return c0552u3;
    }

    public final void e1(int i5, int i6) {
        this.f4709q.f7289c = this.f4710r.g() - i6;
        C0551t c0551t = this.f4709q;
        c0551t.f7291e = this.f4713u ? -1 : 1;
        c0551t.f7290d = i5;
        c0551t.f = 1;
        c0551t.f7288b = i6;
        c0551t.f7292g = Integer.MIN_VALUE;
    }

    public final void f1(int i5, int i6) {
        this.f4709q.f7289c = i6 - this.f4710r.k();
        C0551t c0551t = this.f4709q;
        c0551t.f7290d = i5;
        c0551t.f7291e = this.f4713u ? 1 : -1;
        c0551t.f = -1;
        c0551t.f7288b = i6;
        c0551t.f7292g = Integer.MIN_VALUE;
    }

    @Override // j0.AbstractC0519J
    public final void h(int i5, int i6, X x4, b5 b5Var) {
        if (this.f4708p != 0) {
            i5 = i6;
        }
        if (v() == 0 || i5 == 0) {
            return;
        }
        H0();
        d1(i5 > 0 ? 1 : -1, Math.abs(i5), true, x4);
        C0(x4, this.f4709q, b5Var);
    }

    @Override // j0.AbstractC0519J
    public final void i(int i5, b5 b5Var) {
        boolean z4;
        int i6;
        C0552u c0552u = this.f4718z;
        if (c0552u == null || (i6 = c0552u.f7298d) < 0) {
            Z0();
            z4 = this.f4713u;
            i6 = this.f4716x;
            if (i6 == -1) {
                i6 = z4 ? i5 - 1 : 0;
            }
        } else {
            z4 = c0552u.f;
        }
        int i7 = z4 ? -1 : 1;
        for (int i8 = 0; i8 < this.f4706C && i6 >= 0 && i6 < i5; i8++) {
            b5Var.a(i6, 0);
            i6 += i7;
        }
    }

    @Override // j0.AbstractC0519J
    public final int j(X x4) {
        return D0(x4);
    }

    @Override // j0.AbstractC0519J
    public int k(X x4) {
        return E0(x4);
    }

    @Override // j0.AbstractC0519J
    public int l(X x4) {
        return F0(x4);
    }

    @Override // j0.AbstractC0519J
    public final int m(X x4) {
        return D0(x4);
    }

    @Override // j0.AbstractC0519J
    public int n(X x4) {
        return E0(x4);
    }

    @Override // j0.AbstractC0519J
    public int n0(int i5, C0525P c0525p, X x4) {
        if (this.f4708p == 1) {
            return 0;
        }
        return a1(i5, c0525p, x4);
    }

    @Override // j0.AbstractC0519J
    public int o(X x4) {
        return F0(x4);
    }

    @Override // j0.AbstractC0519J
    public final void o0(int i5) {
        this.f4716x = i5;
        this.f4717y = Integer.MIN_VALUE;
        C0552u c0552u = this.f4718z;
        if (c0552u != null) {
            c0552u.f7298d = -1;
        }
        RecyclerView recyclerView = this.f7063b;
        if (recyclerView != null) {
            recyclerView.getClass();
        }
        m0();
    }

    @Override // j0.AbstractC0519J
    public int p0(int i5, C0525P c0525p, X x4) {
        if (this.f4708p == 0) {
            return 0;
        }
        return a1(i5, c0525p, x4);
    }

    @Override // j0.AbstractC0519J
    public final View q(int i5) {
        int iV = v();
        if (iV == 0) {
            return null;
        }
        int iF = i5 - AbstractC0519J.F(u(0));
        if (iF >= 0 && iF < iV) {
            View viewU = u(iF);
            if (AbstractC0519J.F(viewU) == i5) {
                return viewU;
            }
        }
        return super.q(i5);
    }

    @Override // j0.AbstractC0519J
    public C0520K r() {
        return new C0520K(-2, -2);
    }

    @Override // j0.AbstractC0519J
    public final boolean w0() {
        if (this.f7073m == 1073741824 || this.f7072l == 1073741824) {
            return false;
        }
        int iV = v();
        for (int i5 = 0; i5 < iV; i5++) {
            ViewGroup.LayoutParams layoutParams = u(i5).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // j0.AbstractC0519J
    public void y0(RecyclerView recyclerView, int i5) {
        C0553v c0553v = new C0553v(recyclerView.getContext());
        c0553v.f7300a = i5;
        z0(c0553v);
        Log.d("SeslLinearLayoutManager", "SS pos to : " + i5);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i5, int i6) {
        this.f4712t = false;
        new PathInterpolator(0.22f, 0.5f, 0.0f, 1.0f);
        this.f4718z = null;
        this.f4704A = new C0549r();
        this.f4705B = new C0550s();
        this.f4706C = 2;
        this.f4707D = new int[2];
        C0518I c0518iG = AbstractC0519J.G(context, attributeSet, i5, i6);
        b1(c0518iG.f7058a);
        boolean z4 = c0518iG.f7060c;
        c(null);
        if (z4 != this.f4712t) {
            this.f4712t = z4;
            m0();
        }
        c1(c0518iG.f7061d);
    }
}
