package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Z implements Y {

    /* renamed from: a, reason: collision with root package name */
    public final int f3748a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f3749b;

    public Z(a0 a0Var, int i5) {
        this.f3749b = a0Var;
        this.f3748a = i5;
    }

    @Override // androidx.fragment.app.Y
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        a0 a0Var = this.f3749b;
        Fragment fragment = a0Var.f3785w;
        int i5 = this.f3748a;
        if (fragment == null || i5 >= 0 || !fragment.getChildFragmentManager().M(-1, 0)) {
            return a0Var.N(arrayList, arrayList2, i5, 1);
        }
        return false;
    }
}
