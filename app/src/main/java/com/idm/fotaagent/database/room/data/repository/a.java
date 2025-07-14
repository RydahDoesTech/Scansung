package com.idm.fotaagent.database.room.data.repository;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CampaignQueueRepository f6248b;

    public /* synthetic */ a(CampaignQueueRepository campaignQueueRepository, int i5) {
        this.f6247a = i5;
        this.f6248b = campaignQueueRepository;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i5 = this.f6247a;
        CampaignQueueRepository campaignQueueRepository = this.f6248b;
        switch (i5) {
            case 0:
                return campaignQueueRepository.lambda$peekAll$3();
            case 1:
                return campaignQueueRepository.lambda$size$4();
            case 2:
                return campaignQueueRepository.lambda$peek$2();
            case 3:
                return campaignQueueRepository.lambda$isEmpty$5();
            default:
                return campaignQueueRepository.lambda$remove$1();
        }
    }
}
