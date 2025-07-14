package com.idm.fotaagent.enabler.ui.utagent.data;

import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.PollingRepository;
import com.idm.fotaagent.enabler.ui.utagent.IDMUTAgentContract;
import com.idm.fotaagent.utils.DeviceUtils;
import com.idm.fotaagent.utils.Formatted;
import com.samsung.android.fotaagent.common.DeviceId;

/* loaded from: classes.dex */
public class IDMUTAgentRepository implements IDMUTAgentSource {
    private final Context context;

    public IDMUTAgentRepository(Context context) {
        this.context = context;
    }

    @Override // com.idm.fotaagent.enabler.ui.utagent.data.IDMUTAgentSource
    public String idmGetDeviceId() {
        return DeviceId.readDeviceId(this.context);
    }

    @Override // com.idm.fotaagent.enabler.ui.utagent.data.IDMUTAgentSource
    public String idmGetPollingTime() {
        return "Next Polling Time:" + Formatted.Android.longDateAndTime(new PollingRepository(this.context).getNextTime(), "%1$s %2$s", this.context);
    }

    @Override // com.idm.fotaagent.enabler.ui.utagent.data.IDMUTAgentSource
    public String idmGetVersionInfo() {
        return "Version:" + DeviceUtils.readFirmwareVersion();
    }

    @Override // com.idm.fotaagent.enabler.ui.utagent.data.IDMUTAgentSource
    public void startLocalTest() {
        IDMApplication.getEnablerFactory().getAdminCommandExecutor(this.context).execute(IDMUTAgentContract.LOCALTEST);
    }
}
