package j0;

import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.p000firebaseauthapi.b5;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.WeakHashMap;
import r0.AbstractC0808b;

/* loaded from: classes.dex */
public final class a0 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f7116d;

    /* renamed from: e, reason: collision with root package name */
    public int f7117e;
    public OverScroller f;

    /* renamed from: g, reason: collision with root package name */
    public Interpolator f7118g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7119h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7120i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f7121j;

    public a0(RecyclerView recyclerView) {
        this.f7121j = recyclerView;
        E0.c cVar = RecyclerView.f4725u2;
        this.f7118g = cVar;
        this.f7119h = false;
        this.f7120i = false;
        this.f = new OverScroller(recyclerView.getContext(), cVar);
    }

    public final void a(int i5, int i6) {
        RecyclerView recyclerView = this.f7121j;
        recyclerView.setScrollState(2);
        this.f7117e = 0;
        this.f7116d = 0;
        Interpolator interpolator = this.f7118g;
        E0.c cVar = RecyclerView.f4725u2;
        if (interpolator != cVar) {
            this.f7118g = cVar;
            this.f = new OverScroller(recyclerView.getContext(), cVar);
        }
        OverScroller overScroller = this.f;
        boolean z4 = recyclerView.f4732C0;
        float f = recyclerView.f4735D0;
        Class cls = Integer.TYPE;
        Method methodR = J2.b.r(OverScroller.class, "hidden_fling", cls, cls, Boolean.TYPE, Float.TYPE);
        if (methodR != null) {
            J2.b.E(overScroller, methodR, Integer.valueOf(i5), Integer.valueOf(i6), Boolean.valueOf(z4), Float.valueOf(f));
        } else {
            overScroller.fling(0, 0, i5, i6, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        b();
    }

    public final void b() {
        if (this.f7119h) {
            this.f7120i = true;
            return;
        }
        RecyclerView recyclerView = this.f7121j;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = J.P.f1421a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i5, int i6, int i7, BaseInterpolator baseInterpolator) {
        int iMin;
        int iRound;
        RecyclerView recyclerView = this.f7121j;
        if (i7 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i5);
            int iAbs2 = Math.abs(i6);
            boolean z4 = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt(0);
            int iSqrt2 = (int) Math.sqrt((i6 * i6) + (i5 * i5));
            int width = z4 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i8 = width / 2;
            float f = width;
            float f5 = i8;
            float fSin = (((float) Math.sin((Math.min(1.0f, (iSqrt2 * 1.0f) / f) - 0.5f) * 0.47123894f)) * f5) + f5;
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fSin / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z4) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f) + 1.0f) * 300.0f);
            }
            iMin = Math.min(iRound, 2000);
        } else {
            iMin = i7;
        }
        Interpolator interpolator = baseInterpolator == null ? RecyclerView.f4725u2 : baseInterpolator;
        recyclerView.C0(i5 != 0 ? 2 : 1, 1);
        if (!this.f7121j.A(i5, i6, null, null, 1)) {
            if (this.f7118g != interpolator) {
                this.f7118g = interpolator;
                this.f = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.f7117e = 0;
            this.f7116d = 0;
            recyclerView.setScrollState(2);
            this.f.startScroll(0, 0, i5, i6, iMin);
            b();
        }
        recyclerView.m(i6);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i5;
        int i6;
        int i7;
        int i8;
        RecyclerView recyclerView = this.f7121j;
        if (recyclerView.f4833q == null) {
            recyclerView.removeCallbacks(this);
            this.f.abortAnimation();
            AbstractC0808b.o(recyclerView, 0.0f);
            return;
        }
        this.f7120i = false;
        this.f7119h = true;
        recyclerView.u();
        OverScroller overScroller = this.f;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i9 = currX - this.f7116d;
            int i10 = currY - this.f7117e;
            this.f7116d = currX;
            this.f7117e = currY;
            int iT = RecyclerView.t(i9, recyclerView.f4755L, recyclerView.f4760N, recyclerView.getWidth());
            int iT2 = RecyclerView.t(i10, recyclerView.f4758M, recyclerView.f4762O, recyclerView.getHeight());
            int[] iArr = recyclerView.f4759M0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean zA = recyclerView.A(iT, iT2, iArr, null, 1);
            int[] iArr2 = recyclerView.f4759M0;
            if (zA) {
                iT -= iArr2[0];
                int i11 = iArr2[1];
                iT2 -= i11;
                recyclerView.m(i11);
            } else {
                recyclerView.m(iT2);
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.s(iT, iT2);
            }
            if (recyclerView.f4831p != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.u0(iArr2, iT, iT2);
                int i12 = iArr2[0];
                int i13 = iArr2[1];
                int i14 = iT - i12;
                int i15 = iT2 - i13;
                C0553v c0553v = recyclerView.f4833q.f7066e;
                if (c0553v != null && !c0553v.f7303d && c0553v.f7304e) {
                    int iB = recyclerView.m0.b();
                    if (iB == 0) {
                        c0553v.i();
                    } else if (c0553v.f7300a >= iB) {
                        c0553v.f7300a = iB - 1;
                        c0553v.g(i12, i13);
                    } else {
                        c0553v.g(i12, i13);
                    }
                }
                i8 = i12;
                i5 = i14;
                i6 = i15;
                i7 = i13;
            } else {
                i5 = iT;
                i6 = iT2;
                i7 = 0;
                i8 = 0;
            }
            if (!recyclerView.f4838s.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f4759M0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i16 = i7;
            boolean zW0 = recyclerView.w0(i8, i7, i5, i6, null, 1, iArr3);
            int[] iArr4 = recyclerView.f4850w0;
            if (zW0) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            if (iArr4[0] < 0 || iArr4[1] < 0) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            int i17 = i5 - iArr2[0];
            int i18 = i6 - iArr2[1];
            if (i8 != 0 || i16 != 0) {
                recyclerView.B(i8, i16);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z4 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i17 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i18 != 0));
            C0553v c0553v2 = recyclerView.f4833q.f7066e;
            if ((c0553v2 == null || !c0553v2.f7303d) && z4) {
                if (recyclerView.getOverScrollMode() != 2 && !recyclerView.A0) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i19 = i17 < 0 ? -currVelocity : i17 > 0 ? currVelocity : 0;
                    if (i18 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i18 <= 0) {
                        currVelocity = 0;
                    }
                    if (i19 < 0) {
                        recyclerView.D();
                        if (recyclerView.f4755L.isFinished()) {
                            recyclerView.f4755L.onAbsorb(-i19);
                        }
                    } else if (i19 > 0) {
                        recyclerView.E();
                        if (recyclerView.f4760N.isFinished()) {
                            recyclerView.f4760N.onAbsorb(i19);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.F();
                        if (recyclerView.f4758M.isFinished()) {
                            recyclerView.f4758M.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.C();
                        if (recyclerView.f4762O.isFinished()) {
                            recyclerView.f4762O.onAbsorb(currVelocity);
                        }
                    }
                    if (i19 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = J.P.f1421a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f4723r2) {
                    b5 b5Var = recyclerView.l0;
                    int[] iArr5 = (int[]) b5Var.f5441d;
                    if (iArr5 != null) {
                        Arrays.fill(iArr5, -1);
                    }
                    b5Var.f5440c = 0;
                }
            } else {
                b();
                RunnableC0546o runnableC0546o = recyclerView.k0;
                if (runnableC0546o != null) {
                    runnableC0546o.a(recyclerView, i8, i16);
                }
            }
            AbstractC0808b.o(recyclerView, Math.abs(overScroller.getCurrVelocity()));
        }
        C0553v c0553v3 = recyclerView.f4833q.f7066e;
        if (c0553v3 != null && c0553v3.f7303d) {
            c0553v3.g(0, 0);
        }
        this.f7119h = false;
        if (!this.f7120i) {
            recyclerView.setScrollState(0);
            recyclerView.E0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = J.P.f1421a;
            recyclerView.postOnAnimation(this);
        }
    }
}
