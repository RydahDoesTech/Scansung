package com.idm.fotaagent.restapi.restclient.push.campaign;

import com.idm.fotaagent.restapi.restclient.push.campaign.CampaignMessageHelper;
import java.util.NoSuchElementException;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6357a;

    public /* synthetic */ d(int i5) {
        this.f6357a = i5;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f6357a) {
            case 0:
                return new CampaignMessageHelper.EmptyCampaignQueueException();
            case 1:
                return CampaignMessage.lambda$parse$0();
            case 2:
                return new NoSuchElementException();
            default:
                return CampaignMessage.lambda$parse$2();
        }
    }
}
