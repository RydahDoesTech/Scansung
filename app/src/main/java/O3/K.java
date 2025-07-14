package O3;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class K implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public Iterator f2041d;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2041d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f2041d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
