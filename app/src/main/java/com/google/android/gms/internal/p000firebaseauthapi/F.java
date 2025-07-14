package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class F implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public final ListIterator f5296d;

    public F(H h3, int i5) {
        this.f5296d = h3.f5310d.listIterator(i5);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f5296d.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5296d.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f5296d.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5296d.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f5296d.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5296d.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
