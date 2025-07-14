package m3;

import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o3.C0725h;
import p3.InterfaceC0743E;
import s3.C0826B;
import s3.C0858n;
import s3.y;

/* loaded from: classes.dex */
public final class k extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0826B f8084e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(C0826B c0826b, int i5) {
        super(0);
        this.f8083d = i5;
        this.f8084e = c0826b;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        switch (this.f8083d) {
            case 0:
                return ((y) this.f8084e.D(n.f8148h)).f8903j;
            case 1:
                return new C0725h(this.f8084e);
            default:
                C0826B c0826b = this.f8084e;
                K3.g gVar = c0826b.f8735j;
                if (gVar == null) {
                    StringBuilder sb = new StringBuilder("Dependencies of module ");
                    String str = c0826b.getName().f1842d;
                    AbstractC0219i.d("name.toString()", str);
                    sb.append(str);
                    sb.append(" were not set before querying module content");
                    throw new AssertionError(sb.toString());
                }
                c0826b.N0();
                List list = gVar.f1696a;
                list.contains(c0826b);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C0826B) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(P2.o.l0(list));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC0743E interfaceC0743E = ((C0826B) it2.next()).f8736k;
                    AbstractC0219i.b(interfaceC0743E);
                    arrayList.add(interfaceC0743E);
                }
                return new C0858n("CompositeProvider@ModuleDescriptor for " + c0826b.getName(), arrayList);
        }
    }
}
