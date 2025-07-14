package S3;

import b3.AbstractC0219i;
import e4.AbstractC0438v;
import p3.InterfaceC0781y;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2531a;

    public g(Object obj) {
        this.f2531a = obj;
    }

    public abstract AbstractC0438v a(InterfaceC0781y interfaceC0781y);

    public Object b() {
        return this.f2531a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            Object objB = b();
            g gVar = obj instanceof g ? (g) obj : null;
            if (!AbstractC0219i.a(objB, gVar != null ? gVar.b() : null)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Object objB = b();
        if (objB != null) {
            return objB.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
