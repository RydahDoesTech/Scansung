package com.idm.fotaagent.enabler.ui.admin.setting;

import androidx.preference.Preference;

/* loaded from: classes.dex */
public interface AdminSettingContractor {

    public interface Presenter {
        Preference createProfilePreferenceUsing(Preference preference);
    }

    public interface View {
        void refresh();

        void setPresenter(Presenter presenter);
    }
}
