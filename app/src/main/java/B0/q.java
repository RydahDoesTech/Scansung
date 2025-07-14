package B0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.chip.SeslChipGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f148b;

    public /* synthetic */ q(int i5, Object obj) {
        this.f147a = i5;
        this.f148b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f147a) {
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f148b;
                actionBarOverlayLayout.f3281z = null;
                actionBarOverlayLayout.n = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f147a) {
            case 0:
                ((t) this.f148b).n();
                animator.removeListener(this);
                break;
            case 1:
                C0.f fVar = (C0.f) this.f148b;
                ArrayList arrayList = new ArrayList(fVar.f279h);
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ColorStateList colorStateList = ((D1.a) arrayList.get(i5)).f468b.f483r;
                    if (colorStateList != null) {
                        C.a.h(fVar, colorStateList);
                    }
                }
                break;
            case 2:
                super.onAnimationEnd(animator);
                SeslChipGroup seslChipGroup = (SeslChipGroup) this.f148b;
                ViewGroup.LayoutParams layoutParams = seslChipGroup.getLayoutParams();
                layoutParams.height = -2;
                seslChipGroup.f5843q = 0;
                seslChipGroup.setLayoutParams(layoutParams);
                break;
            case 3:
                R1.k kVar = (R1.k) this.f148b;
                kVar.q();
                kVar.f2398r.start();
                break;
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f148b;
                actionBarOverlayLayout.f3281z = null;
                actionBarOverlayLayout.n = false;
                break;
            default:
                ((HideBottomViewOnScrollBehavior) this.f148b).f5732h = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f147a) {
            case 1:
                C0.f fVar = (C0.f) this.f148b;
                ArrayList arrayList = new ArrayList(fVar.f279h);
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    D1.c cVar = ((D1.a) arrayList.get(i5)).f468b;
                    ColorStateList colorStateList = cVar.f483r;
                    if (colorStateList != null) {
                        C.a.g(fVar, colorStateList.getColorForState(cVar.f487v, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
