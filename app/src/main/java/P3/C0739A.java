package p3;

import b3.AbstractC0219i;
import java.util.List;

/* renamed from: p3.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0739A {

    /* renamed from: a, reason: collision with root package name */
    public final N3.b f8385a;

    /* renamed from: b, reason: collision with root package name */
    public final List f8386b;

    public C0739A(N3.b bVar, List list) {
        AbstractC0219i.e("classId", bVar);
        this.f8385a = bVar;
        this.f8386b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0739A)) {
            return false;
        }
        C0739A c0739a = (C0739A) obj;
        return AbstractC0219i.a(this.f8385a, c0739a.f8385a) && AbstractC0219i.a(this.f8386b, c0739a.f8386b);
    }

    public final int hashCode() {
        return this.f8386b.hashCode() + (this.f8385a.hashCode() * 31);
    }

    public final String toString() {
        return "ClassRequest(classId=" + this.f8385a + ", typeParametersCount=" + this.f8386b + ')';
    }
}
