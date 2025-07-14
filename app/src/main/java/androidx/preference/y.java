package androidx.preference;

import androidx.recyclerview.widget.RecyclerView;
import j0.AbstractC0512C;

/* loaded from: classes.dex */
public final class y extends AbstractC0512C {

    /* renamed from: a, reason: collision with root package name */
    public final D f4692a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f4693b;

    /* renamed from: c, reason: collision with root package name */
    public final Preference f4694c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4695d;

    public y(D d5, RecyclerView recyclerView, Preference preference, String str) {
        this.f4692a = d5;
        this.f4693b = recyclerView;
        this.f4694c = preference;
        this.f4695d = str;
    }

    @Override // j0.AbstractC0512C
    public final void a() {
        c();
    }

    @Override // j0.AbstractC0512C
    public final void b(int i5, int i6, Preference preference) {
        c();
    }

    public final void c() {
        D d5 = this.f4692a;
        d5.f7050a.unregisterObserver(this);
        Preference preference = this.f4694c;
        int iL = preference != null ? d5.l(preference) : d5.m(this.f4695d);
        if (iL != -1) {
            this.f4693b.v0(iL);
        }
    }
}
