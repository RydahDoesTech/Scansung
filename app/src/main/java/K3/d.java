package K3;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f1658a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1659b;

    public d(int i5, int i6) {
        this.f1658a = i5;
        this.f1659b = i6;
    }

    public static b a(d dVar) {
        return new b(dVar.f1658a + dVar.f1659b, 1);
    }

    public static b b() {
        return new b(0, 1);
    }
}
