package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import b3.AbstractC0219i;

/* renamed from: androidx.fragment.app.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0123k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0125m f3864a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f3865b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3866c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v0 f3867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0120h f3868e;

    public C0123k(C0125m c0125m, View view, boolean z4, v0 v0Var, C0120h c0120h) {
        this.f3864a = c0125m;
        this.f3865b = view;
        this.f3866c = z4;
        this.f3867d = v0Var;
        this.f3868e = c0120h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AbstractC0219i.e("anim", animator);
        ViewGroup viewGroup = this.f3864a.f3889a;
        View view = this.f3865b;
        viewGroup.endViewTransition(view);
        v0 v0Var = this.f3867d;
        if (this.f3866c) {
            int i5 = v0Var.f3927a;
            AbstractC0219i.d("viewToAnimate", view);
            A3.f.a(i5, view);
        }
        this.f3868e.a();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + v0Var + " has ended.");
        }
    }
}
