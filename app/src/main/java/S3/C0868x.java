package s3;

import a3.InterfaceC0106a;
import g3.InterfaceC0466p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p3.AbstractC0779w;
import p3.InterfaceC0742D;

/* renamed from: s3.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0868x extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f8898e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0868x(y yVar, int i5) {
        super(0);
        this.f8897d = i5;
        this.f8898e = yVar;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        switch (this.f8897d) {
            case 0:
                y yVar = this.f8898e;
                C0826B c0826b = yVar.f;
                c0826b.N0();
                return Boolean.valueOf(AbstractC0779w.h((C0858n) c0826b.n.getValue(), yVar.f8900g));
            case 1:
                y yVar2 = this.f8898e;
                C0826B c0826b2 = yVar2.f;
                c0826b2.N0();
                return AbstractC0779w.i((C0858n) c0826b2.n.getValue(), yVar2.f8900g);
            default:
                y yVar3 = this.f8898e;
                d4.i iVar = yVar3.f8902i;
                InterfaceC0466p[] interfaceC0466pArr = y.f8899k;
                if (((Boolean) V1.a.Q(iVar, interfaceC0466pArr[1])).booleanValue()) {
                    return X3.m.f2791b;
                }
                List list = (List) V1.a.Q(yVar3.f8901h, interfaceC0466pArr[0]);
                ArrayList arrayList = new ArrayList(P2.o.l0(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC0742D) it.next()).p0());
                }
                C0826B c0826b3 = yVar3.f;
                N3.c cVar = yVar3.f8900g;
                return g3.y.l("package view scope for " + cVar + " in " + c0826b3.getName(), P2.m.H0(arrayList, new C0838N(c0826b3, cVar)));
        }
    }
}
