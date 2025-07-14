package com.wssyncmldm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SeslProgressBar;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.g;
import androidx.databinding.v;
import com.idm.fotaagent.enabler.ui.downloadprogress.ProgressBarContentViewModel;
import com.samsung.android.fotaagent.common.view.TextViewWithLimitedFontSize;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public abstract class ProgressBarContentBinding extends v {
    protected ProgressBarContentViewModel mProgressBarContentViewModel;
    public final SeslProgressBar progressBar;
    public final TextViewWithLimitedFontSize tvPercent;
    public final TextViewWithLimitedFontSize tvRemainTime;

    public ProgressBarContentBinding(Object obj, View view, int i5, SeslProgressBar seslProgressBar, TextViewWithLimitedFontSize textViewWithLimitedFontSize, TextViewWithLimitedFontSize textViewWithLimitedFontSize2) {
        super(obj, view, i5);
        this.progressBar = seslProgressBar;
        this.tvPercent = textViewWithLimitedFontSize;
        this.tvRemainTime = textViewWithLimitedFontSize2;
    }

    public static ProgressBarContentBinding bind(View view) {
        DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
        return bind(view, null);
    }

    public static ProgressBarContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
        return inflate(layoutInflater, viewGroup, z4, null);
    }

    public ProgressBarContentViewModel getProgressBarContentViewModel() {
        return this.mProgressBarContentViewModel;
    }

    public abstract void setProgressBarContentViewModel(ProgressBarContentViewModel progressBarContentViewModel);

    @Deprecated
    public static ProgressBarContentBinding bind(View view, Object obj) {
        return (ProgressBarContentBinding) v.bind(obj, view, R.layout.progress_bar_content);
    }

    @Deprecated
    public static ProgressBarContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (ProgressBarContentBinding) v.inflateInternal(layoutInflater, R.layout.progress_bar_content, viewGroup, z4, obj);
    }

    public static ProgressBarContentBinding inflate(LayoutInflater layoutInflater) {
        DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
        return inflate(layoutInflater, null);
    }

    @Deprecated
    public static ProgressBarContentBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ProgressBarContentBinding) v.inflateInternal(layoutInflater, R.layout.progress_bar_content, null, false, obj);
    }
}
