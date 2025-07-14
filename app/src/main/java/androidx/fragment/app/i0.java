package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3849a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3850b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3851c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public d0 f3852d;

    public final void a(Fragment fragment) {
        if (this.f3849a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f3849a) {
            this.f3849a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public final Fragment b(String str) {
        h0 h0Var = (h0) this.f3850b.get(str);
        if (h0Var != null) {
            return h0Var.f3844c;
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment fragmentFindFragmentByWho;
        for (h0 h0Var : this.f3850b.values()) {
            if (h0Var != null && (fragmentFindFragmentByWho = h0Var.f3844c.findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (h0 h0Var : this.f3850b.values()) {
            if (h0Var != null) {
                arrayList.add(h0Var);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (h0 h0Var : this.f3850b.values()) {
            if (h0Var != null) {
                arrayList.add(h0Var.f3844c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.f3849a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3849a) {
            arrayList = new ArrayList(this.f3849a);
        }
        return arrayList;
    }

    public final void g(h0 h0Var) {
        Fragment fragment = h0Var.f3844c;
        String str = fragment.mWho;
        HashMap map = this.f3850b;
        if (map.get(str) != null) {
            return;
        }
        map.put(fragment.mWho, h0Var);
        Log.d("FragmentManager", this + " put " + fragment + " to Active Fragments, mActive size: " + map.size());
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.f3852d.b(fragment);
            } else {
                this.f3852d.f(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public final void h(h0 h0Var) {
        Fragment fragment = h0Var.f3844c;
        if (fragment.mRetainInstance) {
            this.f3852d.f(fragment);
        }
        HashMap map = this.f3850b;
        if (map.get(fragment.mWho) != h0Var) {
            return;
        }
        h0 h0Var2 = (h0) map.put(fragment.mWho, null);
        Log.d("FragmentManager", this + "put null to Active Fragments, mActive size: " + map.size() + ", fragment: " + fragment);
        if (h0Var2 != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    public final Bundle i(Bundle bundle, String str) {
        HashMap map = this.f3851c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }
}
