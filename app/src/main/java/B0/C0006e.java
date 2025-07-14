package B0;

import android.view.ViewGroup;

/* renamed from: B0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006e extends u {

    /* renamed from: a, reason: collision with root package name */
    public boolean f116a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f117b;

    public C0006e(ViewGroup viewGroup) {
        this.f117b = viewGroup;
    }

    @Override // B0.u, B0.s
    public final void a() {
        this.f117b.suppressLayout(false);
        this.f116a = true;
    }

    @Override // B0.u, B0.s
    public final void c() {
        this.f117b.suppressLayout(false);
    }

    @Override // B0.s
    public final void d(t tVar) {
        if (!this.f116a) {
            this.f117b.suppressLayout(false);
        }
        tVar.w(this);
    }

    @Override // B0.u, B0.s
    public final void e() {
        this.f117b.suppressLayout(true);
    }
}
