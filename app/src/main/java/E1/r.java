package E1;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class r extends ValueAnimator {

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f601d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f602e;
    public ArrayList f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f603g;

    public static r b(float... fArr) {
        r rVar = new r();
        rVar.setFloatValues(fArr);
        rVar.f602e = fArr;
        rVar.f = new ArrayList();
        rVar.f603g = new ArrayList();
        return rVar;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final r clone() {
        r rVarB = b(this.f602e);
        ArrayList arrayList = this.f;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                rVarB.addUpdateListener((ValueAnimator.AnimatorUpdateListener) it.next());
            }
        }
        ArrayList arrayList2 = this.f603g;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                rVarB.addListener((Animator.AnimatorListener) it2.next());
            }
        }
        return rVarB;
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        super.addListener(animatorListener);
        this.f603g.add(animatorListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        super.addUpdateListener(animatorUpdateListener);
        this.f.add(animatorUpdateListener);
    }

    @Override // android.animation.Animator
    public final void setTarget(Object obj) {
        this.f601d = new WeakReference((View) obj);
        super.setTarget(obj);
    }
}
