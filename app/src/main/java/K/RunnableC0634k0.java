package k;

import android.graphics.drawable.AnimatedVectorDrawable;
import androidx.appcompat.widget.SeslProgressBar;
import androidx.appcompat.widget.Toolbar;

/* renamed from: k.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0634k0 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7713e;

    public /* synthetic */ RunnableC0634k0(int i5, Object obj) {
        this.f7712d = i5;
        this.f7713e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7712d) {
            case 0:
                C0637l0 c0637l0 = (C0637l0) this.f7713e;
                c0637l0.f7725o = null;
                c0637l0.drawableStateChanged();
                break;
            case 1:
                SeslProgressBar seslProgressBar = (SeslProgressBar) ((C0635k1) this.f7713e).f7714a.get();
                if (seslProgressBar != null) {
                    ((AnimatedVectorDrawable) seslProgressBar.f3383F).start();
                    break;
                }
                break;
            default:
                ((Toolbar) this.f7713e).w();
                break;
        }
    }
}
