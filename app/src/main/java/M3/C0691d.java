package m3;

import b3.AbstractC0219i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: m3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0691d {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f8059a;

    static {
        Set<j> set = j.f8071h;
        ArrayList arrayList = new ArrayList(P2.o.l0(set));
        for (j jVar : set) {
            AbstractC0219i.e("primitiveType", jVar);
            arrayList.add(n.f8150j.c(jVar.f8080d));
        }
        N3.c cVarG = m.f.g();
        AbstractC0219i.d("string.toSafe()", cVarG);
        ArrayList arrayListH0 = P2.m.H0(arrayList, cVarG);
        N3.c cVarG2 = m.f8124h.g();
        AbstractC0219i.d("_boolean.toSafe()", cVarG2);
        ArrayList arrayListH02 = P2.m.H0(arrayListH0, cVarG2);
        N3.c cVarG3 = m.f8126j.g();
        AbstractC0219i.d("_enum.toSafe()", cVarG3);
        ArrayList arrayListH03 = P2.m.H0(arrayListH02, cVarG3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayListH03.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(N3.b.j((N3.c) it.next()));
        }
        f8059a = linkedHashSet;
    }
}
