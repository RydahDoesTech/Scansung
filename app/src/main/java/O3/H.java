package O3;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class H implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f2036d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2037e;
    public Iterator f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C f2038g;

    public H(C c2) {
        this.f2038g = c2;
    }

    public final Iterator a() {
        if (this.f == null) {
            this.f = this.f2038g.f.entrySet().iterator();
        }
        return this.f;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2036d + 1 < this.f2038g.f2029e.size() || a().hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f2037e = true;
        int i5 = this.f2036d + 1;
        this.f2036d = i5;
        C c2 = this.f2038g;
        return i5 < c2.f2029e.size() ? (Map.Entry) c2.f2029e.get(this.f2036d) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2037e) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f2037e = false;
        int i5 = C.f2027i;
        C c2 = this.f2038g;
        c2.b();
        if (this.f2036d >= c2.f2029e.size()) {
            a().remove();
            return;
        }
        int i6 = this.f2036d;
        this.f2036d = i6 - 1;
        c2.f(i6);
    }
}
