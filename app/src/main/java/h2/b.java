package h2;

import a2.o;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f6855b = new a();

    /* renamed from: a, reason: collision with root package name */
    public o f6856a;

    public final int a(String str) {
        boolean zA;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zA2 = ((d) this.f6856a.get()).a(str, jCurrentTimeMillis);
        d dVar = (d) this.f6856a.get();
        synchronized (dVar) {
            zA = dVar.a("fire-global", jCurrentTimeMillis);
        }
        if (zA2 && zA) {
            return 4;
        }
        if (zA) {
            return 3;
        }
        return zA2 ? 2 : 1;
    }
}
