package com.idm.fotaagent.analytics.diagmon;

import java.lang.Thread;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        DiagMon.handleUncaughtException(thread, th);
    }
}
