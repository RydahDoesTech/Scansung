package K0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class h implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1636d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1637e;

    public h() {
        this.f1636d = 1;
        this.f1637e = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1636d) {
            case 0:
                ((ExecutorService) this.f1637e).execute(new g(runnable, 0));
                break;
            default:
                ((Handler) this.f1637e).post(runnable);
                break;
        }
    }

    public h(ExecutorService executorService) {
        this.f1636d = 0;
        this.f1637e = executorService;
    }
}
