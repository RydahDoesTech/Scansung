package com.idm.fotaagent.restapi.registration.context;

import A3.f;
import B2.c;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import com.idm.fotaagent.database.room.data.repository.DeviceRegistrationRepository;
import com.idm.fotaagent.database.room.data.repository.PushRegistrationRepository;
import com.idm.fotaagent.restapi.registration.RegistrationHelper;
import com.idm.fotaagent.utils.GeneralUtils;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* loaded from: classes.dex */
public abstract class SchedulableRegistration extends Registration {
    private static final int WITHOUT_UNREGISTRATION = 760745593;
    private static final int WITH_PUSH_UNREGISTRATION = 760745594;
    private static final int WITH_UNREGISTRATION = 760745595;
    private final int jobId;

    public static class RegistrationJobService extends JobService {
        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            int jobId = jobParameters.getJobId();
            Log.I("jobId: " + jobId);
            if (!new DeviceRegistrationRepository(getApplicationContext()).isInvalid()) {
                SchedulableRegistration.forJobId(getApplicationContext(), jobId).start();
                return false;
            }
            Log.I("Invalid device; start registration with 1 month latency");
            RegistrationHelper.startDeviceRegistration(getApplicationContext(), DeviceRegistrationRepository.Requester.FOTA_AGENT, TimeUnit.DAYS.toMillis(30L));
            return false;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            Log.E("should not reach here: " + jobParameters);
            return false;
        }
    }

    public static class WithPushUnregistration extends SchedulableRegistration {
        public WithPushUnregistration(Context context) {
            super(context, SchedulableRegistration.WITH_PUSH_UNREGISTRATION);
        }

        @Override // com.idm.fotaagent.restapi.registration.context.Registration
        public void unregisterIfNeeded() {
            new PushRegistrationRepository(getApplicationContext()).unregister();
        }
    }

    public static class WithUnregistration extends SchedulableRegistration {
        public WithUnregistration(Context context) {
            super(context, SchedulableRegistration.WITH_UNREGISTRATION);
        }

        @Override // com.idm.fotaagent.restapi.registration.context.Registration
        public void unregisterIfNeeded() {
            RegistrationHelper.unregister();
        }
    }

    public static class WithoutUnregistration extends SchedulableRegistration {
        public WithoutUnregistration(Context context) {
            super(context, SchedulableRegistration.WITHOUT_UNREGISTRATION);
        }

        @Override // com.idm.fotaagent.restapi.registration.context.Registration
        public void unregisterIfNeeded() {
        }
    }

    public SchedulableRegistration(Context context, int i5) {
        super(context);
        this.jobId = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SchedulableRegistration forJobId(Context context, int i5) {
        switch (i5) {
            case WITHOUT_UNREGISTRATION /* 760745593 */:
                return new WithoutUnregistration(context);
            case WITH_PUSH_UNREGISTRATION /* 760745594 */:
                return new WithPushUnregistration(context);
            case WITH_UNREGISTRATION /* 760745595 */:
                return new WithUnregistration(context);
            default:
                Log.W("Wrong registrationJobId: " + i5 + " handled as WithoutUnregistration");
                return new WithoutUnregistration(context);
        }
    }

    private static boolean isJobPending(Context context, int... iArr) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService(JobScheduler.class);
        if (jobScheduler == null) {
            Log.E("jobScheduler should not be null");
            return false;
        }
        for (int i5 : iArr) {
            if (jobScheduler.getPendingJob(i5) != null) {
                f.t("pending jobId: ", i5);
                return true;
            }
        }
        return false;
    }

    public static boolean isRegistrationJobPending(Context context) {
        return isJobPending(context, WITHOUT_UNREGISTRATION, WITH_PUSH_UNREGISTRATION, WITH_UNREGISTRATION);
    }

    public static boolean isWithoutUnregistrationJobPending(Context context) {
        return isJobPending(context, WITHOUT_UNREGISTRATION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JobInfo lambda$schedule$0(long j5, JobInfo.Builder builder) {
        return builder.setMinimumLatency(j5).build();
    }

    public void cancel() {
        Log.I("");
        JobScheduler jobScheduler = (JobScheduler) getApplicationContext().getSystemService(JobScheduler.class);
        if (jobScheduler == null) {
            Log.E("jobScheduler should not be null");
        } else {
            jobScheduler.cancel(this.jobId);
        }
    }

    @Override // com.idm.fotaagent.restapi.registration.context.Registration
    public SchedulableRegistration getFallback() {
        return this;
    }

    public void schedule(long j5) {
        if (!GeneralUtils.isSetupWizardCompleted(getApplicationContext())) {
            unregisterIfNeeded();
            return;
        }
        Log.I("min latency: " + j5 + " ms");
        scheduleTemplate(new c(1, j5));
    }

    public void scheduleTemplate(Function<JobInfo.Builder, JobInfo> function) {
        JobScheduler jobScheduler = (JobScheduler) getApplicationContext().getSystemService(JobScheduler.class);
        if (jobScheduler == null) {
            Log.E("jobScheduler should not be null");
            return;
        }
        JobInfo jobInfoApply = function.apply(new JobInfo.Builder(this.jobId, new ComponentName(getApplicationContext(), (Class<?>) RegistrationJobService.class)).setPersisted(true));
        Log.I("job id: " + jobInfoApply.getId() + ", min latency: " + jobInfoApply.getMinLatencyMillis() + ", interval: " + jobInfoApply.getIntervalMillis() + ", flex: " + jobInfoApply.getFlexMillis());
        Log.I("schedule - ".concat(jobScheduler.schedule(jobInfoApply) == 1 ? "SUCCESS" : "FAIL"));
    }
}
