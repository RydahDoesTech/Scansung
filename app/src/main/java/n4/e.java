package n4;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public boolean f8191d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8192e;
    public final /* synthetic */ f f;

    public e(f fVar) {
        this.f = fVar;
        this.f8192e = ((AbstractList) fVar).modCount;
    }

    public final void a() {
        f fVar = this.f;
        int i5 = ((AbstractList) fVar).modCount;
        int i6 = this.f8192e;
        if (i5 == i6) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) fVar).modCount + "; expected: " + i6);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f8191d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f8191d) {
            throw new NoSuchElementException();
        }
        this.f8191d = true;
        a();
        return this.f.f8194e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        this.f.clear();
    }
}
