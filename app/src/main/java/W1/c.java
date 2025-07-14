package w1;

import J.P;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.n;
import java.util.WeakHashMap;
import w.AbstractC0899a;

/* loaded from: classes.dex */
public abstract class c extends AbstractC0899a {

    /* renamed from: a, reason: collision with root package name */
    public n f9297a;

    @Override // w.AbstractC0899a
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i5) {
        s(coordinatorLayout, view, i5);
        if (this.f9297a == null) {
            this.f9297a = new n(view);
        }
        n nVar = this.f9297a;
        View view2 = nVar.f5890d;
        nVar.f5891e = view2.getTop();
        nVar.f = view2.getLeft();
        n nVar2 = this.f9297a;
        View view3 = nVar2.f5890d;
        int top = 0 - (view3.getTop() - nVar2.f5891e);
        WeakHashMap weakHashMap = P.f1421a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - nVar2.f));
        return true;
    }

    public void s(CoordinatorLayout coordinatorLayout, View view, int i5) {
        coordinatorLayout.q(i5, view);
    }
}
