package androidx.appcompat.widget;

import J.P;
import Y0.j;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewDebug;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import android.widget.RemoteViews;
import c.AbstractC0220a;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import i.e;
import java.lang.reflect.Field;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.WeakHashMap;
import k.AbstractC0622g0;
import k.C0623g1;
import k.C0632j1;
import k.C0635k1;
import k.C0638l1;
import k.C0641m1;
import k.M1;
import k.RunnableC0626h1;
import k.n1;
import z.AbstractC0938a;

@RemoteViews.RemoteView
/* loaded from: classes.dex */
public class SeslProgressBar extends View {

    /* renamed from: f0, reason: collision with root package name */
    public static final DecelerateInterpolator f3378f0 = new DecelerateInterpolator();

    /* renamed from: A, reason: collision with root package name */
    public boolean f3379A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f3380B;

    /* renamed from: C, reason: collision with root package name */
    public Transformation f3381C;

    /* renamed from: D, reason: collision with root package name */
    public AlphaAnimation f3382D;
    public boolean E;

    /* renamed from: F, reason: collision with root package name */
    public Drawable f3383F;

    /* renamed from: G, reason: collision with root package name */
    public Drawable f3384G;

    /* renamed from: H, reason: collision with root package name */
    public Drawable f3385H;

    /* renamed from: I, reason: collision with root package name */
    public C0638l1 f3386I;

    /* renamed from: J, reason: collision with root package name */
    public int f3387J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f3388K;

    /* renamed from: L, reason: collision with root package name */
    public Interpolator f3389L;

    /* renamed from: M, reason: collision with root package name */
    public RunnableC0626h1 f3390M;

    /* renamed from: N, reason: collision with root package name */
    public final long f3391N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f3392O;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f3393Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f3394R;

    /* renamed from: T, reason: collision with root package name */
    public boolean f3395T;

    /* renamed from: U, reason: collision with root package name */
    public float f3396U;

    /* renamed from: V, reason: collision with root package name */
    public final boolean f3397V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f3398W;

    /* renamed from: a0, reason: collision with root package name */
    public final ArrayList f3399a0;

    /* renamed from: b0, reason: collision with root package name */
    public RunnableC0626h1 f3400b0;

    /* renamed from: c0, reason: collision with root package name */
    public NumberFormat f3401c0;

    /* renamed from: d, reason: collision with root package name */
    public int f3402d;

    /* renamed from: d0, reason: collision with root package name */
    public Locale f3403d0;

    /* renamed from: e, reason: collision with root package name */
    public final float f3404e;

    /* renamed from: e0, reason: collision with root package name */
    public final C0623g1 f3405e0;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f3406g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3407h;

    /* renamed from: i, reason: collision with root package name */
    public final Drawable f3408i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f3409j;

    /* renamed from: k, reason: collision with root package name */
    public final Drawable f3410k;

    /* renamed from: l, reason: collision with root package name */
    public final Drawable f3411l;

    /* renamed from: m, reason: collision with root package name */
    public final Drawable f3412m;
    public C0635k1 n;

    /* renamed from: o, reason: collision with root package name */
    public int f3413o;

    /* renamed from: p, reason: collision with root package name */
    public int f3414p;

    /* renamed from: q, reason: collision with root package name */
    public int f3415q;

    /* renamed from: r, reason: collision with root package name */
    public int f3416r;

    /* renamed from: s, reason: collision with root package name */
    public int f3417s;

    /* renamed from: t, reason: collision with root package name */
    public int f3418t;

    /* renamed from: u, reason: collision with root package name */
    public int f3419u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3420v;

    /* renamed from: w, reason: collision with root package name */
    public int f3421w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3422x;

    /* renamed from: y, reason: collision with root package name */
    public final int f3423y;

    /* renamed from: z, reason: collision with root package name */
    public final int f3424z;

