package B0;

import android.view.ViewGroup;
import android.view.WindowId;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final WindowId f113a;

    public G(ViewGroup viewGroup) {
        this.f113a = viewGroup.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof G) && ((G) obj).f113a.equals(this.f113a);
    }

    public final int hashCode() {
        return this.f113a.hashCode();
    }
}
