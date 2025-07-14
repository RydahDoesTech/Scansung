package O3;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class Q {
    public static final Q f;

    /* renamed from: g, reason: collision with root package name */
    public static final Q f2043g;

    /* renamed from: h, reason: collision with root package name */
    public static final N f2044h;

    /* renamed from: i, reason: collision with root package name */
    public static final O f2045i;

    /* renamed from: j, reason: collision with root package name */
    public static final Q f2046j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ Q[] f2047k;

    /* renamed from: d, reason: collision with root package name */
    public final S f2048d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2049e;

    /* JADX INFO: Fake field, exist only in values array */
    Q EF0;

    /* JADX INFO: Fake field, exist only in values array */
    Q EF1;

    /* JADX INFO: Fake field, exist only in values array */
    Q EF2;

    static {
        Q q5 = new Q("DOUBLE", 0, S.DOUBLE, 1);
        Q q6 = new Q("FLOAT", 1, S.FLOAT, 5);
        S s2 = S.LONG;
        Q q7 = new Q("INT64", 2, s2, 0);
        Q q8 = new Q("UINT64", 3, s2, 0);
        S s4 = S.INT;
        Q q9 = new Q("INT32", 4, s4, 0);
        f = q9;
        Q q10 = new Q("FIXED64", 5, s2, 1);
        Q q11 = new Q("FIXED32", 6, s4, 5);
        Q q12 = new Q("BOOL", 7, S.BOOLEAN, 0);
        f2043g = q12;
        M m4 = new M("STRING", 8, S.STRING, 2);
        S s5 = S.MESSAGE;
        N n = new N("GROUP", 9, s5, 3);
        f2044h = n;
        O o5 = new O("MESSAGE", 10, s5, 2);
        f2045i = o5;
        P p2 = new P("BYTES", 11, S.BYTE_STRING, 2);
        Q q13 = new Q("UINT32", 12, s4, 0);
        Q q14 = new Q("ENUM", 13, S.ENUM, 0);
        f2046j = q14;
        f2047k = new Q[]{q5, q6, q7, q8, q9, q10, q11, q12, m4, n, o5, p2, q13, q14, new Q("SFIXED32", 14, s4, 5), new Q("SFIXED64", 15, s2, 1), new Q("SINT32", 16, s4, 0), new Q("SINT64", 17, s2, 0)};
    }

    public Q(String str, int i5, S s2, int i6) {
        this.f2048d = s2;
        this.f2049e = i6;
    }

    public static Q valueOf(String str) {
        return (Q) Enum.valueOf(Q.class, str);
    }

    public static Q[] values() {
        return (Q[]) f2047k.clone();
    }

    public boolean a() {
        return !(this instanceof M);
    }
}
