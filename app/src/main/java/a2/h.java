package a2;

import android.util.Log;
import g2.InterfaceC0450a;
import j2.InterfaceC0558a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class h extends J2.b {
    public static final g n = new g(0);

    /* renamed from: l, reason: collision with root package name */
    public final m f2996l;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f2993i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f2994j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f2995k = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final AtomicReference f2997m = new AtomicReference();

    public h(V1.e eVar, ArrayList arrayList, ArrayList arrayList2) {
        m mVar = new m(eVar);
        this.f2996l = mVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(C0104b.b(mVar, m.class, g2.b.class, InterfaceC0450a.class));
        arrayList3.add(C0104b.b(this, h.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C0104b c0104b = (C0104b) it.next();
            if (c0104b != null) {
                arrayList3.add(c0104b);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    f fVar = (f) ((InterfaceC0558a) it3.next()).get();
                    if (fVar != null) {
                        arrayList3.addAll(fVar.getComponents());
                        it3.remove();
                    }
                } catch (n e5) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e5);
                }
            }
            if (this.f2993i.isEmpty()) {
                V1.a.u(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f2993i.keySet());
                arrayList6.addAll(arrayList3);
                V1.a.u(arrayList6);
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                C0104b c0104b2 = (C0104b) it4.next();
                this.f2993i.put(c0104b2, new o(new V1.c(this, 1, c0104b2)));
            }
            arrayList5.addAll(h0(arrayList3));
            arrayList5.addAll(i0());
            g0();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) this.f2997m.get();
        if (bool != null) {
            f0(this.f2993i, bool.booleanValue());
        }
    }

    @Override // a2.InterfaceC0105c
    public final synchronized InterfaceC0558a b(Class cls) {
        return (InterfaceC0558a) this.f2994j.get(cls);
    }

    @Override // a2.InterfaceC0105c
    public final synchronized InterfaceC0558a d(Class cls) {
        p pVar = (p) this.f2995k.get(cls);
        if (pVar != null) {
            return pVar;
        }
        return n;
    }

    public final void f0(HashMap map, boolean z4) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            C0104b c0104b = (C0104b) entry.getKey();
            InterfaceC0558a interfaceC0558a = (InterfaceC0558a) entry.getValue();
            int i5 = c0104b.f2987c;
            if (i5 == 1 || (i5 == 2 && z4)) {
                interfaceC0558a.get();
            }
        }
        m mVar = this.f2996l;
        synchronized (mVar) {
            arrayDeque = mVar.f3007b;
            if (arrayDeque != null) {
                mVar.f3007b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    public final void g0() {
        for (C0104b c0104b : this.f2993i.keySet()) {
            for (k kVar : c0104b.f2986b) {
                if (kVar.f3004b == 2 && !this.f2995k.containsKey(kVar.f3003a)) {
                    HashMap map = this.f2995k;
                    Class cls = kVar.f3003a;
                    Set setEmptySet = Collections.emptySet();
                    p pVar = new p();
                    pVar.f3013b = null;
                    pVar.f3012a = Collections.newSetFromMap(new ConcurrentHashMap());
                    pVar.f3012a.addAll(setEmptySet);
                    map.put(cls, pVar);
                } else if (this.f2994j.containsKey(kVar.f3003a)) {
                    continue;
                } else {
                    int i5 = kVar.f3004b;
                    if (i5 == 1) {
                        throw new l("Unsatisfied dependency for component " + c0104b + ": " + kVar.f3003a);
                    }
                    if (i5 != 2) {
                        HashMap map2 = this.f2994j;
                        Class cls2 = kVar.f3003a;
                        C2.a aVar = q.f3014c;
                        g gVar = q.f3015d;
                        q qVar = new q();
                        qVar.f3016a = aVar;
                        qVar.f3017b = gVar;
                        map2.put(cls2, qVar);
                    }
                }
            }
        }
    }

    public final ArrayList h0(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0104b c0104b = (C0104b) it.next();
            if (c0104b.f2988d == 0) {
                InterfaceC0558a interfaceC0558a = (InterfaceC0558a) this.f2993i.get(c0104b);
                for (Class cls : c0104b.f2985a) {
                    HashMap map = this.f2994j;
                    if (map.containsKey(cls)) {
                        arrayList2.add(new A.o((q) ((InterfaceC0558a) map.get(cls)), 3, interfaceC0558a));
                    } else {
                        map.put(cls, interfaceC0558a);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList i0() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f2993i.entrySet()) {
            C0104b c0104b = (C0104b) entry.getKey();
            if (c0104b.f2988d != 0) {
                InterfaceC0558a interfaceC0558a = (InterfaceC0558a) entry.getValue();
                for (Class cls : c0104b.f2985a) {
                    if (!map.containsKey(cls)) {
                        map.put(cls, new HashSet());
                    }
                    ((Set) map.get(cls)).add(interfaceC0558a);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            HashMap map2 = this.f2995k;
            if (map2.containsKey(key)) {
                p pVar = (p) map2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new A.o(pVar, 4, (InterfaceC0558a) it.next()));
                }
            } else {
                Class cls2 = (Class) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                p pVar2 = new p();
                pVar2.f3013b = null;
                pVar2.f3012a = Collections.newSetFromMap(new ConcurrentHashMap());
                pVar2.f3012a.addAll(set);
                map2.put(cls2, pVar2);
            }
        }
        return arrayList;
    }
}
