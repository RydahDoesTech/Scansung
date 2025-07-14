package k2;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7880a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f7881b;

    public c(int i5) {
        this.f7880a = i5;
        switch (i5) {
            case 1:
                this.f7881b = new AtomicInteger(0);
                break;
            default:
                this.f7881b = new AtomicInteger(1);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f7880a) {
            case 0:
                return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f7881b.getAndIncrement())));
            default:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + this.f7881b.getAndIncrement());
                return thread;
        }
    }
}
