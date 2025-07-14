package P2;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class l implements o4.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2160a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2161b;

    public /* synthetic */ l(int i5, Object obj) {
        this.f2160a = i5;
        this.f2161b = obj;
    }

    @Override // o4.k
    public final Iterator iterator() {
        switch (this.f2160a) {
            case 0:
                return b3.t.b((Object[]) this.f2161b);
            case 1:
                return ((Iterable) this.f2161b).iterator();
            default:
                return new o4.e(this);
        }
    }
}
