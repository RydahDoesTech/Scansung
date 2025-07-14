package j0;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: j0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0555x extends AbstractC0521L {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f7315a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f7316b = new f0(this);

    /* renamed from: c, reason: collision with root package name */
    public C0554w f7317c;

    /* renamed from: d, reason: collision with root package name */
    public C0554w f7318d;

    public static int c(View view, androidx.emoji2.text.f fVar) {
        return ((fVar.c(view) / 2) + fVar.e(view)) - ((fVar.l() / 2) + fVar.k());
    }

    public static View d(AbstractC0519J abstractC0519J, androidx.emoji2.text.f fVar) {
        int iV = abstractC0519J.v();
        View view = null;
        if (iV == 0) {
            return null;
        }
        int iL = (fVar.l() / 2) + fVar.k();
        int i5 = Integer.MAX_VALUE;
        for (int i6 = 0; i6 < iV; i6++) {
            View viewU = abstractC0519J.u(i6);
            int iAbs = Math.abs(((fVar.c(viewU) / 2) + fVar.e(viewU)) - iL);
            if (iAbs < i5) {
                view = viewU;
                i5 = iAbs;
            }
        }
        return view;
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f7315a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        f0 f0Var = this.f7316b;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.o0;
            if (arrayList != null) {
                arrayList.remove(f0Var);
            }
            this.f7315a.setOnFlingListener(null);
        }
        this.f7315a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f7315a.k(f0Var);
            this.f7315a.setOnFlingListener(this);
            new Scroller(this.f7315a.getContext(), new DecelerateInterpolator());
            new OverScroller(this.f7315a.getContext());
            h();
        }
    }

    public final int[] b(AbstractC0519J abstractC0519J, View view) {
        int[] iArr = new int[2];
        if (abstractC0519J.d()) {
            iArr[0] = c(view, f(abstractC0519J));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0519J.e()) {
            iArr[1] = c(view, g(abstractC0519J));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public View e(AbstractC0519J abstractC0519J) {
        if (abstractC0519J.e()) {
            return d(abstractC0519J, g(abstractC0519J));
        }
        if (abstractC0519J.d()) {
            return d(abstractC0519J, f(abstractC0519J));
        }
        return null;
    }

    public final androidx.emoji2.text.f f(AbstractC0519J abstractC0519J) {
        C0554w c0554w = this.f7318d;
        if (c0554w == null || ((AbstractC0519J) c0554w.f3651b) != abstractC0519J) {
            this.f7318d = new C0554w(abstractC0519J, 0);
        }
        return this.f7318d;
    }

    public final androidx.emoji2.text.f g(AbstractC0519J abstractC0519J) {
        C0554w c0554w = this.f7317c;
        if (c0554w == null || ((AbstractC0519J) c0554w.f3651b) != abstractC0519J) {
            this.f7317c = new C0554w(abstractC0519J, 1);
        }
        return this.f7317c;
    }

    public final void h() {
        AbstractC0519J layoutManager;
        View viewE;
        RecyclerView recyclerView = this.f7315a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewE = e(layoutManager)) == null) {
            return;
        }
        int[] iArrB = b(layoutManager, viewE);
        int i5 = iArrB[0];
        if (i5 == 0 && iArrB[1] == 0) {
            return;
        }
        this.f7315a.z0(i5, false, iArrB[1]);
    }
}
