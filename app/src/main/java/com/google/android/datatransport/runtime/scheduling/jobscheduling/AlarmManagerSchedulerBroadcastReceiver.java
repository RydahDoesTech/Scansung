package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import D3.c;
import K0.b;
import K0.j;
import P0.f;
import T0.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5220a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i5 = intent.getExtras().getInt("attemptNumber");
        j.b(context);
        c cVarA = b.a();
        cVarA.o(queryParameter);
        cVarA.f508g = a.b(iIntValue);
        if (queryParameter2 != null) {
            cVarA.f = Base64.decode(queryParameter2, 0);
        }
        P0.j jVar = j.a().f1645d;
        b bVarB = cVarA.b();
        P0.a aVar = new P0.a(0);
        jVar.getClass();
        jVar.f2136e.execute(new f(jVar, bVarB, i5, aVar));
    }
}
