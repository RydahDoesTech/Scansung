package com.wssyncmldm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.g;
import androidx.databinding.v;
import com.idm.fotaagent.enabler.ui.admin.profile.AdminProfileViewModel;
import com.idm.fotaagent.enabler.ui.common.ColoredPaddingView;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public abstract class ProfileEditBinding extends v {
    public final LinearLayout ProfileLinear;
    public final Spinner clientAuth;
    public final EditText clientId;
    public final EditText clientPwd;
    public final ColoredPaddingView includedWindowInset;
    protected AdminProfileViewModel mViewModel;
    public final EditText profileName;
    public final Button saveBtn;
    public final EditText serverAddress;
    public final Spinner serverAuth;
    public final EditText serverId;
    public final EditText serverPwd;

    public ProfileEditBinding(Object obj, View view, int i5, LinearLayout linearLayout, Spinner spinner, EditText editText, EditText editText2, ColoredPaddingView coloredPaddingView, EditText editText3, Button button, EditText editText4, Spinner spinner2, EditText editText5, EditText editText6) {
        super(obj, view, i5);
        this.ProfileLinear = linearLayout;
        this.clientAuth = spinner;
        this.clientId = editText;
        this.clientPwd = editText2;
        this.includedWindowInset = coloredPaddingView;
        this.profileName = editText3;
        this.saveBtn = button;
        this.serverAddress = editText4;
        this.serverAuth = spinner2;
        this.serverId = editText5;
        this.serverPwd = editText6;
    }

    public static ProfileEditBinding bind(View view) {
        DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
        return bind(view, null);
    }

    public static ProfileEditBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
        return inflate(layoutInflater, viewGroup, z4, null);
    }

    public AdminProfileViewModel getViewModel() {
        return this.mViewModel;
    }

    public abstract void setViewModel(AdminProfileViewModel adminProfileViewModel);

    @Deprecated
    public static ProfileEditBinding bind(View view, Object obj) {
        return (ProfileEditBinding) v.bind(obj, view, R.layout.profile_edit);
    }

    @Deprecated
    public static ProfileEditBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (ProfileEditBinding) v.inflateInternal(layoutInflater, R.layout.profile_edit, viewGroup, z4, obj);
    }

    public static ProfileEditBinding inflate(LayoutInflater layoutInflater) {
        DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
        return inflate(layoutInflater, null);
    }

    @Deprecated
    public static ProfileEditBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ProfileEditBinding) v.inflateInternal(layoutInflater, R.layout.profile_edit, null, false, obj);
    }
}
