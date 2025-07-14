package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import A.o;
import D3.c;
import K0.b;
import K0.j;
import P0.f;
import T0.a;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f5221d = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i5 = jobParameters.getExtras().getInt("priority");
        int i6 = jobParameters.getExtras().getInt("attemptNumber");
        j.b(getApplicationContext());
        c cVarA = b.a();
        cVarA.o(string);
        cVarA.f508g = a.b(i5);
        if (string2 != null) {
            cVarA.f = Base64.decode(string2, 0);
        }
        P0.j jVar = j.a().f1645d;
        b bVarB = cVarA.b();
        o oVar = new o(this, 2, jobParameters);
        jVar.getClass();
        jVar.f2136e.execute(new f(jVar, bVarB, i6, oVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
