package androidx.lifecycle;

/* loaded from: classes.dex */
public final /* synthetic */ class W implements G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3.q f4003a;

    public W(C3.q qVar) {
        this.f4003a = qVar;
    }

    @Override // androidx.lifecycle.G
    public final /* synthetic */ void c(Object obj) {
        this.f4003a.d(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof G) || !(obj instanceof W)) {
            return false;
        }
        return this.f4003a.equals(((W) obj).f4003a);
    }

    public final int hashCode() {
        return this.f4003a.hashCode();
    }
}
