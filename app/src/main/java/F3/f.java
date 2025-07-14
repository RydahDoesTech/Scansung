package F3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final f f640d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f641e;
    public static final /* synthetic */ f[] f;

    static {
        f fVar = new f("READ_ONLY", 0);
        f640d = fVar;
        f fVar2 = new f("MUTABLE", 1);
        f641e = fVar2;
        f = new f[]{fVar, fVar2};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f.clone();
    }
}
