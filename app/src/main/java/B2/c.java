package B2;

import android.app.admin.SystemUpdatePolicy;
import android.app.job.JobInfo;
import com.idm.fotaagent.enabler.fumo.policy.afw.SystemPolicy;
import com.idm.fotaagent.restapi.registration.context.Registration;
import com.idm.fotaagent.restapi.registration.context.SchedulableRegistration;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f220b;

    public /* synthetic */ c(int i5, long j5) {
        this.f219a = i5;
        this.f220b = j5;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f219a) {
            case 0:
                return Registration.lambda$scheduleFallback$1(this.f220b, (JobInfo.Builder) obj);
            case 1:
                return SchedulableRegistration.lambda$schedule$0(this.f220b, (JobInfo.Builder) obj);
            default:
                return SystemPolicy.lambda$getInstallationOption$0(this.f220b, (SystemUpdatePolicy) obj);
        }
    }
}
