package k;

import android.view.View;
import android.view.ViewConfiguration;
import j.InterfaceC0508y;

/* renamed from: k.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0645o0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final float f7756d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7757e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final View f7758g;

    /* renamed from: h, reason: collision with root package name */
    public RunnableC0643n0 f7759h;

    /* renamed from: i, reason: collision with root package name */
    public RunnableC0643n0 f7760i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7761j;

    /* renamed from: k, reason: collision with root package name */
    public int f7762k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f7763l = new int[2];

    public AbstractViewOnTouchListenerC0645o0(View view) {
        this.f7758g = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f7756d = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f7757e = tapTimeout;
        this.f = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0643n0 runnableC0643n0 = this.f7760i;
        View view = this.f7758g;
        if (runnableC0643n0 != null) {
            view.removeCallbacks(runnableC0643n0);
        }
        RunnableC0643n0 runnableC0643n02 = this.f7759h;
        if (runnableC0643n02 != null) {
            view.removeCallbacks(runnableC0643n02);
        }
    }

    public abstract InterfaceC0508y b();

    public abstract boolean c();

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0108  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.AbstractViewOnTouchListenerC0645o0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f7761j = false;
        this.f7762k = -1;
        RunnableC0643n0 runnableC0643n0 = this.f7759h;
        if (runnableC0643n0 != null) {
            this.f7758g.removeCallbacks(runnableC0643n0);
        }
    }
}
