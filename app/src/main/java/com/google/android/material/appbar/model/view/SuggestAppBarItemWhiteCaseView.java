package com.google.android.material.appbar.model.view;

import J2.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import b3.AbstractC0219i;
import com.wssyncmldm.R;
import kotlin.Metadata;
import z.AbstractC0938a;
import z.AbstractC0939b;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/google/android/material/appbar/model/view/SuggestAppBarItemWhiteCaseView;", "Lcom/google/android/material/appbar/model/view/SuggestAppBarItemView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/drawable/Drawable;", "getCloseDrawable", "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "", "getViewPagerItemBackgroundWhiteWhiteCaseColor", "(Landroid/content/Context;)I", "getSuggestTitleWithWhiteCaseColor", "getSuggestButtonTextColorWithWhiteCase", "()I", "LO2/l;", "updateResource", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class SuggestAppBarItemWhiteCaseView extends SuggestAppBarItemView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestAppBarItemWhiteCaseView(Context context) {
        super(context, null, 2, null);
        AbstractC0219i.e("context", context);
    }

    private final Drawable getCloseDrawable(Context context) {
        AbstractC0219i.e("context", context);
        return AbstractC0938a.b(context, TextUtils.isEmpty(Settings.System.getString(context.getContentResolver(), "current_sec_active_themepackage")) ? b.I(context) ? R.drawable.sesl_close_button_recoil_background_with_white_case : R.drawable.sesl_close_button_recoil_background_dark : b.I(context) ? R.drawable.sesl_close_button_recoil_background_with_white_case_for_theme : R.drawable.sesl_close_button_recoil_background_dark_for_theme);
    }

    private final int getSuggestButtonTextColorWithWhiteCase() {
        Context context = getContext();
        AbstractC0219i.d("context", context);
        boolean zIsEmpty = TextUtils.isEmpty(Settings.System.getString(context.getContentResolver(), "current_sec_active_themepackage"));
        int i5 = R.color.sesl_suggest_button_text_color_with_white_case;
        if (zIsEmpty) {
            if (!b.I(context)) {
                i5 = R.color.sesl_suggest_button_text_color_dark;
            }
        } else if (!b.I(context)) {
            i5 = R.color.sesl_suggest_button_text_color_dark_for_theme;
        }
        return AbstractC0939b.a(context, i5);
    }

    private final int getSuggestTitleWithWhiteCaseColor(Context context) {
        AbstractC0219i.e("context", context);
        boolean zIsEmpty = TextUtils.isEmpty(Settings.System.getString(context.getContentResolver(), "current_sec_active_themepackage"));
        int i5 = R.color.sesl_appbar_suggest_title_with_white_case;
        if (zIsEmpty) {
            if (!b.I(context)) {
                i5 = R.color.sesl_appbar_suggest_title_dark;
            }
        } else if (!b.I(context)) {
            i5 = R.color.sesl_appbar_suggest_title_dark_for_theme;
        }
        return AbstractC0939b.a(context, i5);
    }

    private final int getViewPagerItemBackgroundWhiteWhiteCaseColor(Context context) {
        AbstractC0219i.e("context", context);
        boolean zIsEmpty = TextUtils.isEmpty(Settings.System.getString(context.getContentResolver(), "current_sec_active_themepackage"));
        int i5 = R.color.sesl_viewpager_item_background_dark;
        if (zIsEmpty) {
            if (b.I(context)) {
                i5 = R.color.sesl_viewpager_item_background_with_white_case;
            }
        } else if (b.I(context)) {
            i5 = R.color.sesl_viewpager_item_background_with_white_case_for_theme;
        }
        return AbstractC0939b.a(context, i5);
    }

    @Override // com.google.android.material.appbar.model.view.SuggestAppBarItemView, com.google.android.material.appbar.model.view.SuggestAppBarView
    public void updateResource(Context context) throws Resources.NotFoundException {
        AbstractC0219i.e("context", context);
        super.updateResource(context);
        b.I(context);
        ViewGroup rootView = getRootView();
        if (rootView != null) {
            rootView.setBackgroundTintList(ColorStateList.valueOf(getViewPagerItemBackgroundWhiteWhiteCaseColor(context)));
        }
        TextView titleView = getTitleView();
        if (titleView != null) {
            titleView.setTextColor(getSuggestTitleWithWhiteCaseColor(context));
        }
        ImageButton close = getClose();
        if (close != null) {
            close.setBackground(getCloseDrawable(context));
        }
        updateButtons(getButtons());
    }
}
