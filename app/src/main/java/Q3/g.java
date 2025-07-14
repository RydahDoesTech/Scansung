package Q3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final g f2342d;

    /* renamed from: e, reason: collision with root package name */
    public static final g f2343e;
    public static final g f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ g[] f2344g;

    static {
        g gVar = new g("CONFLICTS_ONLY", 0);
        f2342d = gVar;
        g gVar2 = new g("SUCCESS_ONLY", 1);
        f2343e = gVar2;
        g gVar3 = new g("BOTH", 2);
        f = gVar3;
        f2344g = new g[]{gVar, gVar2, gVar3};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f2344g.clone();
    }
}