    public SeslProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.progressBarStyle);
    }

    public static boolean i(Drawable drawable) {
        if (!(drawable instanceof LayerDrawable)) {
            return !(drawable instanceof StateListDrawable) && (drawable instanceof BitmapDrawable);
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        for (int i5 = 0; i5 < numberOfLayers; i5++) {
            if (i(layerDrawable.getDrawable(i5))) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        C0638l1 c0638l1;
        Drawable drawable = this.f3383F;
        if (drawable == null || (c0638l1 = this.f3386I) == null) {
            return;
        }
        if (c0638l1.f7728c || c0638l1.f7729d) {
            Drawable drawableMutate = drawable.mutate();
            this.f3383F = drawableMutate;
            if (c0638l1.f7728c) {
                C.a.h(drawableMutate, c0638l1.f7726a);
            }
            if (c0638l1.f7729d) {
                C.a.i(this.f3383F, c0638l1.f7727b);
            }
            if (this.f3383F.isStateful()) {
                this.f3383F.setState(getDrawableState());
            }
        }
    }

    public final void b() {
        Drawable drawableG;
        C0638l1 c0638l1 = this.f3386I;
        if ((c0638l1.f7731g || c0638l1.f7732h) && (drawableG = g(R.id.progress, true)) != null) {
            C0638l1 c0638l12 = this.f3386I;
            if (c0638l12.f7731g) {
                C.a.h(drawableG, c0638l12.f7730e);
            }
            C0638l1 c0638l13 = this.f3386I;
            if (c0638l13.f7732h) {
                C.a.i(drawableG, c0638l13.f);
            }
            if (drawableG.isStateful()) {
                drawableG.setState(getDrawableState());
            }
        }
    }

    public final void c() {
        Drawable drawableG;
        C0638l1 c0638l1 = this.f3386I;
        if ((c0638l1.f7735k || c0638l1.f7736l) && (drawableG = g(R.id.background, false)) != null) {
            C0638l1 c0638l12 = this.f3386I;
            if (c0638l12.f7735k) {
                C.a.h(drawableG, c0638l12.f7733i);
            }
            C0638l1 c0638l13 = this.f3386I;
            if (c0638l13.f7736l) {
                C.a.i(drawableG, c0638l13.f7734j);
            }
            if (drawableG.isStateful()) {
                drawableG.setState(getDrawableState());
            }
        }
    }

    public final void d() {
        Drawable drawableG;
        C0638l1 c0638l1 = this.f3386I;
        if ((c0638l1.f7738o || c0638l1.f7739p) && (drawableG = g(R.id.secondaryProgress, false)) != null) {
            C0638l1 c0638l12 = this.f3386I;
            if (c0638l12.f7738o) {
                C.a.h(drawableG, c0638l12.f7737m);
            }
            C0638l1 c0638l13 = this.f3386I;
            if (c0638l13.f7739p) {
                C.a.i(drawableG, c0638l13.n);
            }
            if (drawableG.isStateful()) {
                drawableG.setState(getDrawableState());
            }
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f, float f5) {
        super.drawableHotspotChanged(f, f5);
        Drawable drawable = this.f3384G;
        if (drawable != null) {
            C.a.e(drawable, f, f5);
        }
        Drawable drawable2 = this.f3383F;
        if (drawable2 != null) {
            C.a.e(drawable2, f, f5);
        }
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        u();
    }

    public final synchronized void e(int i5, int i6, boolean z4, boolean z5, boolean z6) {
        try {
            int i7 = this.f3421w;
            int i8 = this.f3419u;
            int i9 = i7 - i8;
            float f = i9 > 0 ? (i6 - i8) / i9 : 0.0f;
            float f5 = i9 > 0 ? (this.f3396U - i8) / i9 : 0.0f;
            boolean z7 = i5 == 16908301;
            Drawable drawable = this.f3385H;
            if (drawable != null) {
                int i10 = (int) (10000.0f * f);
                if (drawable instanceof LayerDrawable) {
                    Drawable drawableFindDrawableByLayerId = ((LayerDrawable) drawable).findDrawableByLayerId(i5);
                    if (drawableFindDrawableByLayerId != null && canResolveLayoutDirection()) {
                        WeakHashMap weakHashMap = P.f1421a;
                        C.b.b(drawableFindDrawableByLayerId, getLayoutDirection());
                    }
                    if (drawableFindDrawableByLayerId != null) {
                        drawable = drawableFindDrawableByLayerId;
                    }
                    drawable.setLevel(i10);
                } else if (drawable instanceof StateListDrawable) {
                } else {
                    drawable.setLevel(i10);
                }
            } else {
                invalidate();
            }
            if (z7 && z6) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, this.f3405e0, f5, f);
                objectAnimatorOfFloat.setAutoCancel(true);
                objectAnimatorOfFloat.setDuration(80L);
                objectAnimatorOfFloat.setInterpolator(f3378f0);
                objectAnimatorOfFloat.start();
            } else {
                o(i5, f);
            }
            if (z7 && z5) {
                j(f, z4, i6);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f(Canvas canvas) {
        Drawable drawable = this.f3385H;
        if (drawable != 0) {
            int iSave = canvas.save();
            if (this.f3402d != 3 && this.f3397V && M1.a(this)) {
                canvas.translate(getWidth() - getPaddingRight(), getPaddingTop());
                canvas.scale(-1.0f, 1.0f);
            } else {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            long drawingTime = getDrawingTime();
            if (this.E) {
                this.f3382D.getTransformation(drawingTime, this.f3381C);
                float alpha = this.f3381C.getAlpha();
                try {
                    this.f3393Q = true;
                    drawable.setLevel((int) (alpha * 10000.0f));
                    this.f3393Q = false;
                    WeakHashMap weakHashMap = P.f1421a;
                    postInvalidateOnAnimation();
                } catch (Throwable th) {
                    this.f3393Q = false;
                    throw th;
                }
            }
            drawable.draw(canvas);
            canvas.restoreToCount(iSave);
            if (this.f3392O && (drawable instanceof Animatable)) {
                ((Animatable) drawable).start();
                this.f3392O = false;
            }
        }
    }

    public final Drawable g(int i5, boolean z4) {
        Drawable drawable = this.f3384G;
        if (drawable != null) {
            this.f3384G = drawable.mutate();
            drawableFindDrawableByLayerId = drawable instanceof LayerDrawable ? ((LayerDrawable) drawable).findDrawableByLayerId(i5) : null;
            if (z4 && drawableFindDrawableByLayerId == null) {
                return drawable;
            }
        }
        return drawableFindDrawableByLayerId;
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return ProgressBar.class.getName();
    }

    public Drawable getCurrentDrawable() {
        return this.f3385H;
    }

    public Drawable getIndeterminateDrawable() {
        return this.f3383F;
    }

    public ColorStateList getIndeterminateTintList() {
        C0638l1 c0638l1 = this.f3386I;
        if (c0638l1 != null) {
            return c0638l1.f7726a;
        }
        return null;
    }

    public PorterDuff.Mode getIndeterminateTintMode() {
        C0638l1 c0638l1 = this.f3386I;
        if (c0638l1 != null) {
            return c0638l1.f7727b;
        }
        return null;
    }

    public Interpolator getInterpolator() {
        return this.f3389L;
    }

    @ViewDebug.ExportedProperty(category = "progress")
    public synchronized int getMax() {
        return this.f3421w;
    }

    public int getMaxHeight() {
        return this.f3416r;
    }

    public int getMaxWidth() {
        return this.f3414p;
    }

    @ViewDebug.ExportedProperty(category = "progress")
    public synchronized int getMin() {
        return this.f3419u;
    }

    public int getMinHeight() {
        return this.f3415q;
    }

    public int getMinWidth() {
        return this.f3413o;
    }

    public boolean getMirrorForRtl() {
        return this.f3397V;
    }

    @Override // android.view.View
    public int getPaddingLeft() throws NoSuchFieldException, SecurityException {
        Field fieldQ = J2.b.q(View.class, "mPaddingLeft");
        if (fieldQ != null) {
            Object objN = J2.b.n(this, fieldQ);
            if (objN instanceof Integer) {
                return ((Integer) objN).intValue();
            }
        }
        return 0;
    }

    @Override // android.view.View
    public int getPaddingRight() throws NoSuchFieldException, SecurityException {
        Field fieldQ = J2.b.q(View.class, "mPaddingRight");
        if (fieldQ != null) {
            Object objN = J2.b.n(this, fieldQ);
            if (objN instanceof Integer) {
                return ((Integer) objN).intValue();
            }
        }
        return 0;
    }

    @ViewDebug.ExportedProperty(category = "progress")
    public synchronized int getProgress() {
        return this.f3379A ? 0 : this.f3417s;
    }

    public ColorStateList getProgressBackgroundTintList() {
        C0638l1 c0638l1 = this.f3386I;
        if (c0638l1 != null) {
            return c0638l1.f7733i;
        }
        return null;
    }

    public PorterDuff.Mode getProgressBackgroundTintMode() {
        C0638l1 c0638l1 = this.f3386I;
        if (c0638l1 != null) {
            return c0638l1.f7734j;
        }
        return null;
    }

    public Drawable getProgressDrawable() {
        return this.f3384G;
    }

    public ColorStateList getProgressTintList() {
        C0638l1 c0638l1 = this.f3386I;
        if (c0638l1 != null) {
            return c0638l1.f7730e;
        }
        return null;
    }

    public PorterDuff.Mode getProgressTintMode() {
        C0638l1 c0638l1 = this.f3386I;
        if (c0638l1 != null) {
            return c0638l1.f;
        }
        return null;
    }

    @ViewDebug.ExportedProperty(category = "progress")
    public synchronized int getSecondaryProgress() {
        return this.f3379A ? 0 : this.f3418t;
    }

    public ColorStateList getSecondaryProgressTintList() {
        C0638l1 c0638l1 = this.f3386I;
        if (c0638l1 != null) {
            return c0638l1.f7737m;
        }
        return null;
    }

    public PorterDuff.Mode getSecondaryProgressTintMode() {
        C0638l1 c0638l1 = this.f3386I;
        if (c0638l1 != null) {
            return c0638l1.n;
        }
        return null;
    }

    public final void h(int i5) {
        if (getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_progress_bar_size_small) == i5) {
            this.f = getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_progress_circle_size_small_width);
            this.f3406g = getResources().getDimensionPixelOffset(com.wssyncmldm.R.dimen.sesl_progress_circle_size_small_padding);
            return;
        }
        if (getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_progress_bar_size_small_title) == i5) {
            this.f = getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_progress_circle_size_small_title_width);
            this.f3406g = getResources().getDimensionPixelOffset(com.wssyncmldm.R.dimen.sesl_progress_circle_size_small_title_padding);
        } else if (getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_progress_bar_size_large) == i5) {
            this.f = getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_progress_circle_size_large_width);
            this.f3406g = getResources().getDimensionPixelOffset(com.wssyncmldm.R.dimen.sesl_progress_circle_size_large_padding);
        } else if (getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_progress_bar_size_xlarge) == i5) {
            this.f = getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_progress_circle_size_xlarge_width);
            this.f3406g = getResources().getDimensionPixelOffset(com.wssyncmldm.R.dimen.sesl_progress_circle_size_xlarge_padding);
        } else {
            this.f = (getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_progress_circle_size_small_width) * i5) / getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_progress_bar_size_small);
            this.f3406g = (getResources().getDimensionPixelOffset(com.wssyncmldm.R.dimen.sesl_progress_circle_size_small_padding) * i5) / getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_progress_bar_size_small);
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (this.f3393Q) {
            return;
        }
        if (!verifyDrawable(drawable)) {
            super.invalidateDrawable(drawable);
            return;
        }
        Rect bounds = drawable.getBounds();
        int paddingLeft = getPaddingLeft() + getScrollX();
        int paddingTop = getPaddingTop() + getScrollY();
        invalidate(bounds.left + paddingLeft, bounds.top + paddingTop, bounds.right + paddingLeft, bounds.bottom + paddingTop);
    }

    public void j(float f, boolean z4, int i5) {
        if (((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            RunnableC0626h1 runnableC0626h1 = this.f3400b0;
            if (runnableC0626h1 == null) {
                this.f3400b0 = new RunnableC0626h1(this, 0);
            } else {
                removeCallbacks(runnableC0626h1);
            }
            postDelayed(this.f3400b0, 200L);
        }
        int i6 = this.f3418t;
        if (i6 <= this.f3417s || z4) {
            return;
        }
        l(R.id.secondaryProgress, i6, false, false);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3384G;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3383F;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
    }

    public void k(int i5, float f) {
    }

    public final synchronized void l(int i5, int i6, boolean z4, boolean z5) {
        try {
            if (this.f3391N == Thread.currentThread().getId()) {
                e(i5, i6, z4, true, z5);
            } else {
                if (this.f3390M == null) {
                    this.f3390M = new RunnableC0626h1(this, 1);
                }
                C0641m1 c0641m1 = (C0641m1) C0641m1.f7745e.a();
                if (c0641m1 == null) {
                    c0641m1 = new C0641m1();
                }
                c0641m1.f7746a = i5;
                c0641m1.f7747b = i6;
                c0641m1.f7748c = z4;
                c0641m1.f7749d = z5;
                this.f3399a0.add(c0641m1);
                if (this.f3394R && !this.f3395T) {
                    post(this.f3390M);
                    this.f3395T = true;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void m(int i5) {
        if (getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_progress_bar_indeterminate_xsmall) >= i5) {
            setIndeterminateDrawable(this.f3408i);
            return;
        }
        if (getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_progress_bar_indeterminate_small) >= i5) {
            setIndeterminateDrawable(this.f3409j);
            return;
        }
        if (getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_progress_bar_indeterminate_medium) >= i5) {
            setIndeterminateDrawable(this.f3410k);
        } else if (getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_progress_bar_indeterminate_large) >= i5) {
            setIndeterminateDrawable(this.f3411l);
        } else {
            setIndeterminateDrawable(this.f3412m);
        }
    }

    public synchronized boolean n(int i5, boolean z4, boolean z5) {
        Drawable drawableFindDrawableByLayerId;
        try {
            if (this.f3379A) {
                return false;
            }
            int iG = j.g(i5, this.f3419u, this.f3421w);
            int i6 = this.f3417s;
            if (iG == i6) {
                return false;
            }
            this.f3396U = i6;
            this.f3417s = iG;
            if (this.f3402d == 7 && (getProgressDrawable() instanceof LayerDrawable) && (drawableFindDrawableByLayerId = ((LayerDrawable) getProgressDrawable()).findDrawableByLayerId(R.id.progress)) != null && (drawableFindDrawableByLayerId instanceof C0632j1)) {
                C0632j1 c0632j1 = (C0632j1) drawableFindDrawableByLayerId;
                if (z5) {
                    ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(c0632j1, c0632j1.f7687i, iG);
                    objectAnimatorOfInt.setAutoCancel(true);
                    objectAnimatorOfInt.setDuration(80L);
                    objectAnimatorOfInt.setInterpolator(f3378f0);
                    objectAnimatorOfInt.start();
                } else {
                    c0632j1.f7684e = iG;
                    c0632j1.f7688j.invalidate();
                }
            }
            l(R.id.progress, this.f3417s, z4, z5);
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void o(int i5, float f) {
        this.f3396U = f;
        Drawable drawableFindDrawableByLayerId = this.f3385H;
        if ((drawableFindDrawableByLayerId instanceof LayerDrawable) && (drawableFindDrawableByLayerId = ((LayerDrawable) drawableFindDrawableByLayerId).findDrawableByLayerId(i5)) == null) {
            drawableFindDrawableByLayerId = this.f3385H;
        }
        if (drawableFindDrawableByLayerId != null) {
            drawableFindDrawableByLayerId.setLevel((int) (10000.0f * f));
        } else {
            invalidate();
        }
        k(i5, f);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3379A) {
            p();
        }
        synchronized (this) {
            try {
                int size = this.f3399a0.size();
                for (int i5 = 0; i5 < size; i5++) {
                    C0641m1 c0641m1 = (C0641m1) this.f3399a0.get(i5);
                    e(c0641m1.f7746a, c0641m1.f7747b, c0641m1.f7748c, true, c0641m1.f7749d);
                    C0641m1.f7745e.c(c0641m1);
                }
                this.f3399a0.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3394R = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (this.f3379A) {
            q();
        } else {
            this.n = null;
        }
        RunnableC0626h1 runnableC0626h1 = this.f3390M;
        if (runnableC0626h1 != null) {
            removeCallbacks(runnableC0626h1);
            this.f3395T = false;
        }
        RunnableC0626h1 runnableC0626h12 = this.f3400b0;
        if (runnableC0626h12 != null) {
            removeCallbacks(runnableC0626h12);
        }
        super.onDetachedFromWindow();
        this.f3394R = false;
    }

    @Override // android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        f(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setItemCount(this.f3421w - this.f3419u);
        accessibilityEvent.setCurrentItemIndex(this.f3417s);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) throws Resources.NotFoundException {
        boolean z4;
        boolean z5;
        String string;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        synchronized (this) {
            z4 = this.f3379A;
        }
        if (!z4) {
            accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(0, getMin(), getMax(), getProgress()));
        }
        if (getStateDescription() == null) {
            synchronized (this) {
                z5 = this.f3379A;
            }
            if (z5) {
                Context context = getContext();
                int identifier = context.getResources().getIdentifier("in_progress", "string", "android");
                if (identifier > 0) {
                    try {
                        string = context.getResources().getString(identifier);
                    } catch (Resources.NotFoundException unused) {
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                } else {
                    string = "";
                }
                accessibilityNodeInfo.setStateDescription(string);
                return;
            }
            int progress = getProgress();
            Locale locale = getResources().getConfiguration().locale;
            if (!locale.equals(this.f3403d0) || this.f3401c0 == null) {
                this.f3403d0 = locale;
                this.f3401c0 = NumberFormat.getPercentInstance(locale);
            }
            NumberFormat numberFormat = this.f3401c0;
            float max = getMax();
            float min = getMin();
            float f = max - min;
            float f5 = 0.0f;
            if (f > 0.0f) {
                float f6 = (progress - min) / f;
                if (f6 >= 0.0f) {
                    f5 = 1.0f;
                    if (f6 <= 1.0f) {
                        f5 = f6;
                    }
                }
            }
            accessibilityNodeInfo.setStateDescription(numberFormat.format(f5));
        }
    }

    @Override // android.view.View
    public synchronized void onMeasure(int i5, int i6) {
        int iMax;
        int iMax2;
        try {
            Drawable drawable = this.f3385H;
            if (drawable != null) {
                iMax2 = Math.max(this.f3413o, Math.min(this.f3414p, drawable.getIntrinsicWidth()));
                iMax = Math.max(this.f3415q, Math.min(this.f3416r, drawable.getIntrinsicHeight()));
            } else {
                iMax = 0;
                iMax2 = 0;
            }
            u();
            int paddingLeft = getPaddingLeft() + getPaddingRight() + iMax2;
            int paddingTop = getPaddingTop() + getPaddingBottom() + iMax;
            int iResolveSizeAndState = View.resolveSizeAndState(paddingLeft, i5, 0);
            int iResolveSizeAndState2 = View.resolveSizeAndState(paddingTop, i6, 0);
            h((iResolveSizeAndState - getPaddingLeft()) - getPaddingRight());
            if (this.f3407h && this.f3379A) {
                m((iResolveSizeAndState - getPaddingLeft()) - getPaddingRight());
            }
            setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        n1 n1Var = (n1) parcelable;
        super.onRestoreInstanceState(n1Var.getSuperState());
        setProgress(n1Var.f7752d);
        setSecondaryProgress(n1Var.f7753e);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        n1 n1Var = new n1(super.onSaveInstanceState());
        n1Var.f7752d = this.f3417s;
        n1Var.f7753e = this.f3418t;
        return n1Var;
    }

    @Override // android.view.View
    public void onSizeChanged(int i5, int i6, int i7, int i8) throws NoSuchFieldException, SecurityException {
        t(i5, i6);
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z4) {
        super.onVisibilityAggregated(z4);
        if (z4 != this.f3398W) {
            this.f3398W = z4;
            if (this.f3379A) {
                if (z4) {
                    p();
                } else {
                    q();
                }
            }
            Drawable drawable = this.f3385H;
            if (drawable != null) {
                drawable.setVisible(z4, false);
            }
        }
    }

    public final void p() {
        if (getVisibility() == 0) {
            Drawable drawable = this.f3383F;
            if (drawable instanceof Animatable) {
                this.f3392O = true;
                this.E = false;
                if (drawable instanceof AnimatedVectorDrawable) {
                    ((AnimatedVectorDrawable) drawable).registerAnimationCallback(this.n);
                }
            } else {
                this.E = true;
                if (this.f3389L == null) {
                    this.f3389L = new LinearInterpolator();
                }
                Transformation transformation = this.f3381C;
                if (transformation == null) {
                    this.f3381C = new Transformation();
                } else {
                    transformation.clear();
                }
                AlphaAnimation alphaAnimation = this.f3382D;
                if (alphaAnimation == null) {
                    this.f3382D = new AlphaAnimation(0.0f, 1.0f);
                } else {
                    alphaAnimation.reset();
                }
                this.f3382D.setRepeatMode(this.f3423y);
                this.f3382D.setRepeatCount(-1);
                this.f3382D.setDuration(this.f3424z);
                this.f3382D.setInterpolator(this.f3389L);
                this.f3382D.setStartTime(-1L);
            }
            postInvalidate();
        }
    }

    @Override // android.view.View
    public final void postInvalidate() {
        if (this.f3388K) {
            return;
        }
        super.postInvalidate();
    }

    public final void q() {
        this.E = false;
        Object obj = this.f3383F;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
            Drawable drawable = this.f3383F;
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).unregisterAnimationCallback(this.n);
            }
            this.f3392O = false;
        }
        postInvalidate();
    }

    public final void r(Drawable drawable) {
        Drawable drawable2 = this.f3385H;
        this.f3385H = drawable;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setVisible(false, false);
            }
            Drawable drawable3 = this.f3385H;
            if (drawable3 != null) {
                drawable3.setVisible(getWindowVisibility() == 0 && isShown(), false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable] */
    public final Drawable s(Drawable drawable, boolean z4) {
        if (!(drawable instanceof LayerDrawable)) {
            if (drawable instanceof StateListDrawable) {
                return new StateListDrawable();
            }
            if (drawable instanceof BitmapDrawable) {
                drawable = (BitmapDrawable) drawable.getConstantState().newDrawable(getResources());
                drawable.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
                if (this.f3387J <= 0) {
                    this.f3387J = drawable.getIntrinsicWidth();
                }
                if (z4) {
                    return new ClipDrawable(drawable, 3, 1);
                }
            }
            return drawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i5 = 0; i5 < numberOfLayers; i5++) {
            int id = layerDrawable.getId(i5);
            drawableArr[i5] = s(layerDrawable.getDrawable(i5), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i6 = 0; i6 < numberOfLayers; i6++) {
            layerDrawable2.setId(i6, layerDrawable.getId(i6));
            layerDrawable2.setLayerGravity(i6, layerDrawable.getLayerGravity(i6));
            layerDrawable2.setLayerWidth(i6, layerDrawable.getLayerWidth(i6));
            layerDrawable2.setLayerHeight(i6, layerDrawable.getLayerHeight(i6));
            layerDrawable2.setLayerInsetLeft(i6, layerDrawable.getLayerInsetLeft(i6));
            layerDrawable2.setLayerInsetRight(i6, layerDrawable.getLayerInsetRight(i6));
            layerDrawable2.setLayerInsetTop(i6, layerDrawable.getLayerInsetTop(i6));
            layerDrawable2.setLayerInsetBottom(i6, layerDrawable.getLayerInsetBottom(i6));
            layerDrawable2.setLayerInsetStart(i6, layerDrawable.getLayerInsetStart(i6));
            layerDrawable2.setLayerInsetEnd(i6, layerDrawable.getLayerInsetEnd(i6));
        }
        return layerDrawable2;
    }

    public synchronized void setIndeterminate(boolean z4) {
        try {
            if (!this.f3380B || !this.f3379A) {
                if (z4 != this.f3379A) {
                    this.f3379A = z4;
                    if (z4) {
                        r(this.f3383F);
                        p();
                    } else {
                        r(this.f3384G);
                        q();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3383F;
        if (drawable2 != drawable) {
            boolean z4 = this.f3407h;
            if (drawable2 != null) {
                if (z4) {
                    q();
                }
                this.f3383F.setCallback(null);
                unscheduleDrawable(this.f3383F);
            }
            this.f3383F = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
                WeakHashMap weakHashMap = P.f1421a;
                C.b.b(drawable, getLayoutDirection());
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                a();
            }
            if (this.f3379A) {
                if (z4) {
                    p();
                }
                r(drawable);
                postInvalidate();
            }
        }
    }

    public void setIndeterminateDrawableTiled(Drawable drawable) {
        if (drawable != null && (drawable instanceof AnimationDrawable)) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            AnimationDrawable animationDrawable2 = new AnimationDrawable();
            animationDrawable2.setOneShot(animationDrawable.isOneShot());
            for (int i5 = 0; i5 < numberOfFrames; i5++) {
                Drawable drawableS = s(animationDrawable.getFrame(i5), true);
                drawableS.setLevel(IDMCallbackStatusInterface.IDM_RESULTS);
                animationDrawable2.addFrame(drawableS, animationDrawable.getDuration(i5));
            }
            animationDrawable2.setLevel(IDMCallbackStatusInterface.IDM_RESULTS);
            drawable = animationDrawable2;
        }
        setIndeterminateDrawable(drawable);
    }

    public void setIndeterminateTintList(ColorStateList colorStateList) {
        if (this.f3386I == null) {
            this.f3386I = new C0638l1();
        }
        C0638l1 c0638l1 = this.f3386I;
        c0638l1.f7726a = colorStateList;
        c0638l1.f7728c = true;
        a();
    }

    public void setIndeterminateTintMode(PorterDuff.Mode mode) {
        if (this.f3386I == null) {
            this.f3386I = new C0638l1();
        }
        C0638l1 c0638l1 = this.f3386I;
        c0638l1.f7727b = mode;
        c0638l1.f7729d = true;
        a();
    }

    public void setInterpolator(Interpolator interpolator) {
        this.f3389L = interpolator;
    }

    public synchronized void setMax(int i5) {
        int i6;
        try {
            boolean z4 = this.f3420v;
            if (z4 && i5 < (i6 = this.f3419u)) {
                i5 = i6;
            }
            this.f3422x = true;
            if (!z4 || i5 == this.f3421w) {
                this.f3421w = i5;
            } else {
                this.f3421w = i5;
                postInvalidate();
                if (this.f3417s > i5) {
                    this.f3417s = i5;
                }
                l(R.id.progress, this.f3417s, false, false);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setMaxHeight(int i5) {
        this.f3416r = i5;
        requestLayout();
    }

    public void setMaxWidth(int i5) {
        this.f3414p = i5;
        requestLayout();
    }

    public synchronized void setMin(int i5) {
        int i6;
        try {
            boolean z4 = this.f3422x;
            if (z4 && i5 > (i6 = this.f3421w)) {
                i5 = i6;
            }
            this.f3420v = true;
            if (!z4 || i5 == this.f3419u) {
                this.f3419u = i5;
            } else {
                this.f3419u = i5;
                postInvalidate();
                if (this.f3417s < i5) {
                    this.f3417s = i5;
                }
                l(R.id.progress, this.f3417s, false, false);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setMinHeight(int i5) {
        this.f3415q = i5;
        requestLayout();
    }

    public void setMinWidth(int i5) {
        this.f3413o = i5;
        requestLayout();
    }

    public void setMode(int i5) throws NoSuchFieldException, SecurityException {
        Drawable drawableB;
        this.f3402d = i5;
        if (i5 == 3) {
            drawableB = AbstractC0938a.b(getContext(), com.wssyncmldm.R.drawable.sesl_scrubber_progress_vertical);
        } else if (i5 != 4) {
            if (i5 == 7) {
                this.f3380B = false;
                setIndeterminate(false);
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new C0632j1(this, true, new ColorStateList(new int[][]{new int[0]}, new int[]{getResources().getColor(com.wssyncmldm.R.color.sesl_progress_control_color_background)})), new C0632j1(this, false, new ColorStateList(new int[][]{new int[0]}, new int[]{getResources().getColor(com.wssyncmldm.R.color.sesl_progress_control_color_activated_light)}))});
                layerDrawable.setPaddingMode(1);
                layerDrawable.setId(0, R.id.background);
                layerDrawable.setId(1, R.id.progress);
                setProgressDrawable(layerDrawable);
            }
            drawableB = null;
        } else {
            drawableB = AbstractC0938a.b(getContext(), com.wssyncmldm.R.drawable.sesl_split_seekbar_background_progress);
        }
        if (drawableB != null) {
            setProgressDrawableTiled(drawableB);
        }
    }

    public synchronized void setProgress(int i5) {
        n(i5, false, false);
    }

    public void setProgressBackgroundTintList(ColorStateList colorStateList) {
        if (this.f3386I == null) {
            this.f3386I = new C0638l1();
        }
        C0638l1 c0638l1 = this.f3386I;
        c0638l1.f7733i = colorStateList;
        c0638l1.f7735k = true;
        if (this.f3384G != null) {
            c();
        }
    }

    public void setProgressBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f3386I == null) {
            this.f3386I = new C0638l1();
        }
        C0638l1 c0638l1 = this.f3386I;
        c0638l1.f7734j = mode;
        c0638l1.f7736l = true;
        if (this.f3384G != null) {
            c();
        }
    }

    public void setProgressDrawable(Drawable drawable) throws NoSuchFieldException, SecurityException {
        Drawable drawable2 = this.f3384G;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f3384G);
            }
            this.f3384G = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
                WeakHashMap weakHashMap = P.f1421a;
                C.b.b(drawable, getLayoutDirection());
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f3402d == 3) {
                    int minimumWidth = drawable.getMinimumWidth();
                    if (this.f3414p < minimumWidth) {
                        this.f3414p = minimumWidth;
                        requestLayout();
                    }
                } else {
                    int minimumHeight = drawable.getMinimumHeight();
                    if (this.f3416r < minimumHeight) {
                        this.f3416r = minimumHeight;
                        requestLayout();
                    }
                }
                if (this.f3384G != null && this.f3386I != null) {
                    b();
                    c();
                    d();
                }
            }
            if (!this.f3379A) {
                r(drawable);
                postInvalidate();
            }
            t(getWidth(), getHeight());
            u();
            e(R.id.progress, this.f3417s, false, false, false);
            e(R.id.secondaryProgress, this.f3418t, false, false, false);
            if (getImportantForAccessibility() == 0) {
                setImportantForAccessibility(1);
            }
        }
    }

    public void setProgressDrawableTiled(Drawable drawable) throws NoSuchFieldException, SecurityException {
        if (drawable != null) {
            drawable = s(drawable, false);
        }
        setProgressDrawable(drawable);
    }

    public void setProgressTintList(ColorStateList colorStateList) {
        if (this.f3386I == null) {
            this.f3386I = new C0638l1();
        }
        C0638l1 c0638l1 = this.f3386I;
        c0638l1.f7730e = colorStateList;
        c0638l1.f7731g = true;
        if (this.f3384G != null) {
            b();
        }
    }

    public void setProgressTintMode(PorterDuff.Mode mode) {
        if (this.f3386I == null) {
            this.f3386I = new C0638l1();
        }
        C0638l1 c0638l1 = this.f3386I;
        c0638l1.f = mode;
        c0638l1.f7732h = true;
        if (this.f3384G != null) {
            b();
        }
    }

    public synchronized void setSecondaryProgress(int i5) {
        if (this.f3379A) {
            return;
        }
        int i6 = this.f3419u;
        if (i5 < i6) {
            i5 = i6;
        }
        int i7 = this.f3421w;
        if (i5 > i7) {
            i5 = i7;
        }
        if (i5 != this.f3418t) {
            this.f3418t = i5;
            l(R.id.secondaryProgress, i5, false, false);
        }
    }

    public void setSecondaryProgressTintList(ColorStateList colorStateList) {
        if (this.f3386I == null) {
            this.f3386I = new C0638l1();
        }
        C0638l1 c0638l1 = this.f3386I;
        c0638l1.f7737m = colorStateList;
        c0638l1.f7738o = true;
        if (this.f3384G != null) {
            d();
        }
    }

    public void setSecondaryProgressTintMode(PorterDuff.Mode mode) {
        if (this.f3386I == null) {
            this.f3386I = new C0638l1();
        }
        C0638l1 c0638l1 = this.f3386I;
        c0638l1.n = mode;
        c0638l1.f7739p = true;
        if (this.f3384G != null) {
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t(int r11, int r12) throws java.lang.NoSuchFieldException, java.lang.SecurityException {
        /*
            r10 = this;
            int r0 = r10.getPaddingRight()
            int r1 = r10.getPaddingLeft()
            int r1 = r1 + r0
            int r11 = r11 - r1
            int r0 = r10.getPaddingTop()
            int r1 = r10.getPaddingBottom()
            int r1 = r1 + r0
            int r12 = r12 - r1
            android.graphics.drawable.Drawable r0 = r10.f3383F
            r1 = 0
            if (r0 == 0) goto L78
            boolean r2 = r10.f3380B
            if (r2 == 0) goto L60
            boolean r2 = r0 instanceof android.graphics.drawable.AnimationDrawable
            if (r2 != 0) goto L60
            int r0 = r0.getIntrinsicWidth()
            android.graphics.drawable.Drawable r2 = r10.f3383F
            int r2 = r2.getIntrinsicHeight()
            float r0 = (float) r0
            float r2 = (float) r2
            float r0 = r0 / r2
            float r2 = (float) r11
            float r3 = (float) r12
            float r4 = r2 / r3
            float r5 = r0 - r4
            float r5 = java.lang.Math.abs(r5)
            double r5 = (double) r5
            r7 = 4502148214488346440(0x3e7ad7f29abcaf48, double:1.0E-7)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L60
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L51
            float r3 = r3 * r0
            int r0 = (int) r3
            int r2 = r11 - r0
            int r2 = r2 / 2
            int r0 = r0 + r2
            r3 = r2
            r2 = r0
            r0 = r1
            goto L63
        L51:
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 / r0
            float r3 = r3 * r2
            int r0 = (int) r3
            int r12 = r12 - r0
            int r12 = r12 / 2
            int r0 = r0 + r12
            r2 = r11
            r3 = r1
            r9 = r0
            r0 = r12
            r12 = r9
            goto L63
        L60:
            r2 = r11
            r0 = r1
            r3 = r0
        L63:
            boolean r4 = r10.f3397V
            if (r4 == 0) goto L72
            boolean r4 = k.M1.a(r10)
            if (r4 == 0) goto L72
            int r2 = r11 - r2
            int r11 = r11 - r3
            r3 = r2
            goto L73
        L72:
            r11 = r2
        L73:
            android.graphics.drawable.Drawable r2 = r10.f3383F
            r2.setBounds(r3, r0, r11, r12)
        L78:
            android.graphics.drawable.Drawable r10 = r10.f3384G
            if (r10 == 0) goto L7f
            r10.setBounds(r1, r1, r11, r12)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SeslProgressBar.t(int, int):void");
    }

    public final void u() {
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3384G;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f3383F;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f3384G || drawable == this.f3383F || super.verifyDrawable(drawable);
    }

    public SeslProgressBar(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5, 0);
        this.f3402d = 0;
        this.f3407h = false;
        this.f3387J = 0;
        this.f3397V = false;
        this.f3399a0 = new ArrayList();
        this.f3405e0 = new C0623g1("visual_progress");
        this.f3391N = Thread.currentThread().getId();
        this.f3419u = 0;
        this.f3421w = 100;
        this.f3417s = 0;
        this.f3418t = 0;
        this.f3379A = false;
        this.f3380B = false;
        this.f3424z = 4000;
        this.f3423y = 1;
        this.f3413o = 24;
        this.f3414p = 48;
        this.f3415q = 24;
        this.f3416r = 48;
        int[] iArr = AbstractC0220a.f5129t;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i5, 0);
        try {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, i5, 0);
            this.f3388K = true;
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(8);
            if (drawable != null) {
                if (i(drawable)) {
                    setProgressDrawableTiled(drawable);
                } else {
                    setProgressDrawable(drawable);
                }
            }
            this.f3424z = typedArrayObtainStyledAttributes.getInt(9, this.f3424z);
            this.f3413o = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, this.f3413o);
            this.f3414p = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, this.f3414p);
            this.f3415q = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, this.f3415q);
            this.f3416r = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, this.f3416r);
            this.f3423y = typedArrayObtainStyledAttributes.getInt(10, this.f3423y);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(13, R.anim.linear_interpolator);
            if (resourceId > 0) {
                setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
            }
            setMin(typedArrayObtainStyledAttributes.getInt(26, this.f3419u));
            setMax(typedArrayObtainStyledAttributes.getInt(2, this.f3421w));
            setProgress(typedArrayObtainStyledAttributes.getInt(3, this.f3417s));
            setSecondaryProgress(typedArrayObtainStyledAttributes.getInt(4, this.f3418t));
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(7);
            if (drawable2 != null) {
                if (i(drawable2)) {
                    setIndeterminateDrawableTiled(drawable2);
                } else {
                    setIndeterminateDrawable(drawable2);
                }
            }
            boolean z4 = typedArrayObtainStyledAttributes.getBoolean(6, this.f3380B);
            this.f3380B = z4;
            this.f3388K = false;
            setIndeterminate(z4 || typedArrayObtainStyledAttributes.getBoolean(5, this.f3379A));
            this.f3397V = typedArrayObtainStyledAttributes.getBoolean(15, false);
            if (typedArrayObtainStyledAttributes.hasValue(17)) {
                if (this.f3386I == null) {
                    this.f3386I = new C0638l1();
                }
                this.f3386I.f = AbstractC0622g0.b(typedArrayObtainStyledAttributes.getInt(17, -1), null);
                this.f3386I.f7732h = true;
            }
            if (typedArrayObtainStyledAttributes.hasValue(16)) {
                if (this.f3386I == null) {
                    this.f3386I = new C0638l1();
                }
                this.f3386I.f7730e = typedArrayObtainStyledAttributes.getColorStateList(16);
                this.f3386I.f7731g = true;
            }
            if (typedArrayObtainStyledAttributes.hasValue(19)) {
                if (this.f3386I == null) {
                    this.f3386I = new C0638l1();
                }
                this.f3386I.f7734j = AbstractC0622g0.b(typedArrayObtainStyledAttributes.getInt(19, -1), null);
                this.f3386I.f7736l = true;
            }
            if (typedArrayObtainStyledAttributes.hasValue(18)) {
                if (this.f3386I == null) {
                    this.f3386I = new C0638l1();
                }
                this.f3386I.f7733i = typedArrayObtainStyledAttributes.getColorStateList(18);
                this.f3386I.f7735k = true;
            }
            if (typedArrayObtainStyledAttributes.hasValue(21)) {
                if (this.f3386I == null) {
                    this.f3386I = new C0638l1();
                }
                this.f3386I.n = AbstractC0622g0.b(typedArrayObtainStyledAttributes.getInt(21, -1), null);
                this.f3386I.f7739p = true;
            }
            if (typedArrayObtainStyledAttributes.hasValue(20)) {
                if (this.f3386I == null) {
                    this.f3386I = new C0638l1();
                }
                this.f3386I.f7737m = typedArrayObtainStyledAttributes.getColorStateList(20);
                this.f3386I.f7738o = true;
            }
            if (typedArrayObtainStyledAttributes.hasValue(23)) {
                if (this.f3386I == null) {
                    this.f3386I = new C0638l1();
                }
                this.f3386I.f7727b = AbstractC0622g0.b(typedArrayObtainStyledAttributes.getInt(23, -1), null);
                this.f3386I.f7729d = true;
            }
            if (typedArrayObtainStyledAttributes.hasValue(22)) {
                if (this.f3386I == null) {
                    this.f3386I = new C0638l1();
                }
                this.f3386I.f7726a = typedArrayObtainStyledAttributes.getColorStateList(22);
                this.f3386I.f7728c = true;
            }
            this.f3407h = typedArrayObtainStyledAttributes.getBoolean(27, false);
            e eVar = new e(context, 2132017403);
            this.f3408i = getResources().getDrawable(com.wssyncmldm.R.drawable.sesl_progress_bar_indeterminate_xsmall_transition, eVar.getTheme());
            this.f3409j = getResources().getDrawable(com.wssyncmldm.R.drawable.sesl_progress_bar_indeterminate_small_transition, eVar.getTheme());
            this.f3410k = getResources().getDrawable(com.wssyncmldm.R.drawable.sesl_progress_bar_indeterminate_medium_transition, eVar.getTheme());
            this.f3411l = getResources().getDrawable(com.wssyncmldm.R.drawable.sesl_progress_bar_indeterminate_large_transition, eVar.getTheme());
            this.f3412m = getResources().getDrawable(com.wssyncmldm.R.drawable.sesl_progress_bar_indeterminate_xlarge_transition, eVar.getTheme());
            typedArrayObtainStyledAttributes.recycle();
            if (this.f3384G != null && this.f3386I != null) {
                b();
                c();
                d();
            }
            a();
            WeakHashMap weakHashMap = P.f1421a;
            if (getImportantForAccessibility() == 0) {
                setImportantForAccessibility(1);
            }
            this.f3404e = context.getResources().getDisplayMetrics().density;
            this.n = new C0635k1(this);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
