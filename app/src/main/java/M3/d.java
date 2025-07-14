package M3;

import Y0.j;
import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class d extends j {

    /* renamed from: c, reason: collision with root package name */
    public final String f1817c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1818d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2) {
        super(9);
        AbstractC0219i.e("name", str);
        AbstractC0219i.e("desc", str2);
        this.f1817c = str;
        this.f1818d = str2;
    }

    @Override // Y0.j
    public final String b() {
        return this.f1817c + ':' + this.f1818d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC0219i.a(this.f1817c, dVar.f1817c) && AbstractC0219i.a(this.f1818d, dVar.f1818d);
    }

    public final int hashCode() {
        return this.f1818d.hashCode() + (this.f1817c.hashCode() * 31);
    }
}
