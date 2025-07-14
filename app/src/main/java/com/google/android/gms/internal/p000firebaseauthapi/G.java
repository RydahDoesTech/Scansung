package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class G implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f5306d;

    public G(H h3) {
        this.f5306d = h3.f5310d.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5306d.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f5306d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
