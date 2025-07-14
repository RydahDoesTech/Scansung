package v1;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import o.C0713k;

/* renamed from: v1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0887b {

    /* renamed from: a, reason: collision with root package name */
    public final C0713k f9221a = new C0713k();

    /* renamed from: b, reason: collision with root package name */
    public final C0713k f9222b = new C0713k();

    public static C0887b a(Context context, int i5) throws Resources.NotFoundException {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i5);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return b(arrayList);
        } catch (Exception e5) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i5), e5);
            return null;
        }
    }

    public static C0887b b(ArrayList arrayList) {
        C0887b c0887b = new C0887b();
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            Animator animator = (Animator) arrayList.get(i5);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0887b.f9222b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC0886a.f9218b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC0886a.f9219c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC0886a.f9220d;
            }
            C0888c c0888c = new C0888c();
            c0888c.f9226d = 0;
            c0888c.f9227e = 1;
            c0888c.f9223a = startDelay;
            c0888c.f9224b = duration;
            c0888c.f9225c = interpolator;
            c0888c.f9226d = objectAnimator.getRepeatCount();
            c0888c.f9227e = objectAnimator.getRepeatMode();
            c0887b.f9221a.put(propertyName, c0888c);
        }
        return c0887b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0887b) {
            return this.f9221a.equals(((C0887b) obj).f9221a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9221a.hashCode();
    }

    public final String toString() {
        return "\n" + C0887b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f9221a + "}\n";
    }
}
