package o4;

import b3.AbstractC0219i;
import c3.InterfaceC0226a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i implements Iterator, InterfaceC0226a {

    /* renamed from: d, reason: collision with root package name */
    public Object f8310d;

    /* renamed from: e, reason: collision with root package name */
    public int f8311e = -2;
    public final /* synthetic */ j f;

    public i(j jVar) {
        this.f = jVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [a3.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [a3.a, b3.k] */
    public final void a() {
        Object objD;
        int i5 = this.f8311e;
        j jVar = this.f;
        if (i5 == -2) {
            objD = jVar.f8312a.a();
        } else {
            ?? r02 = jVar.f8313b;
            Object obj = this.f8310d;
            AbstractC0219i.b(obj);
            objD = r02.d(obj);
        }
        this.f8310d = objD;
        this.f8311e = objD == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8311e < 0) {
            a();
        }
        return this.f8311e == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f8311e < 0) {
            a();
        }
        if (this.f8311e == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f8310d;
        AbstractC0219i.c("null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence", obj);
        this.f8311e = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
