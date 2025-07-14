package P2;

import a3.InterfaceC0106a;
import c3.InterfaceC0226a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k implements Iterable, InterfaceC0226a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2158d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2159e;

    public /* synthetic */ k(int i5, Object obj) {
        this.f2158d = i5;
        this.f2159e = obj;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [a3.a, b3.k] */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f2158d) {
            case 0:
                return b3.t.b((Object[]) this.f2159e);
            case 1:
                return new y((Iterator) ((b3.k) this.f2159e).a());
            default:
                return new o4.e((o4.f) this.f2159e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(InterfaceC0106a interfaceC0106a) {
        this.f2158d = 1;
        this.f2159e = (b3.k) interfaceC0106a;
    }
}
