package s;

import java.util.ArrayList;
import t.n;

/* loaded from: classes.dex */
public abstract class i extends C0822d {
    public C0822d[] k0 = new C0822d[4];
    public int l0 = 0;

    public final void K(int i5, ArrayList arrayList, n nVar) {
        for (int i6 = 0; i6 < this.l0; i6++) {
            C0822d c0822d = this.k0[i6];
            ArrayList arrayList2 = nVar.f8945a;
            if (!arrayList2.contains(c0822d)) {
                arrayList2.add(c0822d);
            }
        }
        for (int i7 = 0; i7 < this.l0; i7++) {
            t.h.b(this.k0[i7], i5, arrayList, nVar);
        }
    }

    public void L() {
    }
}
