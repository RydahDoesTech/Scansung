package com.idm.fotaagent.abupdate.abenabler.ui.admin.main.hidden.executor;

import android.content.Context;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.command.HiddenCommand;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.executor.AdminCommandExecutor;

/* loaded from: classes.dex */
public class ABAdminCommandExecutor extends AdminCommandExecutor {
    static final String PATH_FOR_AB = "com.idm.fotaagent.abupdate.abenabler.ui.admin.main.hidden.command.";

    public ABAdminCommandExecutor(Context context) {
        super(context);
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.main.hidden.executor.AdminCommandExecutor
    public HiddenCommand createCommandInstance(String str) throws ClassNotFoundException {
        Class<?> cls;
        try {
            cls = Class.forName(getClassFullName(getPackagePath(), str));
        } catch (ClassNotFoundException unused) {
            cls = Class.forName(getClassFullName(super.getPackagePath(), str));
        }
        return (HiddenCommand) cls.getConstructor(Context.class).newInstance(this.context);
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.main.hidden.executor.AdminCommandExecutor
    public String getPackagePath() {
        return PATH_FOR_AB;
    }
}
