package y3;

import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: c, reason: collision with root package name */
    public static final t f9431c;

    /* renamed from: a, reason: collision with root package name */
    public final v f9432a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9433b;

    static {
        N3.c cVar = q.f9422a;
        O2.b bVar = O2.b.f2002h;
        AbstractC0219i.e("configuredKotlinVersion", bVar);
        r rVar = q.f9425d;
        O2.b bVar2 = rVar.f9428b;
        EnumC0928B enumC0928B = (bVar2 == null || bVar2.f2005g - bVar.f2005g > 0) ? rVar.f9427a : rVar.f9429c;
        AbstractC0219i.e("globalReportLevel", enumC0928B);
        v vVar = new v(enumC0928B, enumC0928B == EnumC0928B.WARN ? null : enumC0928B);
        s sVar = s.f9430l;
        f9431c = new t(vVar);
    }

    public t(v vVar) {
        s sVar = s.f9430l;
        this.f9432a = vVar;
        this.f9433b = vVar.f9438d || sVar.d(q.f9422a) == EnumC0928B.IGNORE;
    }

    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f9432a + ", getReportLevelForAnnotation=" + s.f9430l + ')';
    }
}
