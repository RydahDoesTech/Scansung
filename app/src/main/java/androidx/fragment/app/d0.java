package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d0 extends androidx.lifecycle.X {

    /* renamed from: g, reason: collision with root package name */
    public static final b4.d f3813g = new b4.d();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3817d;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3814a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3815b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3816c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3818e = false;
    public boolean f = false;

    public d0(boolean z4) {
        this.f3817d = z4;
    }

    public final void b(Fragment fragment) {
        if (this.f) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        HashMap map = this.f3814a;
        if (map.containsKey(fragment.mWho)) {
            return;
        }
        map.put(fragment.mWho, fragment);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public final void c(Fragment fragment, boolean z4) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        e(fragment.mWho, z4);
    }

    public final void d(String str, boolean z4) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        e(str, z4);
    }

    public final void e(String str, boolean z4) {
        HashMap map = this.f3815b;
        d0 d0Var = (d0) map.get(str);
        if (d0Var != null) {
            if (z4) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(d0Var.f3815b.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    d0Var.d((String) it.next(), true);
                }
            }
            d0Var.onCleared();
            map.remove(str);
        }
        HashMap map2 = this.f3816c;
        androidx.lifecycle.b0 b0Var = (androidx.lifecycle.b0) map2.get(str);
        if (b0Var != null) {
            b0Var.a();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f3814a.equals(d0Var.f3814a) && this.f3815b.equals(d0Var.f3815b) && this.f3816c.equals(d0Var.f3816c);
    }

    public final void f(Fragment fragment) {
        if (this.f) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f3814a.remove(fragment.mWho) == null || !Log.isLoggable("FragmentManager", 2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public final int hashCode() {
        return this.f3816c.hashCode() + ((this.f3815b.hashCode() + (this.f3814a.hashCode() * 31)) * 31);
    }

    @Override // androidx.lifecycle.X
    public final void onCleared() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f3818e = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f3814a.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f3815b.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f3816c.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
