package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class J extends AnimationSet implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final ViewGroup f3722d;

    /* renamed from: e, reason: collision with root package name */
    public final View f3723e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3724g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3725h;

    public J(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f3725h = true;
        this.f3722d = viewGroup;
        this.f3723e = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j5, Transformation transformation) {
        this.f3725h = true;
        if (this.f) {
            return !this.f3724g;
        }
        if (!super.getTransformation(j5, transformation)) {
            this.f = true;
            J.r.a(this.f3722d, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4 = this.f;
        ViewGroup viewGroup = this.f3722d;
        if (z4 || !this.f3725h) {
            viewGroup.endViewTransition(this.f3723e);
            this.f3724g = true;
        } else {
            this.f3725h = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j5, Transformation transformation, float f) {
        this.f3725h = true;
        if (this.f) {
            return !this.f3724g;
        }
        if (!super.getTransformation(j5, transformation, f)) {
            this.f = true;
            J.r.a(this.f3722d, this);
        }
        return true;
    }
}
