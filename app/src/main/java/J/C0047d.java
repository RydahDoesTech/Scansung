package J;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: J.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0047d {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f1450a;

    public C0047d(DisplayCutout displayCutout) {
        this.f1450a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0047d.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f1450a, ((C0047d) obj).f1450a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f1450a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f1450a + "}";
    }
}
