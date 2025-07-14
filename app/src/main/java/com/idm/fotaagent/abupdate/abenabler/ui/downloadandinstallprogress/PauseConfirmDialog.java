package com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;
import java.util.Optional;

/* loaded from: classes.dex */
public class PauseConfirmDialog extends DialogInterfaceOnCancelListenerC0130s {
    private PauseListener pauseListener;

    public interface PauseListener {
        void pauseIfPossible();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateDialog$0(DialogInterface dialogInterface, int i5) {
        Optional.ofNullable(this.pauseListener).ifPresent(new h());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.pauseListener = (PauseListener) getActivity();
        } catch (ClassCastException e5) {
            Log.printStackTrace(e5);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Log.I(this);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s
    public Dialog onCreateDialog(Bundle bundle) {
        Log.I(this);
        return new AlertDialog.Builder(getActivity()).setTitle(getActivity().getString(R.string.STR_PAUSE_UPDATE_AB)).setMessage(getString(R.string.STR_PAUSE_UPDATE_DETAIL_VERIFICATION_AB)).setPositiveButton(getActivity().getString(R.string.STR_BTN_PAUSE), new DialogInterface.OnClickListener() { // from class: com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                this.f6239d.lambda$onCreateDialog$0(dialogInterface, i5);
            }
        }).setNegativeButton(getActivity().getString(R.string.STR_BTN_CANCEL), (DialogInterface.OnClickListener) null).create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Log.I(this);
        dismissAllowingStateLoss();
        super.onDestroy();
    }
}
