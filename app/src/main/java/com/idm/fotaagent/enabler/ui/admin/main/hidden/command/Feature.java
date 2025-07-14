package com.idm.fotaagent.enabler.ui.admin.main.hidden.command;

import android.content.Context;
import android.content.Intent;
import com.idm.fotaagent.enabler.ui.admin.feature.AdminFeatureAndActionActivity;

/* loaded from: classes.dex */
public class Feature extends HiddenCommand {
    public Feature(Context context) {
        super(context);
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.main.hidden.command.HiddenCommand
    public void execute() {
        this.context.startActivity(new Intent(this.context, (Class<?>) AdminFeatureAndActionActivity.class));
    }
}
