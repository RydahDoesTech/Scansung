package androidx.core.widget;

import A3.f;
import B.g;
import J.A;
import J.B;
import J.C0046c;
import J.C0056m;
import J.C0059p;
import J.H;
import J.InterfaceC0057n;
import J.InterfaceC0058o;
import J.P;
import J.T;
import J2.b;
import O.e;
import O.h;
import O.i;
import O.j;
import O.k;
import O.l;
import O.m;
import O.n;
import V1.a;
import android.R;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Parcelable;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.samsung.android.knox.net.nap.NetworkAnalyticsConstants;
import g3.y;
import java.util.Map;
import java.util.WeakHashMap;
import r0.AbstractC0808b;
import r0.AbstractC0809c;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0058o {

    /* renamed from: i0, reason: collision with root package name */
    public static final float f3571i0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: j0, reason: collision with root package name */
    public static final j f3572j0 = new j(0);
    public static final int[] k0 = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public final C0059p f3573A;

    /* renamed from: B, reason: collision with root package name */
    public final C0056m f3574B;

    /* renamed from: C, reason: collision with root package name */
    public float f3575C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f3576D;
    public int E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f3577F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f3578G;

    /* renamed from: H, reason: collision with root package name */
    public int f3579H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f3580I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f3581J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f3582K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f3583L;

    /* renamed from: M, reason: collision with root package name */
    public l f3584M;

    /* renamed from: N, reason: collision with root package name */
    public int f3585N;

    /* renamed from: O, reason: collision with root package name */
    public int f3586O;

    /* renamed from: Q, reason: collision with root package name */
    public int f3587Q;

    /* renamed from: R, reason: collision with root package name */
    public long f3588R;

    /* renamed from: T, reason: collision with root package name */
    public long f3589T;

    /* renamed from: U, reason: collision with root package name */
    public final long f3590U;

    /* renamed from: V, reason: collision with root package name */
    public long f3591V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f3592W;

    /* renamed from: a0, reason: collision with root package name */
    public final Context f3593a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f3594b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f3595c0;

    /* renamed from: d, reason: collision with root package name */
    public final float f3596d;

    /* renamed from: d0, reason: collision with root package name */
    public final int[] f3597d0;

    /* renamed from: e, reason: collision with root package name */
    public long f3598e;

    /* renamed from: e0, reason: collision with root package name */
    public int f3599e0;
    public final Rect f;

    /* renamed from: f0, reason: collision with root package name */
    public int f3600f0;

    /* renamed from: g, reason: collision with root package name */
    public final OverScroller f3601g;
    public final C0046c g0;

    /* renamed from: h, reason: collision with root package name */
    public final EdgeEffect f3602h;

    /* renamed from: h0, reason: collision with root package name */
    public final h f3603h0;

    /* renamed from: i, reason: collision with root package name */
    public final EdgeEffect f3604i;

    /* renamed from: j, reason: collision with root package name */
    public int f3605j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3606k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3607l;

    /* renamed from: m, reason: collision with root package name */
    public View f3608m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public VelocityTracker f3609o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3610p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3611q;

    /* renamed from: r, reason: collision with root package name */
    public final int f3612r;

    /* renamed from: s, reason: collision with root package name */
    public final int f3613s;

    /* renamed from: t, reason: collision with root package name */
    public final int f3614t;

    /* renamed from: u, reason: collision with root package name */
    public int f3615u;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f3616v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f3617w;

    /* renamed from: x, reason: collision with root package name */
    public int f3618x;

    /* renamed from: y, reason: collision with root package name */
    public int f3619y;

    /* renamed from: z, reason: collision with root package name */
    public n f3620z;

    static {
        new LinearInterpolator();
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.wssyncmldm.R.attr.nestedScrollViewStyle);
        this.f = new Rect();
        this.f3606k = true;
        this.f3607l = false;
        this.f3608m = null;
        this.n = false;
        this.f3611q = true;
        this.f3615u = -1;
        this.f3616v = new int[2];
        this.f3617w = new int[2];
        this.f3576D = false;
        this.E = 0;
        this.f3577F = false;
        this.f3578G = new Rect();
        this.f3579H = 0;
        new PathInterpolator(0.33f, 0.0f, 0.3f, 1.0f);
        Paint paint = new Paint();
        new h(this, 1);
        new h(this, 2);
        new h(this, 3);
        this.f3580I = false;
        this.f3581J = true;
        this.f3582K = false;
        this.f3583L = false;
        this.f3585N = 0;
        this.f3586O = 0;
        this.f3587Q = -1;
        this.f3588R = 0L;
        this.f3589T = 0L;
        this.f3590U = 300L;
        this.f3591V = 0L;
        this.f3592W = false;
        this.f3594b0 = 0;
        this.f3595c0 = false;
        this.f3597d0 = new int[2];
        this.f3599e0 = 0;
        this.f3600f0 = 0;
        this.g0 = new C0046c(getContext(), new g(14, this));
        View.OnLayoutChangeListener iVar = new i(0, this);
        h hVar = new h(this, 0);
        this.f3603h0 = hVar;
        this.f3593a0 = context;
        this.f3602h = AbstractC0809c.g() ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f3604i = AbstractC0809c.g() ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f3596d = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f3601g = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(NetworkAnalyticsConstants.DataPoints.FLAG_PARENT_PROCESS_HASH);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3612r = viewConfiguration.getScaledTouchSlop();
        this.f3613s = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3614t = viewConfiguration.getScaledMaximumFlingVelocity();
        post(hVar);
        addOnLayoutChangeListener(iVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k0, com.wssyncmldm.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f3573A = new C0059p();
        this.f3574B = new C0056m(this);
        setNestedScrollingEnabled(true);
        P.h(this, f3572j0);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    public static boolean o(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && o((View) parent, nestedScrollView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupGoToTop(int i5) {
        String string;
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (string = Settings.Secure.getString(getContext().getContentResolver(), "enabled_accessibility_services")) == null || string.matches("(?i).*com.samsung.accessibility/com.samsung.android.app.talkback.TalkBackService.*") || string.matches("(?i).*com.samsung.android.accessibility.talkback/com.samsung.android.marvin.talkback.TalkBackService.*") || string.matches("(?i).*com.google.android.marvin.talkback.TalkBackService.*")) {
            return;
        }
        string.matches("(?i).*com.samsung.accessibility/com.samsung.accessibility.universalswitch.UniversalSwitchService.*");
    }

    @Override // J.InterfaceC0057n
    public final void a(View view, View view2, int i5, int i6) {
        C0059p c0059p = this.f3573A;
        if (i6 == 1) {
            c0059p.f1479b = i5;
        } else {
            c0059p.f1478a = i5;
        }
        x(2, i6);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // J.InterfaceC0057n
    public final void b(View view, int i5, int i6, int[] iArr, int i7) {
        this.f3574B.c(i5, i6, iArr, null, i7);
    }

    @Override // J.InterfaceC0057n
    public final void c(int i5, View view) {
        C0059p c0059p = this.f3573A;
        if (i5 == 1) {
            c0059p.f1479b = 0;
        } else {
            c0059p.f1478a = 0;
        }
        z(i5);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // J.InterfaceC0058o
    public final void d(View view, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
        q(iArr, i8, i9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        Context context = this.f3593a0;
        if (action == 9) {
            if (this.f3595c0) {
                int[] iArr = this.f3597d0;
                getLocationInWindow(iArr);
                int i5 = this.f3600f0;
                int i6 = this.f3594b0;
                int i7 = iArr[1];
                int i8 = i6 - i7;
                int i9 = i5 - i8;
                this.f3599e0 = i9;
                if (i8 < 0) {
                    this.f3600f0 = i9;
                    this.f3594b0 = i7;
                }
            }
            int toolType = motionEvent.getToolType(0);
            this.f3583L = true;
            if (!this.f3580I || !this.f3581J) {
                this.f3583L = false;
            }
            if (this.f3583L && toolType == 2) {
                if (Settings.System.getInt(context.getContentResolver(), Y0.j.A(), 0) != 1) {
                    this.f3583L = false;
                }
            }
            if (this.f3583L && toolType == 3) {
                this.f3583L = false;
            }
        }
        if (!this.f3583L) {
            return super.dispatchHoverEvent(motionEvent);
        }
        int x4 = (int) motionEvent.getX();
        int y4 = (int) motionEvent.getY();
        int childCount = getChildCount();
        int scrollRange = getScrollRange();
        if (this.f3584M == null) {
            this.f3584M = new l(this);
        }
        if (this.f3585N <= 0 || this.f3586O <= 0) {
            this.f3585N = (int) (TypedValue.applyDimension(1, 25.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            this.f3586O = (int) (TypedValue.applyDimension(1, 25.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
        int height = childCount != 0 ? getHeight() : 0;
        boolean z4 = motionEvent.getToolType(0) == 2;
        if ((y4 > this.f3585N && y4 < (height - this.f3586O) - this.f3599e0) || x4 <= 0 || x4 > getRight() || scrollRange == 0 || ((y4 >= 0 && y4 <= this.f3585N && getScrollY() <= 0 && this.f3592W) || ((y4 >= height - this.f3586O && y4 <= height && getScrollY() >= scrollRange && this.f3592W) || ((z4 && motionEvent.getButtonState() == 32) || !z4 || ((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode())))) {
            if (this.f3584M.hasMessages(1)) {
                this.f3584M.removeMessages(1);
                v(motionEvent, y.v());
            }
            if ((y4 > this.f3585N && y4 < height - this.f3586O) || x4 <= 0 || x4 > getRight()) {
                this.f3592W = false;
            }
            if (this.f3582K || this.f3591V != 0) {
                v(motionEvent, y.v());
            }
            this.f3589T = 0L;
            this.f3591V = 0L;
            this.f3582K = false;
            return super.dispatchHoverEvent(motionEvent);
        }
        if (!this.f3582K) {
            this.f3591V = System.currentTimeMillis();
        }
        if (action != 7) {
            if (action == 9) {
                this.f3582K = true;
                if (y4 < 0 || y4 > this.f3585N) {
                    if (y4 >= (height - this.f3586O) - this.f3599e0 && y4 <= height && !this.f3584M.hasMessages(1)) {
                        this.f3589T = System.currentTimeMillis();
                        v(motionEvent, y.x());
                        this.f3587Q = 1;
                        this.f3584M.sendEmptyMessage(1);
                    }
                } else if (!this.f3584M.hasMessages(1)) {
                    this.f3589T = System.currentTimeMillis();
                    v(motionEvent, y.y());
                    this.f3587Q = 2;
                    this.f3584M.sendEmptyMessage(1);
                }
            } else if (action == 10) {
                if (this.f3584M.hasMessages(1)) {
                    this.f3584M.removeMessages(1);
                }
                v(motionEvent, y.v());
                this.f3589T = 0L;
                this.f3591V = 0L;
                this.f3592W = false;
                this.f3582K = false;
                this.f3601g.forceFinished(true);
                return super.dispatchHoverEvent(motionEvent);
            }
        } else {
            if (!this.f3582K) {
                this.f3582K = true;
                motionEvent.setAction(10);
                return super.dispatchHoverEvent(motionEvent);
            }
            if (y4 < 0 || y4 > this.f3585N) {
                if (y4 >= (height - this.f3586O) - this.f3599e0 && y4 <= height && !this.f3584M.hasMessages(1)) {
                    this.f3589T = System.currentTimeMillis();
                    if (!this.f3592W || this.f3587Q == 2) {
                        v(motionEvent, y.x());
                    }
                    this.f3587Q = 1;
                    this.f3584M.sendEmptyMessage(1);
                }
            } else if (!this.f3584M.hasMessages(1)) {
                this.f3589T = System.currentTimeMillis();
                if (!this.f3592W || this.f3587Q == 1) {
                    v(motionEvent, y.y());
                }
                this.f3587Q = 2;
                this.f3584M.sendEmptyMessage(1);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || l(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f5, boolean z4) {
        return this.f3574B.a(f, f5, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f5) {
        AbstractC0808b.o(this, 1.0f);
        return this.f3574B.b(f, f5);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i5, int i6, int[] iArr, int[] iArr2) {
        return this.f3574B.c(i5, i6, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i5, int i6, int i7, int i8, int[] iArr) {
        return this.f3574B.d(i5, i6, i7, i8, iArr, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        int height;
        int i5;
        int x4 = (int) motionEvent.getX();
        int y4 = (int) motionEvent.getY();
        int childCount = getChildCount();
        int scrollRange = getScrollRange();
        if (this.f3584M == null) {
            this.f3584M = new l(this);
        }
        if (this.f3585N <= 0 || this.f3586O <= 0) {
            Context context = this.f3593a0;
            this.f3585N = (int) (TypedValue.applyDimension(1, 25.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            this.f3586O = (int) (TypedValue.applyDimension(1, 25.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
        if (childCount != 0) {
            height = getHeight();
            motionEvent2 = motionEvent;
        } else {
            motionEvent2 = motionEvent;
            height = 0;
        }
        boolean z4 = motionEvent2.getToolType(0) == 2;
        int action = motionEvent.getAction();
        Rect rect = this.f3578G;
        if (action == 0) {
            this.f3576D = false;
            if (this.f3577F && this.f3579H != 2 && rect.contains(x4, y4)) {
                setupGoToTop(2);
                throw null;
            }
        } else if (action != 1) {
            if (action != 2) {
                if (action == 3 && this.f3577F && this.f3579H != 0) {
                    int[] iArr = StateSet.NOTHING;
                    throw null;
                }
            } else if (this.f3577F && this.f3579H == 2) {
                if (rect.contains(x4, y4)) {
                    return true;
                }
                this.f3579H = 1;
                int[] iArr2 = StateSet.NOTHING;
                throw null;
            }
        } else if (this.f3577F && this.f3579H == 2) {
            if (canScrollVertically(-1)) {
                post(new h(this, 4));
            }
            this.f3579H = 1;
            int[] iArr3 = StateSet.NOTHING;
            throw null;
        }
        if ((y4 > this.f3585N && y4 < height - this.f3586O) || scrollRange == 0 || !z4 || motionEvent.getButtonState() != 32) {
            if (this.f3584M.hasMessages(1)) {
                this.f3584M.removeMessages(1);
            }
            this.f3589T = 0L;
            this.f3591V = 0L;
            this.f3582K = false;
            this.f3592W = false;
            return super.dispatchTouchEvent(motionEvent);
        }
        if (!this.f3582K) {
            this.f3591V = System.currentTimeMillis();
        }
        switch (action) {
            case 211:
                if (this.f3577F && this.f3579H != 2 && rect.contains(x4, y4)) {
                    setupGoToTop(2);
                    throw null;
                }
                break;
            case 212:
                if (!this.f3577F || this.f3579H != 2) {
                    if (this.f3584M.hasMessages(1)) {
                        this.f3584M.removeMessages(1);
                    }
                    this.f3589T = 0L;
                    this.f3591V = 0L;
                    this.f3592W = false;
                    this.f3582K = false;
                    return super.dispatchTouchEvent(motionEvent);
                }
                Log.d("NestedScrollView", "pen up false GOTOTOP");
                if (canScrollVertically(-1)) {
                    i5 = 0;
                    w(0 - getScrollX(), 0 - getScrollY(), 250);
                    this.f3602h.onAbsorb(IDMCallbackStatusInterface.IDM_RESULTS);
                    invalidate();
                } else {
                    i5 = 0;
                }
                setupGoToTop(i5);
                int[] iArr4 = StateSet.NOTHING;
                throw null;
            case 213:
                if (this.f3577F && this.f3579H == 2 && !rect.contains(x4, y4)) {
                    this.f3579H = 1;
                    int[] iArr5 = StateSet.NOTHING;
                    throw null;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f3602h;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (k.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (k.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f3604i;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (k.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (k.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // J.InterfaceC0057n
    public final void e(View view, int i5, int i6, int i7, int i8, int i9) {
        q(null, i8, i9);
    }

    @Override // J.InterfaceC0057n
    public final boolean f(View view, View view2, int i5, int i6) {
        return (i5 & 2) != 0;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0059p c0059p = this.f3573A;
        return c0059p.f1479b | c0059p.f1478a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f3575C == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f3575C = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f3575C;
    }

    public final boolean h(int i5) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i5);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !p(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i5 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i5 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i5 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            k(maxScrollAmount);
        } else {
            Rect rect = this.f;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            int iJ = j(rect);
            this.f3619y = getScrollY();
            k(iJ);
            viewFindNextFocus.requestFocus(i5);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || p(viewFindFocus, 0, getHeight())) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(NetworkAnalyticsConstants.DataPoints.FLAG_PPID);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f3574B.f(0);
    }

    public final boolean i() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f3574B.f1474d;
    }

    public final int j(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i6 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i5 - verticalFadingEdgeLength : i5;
        int i7 = rect.bottom;
        if (i7 > i6 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i6, (childAt.getBottom() + layoutParams.bottomMargin) - i5);
        }
        if (rect.top >= scrollY || i7 >= i6) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i6 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public final void k(int i5) {
        if (i5 != 0) {
            if (this.f3611q) {
                w(0, i5, 250);
            } else {
                scrollBy(0, i5);
            }
        }
    }

    public final boolean l(KeyEvent keyEvent) {
        Rect rect = this.f;
        rect.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return !keyEvent.isAltPressed() ? h(33) : n(33);
                }
                if (keyCode == 20) {
                    return !keyEvent.isAltPressed() ? h(130) : n(130);
                }
                if (keyCode != 62) {
                    return false;
                }
                int i5 = keyEvent.isShiftPressed() ? 33 : 130;
                boolean z4 = i5 == 130;
                int height = getHeight();
                if (z4) {
                    rect.top = getScrollY() + height;
                    int childCount = getChildCount();
                    if (childCount > 0) {
                        View childAt2 = getChildAt(childCount - 1);
                        int paddingBottom = getPaddingBottom() + childAt2.getBottom() + ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin;
                        if (rect.top + height > paddingBottom) {
                            rect.top = paddingBottom - height;
                        }
                    }
                } else {
                    int scrollY = getScrollY() - height;
                    rect.top = scrollY;
                    if (scrollY < 0) {
                        rect.top = 0;
                    }
                }
                int i6 = rect.top;
                int i7 = height + i6;
                rect.bottom = i7;
                t(i5, i6, i7);
                return false;
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
        return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
    }

    public final void m(int i5) {
        if (getChildCount() > 0) {
            this.f3601g.fling(getScrollX(), getScrollY(), 0, i5, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            AbstractC0808b.o(this, Math.abs(this.f3601g.getCurrVelocity()));
            x(2, 1);
            this.f3619y = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i5, int i6) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i5, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i5, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i5, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i6, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(int i5) {
        int childCount;
        boolean z4 = i5 == 130;
        int height = getHeight();
        Rect rect = this.f;
        rect.top = 0;
        rect.bottom = height;
        if (z4 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return t(i5, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3607l = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i5;
        boolean z4;
        boolean z5;
        if (motionEvent.getAction() == 8 && !this.n) {
            float f = 0.0f;
            if (a.Z(motionEvent, 2)) {
                i5 = 9;
                axisValue = motionEvent.getAxisValue(9);
            } else if (a.Z(motionEvent, 4194304)) {
                i5 = 26;
                axisValue = motionEvent.getAxisValue(26);
            } else {
                axisValue = 0.0f;
                i5 = 0;
            }
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (getVerticalScrollFactorCompat() * axisValue);
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i6 = scrollY - verticalScrollFactorCompat;
                if (i6 < 0) {
                    if (!i() || a.Z(motionEvent, 8194)) {
                        z4 = false;
                    } else {
                        EdgeEffect edgeEffect = this.f3602h;
                        b.O(edgeEffect, (-i6) / getHeight(), 0.5f);
                        edgeEffect.onRelease();
                        invalidate();
                        z4 = true;
                    }
                    scrollRange = 0;
                } else {
                    if (i6 <= scrollRange) {
                        scrollRange = i6;
                    } else if (i() && !a.Z(motionEvent, 8194)) {
                        EdgeEffect edgeEffect2 = this.f3604i;
                        b.O(edgeEffect2, (i6 - scrollRange) / getHeight(), 0.5f);
                        edgeEffect2.onRelease();
                        invalidate();
                        z4 = true;
                    }
                    z4 = false;
                }
                if (i5 != 0) {
                    C0046c c0046c = this.g0;
                    c0046c.getClass();
                    int source = motionEvent.getSource();
                    int deviceId = motionEvent.getDeviceId();
                    int i7 = c0046c.f;
                    int[] iArr = c0046c.f1445h;
                    if (i7 == source && c0046c.f1444g == deviceId && c0046c.f1443e == i5) {
                        z5 = false;
                    } else {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(c0046c.f1439a);
                        iArr[0] = T.b(viewConfiguration, motionEvent.getDeviceId(), i5, motionEvent.getSource());
                        iArr[1] = T.a(viewConfiguration, motionEvent.getDeviceId(), i5, motionEvent.getSource());
                        c0046c.f = source;
                        c0046c.f1444g = deviceId;
                        c0046c.f1443e = i5;
                        z5 = true;
                    }
                    if (iArr[0] == Integer.MAX_VALUE) {
                        VelocityTracker velocityTracker = c0046c.f1441c;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            c0046c.f1441c = null;
                        }
                    } else {
                        if (c0046c.f1441c == null) {
                            c0046c.f1441c = VelocityTracker.obtain();
                        }
                        VelocityTracker velocityTracker2 = c0046c.f1441c;
                        Map map = B.f1412a;
                        velocityTracker2.addMovement(motionEvent);
                        velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
                        f.s(B.f1412a.get(velocityTracker2));
                        float fA = A.a(velocityTracker2, i5);
                        NestedScrollView nestedScrollView = (NestedScrollView) c0046c.f1440b.f95e;
                        float f5 = fA * (-nestedScrollView.getVerticalScrollFactorCompat());
                        float fSignum = Math.signum(f5);
                        if (z5 || (fSignum != Math.signum(c0046c.f1442d) && fSignum != 0.0f)) {
                            nestedScrollView.f3601g.abortAnimation();
                        }
                        if (Math.abs(f5) >= iArr[0]) {
                            float fMax = Math.max(-r4, Math.min(f5, iArr[1]));
                            if (fMax != 0.0f) {
                                nestedScrollView.f3601g.abortAnimation();
                                nestedScrollView.m((int) fMax);
                                f = fMax;
                            }
                            c0046c.f1442d = f;
                        }
                    }
                }
                if (scrollRange == scrollY) {
                    return z4;
                }
                super.scrollTo(getScrollX(), scrollRange);
                x(scrollRange, 1);
                if (!this.f3574B.c(0, scrollRange, null, null, 1)) {
                    super.scrollTo(getScrollX(), scrollRange);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) throws Resources.NotFoundException {
        int measuredHeight;
        super.onLayout(z4, i5, i6, i7, i8);
        this.f3606k = false;
        View view = this.f3608m;
        if (view != null && o(view, this)) {
            View view2 = this.f3608m;
            Rect rect = this.f;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iJ = j(rect);
            if (iJ != 0) {
                scrollBy(0, iJ);
            }
        }
        this.f3608m = null;
        if (z4) {
            getResources().getDimensionPixelOffset(com.wssyncmldm.R.dimen.sesl_nestedscrollview_overlay_feature_hidden_height);
        }
        if (!this.f3607l) {
            if (this.f3620z != null) {
                scrollTo(getScrollX(), this.f3620z.f1900d);
                this.f3620z = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i8 - i6) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int i9 = (paddingTop >= measuredHeight || scrollY < 0) ? 0 : paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            if (i9 != scrollY) {
                scrollTo(getScrollX(), i9);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3607l = true;
        if (!z4 || super.computeHorizontalScrollRange() > super.computeHorizontalScrollExtent()) {
            return;
        }
        this.f3595c0 = false;
        ViewParent parent = getParent();
        while (true) {
            if (parent == null || !(parent instanceof ViewGroup)) {
                break;
            }
            if (parent instanceof InterfaceC0057n) {
                for (Class<?> superclass = parent.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    if (superclass.getSimpleName().equals("CoordinatorLayout")) {
                        ViewGroup viewGroup = (ViewGroup) parent;
                        int[] iArr = this.f3597d0;
                        viewGroup.getLocationInWindow(iArr);
                        int height = viewGroup.getHeight() + iArr[1];
                        getLocationInWindow(iArr);
                        this.f3594b0 = iArr[1];
                        int height2 = getHeight() - (height - this.f3594b0);
                        this.f3599e0 = height2;
                        if (height2 < 0) {
                            this.f3599e0 = 0;
                        }
                        this.f3600f0 = this.f3599e0;
                        this.f3595c0 = true;
                    }
                }
            }
            parent = parent.getParent();
        }
        if (this.f3595c0) {
            return;
        }
        this.f3594b0 = 0;
        this.f3599e0 = 0;
        this.f3600f0 = 0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        if (this.f3610p && View.MeasureSpec.getMode(i6) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i5, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f5, boolean z4) {
        if (z4) {
            return false;
        }
        dispatchNestedFling(0.0f, f5, true);
        m((int) f5);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f5) {
        return dispatchNestedPreFling(f, f5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i5, int i6, int[] iArr) {
        this.f3574B.c(i5, i6, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i5, int i6, int i7, int i8) {
        q(null, i8, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i5) {
        a(view, view2, i5, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i5, int i6, boolean z4, boolean z5) {
        super.scrollTo(i5, i6);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i5, Rect rect) {
        if (i5 == 2) {
            i5 = 130;
        } else if (i5 == 1) {
            i5 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i5) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i5);
        if (viewFindNextFocus != null && p(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i5, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n nVar = (n) parcelable;
        super.onRestoreInstanceState(nVar.getSuperState());
        this.f3620z = nVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        n nVar = new n(super.onSaveInstanceState());
        nVar.f1900d = getScrollY();
        return nVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i5, int i6, int i7, int i8) {
        super.onScrollChanged(i5, i6, i7, i8);
        i();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !p(viewFindFocus, 0, i8)) {
            return;
        }
        Rect rect = this.f;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        k(j(rect));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i5) {
        return f(view, view2, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c(0, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0220  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instructions count: 771
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(View view, int i5, int i6) {
        Rect rect = this.f;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i5 >= getScrollY() && rect.top - i5 <= getScrollY() + i6;
    }

    public final void q(int[] iArr, int i5, int i6) {
        if (!this.f3576D || this.f3601g.isFinished()) {
            int scrollY = getScrollY();
            scrollBy(0, i5);
            this.f3619y = getScrollY();
            if (this.f3601g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            int scrollY2 = getScrollY() - scrollY;
            if (iArr != null) {
                iArr[1] = iArr[1] + scrollY2;
            }
            this.f3574B.d(0, scrollY2, 0, i5 - scrollY2, null, i6, iArr);
        }
    }

    public final void r(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3615u) {
            int i5 = actionIndex == 0 ? 1 : 0;
            this.f3605j = (int) motionEvent.getY(i5);
            this.f3615u = motionEvent.getPointerId(i5);
            VelocityTracker velocityTracker = this.f3609o;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f3606k) {
            this.f3608m = view2;
        } else {
            Rect rect = this.f;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iJ = j(rect);
            if (iJ != 0) {
                scrollBy(0, iJ);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iJ = j(rect);
        boolean z5 = iJ != 0;
        if (z5) {
            if (z4) {
                scrollBy(0, iJ);
            } else {
                w(0, iJ, 250);
            }
        }
        return z5;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        VelocityTracker velocityTracker;
        if (z4 && (velocityTracker = this.f3609o) != null) {
            velocityTracker.recycle();
            this.f3609o = null;
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f3606k = true;
        super.requestLayout();
    }

    public final boolean s(int i5, int i6, int i7, int i8) {
        boolean z4;
        boolean z5;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i9 = i7 + i5;
        if (i6 <= 0 && i6 >= 0) {
            z4 = false;
        } else {
            i6 = 0;
            z4 = true;
        }
        if (i9 > i8) {
            z5 = true;
        } else if (i9 < 0) {
            i8 = 0;
            z5 = true;
        } else {
            i8 = i9;
            z5 = false;
        }
        if (z5 && !this.f3574B.f(1)) {
            this.f3601g.springBack(i6, i8, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i6, i8);
        return z4 || z5;
    }

    @Override // android.view.View
    public final void scrollTo(int i5, int i6) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i5 < 0) {
                i5 = 0;
            } else if (width + i5 > width2) {
                i5 = width2 - width;
            }
            if (height >= height2 || i6 < 0) {
                i6 = 0;
            } else if (height + i6 > height2) {
                i6 = height2 - height;
            }
            if (i5 == getScrollX() && i6 == getScrollY()) {
                return;
            }
            super.scrollTo(i5, i6);
        }
    }

    public void setFillViewport(boolean z4) {
        if (z4 != this.f3610p) {
            this.f3610p = z4;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        C0056m c0056m = this.f3574B;
        if (c0056m.f1474d) {
            WeakHashMap weakHashMap = P.f1421a;
            H.z(c0056m.f1473c);
        }
        c0056m.f1474d = z4;
    }

    public void setOnScrollChangeListener(m mVar) {
    }

    public void setSmoothScrollingEnabled(boolean z4) {
        this.f3611q = z4;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i5) {
        return this.f3574B.g(i5, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        z(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t(int r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r17.getHeight()
            int r5 = r17.getScrollY()
            int r4 = r4 + r5
            r6 = 33
            if (r1 != r6) goto L17
            r6 = 1
            goto L18
        L17:
            r6 = 0
        L18:
            r9 = 2
            java.util.ArrayList r9 = r0.getFocusables(r9)
            int r10 = r9.size()
            r11 = 0
            r12 = 0
            r13 = 0
        L24:
            if (r12 >= r10) goto L6c
            java.lang.Object r14 = r9.get(r12)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r7 = r14.getBottom()
            if (r2 >= r7) goto L69
            if (r15 >= r3) goto L69
            if (r2 >= r15) goto L3f
            if (r7 >= r3) goto L3f
            r16 = 1
            goto L41
        L3f:
            r16 = 0
        L41:
            if (r11 != 0) goto L47
            r11 = r14
            r13 = r16
            goto L69
        L47:
            if (r6 == 0) goto L4f
            int r8 = r11.getTop()
            if (r15 < r8) goto L57
        L4f:
            if (r6 != 0) goto L59
            int r8 = r11.getBottom()
            if (r7 <= r8) goto L59
        L57:
            r7 = 1
            goto L5a
        L59:
            r7 = 0
        L5a:
            if (r13 == 0) goto L61
            if (r16 == 0) goto L69
            if (r7 == 0) goto L69
            goto L68
        L61:
            if (r16 == 0) goto L66
            r11 = r14
            r13 = 1
            goto L69
        L66:
            if (r7 == 0) goto L69
        L68:
            r11 = r14
        L69:
            int r12 = r12 + 1
            goto L24
        L6c:
            if (r11 != 0) goto L6f
            r11 = r0
        L6f:
            if (r2 < r5) goto L75
            if (r3 > r4) goto L75
            r7 = 0
            goto L7f
        L75:
            if (r6 == 0) goto L79
            int r2 = r2 - r5
            goto L7b
        L79:
            int r2 = r3 - r4
        L7b:
            r0.k(r2)
            r7 = 1
        L7f:
            android.view.View r0 = r17.findFocus()
            if (r11 == r0) goto L88
            r11.requestFocus(r1)
        L88:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.t(int, int, int):boolean");
    }

    public final boolean u(EdgeEffect edgeEffect, int i5) {
        if (i5 > 0) {
            return true;
        }
        float fT = b.t(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i5) * 0.35f;
        float f = this.f3596d * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d5 = f3571i0;
        return ((float) (Math.exp((d5 / (d5 - 1.0d)) * dLog) * ((double) f))) < fT;
    }

    public final void v(MotionEvent motionEvent, int i5) {
        motionEvent.getDevice();
        AbstractC0808b.n(this, motionEvent.getToolType(0), i5 == 20001 ? null : PointerIcon.getSystemIcon(this.f3593a0, i5));
    }

    public final void w(int i5, int i6, int i7) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f3598e > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f3601g.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i6 + scrollY, Math.max(0, height - height2))) - scrollY, i7);
            z(1);
            this.f3619y = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f3601g.isFinished()) {
                this.f3601g.abortAnimation();
                z(1);
            }
            scrollBy(i5, i6);
        }
        this.f3598e = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void x(int i5, int i6) {
        this.f3574B.g(i5, i6);
    }

    public final boolean y(MotionEvent motionEvent) {
        boolean z4;
        EdgeEffect edgeEffect = this.f3602h;
        if (b.t(edgeEffect) != 0.0f) {
            b.O(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z4 = true;
        } else {
            z4 = false;
        }
        EdgeEffect edgeEffect2 = this.f3604i;
        if (b.t(edgeEffect2) == 0.0f) {
            return z4;
        }
        b.O(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void z(int i5) {
        this.f3574B.h(i5);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5) {
        if (getChildCount() <= 0) {
            super.addView(view, i5);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i5, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
