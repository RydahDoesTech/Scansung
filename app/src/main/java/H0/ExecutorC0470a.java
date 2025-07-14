package h0;

import java.util.concurrent.Executor;
import l.C0677a;

/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0470a implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6843d;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f6843d) {
            case 0:
                runnable.run();
                break;
            default:
                C0677a.X().f8005c.f8007d.execute(runnable);
                break;
        }
    }
}
