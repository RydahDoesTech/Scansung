package androidx.recyclerview.widget;

import B3.h;
import E0.c;
import G0.g;
import J.C0056m;
import J.C0059p;
import J.H;
import J.InterfaceC0057n;
import J.P;
import P2.n;
import Q.a;
import android.R;
import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.picker.widget.HandlerC0165c;
import b0.C0198c;
import com.google.android.gms.internal.p000firebaseauthapi.b5;
import com.google.firebase.messaging.C0388e;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseInterface;
import d.b;
import g3.y;
import g4.f;
import j0.AbstractC0510A;
import j0.AbstractC0514E;
import j0.AbstractC0515F;
import j0.AbstractC0516G;
import j0.AbstractC0519J;
import j0.AbstractC0521L;
import j0.AbstractC0522M;
import j0.C0520K;
import j0.C0523N;
import j0.C0524O;
import j0.C0525P;
import j0.C0527S;
import j0.C0528T;
import j0.C0532a;
import j0.C0533b;
import j0.C0534c;
import j0.C0537f;
import j0.C0542k;
import j0.C0544m;
import j0.C0553v;
import j0.C0556y;
import j0.InterfaceC0513D;
import j0.InterfaceC0526Q;
import j0.InterfaceC0529U;
import j0.RunnableC0546o;
import j0.RunnableC0557z;
import j0.X;
import j0.Y;
import j0.Z;
import j0.a0;
import j0.b0;
import j0.d0;
import j0.k0;
import j0.m0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k.Q0;
import o.C0707e;
import o.C0713k;
import r0.AbstractC0808b;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: l2, reason: collision with root package name */
    public static boolean f4719l2 = false;

    /* renamed from: m2, reason: collision with root package name */
    public static boolean f4720m2 = false;
    public static final int[] n2 = {R.attr.nestedScrollingEnabled};

    /* renamed from: o2, reason: collision with root package name */
    public static final float f4721o2 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean p2 = true;

    /* renamed from: q2, reason: collision with root package name */
    public static final boolean f4722q2 = true;

    /* renamed from: r2, reason: collision with root package name */
    public static final boolean f4723r2 = true;
    public static final float s2 = 10.0f;

    /* renamed from: t2, reason: collision with root package name */
    public static final Class[] f4724t2;

    /* renamed from: u2, reason: collision with root package name */
    public static final c f4725u2;
    public static final Y v2;

    /* renamed from: A, reason: collision with root package name */
    public boolean f4726A;
    public boolean A0;

    /* renamed from: A1, reason: collision with root package name */
    public boolean f4727A1;

    /* renamed from: B, reason: collision with root package name */
    public boolean f4728B;

    /* renamed from: B0, reason: collision with root package name */
    public final int[] f4729B0;

    /* renamed from: B1, reason: collision with root package name */
    public boolean f4730B1;

    /* renamed from: C, reason: collision with root package name */
    public int f4731C;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f4732C0;

    /* renamed from: C1, reason: collision with root package name */
    public int f4733C1;

    /* renamed from: D, reason: collision with root package name */
    public boolean f4734D;

    /* renamed from: D0, reason: collision with root package name */
    public float f4735D0;

    /* renamed from: D1, reason: collision with root package name */
    public final int[] f4736D1;
    public final AccessibilityManager E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f4737E0;

    /* renamed from: E1, reason: collision with root package name */
    public long f4738E1;

    /* renamed from: F, reason: collision with root package name */
    public ArrayList f4739F;

    /* renamed from: F0, reason: collision with root package name */
    public ValueAnimator f4740F0;
    public long F1;

    /* renamed from: G, reason: collision with root package name */
    public boolean f4741G;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f4742G0;

    /* renamed from: G1, reason: collision with root package name */
    public final long f4743G1;

    /* renamed from: H, reason: collision with root package name */
    public boolean f4744H;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f4745H0;

    /* renamed from: H1, reason: collision with root package name */
    public final long f4746H1;

    /* renamed from: I, reason: collision with root package name */
    public int f4747I;

    /* renamed from: I0, reason: collision with root package name */
    public int f4748I0;

    /* renamed from: I1, reason: collision with root package name */
    public long f4749I1;

    /* renamed from: J, reason: collision with root package name */
    public int f4750J;

    /* renamed from: J0, reason: collision with root package name */
    public boolean f4751J0;
    public int J1;

    /* renamed from: K, reason: collision with root package name */
    public AbstractC0514E f4752K;

    /* renamed from: K0, reason: collision with root package name */
    public boolean f4753K0;

    /* renamed from: K1, reason: collision with root package name */
    public boolean f4754K1;

    /* renamed from: L, reason: collision with root package name */
    public EdgeEffect f4755L;

    /* renamed from: L0, reason: collision with root package name */
    public final b f4756L0;

    /* renamed from: L1, reason: collision with root package name */
    public boolean f4757L1;

    /* renamed from: M, reason: collision with root package name */
    public EdgeEffect f4758M;

    /* renamed from: M0, reason: collision with root package name */
    public final int[] f4759M0;
    public int M1;

    /* renamed from: N, reason: collision with root package name */
    public EdgeEffect f4760N;
    public final int N0;

    /* renamed from: N1, reason: collision with root package name */
    public boolean f4761N1;

    /* renamed from: O, reason: collision with root package name */
    public EdgeEffect f4762O;

    /* renamed from: O0, reason: collision with root package name */
    public final int f4763O0;

    /* renamed from: O1, reason: collision with root package name */
    public final boolean f4764O1;

    /* renamed from: P0, reason: collision with root package name */
    public final boolean f4765P0;

    /* renamed from: P1, reason: collision with root package name */
    public boolean f4766P1;

    /* renamed from: Q, reason: collision with root package name */
    public AbstractC0515F f4767Q;

    /* renamed from: Q0, reason: collision with root package name */
    public boolean f4768Q0;

    /* renamed from: Q1, reason: collision with root package name */
    public final int f4769Q1;

    /* renamed from: R, reason: collision with root package name */
    public int f4770R;

    /* renamed from: R0, reason: collision with root package name */
    public boolean f4771R0;

    /* renamed from: R1, reason: collision with root package name */
    public final int f4772R1;

    /* renamed from: S0, reason: collision with root package name */
    public boolean f4773S0;

    /* renamed from: S1, reason: collision with root package name */
    public final Rect f4774S1;

    /* renamed from: T, reason: collision with root package name */
    public int f4775T;

    /* renamed from: T0, reason: collision with root package name */
    public ArrayList f4776T0;

    /* renamed from: T1, reason: collision with root package name */
    public final Rect f4777T1;

    /* renamed from: U, reason: collision with root package name */
    public VelocityTracker f4778U;

    /* renamed from: U0, reason: collision with root package name */
    public final boolean f4779U0;
    public boolean U1;

    /* renamed from: V, reason: collision with root package name */
    public int f4780V;
    public int V0;

    /* renamed from: V1, reason: collision with root package name */
    public int f4781V1;

    /* renamed from: W, reason: collision with root package name */
    public int f4782W;

    /* renamed from: W0, reason: collision with root package name */
    public int f4783W0;

    /* renamed from: W1, reason: collision with root package name */
    public final int f4784W1;

    /* renamed from: X0, reason: collision with root package name */
    public int f4785X0;

    /* renamed from: X1, reason: collision with root package name */
    public final int f4786X1;

    /* renamed from: Y0, reason: collision with root package name */
    public int f4787Y0;

    /* renamed from: Y1, reason: collision with root package name */
    public boolean f4788Y1;

    /* renamed from: Z0, reason: collision with root package name */
    public int f4789Z0;

    /* renamed from: Z1, reason: collision with root package name */
    public final C0198c f4790Z1;

    /* renamed from: a0, reason: collision with root package name */
    public int f4791a0;

    /* renamed from: a1, reason: collision with root package name */
    public int f4792a1;

    /* renamed from: a2, reason: collision with root package name */
    public final C0388e f4793a2;

    /* renamed from: b0, reason: collision with root package name */
    public int f4794b0;

    /* renamed from: b1, reason: collision with root package name */
    public View f4795b1;
    public final boolean b2;

    /* renamed from: c0, reason: collision with root package name */
    public int f4796c0;

    /* renamed from: c1, reason: collision with root package name */
    public int f4797c1;
    public final HandlerC0165c c2;

    /* renamed from: d, reason: collision with root package name */
    public final float f4798d;

    /* renamed from: d0, reason: collision with root package name */
    public AbstractC0521L f4799d0;
    public int d1;

    /* renamed from: d2, reason: collision with root package name */
    public final ArrayList f4800d2;

    /* renamed from: e, reason: collision with root package name */
    public final C0527S f4801e;

    /* renamed from: e0, reason: collision with root package name */
    public final int f4802e0;

    /* renamed from: e1, reason: collision with root package name */
    public final Drawable f4803e1;
    public final C0525P f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f4804f0;

    /* renamed from: f1, reason: collision with root package name */
    public final Rect f4805f1;

    /* renamed from: f2, reason: collision with root package name */
    public final RunnableC0557z f4806f2;

    /* renamed from: g, reason: collision with root package name */
    public C0528T f4807g;
    public final float g0;

    /* renamed from: g1, reason: collision with root package name */
    public int f4808g1;

    /* renamed from: g2, reason: collision with root package name */
    public boolean f4809g2;

    /* renamed from: h, reason: collision with root package name */
    public final C0533b f4810h;

    /* renamed from: h0, reason: collision with root package name */
    public final float f4811h0;

    /* renamed from: h1, reason: collision with root package name */
    public int f4812h1;

    /* renamed from: h2, reason: collision with root package name */
    public int f4813h2;

    /* renamed from: i, reason: collision with root package name */
    public final h f4814i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f4815i0;

    /* renamed from: i1, reason: collision with root package name */
    public int f4816i1;

    /* renamed from: i2, reason: collision with root package name */
    public int f4817i2;

    /* renamed from: j, reason: collision with root package name */
    public final C0388e f4818j;

    /* renamed from: j0, reason: collision with root package name */
    public final a0 f4819j0;

    /* renamed from: j1, reason: collision with root package name */
    public boolean f4820j1;

    /* renamed from: j2, reason: collision with root package name */
    public final C0556y f4821j2;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4822k;
    public RunnableC0546o k0;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f4823k1;

    /* renamed from: k2, reason: collision with root package name */
    public final boolean f4824k2;

    /* renamed from: l, reason: collision with root package name */
    public final RunnableC0557z f4825l;
    public final b5 l0;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f4826l1;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f4827m;
    public final X m0;

    /* renamed from: m1, reason: collision with root package name */
    public boolean f4828m1;
    public final Rect n;
    public AbstractC0522M n0;
    public final int n1;

    /* renamed from: o, reason: collision with root package name */
    public final RectF f4829o;
    public ArrayList o0;

    /* renamed from: o1, reason: collision with root package name */
    public boolean f4830o1;

    /* renamed from: p, reason: collision with root package name */
    public AbstractC0510A f4831p;
    public boolean p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f4832p1;

    /* renamed from: q, reason: collision with root package name */
    public AbstractC0519J f4833q;
    public boolean q0;

    /* renamed from: q1, reason: collision with root package name */
    public boolean f4834q1;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f4835r;

    /* renamed from: r0, reason: collision with root package name */
    public final C0556y f4836r0;

    /* renamed from: r1, reason: collision with root package name */
    public int f4837r1;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f4838s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f4839s0;

    /* renamed from: s1, reason: collision with root package name */
    public int f4840s1;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f4841t;
    public d0 t0;

    /* renamed from: t1, reason: collision with root package name */
    public int f4842t1;

    /* renamed from: u, reason: collision with root package name */
    public C0544m f4843u;

    /* renamed from: u0, reason: collision with root package name */
    public final int[] f4844u0;

    /* renamed from: u1, reason: collision with root package name */
    public final Paint f4845u1;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4846v;

    /* renamed from: v0, reason: collision with root package name */
    public C0056m f4847v0;

    /* renamed from: v1, reason: collision with root package name */
    public final androidx.appcompat.util.c f4848v1;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4849w;

    /* renamed from: w0, reason: collision with root package name */
    public final int[] f4850w0;

    /* renamed from: w1, reason: collision with root package name */
    public int f4851w1;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4852x;

    /* renamed from: x0, reason: collision with root package name */
    public final int[] f4853x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f4854x1;

    /* renamed from: y, reason: collision with root package name */
    public int f4855y;

    /* renamed from: y0, reason: collision with root package name */
    public final int[] f4856y0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f4857y1;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4858z;

    /* renamed from: z0, reason: collision with root package name */
    public final Context f4859z0;
    public boolean z1;

    static {
        Class cls = Integer.TYPE;
        f4724t2 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        new LinearInterpolator();
        f4725u2 = new c(2);
        v2 = new Y();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.wssyncmldm.R.attr.recyclerViewStyle);
    }

    public static RecyclerView P(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            RecyclerView recyclerViewP = P(viewGroup.getChildAt(i5));
            if (recyclerViewP != null) {
                return recyclerViewP;
            }
        }
        return null;
    }

    public static int T(View view) {
        b0 b0VarV = V(view);
        if (b0VarV != null) {
            return b0VarV.b();
        }
        return -1;
    }

    public static b0 V(View view) {
        if (view == null) {
            return null;
        }
        return ((C0520K) view.getLayoutParams()).f7075a;
    }

    public static void W(Rect rect, View view) {
        C0520K c0520k = (C0520K) view.getLayoutParams();
        Rect rect2 = c0520k.f7076b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0520k).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0520k).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0520k).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0520k).bottomMargin);
    }

    private int getPendingAnimFlag() {
        AbstractC0515F itemAnimator = getItemAnimator();
        if (itemAnimator instanceof C0542k) {
            return ((C0542k) itemAnimator).f7214p;
        }
        return 0;
    }

    private int getRecyclerViewScreenLocationY() {
        int[] iArr = this.f4729B0;
        getLocationOnScreen(iArr);
        return iArr[1];
    }

    private C0056m getScrollingChildHelper() {
        if (this.f4847v0 == null) {
            this.f4847v0 = new C0056m(this);
        }
        return this.f4847v0;
    }

    public static void q(b0 b0Var) {
        WeakReference weakReference = b0Var.f7129b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == b0Var.f7128a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            b0Var.f7129b = null;
        }
    }

    public static void setDebugAssertionsEnabled(boolean z4) {
        f4719l2 = z4;
    }

    public static void setVerboseLoggingEnabled(boolean z4) {
        f4720m2 = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupGoToTop(int i5) {
        b0();
    }

    public static int t(int i5, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i6) {
        if (i5 > 0 && edgeEffect != null && J2.b.t(edgeEffect) != 0.0f) {
            int iRound = Math.round(J2.b.O(edgeEffect, ((-i5) * 4.0f) / i6, 0.5f) * ((-i6) / 4.0f));
            if (iRound != i5) {
                edgeEffect.finish();
            }
            return i5 - iRound;
        }
        if (i5 >= 0 || edgeEffect2 == null || J2.b.t(edgeEffect2) == 0.0f) {
            return i5;
        }
        float f = i6;
        int iRound2 = Math.round(J2.b.O(edgeEffect2, (i5 * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i5) {
            edgeEffect2.finish();
        }
        return i5 - iRound2;
    }

    public final boolean A(int i5, int i6, int[] iArr, int[] iArr2, int i7) {
        return getScrollingChildHelper().c(i5, i6, iArr, iArr2, i7);
    }

    public final void A0(int i5) {
        if (this.f4726A) {
            return;
        }
        AbstractC0519J abstractC0519J = this.f4833q;
        if (abstractC0519J == null) {
            Log.e("SeslRecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0519J.y0(this, i5);
        }
    }

    public final void B(int i5, int i6) {
        this.f4750J++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i5, scrollY - i6);
        AbstractC0522M abstractC0522M = this.n0;
        if (abstractC0522M != null) {
            abstractC0522M.b(this, i5, i6);
        }
        ArrayList arrayList = this.o0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0522M) this.o0.get(size)).b(this, i5, i6);
            }
        }
        this.f4750J--;
    }

    public final void B0() {
        int i5 = this.f4855y + 1;
        this.f4855y = i5;
        if (i5 != 1 || this.f4726A) {
            return;
        }
        this.f4858z = false;
    }

    public final void C() {
        if (this.f4762O != null) {
            return;
        }
        ((Y) this.f4752K).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f4762O = edgeEffect;
        if (this.f4822k) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void C0(int i5, int i6) {
        getScrollingChildHelper().g(i5, i6);
    }

    public final void D() {
        if (this.f4755L != null) {
            return;
        }
        ((Y) this.f4752K).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f4755L = edgeEffect;
        if (this.f4822k) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void D0(boolean z4) {
        if (this.f4855y < 1) {
            if (f4719l2) {
                throw new IllegalStateException(f.b(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.f4855y = 1;
        }
        if (!z4 && !this.f4726A) {
            this.f4858z = false;
        }
        if (this.f4855y == 1) {
            if (z4 && this.f4858z && !this.f4726A && this.f4833q != null && this.f4831p != null) {
                x();
            }
            if (!this.f4726A) {
                this.f4858z = false;
            }
        }
        this.f4855y--;
    }

    public final void E() {
        if (this.f4760N != null) {
            return;
        }
        ((Y) this.f4752K).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f4760N = edgeEffect;
        if (this.f4822k) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void E0(int i5) {
        getScrollingChildHelper().h(i5);
    }

    public final void F() {
        if (this.f4758M != null) {
            return;
        }
        ((Y) this.f4752K).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f4758M = edgeEffect;
        if (this.f4822k) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String G() {
        return " " + super.toString() + ", adapter:" + this.f4831p + ", layout:" + this.f4833q + ", context:" + getContext();
    }

    public final void H(X x4) {
        if (getScrollState() != 2) {
            x4.getClass();
            return;
        }
        OverScroller overScroller = this.f4819j0.f;
        overScroller.getFinalX();
        overScroller.getCurrX();
        x4.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View I(float f, float f5) {
        for (int iG = this.f4814i.g() - 1; iG >= 0; iG--) {
            View viewF = this.f4814i.f(iG);
            float translationX = viewF.getTranslationX();
            float translationY = viewF.getTranslationY();
            if (f >= viewF.getLeft() + translationX && f <= viewF.getRight() + translationX && f5 >= viewF.getTop() + translationY && f5 <= viewF.getBottom() + translationY) {
                return viewF;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View J(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            boolean r0 = r9.isClickable()
            r1 = 0
            if (r0 == 0) goto L7d
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r9.getGlobalVisibleRect(r0)
            r8.getGlobalVisibleRect(r2)
            J.m r3 = r8.f4847v0
            if (r3 == 0) goto L6b
            android.view.ViewParent r3 = r3.e(r1)
            boolean r3 = r3 instanceof androidx.core.widget.NestedScrollView
            if (r3 == 0) goto L6b
            J.m r3 = r8.f4847v0
            android.view.ViewParent r3 = r3.e(r1)
            androidx.core.widget.NestedScrollView r3 = (androidx.core.widget.NestedScrollView) r3
            int r4 = r3.getScrollY()
            r5 = r8
            r6 = r1
        L31:
            boolean r7 = r5 instanceof androidx.core.widget.NestedScrollView
            if (r7 != 0) goto L49
            int r7 = r5.getTop()
            int r6 = r6 + r7
            android.view.ViewParent r7 = r5.getParent()
            boolean r7 = r7 instanceof android.view.ViewGroup
            if (r7 == 0) goto L49
            android.view.ViewParent r5 = r5.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L31
        L49:
            if (r4 <= r6) goto L6b
            int r3 = r3.getScrollY()
            r4 = r8
            r5 = r1
        L51:
            boolean r6 = r4 instanceof androidx.core.widget.NestedScrollView
            if (r6 != 0) goto L69
            int r6 = r4.getTop()
            int r5 = r5 + r6
            android.view.ViewParent r6 = r4.getParent()
            boolean r6 = r6 instanceof android.view.ViewGroup
            if (r6 == 0) goto L69
            android.view.ViewParent r4 = r4.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            goto L51
        L69:
            int r3 = r3 - r5
            goto L6c
        L6b:
            r3 = r1
        L6c:
            int r4 = (int) r10
            int r5 = r2.left
            int r4 = r4 + r5
            int r5 = (int) r11
            int r2 = r2.top
            int r5 = r5 + r2
            int r5 = r5 - r3
            boolean r0 = r0.contains(r4, r5)
            if (r0 == 0) goto L7d
            r0 = r9
            goto L7e
        L7d:
            r0 = 0
        L7e:
            boolean r2 = r9 instanceof android.view.ViewGroup
            if (r2 == 0) goto L99
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
        L84:
            int r2 = r9.getChildCount()
            if (r1 >= r2) goto L99
            android.view.View r2 = r9.getChildAt(r1)
            android.view.View r2 = r8.J(r2, r10, r11)
            if (r2 == 0) goto L96
            r0 = r2
            goto L99
        L96:
            int r1 = r1 + 1
            goto L84
        L99:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.J(android.view.View, float, float):android.view.View");
    }

    public final View K(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final int L() {
        int iL0;
        AbstractC0519J abstractC0519J = this.f4833q;
        if (abstractC0519J instanceof LinearLayoutManager) {
            iL0 = ((LinearLayoutManager) abstractC0519J).L0();
        } else if (abstractC0519J instanceof StaggeredGridLayoutManager) {
            iL0 = ((StaggeredGridLayoutManager) this.f4833q).J0()[abstractC0519J.A() == 1 ? ((StaggeredGridLayoutManager) this.f4833q).f4870p - 1 : 0];
        } else {
            iL0 = 0;
        }
        if (iL0 == -1) {
            return 0;
        }
        return iL0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean M(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.f4841t
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            j0.m r5 = (j0.C0544m) r5
            int r6 = r5.f7250v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.e(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.d(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.f7251w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f7244p = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.f7251w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f7242m = r6
        L55:
            r5.g(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.f4843u = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.M(android.view.MotionEvent):boolean");
    }

    public final int N() {
        AbstractC0519J abstractC0519J = this.f4833q;
        if (abstractC0519J instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) abstractC0519J).M0();
        }
        if (!(abstractC0519J instanceof StaggeredGridLayoutManager)) {
            return -1;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) abstractC0519J;
        int[] iArr = new int[staggeredGridLayoutManager.f4870p];
        for (int i5 = 0; i5 < staggeredGridLayoutManager.f4870p; i5++) {
            k0 k0Var = staggeredGridLayoutManager.f4871q[i5];
            boolean z4 = k0Var.f.f4877w;
            ArrayList arrayList = k0Var.f7216a;
            iArr[i5] = z4 ? k0Var.e(0, arrayList.size(), true, false) : k0Var.e(arrayList.size() - 1, -1, true, false);
        }
        return iArr[0];
    }

    public final void O(int[] iArr) {
        int iG = this.f4814i.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        for (int i7 = 0; i7 < iG; i7++) {
            b0 b0VarV = V(this.f4814i.f(i7));
            if (!b0VarV.p()) {
                int iB = b0VarV.b();
                if (iB < i5) {
                    i5 = iB;
                }
                if (iB > i6) {
                    i6 = iB;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
    }

    public final b0 Q(int i5) {
        b0 b0Var = null;
        if (this.f4741G) {
            return null;
        }
        int iJ = this.f4814i.j();
        for (int i6 = 0; i6 < iJ; i6++) {
            b0 b0VarV = V(this.f4814i.i(i6));
            if (b0VarV != null && !b0VarV.i() && R(b0VarV) == i5) {
                if (!((ArrayList) this.f4814i.f263e).contains(b0VarV.f7128a)) {
                    return b0VarV;
                }
                b0Var = b0VarV;
            }
        }
        return b0Var;
    }

    public final int R(b0 b0Var) {
        if (b0Var.d(524) || !b0Var.f()) {
            return -1;
        }
        C0533b c0533b = this.f4810h;
        int i5 = b0Var.f7130c;
        ArrayList arrayList = c0533b.f7123b;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            C0532a c0532a = (C0532a) arrayList.get(i6);
            int i7 = c0532a.f7112a;
            if (i7 != 1) {
                if (i7 == 2) {
                    int i8 = c0532a.f7113b;
                    if (i8 <= i5) {
                        int i9 = c0532a.f7115d;
                        if (i8 + i9 > i5) {
                            return -1;
                        }
                        i5 -= i9;
                    } else {
                        continue;
                    }
                } else if (i7 == 8) {
                    int i10 = c0532a.f7113b;
                    if (i10 == i5) {
                        i5 = c0532a.f7115d;
                    } else {
                        if (i10 < i5) {
                            i5--;
                        }
                        if (c0532a.f7115d <= i5) {
                            i5++;
                        }
                    }
                }
            } else if (c0532a.f7113b <= i5) {
                i5 += c0532a.f7115d;
            }
        }
        return i5;
    }

    public final long S(b0 b0Var) {
        return this.f4831p.f7051b ? b0Var.f7132e : b0Var.f7130c;
    }

    public final b0 U(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return V(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect X(View view) {
        C0520K c0520k = (C0520K) view.getLayoutParams();
        boolean z4 = c0520k.f7077c;
        Rect rect = c0520k.f7076b;
        if (!z4) {
            return rect;
        }
        if (this.m0.f7105g && (c0520k.f7075a.l() || c0520k.f7075a.g())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f4838s;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            Rect rect2 = this.f4827m;
            rect2.set(0, 0, 0, 0);
            ((AbstractC0516G) arrayList.get(i5)).getClass();
            ((C0520K) view.getLayoutParams()).f7075a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c0520k.f7077c = false;
        return rect;
    }

    public final int Y(boolean z4, boolean z5) {
        return this.f4736D1[Q0.c(z4 ? z5 ? 2 : 3 : z5 ? 4 : 1)];
    }

    public final boolean Z() {
        return !this.f4852x || this.f4741G || this.f4810h.g();
    }

    public final boolean a0() {
        return this.f4747I > 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i5, int i6) {
        AbstractC0519J abstractC0519J = this.f4833q;
        if (abstractC0519J != null) {
            abstractC0519J.getClass();
        }
        super.addFocusables(arrayList, i5, i6);
    }

    public final void b0() {
        String string;
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (string = Settings.Secure.getString(getContext().getContentResolver(), "enabled_accessibility_services")) == null || !(string.matches("(?i).*com.samsung.accessibility/com.samsung.android.app.talkback.TalkBackService.*") || string.matches("(?i).*com.samsung.android.accessibility.talkback/com.samsung.android.marvin.talkback.TalkBackService.*") || string.matches("(?i).*com.google.android.marvin.talkback.TalkBackService.*") || string.matches("(?i).*com.samsung.accessibility/com.samsung.accessibility.universalswitch.UniversalSwitchService.*"))) {
            getHeight();
        }
    }

    public final void c0(int i5) {
        if (this.f4833q == null) {
            return;
        }
        setScrollState(2);
        this.f4833q.o0(i5);
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0520K) && this.f4833q.f((C0520K) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC0519J abstractC0519J = this.f4833q;
        if (abstractC0519J != null && abstractC0519J.d()) {
            return this.f4833q.j(this.m0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC0519J abstractC0519J = this.f4833q;
        if (abstractC0519J != null && abstractC0519J.d()) {
            return this.f4833q.k(this.m0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC0519J abstractC0519J = this.f4833q;
        if (abstractC0519J != null && abstractC0519J.d()) {
            return this.f4833q.l(this.m0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC0519J abstractC0519J = this.f4833q;
        if (abstractC0519J != null && abstractC0519J.e()) {
            return this.f4833q.m(this.m0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC0519J abstractC0519J = this.f4833q;
        if (abstractC0519J != null && abstractC0519J.e()) {
            return this.f4833q.n(this.m0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC0519J abstractC0519J = this.f4833q;
        if (abstractC0519J != null && abstractC0519J.e()) {
            return this.f4833q.o(this.m0);
        }
        return 0;
    }

    public final void d0() {
        int iJ = this.f4814i.j();
        for (int i5 = 0; i5 < iJ; i5++) {
            ((C0520K) this.f4814i.i(i5).getLayoutParams()).f7077c = true;
        }
        ArrayList arrayList = this.f.f7088c;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            C0520K c0520k = (C0520K) ((b0) arrayList.get(i6)).f7128a.getLayoutParams();
            if (c0520k != null) {
                c0520k.f7077c = true;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        AbstractC0515F abstractC0515F;
        super.dispatchDraw(canvas);
        ArrayList arrayList = this.f4838s;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((AbstractC0516G) arrayList.get(i5)).c(canvas, this);
        }
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        boolean z4 = this.f4830o1;
        Paint paint = this.f4845u1;
        if (z4 && ((this.f4837r1 != -1 || this.f4840s1 != -1) && !canScrollVertically(-1) && (!canScrollVertically(1) || ((abstractC0515F = this.f4767Q) != null && abstractC0515F.f())))) {
            ValueAnimator valueAnimator = this.f4740F0;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                this.f4842t1 = this.f4837r1;
            }
            AbstractC0515F abstractC0515F2 = this.f4767Q;
            if (abstractC0515F2 != null && abstractC0515F2.f()) {
                int pendingAnimFlag = getPendingAnimFlag();
                if (pendingAnimFlag == 8) {
                    this.f4742G0 = true;
                } else if (pendingAnimFlag == 1) {
                    this.f4745H0 = true;
                }
                if (this.f4834q1) {
                    childAt = this.f4837r1 != -1 ? this.f4814i.f(0) : getChildAt(0);
                } else if (this.f4837r1 != -1) {
                    h hVar = this.f4814i;
                    childAt = hVar.f(hVar.g() - 1);
                } else {
                    childAt = getChildAt(getChildCount() - 1);
                }
                if (childAt != null) {
                    if (!this.f4742G0 && !this.f4745H0) {
                        this.f4842t1 = childAt.getHeight() + Math.round(childAt.getY());
                    } else if (this.f4740F0 == null) {
                        AbstractC0515F itemAnimator = getItemAnimator();
                        if ((itemAnimator instanceof C0542k) && this.f4748I0 == -1) {
                            this.f4748I0 = ((C0542k) itemAnimator).f7215q;
                        }
                        if (this.f4742G0) {
                            this.f4740F0 = ValueAnimator.ofInt(this.f4748I0, childAt.getHeight() + ((int) childAt.getY()));
                        } else if (this.f4745H0) {
                            this.f4740F0 = ValueAnimator.ofInt(this.f4748I0, childAt.getBottom());
                        } else {
                            Log.d("SeslRecyclerView", "Not set only add/remove anim");
                        }
                        this.f4740F0.setDuration(330L);
                        this.f4740F0.addListener(this.f4756L0);
                        this.f4740F0.addUpdateListener(new C0537f(this, 1));
                        this.f4740F0.start();
                    }
                }
                invalidate();
            }
            int i6 = this.f4837r1;
            if (i6 != -1 || this.f4842t1 != i6 || this.f4742G0) {
                canvas.drawRect(0.0f, this.f4842t1, width, getBottom(), paint);
                if (this.f4832p1) {
                    this.f4848v1.b(paddingLeft, this.f4842t1, width - paddingRight, getBottom(), canvas);
                }
            }
        }
        this.f4748I0 = this.f4837r1;
        if (this.f4828m1) {
            int height = getHeight();
            if (paddingLeft > 0) {
                canvas.drawRect(0.0f, 0.0f, paddingLeft, height, paint);
            }
            if (paddingRight > 0) {
                canvas.drawRect(width - paddingRight, 0.0f, width, height, paint);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03a4  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r18) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 953
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19 || keyCode == 20) {
            if (keyEvent.getAction() == 0) {
                this.f4788Y1 = true;
            }
        } else if (keyCode == 66 && this.b2 && this.f4824k2) {
            int action = keyEvent.getAction();
            C0388e c0388e = this.f4793a2;
            if (action == 0) {
                View focusedChild = getFocusedChild();
                if (focusedChild != null) {
                    c0388e.F(focusedChild);
                }
            } else {
                c0388e.G();
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f5, boolean z4) {
        return getScrollingChildHelper().a(f, f5, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f5) {
        return getScrollingChildHelper().b(f, f5);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i5, int i6, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i5, i6, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i5, int i6, int i7, int i8, int[] iArr) {
        return getScrollingChildHelper().d(i5, i6, i7, i8, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d4  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r13) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z4;
        AbstractC0519J abstractC0519J;
        super.draw(canvas);
        ArrayList arrayList = this.f4838s;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((AbstractC0516G) arrayList.get(i5)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f4755L;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z4 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f4822k ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f4755L;
            z4 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f4758M;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f4822k) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f4758M;
            z4 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f4760N;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f4822k ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f4760N;
            z4 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f4762O;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f4822k) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f4762O;
            z4 |= edgeEffect8 != null && edgeEffect8.draw(canvas);
            canvas.restoreToCount(iSave4);
        }
        if ((z4 || this.f4767Q == null || arrayList.size() <= 0 || !this.f4767Q.f()) ? z4 : true) {
            WeakHashMap weakHashMap = P.f1421a;
            postInvalidateOnAnimation();
        }
        b0();
        if (!this.f4779U0 || (abstractC0519J = this.f4833q) == null) {
            return;
        }
        if (this.f4787Y0 == 0 && this.f4789Z0 == 0) {
            return;
        }
        int iL0 = abstractC0519J instanceof LinearLayoutManager ? ((LinearLayoutManager) abstractC0519J).L0() : abstractC0519J instanceof StaggeredGridLayoutManager ? ((StaggeredGridLayoutManager) abstractC0519J).J0()[0] : -1;
        int iN = N();
        int i6 = this.f4797c1;
        if (i6 >= iL0 && i6 <= iN) {
            View viewQ = this.f4833q.q(i6);
            this.f4795b1 = viewQ;
            this.f4783W0 = (viewQ != null ? viewQ.getTop() : 0) + this.d1;
        }
        int i7 = this.f4783W0;
        int i8 = this.f4785X0;
        int i9 = i7 < i8 ? i7 : i8;
        this.f4789Z0 = i9;
        if (i8 > i7) {
            i7 = i8;
        }
        int i10 = this.f4787Y0;
        int i11 = this.f4792a1;
        Rect rect = this.f4805f1;
        rect.set(i10, i9, i11, i7);
        Drawable drawable = this.f4803e1;
        drawable.setBounds(rect);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j5) {
        return super.drawChild(canvas, view, j5);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e0(int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.e0(int, int, int):void");
    }

    public final void f0() {
        this.f4768Q0 = false;
        this.f4771R0 = true;
        this.f4776T0.clear();
        this.V0 = 0;
        this.f4783W0 = 0;
        this.f4785X0 = 0;
        this.f4787Y0 = 0;
        this.f4789Z0 = 0;
        this.f4792a1 = 0;
        this.f4795b1 = null;
        this.d1 = 0;
        if (this.f4779U0) {
            invalidate();
        }
        HandlerC0165c handlerC0165c = this.c2;
        if (handlerC0165c.hasMessages(0)) {
            handlerC0165c.removeMessages(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g0(int i5, boolean z4, int i6) {
        int i7 = i5 + i6;
        int iJ = this.f4814i.j();
        for (int i8 = 0; i8 < iJ; i8++) {
            b0 b0VarV = V(this.f4814i.i(i8));
            if (b0VarV != null && !b0VarV.p()) {
                int i9 = b0VarV.f7130c;
                X x4 = this.m0;
                if (i9 >= i7) {
                    if (f4720m2) {
                        Log.d("SeslRecyclerView", "offsetPositionRecordsForRemove attached child " + i8 + " holder " + b0VarV + " now at position " + (b0VarV.f7130c - i6));
                    }
                    b0VarV.m(-i6, z4);
                    x4.f = true;
                } else if (i9 >= i5) {
                    if (f4720m2) {
                        Log.d("SeslRecyclerView", "offsetPositionRecordsForRemove attached child " + i8 + " holder " + b0VarV + " now REMOVED");
                    }
                    b0VarV.a(8);
                    b0VarV.m(-i6, z4);
                    b0VarV.f7130c = i5 - 1;
                    x4.f = true;
                }
            }
        }
        C0525P c0525p = this.f;
        ArrayList arrayList = c0525p.f7088c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b0 b0Var = (b0) arrayList.get(size);
            if (b0Var != null) {
                int i10 = b0Var.f7130c;
                if (i10 >= i7) {
                    if (f4720m2) {
                        Log.d("SeslRecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + b0Var + " now at position " + (b0Var.f7130c - i6));
                    }
                    b0Var.m(-i6, z4);
                } else if (i10 >= i5) {
                    b0Var.a(8);
                    c0525p.g(size);
                }
            }
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0519J abstractC0519J = this.f4833q;
        if (abstractC0519J != null) {
            return abstractC0519J.r();
        }
        throw new IllegalStateException(f.b(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0519J abstractC0519J = this.f4833q;
        if (abstractC0519J != null) {
            return abstractC0519J.s(getContext(), attributeSet);
        }
        throw new IllegalStateException(f.b(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0510A getAdapter() {
        return this.f4831p;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0519J abstractC0519J = this.f4833q;
        if (abstractC0519J == null) {
            return super.getBaseline();
        }
        abstractC0519J.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i5, int i6) {
        return super.getChildDrawingOrder(i5, i6);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f4822k;
    }

    public d0 getCompatAccessibilityDelegate() {
        return this.t0;
    }

    public AbstractC0514E getEdgeEffectFactory() {
        return this.f4752K;
    }

    public AbstractC0515F getItemAnimator() {
        return this.f4767Q;
    }

    public int getItemDecorationCount() {
        return this.f4838s.size();
    }

    public AbstractC0519J getLayoutManager() {
        return this.f4833q;
    }

    public final InterfaceC0529U getLongPressMultiSelectionListener() {
        return null;
    }

    public int getMaxFlingVelocity() {
        return this.f4804f0;
    }

    public int getMinFlingVelocity() {
        return this.f4802e0;
    }

    public long getNanoTime() {
        if (f4723r2) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC0521L getOnFlingListener() {
        return this.f4799d0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f4815i0;
    }

    public C0524O getRecycledViewPool() {
        return this.f.c();
    }

    public int getScrollState() {
        return this.f4770R;
    }

    public final void h0() {
        this.f4747I++;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(b0 b0Var) {
        View view = b0Var.f7128a;
        boolean z4 = view.getParent() == this;
        this.f.l(U(view));
        if (b0Var.k()) {
            this.f4814i.c(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z4) {
            this.f4814i.b(view, -1, true);
            return;
        }
        h hVar = this.f4814i;
        int iIndexOfChild = ((C0556y) hVar.f261c).f7319a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((C0534c) hVar.f262d).h(iIndexOfChild);
            hVar.k(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void i0(boolean z4) {
        int i5;
        AccessibilityManager accessibilityManager;
        int i6 = this.f4747I - 1;
        this.f4747I = i6;
        if (i6 < 1) {
            if (f4719l2 && i6 < 0) {
                throw new IllegalStateException(f.b(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f4747I = 0;
            if (z4) {
                int i7 = this.f4731C;
                this.f4731C = 0;
                if (i7 != 0 && (accessibilityManager = this.E) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i7);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f4800d2;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    b0 b0Var = (b0) arrayList.get(size);
                    if (b0Var.f7128a.getParent() == this && !b0Var.p() && (i5 = b0Var.f7142q) != -1) {
                        WeakHashMap weakHashMap = P.f1421a;
                        b0Var.f7128a.setImportantForAccessibility(i5);
                        b0Var.f7142q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f4846v;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f4726A;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f1474d;
    }

    public final void j(AbstractC0516G abstractC0516G) {
        AbstractC0519J abstractC0519J = this.f4833q;
        if (abstractC0519J != null) {
            abstractC0519J.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f4838s;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC0516G);
        d0();
        requestLayout();
    }

    public final void j0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4775T) {
            int i5 = actionIndex == 0 ? 1 : 0;
            this.f4775T = motionEvent.getPointerId(i5);
            int x4 = (int) (motionEvent.getX(i5) + 0.5f);
            this.f4791a0 = x4;
            this.f4780V = x4;
            int y4 = (int) (motionEvent.getY(i5) + 0.5f);
            this.f4794b0 = y4;
            this.f4782W = y4;
        }
    }

    public final void k(AbstractC0522M abstractC0522M) {
        if (this.o0 == null) {
            this.o0 = new ArrayList();
        }
        this.o0.add(abstractC0522M);
    }

    public final void k0(int i5) {
        int iL0;
        AbstractC0510A abstractC0510A = this.f4831p;
        if (abstractC0510A == null) {
            Log.e("SeslRecyclerView", "No adapter attached; skipping pageScroll");
            return;
        }
        int iA = abstractC0510A.a();
        if (iA <= 0) {
            return;
        }
        int i6 = 0;
        if (i5 == 0) {
            AbstractC0519J abstractC0519J = this.f4833q;
            iL0 = (abstractC0519J instanceof LinearLayoutManager ? ((LinearLayoutManager) abstractC0519J).L0() : abstractC0519J instanceof StaggeredGridLayoutManager ? ((StaggeredGridLayoutManager) abstractC0519J).J0()[0] : -1) - getChildCount();
        } else if (i5 == 1) {
            iL0 = N() + getChildCount();
        } else if (i5 == 2) {
            iL0 = 0;
        } else if (i5 != 3) {
            return;
        } else {
            iL0 = iA - 1;
        }
        int i7 = iA - 1;
        if (iL0 > i7) {
            i6 = i7;
        } else if (iL0 >= 0) {
            i6 = iL0;
        }
        this.f4833q.f7063b.v0(i6);
        this.f4833q.f7063b.post(new RunnableC0557z(this, 0));
    }

    public final void l() {
        int[] iArr = this.f4856y0;
        getLocationInWindow(iArr);
        AbstractC0519J abstractC0519J = this.f4833q;
        int i5 = (abstractC0519J == null || !abstractC0519J.d()) ? iArr[1] : iArr[0];
        int i6 = this.f4816i1;
        int i7 = this.f4808g1;
        int i8 = i6 - (i7 - i5);
        this.f4812h1 = i8;
        if (i7 - i5 < 0) {
            this.f4816i1 = i8;
            this.f4808g1 = i5;
        }
    }

    public final void l0() {
        if (this.f4839s0 || !this.f4846v) {
            return;
        }
        WeakHashMap weakHashMap = P.f1421a;
        postOnAnimation(this.f4806f2);
        this.f4839s0 = true;
    }

    public final void m(int i5) {
        if (this.f4820j1) {
            if (p() && this.f4812h1 == 0) {
                return;
            }
            int i6 = this.f4812h1 - i5;
            this.f4812h1 = i6;
            if (i6 < 0) {
                this.f4812h1 = 0;
                return;
            }
            int i7 = this.f4816i1;
            if (i6 > i7) {
                this.f4812h1 = i7;
            }
        }
    }

    public final void m0() {
        boolean z4;
        boolean z5 = false;
        if (this.f4741G) {
            C0533b c0533b = this.f4810h;
            c0533b.k(c0533b.f7123b);
            c0533b.k(c0533b.f7124c);
            c0533b.f = 0;
            if (this.f4744H) {
                this.f4833q.X();
            }
        }
        if (this.f4767Q == null || !this.f4833q.A0()) {
            this.f4810h.c();
        } else {
            this.f4810h.j();
        }
        boolean z6 = this.p0 || this.q0;
        boolean z7 = this.f4852x && this.f4767Q != null && ((z4 = this.f4741G) || z6 || this.f4833q.f) && (!z4 || this.f4831p.f7051b);
        X x4 = this.m0;
        x4.f7108j = z7;
        if (z7 && z6 && !this.f4741G && this.f4767Q != null && this.f4833q.A0()) {
            z5 = true;
        }
        x4.f7109k = z5;
    }

    public final void n(String str) {
        if (a0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(f.b(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f4750J > 0) {
            Log.w("SeslRecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(f.b(this, new StringBuilder(""))));
        }
    }

    public final void n0(boolean z4) {
        this.f4744H = z4 | this.f4744H;
        this.f4741G = true;
        int iJ = this.f4814i.j();
        for (int i5 = 0; i5 < iJ; i5++) {
            b0 b0VarV = V(this.f4814i.i(i5));
            if (b0VarV != null && !b0VarV.p()) {
                b0VarV.a(6);
            }
        }
        d0();
        C0525P c0525p = this.f;
        ArrayList arrayList = c0525p.f7088c;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            b0 b0Var = (b0) arrayList.get(i6);
            if (b0Var != null) {
                b0Var.a(6);
                b0Var.a(1024);
            }
        }
        AbstractC0510A abstractC0510A = c0525p.f7092h.f4831p;
        if (abstractC0510A == null || !abstractC0510A.f7051b) {
            c0525p.f();
        }
    }

    public final boolean o() {
        boolean zD;
        boolean z4;
        int childCount = getChildCount();
        AbstractC0519J abstractC0519J = this.f4833q;
        boolean z5 = true;
        if (abstractC0519J != null) {
            zD = abstractC0519J.d();
            z4 = this.f4833q.A() == 1;
        } else {
            zD = false;
            z4 = false;
        }
        AbstractC0519J abstractC0519J2 = this.f4833q;
        boolean z6 = abstractC0519J2 instanceof LinearLayoutManager ? ((LinearLayoutManager) abstractC0519J2).f4712t : false;
        if (this.f4831p == null) {
            Log.e("SeslRecyclerView", "No adapter attached; skipping canScrollDown");
            return false;
        }
        boolean z7 = !z6 ? L() + childCount >= this.f4831p.a() : L() <= 0;
        if (z7 || childCount <= 0) {
            return z7;
        }
        View childAt = getChildAt(z6 ? 0 : childCount - 1);
        Rect rect = this.f4777T1;
        W(rect, childAt);
        Rect rect2 = this.f4774S1;
        if (!zD ? !(rect.bottom > getBottom() - rect2.bottom || rect.bottom > getHeight() - rect2.bottom) : !(!z4 ? rect.right > getRight() - rect2.right || rect.right > getWidth() - rect2.right : rect.left < rect2.left)) {
            z5 = false;
        }
        return z5;
    }

    public final void o0(b0 b0Var, C0059p c0059p) {
        b0Var.f7136j &= -8193;
        boolean z4 = this.m0.f7106h;
        C0388e c0388e = this.f4818j;
        if (z4 && b0Var.l() && !b0Var.i() && !b0Var.p()) {
            ((C0707e) c0388e.f).d(S(b0Var), b0Var);
        }
        C0713k c0713k = (C0713k) c0388e.f6142e;
        m0 m0VarA = (m0) c0713k.getOrDefault(b0Var, null);
        if (m0VarA == null) {
            m0VarA = m0.a();
            c0713k.put(b0Var, m0VarA);
        }
        m0VarA.f7257b = c0059p;
        m0VarA.f7256a |= 4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4747I = 0;
        this.f4846v = true;
        this.f4852x = this.f4852x && !isLayoutRequested();
        this.f.d();
        AbstractC0519J abstractC0519J = this.f4833q;
        if (abstractC0519J != null) {
            abstractC0519J.f7067g = true;
            abstractC0519J.P(this);
        }
        this.f4839s0 = false;
        if (f4723r2) {
            ThreadLocal threadLocal = RunnableC0546o.f7264h;
            RunnableC0546o runnableC0546o = (RunnableC0546o) threadLocal.get();
            this.k0 = runnableC0546o;
            if (runnableC0546o == null) {
                RunnableC0546o runnableC0546o2 = new RunnableC0546o();
                runnableC0546o2.f7266d = new ArrayList();
                runnableC0546o2.f7268g = new ArrayList();
                this.k0 = runnableC0546o2;
                WeakHashMap weakHashMap = P.f1421a;
                Display display = getDisplay();
                if (!isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    f = refreshRate >= 30.0f ? refreshRate : 60.0f;
                    if (this.f4737E0) {
                        this.f4735D0 = 1000.0f / f;
                        this.f4737E0 = false;
                    }
                }
                RunnableC0546o runnableC0546o3 = this.k0;
                runnableC0546o3.f = (long) (1.0E9f / f);
                threadLocal.set(runnableC0546o3);
            }
            RunnableC0546o runnableC0546o4 = this.k0;
            runnableC0546o4.getClass();
            boolean z4 = f4719l2;
            ArrayList arrayList = runnableC0546o4.f7266d;
            if (z4 && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
            AbstractC0519J abstractC0519J2 = this.f4833q;
            if (abstractC0519J2 != null) {
                abstractC0519J2.A();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0525P c0525p;
        RunnableC0546o runnableC0546o;
        C0553v c0553v;
        super.onDetachedFromWindow();
        AbstractC0515F abstractC0515F = this.f4767Q;
        if (abstractC0515F != null) {
            abstractC0515F.e();
        }
        int i5 = 0;
        setScrollState(0);
        a0 a0Var = this.f4819j0;
        RecyclerView recyclerView = a0Var.f7121j;
        recyclerView.removeCallbacks(a0Var);
        a0Var.f.abortAnimation();
        AbstractC0808b.o(recyclerView, 0.0f);
        AbstractC0519J abstractC0519J = this.f4833q;
        if (abstractC0519J != null && (c0553v = abstractC0519J.f7066e) != null) {
            c0553v.i();
        }
        this.f4846v = false;
        AbstractC0519J abstractC0519J2 = this.f4833q;
        if (abstractC0519J2 != null) {
            abstractC0519J2.f7067g = false;
            abstractC0519J2.Q(this);
        }
        this.f4800d2.clear();
        removeCallbacks(this.f4806f2);
        this.f4818j.getClass();
        while (m0.f7255d.a() != null) {
        }
        int i6 = 0;
        while (true) {
            c0525p = this.f;
            ArrayList arrayList = c0525p.f7088c;
            if (i6 >= arrayList.size()) {
                break;
            }
            y.e(((b0) arrayList.get(i6)).f7128a);
            i6++;
        }
        c0525p.e(c0525p.f7092h.f4831p, false);
        while (i5 < getChildCount()) {
            int i7 = i5 + 1;
            View childAt = getChildAt(i5);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            a aVar = (a) childAt.getTag(com.wssyncmldm.R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new a();
                childAt.setTag(com.wssyncmldm.R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList2 = aVar.f2273a;
            int iG0 = n.g0(arrayList2);
            if (-1 < iG0) {
                arrayList2.get(iG0).getClass();
                throw new ClassCastException();
            }
            i5 = i7;
        }
        if (f4723r2 && (runnableC0546o = this.k0) != null) {
            boolean zRemove = runnableC0546o.f7266d.remove(this);
            if (f4719l2 && !zRemove) {
                throw new IllegalStateException("RecyclerView removal failed!");
            }
            this.k0 = null;
        }
        this.f4737E0 = true;
        if (this.b2) {
            ArrayList arrayList3 = (ArrayList) this.f4793a2.f;
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                d.c cVar = (d.c) it.next();
                boolean zB = cVar.b();
                ValueAnimator valueAnimator = cVar.f6392d;
                if (zB) {
                    valueAnimator.end();
                }
                valueAnimator.removeAllUpdateListeners();
            }
            arrayList3.clear();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f4838s;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((AbstractC0516G) arrayList.get(i5)).a(this);
        }
        if (this.f4737E0) {
            WeakHashMap weakHashMap = P.f1421a;
            Display display = getDisplay();
            if (display != null) {
                this.f4735D0 = 1000.0f / display.getRefreshRate();
            } else {
                this.f4735D0 = 16.66f;
            }
            this.f4737E0 = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0185  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 961
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i5, KeyEvent keyEvent) {
        if (i5 != 92) {
            if (i5 != 93) {
                if (i5 == 113 || i5 == 114) {
                    this.f4823k1 = true;
                } else if (i5 != 122) {
                    if (i5 == 123 && keyEvent.hasNoModifiers()) {
                        k0(3);
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    k0(2);
                }
            } else if (keyEvent.hasNoModifiers()) {
                k0(1);
            }
        } else if (keyEvent.hasNoModifiers()) {
            k0(0);
        }
        return super.onKeyDown(i5, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i5, KeyEvent keyEvent) {
        if (i5 == 113 || i5 == 114) {
            this.f4823k1 = false;
        }
        return super.onKeyUp(i5, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) throws Resources.NotFoundException {
        Trace.beginSection("RV OnLayout");
        x();
        Trace.endSection();
        this.f4852x = true;
        if (z4) {
            getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_recyclerview_overlay_feature_hidden_height);
            setupGoToTop(-1);
            AbstractC0519J abstractC0519J = this.f4833q;
            int[] iArr = this.f4856y0;
            if (abstractC0519J == null || abstractC0519J.d()) {
                AbstractC0519J abstractC0519J2 = this.f4833q;
                if (abstractC0519J2 == null || !abstractC0519J2.d()) {
                    return;
                }
                getLocationInWindow(iArr);
                this.f4812h1 = 0;
                this.f4816i1 = 0;
                this.f4808g1 = iArr[0];
                return;
            }
            this.f4820j1 = false;
            ViewParent parent = getParent();
            while (true) {
                if (parent == null || !(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent instanceof InterfaceC0057n) {
                    for (Class<?> superclass = parent.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                        if (superclass.getSimpleName().equals("CoordinatorLayout")) {
                            ViewGroup viewGroup = (ViewGroup) parent;
                            viewGroup.getLocationInWindow(iArr);
                            int height = viewGroup.getHeight() + iArr[1];
                            getLocationInWindow(iArr);
                            this.f4808g1 = iArr[1];
                            int height2 = getHeight() - (height - this.f4808g1);
                            this.f4812h1 = height2;
                            if (height2 < 0) {
                                this.f4812h1 = 0;
                            }
                            this.f4816i1 = this.f4812h1;
                            this.f4820j1 = true;
                        }
                    }
                }
                parent = parent.getParent();
            }
            if (this.f4820j1) {
                return;
            }
            this.f4808g1 = 0;
            this.f4812h1 = 0;
            this.f4816i1 = 0;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i6) {
        if (this.f4833q == null) {
            v(i5, i6);
            return;
        }
        this.f4774S1.set(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        boolean zJ = this.f4833q.J();
        boolean z4 = false;
        X x4 = this.m0;
        if (zJ) {
            int mode = View.MeasureSpec.getMode(i5);
            int mode2 = View.MeasureSpec.getMode(i6);
            this.f4833q.f7063b.v(i5, i6);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z4 = true;
            }
            this.f4809g2 = z4;
            if (z4 || this.f4831p == null) {
                return;
            }
            if (x4.f7103d == 1) {
                y();
            }
            this.f4833q.r0(i5, i6);
            x4.f7107i = true;
            z();
            this.f4833q.t0(i5, i6);
            if (this.f4833q.w0()) {
                this.f4833q.r0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                x4.f7107i = true;
                z();
                this.f4833q.t0(i5, i6);
            }
            this.f4813h2 = getMeasuredWidth();
            this.f4817i2 = getMeasuredHeight();
            return;
        }
        if (this.f4849w) {
            this.f4833q.f7063b.v(i5, i6);
            return;
        }
        if (this.f4734D) {
            B0();
            h0();
            m0();
            i0(true);
            if (x4.f7109k) {
                x4.f7105g = true;
            } else {
                this.f4810h.c();
                x4.f7105g = false;
            }
            this.f4734D = false;
            D0(false);
        } else if (x4.f7109k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC0510A abstractC0510A = this.f4831p;
        if (abstractC0510A != null) {
            x4.f7104e = abstractC0510A.a();
        } else {
            x4.f7104e = 0;
        }
        B0();
        this.f4833q.f7063b.v(i5, i6);
        D0(false);
        x4.f7105g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i5, Rect rect) {
        if (a0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i5, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0528T)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0528T c0528t = (C0528T) parcelable;
        this.f4807g = c0528t;
        super.onRestoreInstanceState(c0528t.f2363d);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        this.f4737E0 = true;
        C0528T c0528t = new C0528T(super.onSaveInstanceState());
        C0528T c0528t2 = this.f4807g;
        if (c0528t2 != null) {
            c0528t.f = c0528t2.f;
        } else {
            AbstractC0519J abstractC0519J = this.f4833q;
            if (abstractC0519J != null) {
                c0528t.f = abstractC0519J.e0();
            } else {
                c0528t.f = null;
            }
        }
        return c0528t;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        if (i5 == i7 && i6 == i8) {
            return;
        }
        this.f4762O = null;
        this.f4758M = null;
        this.f4760N = null;
        this.f4755L = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0218 A[PHI: r0
  0x0218: PHI (r0v68 int) = (r0v53 int), (r0v72 int) binds: [B:100:0x0201, B:104:0x0214] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0531  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v4 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r26) {
        /*
            Method dump skipped, instructions count: 1543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p() {
        boolean zD;
        boolean z4;
        int childCount = getChildCount();
        AbstractC0519J abstractC0519J = this.f4833q;
        boolean z5 = true;
        if (abstractC0519J != null) {
            zD = abstractC0519J.d();
            z4 = this.f4833q.A() == 1;
        } else {
            zD = false;
            z4 = false;
        }
        AbstractC0519J abstractC0519J2 = this.f4833q;
        boolean z6 = abstractC0519J2 instanceof LinearLayoutManager ? ((LinearLayoutManager) abstractC0519J2).f4712t : false;
        boolean z7 = !z6 ? L() <= 0 : L() + childCount >= this.f4831p.a();
        if (z7 || childCount <= 0) {
            return z7;
        }
        View childAt = getChildAt(z6 ? childCount - 1 : 0);
        Rect rect = this.f4777T1;
        W(rect, childAt);
        Rect rect2 = this.f4774S1;
        if (!zD ? rect.top >= rect2.top : !z4 ? rect.left >= rect2.left : rect.right <= getRight() - rect2.right && rect.right <= getWidth() - rect2.right) {
            z5 = false;
        }
        return z5;
    }

    public final int p0(int i5, float f) {
        float height = f / getHeight();
        float width = i5 / getWidth();
        EdgeEffect edgeEffect = this.f4755L;
        float f5 = 0.0f;
        if (edgeEffect == null || J2.b.t(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f4760N;
            if (edgeEffect2 != null && J2.b.t(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f4760N.onRelease();
                } else {
                    float fO = J2.b.O(this.f4760N, width, height);
                    if (J2.b.t(this.f4760N) == 0.0f) {
                        this.f4760N.onRelease();
                    }
                    f5 = fO;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f4755L.onRelease();
            } else {
                float f6 = -J2.b.O(this.f4755L, -width, 1.0f - height);
                if (J2.b.t(this.f4755L) == 0.0f) {
                    this.f4755L.onRelease();
                }
                f5 = f6;
            }
            invalidate();
        }
        return Math.round(f5 * getWidth());
    }

    public final int q0(int i5, float f) {
        float width = f / getWidth();
        float height = i5 / getHeight();
        EdgeEffect edgeEffect = this.f4758M;
        float f5 = 0.0f;
        if (edgeEffect == null || J2.b.t(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f4762O;
            if (edgeEffect2 != null && J2.b.t(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f4762O.onRelease();
                } else {
                    float fO = J2.b.O(this.f4762O, height, 1.0f - width);
                    if (J2.b.t(this.f4762O) == 0.0f) {
                        this.f4762O.onRelease();
                    }
                    f5 = fO;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f4758M.onRelease();
            } else {
                float f6 = -J2.b.O(this.f4758M, -height, width);
                if (J2.b.t(this.f4758M) == 0.0f) {
                    this.f4758M.onRelease();
                }
                f5 = f6;
            }
            invalidate();
        }
        return Math.round(f5 * getHeight());
    }

    public final void r() {
        int iJ = this.f4814i.j();
        for (int i5 = 0; i5 < iJ; i5++) {
            b0 b0VarV = V(this.f4814i.i(i5));
            if (!b0VarV.p()) {
                b0VarV.f7131d = -1;
                b0VarV.f7133g = -1;
            }
        }
        C0525P c0525p = this.f;
        ArrayList arrayList = c0525p.f7088c;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            b0 b0Var = (b0) arrayList.get(i6);
            b0Var.f7131d = -1;
            b0Var.f7133g = -1;
        }
        ArrayList arrayList2 = c0525p.f7086a;
        int size2 = arrayList2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            b0 b0Var2 = (b0) arrayList2.get(i7);
            b0Var2.f7131d = -1;
            b0Var2.f7133g = -1;
        }
        ArrayList arrayList3 = c0525p.f7087b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i8 = 0; i8 < size3; i8++) {
                b0 b0Var3 = (b0) c0525p.f7087b.get(i8);
                b0Var3.f7131d = -1;
                b0Var3.f7133g = -1;
            }
        }
    }

    public final void r0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f4827m;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0520K) {
            C0520K c0520k = (C0520K) layoutParams;
            if (!c0520k.f7077c) {
                int i5 = rect.left;
                Rect rect2 = c0520k.f7076b;
                rect.left = i5 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f4833q.l0(this, view, this.f4827m, !this.f4852x, view2 == null);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z4) {
        b0 b0VarV = V(view);
        if (b0VarV != null) {
            if (b0VarV.k()) {
                b0VarV.f7136j &= -257;
            } else if (!b0VarV.p()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(b0VarV);
                throw new IllegalArgumentException(f.b(this, sb));
            }
        } else if (f4719l2) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(f.b(this, sb2));
        }
        view.clearAnimation();
        w(view);
        super.removeDetachedView(view, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0553v c0553v = this.f4833q.f7066e;
        if ((c0553v == null || !c0553v.f7304e) && !a0() && view2 != null) {
            r0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        return this.f4833q.l0(this, view, rect, z4, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        ArrayList arrayList = this.f4841t;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((C0544m) arrayList.get(i5)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f4855y != 0 || this.f4726A) {
            this.f4858z = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i5, int i6) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f4755L;
        if (edgeEffect == null || edgeEffect.isFinished() || i5 <= 0) {
            zIsFinished = false;
        } else {
            this.f4755L.onRelease();
            zIsFinished = this.f4755L.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f4760N;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i5 < 0) {
            this.f4760N.onRelease();
            zIsFinished |= this.f4760N.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4758M;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i6 > 0) {
            this.f4758M.onRelease();
            zIsFinished |= this.f4758M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4762O;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i6 < 0) {
            this.f4762O.onRelease();
            zIsFinished |= this.f4762O.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = P.f1421a;
            postInvalidateOnAnimation();
        }
    }

    public final void s0() {
        VelocityTracker velocityTracker = this.f4778U;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        E0(0);
        EdgeEffect edgeEffect = this.f4755L;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f4755L.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f4758M;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f4758M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4760N;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f4760N.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4762O;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f4762O.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = P.f1421a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i5, int i6) {
        AbstractC0519J abstractC0519J = this.f4833q;
        if (abstractC0519J == null) {
            Log.e("SeslRecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4726A) {
            return;
        }
        boolean zD = abstractC0519J.d();
        boolean zE = this.f4833q.e();
        if (zD || zE) {
            if (!zD) {
                i5 = 0;
            }
            if (!zE) {
                i6 = 0;
            }
            t0(i5, i6, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i5, int i6) {
        Log.w("SeslRecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!a0()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f4731C |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(d0 d0Var) {
        this.t0 = d0Var;
        P.h(this, d0Var);
    }

    public void setAdapter(AbstractC0510A abstractC0510A) {
        setLayoutFrozen(false);
        AbstractC0510A abstractC0510A2 = this.f4831p;
        C0527S c0527s = this.f4801e;
        if (abstractC0510A2 != null) {
            abstractC0510A2.f7050a.unregisterObserver(c0527s);
            this.f4831p.getClass();
        }
        AbstractC0515F abstractC0515F = this.f4767Q;
        if (abstractC0515F != null) {
            abstractC0515F.e();
        }
        AbstractC0519J abstractC0519J = this.f4833q;
        C0525P c0525p = this.f;
        if (abstractC0519J != null) {
            abstractC0519J.h0(c0525p);
        }
        AbstractC0519J abstractC0519J2 = this.f4833q;
        if (abstractC0519J2 != null) {
            abstractC0519J2.i0(c0525p);
        }
        c0525p.f7086a.clear();
        c0525p.f();
        C0533b c0533b = this.f4810h;
        c0533b.k(c0533b.f7123b);
        c0533b.k(c0533b.f7124c);
        c0533b.f = 0;
        AbstractC0510A abstractC0510A3 = this.f4831p;
        this.f4831p = abstractC0510A;
        if (abstractC0510A != null) {
            abstractC0510A.f7050a.registerObserver(c0527s);
        }
        AbstractC0519J abstractC0519J3 = this.f4833q;
        if (abstractC0519J3 != null) {
            abstractC0519J3.O();
        }
        AbstractC0510A abstractC0510A4 = this.f4831p;
        c0525p.f7086a.clear();
        c0525p.f();
        c0525p.e(abstractC0510A3, true);
        C0524O c0524oC = c0525p.c();
        if (abstractC0510A3 != null) {
            c0524oC.f7084b--;
        }
        if (c0524oC.f7084b == 0) {
            int i5 = 0;
            while (true) {
                SparseArray sparseArray = c0524oC.f7083a;
                if (i5 >= sparseArray.size()) {
                    break;
                }
                C0523N c0523n = (C0523N) sparseArray.valueAt(i5);
                if (c0523n != null) {
                    ArrayList arrayList = c0523n.f7079a;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        y.e(((b0) it.next()).f7128a);
                    }
                    arrayList.clear();
                } else {
                    Log.e("SeslRecyclerView", "clear() wasn't executed because RecycledViewPool.mScrap was invalid");
                }
                i5++;
            }
        }
        if (abstractC0510A4 != null) {
            c0524oC.f7084b++;
        }
        c0525p.d();
        this.m0.f = true;
        n0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0513D interfaceC0513D) {
        if (interfaceC0513D == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z4) {
        if (z4 != this.f4822k) {
            this.f4762O = null;
            this.f4758M = null;
            this.f4760N = null;
            this.f4755L = null;
        }
        this.f4822k = z4;
        super.setClipToPadding(z4);
        if (this.f4852x) {
            requestLayout();
        }
    }

    public void setEdgeEffectEnabled(boolean z4) {
        if (this.f4753K0 != z4) {
            this.f4753K0 = z4;
        }
    }

    public void setEdgeEffectFactory(AbstractC0514E abstractC0514E) {
        abstractC0514E.getClass();
        this.f4752K = abstractC0514E;
        this.f4762O = null;
        this.f4758M = null;
        this.f4760N = null;
        this.f4755L = null;
    }

    public void setHasFixedSize(boolean z4) {
        this.f4849w = z4;
    }

    public void setItemAnimator(AbstractC0515F abstractC0515F) {
        AbstractC0515F abstractC0515F2 = this.f4767Q;
        if (abstractC0515F2 != null) {
            abstractC0515F2.e();
            this.f4767Q.f7053a = null;
        }
        this.f4767Q = abstractC0515F;
        if (abstractC0515F != null) {
            abstractC0515F.f7053a = this.f4836r0;
            abstractC0515F.f7055c = this;
        }
    }

    public void setItemViewCacheSize(int i5) {
        C0525P c0525p = this.f;
        c0525p.f7090e = i5;
        c0525p.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z4) {
        suppressLayout(z4);
    }

    public void setLayoutManager(AbstractC0519J abstractC0519J) {
        RecyclerView recyclerView;
        C0553v c0553v;
        if (abstractC0519J == this.f4833q) {
            return;
        }
        boolean z4 = abstractC0519J instanceof LinearLayoutManager;
        this.f4830o1 = this.f4830o1 && z4;
        this.f4832p1 = this.f4832p1 && z4;
        setScrollState(0);
        a0 a0Var = this.f4819j0;
        RecyclerView recyclerView2 = a0Var.f7121j;
        recyclerView2.removeCallbacks(a0Var);
        a0Var.f.abortAnimation();
        AbstractC0808b.o(recyclerView2, 0.0f);
        AbstractC0519J abstractC0519J2 = this.f4833q;
        if (abstractC0519J2 != null && (c0553v = abstractC0519J2.f7066e) != null) {
            c0553v.i();
        }
        AbstractC0519J abstractC0519J3 = this.f4833q;
        C0525P c0525p = this.f;
        if (abstractC0519J3 != null) {
            AbstractC0515F abstractC0515F = this.f4767Q;
            if (abstractC0515F != null) {
                abstractC0515F.e();
            }
            this.f4833q.h0(c0525p);
            this.f4833q.i0(c0525p);
            c0525p.f7086a.clear();
            c0525p.f();
            if (this.f4846v) {
                AbstractC0519J abstractC0519J4 = this.f4833q;
                abstractC0519J4.f7067g = false;
                abstractC0519J4.Q(this);
            }
            this.f4833q.u0(null);
            this.f4833q = null;
        } else {
            c0525p.f7086a.clear();
            c0525p.f();
        }
        h hVar = this.f4814i;
        ((C0534c) hVar.f262d).g();
        ArrayList arrayList = (ArrayList) hVar.f263e;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((C0556y) hVar.f261c).f7319a;
            if (size < 0) {
                break;
            }
            b0 b0VarV = V((View) arrayList.get(size));
            if (b0VarV != null) {
                int i5 = b0VarV.f7141p;
                if (recyclerView.a0()) {
                    b0VarV.f7142q = i5;
                    recyclerView.f4800d2.add(b0VarV);
                } else {
                    WeakHashMap weakHashMap = P.f1421a;
                    b0VarV.f7128a.setImportantForAccessibility(i5);
                }
                b0VarV.f7141p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = recyclerView.getChildAt(i6);
            recyclerView.w(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f4833q = abstractC0519J;
        if (abstractC0519J != null) {
            if (abstractC0519J.f7063b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(abstractC0519J);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(f.b(abstractC0519J.f7063b, sb));
            }
            abstractC0519J.u0(this);
            if (this.f4846v) {
                AbstractC0519J abstractC0519J5 = this.f4833q;
                abstractC0519J5.f7067g = true;
                abstractC0519J5.P(this);
            }
        }
        c0525p.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        C0056m scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f1474d) {
            WeakHashMap weakHashMap = P.f1421a;
            H.z(scrollingChildHelper.f1473c);
        }
        scrollingChildHelper.f1474d = z4;
    }

    public void setOnFlingListener(AbstractC0521L abstractC0521L) {
        this.f4799d0 = abstractC0521L;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0522M abstractC0522M) {
        this.n0 = abstractC0522M;
    }

    public void setPreserveFocusAfterLayout(boolean z4) {
        this.f4815i0 = z4;
    }

    public void setRecycledViewPool(C0524O c0524o) {
        C0525P c0525p = this.f;
        RecyclerView recyclerView = c0525p.f7092h;
        c0525p.e(recyclerView.f4831p, false);
        if (c0525p.f7091g != null) {
            r1.f7084b--;
        }
        c0525p.f7091g = c0524o;
        if (c0524o != null && recyclerView.getAdapter() != null) {
            c0525p.f7091g.f7084b++;
        }
        c0525p.d();
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC0526Q interfaceC0526Q) {
    }

    @Override // android.view.View
    public void setScrollBarStyle(int i5) {
        super.setScrollBarStyle(i5);
    }

    public void setScrollState(int i5) {
        C0553v c0553v;
        if (i5 == this.f4770R) {
            return;
        }
        Log.d("SeslRecyclerView", "setting scroll state to " + i5 + IDMDatabaseInterface.IDM_SQL_FROM + this.f4770R);
        if (f4720m2) {
            Log.d("SeslRecyclerView", "setting scroll state to " + i5 + IDMDatabaseInterface.IDM_SQL_FROM + this.f4770R, new Exception());
        }
        this.f4770R = i5;
        if (i5 != 2) {
            a0 a0Var = this.f4819j0;
            RecyclerView recyclerView = a0Var.f7121j;
            recyclerView.removeCallbacks(a0Var);
            a0Var.f.abortAnimation();
            AbstractC0808b.o(recyclerView, 0.0f);
            AbstractC0519J abstractC0519J = this.f4833q;
            if (abstractC0519J != null && (c0553v = abstractC0519J.f7066e) != null) {
                c0553v.i();
            }
        }
        AbstractC0519J abstractC0519J2 = this.f4833q;
        if (abstractC0519J2 != null) {
            abstractC0519J2.f0(i5);
        }
        AbstractC0522M abstractC0522M = this.n0;
        if (abstractC0522M != null) {
            abstractC0522M.a(this, i5);
        }
        ArrayList arrayList = this.o0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0522M) this.o0.get(size)).a(this, i5);
            }
        }
        if (i5 == 1) {
            this.A0 = false;
        }
    }

    public void setScrollingTouchSlop(int i5) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        Log.d("SeslRecyclerView", "setScrollingTouchSlop(): slopConstant[" + i5 + "]");
        if (i5 != 0) {
            if (i5 == 1) {
                this.f4796c0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("SeslRecyclerView", "setScrollingTouchSlop(): bad argument constant " + i5 + "; using default value");
        }
        this.f4796c0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(Z z4) {
        this.f.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i5) {
        return getScrollingChildHelper().g(i5, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z4) {
        C0553v c0553v;
        if (z4 != this.f4726A) {
            n("Do not suppressLayout in layout or scroll");
            if (!z4) {
                this.f4726A = false;
                if (this.f4858z && this.f4833q != null && this.f4831p != null) {
                    requestLayout();
                }
                this.f4858z = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f4726A = true;
            this.f4728B = true;
            setScrollState(0);
            a0 a0Var = this.f4819j0;
            RecyclerView recyclerView = a0Var.f7121j;
            recyclerView.removeCallbacks(a0Var);
            a0Var.f.abortAnimation();
            AbstractC0808b.o(recyclerView, 0.0f);
            AbstractC0519J abstractC0519J = this.f4833q;
            if (abstractC0519J == null || (c0553v = abstractC0519J.f7066e) == null) {
                return;
            }
            c0553v.i();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t0(int r20, int r21, android.view.MotionEvent r22, int r23) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.t0(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void u() {
        if (!this.f4852x || this.f4741G) {
            Trace.beginSection("RV FullInvalidate");
            x();
            Trace.endSection();
            return;
        }
        if (this.f4810h.g()) {
            C0533b c0533b = this.f4810h;
            int i5 = c0533b.f;
            if ((i5 & 4) == 0 || (i5 & 11) != 0) {
                if (c0533b.g()) {
                    Trace.beginSection("RV FullInvalidate");
                    x();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            B0();
            h0();
            this.f4810h.j();
            if (!this.f4858z) {
                int iG = this.f4814i.g();
                int i6 = 0;
                while (true) {
                    if (i6 < iG) {
                        b0 b0VarV = V(this.f4814i.f(i6));
                        if (b0VarV != null && !b0VarV.p() && b0VarV.l()) {
                            x();
                            break;
                        }
                        i6++;
                    } else {
                        this.f4810h.b();
                        break;
                    }
                }
            }
            D0(true);
            i0(true);
            Trace.endSection();
        }
    }

    public final void u0(int[] iArr, int i5, int i6) {
        int iP0;
        b0 b0Var;
        B0();
        h0();
        Trace.beginSection("RV Scroll");
        X x4 = this.m0;
        H(x4);
        C0525P c0525p = this.f;
        int iN0 = i5 != 0 ? this.f4833q.n0(i5, c0525p, x4) : 0;
        if (i6 != 0) {
            iP0 = this.f4833q.p0(i6, c0525p, x4);
            setupGoToTop(1);
        } else {
            iP0 = 0;
        }
        Trace.endSection();
        int iG = this.f4814i.g();
        for (int i7 = 0; i7 < iG; i7++) {
            View viewF = this.f4814i.f(i7);
            b0 b0VarU = U(viewF);
            if (b0VarU != null && (b0Var = b0VarU.f7135i) != null) {
                int left = viewF.getLeft();
                int top = viewF.getTop();
                View view = b0Var.f7128a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        i0(true);
        D0(false);
        if (iArr != null) {
            iArr[0] = iN0;
            iArr[1] = iP0;
        }
    }

    public final void v(int i5, int i6) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = P.f1421a;
        setMeasuredDimension(AbstractC0519J.g(i5, paddingRight, getMinimumWidth()), AbstractC0519J.g(i6, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void v0(int i5) {
        C0553v c0553v;
        if (this.f4726A) {
            return;
        }
        setScrollState(0);
        a0 a0Var = this.f4819j0;
        RecyclerView recyclerView = a0Var.f7121j;
        recyclerView.removeCallbacks(a0Var);
        a0Var.f.abortAnimation();
        AbstractC0808b.o(recyclerView, 0.0f);
        AbstractC0519J abstractC0519J = this.f4833q;
        if (abstractC0519J != null && (c0553v = abstractC0519J.f7066e) != null) {
            c0553v.i();
        }
        AbstractC0519J abstractC0519J2 = this.f4833q;
        if (abstractC0519J2 == null) {
            Log.e("SeslRecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0519J2.o0(i5);
            awakenScrollBars();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == null || super.verifyDrawable(drawable);
    }

    public final void w(View view) {
        V(view);
        ArrayList arrayList = this.f4739F;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((g) this.f4739F.get(size)).getClass();
            }
        }
    }

    public final boolean w0(int i5, int i6, int i7, int i8, int[] iArr, int i9, int[] iArr2) {
        return getScrollingChildHelper().d(i5, i6, i7, i8, iArr, i9, iArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03e3  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [j0.b0] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x() {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.x():void");
    }

    public final boolean x0(EdgeEffect edgeEffect, int i5, int i6) {
        if (i5 > 0) {
            return true;
        }
        float fT = J2.b.t(edgeEffect) * i6;
        float fAbs = Math.abs(-i5) * 0.35f;
        float f = this.f4798d * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d5 = f4721o2;
        return ((float) (Math.exp((d5 / (d5 - 1.0d)) * dLog) * ((double) f))) < fT;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y() {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.y():void");
    }

    public final void y0(MotionEvent motionEvent, int i5) {
        AbstractC0808b.n(this, motionEvent.getToolType(0), i5 == 20001 ? null : PointerIcon.getSystemIcon(this.f4859z0, i5));
    }

    public final void z() {
        B0();
        h0();
        X x4 = this.m0;
        x4.a(6);
        this.f4810h.c();
        x4.f7104e = this.f4831p.a();
        x4.f7102c = 0;
        if (this.f4807g != null) {
            AbstractC0510A abstractC0510A = this.f4831p;
            int iC = Q0.c(abstractC0510A.f7052c);
            if (iC == 1 ? abstractC0510A.a() > 0 : iC != 2) {
                Parcelable parcelable = this.f4807g.f;
                if (parcelable != null) {
                    this.f4833q.d0(parcelable);
                }
                this.f4807g = null;
            }
        }
        x4.f7105g = false;
        this.f4833q.b0(this.f, x4);
        x4.f = false;
        x4.f7108j = x4.f7108j && this.f4767Q != null;
        x4.f7103d = 4;
        i0(true);
        D0(false);
    }

    public final void z0(int i5, boolean z4, int i6) {
        AbstractC0519J abstractC0519J = this.f4833q;
        if (abstractC0519J == null) {
            Log.e("SeslRecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4726A) {
            return;
        }
        if (!abstractC0519J.d()) {
            i5 = 0;
        }
        if (!this.f4833q.e()) {
            i6 = 0;
        }
        if (i5 == 0 && i6 == 0) {
            return;
        }
        if (z4) {
            int i7 = i5 != 0 ? 1 : 0;
            if (i6 != 0) {
                i7 |= 2;
            }
            C0(i7, 1);
        }
        this.f4819j0.c(i5, i6, Integer.MIN_VALUE, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0552  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RecyclerView(android.content.Context r19, android.util.AttributeSet r20, int r21) throws java.lang.NoSuchMethodException, android.content.res.Resources.NotFoundException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 1476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0519J abstractC0519J = this.f4833q;
        if (abstractC0519J != null) {
            return abstractC0519J.t(layoutParams);
        }
        throw new IllegalStateException(f.b(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
