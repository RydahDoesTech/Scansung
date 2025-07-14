package com.idm.fotaagent.enabler.ui.dialog.model;

import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.ButtonStrategy;

/* loaded from: classes.dex */
public interface IDMUIDialogModel {

    public static class Base implements IDMUIDialogModel {
        private final CharSequence message;
        private final ButtonStrategy.Negative negativeButtonStrategy;
        private final ButtonStrategy.Neutral neutralButtonStrategy;
        private final ButtonStrategy.Positive positiveButtonStrategy;
        private final String title;

        public Base(String str, CharSequence charSequence, ButtonStrategy.Neutral neutral, ButtonStrategy.Negative negative, ButtonStrategy.Positive positive) {
            this.title = str;
            this.message = charSequence;
            this.neutralButtonStrategy = neutral;
            this.negativeButtonStrategy = negative;
            this.positiveButtonStrategy = positive;
        }

        public static Context getContext() {
            return IDMApplication.idmGetContext();
        }

        public static String getString(int i5) {
            return getContext().getString(i5);
        }

        @Override // com.idm.fotaagent.enabler.ui.dialog.model.IDMUIDialogModel
        public CharSequence getMessage() {
            return this.message;
        }

        @Override // com.idm.fotaagent.enabler.ui.dialog.model.IDMUIDialogModel
        public ButtonStrategy.Negative getNegativeButtonStrategy() {
            return this.negativeButtonStrategy;
        }

        @Override // com.idm.fotaagent.enabler.ui.dialog.model.IDMUIDialogModel
        public ButtonStrategy.Neutral getNeutralButtonStrategy() {
            return this.neutralButtonStrategy;
        }

        @Override // com.idm.fotaagent.enabler.ui.dialog.model.IDMUIDialogModel
        public ButtonStrategy.Positive getPositiveButtonStrategy() {
            return this.positiveButtonStrategy;
        }

        @Override // com.idm.fotaagent.enabler.ui.dialog.model.IDMUIDialogModel
        public String getTitle() {
            return this.title;
        }

        @Override // com.idm.fotaagent.enabler.ui.dialog.model.IDMUIDialogModel
        public boolean isCancelable() {
            return true;
        }

        @Override // com.idm.fotaagent.enabler.ui.dialog.model.IDMUIDialogModel
        public void onCancel() {
        }

        @Override // com.idm.fotaagent.enabler.ui.dialog.model.IDMUIDialogModel
        public void onDismiss() {
        }

        @Override // com.idm.fotaagent.enabler.ui.dialog.model.IDMUIDialogModel
        public void preExecute() {
        }
    }

    public static class NoButtons extends Base {
        public NoButtons(String str, CharSequence charSequence) {
            super(str, charSequence, ButtonStrategy.Neutral.NONE, ButtonStrategy.Negative.NONE, ButtonStrategy.Positive.NONE);
        }

        @Override // com.idm.fotaagent.enabler.ui.dialog.model.IDMUIDialogModel.Base, com.idm.fotaagent.enabler.ui.dialog.model.IDMUIDialogModel
        public boolean isCancelable() {
            return false;
        }
    }

    public static class StubOk extends Base {
        public StubOk(String str, CharSequence charSequence) {
            super(str, charSequence, ButtonStrategy.Neutral.NONE, ButtonStrategy.Negative.NONE, new ButtonStrategy.StubOk());
        }
    }

    CharSequence getMessage();

    ButtonStrategy.Negative getNegativeButtonStrategy();

    ButtonStrategy.Neutral getNeutralButtonStrategy();

    ButtonStrategy.Positive getPositiveButtonStrategy();

    String getTitle();

    boolean isCancelable();

    void onCancel();

    void onDismiss();

    void preExecute();
}
