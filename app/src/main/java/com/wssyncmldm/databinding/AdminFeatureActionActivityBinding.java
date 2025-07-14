package com.wssyncmldm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.g;
import androidx.databinding.v;
import com.idm.fotaagent.enabler.ui.common.ColoredPaddingView;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public abstract class AdminFeatureActionActivityBinding extends v {
    public final ColoredPaddingView includedWindowInset;
    public final ListView listActions;
    public final ListView listFeatures;

    public AdminFeatureActionActivityBinding(Object obj, View view, int i5, ColoredPaddingView coloredPaddingView, ListView listView, ListView listView2) {
        super(obj, view, i5);
        this.includedWindowInset = coloredPaddingView;
        this.listActions = listView;
        this.listFeatures = listView2;
    }

    public static AdminFeatureActionActivityBinding bind(View view) {
        DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
        return bind(view, null);
    }

    public static AdminFeatureActionActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
        return inflate(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    public static AdminFeatureActionActivityBinding bind(View view, Object obj) {
        return (AdminFeatureActionActivityBinding) v.bind(obj, view, R.layout.admin_feature_action_activity);
    }

    @Deprecated
    public static AdminFeatureActionActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AdminFeatureActionActivityBinding) v.inflateInternal(layoutInflater, R.layout.admin_feature_action_activity, viewGroup, z4, obj);
    }

    public static AdminFeatureActionActivityBinding inflate(LayoutInflater layoutInflater) {
        DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
        return inflate(layoutInflater, null);
    }

    @Deprecated
    public static AdminFeatureActionActivityBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdminFeatureActionActivityBinding) v.inflateInternal(layoutInflater, R.layout.admin_feature_action_activity, null, false, obj);
    }
}
