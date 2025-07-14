package androidx.lifecycle;

import C3.C0012d;
import android.os.Bundle;
import b3.AbstractC0219i;
import java.util.Map;

/* loaded from: classes.dex */
public final class S implements w0.c {

    /* renamed from: a, reason: collision with root package name */
    public final w0.d f3988a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3989b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f3990c;

    /* renamed from: d, reason: collision with root package name */
    public final O2.i f3991d;

    public S(w0.d dVar, c0 c0Var) {
        AbstractC0219i.e("savedStateRegistry", dVar);
        this.f3988a = dVar;
        this.f3991d = new O2.i(new C0012d(10, c0Var));
    }

    @Override // w0.c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3990c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((T) this.f3991d.getValue()).f3996a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((O) entry.getValue()).f3981e.a();
            if (!AbstractC0219i.a(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.f3989b = false;
        return bundle;
    }

    public final void b() {
        if (this.f3989b) {
            return;
        }
        Bundle bundleA = this.f3988a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3990c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleA != null) {
            bundle.putAll(bundleA);
        }
        this.f3990c = bundle;
        this.f3989b = true;
    }
}
