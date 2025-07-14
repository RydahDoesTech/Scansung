package y3;

import a3.InterfaceC0107b;
import b3.AbstractC0217g;
import b3.AbstractC0219i;
import com.google.firebase.messaging.C0388e;
import g3.InterfaceC0455e;

/* loaded from: classes.dex */
public final /* synthetic */ class s extends AbstractC0217g implements InterfaceC0107b {

    /* renamed from: l, reason: collision with root package name */
    public static final s f9430l = new s(1);

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        N3.c cVar = (N3.c) obj;
        AbstractC0219i.e("p0", cVar);
        N3.c cVar2 = q.f9422a;
        InterfaceC0927A.f9362c.getClass();
        C0388e c0388e = z.f9471b;
        O2.b bVar = new O2.b(7, 20);
        AbstractC0219i.e("configuredReportLevels", c0388e);
        EnumC0928B enumC0928B = (EnumC0928B) ((d4.j) c0388e.f).d(cVar);
        if (enumC0928B != null) {
            return enumC0928B;
        }
        C0388e c0388e2 = q.f9424c;
        c0388e2.getClass();
        r rVar = (r) ((d4.j) c0388e2.f).d(cVar);
        if (rVar == null) {
            return EnumC0928B.IGNORE;
        }
        O2.b bVar2 = rVar.f9428b;
        return (bVar2 == null || bVar2.f2005g - bVar.f2005g > 0) ? rVar.f9427a : rVar.f9429c;
    }

    @Override // b3.AbstractC0212b, g3.InterfaceC0452b
    public final String getName() {
        return "getDefaultReportLevelForAnnotation";
    }

    @Override // b3.AbstractC0212b
    public final InterfaceC0455e j() {
        return b3.q.f5100a.c(q.class, "compiler.common.jvm");
    }

    @Override // b3.AbstractC0212b
    public final String l() {
        return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
    }
}
