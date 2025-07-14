package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class H extends AbstractList implements RandomAccess, InterfaceC0276i {

    /* renamed from: d, reason: collision with root package name */
    public final C0270h f5310d;

    public H(C0270h c0270h) {
        this.f5310d = c0270h;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0276i
    public final InterfaceC0276i a() {
        return this;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0276i
    public final void f(Y4 y4) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0276i
    public final List g() {
        return Collections.unmodifiableList(this.f5310d.f5496e);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i5) {
        return this.f5310d.get(i5);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new G(this);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0276i
    public final Object k(int i5) {
        return this.f5310d.f5496e.get(i5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i5) {
        return new F(this, i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5310d.size();
    }
}
