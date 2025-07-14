package com.idm.fotaagent.utils.battery;

import android.content.Context;
import android.os.BatteryManager;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.enabler.feature.Operator;
import com.idm.fotaagent.enabler.ui.whatsnew.a;
import com.idm.fotaagent.scheduler.b;
import com.idm.fotaagent.utils.DeviceUtils;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Optional;

/* loaded from: classes.dex */
public abstract class BatteryChecker {
    protected final Context context;

    public static class ForAB extends BatteryChecker {
        private static final int BATTERY_LEVEL_FOR_DEFAULT = 20;
        private static final int BATTERY_LEVEL_GAP_FOR_DOWNLOAD = 10;

        @Override // com.idm.fotaagent.utils.battery.BatteryChecker
        public int getBatteryLevelToUpdate() {
            InstallParamRepository installParamRepository = new InstallParamRepository(this.context);
            return new FotaJobRepository(this.context).isDownloadingFinished() ? installParamRepository.getBatteryInstallLevel().orElse(20).intValue() : installParamRepository.getBatteryInstallLevel().orElse(20).intValue() + 10;
        }

        private ForAB(Context context) {
            super(context);
        }
    }

    public static class ForNonAB extends BatteryChecker {
        /* JADX INFO: Access modifiers changed from: private */
        public int getBatteryLevel() {
            return Operator.get().getBatteryLevel();
        }

        @Override // com.idm.fotaagent.utils.battery.BatteryChecker
        public int getBatteryLevelToUpdate() {
            return new InstallParamRepository(this.context).getBatteryInstallLevel().orElseGet(new b(1, this)).intValue();
        }

        private ForNonAB(Context context) {
            super(context);
        }
    }

    public static BatteryChecker get(Context context) {
        return DeviceUtils.isABModel() ? new ForAB(context) : new ForNonAB(context);
    }

    private boolean isEnoughBattery(int i5) {
        int iIntValue = ((Integer) Optional.ofNullable((BatteryManager) this.context.getSystemService("batterymanager")).map(new a(4)).orElse(0)).intValue();
        boolean z4 = iIntValue >= i5;
        Log.I(z4 + " Current Battery Level [" + iIntValue + "] Battery Criterion [" + i5 + "]");
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$isEnoughBattery$0(BatteryManager batteryManager) {
        return Integer.valueOf(batteryManager.getIntProperty(4));
    }

    public abstract int getBatteryLevelToUpdate();

    public boolean isEnoughBatteryToUpdate() {
        return isEnoughBattery(getBatteryLevelToUpdate());
    }

    private BatteryChecker(Context context) {
        this.context = context;
    }
}
