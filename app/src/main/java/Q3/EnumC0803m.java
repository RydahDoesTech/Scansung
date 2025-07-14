package q3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0803m {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0803m f8491d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0803m f8492e;
    public static final EnumC0803m f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0803m[] f8493g;

    static {
        EnumC0803m enumC0803m = new EnumC0803m("RUNTIME", 0);
        f8491d = enumC0803m;
        EnumC0803m enumC0803m2 = new EnumC0803m("BINARY", 1);
        f8492e = enumC0803m2;
        EnumC0803m enumC0803m3 = new EnumC0803m("SOURCE", 2);
        f = enumC0803m3;
        f8493g = new EnumC0803m[]{enumC0803m, enumC0803m2, enumC0803m3};
    }

    public static EnumC0803m valueOf(String str) {
        return (EnumC0803m) Enum.valueOf(EnumC0803m.class, str);
    }

    public static EnumC0803m[] values() {
        return (EnumC0803m[]) f8493g.clone();
    }
}
