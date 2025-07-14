package P3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final n f2264d;

    /* renamed from: e, reason: collision with root package name */
    public static final n f2265e;
    public static final /* synthetic */ n[] f;

    static {
        n nVar = new n("RENDER_OVERRIDE", 0);
        f2264d = nVar;
        n nVar2 = new n("RENDER_OPEN", 1);
        f2265e = nVar2;
        f = new n[]{nVar, nVar2, new n("RENDER_OPEN_OVERRIDE", 2)};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f.clone();
    }
}
