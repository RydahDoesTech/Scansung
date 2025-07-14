package Y3;

import b3.AbstractC0219i;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import p3.InterfaceC0761e;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0761e f2840d;

    public c(InterfaceC0761e interfaceC0761e) {
        AbstractC0219i.e("classDescriptor", interfaceC0761e);
        this.f2840d = interfaceC0761e;
    }

    @Override // Y3.d
    public final AbstractC0438v d() {
        AbstractC0442z abstractC0442zQ = this.f2840d.q();
        AbstractC0219i.d("classDescriptor.defaultType", abstractC0442zQ);
        return abstractC0442zQ;
    }

    public final boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return AbstractC0219i.a(this.f2840d, cVar != null ? cVar.f2840d : null);
    }

    public final int hashCode() {
        return this.f2840d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        AbstractC0442z abstractC0442zQ = this.f2840d.q();
        AbstractC0219i.d("classDescriptor.defaultType", abstractC0442zQ);
        sb.append(abstractC0442zQ);
        sb.append('}');
        return sb.toString();
    }
}
