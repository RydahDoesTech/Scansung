package h1;

import K0.g;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0474a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f6853a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadFactory f6854b = Executors.defaultThreadFactory();

    public ThreadFactoryC0474a(String str) {
        this.f6853a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f6854b.newThread(new g(runnable, 1));
        threadNewThread.setName(this.f6853a);
        return threadNewThread;
    }
}
