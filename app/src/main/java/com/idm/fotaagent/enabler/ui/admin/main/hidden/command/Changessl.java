package com.idm.fotaagent.enabler.ui.admin.main.hidden.command;

import android.content.Context;
import com.idm.fotaagent.database.room.data.repository.AdminRepository;

/* loaded from: classes.dex */
public class Changessl extends HiddenCommand {
    private final AdminRepository repository;

    public Changessl(Context context) {
        super(context);
        this.repository = new AdminRepository(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$0(Enum r12) {
        this.repository.setSslCheck((AdminRepository.SslCheck) r12);
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.main.hidden.command.HiddenCommand
    public void execute() {
        showDialog("SSL Setting", AdminRepository.SslCheck.values(), this.repository.getSslCheck(), new A2.c(7, this));
    }
}
