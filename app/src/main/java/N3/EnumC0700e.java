package n3;

import m3.n;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'i' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: n3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0700e {
    public static final O1.e f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0700e f8181g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0700e f8182h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0700e f8183i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC0700e f8184j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ EnumC0700e[] f8185k;

    /* renamed from: d, reason: collision with root package name */
    public final N3.c f8186d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8187e;

    static {
        EnumC0700e enumC0700e = new EnumC0700e("Function", 0, n.f8150j, "Function");
        f8181g = enumC0700e;
        EnumC0700e enumC0700e2 = new EnumC0700e("SuspendFunction", 1, n.f8146e, "SuspendFunction");
        f8182h = enumC0700e2;
        N3.c cVar = n.f8148h;
        EnumC0700e enumC0700e3 = new EnumC0700e("KFunction", 2, cVar, "KFunction");
        f8183i = enumC0700e3;
        EnumC0700e enumC0700e4 = new EnumC0700e("KSuspendFunction", 3, cVar, "KSuspendFunction");
        f8184j = enumC0700e4;
        f8185k = new EnumC0700e[]{enumC0700e, enumC0700e2, enumC0700e3, enumC0700e4};
        f = new O1.e(17);
    }

    public EnumC0700e(String str, int i5, N3.c cVar, String str2) {
        this.f8186d = cVar;
        this.f8187e = str2;
    }

    public static EnumC0700e valueOf(String str) {
        return (EnumC0700e) Enum.valueOf(EnumC0700e.class, str);
    }

    public static EnumC0700e[] values() {
        return (EnumC0700e[]) f8185k.clone();
    }

    public final N3.f a(int i5) {
        return N3.f.e(this.f8187e + i5);
    }
}
