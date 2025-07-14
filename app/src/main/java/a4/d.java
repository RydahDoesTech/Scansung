package a4;

import I3.C0028j;
import b3.AbstractC0219i;
import p3.InterfaceC0752N;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final K3.f f3027a;

    /* renamed from: b, reason: collision with root package name */
    public final C0028j f3028b;

    /* renamed from: c, reason: collision with root package name */
    public final K3.a f3029c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0752N f3030d;

    public d(K3.f fVar, C0028j c0028j, K3.a aVar, InterfaceC0752N interfaceC0752N) {
        AbstractC0219i.e("nameResolver", fVar);
        AbstractC0219i.e("classProto", c0028j);
        AbstractC0219i.e("sourceElement", interfaceC0752N);
        this.f3027a = fVar;
        this.f3028b = c0028j;
        this.f3029c = aVar;
        this.f3030d = interfaceC0752N;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC0219i.a(this.f3027a, dVar.f3027a) && AbstractC0219i.a(this.f3028b, dVar.f3028b) && AbstractC0219i.a(this.f3029c, dVar.f3029c) && AbstractC0219i.a(this.f3030d, dVar.f3030d);
    }

    public final int hashCode() {
        return this.f3030d.hashCode() + ((this.f3029c.hashCode() + ((this.f3028b.hashCode() + (this.f3027a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.f3027a + ", classProto=" + this.f3028b + ", metadataVersion=" + this.f3029c + ", sourceElement=" + this.f3030d + ')';
    }
}
