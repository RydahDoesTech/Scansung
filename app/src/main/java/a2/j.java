package a2;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Class f3001a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3002b;

    public j(Class cls, boolean z4) {
        this.f3001a = cls;
        this.f3002b = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jVar.f3001a.equals(this.f3001a) && jVar.f3002b == this.f3002b;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f3002b).hashCode() ^ ((this.f3001a.hashCode() ^ 1000003) * 1000003);
    }
}
