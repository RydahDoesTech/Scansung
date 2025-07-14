package w0;

import android.os.Bundle;
import androidx.lifecycle.C0161y;
import androidx.lifecycle.EnumC0153p;
import androidx.lifecycle.EnumC0154q;
import androidx.lifecycle.InterfaceC0157u;
import androidx.lifecycle.InterfaceC0159w;
import androidx.lifecycle.r;
import androidx.savedstate.Recreator;
import b3.AbstractC0219i;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f9292a;

    /* renamed from: b, reason: collision with root package name */
    public final d f9293b = new d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f9294c;

    public e(f fVar) {
        this.f9292a = fVar;
    }

    public final void a() {
        f fVar = this.f9292a;
        r lifecycle = fVar.getLifecycle();
        if (((C0161y) lifecycle).f4031c != EnumC0154q.f4022e) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new Recreator(fVar));
        final d dVar = this.f9293b;
        dVar.getClass();
        if (dVar.f9288b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new InterfaceC0157u() { // from class: w0.a
            @Override // androidx.lifecycle.InterfaceC0157u
            public final void a(InterfaceC0159w interfaceC0159w, EnumC0153p enumC0153p) {
                d dVar2 = dVar;
                AbstractC0219i.e("this$0", dVar2);
                if (enumC0153p == EnumC0153p.ON_START) {
                    dVar2.f = true;
                } else if (enumC0153p == EnumC0153p.ON_STOP) {
                    dVar2.f = false;
                }
            }
        });
        dVar.f9288b = true;
        this.f9294c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f9294c) {
            a();
        }
        C0161y c0161y = (C0161y) this.f9292a.getLifecycle();
        if (c0161y.f4031c.compareTo(EnumC0154q.f4023g) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0161y.f4031c).toString());
        }
        d dVar = this.f9293b;
        if (!dVar.f9288b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (dVar.f9290d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        dVar.f9289c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        dVar.f9290d = true;
    }

    public final void c(Bundle bundle) {
        AbstractC0219i.e("outBundle", bundle);
        d dVar = this.f9293b;
        dVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = dVar.f9289c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        m.f fVar = dVar.f9287a;
        fVar.getClass();
        m.d dVar2 = new m.d(fVar);
        fVar.f.put(dVar2, Boolean.FALSE);
        while (dVar2.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar2.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
