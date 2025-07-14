package K3;

import I3.P;
import I3.Q;
import I3.X;
import P2.n;
import P2.o;
import b3.AbstractC0219i;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final List f1696a;

    public g(X x4) {
        AbstractC0219i.e("typeTable", x4);
        List list = x4.f;
        if ((x4.f1137e & 1) == 1) {
            int i5 = x4.f1138g;
            AbstractC0219i.d("typeTable.typeList", list);
            ArrayList arrayList = new ArrayList(o.l0(list));
            int i6 = 0;
            for (Object obj : list) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    n.k0();
                    throw null;
                }
                Q qG = (Q) obj;
                if (i6 >= i5) {
                    qG.getClass();
                    P pR = Q.r(qG);
                    pR.f1058g |= 2;
                    pR.f1060i = true;
                    qG = pR.g();
                    if (!qG.b()) {
                        throw new O2.d();
                    }
                }
                arrayList.add(qG);
                i6 = i7;
            }
            list = arrayList;
        }
        AbstractC0219i.d("run {\n        val origin… else originalTypes\n    }", list);
        this.f1696a = list;
    }

    public Q a(int i5) {
        return (Q) this.f1696a.get(i5);
    }

    public g(List list) {
        this.f1696a = list;
    }
}
