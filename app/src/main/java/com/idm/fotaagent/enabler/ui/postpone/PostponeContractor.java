package com.idm.fotaagent.enabler.ui.postpone;

/* loaded from: classes.dex */
public interface PostponeContractor {

    public interface Presenter {
        String getMessage();

        String getTitle();

        void postponeByTimePicker(int i5, int i6);
    }

    public interface View {
        void finish();

        void showToast(String str);
    }
}
