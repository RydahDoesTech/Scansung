package H0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final c f806d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f807e;
    public static final c f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ c[] f808g;

    static {
        c cVar = new c("DEFAULT", 0);
        f806d = cVar;
        c cVar2 = new c("VERY_LOW", 1);
        f807e = cVar2;
        c cVar3 = new c("HIGHEST", 2);
        f = cVar3;
        f808g = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f808g.clone();
    }
}
