package o;

import a4.v;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0709g implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final int f8222d;

    /* renamed from: e, reason: collision with root package name */
    public int f8223e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8224g = false;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v f8225h;

    public C0709g(v vVar, int i5) {
        this.f8225h = vVar;
        this.f8222d = i5;
        this.f8223e = vVar.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f < this.f8223e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objB = this.f8225h.b(this.f, this.f8222d);
        this.f++;
        this.f8224g = true;
        return objB;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f8224g) {
            throw new IllegalStateException();
        }
        int i5 = this.f - 1;
        this.f = i5;
        this.f8223e--;
        this.f8224g = false;
        this.f8225h.h(i5);
    }
}
