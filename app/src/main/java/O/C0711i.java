package o;

import a4.v;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: o.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0711i implements Iterator, Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public int f8228d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v f8230g;
    public boolean f = false;

    /* renamed from: e, reason: collision with root package name */
    public int f8229e = -1;

    public C0711i(v vVar) {
        this.f8230g = vVar;
        this.f8228d = vVar.d() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i5 = this.f8229e;
        v vVar = this.f8230g;
        Object objB = vVar.b(i5, 0);
        if (key != objB && (key == null || !key.equals(objB))) {
            return false;
        }
        Object value = entry.getValue();
        Object objB2 = vVar.b(this.f8229e, 1);
        return value == objB2 || (value != null && value.equals(objB2));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f8230g.b(this.f8229e, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f8230g.b(this.f8229e, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8229e < this.f8228d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i5 = this.f8229e;
        v vVar = this.f8230g;
        Object objB = vVar.b(i5, 0);
        Object objB2 = vVar.b(this.f8229e, 1);
        return (objB == null ? 0 : objB.hashCode()) ^ (objB2 != null ? objB2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f8229e++;
        this.f = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f) {
            throw new IllegalStateException();
        }
        this.f8230g.h(this.f8229e);
        this.f8229e--;
        this.f8228d--;
        this.f = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f) {
            return this.f8230g.i(this.f8229e, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
