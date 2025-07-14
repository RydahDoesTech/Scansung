package com.idm.fotaagent.restapi.restclient.push.campaign.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.C0113a;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import androidx.fragment.app.a0;
import com.idm.fotaagent.restapi.restclient.push.campaign.CampaignMessage;
import com.idm.fotaagent.restapi.restclient.push.campaign.button.ButtonContent;
import com.idm.fotaagent.restapi.restclient.push.campaign.ui.CampaignMessageActivity;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;
import e.C0404g;
import e.C0407j;
import java.util.Optional;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public class CampaignMessageActivity extends H {
    public static final String KEY_BUNDLE = "com.wssyncmldm:CampaignMessageBundle";
    private static final String TAG_DIALOG = "CampaignDialog";
    private CampaignDialogFragment dialogFragment;

    public static class CampaignDialogFragment extends DialogInterfaceOnCancelListenerC0130s {
        boolean allowsToFinish = true;

        private boolean allowsToFinish(Activity activity) {
            return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onCreateDialog$0(C0407j c0407j, ButtonContent buttonContent) {
            String strTitle = buttonContent.title();
            ButtonOnClickListener buttonOnClickListener = new ButtonOnClickListener(getContext(), buttonContent.action());
            C0404g c0404g = c0407j.f6601a;
            c0404g.f6554g = strTitle;
            c0404g.f6555h = buttonOnClickListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onCreateDialog$1(C0407j c0407j, ButtonContent buttonContent) {
            String strTitle = buttonContent.title();
            ButtonOnClickListener buttonOnClickListener = new ButtonOnClickListener(getContext(), buttonContent.action());
            C0404g c0404g = c0407j.f6601a;
            c0404g.f6558k = strTitle;
            c0404g.f6559l = buttonOnClickListener;
        }

        public static CampaignDialogFragment newInstance(CampaignMessage campaignMessage) {
            CampaignDialogFragment campaignDialogFragment = new CampaignDialogFragment();
            Log.I(campaignDialogFragment);
            Bundle bundle = new Bundle();
            bundle.putSerializable(CampaignMessageActivity.KEY_BUNDLE, campaignMessage);
            campaignDialogFragment.setArguments(bundle);
            return campaignDialogFragment;
        }

        @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s
        public Dialog onCreateDialog(Bundle bundle) {
            CampaignMessage campaignMessage = (CampaignMessage) getArguments().getSerializable(CampaignMessageActivity.KEY_BUNDLE);
            final C0407j c0407j = new C0407j(getActivity());
            LayoutInflater layoutInflater = getActivity().getLayoutInflater();
            View viewInflate = layoutInflater.inflate(R.layout.empty_container, (ViewGroup) null);
            if (viewInflate != null) {
                layoutInflater.inflate(R.layout.campaign_dialog, (ViewGroup) viewInflate);
                C0404g c0404g = c0407j.f6601a;
                c0404g.f6563q = viewInflate;
                c0404g.f6552d = campaignMessage.dialogTitle();
                TextView textView = (TextView) viewInflate.findViewById(R.id.campaign_msg);
                final int i5 = 0;
                textView.setText(Html.fromHtml(campaignMessage.dialogContent(), 0));
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                Optional.ofNullable(campaignMessage.positiveButton()).ifPresent(new Consumer(this) { // from class: com.idm.fotaagent.restapi.restclient.push.campaign.ui.a

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ CampaignMessageActivity.CampaignDialogFragment f6359e;

                    {
                        this.f6359e = this;
                    }

                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        switch (i5) {
                            case 0:
                                this.f6359e.lambda$onCreateDialog$0(c0407j, (ButtonContent) obj);
                                break;
                            default:
                                this.f6359e.lambda$onCreateDialog$1(c0407j, (ButtonContent) obj);
                                break;
                        }
                    }
                });
                final int i6 = 1;
                Optional.ofNullable(campaignMessage.neutralButton()).ifPresent(new Consumer(this) { // from class: com.idm.fotaagent.restapi.restclient.push.campaign.ui.a

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ CampaignMessageActivity.CampaignDialogFragment f6359e;

                    {
                        this.f6359e = this;
                    }

                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        switch (i6) {
                            case 0:
                                this.f6359e.lambda$onCreateDialog$0(c0407j, (ButtonContent) obj);
                                break;
                            default:
                                this.f6359e.lambda$onCreateDialog$1(c0407j, (ButtonContent) obj);
                                break;
                        }
                    }
                });
                String strTitle = campaignMessage.okButton().title();
                ButtonOnClickListener buttonOnClickListener = new ButtonOnClickListener(getContext(), campaignMessage.okButton().action());
                c0404g.f6556i = strTitle;
                c0404g.f6557j = buttonOnClickListener;
            }
            return c0407j.a();
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
            H activity = getActivity();
            if (this.allowsToFinish && allowsToFinish(activity)) {
                activity.finish();
            }
        }
    }

    @Override // androidx.fragment.app.H, androidx.activity.ComponentActivity, y.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        Log.I("");
        super.onCreate(bundle);
        CampaignMessage campaignMessage = (CampaignMessage) getIntent().getSerializableExtra(KEY_BUNDLE);
        if (campaignMessage == null) {
            Log.W("campaignMessage is null");
            finish();
            return;
        }
        a0 supportFragmentManager = getSupportFragmentManager();
        Fragment fragmentB = supportFragmentManager.B(TAG_DIALOG);
        if (fragmentB != null) {
            this.dialogFragment = (CampaignDialogFragment) fragmentB;
            return;
        }
        CampaignDialogFragment campaignDialogFragmentNewInstance = CampaignDialogFragment.newInstance(campaignMessage);
        this.dialogFragment = campaignDialogFragmentNewInstance;
        campaignDialogFragmentNewInstance.show(supportFragmentManager, TAG_DIALOG);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Log.I("");
        super.onNewIntent(intent);
        CampaignMessage campaignMessage = (CampaignMessage) intent.getSerializableExtra(KEY_BUNDLE);
        if (campaignMessage == null) {
            Log.W("campaignMessage is null");
            finish();
            return;
        }
        Log.I("replace dialogFragment");
        CampaignDialogFragment campaignDialogFragment = this.dialogFragment;
        this.dialogFragment = CampaignDialogFragment.newInstance(campaignMessage);
        setIntent(intent);
        a0 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C0113a c0113a = new C0113a(supportFragmentManager);
        c0113a.g(campaignDialogFragment);
        c0113a.c(0, this.dialogFragment, TAG_DIALOG, 1);
        c0113a.e(true);
        campaignDialogFragment.allowsToFinish = false;
    }
}
