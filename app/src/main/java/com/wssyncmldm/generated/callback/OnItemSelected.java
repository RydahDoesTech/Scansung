package com.wssyncmldm.generated.callback;

import T.a;
import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class OnItemSelected implements a {
    final Listener mListener;
    final int mSourceId;

    public interface Listener {
        void _internalCallbackOnItemSelected(int i5, AdapterView adapterView, View view, int i6, long j5);
    }

    public OnItemSelected(Listener listener, int i5) {
        this.mListener = listener;
        this.mSourceId = i5;
    }

    @Override // T.a
    public void onItemSelected(AdapterView adapterView, View view, int i5, long j5) {
        this.mListener._internalCallbackOnItemSelected(this.mSourceId, adapterView, view, i5, j5);
    }
}
