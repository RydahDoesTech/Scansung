package androidx.fragment.app;

import android.animation.Animator;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import b3.AbstractC0219i;
import java.lang.ref.WeakReference;

/* renamed from: androidx.fragment.app.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0131t implements q4.a, F.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3916e;

    public /* synthetic */ C0131t(Object obj, Object obj2) {
        this.f3915d = obj;
        this.f3916e = obj2;
    }

    @Override // q4.a
    public void a() {
        Animation animation;
        Fragment fragment = (Fragment) this.f3915d;
        fragment.getClass();
        View view = (View) ((WeakReference) this.f3916e).get();
        if (view != null && (animation = view.getAnimation()) != null && !animation.hasEnded()) {
            Log.d("FragmentManager", "Fragment Animation was canceled by back press");
            view.clearAnimation();
        }
        fragment.mDisposableHandle = null;
    }

    @Override // F.e
    public void onCancel() {
        v0 v0Var = (v0) this.f3916e;
        AbstractC0219i.e("$operation", v0Var);
        ((Animator) this.f3915d).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + v0Var + " has been canceled.");
        }
    }
}
