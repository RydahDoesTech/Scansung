package d2;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f6399a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f6400b;

    public c(String str, Map map) {
        this.f6399a = str;
        this.f6400b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f6399a.equals(cVar.f6399a) && this.f6400b.equals(cVar.f6400b);
    }

    public final int hashCode() {
        return this.f6400b.hashCode() + (this.f6399a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f6399a + ", properties=" + this.f6400b.values() + "}";
    }
}
