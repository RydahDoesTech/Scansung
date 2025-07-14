package com.idm.fotaagent.enabler.ui.admin.main.hidden.command;

import android.content.Context;
import com.idm.fotaagent.database.room.data.repository.AdminRepository;

/* loaded from: classes.dex */
public class Rooting extends HiddenCommand {
    private final AdminRepository repository;

    public Rooting(Context context) {
        super(context);
        this.repository = new AdminRepository(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$0(Enum r12) {
        this.repository.setRootingCheck((AdminRepository.RootingCheck) r12);
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.main.hidden.command.HiddenCommand
    public void execute() {
        showDialog("Rooting Setting", AdminRepository.RootingCheck.values(), this.repository.getRootingCheck(), new A2.c(12, this));
    }
}
