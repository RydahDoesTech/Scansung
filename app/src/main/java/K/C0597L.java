package k;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* renamed from: k.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0597L implements PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0590E f7527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0598M f7528e;

    public C0597L(C0598M c0598m, ViewTreeObserverOnGlobalLayoutListenerC0590E viewTreeObserverOnGlobalLayoutListenerC0590E) {
        this.f7528e = c0598m;
        this.f7527d = viewTreeObserverOnGlobalLayoutListenerC0590E;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f7528e.f7532G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f7527d);
        }
    }
}
