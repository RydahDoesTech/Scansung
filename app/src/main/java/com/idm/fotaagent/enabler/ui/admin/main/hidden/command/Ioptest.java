package com.idm.fotaagent.enabler.ui.admin.main.hidden.command;

import android.content.Context;
import com.idm.fotaagent.database.room.data.repository.AdminRepository;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class Ioptest extends HiddenCommand {
    private final AdminRepository repository;

    /* renamed from: com.idm.fotaagent.enabler.ui.admin.main.hidden.command.Ioptest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$idm$fotaagent$database$room$data$repository$AdminRepository$IopTestMode;

        static {
            int[] iArr = new int[AdminRepository.IopTestMode.values().length];
            $SwitchMap$com$idm$fotaagent$database$room$data$repository$AdminRepository$IopTestMode = iArr;
            try {
                iArr[AdminRepository.IopTestMode.IOP_TEST_MODE_OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$database$room$data$repository$AdminRepository$IopTestMode[AdminRepository.IopTestMode.IOP_TEST_MODE_ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public Ioptest(Context context) {
        super(context);
        this.repository = new AdminRepository(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$0(Enum r22) {
        AdminRepository.IopTestMode iopTestMode = (AdminRepository.IopTestMode) r22;
        this.repository.setIopTestMode(iopTestMode);
        changeIopMode(iopTestMode);
    }

    public void changeIopMode(AdminRepository.IopTestMode iopTestMode) {
        int i5 = AnonymousClass1.$SwitchMap$com$idm$fotaagent$database$room$data$repository$AdminRepository$IopTestMode[iopTestMode.ordinal()];
        if (i5 == 1) {
            Log.I("IOP Test Off");
            this.repository.setRootingCheck(AdminRepository.RootingCheck.ROOTING_CHECK_OFF);
            this.repository.setRoamingCheck(AdminRepository.RoamingCheck.ROAMING_CHECK_OFF);
            this.repository.setPackageVerification(AdminRepository.PackageVerification.PACKAGE_VERIFICATION_OFF);
            return;
        }
        if (i5 == 2) {
            Log.I("IOP Test On");
        }
        this.repository.setRootingCheck(AdminRepository.RootingCheck.ROOTING_CHECK_ON);
        this.repository.setRoamingCheck(AdminRepository.RoamingCheck.ROAMING_CHECK_ON);
        this.repository.setPackageVerification(AdminRepository.PackageVerification.PACKAGE_VERIFICATION_ON);
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.main.hidden.command.HiddenCommand
    public void execute() {
        showDialog("IOP Test Setting", AdminRepository.IopTestMode.values(), this.repository.getIopTestMode(), new A2.c(9, this));
    }
}
