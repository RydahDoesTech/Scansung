package m2;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import k2.k;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final long f8050d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f8051e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final k f8052a;

    /* renamed from: b, reason: collision with root package name */
    public long f8053b;

    /* renamed from: c, reason: collision with root package name */
    public int f8054c;

    public d() {
        if (b4.d.f5107e == null) {
            Pattern pattern = k.f7900c;
            b4.d.f5107e = new b4.d();
        }
        b4.d dVar = b4.d.f5107e;
        if (k.f7901d == null) {
            k.f7901d = new k(dVar);
        }
        this.f8052a = k.f7901d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f8054c     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            k2.k r0 = r4.f8052a     // Catch: java.lang.Throwable -> L19
            b4.d r0 = r0.f7902a     // Catch: java.lang.Throwable -> L19
            r0.getClass()     // Catch: java.lang.Throwable -> L19
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            long r2 = r4.f8053b     // Catch: java.lang.Throwable -> L19
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L17
            goto L1b
        L17:
            r0 = 0
            goto L1c
        L19:
            r0 = move-exception
            goto L1e
        L1b:
            r0 = 1
        L1c:
            monitor-exit(r4)
            return r0
        L1e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L19
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.d.a():boolean");
    }

    public final synchronized void b(int i5) {
        long jMin;
        if ((i5 >= 200 && i5 < 300) || i5 == 401 || i5 == 404) {
            synchronized (this) {
                this.f8054c = 0;
            }
            return;
        }
        this.f8054c++;
        synchronized (this) {
            if (i5 == 429 || (i5 >= 500 && i5 < 600)) {
                double dPow = Math.pow(2.0d, this.f8054c);
                this.f8052a.getClass();
                jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f8051e);
            } else {
                jMin = f8050d;
            }
            this.f8052a.f7902a.getClass();
            this.f8053b = System.currentTimeMillis() + jMin;
        }
        return;
    }
}
