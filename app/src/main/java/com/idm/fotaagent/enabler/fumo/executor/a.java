package com.idm.fotaagent.enabler.fumo.executor;

import com.idm.fotaagent.database.room.data.repository.DmNotificationRepository;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Consumer {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ IDMFumoExecutor f6285e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(IDMFumoExecutor iDMFumoExecutor, Object obj, int i5) {
        this.f6284d = i5;
        this.f6285e = iDMFumoExecutor;
        this.f = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f6284d) {
            case 0:
                this.f6285e.lambda$updateInformation$0((String) this.f, (IDMFumoExecutor.Updater) obj);
                break;
            default:
                ((IDMFumoExecutorFinishAndExecute) this.f6285e).lambda$overrideFumoExtIfMatches$0((DmNotificationRepository) this.f, (String) obj);
                break;
        }
    }
}
