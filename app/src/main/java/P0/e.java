package P0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final e f2118d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f2119e;
    public static final e f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ e[] f2120g;

    static {
        e eVar = new e("NETWORK_UNMETERED", 0);
        f2118d = eVar;
        e eVar2 = new e("DEVICE_IDLE", 1);
        f2119e = eVar2;
        e eVar3 = new e("DEVICE_CHARGING", 2);
        f = eVar3;
        f2120g = new e[]{eVar, eVar2, eVar3};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f2120g.clone();
    }
}
