package androidx.fragment.app;

import J.InterfaceC0049f;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.EnumC0154q;
import androidx.lifecycle.InterfaceC0159w;
import b3.AbstractC0219i;
import com.wssyncmldm.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import z.InterfaceC0942e;
import z.InterfaceC0943f;

/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: A, reason: collision with root package name */
    public androidx.activity.result.e f3753A;

    /* renamed from: B, reason: collision with root package name */
    public androidx.activity.result.e f3754B;

    /* renamed from: C, reason: collision with root package name */
    public ArrayDeque f3755C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f3756D;
    public boolean E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f3757F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f3758G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f3759H;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f3760I;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f3761J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f3762K;

    /* renamed from: L, reason: collision with root package name */
    public d0 f3763L;

    /* renamed from: M, reason: collision with root package name */
    public final RunnableC0126n f3764M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3766b;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f3768d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3769e;

    /* renamed from: g, reason: collision with root package name */
    public androidx.activity.v f3770g;

    /* renamed from: l, reason: collision with root package name */
    public final I f3775l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f3776m;
    public final P n;

    /* renamed from: o, reason: collision with root package name */
    public final P f3777o;

    /* renamed from: p, reason: collision with root package name */
    public final P f3778p;

    /* renamed from: q, reason: collision with root package name */
    public final P f3779q;

    /* renamed from: r, reason: collision with root package name */
    public final T f3780r;

    /* renamed from: s, reason: collision with root package name */
    public int f3781s;

    /* renamed from: t, reason: collision with root package name */
    public M f3782t;

    /* renamed from: u, reason: collision with root package name */
    public K f3783u;

    /* renamed from: v, reason: collision with root package name */
    public Fragment f3784v;

    /* renamed from: w, reason: collision with root package name */
    public Fragment f3785w;

    /* renamed from: x, reason: collision with root package name */
    public final U f3786x;

    /* renamed from: y, reason: collision with root package name */
    public final Y0.h f3787y;

    /* renamed from: z, reason: collision with root package name */
    public androidx.activity.result.e f3788z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3765a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final i0 f3767c = new i0();
    public final O f = new O(this);

    /* renamed from: h, reason: collision with root package name */
    public final S f3771h = new S(this);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f3772i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f3773j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f3774k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.P] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.P] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.P] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.P] */
    public a0() {
        Collections.synchronizedMap(new HashMap());
        this.f3775l = new I(this);
        this.f3776m = new CopyOnWriteArrayList();
        final int i5 = 0;
        this.n = new I.a(this) { // from class: androidx.fragment.app.P

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f3734b;

            {
                this.f3734b = this;
            }

            @Override // I.a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        a0 a0Var = this.f3734b;
                        if (a0Var.H()) {
                            a0Var.h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        a0 a0Var2 = this.f3734b;
                        if (a0Var2.H() && num.intValue() == 80) {
                            a0Var2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        y.i iVar = (y.i) obj;
                        a0 a0Var3 = this.f3734b;
                        if (a0Var3.H()) {
                            a0Var3.m(iVar.f9325a, false);
                            break;
                        }
                        break;
                    default:
                        y.y yVar = (y.y) obj;
                        a0 a0Var4 = this.f3734b;
                        if (a0Var4.H()) {
                            a0Var4.r(yVar.f9347a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i6 = 1;
        this.f3777o = new I.a(this) { // from class: androidx.fragment.app.P

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f3734b;

            {
                this.f3734b = this;
            }

            @Override // I.a
            public final void accept(Object obj) {
                switch (i6) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        a0 a0Var = this.f3734b;
                        if (a0Var.H()) {
                            a0Var.h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        a0 a0Var2 = this.f3734b;
                        if (a0Var2.H() && num.intValue() == 80) {
                            a0Var2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        y.i iVar = (y.i) obj;
                        a0 a0Var3 = this.f3734b;
                        if (a0Var3.H()) {
                            a0Var3.m(iVar.f9325a, false);
                            break;
                        }
                        break;
                    default:
                        y.y yVar = (y.y) obj;
                        a0 a0Var4 = this.f3734b;
                        if (a0Var4.H()) {
                            a0Var4.r(yVar.f9347a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i7 = 2;
        this.f3778p = new I.a(this) { // from class: androidx.fragment.app.P

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f3734b;

            {
                this.f3734b = this;
            }

            @Override // I.a
            public final void accept(Object obj) {
                switch (i7) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        a0 a0Var = this.f3734b;
                        if (a0Var.H()) {
                            a0Var.h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        a0 a0Var2 = this.f3734b;
                        if (a0Var2.H() && num.intValue() == 80) {
                            a0Var2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        y.i iVar = (y.i) obj;
                        a0 a0Var3 = this.f3734b;
                        if (a0Var3.H()) {
                            a0Var3.m(iVar.f9325a, false);
                            break;
                        }
                        break;
                    default:
                        y.y yVar = (y.y) obj;
                        a0 a0Var4 = this.f3734b;
                        if (a0Var4.H()) {
                            a0Var4.r(yVar.f9347a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i8 = 3;
        this.f3779q = new I.a(this) { // from class: androidx.fragment.app.P

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f3734b;

            {
                this.f3734b = this;
            }

            @Override // I.a
            public final void accept(Object obj) {
                switch (i8) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        a0 a0Var = this.f3734b;
                        if (a0Var.H()) {
                            a0Var.h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        a0 a0Var2 = this.f3734b;
                        if (a0Var2.H() && num.intValue() == 80) {
                            a0Var2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        y.i iVar = (y.i) obj;
                        a0 a0Var3 = this.f3734b;
                        if (a0Var3.H()) {
                            a0Var3.m(iVar.f9325a, false);
                            break;
                        }
                        break;
                    default:
                        y.y yVar = (y.y) obj;
                        a0 a0Var4 = this.f3734b;
                        if (a0Var4.H()) {
                            a0Var4.r(yVar.f9347a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f3780r = new T(this);
        this.f3781s = -1;
        this.f3786x = new U(this);
        this.f3787y = new Y0.h(10);
        this.f3755C = new ArrayDeque();
        this.f3764M = new RunnableC0126n(2, this);
    }

    public static boolean G(Fragment fragment) {
        if (!fragment.mHasMenu || !fragment.mMenuVisible) {
            Iterator it = fragment.mChildFragmentManager.f3767c.e().iterator();
            boolean zG = false;
            while (it.hasNext()) {
                Fragment fragment2 = (Fragment) it.next();
                if (fragment2 != null) {
                    zG = G(fragment2);
                }
                if (zG) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean I(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        a0 a0Var = fragment.mFragmentManager;
        return fragment.equals(a0Var.f3785w) && I(a0Var.f3784v);
    }

    public static void X(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final Fragment A(int i5) {
        i0 i0Var = this.f3767c;
        ArrayList arrayList = i0Var.f3849a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i5) {
                return fragment;
            }
        }
        for (h0 h0Var : i0Var.f3850b.values()) {
            if (h0Var != null) {
                Fragment fragment2 = h0Var.f3844c;
                if (fragment2.mFragmentId == i5) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment B(String str) {
        i0 i0Var = this.f3767c;
        ArrayList arrayList = i0Var.f3849a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && str.equals(fragment.mTag)) {
                return fragment;
            }
        }
        for (h0 h0Var : i0Var.f3850b.values()) {
            if (h0Var != null) {
                Fragment fragment2 = h0Var.f3844c;
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final ViewGroup C(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f3783u.c()) {
            View viewB = this.f3783u.b(fragment.mContainerId);
            if (viewB instanceof ViewGroup) {
                return (ViewGroup) viewB;
            }
        }
        return null;
    }

    public final U D() {
        Fragment fragment = this.f3784v;
        return fragment != null ? fragment.mFragmentManager.D() : this.f3786x;
    }

    public final Y0.h E() {
        Fragment fragment = this.f3784v;
        return fragment != null ? fragment.mFragmentManager.E() : this.f3787y;
    }

    public final void F(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        W(fragment);
    }

    public final boolean H() {
        Fragment fragment = this.f3784v;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f3784v.getParentFragmentManager().H();
    }

    public final void J(int i5, boolean z4) {
        HashMap map;
        M m4;
        if (this.f3782t == null && i5 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z4 || i5 != this.f3781s) {
            this.f3781s = i5;
            i0 i0Var = this.f3767c;
            Iterator it = i0Var.f3849a.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = i0Var.f3850b;
                if (!zHasNext) {
                    break;
                }
                h0 h0Var = (h0) map.get(((Fragment) it.next()).mWho);
                if (h0Var != null) {
                    h0Var.k();
                }
            }
            int size = map.size();
            for (h0 h0Var2 : map.values()) {
                if (h0Var2 != null) {
                    h0Var2.k();
                    Fragment fragment = h0Var2.f3844c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !i0Var.f3851c.containsKey(fragment.mWho)) {
                            i0Var.i(h0Var2.n(), fragment.mWho);
                        }
                        i0Var.h(h0Var2);
                    }
                }
                if (size != map.size()) {
                    Log.d("FragmentManager", i0Var + "[enhanced for loop] expected Active size is " + size + ", but " + map.size());
                }
            }
            Iterator it2 = i0Var.d().iterator();
            while (it2.hasNext()) {
                h0 h0Var3 = (h0) it2.next();
                Fragment fragment2 = h0Var3.f3844c;
                if (fragment2.mDeferStart) {
                    if (this.f3766b) {
                        this.f3759H = true;
                    } else {
                        fragment2.mDeferStart = false;
                        h0Var3.k();
                    }
                }
            }
            if (this.f3756D && (m4 = this.f3782t) != null && this.f3781s == 7) {
                ((G) m4).f3719h.invalidateMenu();
                this.f3756D = false;
            }
        }
    }

    public final void K() {
        if (this.f3782t == null) {
            return;
        }
        this.E = false;
        this.f3757F = false;
        this.f3763L.f = false;
        for (Fragment fragment : this.f3767c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final boolean L() {
        return M(-1, 0);
    }

    public final boolean M(int i5, int i6) {
        x(false);
        w(true);
        Fragment fragment = this.f3785w;
        if (fragment != null && i5 < 0 && fragment.getChildFragmentManager().L()) {
            return true;
        }
        boolean zN = N(this.f3760I, this.f3761J, i5, i6);
        if (zN) {
            this.f3766b = true;
            try {
                P(this.f3760I, this.f3761J);
            } finally {
                d();
            }
        }
        Z();
        boolean z4 = this.f3759H;
        i0 i0Var = this.f3767c;
        if (z4) {
            this.f3759H = false;
            Iterator it = i0Var.d().iterator();
            while (it.hasNext()) {
                h0 h0Var = (h0) it.next();
                Fragment fragment2 = h0Var.f3844c;
                if (fragment2.mDeferStart) {
                    if (this.f3766b) {
                        this.f3759H = true;
                    } else {
                        fragment2.mDeferStart = false;
                        h0Var.k();
                    }
                }
            }
        }
        i0Var.f3850b.values().removeAll(Collections.singleton(null));
        return zN;
    }

    public final boolean N(ArrayList arrayList, ArrayList arrayList2, int i5, int i6) {
        boolean z4 = (i6 & 1) != 0;
        ArrayList arrayList3 = this.f3768d;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i5 < 0) {
                size = z4 ? 0 : this.f3768d.size() - 1;
            } else {
                int size2 = this.f3768d.size() - 1;
                while (size2 >= 0) {
                    C0113a c0113a = (C0113a) this.f3768d.get(size2);
                    if (i5 >= 0 && i5 == c0113a.f3752s) {
                        break;
                    }
                    size2--;
                }
                if (size2 >= 0) {
                    if (z4) {
                        while (size2 > 0) {
                            C0113a c0113a2 = (C0113a) this.f3768d.get(size2 - 1);
                            if (i5 < 0 || i5 != c0113a2.f3752s) {
                                break;
                            }
                            size2--;
                        }
                    } else if (size2 != this.f3768d.size() - 1) {
                        size2++;
                    }
                    size = size2;
                } else {
                    size = size2;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f3768d.size() - 1; size3 >= size; size3--) {
            arrayList.add((C0113a) this.f3768d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void O(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        i0 i0Var = this.f3767c;
        synchronized (i0Var.f3849a) {
            i0Var.f3849a.remove(fragment);
        }
        fragment.mAdded = false;
        if (G(fragment)) {
            this.f3756D = true;
        }
        fragment.mRemoving = true;
        W(fragment);
    }

    public final void P(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            if (!((C0113a) arrayList.get(i5)).f3882p) {
                if (i6 != i5) {
                    z(arrayList, arrayList2, i6, i5);
                }
                i6 = i5 + 1;
                if (((Boolean) arrayList2.get(i5)).booleanValue()) {
                    while (i6 < size && ((Boolean) arrayList2.get(i6)).booleanValue() && !((C0113a) arrayList.get(i6)).f3882p) {
                        i6++;
                    }
                }
                z(arrayList, arrayList2, i5, i6);
                i5 = i6 - 1;
            }
            i5++;
        }
        if (i6 != size) {
            z(arrayList, arrayList2, i6, size);
        }
    }

    public final void Q(Bundle bundle) {
        int i5;
        I i6;
        int i7;
        h0 h0Var;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f3782t.f3728e.getClassLoader());
                this.f3774k.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f3782t.f3728e.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        i0 i0Var = this.f3767c;
        HashMap map2 = i0Var.f3851c;
        map2.clear();
        map2.putAll(map);
        c0 c0Var = (c0) bundle.getParcelable("state");
        if (c0Var == null) {
            return;
        }
        HashMap map3 = i0Var.f3850b;
        map3.clear();
        Log.d("FragmentManager", i0Var + " clear Active Fragments: " + map3 + ", mActive size: " + map3.size());
        Iterator it = c0Var.f3803d.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i5 = 2;
            i6 = this.f3775l;
            if (!zHasNext) {
                break;
            }
            Bundle bundleI = i0Var.i(null, (String) it.next());
            if (bundleI != null) {
                Fragment fragment = (Fragment) this.f3763L.f3814a.get(((f0) bundleI.getParcelable("state")).f3825e);
                if (fragment != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    h0Var = new h0(i6, i0Var, fragment, bundleI);
                } else {
                    h0Var = new h0(this.f3775l, this.f3767c, this.f3782t.f3728e.getClassLoader(), D(), bundleI);
                }
                Fragment fragment2 = h0Var.f3844c;
                fragment2.mSavedFragmentState = bundleI;
                fragment2.mFragmentManager = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment2.mWho + "): " + fragment2);
                }
                h0Var.l(this.f3782t.f3728e.getClassLoader());
                i0Var.g(h0Var);
                h0Var.f3846e = this.f3781s;
            }
        }
        d0 d0Var = this.f3763L;
        d0Var.getClass();
        Iterator it2 = new ArrayList(d0Var.f3814a.values()).iterator();
        while (it2.hasNext()) {
            Fragment fragment3 = (Fragment) it2.next();
            if (map3.get(fragment3.mWho) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + c0Var.f3803d);
                }
                this.f3763L.f(fragment3);
                fragment3.mFragmentManager = this;
                h0 h0Var2 = new h0(i6, i0Var, fragment3);
                h0Var2.f3846e = 1;
                h0Var2.k();
                fragment3.mRemoving = true;
                h0Var2.k();
            }
        }
        ArrayList<String> arrayList = c0Var.f3804e;
        i0Var.f3849a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment fragmentB = i0Var.b(str3);
                if (fragmentB == null) {
                    throw new IllegalStateException(A3.f.o("No instantiated fragment for (", str3, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + fragmentB);
                }
                i0Var.a(fragmentB);
            }
        }
        if (c0Var.f != null) {
            this.f3768d = new ArrayList(c0Var.f.length);
            int i8 = 0;
            while (true) {
                C0114b[] c0114bArr = c0Var.f;
                if (i8 >= c0114bArr.length) {
                    break;
                }
                C0114b c0114b = c0114bArr[i8];
                c0114b.getClass();
                C0113a c0113a = new C0113a(this);
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    int[] iArr = c0114b.f3789d;
                    if (i9 >= iArr.length) {
                        break;
                    }
                    j0 j0Var = new j0();
                    int i11 = i9 + 1;
                    j0Var.f3856a = iArr[i9];
                    if (Log.isLoggable("FragmentManager", i5)) {
                        Log.v("FragmentManager", "Instantiate " + c0113a + " op #" + i10 + " base fragment #" + iArr[i11]);
                    }
                    j0Var.f3862h = EnumC0154q.values()[c0114b.f[i10]];
                    j0Var.f3863i = EnumC0154q.values()[c0114b.f3791g[i10]];
                    int i12 = i9 + 2;
                    j0Var.f3858c = iArr[i11] != 0;
                    int i13 = iArr[i12];
                    j0Var.f3859d = i13;
                    int i14 = iArr[i9 + 3];
                    j0Var.f3860e = i14;
                    int i15 = i9 + 5;
                    int i16 = iArr[i9 + 4];
                    j0Var.f = i16;
                    i9 += 6;
                    int i17 = iArr[i15];
                    j0Var.f3861g = i17;
                    c0113a.f3870b = i13;
                    c0113a.f3871c = i14;
                    c0113a.f3872d = i16;
                    c0113a.f3873e = i17;
                    c0113a.b(j0Var);
                    i10++;
                    i5 = 2;
                }
                c0113a.f = c0114b.f3792h;
                c0113a.f3876i = c0114b.f3793i;
                c0113a.f3874g = true;
                c0113a.f3877j = c0114b.f3795k;
                c0113a.f3878k = c0114b.f3796l;
                c0113a.f3879l = c0114b.f3797m;
                c0113a.f3880m = c0114b.n;
                c0113a.n = c0114b.f3798o;
                c0113a.f3881o = c0114b.f3799p;
                c0113a.f3882p = c0114b.f3800q;
                c0113a.f3752s = c0114b.f3794j;
                int i18 = 0;
                while (true) {
                    ArrayList arrayList2 = c0114b.f3790e;
                    if (i18 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i18);
                    if (str4 != null) {
                        ((j0) c0113a.f3869a.get(i18)).f3857b = i0Var.b(str4);
                    }
                    i18++;
                }
                c0113a.d(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i8 + " (index " + c0113a.f3752s + "): " + c0113a);
                    PrintWriter printWriter = new PrintWriter(new I.b(1));
                    c0113a.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f3768d.add(c0113a);
                i8++;
                i5 = 2;
            }
            i7 = 0;
        } else {
            i7 = 0;
            this.f3768d = null;
        }
        this.f3772i.set(c0Var.f3805g);
        String str5 = c0Var.f3806h;
        if (str5 != null) {
            Fragment fragmentB2 = i0Var.b(str5);
            this.f3785w = fragmentB2;
            q(fragmentB2);
        }
        ArrayList arrayList3 = c0Var.f3807i;
        if (arrayList3 != null) {
            for (int i19 = i7; i19 < arrayList3.size(); i19++) {
                this.f3773j.put((String) arrayList3.get(i19), (C0115c) c0Var.f3808j.get(i19));
            }
        }
        this.f3755C = new ArrayDeque(c0Var.f3809k);
    }

    public final Bundle R() {
        int i5;
        ArrayList arrayList;
        C0114b[] c0114bArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0125m c0125m = (C0125m) it.next();
            if (c0125m.f3893e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0125m.f3893e = false;
                c0125m.e();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0125m) it2.next()).h();
        }
        x(true);
        this.E = true;
        this.f3763L.f = true;
        i0 i0Var = this.f3767c;
        i0Var.getClass();
        HashMap map = i0Var.f3850b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (h0 h0Var : map.values()) {
            if (h0Var != null) {
                Fragment fragment = h0Var.f3844c;
                i0Var.i(h0Var.n(), fragment.mWho);
                arrayList2.add(fragment.mWho);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        HashMap map2 = this.f3767c.f3851c;
        if (!map2.isEmpty()) {
            i0 i0Var2 = this.f3767c;
            synchronized (i0Var2.f3849a) {
                try {
                    if (i0Var2.f3849a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(i0Var2.f3849a.size());
                        Iterator it3 = i0Var2.f3849a.iterator();
                        while (it3.hasNext()) {
                            Fragment fragment2 = (Fragment) it3.next();
                            arrayList.add(fragment2.mWho);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.mWho + "): " + fragment2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList3 = this.f3768d;
            if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                c0114bArr = null;
            } else {
                c0114bArr = new C0114b[size];
                for (i5 = 0; i5 < size; i5++) {
                    c0114bArr[i5] = new C0114b((C0113a) this.f3768d.get(i5));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i5 + ": " + this.f3768d.get(i5));
                    }
                }
            }
            c0 c0Var = new c0();
            c0Var.f3806h = null;
            ArrayList arrayList4 = new ArrayList();
            c0Var.f3807i = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            c0Var.f3808j = arrayList5;
            c0Var.f3803d = arrayList2;
            c0Var.f3804e = arrayList;
            c0Var.f = c0114bArr;
            c0Var.f3805g = this.f3772i.get();
            Fragment fragment3 = this.f3785w;
            if (fragment3 != null) {
                c0Var.f3806h = fragment3.mWho;
            }
            arrayList4.addAll(this.f3773j.keySet());
            arrayList5.addAll(this.f3773j.values());
            c0Var.f3809k = new ArrayList(this.f3755C);
            bundle.putParcelable("state", c0Var);
            for (String str : this.f3774k.keySet()) {
                bundle.putBundle(g4.f.d("result_", str), (Bundle) this.f3774k.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(g4.f.d("fragment_", str2), (Bundle) map2.get(str2));
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void S() {
        synchronized (this.f3765a) {
            try {
                if (this.f3765a.size() == 1) {
                    this.f3782t.f.removeCallbacks(this.f3764M);
                    this.f3782t.f.post(this.f3764M);
                    Z();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void T(Fragment fragment, boolean z4) {
        ViewGroup viewGroupC = C(fragment);
        if (viewGroupC == null || !(viewGroupC instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupC).setDrawDisappearingViewsLast(!z4);
    }

    public final void U(Fragment fragment, EnumC0154q enumC0154q) {
        if (fragment.equals(this.f3767c.b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = enumC0154q;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void V(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.f3767c.b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
            }
        }
        Fragment fragment2 = this.f3785w;
        this.f3785w = fragment;
        q(fragment2);
        q(this.f3785w);
    }

    public final void W(Fragment fragment) {
        ViewGroup viewGroupC = C(fragment);
        if (viewGroupC != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (viewGroupC.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupC.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) viewGroupC.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final void Y(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new I.b(1));
        M m4 = this.f3782t;
        if (m4 == null) {
            try {
                u("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e5) {
                Log.e("FragmentManager", "Failed dumping state", e5);
                throw illegalStateException;
            }
        }
        try {
            ((G) m4).f3719h.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e6) {
            Log.e("FragmentManager", "Failed dumping state", e6);
            throw illegalStateException;
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [a3.a, b3.h] */
    /* JADX WARN: Type inference failed for: r4v6, types: [a3.a, b3.h] */
    public final void Z() {
        synchronized (this.f3765a) {
            try {
                if (!this.f3765a.isEmpty()) {
                    S s2 = this.f3771h;
                    s2.f3737a = true;
                    ?? r4 = s2.f3739c;
                    if (r4 != 0) {
                        r4.a();
                    }
                    return;
                }
                S s4 = this.f3771h;
                ArrayList arrayList = this.f3768d;
                s4.f3737a = (arrayList != null ? arrayList.size() : 0) > 0 && I(this.f3784v);
                ?? r42 = s4.f3739c;
                if (r42 != 0) {
                    r42.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final h0 a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            Z.d.c(fragment, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        h0 h0VarF = f(fragment);
        fragment.mFragmentManager = this;
        i0 i0Var = this.f3767c;
        i0Var.g(h0VarF);
        if (!fragment.mDetached) {
            i0Var.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (G(fragment)) {
                this.f3756D = true;
            }
        }
        return h0VarF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(M m4, K k5, Fragment fragment) {
        if (this.f3782t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f3782t = m4;
        this.f3783u = k5;
        this.f3784v = fragment;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3776m;
        if (fragment != null) {
            copyOnWriteArrayList.add(new V(fragment));
        } else if (m4 instanceof e0) {
            copyOnWriteArrayList.add((e0) m4);
        }
        if (this.f3784v != null) {
            Z();
        }
        if (m4 instanceof androidx.activity.w) {
            androidx.activity.w wVar = (androidx.activity.w) m4;
            androidx.activity.v onBackPressedDispatcher = wVar.getOnBackPressedDispatcher();
            this.f3770g = onBackPressedDispatcher;
            InterfaceC0159w interfaceC0159w = wVar;
            if (fragment != null) {
                interfaceC0159w = fragment;
            }
            onBackPressedDispatcher.a(interfaceC0159w, this.f3771h);
        }
        if (fragment != null) {
            d0 d0Var = fragment.mFragmentManager.f3763L;
            HashMap map = d0Var.f3815b;
            d0 d0Var2 = (d0) map.get(fragment.mWho);
            if (d0Var2 == null) {
                d0Var2 = new d0(d0Var.f3817d);
                map.put(fragment.mWho, d0Var2);
            }
            this.f3763L = d0Var2;
        } else if (m4 instanceof androidx.lifecycle.c0) {
            this.f3763L = (d0) new D3.c(((androidx.lifecycle.c0) m4).getViewModelStore(), d0.f3813g).d(d0.class);
        } else {
            this.f3763L = new d0(false);
        }
        d0 d0Var3 = this.f3763L;
        d0Var3.f = this.E || this.f3757F;
        this.f3767c.f3852d = d0Var3;
        Object obj = this.f3782t;
        if ((obj instanceof w0.f) && fragment == null) {
            w0.d savedStateRegistry = ((w0.f) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new D(1, this));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                Q(bundleA);
            }
        }
        Object obj2 = this.f3782t;
        if (obj2 instanceof androidx.activity.result.i) {
            androidx.activity.result.h activityResultRegistry = ((androidx.activity.result.i) obj2).getActivityResultRegistry();
            String strD = g4.f.d("FragmentManager:", fragment != null ? A3.f.p(new StringBuilder(), fragment.mWho, ":") : "");
            this.f3788z = activityResultRegistry.d(g4.f.c(strD, "StartActivityForResult"), new W(2), new Q(this, 1));
            this.f3753A = activityResultRegistry.d(g4.f.c(strD, "StartIntentSenderForResult"), new W(0), new Q(this, 2));
            this.f3754B = activityResultRegistry.d(g4.f.c(strD, "RequestPermissions"), new W(1), new Q(this, 0));
        }
        Object obj3 = this.f3782t;
        if (obj3 instanceof InterfaceC0942e) {
            ((InterfaceC0942e) obj3).addOnConfigurationChangedListener(this.n);
        }
        Object obj4 = this.f3782t;
        if (obj4 instanceof InterfaceC0943f) {
            ((InterfaceC0943f) obj4).addOnTrimMemoryListener(this.f3777o);
        }
        Object obj5 = this.f3782t;
        if (obj5 instanceof y.w) {
            ((y.w) obj5).addOnMultiWindowModeChangedListener(this.f3778p);
        }
        Object obj6 = this.f3782t;
        if (obj6 instanceof y.x) {
            ((y.x) obj6).addOnPictureInPictureModeChangedListener(this.f3779q);
        }
        Object obj7 = this.f3782t;
        if ((obj7 instanceof InterfaceC0049f) && fragment == null) {
            ((InterfaceC0049f) obj7).addMenuProvider(this.f3780r);
        }
    }

    public final void c(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f3767c.a(fragment);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (G(fragment)) {
                this.f3756D = true;
            }
        }
    }

    public final void d() {
        this.f3766b = false;
        this.f3761J.clear();
        this.f3760I.clear();
    }

    public final HashSet e() {
        C0125m c0125m;
        HashSet hashSet = new HashSet();
        Iterator it = this.f3767c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((h0) it.next()).f3844c.mContainer;
            if (viewGroup != null) {
                AbstractC0219i.e("factory", E());
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C0125m) {
                    c0125m = (C0125m) tag;
                } else {
                    c0125m = new C0125m(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c0125m);
                }
                hashSet.add(c0125m);
            }
        }
        return hashSet;
    }

    public final h0 f(Fragment fragment) {
        String str = fragment.mWho;
        i0 i0Var = this.f3767c;
        h0 h0Var = (h0) i0Var.f3850b.get(str);
        if (h0Var != null) {
            return h0Var;
        }
        h0 h0Var2 = new h0(this.f3775l, i0Var, fragment);
        h0Var2.l(this.f3782t.f3728e.getClassLoader());
        h0Var2.f3846e = this.f3781s;
        return h0Var2;
    }

    public final void g(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            i0 i0Var = this.f3767c;
            synchronized (i0Var.f3849a) {
                i0Var.f3849a.remove(fragment);
            }
            fragment.mAdded = false;
            if (G(fragment)) {
                this.f3756D = true;
            }
            W(fragment);
        }
    }

    public final void h(boolean z4, Configuration configuration) {
        if (z4 && (this.f3782t instanceof InterfaceC0942e)) {
            Y(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f3767c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z4) {
                    fragment.mChildFragmentManager.h(true, configuration);
                }
            }
        }
    }

    public final boolean i(MenuItem menuItem) {
        if (this.f3781s < 1) {
            return false;
        }
        for (Fragment fragment : this.f3767c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(Menu menu, MenuInflater menuInflater) {
        if (this.f3781s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z4 = false;
        for (Fragment fragment : this.f3767c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z4 = true;
            }
        }
        if (this.f3769e != null) {
            for (int i5 = 0; i5 < this.f3769e.size(); i5++) {
                Fragment fragment2 = (Fragment) this.f3769e.get(i5);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f3769e = arrayList;
        return z4;
    }

    public final void k() {
        boolean zIsChangingConfigurations = true;
        this.f3758G = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0125m) it.next()).h();
        }
        M m4 = this.f3782t;
        boolean z4 = m4 instanceof androidx.lifecycle.c0;
        i0 i0Var = this.f3767c;
        if (z4) {
            zIsChangingConfigurations = i0Var.f3852d.f3818e;
        } else {
            H h3 = m4.f3728e;
            if (h3 != null) {
                zIsChangingConfigurations = true ^ h3.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.f3773j.values().iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((C0115c) it2.next()).f3801d.iterator();
                while (it3.hasNext()) {
                    i0Var.f3852d.d((String) it3.next(), false);
                }
            }
        }
        t(-1);
        Object obj = this.f3782t;
        if (obj instanceof InterfaceC0943f) {
            ((InterfaceC0943f) obj).removeOnTrimMemoryListener(this.f3777o);
        }
        Object obj2 = this.f3782t;
        if (obj2 instanceof InterfaceC0942e) {
            ((InterfaceC0942e) obj2).removeOnConfigurationChangedListener(this.n);
        }
        Object obj3 = this.f3782t;
        if (obj3 instanceof y.w) {
            ((y.w) obj3).removeOnMultiWindowModeChangedListener(this.f3778p);
        }
        Object obj4 = this.f3782t;
        if (obj4 instanceof y.x) {
            ((y.x) obj4).removeOnPictureInPictureModeChangedListener(this.f3779q);
        }
        Object obj5 = this.f3782t;
        if ((obj5 instanceof InterfaceC0049f) && this.f3784v == null) {
            ((InterfaceC0049f) obj5).removeMenuProvider(this.f3780r);
        }
        this.f3782t = null;
        this.f3783u = null;
        this.f3784v = null;
        if (this.f3770g != null) {
            Iterator it4 = this.f3771h.f3738b.iterator();
            while (it4.hasNext()) {
                ((androidx.activity.c) it4.next()).cancel();
            }
            this.f3770g = null;
        }
        androidx.activity.result.e eVar = this.f3788z;
        if (eVar != null) {
            eVar.b();
            this.f3753A.b();
            this.f3754B.b();
        }
    }

    public final void l(boolean z4) {
        if (z4 && (this.f3782t instanceof InterfaceC0943f)) {
            Y(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f3767c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z4) {
                    fragment.mChildFragmentManager.l(true);
                }
            }
        }
    }

    public final void m(boolean z4, boolean z5) {
        if (z5 && (this.f3782t instanceof y.w)) {
            Y(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f3767c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z4);
                if (z5) {
                    fragment.mChildFragmentManager.m(z4, true);
                }
            }
        }
    }

    public final void n() {
        Iterator it = this.f3767c.e().iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.n();
            }
        }
    }

    public final boolean o(MenuItem menuItem) {
        if (this.f3781s < 1) {
            return false;
        }
        for (Fragment fragment : this.f3767c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void p(Menu menu) {
        if (this.f3781s < 1) {
            return;
        }
        for (Fragment fragment : this.f3767c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void q(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.f3767c.b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void r(boolean z4, boolean z5) {
        if (z5 && (this.f3782t instanceof y.x)) {
            Y(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f3767c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z4);
                if (z5) {
                    fragment.mChildFragmentManager.r(z4, true);
                }
            }
        }
    }

    public final boolean s(Menu menu) {
        boolean z4 = false;
        if (this.f3781s < 1) {
            return false;
        }
        for (Fragment fragment : this.f3767c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z4 = true;
            }
        }
        return z4;
    }

    public final void t(int i5) {
        try {
            this.f3766b = true;
            for (h0 h0Var : this.f3767c.f3850b.values()) {
                if (h0Var != null) {
                    h0Var.f3846e = i5;
                }
            }
            J(i5, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0125m) it.next()).h();
            }
            this.f3766b = false;
            x(true);
        } catch (Throwable th) {
            this.f3766b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f3784v;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f3784v)));
            sb.append("}");
        } else {
            M m4 = this.f3782t;
            if (m4 != null) {
                sb.append(m4.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f3782t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strC = g4.f.c(str, "    ");
        i0 i0Var = this.f3767c;
        i0Var.getClass();
        String str2 = str + "    ";
        HashMap map = i0Var.f3850b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (h0 h0Var : map.values()) {
                printWriter.print(str);
                if (h0Var != null) {
                    Fragment fragment = h0Var.f3844c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = i0Var.f3849a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i5 = 0; i5 < size3; i5++) {
                Fragment fragment2 = (Fragment) arrayList.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList arrayList2 = this.f3769e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i6 = 0; i6 < size2; i6++) {
                Fragment fragment3 = (Fragment) this.f3769e.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList arrayList3 = this.f3768d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i7 = 0; i7 < size; i7++) {
                C0113a c0113a = (C0113a) this.f3768d.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(c0113a.toString());
                c0113a.f(strC, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3772i.get());
        synchronized (this.f3765a) {
            try {
                int size4 = this.f3765a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i8 = 0; i8 < size4; i8++) {
                        Object obj = (Y) this.f3765a.get(i8);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i8);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3782t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3783u);
        if (this.f3784v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3784v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3781s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3757F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f3758G);
        if (this.f3756D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f3756D);
        }
    }

    public final void v(Y y4, boolean z4) {
        if (!z4) {
            if (this.f3782t == null) {
                if (!this.f3758G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.E || this.f3757F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f3765a) {
            try {
                if (this.f3782t == null) {
                    if (!z4) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f3765a.add(y4);
                    S();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(boolean z4) {
        if (this.f3766b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f3782t == null) {
            if (!this.f3758G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f3782t.f.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z4 && (this.E || this.f3757F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f3760I == null) {
            this.f3760I = new ArrayList();
            this.f3761J = new ArrayList();
        }
    }

    public final boolean x(boolean z4) {
        boolean zA;
        w(z4);
        boolean z5 = false;
        while (true) {
            ArrayList arrayList = this.f3760I;
            ArrayList arrayList2 = this.f3761J;
            synchronized (this.f3765a) {
                if (this.f3765a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f3765a.size();
                        zA = false;
                        for (int i5 = 0; i5 < size; i5++) {
                            zA |= ((Y) this.f3765a.get(i5)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zA) {
                break;
            }
            this.f3766b = true;
            try {
                P(this.f3760I, this.f3761J);
                d();
                z5 = true;
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        Z();
        if (this.f3759H) {
            this.f3759H = false;
            Iterator it = this.f3767c.d().iterator();
            while (it.hasNext()) {
                h0 h0Var = (h0) it.next();
                Fragment fragment = h0Var.f3844c;
                if (fragment.mDeferStart) {
                    if (this.f3766b) {
                        this.f3759H = true;
                    } else {
                        fragment.mDeferStart = false;
                        h0Var.k();
                    }
                }
            }
        }
        this.f3767c.f3850b.values().removeAll(Collections.singleton(null));
        return z5;
    }

    public final void y(C0113a c0113a, boolean z4) {
        if (z4 && (this.f3782t == null || this.f3758G)) {
            return;
        }
        w(z4);
        c0113a.a(this.f3760I, this.f3761J);
        this.f3766b = true;
        try {
            P(this.f3760I, this.f3761J);
            d();
            Z();
            boolean z5 = this.f3759H;
            i0 i0Var = this.f3767c;
            if (z5) {
                this.f3759H = false;
                Iterator it = i0Var.d().iterator();
                while (it.hasNext()) {
                    h0 h0Var = (h0) it.next();
                    Fragment fragment = h0Var.f3844c;
                    if (fragment.mDeferStart) {
                        if (this.f3766b) {
                            this.f3759H = true;
                        } else {
                            fragment.mDeferStart = false;
                            h0Var.k();
                        }
                    }
                }
            }
            i0Var.f3850b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0224 A[PHI: r13
  0x0224: PHI (r13v9 int) = (r13v8 int), (r13v10 int) binds: [B:103:0x0214, B:108:0x0220] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(java.util.ArrayList r23, java.util.ArrayList r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 1184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a0.z(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }
}
