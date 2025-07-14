package com.idm.fotaagent.enabler.feature;

import com.wssyncmldm.R;

/* loaded from: classes.dex */
public abstract class UpdateTypeStrategy {

    public static class AB extends UpdateTypeStrategy {
        @Override // com.idm.fotaagent.enabler.feature.UpdateTypeStrategy
        public int getDownloadConfirmHighEmphasisButtonTitleId() {
            return R.string.STR_UPDATE_AB;
        }

        @Override // com.idm.fotaagent.enabler.feature.UpdateTypeStrategy
        public int getInstallConfirmHighEmphasisButtonTitleId() {
            return R.string.STR_RESTART_NOW_AB;
        }

        @Override // com.idm.fotaagent.enabler.feature.UpdateTypeStrategy
        public int getInstallConfirmImportantTitleId() {
            return R.string.STR_FOTA_IMPORTANT_UPDATE_TITLE;
        }

        @Override // com.idm.fotaagent.enabler.feature.UpdateTypeStrategy
        public int getInstallConfirmMediumEmphasisButtonTitleId() {
            return R.string.STR_SCHEDULE_RESTART_AB;
        }
    }

    public static class NonAB extends UpdateTypeStrategy {
        @Override // com.idm.fotaagent.enabler.feature.UpdateTypeStrategy
        public int getDownloadConfirmHighEmphasisButtonTitleId() {
            return R.string.STR_BTN_DOWNLOAD;
        }

        @Override // com.idm.fotaagent.enabler.feature.UpdateTypeStrategy
        public int getInstallConfirmHighEmphasisButtonTitleId() {
            return R.string.STR_BTN_INSTALL;
        }

        @Override // com.idm.fotaagent.enabler.feature.UpdateTypeStrategy
        public int getInstallConfirmImportantTitleId() {
            return R.string.STR_FOTA_INSTALL_CONFIRM_IMPORTANT_UPDATE_TITLE;
        }

        @Override // com.idm.fotaagent.enabler.feature.UpdateTypeStrategy
        public int getInstallConfirmMediumEmphasisButtonTitleId() {
            return R.string.STR_BTN_SCHEDULE_INSTALL;
        }
    }

    public abstract int getDownloadConfirmHighEmphasisButtonTitleId();

    public abstract int getInstallConfirmHighEmphasisButtonTitleId();

    public abstract int getInstallConfirmImportantTitleId();

    public abstract int getInstallConfirmMediumEmphasisButtonTitleId();
}
