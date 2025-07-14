package com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.context;

import com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.DownloadAndInstallState;
import com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.IdleState;
import com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.OptimizeState;
import com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.UpdateState;
import com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.VerifyState;
import com.idm.fotaagent.abupdate.updateengine.UpdateStatus;

/* loaded from: classes.dex */
public class UpdateStateFactory {

    /* renamed from: com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.context.UpdateStateFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$idm$fotaagent$abupdate$updateengine$UpdateStatus$InstallationStep;

        static {
            int[] iArr = new int[UpdateStatus.InstallationStep.values().length];
            $SwitchMap$com$idm$fotaagent$abupdate$updateengine$UpdateStatus$InstallationStep = iArr;
            try {
                iArr[UpdateStatus.InstallationStep.DOWNLOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$abupdate$updateengine$UpdateStatus$InstallationStep[UpdateStatus.InstallationStep.VERIFYING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$abupdate$updateengine$UpdateStatus$InstallationStep[UpdateStatus.InstallationStep.OPTIMIZING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static UpdateState createOf(UpdateStatus.InstallationStep installationStep) {
        int i5 = AnonymousClass1.$SwitchMap$com$idm$fotaagent$abupdate$updateengine$UpdateStatus$InstallationStep[installationStep.ordinal()];
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? new IdleState() : new OptimizeState() : new VerifyState() : new DownloadAndInstallState();
    }
}
