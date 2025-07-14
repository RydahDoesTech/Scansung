package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.EnumC0153p;
import androidx.lifecycle.InterfaceC0157u;
import androidx.lifecycle.InterfaceC0159w;
import androidx.lifecycle.Q;
import androidx.lifecycle.X;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import b3.AbstractC0219i;
import com.samsung.android.knox.ex.KnoxContract;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import w0.b;
import w0.d;
import w0.f;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/u;", "e/l", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Recreator implements InterfaceC0157u {

    /* renamed from: a, reason: collision with root package name */
    public final f f4923a;

    public Recreator(f fVar) {
        this.f4923a = fVar;
    }

    @Override // androidx.lifecycle.InterfaceC0157u
    public final void a(InterfaceC0159w interfaceC0159w, EnumC0153p enumC0153p) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (enumC0153p != EnumC0153p.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC0159w.getLifecycle().b(this);
        f fVar = this.f4923a;
        Bundle bundleA = fVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(b.class);
                AbstractC0219i.d("{\n                Class.…class.java)\n            }", clsAsSubclass);
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        AbstractC0219i.d("{\n                constr…wInstance()\n            }", objNewInstance);
                        if (!(fVar instanceof c0)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                        }
                        b0 viewModelStore = ((c0) fVar).getViewModelStore();
                        d savedStateRegistry = fVar.getSavedStateRegistry();
                        viewModelStore.getClass();
                        LinkedHashMap linkedHashMap = viewModelStore.f4010a;
                        Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            AbstractC0219i.e(KnoxContract.KEY, str2);
                            X x4 = (X) linkedHashMap.get(str2);
                            AbstractC0219i.b(x4);
                            Q.a(x4, savedStateRegistry, fVar.getLifecycle());
                        }
                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                            savedStateRegistry.d();
                        }
                    } catch (Exception e5) {
                        throw new RuntimeException(g4.f.d("Failed to instantiate ", str), e5);
                    }
                } catch (NoSuchMethodException e6) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e6);
                }
            } catch (ClassNotFoundException e7) {
                throw new RuntimeException(A3.f.o("Class ", str, " wasn't found"), e7);
            }
        }
    }
}
