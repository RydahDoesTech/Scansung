package com.idm.fotaagent.enabler.ui.utagent;

import androidx.preference.o;

/* loaded from: classes.dex */
public interface IDMUTAgentContract {
    public static final String DEVICE = "showDeviceId";
    public static final String LOCALTEST = "localtest";
    public static final String UPDATE = "UpdateUTSoftware";

    public interface Presenter {
        void idmStart();
    }

    public interface View {
        void idmSetDevicePreferenceSummary(String str);

        void idmSetPresenter(Presenter presenter);

        void idmSetUpdatePreferenceClickListener(o oVar);

        void setLocaltestPreferenceClickListener(o oVar);
    }
}
