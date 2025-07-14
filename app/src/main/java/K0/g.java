package K0;

import android.os.Process;
import android.util.Log;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1634d;

    /* renamed from: e, reason: collision with root package name */
    public final Runnable f1635e;

    public /* synthetic */ g(Runnable runnable, int i5) {
        this.f1634d = i5;
        this.f1635e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        switch (this.f1634d) {
            case 0:
                try {
                    this.f1635e.run();
                    break;
                } catch (Exception e5) {
                    Log.e("TransportRuntime.".concat("Executor"), "Background execution failure.", e5);
                    return;
                }
            default:
                Process.setThreadPriority(0);
                this.f1635e.run();
                break;
        }
    }
}
