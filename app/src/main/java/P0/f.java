package P0;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f2121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ K0.b f2122e;
    public final /* synthetic */ int f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Runnable f2123g;

    public /* synthetic */ f(j jVar, K0.b bVar, int i5, Runnable runnable) {
        this.f2121d = jVar;
        this.f2122e = bVar;
        this.f = i5;
        this.f2123g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final K0.b bVar = this.f2122e;
        final int i5 = this.f;
        Runnable runnable = this.f2123g;
        final j jVar = this.f2121d;
        R0.c cVar = jVar.f;
        try {
            try {
                Q0.c cVar2 = jVar.f2134c;
                Objects.requireNonNull(cVar2);
                ((Q0.h) cVar).m(new I0.b(1, cVar2));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) jVar.f2132a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((Q0.h) cVar).m(new R0.b() { // from class: P0.g
                        @Override // R0.b
                        public final Object execute() {
                            jVar.f2135d.a(bVar, i5 + 1, false);
                            return null;
                        }
                    });
                } else {
                    jVar.a(bVar, i5);
                }
            } catch (R0.a unused) {
                jVar.f2135d.a(bVar, i5 + 1, false);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
