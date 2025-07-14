package m3;

import a3.InterfaceC0106a;
import e4.AbstractC0442z;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;

/* renamed from: m3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0693f implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0695h f8061e;

    public /* synthetic */ C0693f(AbstractC0695h abstractC0695h, int i5) {
        this.f8060d = i5;
        this.f8061e = abstractC0695h;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        switch (this.f8060d) {
            case 0:
                AbstractC0695h abstractC0695h = this.f8061e;
                return Arrays.asList(abstractC0695h.k().D(n.f8150j), abstractC0695h.k().D(n.f8152l), abstractC0695h.k().D(n.f8153m), abstractC0695h.k().D(n.f8151k));
            default:
                EnumMap enumMap = new EnumMap(j.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (j jVar : j.values()) {
                    String strB = jVar.f8080d.b();
                    AbstractC0695h abstractC0695h2 = this.f8061e;
                    if (strB == null) {
                        abstractC0695h2.getClass();
                        AbstractC0695h.a(46);
                        throw null;
                    }
                    AbstractC0442z abstractC0442zQ = abstractC0695h2.j(strB).q();
                    if (abstractC0442zQ == null) {
                        AbstractC0695h.a(47);
                        throw null;
                    }
                    String strB2 = jVar.f8081e.b();
                    if (strB2 == null) {
                        AbstractC0695h.a(46);
                        throw null;
                    }
                    AbstractC0442z abstractC0442zQ2 = abstractC0695h2.j(strB2).q();
                    if (abstractC0442zQ2 == null) {
                        AbstractC0695h.a(47);
                        throw null;
                    }
                    enumMap.put((EnumMap) jVar, (j) abstractC0442zQ2);
                    map.put(abstractC0442zQ, abstractC0442zQ2);
                    map2.put(abstractC0442zQ2, abstractC0442zQ);
                }
                return new C0694g(enumMap, map, map2);
        }
    }
}
