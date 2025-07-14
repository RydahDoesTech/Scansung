package S;

import A1.h;
import J.P;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: v, reason: collision with root package name */
    public static final E0.c f2506v = new E0.c(1);

    /* renamed from: a, reason: collision with root package name */
    public int f2507a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2508b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f2510d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f2511e;
    public float[] f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f2512g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f2513h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f2514i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f2515j;

    /* renamed from: k, reason: collision with root package name */
    public int f2516k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f2517l;

    /* renamed from: m, reason: collision with root package name */
    public final float f2518m;
    public final float n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2519o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f2520p;

    /* renamed from: q, reason: collision with root package name */
    public final V1.a f2521q;

    /* renamed from: r, reason: collision with root package name */
    public View f2522r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2523s;

    /* renamed from: t, reason: collision with root package name */
    public final CoordinatorLayout f2524t;

    /* renamed from: c, reason: collision with root package name */
    public int f2509c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final h f2525u = new h(6, this);

    public d(Context context, CoordinatorLayout coordinatorLayout, V1.a aVar) {
        if (coordinatorLayout == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f2524t = coordinatorLayout;
        this.f2521q = aVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2519o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f2508b = viewConfiguration.getScaledTouchSlop();
        this.f2518m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2520p = new OverScroller(context, f2506v);
    }

    public final void a() {
        this.f2509c = -1;
        float[] fArr = this.f2510d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f2511e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.f2512g, 0.0f);
            Arrays.fill(this.f2513h, 0);
            Arrays.fill(this.f2514i, 0);
            Arrays.fill(this.f2515j, 0);
            this.f2516k = 0;
        }
        VelocityTracker velocityTracker = this.f2517l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2517l = null;
        }
    }

    public final void b(int i5, View view) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f2524t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f2522r = view;
        this.f2509c = i5;
        this.f2521q.c0(i5, view);
        n(1);
    }

    public final boolean c(View view, float f, float f5) {
        if (view == null) {
            return false;
        }
        V1.a aVar = this.f2521q;
        boolean z4 = aVar.R(view) > 0;
        boolean z5 = aVar.S() > 0;
        if (!z4 || !z5) {
            return z4 ? Math.abs(f) > ((float) this.f2508b) : z5 && Math.abs(f5) > ((float) this.f2508b);
        }
        float f6 = (f5 * f5) + (f * f);
        int i5 = this.f2508b;
        return f6 > ((float) (i5 * i5));
    }

    public final void d(int i5) {
        float[] fArr = this.f2510d;
        if (fArr != null) {
            int i6 = this.f2516k;
            int i7 = 1 << i5;
            if ((i6 & i7) != 0) {
                fArr[i5] = 0.0f;
                this.f2511e[i5] = 0.0f;
                this.f[i5] = 0.0f;
                this.f2512g[i5] = 0.0f;
                this.f2513h[i5] = 0;
                this.f2514i[i5] = 0;
                this.f2515j[i5] = 0;
                this.f2516k = (~i7) & i6;
            }
        }
    }

    public final int e(int i5, int i6, int i7) {
        if (i5 == 0) {
            return 0;
        }
        float width = this.f2524t.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i5) / r3) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i6);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i5) / i7) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.f2507a == 2) {
            OverScroller overScroller = this.f2520p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f2522r.getLeft();
            int top = currY - this.f2522r.getTop();
            if (left != 0) {
                View view = this.f2522r;
                WeakHashMap weakHashMap = P.f1421a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f2522r;
                WeakHashMap weakHashMap2 = P.f1421a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f2521q.e0(this.f2522r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f2524t.post(this.f2525u);
            }
        }
        return this.f2507a == 2;
    }

    public final View g(int i5, int i6) {
        CoordinatorLayout coordinatorLayout = this.f2524t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f2521q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && i6 >= childAt.getTop() && i6 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i5, int i6, int i7, int i8) {
        float f;
        float f5;
        float f6;
        float f7;
        int left = this.f2522r.getLeft();
        int top = this.f2522r.getTop();
        int i9 = i5 - left;
        int i10 = i6 - top;
        OverScroller overScroller = this.f2520p;
        int i11 = 0;
        if (i9 == 0 && i10 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f2522r;
        int i12 = (int) this.n;
        int i13 = (int) this.f2518m;
        int iAbs = Math.abs(i7);
        if (iAbs < i12) {
            i7 = 0;
        } else if (iAbs > i13) {
            i7 = i7 > 0 ? i13 : -i13;
        }
        int iAbs2 = Math.abs(i8);
        if (iAbs2 < i12) {
            i8 = i11;
        } else if (iAbs2 > i13) {
            if (i8 > 0) {
                i8 = i13;
            } else {
                i11 = -i13;
                i8 = i11;
            }
        }
        int iAbs3 = Math.abs(i9);
        int iAbs4 = Math.abs(i10);
        int iAbs5 = Math.abs(i7);
        int iAbs6 = Math.abs(i8);
        int i14 = iAbs5 + iAbs6;
        int i15 = iAbs3 + iAbs4;
        if (i7 != 0) {
            f = iAbs5;
            f5 = i14;
        } else {
            f = iAbs3;
            f5 = i15;
        }
        float f8 = f / f5;
        if (i8 != 0) {
            f6 = iAbs6;
            f7 = i14;
        } else {
            f6 = iAbs4;
            f7 = i15;
        }
        float f9 = f6 / f7;
        V1.a aVar = this.f2521q;
        overScroller.startScroll(left, top, i9, i10, (int) ((e(i10, i8, aVar.S()) * f9) + (e(i9, i7, aVar.R(view)) * f8)));
        n(2);
        return true;
    }

    public final boolean i(int i5) {
        if ((this.f2516k & (1 << i5)) != 0 && i5 != -1) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i5 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i5;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f2517l == null) {
            this.f2517l = VelocityTracker.obtain();
        }
        this.f2517l.addMovement(motionEvent);
        int i6 = 0;
        if (actionMasked == 0) {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewG = g((int) x4, (int) y4);
            l(x4, y4, pointerId);
            q(pointerId, viewG);
            int i7 = this.f2513h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f2507a == 1) {
                k();
            }
            a();
            return;
        }
        V1.a aVar = this.f2521q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f2507a == 1) {
                    this.f2523s = true;
                    aVar.f0(this.f2522r, 0.0f, 0.0f);
                    this.f2523s = false;
                    if (this.f2507a == 1) {
                        n(0);
                    }
                }
                a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x5 = motionEvent.getX(actionIndex);
                float y5 = motionEvent.getY(actionIndex);
                l(x5, y5, pointerId2);
                if (this.f2507a == 0) {
                    q(pointerId2, g((int) x5, (int) y5));
                    int i8 = this.f2513h[pointerId2];
                    return;
                }
                int i9 = (int) x5;
                int i10 = (int) y5;
                View view = this.f2522r;
                if (view != null) {
                    i6 = (i9 < view.getLeft() || i9 >= view.getRight() || i10 < view.getTop() || i10 >= view.getBottom()) ? 0 : 1;
                }
                if (i6 != 0) {
                    q(pointerId2, this.f2522r);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f2507a == 1 && pointerId3 == this.f2509c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i6 >= pointerCount) {
                        i5 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i6);
                    if (pointerId4 != this.f2509c) {
                        View viewG2 = g((int) motionEvent.getX(i6), (int) motionEvent.getY(i6));
                        View view2 = this.f2522r;
                        if (viewG2 == view2 && q(pointerId4, view2)) {
                            i5 = this.f2509c;
                            break;
                        }
                    }
                    i6++;
                }
                if (i5 == -1) {
                    k();
                }
            }
            d(pointerId3);
            return;
        }
        if (this.f2507a == 1) {
            if (i(this.f2509c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f2509c);
                float x6 = motionEvent.getX(iFindPointerIndex);
                float y6 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f;
                int i11 = this.f2509c;
                int i12 = (int) (x6 - fArr[i11]);
                int i13 = (int) (y6 - this.f2512g[i11]);
                int left = this.f2522r.getLeft() + i12;
                int top = this.f2522r.getTop() + i13;
                int left2 = this.f2522r.getLeft();
                int top2 = this.f2522r.getTop();
                if (i12 != 0) {
                    left = aVar.h(left, this.f2522r);
                    WeakHashMap weakHashMap = P.f1421a;
                    this.f2522r.offsetLeftAndRight(left - left2);
                }
                if (i13 != 0) {
                    top = aVar.i(top, this.f2522r);
                    WeakHashMap weakHashMap2 = P.f1421a;
                    this.f2522r.offsetTopAndBottom(top - top2);
                }
                if (i12 != 0 || i13 != 0) {
                    aVar.e0(this.f2522r, left, top);
                }
                m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i6 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i6);
            if (i(pointerId5)) {
                float x7 = motionEvent.getX(i6);
                float y7 = motionEvent.getY(i6);
                float f = x7 - this.f2510d[pointerId5];
                float f5 = y7 - this.f2511e[pointerId5];
                Math.abs(f);
                Math.abs(f5);
                int i14 = this.f2513h[pointerId5];
                Math.abs(f5);
                Math.abs(f);
                int i15 = this.f2513h[pointerId5];
                Math.abs(f);
                Math.abs(f5);
                int i16 = this.f2513h[pointerId5];
                Math.abs(f5);
                Math.abs(f);
                int i17 = this.f2513h[pointerId5];
                if (this.f2507a != 1) {
                    View viewG3 = g((int) x7, (int) y7);
                    if (c(viewG3, f, f5) && q(pointerId5, viewG3)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i6++;
        }
        m(motionEvent);
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f2517l;
        float f = this.f2518m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f2517l.getXVelocity(this.f2509c);
        float f5 = this.n;
        float fAbs = Math.abs(xVelocity);
        float f6 = 0.0f;
        if (fAbs < f5) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f2517l.getYVelocity(this.f2509c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 >= f5) {
            if (fAbs2 > f) {
                if (yVelocity <= 0.0f) {
                    f = -f;
                }
                f6 = f;
            } else {
                f6 = yVelocity;
            }
        }
        this.f2523s = true;
        this.f2521q.f0(this.f2522r, xVelocity, f6);
        this.f2523s = false;
        if (this.f2507a == 1) {
            n(0);
        }
    }

    public final void l(float f, float f5, int i5) {
        float[] fArr = this.f2510d;
        if (fArr == null || fArr.length <= i5) {
            int i6 = i5 + 1;
            float[] fArr2 = new float[i6];
            float[] fArr3 = new float[i6];
            float[] fArr4 = new float[i6];
            float[] fArr5 = new float[i6];
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            int[] iArr3 = new int[i6];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f2511e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f2512g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f2513h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f2514i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f2515j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f2510d = fArr2;
            this.f2511e = fArr3;
            this.f = fArr4;
            this.f2512g = fArr5;
            this.f2513h = iArr;
            this.f2514i = iArr2;
            this.f2515j = iArr3;
        }
        float[] fArr9 = this.f2510d;
        this.f[i5] = f;
        fArr9[i5] = f;
        float[] fArr10 = this.f2511e;
        this.f2512g[i5] = f5;
        fArr10[i5] = f5;
        int[] iArr7 = this.f2513h;
        int i7 = (int) f;
        int i8 = (int) f5;
        CoordinatorLayout coordinatorLayout = this.f2524t;
        int left = coordinatorLayout.getLeft();
        int i9 = this.f2519o;
        int i10 = i7 < left + i9 ? 1 : 0;
        if (i8 < coordinatorLayout.getTop() + i9) {
            i10 |= 4;
        }
        if (i7 > coordinatorLayout.getRight() - i9) {
            i10 |= 2;
        }
        if (i8 > coordinatorLayout.getBottom() - i9) {
            i10 |= 8;
        }
        iArr7[i5] = i10;
        this.f2516k |= 1 << i5;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i5 = 0; i5 < pointerCount; i5++) {
            int pointerId = motionEvent.getPointerId(i5);
            if (i(pointerId)) {
                float x4 = motionEvent.getX(i5);
                float y4 = motionEvent.getY(i5);
                this.f[pointerId] = x4;
                this.f2512g[pointerId] = y4;
            }
        }
    }

    public final void n(int i5) {
        this.f2524t.removeCallbacks(this.f2525u);
        if (this.f2507a != i5) {
            this.f2507a = i5;
            this.f2521q.d0(i5);
            if (this.f2507a == 0) {
                this.f2522r = null;
            }
        }
    }

    public final boolean o(int i5, int i6) {
        if (this.f2523s) {
            return h(i5, i6, (int) this.f2517l.getXVelocity(this.f2509c), (int) this.f2517l.getYVelocity(this.f2509c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S.d.p(android.view.MotionEvent):boolean");
    }

    public final boolean q(int i5, View view) {
        if (view == this.f2522r && this.f2509c == i5) {
            return true;
        }
        if (view == null || !this.f2521q.o0(i5, view)) {
            return false;
        }
        this.f2509c = i5;
        b(i5, view);
        return true;
    }
}
