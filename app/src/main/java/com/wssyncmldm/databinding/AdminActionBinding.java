package com.wssyncmldm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.g;
import androidx.databinding.v;
import com.idm.fotaagent.enabler.ui.admin.feature.AdminActionViewModel;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public abstract class AdminActionBinding extends v {
    protected AdminActionViewModel.Actions mActions;

    public AdminActionBinding(Object obj, View view, int i5) {
        super(obj, view, i5);
    }

    public static AdminActionBinding bind(View view) {
        DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
        return bind(view, null);
    }

    public static AdminActionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
        return inflate(layoutInflater, viewGroup, z4, null);
    }

    public AdminActionViewModel.Actions getActions() {
        return this.mActions;
    }

    public abstract void setActions(AdminActionViewModel.Actions actions);

    @Deprecated
    public static AdminActionBinding bind(View view, Object obj) {
        return (AdminActionBinding) v.bind(obj, view, R.layout.admin_action);
    }

    @Deprecated
    public static AdminActionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AdminActionBinding) v.inflateInternal(layoutInflater, R.layout.admin_action, viewGroup, z4, obj);
    }

    public static AdminActionBinding inflate(LayoutInflater layoutInflater) {
        DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
        return inflate(layoutInflater, null);
    }

    @Deprecated
    public static AdminActionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdminActionBinding) v.inflateInternal(layoutInflater, R.layout.admin_action, null, false, obj);
    }
}
