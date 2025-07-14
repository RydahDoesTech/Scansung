package com.idm.fotaagent.enabler.ui.common;

import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class ButtonOnClickListener implements View.OnClickListener {
    private static final long MIN_CLICK_INTERVAL_IN_MILLIS = 150;
    private final ButtonAction buttonAction;
    private long lastClickTime = 0;

    public interface ButtonAction {
        void onClick();
    }

    public ButtonOnClickListener(ButtonAction buttonAction) {
        this.buttonAction = buttonAction;
    }

    private boolean isDuplicateClick() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = jElapsedRealtime - this.lastClickTime;
        this.lastClickTime = jElapsedRealtime;
        return j5 <= MIN_CLICK_INTERVAL_IN_MILLIS;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (isDuplicateClick()) {
            Log.I("duplicate click - ignored");
            return;
        }
        try {
            Button button = (Button) view;
            Log.I("btn id: " + button.getId() + ", btn title: " + ((Object) button.getText()));
            this.buttonAction.onClick();
        } catch (ClassCastException e5) {
            Log.printStackTrace(e5);
        }
    }
}
