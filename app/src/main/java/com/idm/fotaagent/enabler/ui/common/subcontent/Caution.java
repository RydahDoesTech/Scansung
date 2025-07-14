package com.idm.fotaagent.enabler.ui.common.subcontent;

import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.enabler.feature.ResourceGenerator;
import com.idm.fotaagent.enabler.ui.common.subcontent.ContentInjector;
import com.samsung.android.fotaagent.common.FotaTelephonyManager;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class Caution extends ContentInjector.Model.TitleAndBullets.WithTitleImage {
    public Caution() {
        super(makeParagraphs());
    }

    private static Context getContext() {
        return IDMApplication.idmGetContext();
    }

    private static CharSequence[] makeParagraphs() {
        return new CharSequence[]{getContext().getString(ResourceGenerator.get().getCautionNotUseDuringUpdateMessageId(FotaTelephonyManager.isVoiceCapable(getContext()))), getContext().getString(R.string.STR_FOTA_INSTALL_CAUTION_SETTINGS_MAY_CHANGE), getContext().getString(R.string.STR_FOTA_INSTALL_CAUTION_BACK_UP_DATA)};
    }

    @Override // com.idm.fotaagent.enabler.ui.common.subcontent.ContentInjector.Model.TitleAndBullets
    public int getTitleId() {
        return R.string.STR_CAUTION;
    }
}
