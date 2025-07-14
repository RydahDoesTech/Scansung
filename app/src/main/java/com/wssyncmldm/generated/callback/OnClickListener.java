package com.wssyncmldm.generated.callback;

import android.view.View;

/* loaded from: classes.dex */
public final class OnClickListener implements View.OnClickListener {
    final Listener mListener;
    final int mSourceId;

    public interface Listener {
        void _internalCallbackOnClick(int i5, View view);
    }

    public OnClickListener(Listener listener, int i5) {
        this.mListener = listener;
        this.mSourceId = i5;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.mListener._internalCallbackOnClick(this.mSourceId, view);
    }
}
