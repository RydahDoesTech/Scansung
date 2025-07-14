package O3;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class A implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final z f2019d;

    /* renamed from: e, reason: collision with root package name */
    public v f2020e;
    public int f;

    public A(B b2) {
        z zVar = new z(b2);
        this.f2019d = zVar;
        this.f2020e = new v(zVar.next());
        this.f = b2.f2022e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f2020e.hasNext()) {
            this.f2020e = new v(this.f2019d.next());
        }
        this.f--;
        return Byte.valueOf(this.f2020e.a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
