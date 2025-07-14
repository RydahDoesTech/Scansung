package Q2;

import b3.AbstractC0219i;
import c3.InterfaceC0226a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator, InterfaceC0226a {

    /* renamed from: d, reason: collision with root package name */
    public final e f2314d;

    /* renamed from: e, reason: collision with root package name */
    public int f2315e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2316g;

    public c(e eVar, int i5) {
        this.f2316g = i5;
        AbstractC0219i.e("map", eVar);
        this.f2314d = eVar;
        this.f = -1;
        a();
    }

    public final void a() {
        while (true) {
            int i5 = this.f2315e;
            e eVar = this.f2314d;
            if (i5 >= eVar.f2323i || eVar.f[i5] >= 0) {
                return;
            } else {
                this.f2315e = i5 + 1;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2315e < this.f2314d.f2323i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2316g) {
            case 0:
                int i5 = this.f2315e;
                e eVar = this.f2314d;
                if (i5 >= eVar.f2323i) {
                    throw new NoSuchElementException();
                }
                this.f2315e = i5 + 1;
                this.f = i5;
                d dVar = new d(eVar, i5);
                a();
                return dVar;
            case 1:
                int i6 = this.f2315e;
                e eVar2 = this.f2314d;
                if (i6 >= eVar2.f2323i) {
                    throw new NoSuchElementException();
                }
                this.f2315e = i6 + 1;
                this.f = i6;
                Object obj = eVar2.f2319d[i6];
                a();
                return obj;
            default:
                int i7 = this.f2315e;
                e eVar3 = this.f2314d;
                if (i7 >= eVar3.f2323i) {
                    throw new NoSuchElementException();
                }
                this.f2315e = i7 + 1;
                this.f = i7;
                Object[] objArr = eVar3.f2320e;
                AbstractC0219i.b(objArr);
                Object obj2 = objArr[this.f];
                a();
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        e eVar = this.f2314d;
        eVar.b();
        eVar.l(this.f);
        this.f = -1;
    }
}
