package B0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public final View f187b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f186a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f188c = new ArrayList();

    public z(View view) {
        this.f187b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f187b == zVar.f187b && this.f186a.equals(zVar.f186a);
    }

    public final int hashCode() {
        return this.f186a.hashCode() + (this.f187b.hashCode() * 31);
    }

    public final String toString() {
        String strC = g4.f.c(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f187b + "\n", "    values:");
        HashMap map = this.f186a;
        for (String str : map.keySet()) {
            strC = strC + "    " + str + ": " + map.get(str) + "\n";
        }
        return strC;
    }
}
