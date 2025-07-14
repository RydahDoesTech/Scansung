package P2;

import b3.AbstractC0219i;
import c3.InterfaceC0226a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: P2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0087a implements Iterator, InterfaceC0226a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2147d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2148e;
    public final Object f;

    public C0087a(Object[] objArr) {
        AbstractC0219i.e("array", objArr);
        this.f = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2147d) {
            case 0:
                if (this.f2148e < ((d) this.f).l()) {
                }
                break;
            default:
                if (this.f2148e < ((Object[]) this.f).length) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2147d) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i5 = this.f2148e;
                this.f2148e = i5 + 1;
                return ((d) this.f).get(i5);
            default:
                try {
                    Object[] objArr = (Object[]) this.f;
                    int i6 = this.f2148e;
                    this.f2148e = i6 + 1;
                    return objArr[i6];
                } catch (ArrayIndexOutOfBoundsException e5) {
                    this.f2148e--;
                    throw new NoSuchElementException(e5.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2147d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0087a(d dVar) {
        this.f = dVar;
    }
}
