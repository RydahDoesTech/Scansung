package com.idm.fotaagent.enabler.ui.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SeslProgressBar;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s;
import androidx.fragment.app.H;
import androidx.lifecycle.G;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.abupdate.manager.UpdateInfo;
import com.idm.fotaagent.abupdate.updateengine.UpdateStatus;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.command.b;
import com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor;
import com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.ButtonStrategy;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public abstract class IDMUIDialogFragmentForDialog extends DialogInterfaceOnCancelListenerC0130s implements IDMUIDialogContractor.View {
    public static final String TAG = "FRAGMENT_FOR_DIALOG";
    boolean allowsToFinish = true;
    private IDMUIDialogContractor.Presenter presenter;
    View rootView;

    /* renamed from: com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogFragmentForDialog$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$idm$fotaagent$abupdate$updateengine$UpdateStatus$InstallationStep;

        static {
            int[] iArr = new int[UpdateStatus.InstallationStep.values().length];
            $SwitchMap$com$idm$fotaagent$abupdate$updateengine$UpdateStatus$InstallationStep = iArr;
            try {
                iArr[UpdateStatus.InstallationStep.VERIFYING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$abupdate$updateengine$UpdateStatus$InstallationStep[UpdateStatus.InstallationStep.OPTIMIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$abupdate$updateengine$UpdateStatus$InstallationStep[UpdateStatus.InstallationStep.IDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$abupdate$updateengine$UpdateStatus$InstallationStep[UpdateStatus.InstallationStep.DOWNLOADING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class ABPleaseWaitDialog extends ViewDialog {
        public ABPleaseWaitDialog() {
            super(R.layout.ab_please_wait_layout);
        }

        private int convertPercent(UpdateInfo updateInfo) {
            UpdateStatus.InstallationStep installationStepOf = UpdateStatus.InstallationStep.of(updateInfo.installationStep());
            int i5 = AnonymousClass1.$SwitchMap$com$idm$fotaagent$abupdate$updateengine$UpdateStatus$InstallationStep[installationStepOf.ordinal()];
            if (i5 == 1) {
                return (int) (updateInfo.percent() * 0.9d);
            }
            if (i5 == 2) {
                return (int) ((updateInfo.percent() * 0.09999999999999998d) + 90.0d);
            }
            Log.W("unexpected installationStep : " + installationStepOf);
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$doInflateViews$0(SeslProgressBar seslProgressBar, TextView textView, Context context, UpdateInfo updateInfo) {
            int iConvertPercent = convertPercent(updateInfo);
            seslProgressBar.setProgress(iConvertPercent);
            textView.setText(String.format(context.getString(R.string.STR_COMMON_PERCENT), Integer.valueOf(iConvertPercent)));
        }

        @Override // com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogFragmentForDialog.ViewDialog
        public void doInflateViews() {
            this.tvMainDescription = (TextView) this.rootView.findViewById(R.id.progress_content);
            if (getDialog().getWindow() != null) {
                getDialog().getWindow().setGravity(80);
            }
            final Context contextIdmGetContext = IDMApplication.idmGetContext();
            final TextView textView = (TextView) this.rootView.findViewById(R.id.percent);
            final SeslProgressBar seslProgressBar = (SeslProgressBar) this.rootView.findViewById(R.id.progress_bar);
            new FotaJobRepository(contextIdmGetContext).getReverifyInfoLiveData().e(getActivity(), new G() { // from class: com.idm.fotaagent.enabler.ui.dialog.a
                @Override // androidx.lifecycle.G
                public final void c(Object obj) {
                    SeslProgressBar seslProgressBar2 = seslProgressBar;
                    TextView textView2 = textView;
                    this.f6322a.lambda$doInflateViews$0(seslProgressBar2, textView2, contextIdmGetContext, (UpdateInfo) obj);
                }
            });
        }
    }

    public static class MessageDialog extends IDMUIDialogFragmentForDialog {
        private CharSequence message;

        @Override // com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogFragmentForDialog, com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor.View
        public CharSequence getMessage() {
            return this.message;
        }

        @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s, androidx.fragment.app.Fragment
        public void onStart() {
            super.onStart();
            ((TextView) getDialog().findViewById(android.R.id.message)).setMovementMethod(LinkMovementMethod.getInstance());
        }

        @Override // com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogFragmentForDialog, com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor.View
        public void setMessage(CharSequence charSequence) {
            this.message = charSequence;
            ((AlertDialog) getDialog()).setMessage(charSequence);
        }
    }

    public static class NonABPleaseWaitDialog extends ViewDialog {
        public NonABPleaseWaitDialog() {
            super(R.layout.nonab_please_wait_layout);
        }

        @Override // com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogFragmentForDialog.ViewDialog
        public void doInflateViews() {
            this.tvMainDescription = (TextView) this.rootView.findViewById(R.id.progress_content);
            if (getDialog().getWindow() != null) {
                getDialog().getWindow().setGravity(80);
            }
        }
    }

    public static abstract class ViewDialog extends IDMUIDialogFragmentForDialog {
        private final int layoutId;
        TextView tvMainDescription;

        public ViewDialog(int i5) {
            this.layoutId = i5;
        }

        public abstract void doInflateViews();

        @Override // com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogFragmentForDialog, com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor.View
        public CharSequence getMessage() {
            return this.tvMainDescription.getText().toString();
        }

        public void inflateViews() {
            LayoutInflater layoutInflater = getActivity().getLayoutInflater();
            View viewInflate = layoutInflater.inflate(R.layout.empty_container, (ViewGroup) null);
            this.rootView = viewInflate;
            layoutInflater.inflate(this.layoutId, (ViewGroup) viewInflate);
            doInflateViews();
        }

        @Override // com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogFragmentForDialog, com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor.View
        public void setMessage(CharSequence charSequence) {
            inflateViews();
            ((AlertDialog) getDialog()).setView(this.rootView);
            this.tvMainDescription.setText(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setButtonOf$0(ButtonStrategy buttonStrategy, DialogInterface dialogInterface, int i5) {
        buttonStrategy.onClick(dialogInterface, this.presenter);
    }

    @Override // com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor.View
    public void finish() {
        Log.I(this);
        H activity = getActivity();
        if (this.allowsToFinish && IDMUIManager.allowsToFinish(activity)) {
            activity.finish();
        }
    }

    @Override // com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor.View
    public abstract CharSequence getMessage();

    @Override // com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor.View
    public View getRootView() {
        return this.rootView;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        Log.I(this);
        this.presenter.onCancel();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        Log.I(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s
    public Dialog onCreateDialog(Bundle bundle) {
        Log.I(this);
        return new AlertDialog.Builder(getActivity()).create();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.presenter.postInit();
        this.presenter.setCancelable();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Log.I(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        Log.I(this);
        this.presenter.onDismiss();
        finish();
    }

    @Override // com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor.View
    public void setButtonOf(ButtonStrategy buttonStrategy) {
        if (buttonStrategy != ButtonStrategy.NONE) {
            ((AlertDialog) getDialog()).setButton(buttonStrategy.getId(), buttonStrategy.getText(), new b(this, 4, buttonStrategy));
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s, com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor.View
    public void setCancelable(boolean z4) {
        getDialog().setCancelable(z4);
        getDialog().setCanceledOnTouchOutside(z4);
    }

    @Override // com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor.View
    public abstract void setMessage(CharSequence charSequence);

    @Override // com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor.View
    public void setPresenter(IDMUIDialogContractor.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override // com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor.View
    public void setTitle(String str) {
        getDialog().setTitle(str);
    }
}
