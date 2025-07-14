package P2;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: P2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0088b extends C0087a implements ListIterator {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f2149g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0088b(d dVar, int i5) {
        super(dVar);
        this.f2149g = dVar;
        int iL = dVar.l();
        if (i5 >= 0 && i5 <= iL) {
            this.f2148e = i5;
            return;
        }
        throw new IndexOutOfBoundsException("index: " + i5 + ", size: " + iL);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2148e > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2148e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f2148e - 1;
        this.f2148e = i5;
        return this.f2149g.get(i5);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2148e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
