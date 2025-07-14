package o4;

import c3.InterfaceC0226a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p3.C0774r;

/* loaded from: classes.dex */
public final class e implements Iterator, InterfaceC0226a {

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f8299e;

    /* renamed from: g, reason: collision with root package name */
    public Object f8300g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f8301h;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8298d = 1;
    public int f = -1;

    public e(f fVar) {
        this.f8301h = fVar;
        this.f8299e = fVar.f8302a.iterator();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [a3.b, java.lang.Object] */
    public void a() {
        Object next;
        f fVar;
        do {
            Iterator it = this.f8299e;
            if (!it.hasNext()) {
                this.f = 0;
                return;
            } else {
                next = it.next();
                fVar = (f) this.f8301h;
            }
        } while (((Boolean) fVar.f8304c.d(next)).booleanValue() != fVar.f8303b);
        this.f8300g = next;
        this.f = 1;
    }

    public void b() {
        Iterator it = this.f8299e;
        if (it.hasNext()) {
            Object next = it.next();
            ((P2.l) this.f8301h).getClass();
            if (((Boolean) C0774r.f8435g.d(next)).booleanValue()) {
                this.f = 1;
                this.f8300g = next;
                return;
            }
        }
        this.f = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8298d) {
            case 0:
                if (this.f == -1) {
                    a();
                }
                if (this.f == 1) {
                }
                break;
            default:
                if (this.f == -1) {
                    b();
                }
                if (this.f == 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f8298d) {
            case 0:
                if (this.f == -1) {
                    a();
                }
                if (this.f == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f8300g;
                this.f8300g = null;
                this.f = -1;
                return obj;
            default:
                if (this.f == -1) {
                    b();
                }
                if (this.f == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f8300g;
                this.f8300g = null;
                this.f = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f8298d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(P2.l lVar) {
        this.f8301h = lVar;
        this.f8299e = ((k) lVar.f2161b).iterator();
    }
}
