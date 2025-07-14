package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import b0.C0199d;
import b3.AbstractC0219i;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class U implements a0 {

    /* renamed from: d, reason: collision with root package name */
    public final Application f3997d;

    /* renamed from: e, reason: collision with root package name */
    public final Z f3998e;
    public final Bundle f;

    /* renamed from: g, reason: collision with root package name */
    public final r f3999g;

    /* renamed from: h, reason: collision with root package name */
    public final w0.d f4000h;

    public U(Application application, w0.f fVar, Bundle bundle) {
        Z z4;
        this.f4000h = fVar.getSavedStateRegistry();
        this.f3999g = fVar.getLifecycle();
        this.f = bundle;
        this.f3997d = application;
        if (application != null) {
            if (Z.f4006h == null) {
                Z.f4006h = new Z(application);
            }
            z4 = Z.f4006h;
            AbstractC0219i.b(z4);
        } else {
            z4 = new Z(null);
        }
        this.f3998e = z4;
    }

    public final X a(Class cls, String str) throws NoSuchMethodException, IOException, SecurityException {
        r rVar = this.f3999g;
        if (rVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC0138a.class.isAssignableFrom(cls);
        Application application = this.f3997d;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? V.a(cls, V.f4002b) : V.a(cls, V.f4001a);
        if (constructorA == null) {
            if (application != null) {
                return this.f3998e.c(cls);
            }
            if (Y.f == null) {
                Y.f = new Y();
            }
            Y y4 = Y.f;
            AbstractC0219i.b(y4);
            return y4.c(cls);
        }
        w0.d dVar = this.f4000h;
        AbstractC0219i.b(dVar);
        Bundle bundleA = dVar.a(str);
        Class[] clsArr = O.f;
        O oB = Q.b(bundleA, this.f);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, oB);
        savedStateHandleController.b(rVar, dVar);
        EnumC0154q enumC0154q = ((C0161y) rVar).f4031c;
        if (enumC0154q == EnumC0154q.f4022e || enumC0154q.compareTo(EnumC0154q.f4023g) >= 0) {
            dVar.d();
        } else {
            rVar.a(new LegacySavedStateHandleController$tryToAddRecreator$1(rVar, dVar));
        }
        X xB = (!zIsAssignableFrom || application == null) ? V.b(cls, constructorA, oB) : V.b(cls, constructorA, application, oB);
        xB.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
        return xB;
    }

    @Override // androidx.lifecycle.a0
    public final X c(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return a(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.a0
    public final X u(Class cls, C0199d c0199d) {
        Y y4 = Y.f4005e;
        LinkedHashMap linkedHashMap = c0199d.f5000a;
        String str = (String) linkedHashMap.get(y4);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(Q.f3983a) == null || linkedHashMap.get(Q.f3984b) == null) {
            if (this.f3999g != null) {
                return a(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(Y.f4004d);
        boolean zIsAssignableFrom = AbstractC0138a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? V.a(cls, V.f4002b) : V.a(cls, V.f4001a);
        return constructorA == null ? this.f3998e.u(cls, c0199d) : (!zIsAssignableFrom || application == null) ? V.b(cls, constructorA, Q.c(c0199d)) : V.b(cls, constructorA, application, Q.c(c0199d));
    }
}
