package v0;

import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f9210a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9211b;

    /* renamed from: c, reason: collision with root package name */
    public final List f9212c;

    public d(String str, List list, boolean z4) {
        this.f9210a = str;
        this.f9211b = z4;
        this.f9212c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f9211b != dVar.f9211b || !this.f9212c.equals(dVar.f9212c)) {
            return false;
        }
        String str = this.f9210a;
        boolean zStartsWith = str.startsWith("index_");
        String str2 = dVar.f9210a;
        return zStartsWith ? str2.startsWith("index_") : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.f9210a;
        return this.f9212c.hashCode() + ((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.f9211b ? 1 : 0)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f9210a + "', unique=" + this.f9211b + ", columns=" + this.f9212c + '}';
    }
}
