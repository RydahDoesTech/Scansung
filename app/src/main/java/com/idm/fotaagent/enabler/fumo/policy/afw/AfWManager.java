package com.idm.fotaagent.enabler.fumo.policy.afw;

import A3.f;
import android.app.admin.SystemUpdatePolicy;
import android.content.Context;
import android.text.TextUtils;
import com.idm.agent.dl.DLResultCode;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.database.room.data.repository.PolicyRepository;
import com.idm.fotaagent.enabler.fumo.policy.afw.duration.PolicyManager;
import com.idm.fotaagent.enabler.fumo.policy.exceptions.DownloadNotAllowedByPolicyException;
import com.idm.fotaagent.enabler.fumo.policy.exceptions.InstallFailedByPolicyException;
import com.idm.fotaagent.enabler.fumo.policy.exceptions.InstallSuspendedByPolicyException;
import com.idm.fotaagent.enabler.fumo.policy.interfaces.Behavior;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class AfWManager {
    private final Context context = getContext();

    public static class Automatic extends Default {
        public Automatic() {
            super();
        }
    }

    public static class Default implements Behavior {
        private Default() {
        }

        @Override // com.idm.fotaagent.enabler.fumo.policy.interfaces.Behavior
        public void checkDownloadable() {
        }

        @Override // com.idm.fotaagent.enabler.fumo.policy.interfaces.Behavior
        public void checkInstallable() {
        }
    }

    public static class Pause extends Default {
        public Pause() {
            super();
        }

        @Override // com.idm.fotaagent.enabler.fumo.policy.afw.AfWManager.Default, com.idm.fotaagent.enabler.fumo.policy.interfaces.Behavior
        public void checkInstallable() throws InstallSuspendedByPolicyException {
            throw new InstallSuspendedByPolicyException("Out of install window (daily maintenance window)");
        }
    }

    public static class Postpone extends Default {
        public Postpone() {
            super();
        }

        @Override // com.idm.fotaagent.enabler.fumo.policy.afw.AfWManager.Default, com.idm.fotaagent.enabler.fumo.policy.interfaces.Behavior
        public void checkDownloadable() throws DownloadNotAllowedByPolicyException {
            throw new DownloadNotAllowedByPolicyException("Download blocked by AfW", DLResultCode.BLOCKED_BY_AFW.getIndex());
        }

        @Override // com.idm.fotaagent.enabler.fumo.policy.afw.AfWManager.Default, com.idm.fotaagent.enabler.fumo.policy.interfaces.Behavior
        public void checkInstallable() throws InstallFailedByPolicyException {
            throw new InstallFailedByPolicyException("Install blocked by AfW", DLResultCode.BLOCKED_BY_AFW.getDmResultCode());
        }
    }

    private static Context getContext() {
        return IDMApplication.idmGetContext();
    }

    public Behavior getBehavior() {
        int optionType = getOptionType();
        f.t("InstallationOptionType : ", optionType);
        return optionType != 1 ? optionType != 3 ? optionType != 1001 ? new Default() : new Pause() : new Postpone() : new Automatic();
    }

    public int getOptionType() {
        SystemUpdatePolicy.SemInstallationOption installationOption = SystemPolicy.getInstallationOption(this.context, System.currentTimeMillis());
        if (installationOption == null) {
            return -1;
        }
        if (FreezePeriods.isFreezePeriod()) {
            Log.I("1. Inside of the FreezePeriod. Apply the postpone behavior");
            return 3;
        }
        int policyType = SystemPolicy.getPolicyType(this.context);
        f.t("2. Outside of the FreezePeriod. Check out the policy : ", policyType);
        if ((policyType == 2 || policyType == 3) && new PolicyRepository(this.context).isExpired()) {
            Log.I("2-1. Policy was already expired. Default behavior");
            return -1;
        }
        Log.I("2-2. Use a type of the InstallationOption as the behavior");
        return installationOption.getType();
    }

    public boolean isAutomaticBehavior() {
        return getOptionType() == 1;
    }

    public boolean isNewVersion() {
        Context context = getContext();
        String otaVersion = new PolicyRepository(context).getOtaVersion();
        String updateFwVersion = new InstallParamRepository(context).getUpdateFwVersion();
        Log.I("pastFumoUpdateVersion : " + otaVersion + ", currentFumoUpdateVersion : " + updateFwVersion);
        if (!TextUtils.isEmpty(otaVersion)) {
            return !updateFwVersion.equals(otaVersion);
        }
        new PolicyRepository(context).setOtaVersion(updateFwVersion);
        return false;
    }

    public void restartPolicyTimerIfNeeded() {
        if (FreezePeriods.isFreezePeriod() || !isNewVersion()) {
            return;
        }
        Log.I("New software version. restart timer");
        PolicyManager.restart();
    }
}
