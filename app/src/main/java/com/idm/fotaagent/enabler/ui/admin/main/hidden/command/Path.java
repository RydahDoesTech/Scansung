package com.idm.fotaagent.enabler.ui.admin.main.hidden.command;

import android.content.Context;
import com.idm.fotaagent.utils.storage.StorageType;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class Path extends HiddenCommand {
    public Path(Context context) {
        super(context);
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.main.hidden.command.HiddenCommand
    public void execute() {
        Log.I("file.idmGetCachMemoryPath() : " + StorageType.CACHE.path());
    }
}
