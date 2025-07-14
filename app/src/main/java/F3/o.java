package F3;

import C3.C0012d;
import P2.x;
import P2.y;
import P2.z;
import b3.AbstractC0219i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f662a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f663b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public O2.f f664c = new O2.f("V", null);

    public o(E0.d dVar, String str) {
        this.f662a = str;
    }

    public final void a(String str, e... eVarArr) {
        q qVar;
        AbstractC0219i.e("type", str);
        ArrayList arrayList = this.f663b;
        if (eVarArr.length == 0) {
            qVar = null;
        } else {
            P2.k kVar = new P2.k(new C0012d(1, eVarArr));
            int iG0 = z.g0(P2.o.l0(kVar));
            if (iG0 < 16) {
                iG0 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iG0);
            Iterator it = kVar.iterator();
            while (true) {
                y yVar = (y) it;
                if (!yVar.f2169e.hasNext()) {
                    break;
                }
                x xVar = (x) yVar.next();
                linkedHashMap.put(Integer.valueOf(xVar.f2166a), (e) xVar.f2167b);
            }
            qVar = new q(linkedHashMap);
        }
        arrayList.add(new O2.f(str, qVar));
    }

    public final void b(V3.c cVar) {
        AbstractC0219i.e("type", cVar);
        String strC = cVar.c();
        AbstractC0219i.d("type.desc", strC);
        this.f664c = new O2.f(strC, null);
    }

    public final void c(String str, e... eVarArr) {
        AbstractC0219i.e("type", str);
        P2.k kVar = new P2.k(new C0012d(1, eVarArr));
        int iG0 = z.g0(P2.o.l0(kVar));
        if (iG0 < 16) {
            iG0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG0);
        Iterator it = kVar.iterator();
        while (true) {
            y yVar = (y) it;
            if (!yVar.f2169e.hasNext()) {
                this.f664c = new O2.f(str, new q(linkedHashMap));
                return;
            } else {
                x xVar = (x) yVar.next();
                linkedHashMap.put(Integer.valueOf(xVar.f2166a), (e) xVar.f2167b);
            }
        }
    }
}
