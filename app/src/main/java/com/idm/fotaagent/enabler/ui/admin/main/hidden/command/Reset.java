package com.idm.fotaagent.enabler.ui.admin.main.hidden.command;

import android.content.Context;
import android.text.TextUtils;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.fotaagent.InitExecutor;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.idm.fotaagent.restapi.registration.RegistrationHelper;

/* loaded from: classes.dex */
public class Reset extends HiddenCommand {
    public Reset(Context context) {
        super(context);
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.main.hidden.command.HiddenCommand
    public void execute() {
        String sessionId = new ActionInfoDao().getSessionId();
        if (!TextUtils.isEmpty(sessionId) && new ActionInfoDao(sessionId).getFumoStatus() == 30) {
            new IDMFumoExecuteHandler(sessionId).executeIfPossible(IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_PAUSE, (String) null);
        }
        InitExecutor.get().reset();
        RegistrationHelper.unregister();
        showToast("Full Reset");
    }
}
