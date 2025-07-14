package O0;

import I0.e;
import L0.g;
import Q0.h;
import Y0.j;
import androidx.emoji2.text.n;
import androidx.emoji2.text.o;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1901d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1902e;
    public final /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1903g;

    public /* synthetic */ a(K0.c cVar, j jVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1902e = cVar;
        this.f = jVar;
        this.f1903g = threadPoolExecutor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1901d) {
            case 0:
                K0.b bVar = (K0.b) this.f;
                String str = bVar.f1623a;
                K0.a aVar = (K0.a) this.f1903g;
                c cVar = (c) this.f1902e;
                cVar.getClass();
                Logger logger = c.f;
                try {
                    g gVarA = cVar.f1909c.a(str);
                    if (gVarA == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        ((h) cVar.f1911e).m(new b(cVar, bVar, ((e) gVarA).a(aVar), 0));
                    }
                    return;
                } catch (Exception e5) {
                    logger.warning("Error scheduling event " + e5.getMessage());
                    return;
                }
            default:
                K0.c cVar2 = (K0.c) this.f1902e;
                j jVar = (j) this.f;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1903g;
                cVar2.getClass();
                try {
                    o oVarP = V1.a.p(cVar2.f1626a);
                    if (oVarP == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    n nVar = (n) ((androidx.emoji2.text.h) oVarP.f3651b);
                    synchronized (nVar.f3676d) {
                        nVar.f = threadPoolExecutor;
                    }
                    ((androidx.emoji2.text.h) oVarP.f3651b).a(new androidx.emoji2.text.j(jVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    jVar.D(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }

    public /* synthetic */ a(c cVar, K0.b bVar, C2.a aVar, K0.a aVar2) {
        this.f1902e = cVar;
        this.f = bVar;
        this.f1903g = aVar2;
    }
}
