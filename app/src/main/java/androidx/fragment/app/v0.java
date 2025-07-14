package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import b3.AbstractC0219i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k.Q0;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public int f3927a;

    /* renamed from: b, reason: collision with root package name */
    public int f3928b;

    /* renamed from: c, reason: collision with root package name */
    public final Fragment f3929c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3930d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f3931e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3932g;

    /* renamed from: h, reason: collision with root package name */
    public final h0 f3933h;

    public v0(int i5, int i6, h0 h0Var, F.f fVar) {
        A3.f.q(i5, "finalState");
        A3.f.q(i6, "lifecycleImpact");
        AbstractC0219i.e("fragmentStateManager", h0Var);
        Fragment fragment = h0Var.f3844c;
        AbstractC0219i.d("fragmentStateManager.fragment", fragment);
        A3.f.q(i5, "finalState");
        A3.f.q(i6, "lifecycleImpact");
        AbstractC0219i.e("fragment", fragment);
        this.f3927a = i5;
        this.f3928b = i6;
        this.f3929c = fragment;
        this.f3930d = new ArrayList();
        this.f3931e = new LinkedHashSet();
        fVar.a(new F.e() { // from class: androidx.fragment.app.w0
            @Override // F.e
            public final void onCancel() {
                v0 v0Var = this.f3935d;
                AbstractC0219i.e("this$0", v0Var);
                v0Var.a();
            }
        });
        this.f3933h = h0Var;
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        LinkedHashSet linkedHashSet = this.f3931e;
        if (linkedHashSet.isEmpty()) {
            b();
            return;
        }
        for (F.f fVar : P2.m.Q0(linkedHashSet)) {
            synchronized (fVar) {
                try {
                    if (!fVar.f618a) {
                        fVar.f618a = true;
                        fVar.f620c = true;
                        F.e eVar = fVar.f619b;
                        if (eVar != null) {
                            try {
                                eVar.onCancel();
                            } catch (Throwable th) {
                                synchronized (fVar) {
                                    fVar.f620c = false;
                                    fVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (fVar) {
                            fVar.f620c = false;
                            fVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f3932g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f3932g = true;
            Iterator it = this.f3930d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f3933h.k();
    }

    public final void c(int i5, int i6) {
        A3.f.q(i5, "finalState");
        A3.f.q(i6, "lifecycleImpact");
        int iC = Q0.c(i6);
        Fragment fragment = this.f3929c;
        if (iC == 0) {
            if (this.f3927a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + A3.f.x(this.f3927a) + " -> " + A3.f.x(i5) + '.');
                }
                this.f3927a = i5;
                return;
            }
            return;
        }
        if (iC == 1) {
            if (this.f3927a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + A3.f.w(this.f3928b) + " to ADDING.");
                }
                this.f3927a = 2;
                this.f3928b = 2;
                return;
            }
            return;
        }
        if (iC != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + A3.f.x(this.f3927a) + " -> REMOVED. mLifecycleImpact  = " + A3.f.w(this.f3928b) + " to REMOVING.");
        }
        this.f3927a = 1;
        this.f3928b = 3;
    }

    public final void d() {
        int i5 = this.f3928b;
        h0 h0Var = this.f3933h;
        if (i5 != 2) {
            if (i5 == 3) {
                Fragment fragment = h0Var.f3844c;
                AbstractC0219i.d("fragmentStateManager.fragment", fragment);
                View viewRequireView = fragment.requireView();
                AbstractC0219i.d("fragment.requireView()", viewRequireView);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + fragment);
                }
                viewRequireView.clearFocus();
                return;
            }
            return;
        }
        Fragment fragment2 = h0Var.f3844c;
        AbstractC0219i.d("fragmentStateManager.fragment", fragment2);
        View viewFindFocus = fragment2.mView.findFocus();
        if (viewFindFocus != null) {
            fragment2.setFocusedView(viewFindFocus);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment2);
            }
        }
        View viewRequireView2 = this.f3929c.requireView();
        AbstractC0219i.d("this.fragment.requireView()", viewRequireView2);
        if (viewRequireView2.getParent() == null) {
            h0Var.b();
            viewRequireView2.setAlpha(0.0f);
        }
        if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
            viewRequireView2.setVisibility(4);
        }
        viewRequireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + A3.f.x(this.f3927a) + " lifecycleImpact = " + A3.f.w(this.f3928b) + " fragment = " + this.f3929c + '}';
    }
}
