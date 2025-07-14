package com.wssyncmldm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.g;
import androidx.databinding.v;
import com.idm.fotaagent.enabler.ui.common.viewmodel.ButtonsContentViewModel;
import com.samsung.android.fotaagent.common.view.ButtonWithLimitedFontSizeAndWidth;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public abstract class ButtonsContentBinding extends v {
    public final ButtonWithLimitedFontSizeAndWidth btHighEmphasis;
    public final ButtonWithLimitedFontSizeAndWidth btMediumEmphasis;
    public final LinearLayout buttonsContent;
    public final LinearLayout layoutMediumEmphasis;
    protected ButtonsContentViewModel mButtonContentViewModel;

    public ButtonsContentBinding(Object obj, View view, int i5, ButtonWithLimitedFontSizeAndWidth buttonWithLimitedFontSizeAndWidth, ButtonWithLimitedFontSizeAndWidth buttonWithLimitedFontSizeAndWidth2, LinearLayout linearLayout, LinearLayout linearLayout2) {
        super(obj, view, i5);
        this.btHighEmphasis = buttonWithLimitedFontSizeAndWidth;
        this.btMediumEmphasis = buttonWithLimitedFontSizeAndWidth2;
        this.buttonsContent = linearLayout;
        this.layoutMediumEmphasis = linearLayout2;
    }

    public static ButtonsContentBinding bind(View view) {
        DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
        return bind(view, null);
    }

    public static ButtonsContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
        return inflate(layoutInflater, viewGroup, z4, null);
    }

    public ButtonsContentViewModel getButtonContentViewModel() {
        return this.mButtonContentViewModel;
    }

    public abstract void setButtonContentViewModel(ButtonsContentViewModel buttonsContentViewModel);

    @Deprecated
    public static ButtonsContentBinding bind(View view, Object obj) {
        return (ButtonsContentBinding) v.bind(obj, view, R.layout.buttons_content);
    }

    @Deprecated
    public static ButtonsContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (ButtonsContentBinding) v.inflateInternal(layoutInflater, R.layout.buttons_content, viewGroup, z4, obj);
    }

    public static ButtonsContentBinding inflate(LayoutInflater layoutInflater) {
        DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
        return inflate(layoutInflater, null);
    }

    @Deprecated
    public static ButtonsContentBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ButtonsContentBinding) v.inflateInternal(layoutInflater, R.layout.buttons_content, null, false, obj);
    }
}
