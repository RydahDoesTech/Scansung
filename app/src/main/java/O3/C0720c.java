package o3;

import b3.AbstractC0219i;

/* renamed from: o3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0720c {

    /* renamed from: a, reason: collision with root package name */
    public final N3.b f8245a;

    /* renamed from: b, reason: collision with root package name */
    public final N3.b f8246b;

    /* renamed from: c, reason: collision with root package name */
    public final N3.b f8247c;

    public C0720c(N3.b bVar, N3.b bVar2, N3.b bVar3) {
        this.f8245a = bVar;
        this.f8246b = bVar2;
        this.f8247c = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0720c)) {
            return false;
        }
        C0720c c0720c = (C0720c) obj;
        return AbstractC0219i.a(this.f8245a, c0720c.f8245a) && AbstractC0219i.a(this.f8246b, c0720c.f8246b) && AbstractC0219i.a(this.f8247c, c0720c.f8247c);
    }

    public final int hashCode() {
        return this.f8247c.hashCode() + ((this.f8246b.hashCode() + (this.f8245a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.f8245a + ", kotlinReadOnly=" + this.f8246b + ", kotlinMutable=" + this.f8247c + ')';
    }
}
