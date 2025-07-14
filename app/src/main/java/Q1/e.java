package Q1;

import A1.h;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import com.google.android.material.snackbar.SnackbarContentLayout;
import j.ViewOnKeyListenerC0509z;

/* loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2304e;

    public /* synthetic */ e(int i5, Object obj) {
        this.f2303d = i5;
        this.f2304e = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Button button;
        switch (this.f2303d) {
            case 0:
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) this.f2304e;
                snackbarContentLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (snackbarContentLayout.f5975h != null && (button = snackbarContentLayout.f5973e) != null && button.getVisibility() == 0) {
                    snackbarContentLayout.f5975h.post(new h(4, this));
                    break;
                }
                break;
            default:
                ViewOnKeyListenerC0509z viewOnKeyListenerC0509z = (ViewOnKeyListenerC0509z) this.f2304e;
                if (viewOnKeyListenerC0509z.b()) {
                    View view = viewOnKeyListenerC0509z.f7042s;
                    if (view != null && view.isShown()) {
                        viewOnKeyListenerC0509z.f7035k.r();
                        break;
                    } else {
                        viewOnKeyListenerC0509z.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
