package b3;

/* loaded from: classes.dex */
public final class m implements InterfaceC0213c {

    /* renamed from: d, reason: collision with root package name */
    public final Class f5096d;

    public m(Class cls, String str) {
        AbstractC0219i.e("jClass", cls);
        this.f5096d = cls;
    }

    @Override // b3.InterfaceC0213c
    public final Class a() {
        return this.f5096d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            if (AbstractC0219i.a(this.f5096d, ((m) obj).f5096d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5096d.hashCode();
    }

    public final String toString() {
        return this.f5096d.toString() + " (Kotlin reflection is not available)";
    }
}
