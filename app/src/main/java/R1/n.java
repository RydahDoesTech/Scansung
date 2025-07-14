package R1;

import J.P;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import j.ViewOnKeyListenerC0509z;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class n implements View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2402e;

    public /* synthetic */ n(int i5, Object obj) {
        this.f2401d = i5;
        this.f2402e = obj;
    }

    private final void a(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f2401d) {
            case 0:
                o oVar = (o) this.f2402e;
                if (oVar.f2421x != null && (accessibilityManager = oVar.f2420w) != null) {
                    WeakHashMap weakHashMap = P.f1421a;
                    if (oVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new K.b(oVar.f2421x));
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f2401d) {
            case 0:
                o oVar = (o) this.f2402e;
                I0.b bVar = oVar.f2421x;
                if (bVar != null && (accessibilityManager = oVar.f2420w) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new K.b(bVar));
                    break;
                }
                break;
            default:
                ViewOnKeyListenerC0509z viewOnKeyListenerC0509z = (ViewOnKeyListenerC0509z) this.f2402e;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0509z.f7044u;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0509z.f7044u = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0509z.f7044u.removeGlobalOnLayoutListener(viewOnKeyListenerC0509z.f7038o);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
