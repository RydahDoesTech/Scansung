package com.idm.fotaagent.abupdate.manager;

import com.idm.fotaagent.database.room.data.repository.TimestampRepository;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f6243e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c(int i5, long j5, Object obj) {
        this.f6242d = i5;
        this.f = obj;
        this.f6243e = j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6242d) {
            case 0:
                ((EnablerManager) this.f).lambda$applyPayload$1(this.f6243e);
                break;
            default:
                ((TimestampRepository) this.f).lambda$setTimes$0(this.f6243e);
                break;
        }
    }
}
