package C3;

import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import v3.C0896c;

/* loaded from: classes.dex */
public final class p extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f428e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(r rVar, int i5) {
        super(0);
        this.f427d = i5;
        this.f428e = rVar;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        switch (this.f427d) {
            case 0:
                List listA = this.f428e.f431o.a();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listA) {
                    if (((v3.u) obj).f9264a.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                int iG0 = P2.z.g0(P2.o.l0(arrayList));
                if (iG0 < 16) {
                    iG0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iG0);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap.put(((v3.u) next).b(), next);
                }
                return linkedHashMap;
            case 1:
                Class<?>[] declaredClasses = this.f428e.f431o.f9258a.getDeclaredClasses();
                AbstractC0219i.d("klass.declaredClasses", declaredClasses);
                return P2.m.R0(o4.m.k0(o4.m.j0(new o4.f(P2.i.j0(declaredClasses), false, C0896c.f9240g), C0896c.f9241h)));
            default:
                r rVar = this.f428e;
                return P2.B.t0(rVar.a(), rVar.b());
        }
    }
}
