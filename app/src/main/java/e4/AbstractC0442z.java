package e4;

import b3.AbstractC0219i;
import java.util.Iterator;
import q3.InterfaceC0792b;

/* renamed from: e4.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0442z extends Z implements h4.d, h4.e {
    @Override // e4.Z
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC0442z M0(boolean z4);

    @Override // e4.Z
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC0442z O0(G g5);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = s().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", P3.g.f2195e.v((InterfaceC0792b) it.next(), null), "] "};
            for (int i5 = 0; i5 < 3; i5++) {
                sb.append(strArr[i5]);
            }
        }
        sb.append(I0());
        if (!s0().isEmpty()) {
            P2.m.z0(s0(), sb, "<", ">", null, 112);
        }
        if (J0()) {
            sb.append("?");
        }
        String string = sb.toString();
        AbstractC0219i.d("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }
}
