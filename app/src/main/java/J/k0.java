package J;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class k0 extends j0 {
    public k0(p0 p0Var, WindowInsets windowInsets) {
        super(p0Var, windowInsets);
    }

    @Override // J.n0
    public p0 a() {
        return p0.f(this.f1465c.consumeDisplayCutout(), null);
    }

    @Override // J.n0
    public C0047d e() {
        DisplayCutout displayCutout = this.f1465c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0047d(displayCutout);
    }

    @Override // J.n0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k0) {
            return Objects.equals(this.f1465c, ((k0) obj).f1465c) && Objects.equals(null, null);
        }
        return false;
    }

    @Override // J.n0
    public int hashCode() {
        return this.f1465c.hashCode();
    }
}
