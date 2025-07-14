package P0;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.idm.fotaagent.abupdate.abenabler.Executor;
import com.idm.fotaagent.utils.RebootChecker;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2109d;

    public /* synthetic */ a(int i5) {
        this.f2109d = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2109d) {
            case 0:
                int i5 = AlarmManagerSchedulerBroadcastReceiver.f5220a;
                break;
            case 1:
                Executor.AB.DownloadDescriptor.lambda$getTemperatureChecker$2();
                break;
            case 2:
                Executor.AB.DownloadDescriptor.lambda$getStarter$1();
                break;
            case 3:
                Executor.AB.DownloadProgress.lambda$getStarter$1();
                break;
            default:
                RebootChecker.stopTimerIfRunning();
                break;
        }
    }
}
