package e;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class I implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6496d;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f6496d) {
            case 0:
                new Thread(runnable).start();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
