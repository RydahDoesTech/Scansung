package com.idm.fotaagent.enabler.ui.admin.main.hidden.command;

import android.content.Context;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.executor.CopyAndUpdateTrigger;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class Localtestdev extends Localtest {
    public Localtestdev(Context context) {
        super(context);
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.main.hidden.command.Localtest
    public void executeLocalTest(String str, String str2) {
        String downloadPath = new ActionInfoDao(str).getDownloadPath();
        Log.I("download path : " + downloadPath);
        new CopyAndUpdateTrigger(this.context, str2, downloadPath, str, true).start();
    }
}
