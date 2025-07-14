package j0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: j0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0557z implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f7321e;

    public /* synthetic */ RunnableC0557z(RecyclerView recyclerView, int i5) {
        this.f7320d = i5;
        this.f7321e = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        long j5;
        RecyclerView recyclerView4 = this.f7321e;
        switch (this.f7320d) {
            case 0:
                View childAt = recyclerView4.getChildAt(0);
                if (childAt != null) {
                    childAt.requestFocus();
                    return;
                }
                return;
            case 1:
                if (!recyclerView4.f4852x || recyclerView4.isLayoutRequested()) {
                    return;
                }
                if (!recyclerView4.f4846v) {
                    recyclerView4.requestLayout();
                    return;
                } else if (recyclerView4.f4726A) {
                    recyclerView4.f4858z = true;
                    return;
                } else {
                    recyclerView4.u();
                    return;
                }
            case 2:
                boolean z4 = RecyclerView.f4719l2;
                recyclerView4.getClass();
                throw null;
            case 3:
                boolean z5 = RecyclerView.f4719l2;
                recyclerView4.getClass();
                throw null;
            case 4:
                recyclerView4.setupGoToTop(0);
                return;
            default:
                AbstractC0515F abstractC0515F = recyclerView4.f4767Q;
                if (abstractC0515F != null) {
                    C0542k c0542k = (C0542k) abstractC0515F;
                    ArrayList arrayList = c0542k.f7205e;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0542k.f7206g;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0542k.f7207h;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0542k.f;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        recyclerView2 = recyclerView4;
                    } else {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            b0 b0Var = (b0) it.next();
                            View view = b0Var.f7128a;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            if (view.getTag() == null || !view.getTag().equals("preferencecategory")) {
                                recyclerView3 = recyclerView4;
                                j5 = 100;
                            } else {
                                recyclerView3 = recyclerView4;
                                j5 = 0;
                            }
                            c0542k.n.add(b0Var);
                            viewPropertyAnimatorAnimate.setDuration(j5).alpha(0.0f).setListener(new C0536e(c0542k, b0Var, viewPropertyAnimatorAnimate, view)).start();
                            recyclerView4 = recyclerView3;
                        }
                        recyclerView2 = recyclerView4;
                        arrayList.clear();
                        if (!zIsEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            c0542k.f7209j.add(arrayList5);
                            arrayList2.clear();
                            new RunnableC0535d(c0542k, arrayList5, 0).run();
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            c0542k.f7210k.add(arrayList6);
                            arrayList3.clear();
                            new RunnableC0535d(c0542k, arrayList6, 1).run();
                        }
                        if (!zIsEmpty4) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            c0542k.f7208i.add(arrayList7);
                            arrayList4.clear();
                            RunnableC0535d runnableC0535d = new RunnableC0535d(c0542k, arrayList7, 2);
                            if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
                                runnableC0535d.run();
                            } else {
                                View view2 = ((b0) arrayList7.get(0)).f7128a;
                                if (view2.getTag() == null || !view2.getTag().equals("preferencecategory")) {
                                    WeakHashMap weakHashMap = J.P.f1421a;
                                    view2.postOnAnimationDelayed(runnableC0535d, 100L);
                                } else {
                                    runnableC0535d.run();
                                }
                            }
                        }
                    }
                    recyclerView = recyclerView2;
                } else {
                    recyclerView = recyclerView4;
                }
                recyclerView.f4839s0 = false;
                return;
        }
    }
}
