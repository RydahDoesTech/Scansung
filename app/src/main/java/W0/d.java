package w0;

import android.os.Bundle;
import androidx.lifecycle.C0150m;
import b3.AbstractC0219i;
import e.C0409l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public boolean f9288b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f9289c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9290d;

    /* renamed from: e, reason: collision with root package name */
    public C0409l f9291e;

    /* renamed from: a, reason: collision with root package name */
    public final m.f f9287a = new m.f();
    public boolean f = true;

    public final Bundle a(String str) {
        if (!this.f9290d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f9289c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f9289c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f9289c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f9289c = null;
        }
        return bundle2;
    }

    public final c b() {
        String str;
        c cVar;
        Iterator it = this.f9287a.iterator();
        do {
            m.b bVar = (m.b) it;
            if (!bVar.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            AbstractC0219i.d("components", entry);
            str = (String) entry.getKey();
            cVar = (c) entry.getValue();
        } while (!AbstractC0219i.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return cVar;
    }

    public final void c(String str, c cVar) {
        AbstractC0219i.e("provider", cVar);
        if (((c) this.f9287a.m(str, cVar)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() throws NoSuchMethodException, SecurityException {
        if (!this.f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0409l c0409l = this.f9291e;
        if (c0409l == null) {
            c0409l = new C0409l(this);
        }
        this.f9291e = c0409l;
        try {
            C0150m.class.getDeclaredConstructor(null);
            C0409l c0409l2 = this.f9291e;
            if (c0409l2 != null) {
                ((LinkedHashSet) c0409l2.f6607b).add(C0150m.class.getName());
            }
        } catch (NoSuchMethodException e5) {
            throw new IllegalArgumentException("Class " + C0150m.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
        }
    }
}
