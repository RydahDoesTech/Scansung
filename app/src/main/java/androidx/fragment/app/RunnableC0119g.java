package androidx.fragment.app;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import b3.AbstractC0219i;

/* renamed from: androidx.fragment.app.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0119g implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3836d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3837e;
    public final /* synthetic */ Object f;

    public /* synthetic */ RunnableC0119g(C0122j c0122j, v0 v0Var) {
        this.f3837e = c0122j;
        this.f = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3836d) {
            case 0:
                s0.g((Rect) this.f, (View) this.f3837e);
                break;
            default:
                C0122j c0122j = (C0122j) this.f3837e;
                AbstractC0219i.e("$transitionInfo", c0122j);
                v0 v0Var = (v0) this.f;
                AbstractC0219i.e("$operation", v0Var);
                c0122j.a();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Transition for operation " + v0Var + " has completed");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC0119g(s0 s0Var, View view, Rect rect) {
        this.f3837e = view;
        this.f = rect;
    }
}
