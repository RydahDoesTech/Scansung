package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import b0.C0196a;
import b0.C0198c;
import b0.C0199d;
import b0.C0200e;
import b3.AbstractC0219i;
import com.samsung.android.knox.ex.KnoxContract;
import com.wssyncmldm.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final Y f3983a = new Y();

    /* renamed from: b, reason: collision with root package name */
    public static final Y f3984b = new Y();

    /* renamed from: c, reason: collision with root package name */
    public static final Y f3985c = new Y();

    public static final void a(X x4, w0.d dVar, r rVar) {
        AbstractC0219i.e("registry", dVar);
        AbstractC0219i.e("lifecycle", rVar);
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) x4.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.f3995c) {
            return;
        }
        savedStateHandleController.b(rVar, dVar);
        EnumC0154q enumC0154q = ((C0161y) rVar).f4031c;
        if (enumC0154q == EnumC0154q.f4022e || enumC0154q.compareTo(EnumC0154q.f4023g) >= 0) {
            dVar.d();
        } else {
            rVar.a(new LegacySavedStateHandleController$tryToAddRecreator$1(rVar, dVar));
        }
    }

    public static O b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new O();
            }
            HashMap map = new HashMap();
            for (String str : bundle2.keySet()) {
                AbstractC0219i.d(KnoxContract.KEY, str);
                map.put(str, bundle2.get(str));
            }
            return new O(map);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = parcelableArrayList.get(i5);
            AbstractC0219i.c("null cannot be cast to non-null type kotlin.String", obj);
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i5));
        }
        return new O(linkedHashMap);
    }

    public static final O c(C0199d c0199d) {
        Y y4 = f3983a;
        LinkedHashMap linkedHashMap = c0199d.f5000a;
        w0.f fVar = (w0.f) linkedHashMap.get(y4);
        if (fVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        c0 c0Var = (c0) linkedHashMap.get(f3984b);
        if (c0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f3985c);
        String str = (String) linkedHashMap.get(Y.f4005e);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        w0.c cVarB = fVar.getSavedStateRegistry().b();
        S s2 = cVarB instanceof S ? (S) cVarB : null;
        if (s2 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = e(c0Var).f3996a;
        O o5 = (O) linkedHashMap2.get(str);
        if (o5 != null) {
            return o5;
        }
        Class[] clsArr = O.f;
        s2.b();
        Bundle bundle2 = s2.f3990c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = s2.f3990c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = s2.f3990c;
        if (bundle5 != null && bundle5.isEmpty()) {
            s2.f3990c = null;
        }
        O oB = b(bundle3, bundle);
        linkedHashMap2.put(str, oB);
        return oB;
    }

    public static final void d(w0.f fVar) {
        EnumC0154q enumC0154q = ((C0161y) fVar.getLifecycle()).f4031c;
        if (enumC0154q != EnumC0154q.f4022e && enumC0154q != EnumC0154q.f) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fVar.getSavedStateRegistry().b() == null) {
            S s2 = new S(fVar.getSavedStateRegistry(), (c0) fVar);
            fVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", s2);
            fVar.getLifecycle().a(new SavedStateHandleAttacher(s2));
        }
    }

    public static final T e(c0 c0Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0200e(g3.y.z(b3.q.f5100a.b(T.class))));
        C0200e[] c0200eArr = (C0200e[]) arrayList.toArray(new C0200e[0]);
        C0200e[] c0200eArr2 = (C0200e[]) Arrays.copyOf(c0200eArr, c0200eArr.length);
        AbstractC0219i.e("initializers", c0200eArr2);
        C0198c c0198c = new C0198c();
        c0198c.f5001d = c0200eArr2;
        return (T) new D3.c(c0Var.getViewModelStore(), c0198c, c0Var instanceof InterfaceC0149l ? ((InterfaceC0149l) c0Var).getDefaultViewModelCreationExtras() : C0196a.f4999b).e(T.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void f(View view, InterfaceC0159w interfaceC0159w) {
        AbstractC0219i.e("<this>", view);
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC0159w);
    }
}
