package e;

import android.os.Bundle;
import b3.AbstractC0219i;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: e.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0409l implements w0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6606a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6607b;

    public C0409l(w0.d dVar) {
        AbstractC0219i.e("registry", dVar);
        this.f6607b = new LinkedHashSet();
        dVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // w0.c
    public final Bundle a() {
        switch (this.f6606a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC0411n) this.f6607b).getDelegate().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f6607b));
                return bundle2;
        }
    }

    public C0409l(AbstractActivityC0411n abstractActivityC0411n) {
        this.f6607b = abstractActivityC0411n;
    }
}
