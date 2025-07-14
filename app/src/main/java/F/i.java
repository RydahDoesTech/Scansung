package F;

import java.util.Locale;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f622b = new i(new j(h.a(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final j f623a;

    public i(j jVar) {
        this.f623a = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            if (this.f623a.equals(((i) obj).f623a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f623a.f624a.hashCode();
    }

    public final String toString() {
        return this.f623a.f624a.toString();
    }
}
