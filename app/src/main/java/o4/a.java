package o4;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements k {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f8294a;

    public a(k kVar) {
        this.f8294a = new AtomicReference(kVar);
    }

    @Override // o4.k
    public final Iterator iterator() {
        k kVar = (k) this.f8294a.getAndSet(null);
        if (kVar != null) {
            return kVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
