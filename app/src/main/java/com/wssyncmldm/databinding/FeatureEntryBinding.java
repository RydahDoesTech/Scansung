package com.wssyncmldm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.g;
import androidx.databinding.v;
import com.idm.fotaagent.enabler.ui.admin.fmsfeature.FeatureInjectionViewModel;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public abstract class FeatureEntryBinding extends v {
    public final AppCompatTextView description;
    public final SwitchCompat injectionToggle;
    protected FeatureInjectionViewModel.FeatureEntry mFeatureEntry;
    public final AppCompatTextView name;

    public FeatureEntryBinding(Object obj, View view, int i5, AppCompatTextView appCompatTextView, SwitchCompat switchCompat, AppCompatTextView appCompatTextView2) {
        super(obj, view, i5);
        this.description = appCompatTextView;
        this.injectionToggle = switchCompat;
        this.name = appCompatTextView2;
    }

    public static FeatureEntryBinding bind(View view) {
        DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
        return bind(view, null);
    }

    public static FeatureEntryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
        return inflate(layoutInflater, viewGroup, z4, null);
    }

    public FeatureInjectionViewModel.FeatureEntry getFeatureEntry() {
        return this.mFeatureEntry;
    }

    public abstract void setFeatureEntry(FeatureInjectionViewModel.FeatureEntry featureEntry);

    @Deprecated
    public static FeatureEntryBinding bind(View view, Object obj) {
        return (FeatureEntryBinding) v.bind(obj, view, R.layout.feature_entry);
    }

    @Deprecated
    public static FeatureEntryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (FeatureEntryBinding) v.inflateInternal(layoutInflater, R.layout.feature_entry, viewGroup, z4, obj);
    }

    public static FeatureEntryBinding inflate(LayoutInflater layoutInflater) {
        DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
        return inflate(layoutInflater, null);
    }

    @Deprecated
    public static FeatureEntryBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FeatureEntryBinding) v.inflateInternal(layoutInflater, R.layout.feature_entry, null, false, obj);
    }
}
