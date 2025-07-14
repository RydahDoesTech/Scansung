package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class E extends F {

    /* renamed from: l, reason: collision with root package name */
    public m.f f3965l;

    @Override // androidx.lifecycle.C
    public final void g() {
        Iterator it = this.f3965l.iterator();
        while (true) {
            m.b bVar = (m.b) it;
            if (!bVar.hasNext()) {
                return;
            }
            D d5 = (D) ((Map.Entry) bVar.next()).getValue();
            d5.f3960a.f(d5);
        }
    }

    @Override // androidx.lifecycle.C
    public final void h() {
        Iterator it = this.f3965l.iterator();
        while (true) {
            m.b bVar = (m.b) it;
            if (!bVar.hasNext()) {
                return;
            }
            D d5 = (D) ((Map.Entry) bVar.next()).getValue();
            d5.f3960a.j(d5);
        }
    }
}
