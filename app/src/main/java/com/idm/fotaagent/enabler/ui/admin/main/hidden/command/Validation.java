package com.idm.fotaagent.enabler.ui.admin.main.hidden.command;

import android.content.Context;
import com.idm.fotaagent.database.room.data.repository.AdminRepository;

/* loaded from: classes.dex */
public class Validation extends HiddenCommand {
    private final AdminRepository repository;

    public Validation(Context context) {
        super(context);
        this.repository = new AdminRepository(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$0(Enum r12) {
        this.repository.setPackageVerification((AdminRepository.PackageVerification) r12);
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.main.hidden.command.HiddenCommand
    public void execute() {
        showDialog("Verification Setting", AdminRepository.PackageVerification.values(), this.repository.getPackageVerification(), new A2.c(14, this));
    }
}
