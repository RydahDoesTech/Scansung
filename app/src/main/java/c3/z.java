package C3;

import b3.AbstractC0219i;
import e4.AbstractC0438v;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0438v f454a;

    /* renamed from: b, reason: collision with root package name */
    public final List f455b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f456c;

    /* renamed from: d, reason: collision with root package name */
    public final List f457d;

    public z(AbstractC0438v abstractC0438v, List list, ArrayList arrayList, List list2) {
        this.f454a = abstractC0438v;
        this.f455b = list;
        this.f456c = arrayList;
        this.f457d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f454a.equals(zVar.f454a) && AbstractC0219i.a(null, null) && this.f455b.equals(zVar.f455b) && this.f456c.equals(zVar.f456c) && this.f457d.equals(zVar.f457d);
    }

    public final int hashCode() {
        return this.f457d.hashCode() + ((this.f456c.hashCode() + ((this.f455b.hashCode() + (this.f454a.hashCode() * 961)) * 31)) * 961);
    }

    public final String toString() {
        return "MethodSignatureData(returnType=" + this.f454a + ", receiverType=null, valueParameters=" + this.f455b + ", typeParameters=" + this.f456c + ", hasStableParameterNames=false, errors=" + this.f457d + ')';
    }
}
