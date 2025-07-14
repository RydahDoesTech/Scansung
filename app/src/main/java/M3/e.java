package M3;

import Y0.j;
import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class e extends j {

    /* renamed from: c, reason: collision with root package name */
    public final String f1819c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1820d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, String str2) {
        super(9);
        AbstractC0219i.e("name", str);
        AbstractC0219i.e("desc", str2);
        this.f1819c = str;
        this.f1820d = str2;
    }

    @Override // Y0.j
    public final String b() {
        return this.f1819c + this.f1820d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return AbstractC0219i.a(this.f1819c, eVar.f1819c) && AbstractC0219i.a(this.f1820d, eVar.f1820d);
    }

    public final int hashCode() {
        return this.f1820d.hashCode() + (this.f1819c.hashCode() * 31);
    }
}
