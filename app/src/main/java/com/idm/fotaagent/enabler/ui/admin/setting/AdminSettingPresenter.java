package com.idm.fotaagent.enabler.ui.admin.setting;

import C1.b;
import android.content.Context;
import androidx.preference.Preference;
import com.idm.fotaagent.enabler.ui.admin.setting.AdminSettingContractor;
import java.util.Objects;

/* loaded from: classes.dex */
public class AdminSettingPresenter implements AdminSettingContractor.Presenter {
    private final AdminSettingModel model;
    private final AdminSettingContractor.View view;

    public AdminSettingPresenter(AdminSettingContractor.View view, Context context) {
        this.view = view;
        view.setPresenter(this);
        this.model = new AdminSettingModel(context);
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.setting.AdminSettingContractor.Presenter
    public Preference createProfilePreferenceUsing(Preference preference) {
        AdminSettingModel adminSettingModel = this.model;
        AdminSettingContractor.View view = this.view;
        Objects.requireNonNull(view);
        return adminSettingModel.createProfilePreferenceUsing(preference, new b(27, view));
    }
}
