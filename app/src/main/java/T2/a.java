package T2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f2554d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f2555e;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f2554d = aVar;
        f2555e = new a[]{aVar, new a("UNDECIDED", 1), new a("RESUMED", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f2555e.clone();
    }
}
