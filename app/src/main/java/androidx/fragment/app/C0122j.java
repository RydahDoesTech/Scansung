package androidx.fragment.app;

import android.transition.Transition;

/* renamed from: androidx.fragment.app.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122j extends AbstractC0121i {

    /* renamed from: c, reason: collision with root package name */
    public final Object f3853c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3854d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3855e;

    public C0122j(v0 v0Var, F.f fVar, boolean z4, boolean z5) {
        super(v0Var, fVar);
        int i5 = v0Var.f3927a;
        Fragment fragment = v0Var.f3929c;
        this.f3853c = i5 == 2 ? z4 ? fragment.getReenterTransition() : fragment.getEnterTransition() : z4 ? fragment.getReturnTransition() : fragment.getExitTransition();
        this.f3854d = v0Var.f3927a == 2 ? z4 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
        this.f3855e = z5 ? z4 ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
    }

    public final s0 c() {
        Object obj = this.f3853c;
        s0 s0VarD = d(obj);
        Object obj2 = this.f3855e;
        s0 s0VarD2 = d(obj2);
        if (s0VarD == null || s0VarD2 == null || s0VarD == s0VarD2) {
            return s0VarD == null ? s0VarD2 : s0VarD;
        }
        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f3847a.f3929c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
    }

    public final s0 d(Object obj) {
        if (obj == null) {
            return null;
        }
        q0 q0Var = l0.f3887a;
        if (obj instanceof Transition) {
            return q0Var;
        }
        s0 s0Var = l0.f3888b;
        if (s0Var != null && s0Var.e(obj)) {
            return s0Var;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f3847a.f3929c + " is not a valid framework Transition or AndroidX Transition");
    }
}
