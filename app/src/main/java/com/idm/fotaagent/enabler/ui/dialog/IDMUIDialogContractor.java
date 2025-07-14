package com.idm.fotaagent.enabler.ui.dialog;

import com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.ButtonStrategy;

/* loaded from: classes.dex */
public interface IDMUIDialogContractor {

    public interface Presenter {
        CharSequence getMessage();

        android.view.View getRootView();

        String getScreenId();

        void onCancel();

        void onDismiss();

        void postInit();

        void setCancelable();
    }

    public interface View {
        void finish();

        CharSequence getMessage();

        android.view.View getRootView();

        void setButtonOf(ButtonStrategy buttonStrategy);

        void setCancelable(boolean z4);

        void setMessage(CharSequence charSequence);

        void setPresenter(Presenter presenter);

        void setTitle(String str);
    }
}
