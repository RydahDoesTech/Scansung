package P3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final o f2266d;

    /* renamed from: e, reason: collision with root package name */
    public static final o f2267e;
    public static final o f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ o[] f2268g;

    static {
        o oVar = new o("ALL", 0);
        f2266d = oVar;
        o oVar2 = new o("ONLY_NON_SYNTHESIZED", 1);
        f2267e = oVar2;
        o oVar3 = new o("NONE", 2);
        f = oVar3;
        f2268g = new o[]{oVar, oVar2, oVar3};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f2268g.clone();
    }
}
