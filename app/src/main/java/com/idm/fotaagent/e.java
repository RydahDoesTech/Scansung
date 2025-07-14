package com.idm.fotaagent;

import android.content.Context;
import com.idm.adapter.callback.IDMCallback;
import com.idm.fotaagent.LibraryStarter;
import com.idm.fotaagent.database.room.debug.repository.PostponeReasonsCallback;
import com.idm.fotaagent.enabler.adapter.IDMAdapterImpl;
import com.idm.service.actioninfo.IDMActionInfo;
import com.idm.service.provider.IDMProviderService;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements LibraryStarter.IDMProviderStarter, PostponeReasonsCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6277a;

    public /* synthetic */ e(int i5) {
        this.f6277a = i5;
    }

    @Override // com.idm.fotaagent.LibraryStarter.IDMProviderStarter
    public String execute(Context context, IDMActionInfo iDMActionInfo, IDMAdapterImpl iDMAdapterImpl, IDMCallback iDMCallback) {
        switch (this.f6277a) {
            case 0:
                return IDMProviderService.idmDLStart(context, iDMActionInfo, iDMAdapterImpl, iDMCallback);
            default:
                return IDMProviderService.idmDMStart(context, iDMActionInfo, iDMAdapterImpl, iDMCallback);
        }
    }

    @Override // com.idm.fotaagent.database.room.debug.repository.PostponeReasonsCallback
    public void onPostponeReasonsLoaded(List list) {
        LibraryStarter.lambda$startDMTask$0(list);
    }
}
