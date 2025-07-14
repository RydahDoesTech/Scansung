package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o0 implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3901a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3902b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3903c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q0 f3905e;

    public o0(q0 q0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f3905e = q0Var;
        this.f3901a = obj;
        this.f3902b = arrayList;
        this.f3903c = obj2;
        this.f3904d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        q0 q0Var = this.f3905e;
        Object obj = this.f3901a;
        if (obj != null) {
            q0Var.t(obj, this.f3902b, null);
        }
        Object obj2 = this.f3903c;
        if (obj2 != null) {
            q0Var.t(obj2, this.f3904d, null);
        }
    }
}
