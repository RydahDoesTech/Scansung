package com.idm.fotaagent.enabler.ui.admin.main.hidden.command;

import android.content.Context;
import com.idm.adapter.logmanager.IDMDebug;

/* loaded from: classes.dex */
public class Wbxml extends HiddenCommand {
    public Wbxml(Context context) {
        super(context);
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.main.hidden.command.HiddenCommand
    public void execute() {
        IDMDebug.idmLogfileSaveOnOff();
    }
}
