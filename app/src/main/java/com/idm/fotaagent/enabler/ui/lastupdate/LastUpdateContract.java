package com.idm.fotaagent.enabler.ui.lastupdate;

/* loaded from: classes.dex */
public interface LastUpdateContract {

    public interface Presenter {
        void onCreate();
    }

    public interface View {
        void setMainBody(CharSequence charSequence);

        void setMainTitle(CharSequence charSequence);
    }
}
