package O;

import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.samsung.android.knox.license.KnoxEnterpriseLicenseManager;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ NestedScrollView f1894e;

    public /* synthetic */ h(NestedScrollView nestedScrollView, int i5) {
        this.f1893d = i5;
        this.f1894e = nestedScrollView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4 = false;
        NestedScrollView nestedScrollView = this.f1894e;
        switch (this.f1893d) {
            case 0:
                float f = NestedScrollView.f3571i0;
                nestedScrollView.getClass();
                if (nestedScrollView.f3581J) {
                    if (nestedScrollView.getChildCount() <= 0 || !(nestedScrollView.getChildAt(0) instanceof ViewGroup)) {
                        z4 = true;
                    } else {
                        ViewGroup viewGroup = (ViewGroup) nestedScrollView.getChildAt(0);
                        if (viewGroup.getHeight() < nestedScrollView.getHeight()) {
                            Log.i("NestedScrollView", "GTT HSC not support : Small Height child");
                        } else {
                            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                                View childAt = viewGroup.getChildAt(i5);
                                if (childAt.getVisibility() != 8 && (childAt.canScrollVertically(1) || childAt.canScrollVertically(-1))) {
                                    Log.i("NestedScrollView", "GTT HSC not support : Some child view can scroll index: " + i5 + " " + childAt);
                                }
                            }
                            z4 = true;
                        }
                    }
                    nestedScrollView.f3580I = z4;
                    nestedScrollView.f3577F = z4;
                    return;
                }
                return;
            case 1:
                float f5 = NestedScrollView.f3571i0;
                nestedScrollView.getClass();
                throw null;
            case 2:
                float f6 = NestedScrollView.f3571i0;
                nestedScrollView.getClass();
                throw null;
            case 3:
                nestedScrollView.setupGoToTop(0);
                return;
            default:
                nestedScrollView.f3576D = true;
                if (Settings.System.getInt(nestedScrollView.getContext().getContentResolver(), "remove_animations", 0) == 1) {
                    nestedScrollView.scrollTo(0, 0);
                    return;
                } else {
                    nestedScrollView.w(0 - nestedScrollView.getScrollX(), 0 - nestedScrollView.getScrollY(), KnoxEnterpriseLicenseManager.ERROR_LICENSE_DEACTIVATED);
                    return;
                }
        }
    }
}
