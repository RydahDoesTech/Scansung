package o3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0727j {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0727j f8272d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0727j f8273e;
    public static final EnumC0727j f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0727j f8274g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumC0727j[] f8275h;

    static {
        EnumC0727j enumC0727j = new EnumC0727j("HIDDEN", 0);
        f8272d = enumC0727j;
        EnumC0727j enumC0727j2 = new EnumC0727j("VISIBLE", 1);
        f8273e = enumC0727j2;
        EnumC0727j enumC0727j3 = new EnumC0727j("NOT_CONSIDERED", 2);
        f = enumC0727j3;
        EnumC0727j enumC0727j4 = new EnumC0727j("DROP", 3);
        f8274g = enumC0727j4;
        f8275h = new EnumC0727j[]{enumC0727j, enumC0727j2, enumC0727j3, enumC0727j4};
    }

    public static EnumC0727j valueOf(String str) {
        return (EnumC0727j) Enum.valueOf(EnumC0727j.class, str);
    }

    public static EnumC0727j[] values() {
        return (EnumC0727j[]) f8275h.clone();
    }
}
