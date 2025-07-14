package com.idm.fotaagent.enabler.ui.admin.setting;

import android.os.Bundle;
import androidx.fragment.app.H;
import androidx.preference.F;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.z;
import com.idm.fotaagent.enabler.ui.admin.setting.AdminSettingContractor;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;
import i.e;

/* loaded from: classes.dex */
public class AdminSettingFragment extends z implements AdminSettingContractor.View {
    private AdminSettingContractor.Presenter presenter;

    @Override // androidx.preference.z, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Log.I("");
        super.onCreate(bundle);
        new AdminSettingPresenter(this, getActivity());
    }

    @Override // androidx.preference.z
    public void onCreatePreferences(Bundle bundle, String str) {
        Log.I("");
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Log.I("");
        super.onResume();
        refresh();
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.setting.AdminSettingContractor.View
    public void refresh() {
        F preferenceManager = getPreferenceManager();
        H activity = getActivity();
        preferenceManager.getClass();
        PreferenceScreen preferenceScreen = new PreferenceScreen(activity, null);
        preferenceScreen.m(preferenceManager);
        preferenceScreen.C(this.presenter.createProfilePreferenceUsing(new Preference(new e(getActivity(), R.style.PreferenceThemeOverlay))));
        setPreferenceScreen(preferenceScreen);
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.setting.AdminSettingContractor.View
    public void setPresenter(AdminSettingContractor.Presenter presenter) {
        this.presenter = presenter;
    }
}
