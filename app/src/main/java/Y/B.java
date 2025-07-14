package y;

import e.AbstractActivityC0411n;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class B implements Iterable {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f9323d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final AbstractActivityC0411n f9324e;

    public B(AbstractActivityC0411n abstractActivityC0411n) {
        this.f9324e = abstractActivityC0411n;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f9323d.iterator();
    }
}
