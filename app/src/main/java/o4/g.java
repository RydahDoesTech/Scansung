package o4;

import b3.AbstractC0219i;
import c3.InterfaceC0226a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator, InterfaceC0226a {

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f8305d;

    /* renamed from: e, reason: collision with root package name */
    public Iterator f8306e;
    public final /* synthetic */ h f;

    public g(h hVar) {
        this.f = hVar;
        this.f8305d = hVar.f8307a.iterator();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [a3.b, java.lang.Object] */
    public final boolean a() {
        Iterator it = this.f8306e;
        if (it != null && !it.hasNext()) {
            this.f8306e = null;
        }
        while (true) {
            if (this.f8306e != null) {
                break;
            }
            Iterator it2 = this.f8305d;
            if (!it2.hasNext()) {
                return false;
            }
            Object next = it2.next();
            h hVar = this.f;
            Iterator it3 = (Iterator) hVar.f8309c.d(hVar.f8308b.d(next));
            if (it3.hasNext()) {
                this.f8306e = it3;
                break;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!a()) {
            throw new NoSuchElementException();
        }
        Iterator it = this.f8306e;
        AbstractC0219i.b(it);
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
