package x3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: x3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0915b {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0915b f9315d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0915b f9316e;
    public static final EnumC0915b f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0915b f9317g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0915b f9318h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0915b f9319i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC0915b f9320j;

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC0915b f9321k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ EnumC0915b[] f9322l;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0915b EF0;

    static {
        EnumC0915b enumC0915b = new EnumC0915b("FROM_IDE", 0);
        EnumC0915b enumC0915b2 = new EnumC0915b("FROM_BACKEND", 1);
        EnumC0915b enumC0915b3 = new EnumC0915b("FROM_TEST", 2);
        EnumC0915b enumC0915b4 = new EnumC0915b("FROM_BUILTINS", 3);
        f9315d = enumC0915b4;
        EnumC0915b enumC0915b5 = new EnumC0915b("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
        EnumC0915b enumC0915b6 = new EnumC0915b("WHEN_CHECK_OVERRIDES", 5);
        EnumC0915b enumC0915b7 = new EnumC0915b("FOR_SCRIPT", 6);
        EnumC0915b enumC0915b8 = new EnumC0915b("FROM_REFLECTION", 7);
        f9316e = enumC0915b8;
        EnumC0915b enumC0915b9 = new EnumC0915b("WHEN_RESOLVE_DECLARATION", 8);
        EnumC0915b enumC0915b10 = new EnumC0915b("WHEN_GET_DECLARATION_SCOPE", 9);
        EnumC0915b enumC0915b11 = new EnumC0915b("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
        EnumC0915b enumC0915b12 = new EnumC0915b("FOR_ALREADY_TRACKED", 11);
        f = enumC0915b12;
        EnumC0915b enumC0915b13 = new EnumC0915b("WHEN_GET_ALL_DESCRIPTORS", 12);
        f9317g = enumC0915b13;
        EnumC0915b enumC0915b14 = new EnumC0915b("WHEN_TYPING", 13);
        EnumC0915b enumC0915b15 = new EnumC0915b("WHEN_GET_SUPER_MEMBERS", 14);
        f9318h = enumC0915b15;
        EnumC0915b enumC0915b16 = new EnumC0915b("FOR_NON_TRACKED_SCOPE", 15);
        f9319i = enumC0915b16;
        EnumC0915b enumC0915b17 = new EnumC0915b("FROM_SYNTHETIC_SCOPE", 16);
        EnumC0915b enumC0915b18 = new EnumC0915b("FROM_DESERIALIZATION", 17);
        f9320j = enumC0915b18;
        EnumC0915b enumC0915b19 = new EnumC0915b("FROM_JAVA_LOADER", 18);
        f9321k = enumC0915b19;
        f9322l = new EnumC0915b[]{enumC0915b, enumC0915b2, enumC0915b3, enumC0915b4, enumC0915b5, enumC0915b6, enumC0915b7, enumC0915b8, enumC0915b9, enumC0915b10, enumC0915b11, enumC0915b12, enumC0915b13, enumC0915b14, enumC0915b15, enumC0915b16, enumC0915b17, enumC0915b18, enumC0915b19, new EnumC0915b("WHEN_GET_LOCAL_VARIABLE", 19), new EnumC0915b("WHEN_FIND_BY_FQNAME", 20), new EnumC0915b("WHEN_GET_COMPANION_OBJECT", 21), new EnumC0915b("FOR_DEFAULT_IMPORTS", 22)};
    }

    public static EnumC0915b valueOf(String str) {
        return (EnumC0915b) Enum.valueOf(EnumC0915b.class, str);
    }

    public static EnumC0915b[] values() {
        return (EnumC0915b[]) f9322l.clone();
    }
}
