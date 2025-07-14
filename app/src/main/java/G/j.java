package G;

import android.os.Process;

/* loaded from: classes.dex */
public final class j extends Thread {

    /* renamed from: d, reason: collision with root package name */
    public final int f698d;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f698d = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.f698d);
        super.run();
    }
}
