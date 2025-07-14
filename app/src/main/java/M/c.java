package m;

import java.util.Map;

/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public final Object f8028d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f8029e;
    public c f;

    /* renamed from: g, reason: collision with root package name */
    public c f8030g;

    public c(Object obj, Object obj2) {
        this.f8028d = obj;
        this.f8029e = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f8028d.equals(cVar.f8028d) && this.f8029e.equals(cVar.f8029e);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f8028d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f8029e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f8029e.hashCode() ^ this.f8028d.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f8028d + "=" + this.f8029e;
    }
}
