package y3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: y3.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class EnumC0931E {

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0931E f9368e;
    public static final EnumC0931E f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0931E f9369g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0930D f9370h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumC0931E[] f9371i;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9372d;

    static {
        EnumC0931E enumC0931E = new EnumC0931E("NULL", 0, null);
        f9368e = enumC0931E;
        EnumC0931E enumC0931E2 = new EnumC0931E("INDEX", 1, -1);
        f = enumC0931E2;
        EnumC0931E enumC0931E3 = new EnumC0931E("FALSE", 2, Boolean.FALSE);
        f9369g = enumC0931E3;
        C0930D c0930d = new C0930D("MAP_GET_OR_DEFAULT", 3, null);
        f9370h = c0930d;
        f9371i = new EnumC0931E[]{enumC0931E, enumC0931E2, enumC0931E3, c0930d};
    }

    public EnumC0931E(String str, int i5, Object obj) {
        this.f9372d = obj;
    }

    public static EnumC0931E valueOf(String str) {
        return (EnumC0931E) Enum.valueOf(EnumC0931E.class, str);
    }

    public static EnumC0931E[] values() {
        return (EnumC0931E[]) f9371i.clone();
    }
}
