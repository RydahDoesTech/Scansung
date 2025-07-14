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
public abstract class FeatureListBinding extends v {
    public final ColoredPaddingView includedWindowInset;
    public final ListView listView;

    public FeatureListBinding(Object obj, View view, int i5, ColoredPaddingView coloredPaddingView, ListView listView) {
        super(obj, view, i5);
        this.includedWindowInset = coloredPaddingView;
        this.listView = listView;
    }

    public static FeatureListBinding bind(View view) {
        DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
        return bind(view, null);
    }

    public static FeatureListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
        return inflate(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    public static FeatureListBinding bind(View view, Object obj) {
        return (FeatureListBinding) v.bind(obj, view, R.layout.feature_list);
    }

    @Deprecated
    public static FeatureListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (FeatureListBinding) v.inflateInternal(layoutInflater, R.layout.feature_list, viewGroup, z4, obj);
    }

    public static FeatureListBinding inflate(LayoutInflater layoutInflater) {
        DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
        return inflate(layoutInflater, null);
    }

    @Deprecated
    public static FeatureListBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FeatureListBinding) v.inflateInternal(layoutInflater, R.layout.feature_list, null, false, obj);
    }
}
