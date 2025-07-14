package com.idm.fotaagent.enabler.ui.dialog.model;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.icu.text.DecimalFormat;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.feature.ResourceGenerator;
import com.idm.fotaagent.enabler.interfaces.IntentActions;
import com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor;
import com.idm.fotaagent.enabler.ui.dialog.model.IDMUIDialogModel;
import com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.ButtonStrategy;
import com.idm.fotaagent.utils.DeviceUtils;
import com.idm.fotaagent.utils.storage.StorageType;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class InsufficientMemoryDialogModel extends IDMUIDialogModel.Base {
    private static long requiredBytes;

    public static class MessageGenerator {
        private static String getDetailMessage() {
            return InsufficientMemoryDialogModel.requiredBytes < 1 ? getSimpleMessage() : String.format(IDMUIDialogModel.Base.getString(ResourceGenerator.get().getInsufficientMemoryMessageId()), InsufficientMemoryDialogModel.sizeWithUnit(InsufficientMemoryDialogModel.requiredBytes));
        }

        public static String getMessage(ActionInfoDao actionInfoDao) {
            if (!DeviceUtils.isABModel() && actionInfoDao.getDeltaIndex() != StorageType.DATA.type() && actionInfoDao.getFumoStatus() != 50) {
                return getSimpleMessage();
            }
            return getDetailMessage();
        }

        private static String getSimpleMessage() {
            return IDMUIDialogModel.Base.getString(R.string.STR_FOTA_DOWNLOAD_FAIL);
        }
    }

    public static class StorageSettingButtonStrategy extends ButtonStrategy.Positive {
        @Override // com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.ButtonStrategy.Positive, com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.AbstractButtonStrategy
        public void doOnClick(DialogInterface dialogInterface, IDMUIDialogContractor.Presenter presenter) {
            super.doOnClick(dialogInterface, presenter);
            try {
                Intent intent = new Intent(IntentActions.IDM_INTENT_STORAGE_ANALYSIS);
                intent.setClassName("com.android.settings", "com.samsung.android.settings.analyzestorage.ui.MainActivity");
                intent.setFlags(268468224);
                IDMUIDialogModel.Base.getContext().startActivity(intent);
            } catch (ActivityNotFoundException e5) {
                Log.printStackTrace(e5);
            }
        }

        private StorageSettingButtonStrategy() {
            super(IDMUIDialogModel.Base.getString(R.string.STR_BTN_GO_STORAGE));
        }
    }

    public InsufficientMemoryDialogModel(String str) {
        super(title(), message(str), ButtonStrategy.Neutral.NONE, new ButtonStrategy.StubCancelNegative(), new StorageSettingButtonStrategy());
    }

    private static String message(String str) {
        return MessageGenerator.getMessage(new ActionInfoDao(str));
    }

    public static void setRequiredBytes(long j5) {
        requiredBytes = j5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String sizeWithUnit(long j5) {
        if (j5 < 1) {
            Log.W("bytes should be positive");
            j5 = 1;
        }
        String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        double d5 = j5;
        int iLog10 = (int) (Math.log10(d5) / Math.log10(1000.0d));
        StringBuilder sb = new StringBuilder();
        sb.append(new DecimalFormat(iLog10 <= 2 ? "###0" : "###0.##").format(d5 / Math.pow(1000.0d, iLog10)));
        sb.append(" ");
        sb.append(strArr[iLog10]);
        return sb.toString();
    }

    private static String title() {
        return IDMUIDialogModel.Base.getString(R.string.STR_INSUFFICIENT_MEMORY_TITLE);
    }
}
