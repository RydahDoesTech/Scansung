package Z;

import android.util.Log;
import androidx.fragment.app.Fragment;
import b3.AbstractC0219i;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2849a = c.f2848a;

    public static c a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                AbstractC0219i.d("declaringFragment.parentFragmentManager", fragment.getParentFragmentManager());
            }
            fragment = fragment.getParentFragment();
        }
        return f2849a;
    }

    public static void b(i iVar) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(iVar.f2851d.getClass().getName()), iVar);
        }
    }

    public static final void c(Fragment fragment, String str) {
        AbstractC0219i.e("fragment", fragment);
        AbstractC0219i.e("previousFragmentId", str);
        b(new a(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str));
        a(fragment).getClass();
    }
}
