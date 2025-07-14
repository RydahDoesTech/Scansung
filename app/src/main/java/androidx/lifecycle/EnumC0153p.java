package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0153p {
    private static final /* synthetic */ EnumC0153p[] $VALUES;
    public static final C0151n Companion;
    public static final EnumC0153p ON_ANY;
    public static final EnumC0153p ON_CREATE;
    public static final EnumC0153p ON_DESTROY;
    public static final EnumC0153p ON_PAUSE;
    public static final EnumC0153p ON_RESUME;
    public static final EnumC0153p ON_START;
    public static final EnumC0153p ON_STOP;

    static {
        EnumC0153p enumC0153p = new EnumC0153p("ON_CREATE", 0);
        ON_CREATE = enumC0153p;
        EnumC0153p enumC0153p2 = new EnumC0153p("ON_START", 1);
        ON_START = enumC0153p2;
        EnumC0153p enumC0153p3 = new EnumC0153p("ON_RESUME", 2);
        ON_RESUME = enumC0153p3;
        EnumC0153p enumC0153p4 = new EnumC0153p("ON_PAUSE", 3);
        ON_PAUSE = enumC0153p4;
        EnumC0153p enumC0153p5 = new EnumC0153p("ON_STOP", 4);
        ON_STOP = enumC0153p5;
        EnumC0153p enumC0153p6 = new EnumC0153p("ON_DESTROY", 5);
        ON_DESTROY = enumC0153p6;
        EnumC0153p enumC0153p7 = new EnumC0153p("ON_ANY", 6);
        ON_ANY = enumC0153p7;
        $VALUES = new EnumC0153p[]{enumC0153p, enumC0153p2, enumC0153p3, enumC0153p4, enumC0153p5, enumC0153p6, enumC0153p7};
        Companion = new C0151n();
    }

    public static EnumC0153p valueOf(String str) {
        return (EnumC0153p) Enum.valueOf(EnumC0153p.class, str);
    }

    public static EnumC0153p[] values() {
        return (EnumC0153p[]) $VALUES.clone();
    }

    public final EnumC0154q a() {
        switch (AbstractC0152o.f4020a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0154q.f;
            case 3:
            case 4:
                return EnumC0154q.f4023g;
            case 5:
                return EnumC0154q.f4024h;
            case 6:
                return EnumC0154q.f4021d;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
