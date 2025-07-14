package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0154q {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0154q f4021d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0154q f4022e;
    public static final EnumC0154q f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0154q f4023g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0154q f4024h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumC0154q[] f4025i;

    static {
        EnumC0154q enumC0154q = new EnumC0154q("DESTROYED", 0);
        f4021d = enumC0154q;
        EnumC0154q enumC0154q2 = new EnumC0154q("INITIALIZED", 1);
        f4022e = enumC0154q2;
        EnumC0154q enumC0154q3 = new EnumC0154q("CREATED", 2);
        f = enumC0154q3;
        EnumC0154q enumC0154q4 = new EnumC0154q("STARTED", 3);
        f4023g = enumC0154q4;
        EnumC0154q enumC0154q5 = new EnumC0154q("RESUMED", 4);
        f4024h = enumC0154q5;
        f4025i = new EnumC0154q[]{enumC0154q, enumC0154q2, enumC0154q3, enumC0154q4, enumC0154q5};
    }

    public static EnumC0154q valueOf(String str) {
        return (EnumC0154q) Enum.valueOf(EnumC0154q.class, str);
    }

    public static EnumC0154q[] values() {
        return (EnumC0154q[]) f4025i.clone();
    }

    public final boolean a(EnumC0154q enumC0154q) {
        return compareTo(enumC0154q) >= 0;
    }
}
