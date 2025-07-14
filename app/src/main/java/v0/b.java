package v0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f9202a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9203b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9204c;

    /* renamed from: d, reason: collision with root package name */
    public final List f9205d;

    /* renamed from: e, reason: collision with root package name */
    public final List f9206e;

    public b(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        this.f9202a = str;
        this.f9203b = str2;
        this.f9204c = str3;
        this.f9205d = Collections.unmodifiableList(arrayList);
        this.f9206e = Collections.unmodifiableList(arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f9202a.equals(bVar.f9202a) && this.f9203b.equals(bVar.f9203b) && this.f9204c.equals(bVar.f9204c) && this.f9205d.equals(bVar.f9205d)) {
            return this.f9206e.equals(bVar.f9206e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9206e.hashCode() + ((this.f9205d.hashCode() + ((this.f9204c.hashCode() + ((this.f9203b.hashCode() + (this.f9202a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f9202a + "', onDelete='" + this.f9203b + "', onUpdate='" + this.f9204c + "', columnNames=" + this.f9205d + ", referenceColumnNames=" + this.f9206e + '}';
    }
}
