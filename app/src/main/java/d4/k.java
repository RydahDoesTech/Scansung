package d4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final k f6414d;

    /* renamed from: e, reason: collision with root package name */
    public static final k f6415e;
    public static final k f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ k[] f6416g;

    static {
        k kVar = new k("NOT_COMPUTED", 0);
        f6414d = kVar;
        k kVar2 = new k("COMPUTING", 1);
        f6415e = kVar2;
        k kVar3 = new k("RECURSION_WAS_DETECTED", 2);
        f = kVar3;
        f6416g = new k[]{kVar, kVar2, kVar3};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f6416g.clone();
    }
}
