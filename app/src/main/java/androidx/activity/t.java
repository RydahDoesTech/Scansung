package androidx.activity;

import androidx.fragment.app.S;
import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class t implements c {

    /* renamed from: a, reason: collision with root package name */
    public final S f3166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f3167b;

    public t(v vVar, S s2) {
        AbstractC0219i.e("onBackPressedCallback", s2);
        this.f3167b = vVar;
        this.f3166a = s2;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [a3.a, b3.h] */
    @Override // androidx.activity.c
    public final void cancel() {
        v vVar = this.f3167b;
        P2.h hVar = vVar.f3170b;
        S s2 = this.f3166a;
        hVar.remove(s2);
        if (AbstractC0219i.a(vVar.f3171c, s2)) {
            s2.getClass();
            vVar.f3171c = null;
        }
        s2.f3738b.remove(this);
        ?? r4 = s2.f3739c;
        if (r4 != 0) {
            r4.a();
        }
        s2.f3739c = null;
    }
}
