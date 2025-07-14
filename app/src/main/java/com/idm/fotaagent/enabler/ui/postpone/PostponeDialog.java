package com.idm.fotaagent.enabler.ui.postpone;

import E1.u;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s;
import androidx.fragment.app.H;
import androidx.picker.widget.SeslTimePicker;
import com.idm.adapter.filesystem.c;
import com.idm.fotaagent.database.room.data.repository.PostponeRepository;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy;
import com.idm.fotaagent.enabler.ui.postpone.PostponeContractor;
import com.idm.fotaagent.enabler.ui.postpone.PostponeDialog;
import com.idm.fotaagent.enabler.ui.reschedulepostpone.ReschedulePostponeActivity;
import com.idm.fotaagent.utils.ToastHelper;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;
import e.C0406i;
import f0.b;
import java.util.Calendar;
import java.util.Objects;
import java.util.Optional;

/* loaded from: classes.dex */
public class PostponeDialog extends DialogInterfaceOnCancelListenerC0130s implements PostponeContractor.View {
    private static final int DEFAULT_HOUR_OF_DAY = 2;
    private static final int DEFAULT_MINUTE = 0;
    private static final int NO_ANCHOR = -1;
    private static final String TASK_ID_KEY = "taskId";
    private static final String VIEW_ID_TO_ANCHOR_KEY = "viewIdToAnchor";
    private PostponeContractor.Presenter presenter;
    private RefreshListener refreshListener;

    public interface RefreshListener {
        void refresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateDialog$0(SeslTimePicker seslTimePicker, int i5, int i6) {
        Log.I("hourOfDay: " + i5 + ", minute: " + i6);
        this.presenter.postponeByTimePicker(i5, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCreateDialog$2(b bVar, DialogInterface dialogInterface) {
        bVar.d(-1).setOnClickListener(new u(6, bVar));
    }

    public static PostponeDialog newInstance(String str, int i5) {
        PostponeDialog postponeDialog = new PostponeDialog();
        Bundle bundle = new Bundle();
        bundle.putString(TASK_ID_KEY, str);
        bundle.putInt(VIEW_ID_TO_ANCHOR_KEY, i5);
        postponeDialog.setArguments(bundle);
        return postponeDialog;
    }

    private void setAnchorView(Dialog dialog) {
        try {
            Objects.requireNonNull(dialog, "getDialog() should not be null");
            dialog.setCanceledOnTouchOutside(false);
            Bundle arguments = getArguments();
            Objects.requireNonNull(arguments, "getArgument() should not be null");
            int i5 = arguments.getInt(VIEW_ID_TO_ANCHOR_KEY);
            if (i5 != -1) {
                H activity = getActivity();
                Objects.requireNonNull(activity, "getActivity() should not be null");
                View viewFindViewById = activity.findViewById(i5);
                Objects.requireNonNull(viewFindViewById, "anchorView should not be null");
                dialog.semSetAnchor(viewFindViewById);
            } else {
                Window window = dialog.getWindow();
                Objects.requireNonNull(window, "getWindows() should not be null");
                window.setGravity(17);
            }
        } catch (NoSuchMethodError e5) {
            Log.I("failed to apply semSetAnchor(): " + e5.getMessage());
            try {
                Window window2 = dialog.getWindow();
                Objects.requireNonNull(window2, "getWindows() should not be null");
                window2.setGravity(80);
            } catch (NullPointerException e6) {
                Log.E(e6.getMessage());
            }
        } catch (NullPointerException e7) {
            Log.E(e7.getMessage());
        }
    }

    @Override // com.idm.fotaagent.enabler.ui.postpone.PostponeContractor.View
    public void finish() {
        Log.I(this);
        H activity = getActivity();
        if (IDMUIManager.allowsToFinish(activity)) {
            activity.finish();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log.I(this);
        super.onAttach(context);
        try {
            this.refreshListener = (RefreshListener) getActivity();
        } catch (ClassCastException e5) {
            Log.printStackTrace(e5);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Log.I(this);
        super.onCreate(bundle);
        this.presenter = new PostponePresenter(this, requireArguments().getString(TASK_ID_KEY));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s
    public Dialog onCreateDialog(Bundle bundle) {
        Log.I(this);
        Calendar calendarBuild = new Calendar.Builder().setInstant(new PostponeRepository(getContext()).scheduledInstallTime()).build();
        int i5 = calendarBuild.get(11);
        int i6 = calendarBuild.get(12);
        boolean zIsAlreadyScheduled = InstallPolicy.get(getContext()).isAlreadyScheduled();
        H activity = getActivity();
        I0.b bVar = new I0.b(7, this);
        if (!zIsAlreadyScheduled) {
            i5 = 2;
        }
        int i7 = i5;
        if (!zIsAlreadyScheduled) {
            i6 = 0;
        }
        final b bVar2 = new b(activity, bVar, i7, i6, DateFormat.is24HourFormat(getActivity()));
        bVar2.setTitle(this.presenter.getTitle());
        String message = this.presenter.getMessage();
        C0406i c0406i = bVar2.f6605i;
        c0406i.f6581e = message;
        TextView textView = c0406i.f6596v;
        if (textView != null) {
            textView.setText(message);
        }
        c0406i.d(-1, getString(R.string.STR_BTN_DONE), bVar2);
        c0406i.d(-2, getContext().getString(R.string.STR_BTN_CANCEL), bVar2);
        bVar2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: y2.a
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                PostponeDialog.lambda$onCreateDialog$2(bVar2, dialogInterface);
            }
        });
        try {
            bVar2.getWindow().setSoftInputMode(16);
        } catch (NullPointerException e5) {
            Log.printStackTrace(e5);
        }
        setAnchorView(bVar2);
        return bVar2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Log.I(this);
        dismissAllowingStateLoss();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        Log.I(this);
        if (getParentFragmentManager().B(ReschedulePostponeActivity.TAG_RESCHEDULE_POSTPONE_DIALOG) != null) {
            finish();
        } else {
            Optional.ofNullable(this.refreshListener).ifPresent(new c(26));
            super.onDismiss(dialogInterface);
        }
    }

    @Override // com.idm.fotaagent.enabler.ui.postpone.PostponeContractor.View
    public void showToast(String str) {
        ToastHelper.showLongToast(getContext(), str);
    }

    public static PostponeDialog newInstance(String str) {
        return newInstance(str, -1);
    }
}
