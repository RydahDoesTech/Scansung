package com.idm.fotaagent.enabler.ui.admin.main.hidden.command;

import android.content.Context;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class Mypath extends HiddenCommand {
    public Mypath(Context context) {
        super(context);
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.main.hidden.command.HiddenCommand
    public void execute() {
        Log.I("My Path : " + this.context.getApplicationInfo().dataDir);
    }
}
