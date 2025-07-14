package c4;

import C3.C0012d;
import I3.Q;
import I3.V;
import I3.W;
import b3.AbstractC0219i;
import e1.AbstractC0415a;
import g3.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p3.C0753O;
import p3.InterfaceC0766j;
import q3.C0796f;
import q3.C0797g;
import q3.InterfaceC0798h;
import s3.AbstractC0847c;

/* loaded from: classes.dex */
public final class t extends AbstractC0847c {
    public final a4.k n;

    /* renamed from: o, reason: collision with root package name */
    public final W f5218o;

    /* renamed from: p, reason: collision with root package name */
    public final a f5219p;

    /* JADX WARN: Illegal instructions before constructor call */
    public t(a4.k kVar, W w3, int i5) {
        int i6;
        AbstractC0219i.e("c", kVar);
        a4.i iVar = (a4.i) kVar.f3058d;
        d4.o oVar = iVar.f3037a;
        C0796f c0796f = C0797g.f8481a;
        N3.f fVarX = AbstractC0415a.x((K3.f) kVar.f3059e, w3.f1127h);
        V v2 = w3.f1129j;
        AbstractC0219i.d("proto.variance", v2);
        int iOrdinal = v2.ordinal();
        if (iOrdinal != 0) {
            i6 = 1;
            if (iOrdinal == 1) {
                i6 = 3;
            } else if (iOrdinal != 2) {
                throw new O2.d();
            }
        } else {
            i6 = 2;
        }
        super(oVar, (InterfaceC0766j) kVar.f, c0796f, fVarX, i6, w3.f1128i, i5, C0753O.f);
        this.n = kVar;
        this.f5218o = w3;
        this.f5219p = new a(iVar.f3037a, new C0012d(14, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // s3.AbstractC0854j
    public final List P0() {
        a4.k kVar = this.n;
        K3.g gVar = (K3.g) kVar.f3060g;
        W w3 = this.f5218o;
        AbstractC0219i.e("<this>", w3);
        AbstractC0219i.e("typeTable", gVar);
        List list = w3.f1130k;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List<Integer> list2 = w3.f1131l;
            AbstractC0219i.d("upperBoundIdList", list2);
            arrayList = new ArrayList(P2.o.l0(list2));
            for (Integer num : list2) {
                AbstractC0219i.d("it", num);
                arrayList.add(gVar.a(num.intValue()));
            }
        }
        if (arrayList.isEmpty()) {
            return y.N(U3.f.e(this).n());
        }
        ArrayList arrayList2 = new ArrayList(P2.o.l0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((G3.c) kVar.f3064k).g((Q) it.next()));
        }
        return arrayList2;
    }

    @Override // H3.c, q3.InterfaceC0791a
    public final InterfaceC0798h s() {
        return this.f5219p;
    }
}
