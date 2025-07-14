package Q3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final h f2345d;

    /* renamed from: e, reason: collision with root package name */
    public static final h f2346e;
    public static final h f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ h[] f2347g;

    static {
        h hVar = new h("OVERRIDABLE", 0);
        f2345d = hVar;
        h hVar2 = new h("CONFLICT", 1);
        h hVar3 = new h("INCOMPATIBLE", 2);
        f2346e = hVar3;
        h hVar4 = new h("UNKNOWN", 3);
        f = hVar4;
        f2347g = new h[]{hVar, hVar2, hVar3, hVar4};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f2347g.clone();
    }
}
