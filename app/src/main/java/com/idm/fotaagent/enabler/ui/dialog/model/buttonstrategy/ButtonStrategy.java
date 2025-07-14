package com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy;

import android.content.DialogInterface;
import android.content.Intent;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.analytics.samsunganalytics.SAConstants;
import com.idm.fotaagent.analytics.samsunganalytics.SALogging;
import com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public interface ButtonStrategy {
    public static final ButtonStrategy NONE = null;

    public static abstract class Negative extends AbstractButtonStrategy {
        public static final Negative NONE = (Negative) ButtonStrategy.NONE;

        public Negative(String str) {
            super(str, -2);
        }

        @Override // com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.AbstractButtonStrategy
        public void doOnClick(DialogInterface dialogInterface, IDMUIDialogContractor.Presenter presenter) {
            SALogging.send(presenter.getScreenId(), SAConstants.EventId.EVENT_ID_DIALOG_NEGATIVE_BUTTON, null);
        }

        @Override // com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.AbstractButtonStrategy, com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.ButtonStrategy
        public /* bridge */ /* synthetic */ void onClick(DialogInterface dialogInterface, IDMUIDialogContractor.Presenter presenter) {
            super.onClick(dialogInterface, presenter);
        }
    }

    public static abstract class Neutral extends AbstractButtonStrategy {
        public static final Neutral NONE = (Neutral) ButtonStrategy.NONE;

        public Neutral(String str) {
            super(str, -3);
        }

        @Override // com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.AbstractButtonStrategy
        public void doOnClick(DialogInterface dialogInterface, IDMUIDialogContractor.Presenter presenter) {
            SALogging.send(presenter.getScreenId(), SAConstants.EventId.EVENT_ID_DIALOG_NEUTRAL_BUTTON, null);
        }

        @Override // com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.AbstractButtonStrategy, com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.ButtonStrategy
        public /* bridge */ /* synthetic */ void onClick(DialogInterface dialogInterface, IDMUIDialogContractor.Presenter presenter) {
            super.onClick(dialogInterface, presenter);
        }
    }

    public static abstract class Positive extends AbstractButtonStrategy {
        public static final Positive NONE = (Positive) ButtonStrategy.NONE;

        public Positive(String str) {
            super(str, -1);
        }

        @Override // com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.AbstractButtonStrategy
        public void doOnClick(DialogInterface dialogInterface, IDMUIDialogContractor.Presenter presenter) {
            SALogging.send(presenter.getScreenId(), SAConstants.EventId.EVENT_ID_DIALOG_POSITIVE_BUTTON, null);
        }

        @Override // com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.AbstractButtonStrategy, com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.ButtonStrategy
        public /* bridge */ /* synthetic */ void onClick(DialogInterface dialogInterface, IDMUIDialogContractor.Presenter presenter) {
            super.onClick(dialogInterface, presenter);
        }
    }

    public static class StubCancelNegative extends Negative {
        public StubCancelNegative() {
            super(AbstractButtonStrategy.getString(R.string.STR_BTN_CANCEL));
        }
    }

    public static class StubCancelNeutral extends Neutral {
        public StubCancelNeutral() {
            super(AbstractButtonStrategy.getString(R.string.STR_BTN_CANCEL));
        }
    }

    public static class StubOk extends Positive {
        public StubOk() {
            super(AbstractButtonStrategy.getString(R.string.STR_BTN_OK));
        }
    }

    public static class WifiSettingNegative extends Negative {
        public WifiSettingNegative() {
            super(AbstractButtonStrategy.getString(R.string.STR_BTN_WIFI_SETTING));
        }

        @Override // com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.ButtonStrategy.Negative, com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.AbstractButtonStrategy
        public void doOnClick(DialogInterface dialogInterface, IDMUIDialogContractor.Presenter presenter) {
            super.doOnClick(dialogInterface, presenter);
            ButtonStrategy.showWiFiSettings();
        }
    }

    public static class WifiSettingPositive extends Positive {
        public WifiSettingPositive() {
            super(AbstractButtonStrategy.getString(R.string.STR_BTN_WIFI_SETTING));
        }

        @Override // com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.ButtonStrategy.Positive, com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.AbstractButtonStrategy
        public void doOnClick(DialogInterface dialogInterface, IDMUIDialogContractor.Presenter presenter) {
            super.doOnClick(dialogInterface, presenter);
            ButtonStrategy.showWiFiSettings();
        }
    }

    static void showWiFiSettings() {
        Intent intent = new Intent("android.settings.WIFI_SETTINGS");
        intent.setFlags(268468224);
        IDMApplication.idmGetContext().startActivity(intent);
    }

    int getId();

    String getText();

    void onClick(DialogInterface dialogInterface, IDMUIDialogContractor.Presenter presenter);
}
