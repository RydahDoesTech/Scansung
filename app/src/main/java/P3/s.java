package P3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: d, reason: collision with root package name */
    public static final r f2271d;

    /* renamed from: e, reason: collision with root package name */
    public static final q f2272e;
    public static final /* synthetic */ s[] f;

    static {
        r rVar = new r();
        f2271d = rVar;
        q qVar = new q();
        f2272e = qVar;
        f = new s[]{rVar, qVar};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f.clone();
    }

    public abstract String a(String str);
}
