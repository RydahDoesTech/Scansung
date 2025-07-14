package C3;

import I3.C0028j;
import I3.C0042y;
import a3.InterfaceC0106a;
import androidx.lifecycle.Q;
import androidx.lifecycle.c0;
import b3.AbstractC0219i;
import b3.InterfaceC0213c;
import com.google.firebase.messaging.C0388e;
import e1.AbstractC0415a;
import e4.AbstractC0420c;
import e4.AbstractC0424g;
import e4.AbstractC0438v;
import e4.C0422e;
import e4.N;
import g3.InterfaceC0453c;
import j3.K;
import j3.L;
import j3.m0;
import j3.n0;
import j3.p0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o3.C0725h;
import o3.C0726i;
import p3.C0751M;
import p3.InterfaceC0750L;
import p3.InterfaceC0759c;
import p3.InterfaceC0766j;
import p3.InterfaceC0776t;
import q3.C0800j;
import s3.AbstractC0846b;
import s3.AbstractC0859o;
import s3.C0837M;
import s3.C0842S;
import u3.C0881c;

/* renamed from: C3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0012d extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f383e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0012d(int i5, Object obj) {
        super(0);
        this.f382d = i5;
        this.f383e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v117, types: [a3.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v56, types: [a3.a, b3.k] */
    /* JADX WARN: Type inference failed for: r4v14, types: [P2.u] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.ArrayList] */
    @Override // a3.InterfaceC0106a
    public final Object a() throws IllegalAccessException, SecurityException, IllegalArgumentException {
        Collection arrayList;
        switch (this.f382d) {
            case 0:
                C0013e c0013e = (C0013e) this.f383e;
                Collection collectionValues = ((Map) V1.a.Q(c0013e.f385c.f443l, t.f440p[0])).values();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    c4.p pVarA = ((B3.b) c0013e.f384b.f255e).f226d.a(c0013e.f385c, (C0881c) it.next());
                    if (pVarA != null) {
                        arrayList2.add(pVarA);
                    }
                }
                return (X3.n[]) g3.y.O(arrayList2).toArray(new X3.n[0]);
            case 1:
                return b3.t.b((Object[]) this.f383e);
            case 2:
                return ((List) this.f383e).iterator();
            case 3:
                P3.g gVar = (P3.g) this.f383e;
                gVar.getClass();
                P3.k kVar = gVar.f2196a;
                P3.k kVar2 = new P3.k();
                Field[] declaredFields = P3.k.class.getDeclaredFields();
                AbstractC0219i.d("this::class.java.declaredFields", declaredFields);
                for (Field field : declaredFields) {
                    if ((field.getModifiers() & 8) == 0) {
                        field.setAccessible(true);
                        Object obj = field.get(kVar);
                        P3.j jVar = obj instanceof P3.j ? (P3.j) obj : null;
                        if (jVar != null) {
                            String name = field.getName();
                            AbstractC0219i.d("field.name", name);
                            p4.h.o0(name, "is");
                            InterfaceC0453c interfaceC0453cB = b3.q.f5100a.b(P3.k.class);
                            field.getName();
                            String name2 = field.getName();
                            AbstractC0219i.d("field.name", name2);
                            if (name2.length() > 0) {
                                char upperCase = Character.toUpperCase(name2.charAt(0));
                                String strSubstring = name2.substring(1);
                                AbstractC0219i.d("this as java.lang.String).substring(startIndex)", strSubstring);
                                StringBuilder sb = new StringBuilder();
                                sb.append(upperCase);
                                sb.append(strSubstring);
                            }
                            ((InterfaceC0213c) interfaceC0453cB).a();
                            field.set(kVar2, new P3.j(jVar.f2214a, kVar2));
                        }
                    }
                }
                kVar2.f2226K.b(P3.k.f2216W[35], P2.B.t0(kVar2.m(), P2.n.h0(m3.m.f8131p, m3.m.f8132q)));
                kVar2.f2238a = true;
                return new P3.g(kVar2);
            case 4:
                AbstractC0438v abstractC0438vB = ((N) this.f383e).b();
                AbstractC0219i.d("this@createCapturedIfNeeded.type", abstractC0438vB);
                return abstractC0438vB;
            case 5:
                ((S3.m) this.f383e).getClass();
                throw null;
            case 6:
                X3.h hVar = (X3.h) this.f383e;
                List listH = hVar.h();
                ArrayList arrayList3 = new ArrayList(3);
                AbstractC0846b abstractC0846b = hVar.f2781b;
                Collection collectionJ = abstractC0846b.I().j();
                AbstractC0219i.d("containingClass.typeConstructor.supertypes", collectionJ);
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = collectionJ.iterator();
                while (it2.hasNext()) {
                    P2.s.n0(arrayList4, V1.a.A(((AbstractC0438v) it2.next()).p0(), null, 3));
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (next instanceof InterfaceC0759c) {
                        arrayList5.add(next);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    N3.f name3 = ((InterfaceC0759c) next2).getName();
                    Object arrayList6 = linkedHashMap.get(name3);
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                        linkedHashMap.put(name3, arrayList6);
                    }
                    ((List) arrayList6).add(next2);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    N3.f fVar = (N3.f) entry.getKey();
                    List list = (List) entry.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj2 : list) {
                        Boolean boolValueOf = Boolean.valueOf(((InterfaceC0759c) obj2) instanceof InterfaceC0776t);
                        Object arrayList7 = linkedHashMap2.get(boolValueOf);
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                            linkedHashMap2.put(boolValueOf, arrayList7);
                        }
                        ((List) arrayList7).add(obj2);
                    }
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                        List list2 = (List) entry2.getValue();
                        Q3.p pVar = Q3.p.f2358c;
                        if (zBooleanValue) {
                            arrayList = new ArrayList();
                            for (Object obj3 : listH) {
                                if (AbstractC0219i.a(((AbstractC0859o) ((InterfaceC0776t) obj3)).getName(), fVar)) {
                                    arrayList.add(obj3);
                                }
                            }
                        } else {
                            arrayList = P2.u.f2163d;
                        }
                        pVar.h(fVar, list2, arrayList, abstractC0846b, new X3.g(arrayList3, hVar));
                    }
                }
                return P2.m.G0(listH, n4.k.d(arrayList3));
            case 7:
                X3.n nVar = (X3.n) ((InterfaceC0106a) this.f383e).a();
                return nVar instanceof X3.j ? ((X3.j) nVar).h() : nVar;
            case 8:
                X3.s sVar = (X3.s) this.f383e;
                return sVar.h(V1.a.A(sVar.f2799b, null, 3));
            case 9:
                Set setKeySet = ((LinkedHashMap) ((b4.c) this.f383e).f5104l.f6170h).keySet();
                ArrayList arrayList8 = new ArrayList();
                for (Object obj4 : setKeySet) {
                    N3.b bVar = (N3.b) obj4;
                    if (bVar.f1831b.e().d() && !a4.g.f3033c.contains(bVar)) {
                        arrayList8.add(obj4);
                    }
                }
                ArrayList arrayList9 = new ArrayList(P2.o.l0(arrayList8));
                Iterator it5 = arrayList8.iterator();
                while (it5.hasNext()) {
                    arrayList9.add(((N3.b) it5.next()).i());
                }
                return arrayList9;
            case 10:
                return Q.e((c0) this.f383e);
            case 11:
                com.google.firebase.messaging.q qVar = (com.google.firebase.messaging.q) this.f383e;
                qVar.getClass();
                HashSet hashSet = new HashSet();
                c4.i iVar = (c4.i) qVar.f6170h;
                Iterator it6 = iVar.f5167q.j().iterator();
                while (it6.hasNext()) {
                    for (InterfaceC0766j interfaceC0766j : V1.a.A(((AbstractC0438v) it6.next()).p0(), null, 3)) {
                        if ((interfaceC0766j instanceof C0837M) || (interfaceC0766j instanceof InterfaceC0750L)) {
                            hashSet.add(interfaceC0766j.getName());
                        }
                    }
                }
                C0028j c0028j = iVar.f5159h;
                List list3 = c0028j.f1300t;
                AbstractC0219i.d("classProto.functionList", list3);
                Iterator it7 = list3.iterator();
                while (true) {
                    boolean zHasNext = it7.hasNext();
                    a4.k kVar3 = iVar.f5165o;
                    if (!zHasNext) {
                        List list4 = c0028j.f1301u;
                        AbstractC0219i.d("classProto.propertyList", list4);
                        Iterator it8 = list4.iterator();
                        while (it8.hasNext()) {
                            hashSet.add(AbstractC0415a.x((K3.f) kVar3.f3059e, ((I3.G) it8.next()).f1003i));
                        }
                        return P2.B.t0(hashSet, hashSet);
                    }
                    hashSet.add(AbstractC0415a.x((K3.f) kVar3.f3059e, ((C0042y) it7.next()).f1396i));
                }
                break;
            case 12:
                return P2.m.R0((Iterable) ((b3.k) this.f383e).a());
            case 13:
                c4.o oVar = (c4.o) this.f383e;
                Set setN = oVar.n();
                if (setN == null) {
                    return null;
                }
                return P2.B.t0(P2.B.t0(oVar.m(), oVar.f5191c.f5184c.keySet()), setN);
            case 14:
                c4.t tVar = (c4.t) this.f383e;
                a4.k kVar4 = tVar.n;
                return P2.m.O0(((a4.i) kVar4.f3058d).f3041e.w(tVar.f5218o, (K3.f) kVar4.f3059e));
            case 15:
                return new C0422e(((AbstractC0424g) this.f383e).b());
            case 16:
                return AbstractC0420c.r(((e4.E) this.f383e).f6643a);
            case 17:
                return g4.j.c(g4.i.f6809B, ((C0388e) this.f383e).toString());
            case 18:
                InterfaceC0106a interfaceC0106a = ((f4.i) this.f383e).f6748b;
                if (interfaceC0106a != null) {
                    return (List) interfaceC0106a.a();
                }
                return null;
            case 19:
                return p0.a(((j3.D) this.f383e).a());
            case 20:
                return new j3.G((j3.H) this.f383e);
            case 21:
                return new j3.I((j3.J) this.f383e);
            case 22:
                return new K((L) this.f383e);
            case 23:
                List upperBounds = ((n0) this.f383e).f7422d.getUpperBounds();
                AbstractC0219i.d("descriptor.upperBounds", upperBounds);
                ArrayList arrayList10 = new ArrayList(P2.o.l0(upperBounds));
                Iterator it9 = upperBounds.iterator();
                while (it9.hasNext()) {
                    arrayList10.add(new m0((AbstractC0438v) it9.next(), null));
                }
                return arrayList10;
            case 24:
                int iHashCode = 0;
                for (Map.Entry entry3 : ((Map) this.f383e).entrySet()) {
                    String str = (String) entry3.getKey();
                    Object value = entry3.getValue();
                    iHashCode += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(iHashCode);
            case 25:
                C0726i c0726i = (C0726i) this.f383e;
                m3.k kVar5 = c0726i.f;
                if (kVar5 == null) {
                    throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                }
                C0725h c0725h = (C0725h) kVar5.a();
                c0726i.f = null;
                return c0725h;
            case 26:
                return this.f383e;
            case 27:
                return (X3.n) ((C0751M) this.f383e).f8398b.d(f4.f.f6740a);
            case 28:
                C0800j c0800j = (C0800j) this.f383e;
                return c0800j.f8484a.i(c0800j.f8485b).q();
            default:
                return (List) ((C0842S) this.f383e).f8799o.getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0012d(InterfaceC0106a interfaceC0106a) {
        super(0);
        this.f382d = 12;
        this.f383e = (b3.k) interfaceC0106a;
    }
}
