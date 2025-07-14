package com.idm.fotaagent.enabler.ui.utagent;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.o;
import androidx.preference.z;
import com.idm.fotaagent.enabler.ui.utagent.IDMUTAgentContract;
import com.idm.fotaagent.enabler.ui.utagent.data.IDMUTAgentRepository;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class IDMUTAgentFragment extends z implements IDMUTAgentContract.View {
    private Preference devicePref;
    private Preference localtestPref;
    private IDMUTAgentContract.Presenter presenter;
    private Preference updatePref;

    @Override // com.idm.fotaagent.enabler.ui.utagent.IDMUTAgentContract.View
    public void idmSetDevicePreferenceSummary(String str) {
        this.devicePref.z(str);
    }

    @Override // com.idm.fotaagent.enabler.ui.utagent.IDMUTAgentContract.View
    public void idmSetPresenter(IDMUTAgentContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override // com.idm.fotaagent.enabler.ui.utagent.IDMUTAgentContract.View
    public void idmSetUpdatePreferenceClickListener(o oVar) {
        this.updatePref.f4605i = oVar;
    }

    @Override // androidx.preference.z
    public void onCreatePreferences(Bundle bundle, String str) throws Resources.NotFoundException {
        Log.I("");
        setPreferencesFromResource(R.xml.ut_mainpref, str);
        this.updatePref = findPreference(IDMUTAgentContract.UPDATE);
        this.devicePref = findPreference(IDMUTAgentContract.DEVICE);
        this.localtestPref = findPreference(IDMUTAgentContract.LOCALTEST);
        new IDMUTAgentPresenter(this, new IDMUTAgentRepository(getContext()));
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Log.I("");
        super.onResume();
        this.presenter.idmStart();
    }

    @Override // com.idm.fotaagent.enabler.ui.utagent.IDMUTAgentContract.View
    public void setLocaltestPreferenceClickListener(o oVar) {
        this.localtestPref.f4605i = oVar;
    }
}
