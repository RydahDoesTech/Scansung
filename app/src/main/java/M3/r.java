package m3;

import P2.z;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import e4.X;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import p3.InterfaceC0742D;
import p3.InterfaceC0763g;
import p3.InterfaceC0766j;
import s3.AbstractC0828D;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f8164a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f8165b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f8166c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f8167d;

    static {
        q[] qVarArrValues = q.values();
        ArrayList arrayList = new ArrayList(qVarArrValues.length);
        for (q qVar : qVarArrValues) {
            arrayList.add(qVar.f8163e);
        }
        f8164a = P2.m.R0(arrayList);
        p[] pVarArrValues = p.values();
        ArrayList arrayList2 = new ArrayList(pVarArrValues.length);
        for (p pVar : pVarArrValues) {
            arrayList2.add(pVar.f8160d);
        }
        P2.m.R0(arrayList2);
        f8165b = new HashMap();
        f8166c = new HashMap();
        z.j0(new HashMap(z.g0(4)), new O2.f[]{new O2.f(p.UBYTEARRAY, N3.f.e("ubyteArrayOf")), new O2.f(p.USHORTARRAY, N3.f.e("ushortArrayOf")), new O2.f(p.UINTARRAY, N3.f.e("uintArrayOf")), new O2.f(p.ULONGARRAY, N3.f.e("ulongArrayOf"))});
        q[] qVarArrValues2 = q.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (q qVar2 : qVarArrValues2) {
            linkedHashSet.add(qVar2.f.i());
        }
        f8167d = linkedHashSet;
        for (q qVar3 : q.values()) {
            HashMap map = f8165b;
            N3.b bVar = qVar3.f;
            N3.b bVar2 = qVar3.f8162d;
            map.put(bVar, bVar2);
            f8166c.put(bVar2, qVar3.f);
        }
    }

    public static final boolean a(AbstractC0438v abstractC0438v) {
        InterfaceC0763g interfaceC0763gI;
        if (X.l(abstractC0438v) || (interfaceC0763gI = abstractC0438v.I0().i()) == null) {
            return false;
        }
        InterfaceC0766j interfaceC0766jL = interfaceC0763gI.l();
        return (interfaceC0766jL instanceof InterfaceC0742D) && AbstractC0219i.a(((AbstractC0828D) ((InterfaceC0742D) interfaceC0766jL)).f8745h, n.f8150j) && f8164a.contains(interfaceC0763gI.getName());
    }
}
