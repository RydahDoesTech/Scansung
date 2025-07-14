package com.idm.fotaagent.enabler.ui.admin.profile;

import android.content.DialogInterface;
import android.text.InputFilter;
import android.text.Spanned;
import androidx.databinding.g;
import androidx.lifecycle.G;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseProfile;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.command.d;
import com.idm.fotaagent.enabler.ui.common.WindowInsetsBaseActivity;
import com.idm.fotaagent.utils.ToastHelper;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;
import com.wssyncmldm.databinding.ProfileEditBinding;
import e.C0404g;
import e.C0407j;
import e.DialogInterfaceC0408k;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class AdminProfileActivity extends WindowInsetsBaseActivity {
    ProfileEditBinding profileEditBinding;
    AdminProfileViewModel viewModel;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CharSequence lambda$doOnCreate$0(CharSequence charSequence, int i5, int i6, Spanned spanned, int i7, int i8) {
        if (Pattern.compile("^[a-zA-Z0-9]*$").matcher(charSequence).matches()) {
            return null;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doOnCreate$1(Integer num) {
        if (num.intValue() <= 0) {
            return;
        }
        ToastHelper.showLongToast(this, getText(num.intValue()).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBackPressed$2(DialogInterface dialogInterface, int i5) {
        finish();
    }

    @Override // com.idm.fotaagent.enabler.ui.common.WindowInsetsBaseActivity
    public void doOnCreate() {
        this.profileEditBinding.serverId.setFilters(new InputFilter[]{new a()});
        this.viewModel.getToastMessageId().e(this, new G() { // from class: com.idm.fotaagent.enabler.ui.admin.profile.b
            @Override // androidx.lifecycle.G
            public final void c(Object obj) {
                this.f6316a.lambda$doOnCreate$1((Integer) obj);
            }
        });
    }

    @Override // androidx.fragment.app.H, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C0407j c0407j = new C0407j(this);
        C0404g c0404g = c0407j.f6601a;
        c0404g.f6552d = "Profile Save";
        c0404g.f = "Do you want to exit screen?";
        d dVar = new d(2, this);
        c0404g.f6554g = "OK";
        c0404g.f6555h = dVar;
        c0404g.f6556i = "CANCEL";
        c0404g.f6557j = null;
        DialogInterfaceC0408k dialogInterfaceC0408kA = c0407j.a();
        dialogInterfaceC0408kA.setCanceledOnTouchOutside(false);
        dialogInterfaceC0408kA.show();
    }

    @Override // androidx.fragment.app.H, android.app.Activity
    public void onResume() {
        super.onResume();
        Log.I("");
    }

    @Override // com.idm.fotaagent.enabler.ui.common.WindowInsetsBaseActivity
    public void setContentView() {
        IDMDatabaseProfile iDMDatabaseProfile = (IDMDatabaseProfile) getIntent().getBundleExtra("serverId").getParcelable("profile");
        if (iDMDatabaseProfile == null) {
            Log.W("profile is null");
            return;
        }
        this.viewModel = new AdminProfileViewModel(iDMDatabaseProfile);
        ProfileEditBinding profileEditBinding = (ProfileEditBinding) g.d(this, R.layout.profile_edit);
        this.profileEditBinding = profileEditBinding;
        profileEditBinding.setViewModel(this.viewModel);
        this.profileEditBinding.setLifecycleOwner(this);
    }
}
