package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import b3.AbstractC0219i;
import com.samsung.android.lib.episode.EternalContract;
import com.wssyncmldm.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import o.C0704b;
import o.C0710h;

/* renamed from: androidx.fragment.app.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0125m {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f3889a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3890b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3891c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3892d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3893e;

    public C0125m(ViewGroup viewGroup) {
        AbstractC0219i.e("container", viewGroup);
        this.f3889a = viewGroup;
        this.f3890b = new ArrayList();
        this.f3891c = new ArrayList();
    }

    public static void a(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (J.U.b(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            if (childAt.getVisibility() == 0) {
                a(childAt, arrayList);
            }
        }
    }

    public static void f(C0704b c0704b, View view) {
        WeakHashMap weakHashMap = J.P.f1421a;
        String strK = J.H.k(view);
        if (strK != null) {
            c0704b.put(strK, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = viewGroup.getChildAt(i5);
                if (childAt.getVisibility() == 0) {
                    f(c0704b, childAt);
                }
            }
        }
    }

    public static final C0125m i(ViewGroup viewGroup, a0 a0Var) {
        AbstractC0219i.e("container", viewGroup);
        AbstractC0219i.e("fragmentManager", a0Var);
        AbstractC0219i.d("fragmentManager.specialEffectsControllerFactory", a0Var.E());
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0125m) {
            return (C0125m) tag;
        }
        C0125m c0125m = new C0125m(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0125m);
        return c0125m;
    }

    public static void k(C0704b c0704b, Collection collection) {
        Set setEntrySet = c0704b.entrySet();
        AbstractC0219i.d(EternalContract.EXTRA_ENTRIES, setEntrySet);
        Iterator it = ((C0710h) setEntrySet).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            AbstractC0219i.e("entry", entry);
            View view = (View) entry.getValue();
            WeakHashMap weakHashMap = J.P.f1421a;
            if (!P2.m.q0(collection, J.H.k(view))) {
                it.remove();
            }
        }
    }

    public final void b(int i5, int i6, h0 h0Var) {
        synchronized (this.f3890b) {
            F.f fVar = new F.f();
            Fragment fragment = h0Var.f3844c;
            AbstractC0219i.d("fragmentStateManager.fragment", fragment);
            v0 v0VarG = g(fragment);
            if (v0VarG != null) {
                v0VarG.c(i5, i6);
                return;
            }
            final v0 v0Var = new v0(i5, i6, h0Var, fVar);
            this.f3890b.add(v0Var);
            final int i7 = 0;
            v0Var.f3930d.add(new Runnable(this) { // from class: androidx.fragment.app.u0

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ C0125m f3924e;

                {
                    this.f3924e = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i7) {
                        case 0:
                            C0125m c0125m = this.f3924e;
                            AbstractC0219i.e("this$0", c0125m);
                            v0 v0Var2 = v0Var;
                            if (c0125m.f3890b.contains(v0Var2)) {
                                int i8 = v0Var2.f3927a;
                                View view = v0Var2.f3929c.mView;
                                AbstractC0219i.d("operation.fragment.mView", view);
                                A3.f.a(i8, view);
                                break;
                            }
                            break;
                        default:
                            C0125m c0125m2 = this.f3924e;
                            AbstractC0219i.e("this$0", c0125m2);
                            v0 v0Var3 = v0Var;
                            c0125m2.f3890b.remove(v0Var3);
                            c0125m2.f3891c.remove(v0Var3);
                            break;
                    }
                }
            });
            final int i8 = 1;
            v0Var.f3930d.add(new Runnable(this) { // from class: androidx.fragment.app.u0

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ C0125m f3924e;

                {
                    this.f3924e = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i8) {
                        case 0:
                            C0125m c0125m = this.f3924e;
                            AbstractC0219i.e("this$0", c0125m);
                            v0 v0Var2 = v0Var;
                            if (c0125m.f3890b.contains(v0Var2)) {
                                int i82 = v0Var2.f3927a;
                                View view = v0Var2.f3929c.mView;
                                AbstractC0219i.d("operation.fragment.mView", view);
                                A3.f.a(i82, view);
                                break;
                            }
                            break;
                        default:
                            C0125m c0125m2 = this.f3924e;
                            AbstractC0219i.e("this$0", c0125m2);
                            v0 v0Var3 = v0Var;
                            c0125m2.f3890b.remove(v0Var3);
                            c0125m2.f3891c.remove(v0Var3);
                            break;
                    }
                }
            });
        }
    }

    public final void c(int i5, h0 h0Var) {
        A3.f.q(i5, "finalState");
        AbstractC0219i.e("fragmentStateManager", h0Var);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + h0Var.f3844c);
        }
        b(i5, 2, h0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0539 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0521 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.util.ArrayList r40, final boolean r41) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 2339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0125m.d(java.util.ArrayList, boolean):void");
    }

    public final void e() {
        if (this.f3893e) {
            return;
        }
        ViewGroup viewGroup = this.f3889a;
        WeakHashMap weakHashMap = J.P.f1421a;
        if (!viewGroup.isAttachedToWindow()) {
            h();
            this.f3892d = false;
            return;
        }
        synchronized (this.f3890b) {
            try {
                if (!this.f3890b.isEmpty()) {
                    ArrayList arrayListP0 = P2.m.P0(this.f3891c);
                    this.f3891c.clear();
                    Iterator it = arrayListP0.iterator();
                    while (it.hasNext()) {
                        v0 v0Var = (v0) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + v0Var);
                        }
                        v0Var.a();
                        if (!v0Var.f3932g) {
                            this.f3891c.add(v0Var);
                        }
                    }
                    l();
                    ArrayList arrayListP02 = P2.m.P0(this.f3890b);
                    this.f3890b.clear();
                    this.f3891c.addAll(arrayListP02);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = arrayListP02.iterator();
                    while (it2.hasNext()) {
                        ((v0) it2.next()).d();
                    }
                    d(arrayListP02, this.f3892d);
                    this.f3892d = false;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final v0 g(Fragment fragment) {
        Object next;
        Iterator it = this.f3890b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            v0 v0Var = (v0) next;
            if (AbstractC0219i.a(v0Var.f3929c, fragment) && !v0Var.f) {
                break;
            }
        }
        return (v0) next;
    }

    public final void h() {
        String str;
        String str2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f3889a;
        WeakHashMap weakHashMap = J.P.f1421a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f3890b) {
            try {
                l();
                Iterator it = this.f3890b.iterator();
                while (it.hasNext()) {
                    ((v0) it.next()).d();
                }
                Iterator it2 = P2.m.P0(this.f3891c).iterator();
                while (it2.hasNext()) {
                    v0 v0Var = (v0) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f3889a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + v0Var);
                    }
                    v0Var.a();
                }
                Iterator it3 = P2.m.P0(this.f3890b).iterator();
                while (it3.hasNext()) {
                    v0 v0Var2 = (v0) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f3889a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + v0Var2);
                    }
                    v0Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        Object objPrevious;
        synchronized (this.f3890b) {
            try {
                l();
                ArrayList arrayList = this.f3890b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    v0 v0Var = (v0) objPrevious;
                    View view = v0Var.f3929c.mView;
                    AbstractC0219i.d("operation.fragment.mView", view);
                    int iE = J2.b.e(view);
                    if (v0Var.f3927a == 2 && iE != 2) {
                        break;
                    }
                }
                v0 v0Var2 = (v0) objPrevious;
                Fragment fragment = v0Var2 != null ? v0Var2.f3929c : null;
                this.f3893e = fragment != null ? fragment.isPostponed() : false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        Iterator it = this.f3890b.iterator();
        while (it.hasNext()) {
            v0 v0Var = (v0) it.next();
            int i5 = 2;
            if (v0Var.f3928b == 2) {
                View viewRequireView = v0Var.f3929c.requireView();
                AbstractC0219i.d("fragment.requireView()", viewRequireView);
                int visibility = viewRequireView.getVisibility();
                if (visibility != 0) {
                    i5 = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(A3.f.l(visibility, "Unknown visibility "));
                        }
                        i5 = 3;
                    }
                }
                v0Var.c(i5, 1);
            }
        }
    }
}
