package d4;

import a3.InterfaceC0106a;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final N3.c f6408a;

    /* renamed from: b, reason: collision with root package name */
    public final b3.k f6409b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(N3.c cVar, InterfaceC0106a interfaceC0106a) {
        this.f6408a = cVar;
        this.f6409b = (b3.k) interfaceC0106a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && g.class == obj.getClass() && this.f6408a.equals(((g) obj).f6408a);
    }

    public final int hashCode() {
        return this.f6408a.hashCode();
    }
}
