package j0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: j0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0535d implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7151e;
    public final /* synthetic */ C0542k f;

    public /* synthetic */ RunnableC0535d(C0542k c0542k, ArrayList arrayList, int i5) {
        this.f7150d = i5;
        this.f = c0542k;
        this.f7151e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        long j5;
        RunnableC0535d runnableC0535d = this;
        switch (runnableC0535d.f7150d) {
            case 0:
                ArrayList arrayList2 = runnableC0535d.f7151e;
                Iterator it = arrayList2.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    C0542k c0542k = runnableC0535d.f;
                    if (!zHasNext) {
                        arrayList2.clear();
                        c0542k.f7209j.remove(arrayList2);
                        break;
                    } else {
                        C0541j c0541j = (C0541j) it.next();
                        b0 b0Var = c0541j.f7189a;
                        c0542k.getClass();
                        View view = b0Var.f7128a;
                        int i5 = c0541j.f7192d - c0541j.f7190b;
                        int i6 = c0541j.f7193e - c0541j.f7191c;
                        if (i5 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i6 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        viewPropertyAnimatorAnimate.setInterpolator(C0542k.f7204s);
                        c0542k.f7212m.add(b0Var);
                        RecyclerView recyclerView = c0542k.f7055c;
                        if (recyclerView != null && recyclerView.f4837r1 != -1 && b0Var.b() == recyclerView.f4814i.g() - 1) {
                            viewPropertyAnimatorAnimate.setUpdateListener(new C0537f(recyclerView, 0));
                        }
                        viewPropertyAnimatorAnimate.setDuration(400L).setListener(new C0538g(c0542k, b0Var, i5, view, i6, viewPropertyAnimatorAnimate)).start();
                    }
                }
                break;
            case 1:
                ArrayList arrayList3 = runnableC0535d.f7151e;
                Iterator it2 = arrayList3.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    C0542k c0542k2 = runnableC0535d.f;
                    if (!zHasNext2) {
                        arrayList3.clear();
                        c0542k2.f7210k.remove(arrayList3);
                        break;
                    } else {
                        C0540i c0540i = (C0540i) it2.next();
                        c0542k2.getClass();
                        b0 b0Var2 = c0540i.f7181a;
                        View view2 = b0Var2 == null ? null : b0Var2.f7128a;
                        b0 b0Var3 = c0540i.f7182b;
                        View view3 = b0Var3 != null ? b0Var3.f7128a : null;
                        PathInterpolator pathInterpolator = C0542k.f7204s;
                        ArrayList arrayList4 = c0542k2.f7213o;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(400L);
                            arrayList4.add(c0540i.f7181a);
                            duration.translationX(c0540i.f7185e - c0540i.f7183c);
                            duration.translationY(c0540i.f - c0540i.f7184d);
                            arrayList = arrayList3;
                            j5 = 400;
                            duration.alpha(0.0f).setDuration(400L).setInterpolator(pathInterpolator).setListener(new C0539h(c0542k2, c0540i, duration, view2, 0)).start();
                        } else {
                            arrayList = arrayList3;
                            j5 = 400;
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList4.add(c0540i.f7182b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j5).alpha(1.0f).setInterpolator(pathInterpolator).setListener(new C0539h(c0542k2, c0540i, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                        runnableC0535d = this;
                        arrayList3 = arrayList;
                    }
                }
            default:
                ArrayList arrayList5 = runnableC0535d.f7151e;
                Iterator it3 = arrayList5.iterator();
                while (true) {
                    boolean zHasNext3 = it3.hasNext();
                    C0542k c0542k3 = runnableC0535d.f;
                    if (!zHasNext3) {
                        arrayList5.clear();
                        c0542k3.f7208i.remove(arrayList5);
                        break;
                    } else {
                        b0 b0Var4 = (b0) it3.next();
                        c0542k3.getClass();
                        View view4 = b0Var4.f7128a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        long j6 = (view4.getTag() == null || !view4.getTag().equals("preferencecategory")) ? 200L : 0L;
                        c0542k3.f7211l.add(b0Var4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(j6).setListener(new C0536e(c0542k3, b0Var4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                }
                break;
        }
    }
}
