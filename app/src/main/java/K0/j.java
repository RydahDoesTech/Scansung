package K0;

import P0.k;
import android.content.Context;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static volatile d f1641e;

    /* renamed from: a, reason: collision with root package name */
    public final S0.a f1642a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.a f1643b;

    /* renamed from: c, reason: collision with root package name */
    public final O0.d f1644c;

    /* renamed from: d, reason: collision with root package name */
    public final P0.j f1645d;

    public j(S0.a aVar, S0.a aVar2, O0.d dVar, P0.j jVar, k kVar) {
        this.f1642a = aVar;
        this.f1643b = aVar2;
        this.f1644c = dVar;
        this.f1645d = jVar;
        kVar.getClass();
        kVar.f2138a.execute(new C1.b(2, kVar));
    }

    public static j a() {
        d dVar = f1641e;
        if (dVar != null) {
            return (j) dVar.f1630h.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f1641e == null) {
            synchronized (j.class) {
                try {
                    if (f1641e == null) {
                        c cVar = new c();
                        context.getClass();
                        cVar.f1626a = context;
                        f1641e = cVar.b();
                    }
                } finally {
                }
            }
        }
    }
}
