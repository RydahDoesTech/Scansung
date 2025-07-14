package c4;

import C3.C;
import I3.C0019a;
import I3.C0025g;
import I3.C0042y;
import I3.G;
import I3.Q;
import I3.T;
import I3.f0;
import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import e1.AbstractC0415a;
import e4.AbstractC0442z;
import g3.y;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p3.InterfaceC0766j;
import q3.C0797g;
import q3.C0799i;
import q3.InterfaceC0798h;

/* loaded from: classes.dex */
public final class m extends b3.k implements InterfaceC0107b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f5180e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i5) {
        super(1);
        this.f5179d = i5;
        this.f5180e = nVar;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Map] */
    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        Collection<C0042y> collectionK0;
        Collection<G> collectionK02;
        Q qA;
        Q qA2;
        switch (this.f5179d) {
            case 0:
                N3.f fVar = (N3.f) obj;
                AbstractC0219i.e("it", fVar);
                n nVar = this.f5180e;
                LinkedHashMap linkedHashMap = nVar.f5182a;
                C0019a c0019a = C0042y.f1392y;
                AbstractC0219i.d("PARSER", c0019a);
                byte[] bArr = (byte[]) linkedHashMap.get(fVar);
                o oVar = nVar.f5189i;
                if (bArr != null) {
                    C c2 = new C(c0019a, new ByteArrayInputStream(bArr), oVar, 1);
                    collectionK0 = o4.m.k0(new o4.a(new o4.j(c2, new B3.d(20, c2))));
                } else {
                    collectionK0 = P2.u.f2163d;
                }
                ArrayList arrayList = new ArrayList(collectionK0.size());
                for (C0042y c0042y : collectionK0) {
                    a4.s sVar = (a4.s) oVar.f5190b.f3065l;
                    AbstractC0219i.d("it", c0042y);
                    r rVarE = sVar.e(c0042y);
                    if (!oVar.r(rVarE)) {
                        rVarE = null;
                    }
                    if (rVarE != null) {
                        arrayList.add(rVarE);
                    }
                }
                oVar.j(fVar, arrayList);
                return n4.k.d(arrayList);
            case 1:
                N3.f fVar2 = (N3.f) obj;
                AbstractC0219i.e("it", fVar2);
                n nVar2 = this.f5180e;
                LinkedHashMap linkedHashMap2 = nVar2.f5183b;
                C0019a c0019a2 = G.f999y;
                AbstractC0219i.d("PARSER", c0019a2);
                byte[] bArr2 = (byte[]) linkedHashMap2.get(fVar2);
                o oVar2 = nVar2.f5189i;
                if (bArr2 != null) {
                    C c5 = new C(c0019a2, new ByteArrayInputStream(bArr2), oVar2, 1);
                    collectionK02 = o4.m.k0(new o4.a(new o4.j(c5, new B3.d(20, c5))));
                } else {
                    collectionK02 = P2.u.f2163d;
                }
                ArrayList arrayList2 = new ArrayList(collectionK02.size());
                for (G g5 : collectionK02) {
                    a4.s sVar2 = (a4.s) oVar2.f5190b.f3065l;
                    AbstractC0219i.d("it", g5);
                    arrayList2.add(sVar2.f(g5));
                }
                oVar2.k(fVar2, arrayList2);
                return n4.k.d(arrayList2);
            default:
                N3.f fVar3 = (N3.f) obj;
                AbstractC0219i.e("it", fVar3);
                n nVar3 = this.f5180e;
                byte[] bArr3 = (byte[]) nVar3.f5184c.get(fVar3);
                s sVar3 = null;
                if (bArr3 != null) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr3);
                    o oVar3 = nVar3.f5189i;
                    T t4 = (T) T.f1100s.b(byteArrayInputStream, ((a4.i) oVar3.f5190b.f3058d).f3050p);
                    if (t4 != null) {
                        a4.s sVar4 = (a4.s) oVar3.f5190b.f3065l;
                        sVar4.getClass();
                        List list = t4.n;
                        AbstractC0219i.d("proto.annotationList", list);
                        ArrayList arrayList3 = new ArrayList(P2.o.l0(list));
                        Iterator it = list.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            a4.k kVar = sVar4.f3085a;
                            if (zHasNext) {
                                C0025g c0025g = (C0025g) it.next();
                                AbstractC0219i.d("it", c0025g);
                                arrayList3.add(sVar4.f3086b.F0(c0025g, (K3.f) kVar.f3059e));
                            } else {
                                InterfaceC0798h c0799i = arrayList3.isEmpty() ? C0797g.f8481a : new C0799i(0, arrayList3);
                                sVar3 = new s(((a4.i) kVar.f3058d).f3037a, (InterfaceC0766j) kVar.f, c0799i, AbstractC0415a.x((K3.f) kVar.f3059e, t4.f1103h), y.q((f0) K3.e.f1675d.c(t4.f1102g)), t4, (K3.f) kVar.f3059e, (K3.g) kVar.f3060g, (K3.h) kVar.f3061h, (G3.h) kVar.f3063j);
                                List list2 = t4.f1104i;
                                AbstractC0219i.d("proto.typeParameterList", list2);
                                G3.c cVar = (G3.c) kVar.b(sVar3, list2, (K3.f) kVar.f3059e, (K3.g) kVar.f3060g, (K3.h) kVar.f3061h, (K3.a) kVar.f3062i).f3064k;
                                List listO0 = P2.m.O0(cVar.f745k.values());
                                K3.g gVar = (K3.g) kVar.f3060g;
                                AbstractC0219i.e("typeTable", gVar);
                                int i5 = t4.f;
                                if ((i5 & 4) == 4) {
                                    qA = t4.f1105j;
                                    AbstractC0219i.d("underlyingType", qA);
                                } else {
                                    if ((i5 & 8) != 8) {
                                        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
                                    }
                                    qA = gVar.a(t4.f1106k);
                                }
                                AbstractC0442z abstractC0442zD = cVar.d(qA, false);
                                int i6 = t4.f;
                                if ((i6 & 16) == 16) {
                                    qA2 = t4.f1107l;
                                    AbstractC0219i.d("expandedType", qA2);
                                } else {
                                    if ((i6 & 32) != 32) {
                                        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
                                    }
                                    qA2 = gVar.a(t4.f1108m);
                                }
                                sVar3.R0(listO0, abstractC0442zD, cVar.d(qA2, false));
                            }
                        }
                    }
                }
                return sVar3;
        }
    }
}
