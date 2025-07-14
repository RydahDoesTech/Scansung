package j0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import com.samsung.android.knox.custom.CustomDeviceManager;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: j0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0544m extends AbstractC0516G {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f7227C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f7228D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f7229A;

    /* renamed from: B, reason: collision with root package name */
    public final A1.h f7230B;

    /* renamed from: a, reason: collision with root package name */
    public final int f7231a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7232b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f7233c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f7234d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7235e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f7236g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f7237h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7238i;

    /* renamed from: j, reason: collision with root package name */
    public final int f7239j;

    /* renamed from: k, reason: collision with root package name */
    public int f7240k;

    /* renamed from: l, reason: collision with root package name */
    public int f7241l;

    /* renamed from: m, reason: collision with root package name */
    public float f7242m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public int f7243o;

    /* renamed from: p, reason: collision with root package name */
    public float f7244p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f7247s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f7254z;

    /* renamed from: q, reason: collision with root package name */
    public int f7245q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f7246r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7248t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7249u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f7250v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f7251w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f7252x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f7253y = new int[2];

    public C0544m(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i5, int i6, int i7) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7254z = valueAnimatorOfFloat;
        this.f7229A = 0;
        A1.h hVar = new A1.h(15, this);
        this.f7230B = hVar;
        C0543l c0543l = new C0543l(this);
        this.f7233c = stateListDrawable;
        this.f7234d = drawable;
        this.f7236g = stateListDrawable2;
        this.f7237h = drawable2;
        this.f7235e = Math.max(i5, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i5, drawable.getIntrinsicWidth());
        this.f7238i = Math.max(i5, stateListDrawable2.getIntrinsicWidth());
        this.f7239j = Math.max(i5, drawable2.getIntrinsicWidth());
        this.f7231a = i6;
        this.f7232b = i7;
        stateListDrawable.setAlpha(CustomDeviceManager.CALL_SCREEN_ALL);
        drawable.setAlpha(CustomDeviceManager.CALL_SCREEN_ALL);
        valueAnimatorOfFloat.addListener(new B0.i(this));
        valueAnimatorOfFloat.addUpdateListener(new A1.b(2, this));
        RecyclerView recyclerView2 = this.f7247s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            AbstractC0519J abstractC0519J = recyclerView2.f4833q;
            if (abstractC0519J != null) {
                abstractC0519J.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f4838s;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.d0();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f7247s;
            recyclerView3.f4841t.remove(this);
            if (recyclerView3.f4843u == this) {
                recyclerView3.f4843u = null;
            }
            ArrayList arrayList2 = this.f7247s.o0;
            if (arrayList2 != null) {
                arrayList2.remove(c0543l);
            }
            this.f7247s.removeCallbacks(hVar);
        }
        this.f7247s = recyclerView;
        if (recyclerView != null) {
            recyclerView.j(this);
            this.f7247s.f4841t.add(this);
            this.f7247s.k(c0543l);
        }
    }

    public static int f(float f, float f5, int[] iArr, int i5, int i6, int i7) {
        int i8 = iArr[1] - iArr[0];
        if (i8 == 0) {
            return 0;
        }
        int i9 = i5 - i7;
        int i10 = (int) (((f5 - f) / i8) * i9);
        int i11 = i6 + i10;
        if (i11 >= i9 || i11 < 0) {
            return 0;
        }
        return i10;
    }

    @Override // j0.AbstractC0516G
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i5 = this.f7245q;
        RecyclerView recyclerView2 = this.f7247s;
        if (i5 != recyclerView2.getWidth() || this.f7246r != recyclerView2.getHeight()) {
            this.f7245q = recyclerView2.getWidth();
            this.f7246r = recyclerView2.getHeight();
            g(0);
            return;
        }
        if (this.f7229A != 0) {
            if (this.f7248t) {
                int i6 = this.f7245q;
                int i7 = this.f7235e;
                int i8 = i6 - i7;
                int i9 = this.f7241l;
                int i10 = this.f7240k;
                int i11 = i9 - (i10 / 2);
                StateListDrawable stateListDrawable = this.f7233c;
                stateListDrawable.setBounds(0, 0, i7, i10);
                int i12 = this.f7246r;
                int i13 = this.f;
                Drawable drawable = this.f7234d;
                drawable.setBounds(0, 0, i13, i12);
                WeakHashMap weakHashMap = J.P.f1421a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i7, i11);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i7, -i11);
                } else {
                    canvas.translate(i8, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i11);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i8, -i11);
                }
            }
            if (this.f7249u) {
                int i14 = this.f7246r;
                int i15 = this.f7238i;
                int i16 = i14 - i15;
                int i17 = this.f7243o;
                int i18 = this.n;
                int i19 = i17 - (i18 / 2);
                StateListDrawable stateListDrawable2 = this.f7236g;
                stateListDrawable2.setBounds(0, 0, i18, i15);
                int i20 = this.f7245q;
                int i21 = this.f7239j;
                Drawable drawable2 = this.f7237h;
                drawable2.setBounds(0, 0, i20, i21);
                canvas.translate(0.0f, i16);
                drawable2.draw(canvas);
                canvas.translate(i19, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i19, -i16);
            }
        }
    }

    public final boolean d(float f, float f5) {
        if (f5 >= this.f7246r - this.f7238i) {
            int i5 = this.f7243o;
            int i6 = this.n;
            if (f >= i5 - (i6 / 2) && f <= (i6 / 2) + i5) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(float f, float f5) {
        RecyclerView recyclerView = this.f7247s;
        WeakHashMap weakHashMap = J.P.f1421a;
        boolean z4 = recyclerView.getLayoutDirection() == 1;
        int i5 = this.f7235e;
        if (z4) {
            if (f > i5) {
                return false;
            }
        } else if (f < this.f7245q - i5) {
            return false;
        }
        int i6 = this.f7241l;
        int i7 = this.f7240k / 2;
        return f5 >= ((float) (i6 - i7)) && f5 <= ((float) (i7 + i6));
    }

    public final void g(int i5) {
        A1.h hVar = this.f7230B;
        StateListDrawable stateListDrawable = this.f7233c;
        if (i5 == 2 && this.f7250v != 2) {
            stateListDrawable.setState(f7227C);
            this.f7247s.removeCallbacks(hVar);
        }
        if (i5 == 0) {
            this.f7247s.invalidate();
        } else {
            h();
        }
        if (this.f7250v == 2 && i5 != 2) {
            stateListDrawable.setState(f7228D);
            this.f7247s.removeCallbacks(hVar);
            this.f7247s.postDelayed(hVar, 1200);
        } else if (i5 == 1) {
            this.f7247s.removeCallbacks(hVar);
            this.f7247s.postDelayed(hVar, 1500);
        }
        this.f7250v = i5;
    }

    public final void h() {
        int i5 = this.f7229A;
        ValueAnimator valueAnimator = this.f7254z;
        if (i5 != 0) {
            if (i5 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f7229A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
