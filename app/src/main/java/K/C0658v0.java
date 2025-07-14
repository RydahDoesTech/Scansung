package k;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: k.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0658v0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0662x0 f7826a;

    public C0658v0(C0662x0 c0662x0) {
        this.f7826a = c0662x0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i5, int i6, int i7) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i5) {
        if (i5 == 1) {
            C0662x0 c0662x0 = this.f7826a;
            if (c0662x0.f7836A.getInputMethodMode() == 2 || c0662x0.f7836A.getContentView() == null) {
                return;
            }
            Handler handler = c0662x0.f7855w;
            RunnableC0656u0 runnableC0656u0 = c0662x0.f7851s;
            handler.removeCallbacks(runnableC0656u0);
            runnableC0656u0.run();
        }
    }
}
