package com.idm.fotaagent.enabler.ui.utagent;

import androidx.preference.Preference;
import androidx.preference.o;
import com.idm.fotaagent.enabler.ui.utagent.IDMUTAgentContract;
import com.idm.fotaagent.enabler.ui.utagent.data.IDMUTAgentSource;
import com.idm.fotaagent.scheduler.SchedulerInitiator;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMUTAgentPresenter implements IDMUTAgentContract.Presenter {
    private IDMUTAgentSource repository;
    private IDMUTAgentContract.View view;

    public IDMUTAgentPresenter(IDMUTAgentContract.View view, IDMUTAgentSource iDMUTAgentSource) {
        this.view = view;
        this.repository = iDMUTAgentSource;
        view.idmSetPresenter(this);
    }

    private String idmCreateDevicePreferenceSummary() {
        return this.repository.idmGetDeviceId() + "\n" + this.repository.idmGetVersionInfo() + "\n" + this.repository.idmGetPollingTime();
    }

    private o idmCreatePreferenceClickListener() {
        return new o() { // from class: z2.a
            @Override // androidx.preference.o
            public final boolean a(Preference preference) {
                return this.f9478a.lambda$idmCreatePreferenceClickListener$0(preference);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean lambda$idmCreatePreferenceClickListener$0(Preference preference) {
        String str = preference.f4610o;
        str.getClass();
        if (str.equals(IDMUTAgentContract.LOCALTEST)) {
            startLocalTest();
            return true;
        }
        if (str.equals(IDMUTAgentContract.UPDATE)) {
            updateSoftware();
            return true;
        }
        Log.W("Unexpected preference : ".concat(str));
        return true;
    }

    private void startLocalTest() {
        this.repository.startLocalTest();
    }

    private void updateSoftware() {
        Log.I("");
        SchedulerInitiator.getInstance().initiateByUser();
    }

    @Override // com.idm.fotaagent.enabler.ui.utagent.IDMUTAgentContract.Presenter
    public void idmStart() {
        this.view.idmSetUpdatePreferenceClickListener(idmCreatePreferenceClickListener());
        this.view.idmSetDevicePreferenceSummary(idmCreateDevicePreferenceSummary());
        this.view.setLocaltestPreferenceClickListener(idmCreatePreferenceClickListener());
    }
}
