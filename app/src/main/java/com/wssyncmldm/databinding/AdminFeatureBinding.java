package com.wssyncmldm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.g;
import androidx.databinding.v;
import com.idm.fotaagent.database.sqlite.database.mo.Feature;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public abstract class AdminFeatureBinding extends v {
    protected Feature mFeature;

    public AdminFeatureBinding(Object obj, View view, int i5) {
        super(obj, view, i5);
    }

    public static AdminFeatureBinding bind(View view) {
        DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
        return bind(view, null);
    }

    public static AdminFeatureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
        return inflate(layoutInflater, viewGroup, z4, null);
    }

    public Feature getFeature() {
        return this.mFeature;
    }

    public abstract void setFeature(Feature feature);

    @Deprecated
    public static AdminFeatureBinding bind(View view, Object obj) {
        return (AdminFeatureBinding) v.bind(obj, view, R.layout.admin_feature);
    }

    @Deprecated
    public static AdminFeatureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AdminFeatureBinding) v.inflateInternal(layoutInflater, R.layout.admin_feature, viewGroup, z4, obj);
    }

    public static AdminFeatureBinding inflate(LayoutInflater layoutInflater) {
        DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
        return inflate(layoutInflater, null);
    }

    @Deprecated
    public static AdminFeatureBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdminFeatureBinding) v.inflateInternal(layoutInflater, R.layout.admin_feature, null, false, obj);
    }
}
