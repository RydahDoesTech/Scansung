package j0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7216a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f7217b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f7218c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f7219d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f7220e;
    public final /* synthetic */ StaggeredGridLayoutManager f;

    public k0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i5) {
        this.f = staggeredGridLayoutManager;
        this.f7220e = i5;
    }

    public final void a() {
        View view = (View) this.f7216a.get(r0.size() - 1);
        h0 h0Var = (h0) view.getLayoutParams();
        this.f7218c = this.f.f4872r.b(view);
        h0Var.getClass();
    }

    public final void b() {
        this.f7216a.clear();
        this.f7217b = Integer.MIN_VALUE;
        this.f7218c = Integer.MIN_VALUE;
        this.f7219d = 0;
    }

    public final int c() {
        boolean z4 = this.f.f4877w;
        ArrayList arrayList = this.f7216a;
        return z4 ? e(arrayList.size() - 1, -1, false, true) : e(0, arrayList.size(), false, true);
    }

    public final int d() {
        boolean z4 = this.f.f4877w;
        ArrayList arrayList = this.f7216a;
        return z4 ? e(0, arrayList.size(), false, true) : e(arrayList.size() - 1, -1, false, true);
    }

    public final int e(int i5, int i6, boolean z4, boolean z5) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        int iK = staggeredGridLayoutManager.f4872r.k();
        int iG = staggeredGridLayoutManager.f4872r.g();
        int i7 = i6 > i5 ? 1 : -1;
        while (i5 != i6) {
            View view = (View) this.f7216a.get(i5);
            int iE = staggeredGridLayoutManager.f4872r.e(view);
            int iB = staggeredGridLayoutManager.f4872r.b(view);
            boolean z6 = false;
            boolean z7 = !z5 ? iE >= iG : iE > iG;
            if (!z5 ? iB > iK : iB >= iK) {
                z6 = true;
            }
            if (z7 && z6) {
                if (z4) {
                    return AbstractC0519J.F(view);
                }
                if (iE < iK || iB > iG) {
                    return AbstractC0519J.F(view);
                }
            }
            i5 += i7;
        }
        return -1;
    }

    public final int f(int i5) {
        int i6 = this.f7218c;
        if (i6 != Integer.MIN_VALUE) {
            return i6;
        }
        if (this.f7216a.size() == 0) {
            return i5;
        }
        a();
        return this.f7218c;
    }

    public final View g(int i5, int i6) {
        ArrayList arrayList = this.f7216a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        View view = null;
        if (i6 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f4877w && AbstractC0519J.F(view2) >= i5) || ((!staggeredGridLayoutManager.f4877w && AbstractC0519J.F(view2) <= i5) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i7 = 0;
            while (i7 < size2) {
                View view3 = (View) arrayList.get(i7);
                if ((staggeredGridLayoutManager.f4877w && AbstractC0519J.F(view3) <= i5) || ((!staggeredGridLayoutManager.f4877w && AbstractC0519J.F(view3) >= i5) || !view3.hasFocusable())) {
                    break;
                }
                i7++;
                view = view3;
            }
        }
        return view;
    }

    public final int h(int i5) {
        int i6 = this.f7217b;
        if (i6 != Integer.MIN_VALUE) {
            return i6;
        }
        if (this.f7216a.size() == 0) {
            return i5;
        }
        View view = (View) this.f7216a.get(0);
        h0 h0Var = (h0) view.getLayoutParams();
        this.f7217b = this.f.f4872r.e(view);
        h0Var.getClass();
        return this.f7217b;
    }
}
