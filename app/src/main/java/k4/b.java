package k4;

import b3.AbstractC0219i;
import c3.InterfaceC0226a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import k.Q0;

/* loaded from: classes.dex */
public final class b implements Iterator, InterfaceC0226a {

    /* renamed from: e, reason: collision with root package name */
    public Object f7938e;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f7939g;

    /* renamed from: d, reason: collision with root package name */
    public int f7937d = 2;
    public int f = -1;

    public b(c cVar) {
        this.f7939g = cVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i5;
        Object[] objArr;
        int i6 = this.f7937d;
        if (i6 == 4) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int iC = Q0.c(i6);
        if (iC == 0) {
            return true;
        }
        if (iC != 2) {
            this.f7937d = 4;
            do {
                i5 = this.f + 1;
                this.f = i5;
                objArr = this.f7939g.f7940d;
                if (i5 >= objArr.length) {
                    break;
                }
            } while (objArr[i5] == null);
            if (i5 >= objArr.length) {
                this.f7937d = 3;
            } else {
                Object obj = objArr[i5];
                AbstractC0219i.c("null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl", obj);
                this.f7938e = obj;
                this.f7937d = 1;
            }
            if (this.f7937d == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f7937d = 2;
        return this.f7938e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
