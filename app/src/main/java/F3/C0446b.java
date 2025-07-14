package f3;

import c3.InterfaceC0226a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: f3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0446b implements Iterator, InterfaceC0226a {

    /* renamed from: d, reason: collision with root package name */
    public final int f6731d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6732e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public int f6733g;

    public C0446b(int i5, int i6, int i7) {
        this.f6731d = i7;
        this.f6732e = i6;
        boolean z4 = false;
        if (i7 <= 0 ? i5 >= i6 : i5 <= i6) {
            z4 = true;
        }
        this.f = z4;
        this.f6733g = z4 ? i5 : i6;
    }

    public final int a() {
        int i5 = this.f6733g;
        if (i5 != this.f6732e) {
            this.f6733g = this.f6731d + i5;
        } else {
            if (!this.f) {
                throw new NoSuchElementException();
            }
            this.f = false;
        }
        return i5;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
