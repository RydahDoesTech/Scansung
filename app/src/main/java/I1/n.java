package I1;

import J.F;
import J.P;
import android.view.View;
import androidx.databinding.v;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class n implements View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f950d;

    public /* synthetic */ n(int i5) {
        this.f950d = i5;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f950d) {
            case 0:
                view.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = P.f1421a;
                F.c(view);
                break;
            default:
                v.getBinding(view).mRebindRunnable.run();
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i5 = this.f950d;
    }
}
