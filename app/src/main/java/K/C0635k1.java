package k;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.SeslProgressBar;
import java.lang.ref.WeakReference;

/* renamed from: k.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0635k1 extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f7714a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f7715b = new Handler(Looper.getMainLooper());

    public C0635k1(SeslProgressBar seslProgressBar) {
        this.f7714a = new WeakReference(seslProgressBar);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.f7715b.post(new RunnableC0634k0(1, this));
    }
}
