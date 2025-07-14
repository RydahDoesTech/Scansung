package k;

import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatSpinner;

/* renamed from: k.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0590E implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7488e;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0590E(int i5, Object obj) {
        this.f7487d = i5;
        this.f7488e = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f7487d) {
            case 0:
                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) this.f7488e;
                if (!appCompatSpinner.getInternalPopup().b()) {
                    appCompatSpinner.f3309i.e(AbstractC0592G.b(appCompatSpinner), AbstractC0592G.a(appCompatSpinner));
                }
                ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    AbstractC0591F.a(viewTreeObserver, this);
                    break;
                }
                break;
            default:
                C0598M c0598m = (C0598M) this.f7488e;
                c0598m.s();
                c0598m.r();
                break;
        }
    }
}
