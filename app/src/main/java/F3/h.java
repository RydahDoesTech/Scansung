package F3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final h f643d;

    /* renamed from: e, reason: collision with root package name */
    public static final h f644e;
    public static final h f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ h[] f645g;

    static {
        h hVar = new h("FORCE_FLEXIBILITY", 0);
        f643d = hVar;
        h hVar2 = new h("NULLABLE", 1);
        f644e = hVar2;
        h hVar3 = new h("NOT_NULL", 2);
        f = hVar3;
        f645g = new h[]{hVar, hVar2, hVar3};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f645g.clone();
    }
}
