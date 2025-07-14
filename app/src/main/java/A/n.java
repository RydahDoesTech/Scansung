package A;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f28a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f29b;

    public n(Resources resources, Resources.Theme theme) {
        this.f28a = resources;
        this.f29b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f28a.equals(nVar.f28a) && Objects.equals(this.f29b, nVar.f29b);
    }

    public final int hashCode() {
        return Objects.hash(this.f28a, this.f29b);
    }
}
