package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0386c implements Executor {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ExecutorC0386c f6136e = new ExecutorC0386c(0);
    public static final /* synthetic */ ExecutorC0386c f = new ExecutorC0386c(1);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ExecutorC0386c f6137g = new ExecutorC0386c(2);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ExecutorC0386c f6138h = new ExecutorC0386c(3);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ExecutorC0386c f6139i = new ExecutorC0386c(4);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6140d;

    public /* synthetic */ ExecutorC0386c(int i5) {
        this.f6140d = i5;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f6140d) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
