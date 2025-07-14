package com.google.android.material.appbar.model.view;

import J2.b;
import P2.n;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import b3.AbstractC0215e;
import b3.AbstractC0219i;
import com.google.android.material.appbar.model.AppBarModel;
import com.google.android.material.appbar.model.ButtonListModel;
import com.google.android.material.appbar.model.ButtonModel;
import com.google.android.material.appbar.model.ButtonStyle;
import com.google.android.material.appbar.model.SuggestAppBarModel;
import com.idm.network.IDMNetworkInterface;
import com.wssyncmldm.R;
import java.util.ArrayList;
import java.util.List;
import k.J1;
import k.ViewOnClickListenerC0608b1;
import kotlin.Metadata;
import r0.AbstractC0807a;
import r0.AbstractC0808b;
import x1.AbstractC0909a;
import z.AbstractC0938a;
import z.AbstractC0939b;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u000f2\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)R\u001e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010*R$\u0010,\u001a\u0004\u0018\u00010+8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00103\u001a\u0004\u0018\u0001028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010:\u001a\u0004\u0018\u0001098\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020\f0@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lcom/google/android/material/appbar/model/view/SuggestAppBarView;", "Lx1/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/google/android/material/appbar/model/ButtonModel;", "buttonModel", "", "style", "Landroid/widget/Button;", "generateButton", "(Lcom/google/android/material/appbar/model/ButtonModel;I)Landroid/widget/Button;", "LO2/l;", "addMargin", "()V", "getAppBarSuggestTitleColor", "(Landroid/content/Context;)I", "Landroid/graphics/drawable/Drawable;", "getCloseDrawable", "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "inflate", "updateResource", "(Landroid/content/Context;)V", "Lcom/google/android/material/appbar/model/SuggestAppBarModel;", "model", "setModel", "(Lcom/google/android/material/appbar/model/SuggestAppBarModel;)V", "", "title", "setTitle", "(Ljava/lang/String;)V", "Lcom/google/android/material/appbar/model/AppBarModel$OnClickListener;", "closeClickListener", "setCloseClickListener", "(Lcom/google/android/material/appbar/model/AppBarModel$OnClickListener;)V", "Lcom/google/android/material/appbar/model/ButtonListModel;", "buttonModels", "setButtonModules", "(Lcom/google/android/material/appbar/model/ButtonListModel;)V", "Lcom/google/android/material/appbar/model/SuggestAppBarModel;", "Landroid/widget/TextView;", "titleView", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "setTitleView", "(Landroid/widget/TextView;)V", "Landroid/widget/ImageButton;", IDMNetworkInterface.IDM_HTTP_CLOSE, "Landroid/widget/ImageButton;", "getClose", "()Landroid/widget/ImageButton;", "setClose", "(Landroid/widget/ImageButton;)V", "Landroid/view/ViewGroup;", "bottomLayout", "Landroid/view/ViewGroup;", "getBottomLayout", "()Landroid/view/ViewGroup;", "setBottomLayout", "(Landroid/view/ViewGroup;)V", "", "buttons", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class SuggestAppBarView extends AbstractC0909a {
    private ViewGroup bottomLayout;
    private final List<Button> buttons;
    private ImageButton close;
    private SuggestAppBarModel<? extends SuggestAppBarView> model;
    private TextView titleView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SuggestAppBarView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        AbstractC0219i.e("context", context);
    }

    private final void addMargin() {
        View view = new View(getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(view.getResources().getDimensionPixelOffset(R.dimen.sesl_appbar_button_side_margin), -1));
        ViewGroup viewGroup = this.bottomLayout;
        if (viewGroup != null) {
            viewGroup.addView(view);
        }
    }

    private final Button generateButton(ButtonModel buttonModel, int style) {
        Button button = new Button(getContext(), null, 0, style);
        button.setText(buttonModel.f5721a);
        String str = buttonModel.f5723c;
        if (str != null) {
            button.setContentDescription(str);
        }
        button.setOnClickListener(new ViewOnClickListenerC0608b1(buttonModel, this, 1));
        return button;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void generateButton$lambda$9$lambda$8(ButtonModel buttonModel, SuggestAppBarView suggestAppBarView, View view) {
        AbstractC0219i.e("$buttonModel", buttonModel);
        AbstractC0219i.e("this$0", suggestAppBarView);
        AppBarModel.OnClickListener onClickListener = buttonModel.f5722b;
        if (onClickListener != null) {
            AbstractC0219i.d("it", view);
            if (suggestAppBarView.model != null) {
                onClickListener.onClick();
            } else {
                AbstractC0219i.g("model");
                throw null;
            }
        }
    }

    private final int getAppBarSuggestTitleColor(Context context) {
        AbstractC0219i.e("context", context);
        boolean zIsEmpty = TextUtils.isEmpty(Settings.System.getString(context.getContentResolver(), "current_sec_active_themepackage"));
        int i5 = R.color.sesl_appbar_suggest_title;
        if (zIsEmpty) {
            if (!b.I(context)) {
                i5 = R.color.sesl_appbar_suggest_title_dark;
            }
        } else if (!b.I(context)) {
            i5 = R.color.sesl_appbar_suggest_title_dark_for_theme;
        }
        return AbstractC0939b.a(context, i5);
    }

    private final Drawable getCloseDrawable(Context context) {
        AbstractC0219i.e("context", context);
        return AbstractC0938a.b(context, TextUtils.isEmpty(Settings.System.getString(context.getContentResolver(), "current_sec_active_themepackage")) ? b.I(context) ? R.drawable.sesl_close_button_recoil_background : R.drawable.sesl_close_button_recoil_background_dark : b.I(context) ? R.drawable.sesl_close_button_recoil_background_for_theme : R.drawable.sesl_close_button_recoil_background_dark_for_theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCloseClickListener$lambda$4$lambda$3(AppBarModel.OnClickListener onClickListener, SuggestAppBarView suggestAppBarView, View view) {
        AbstractC0219i.e("this$0", suggestAppBarView);
        if (onClickListener != null) {
            AbstractC0219i.d("it", view);
            if (suggestAppBarView.model != null) {
                onClickListener.onClick();
            } else {
                AbstractC0219i.g("model");
                throw null;
            }
        }
    }

    public final ViewGroup getBottomLayout() {
        return this.bottomLayout;
    }

    public final List<Button> getButtons() {
        return this.buttons;
    }

    public final ImageButton getClose() {
        return this.close;
    }

    public final TextView getTitleView() {
        return this.titleView;
    }

    public void inflate() throws Resources.NotFoundException {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.sesl_app_bar_suggest, (ViewGroup) this, false);
        ImageButton imageButton = null;
        ViewGroup viewGroup = viewInflate instanceof ViewGroup ? (ViewGroup) viewInflate : null;
        if (viewGroup == null) {
            return;
        }
        this.titleView = (TextView) viewGroup.findViewById(R.id.suggest_app_bar_title);
        ImageButton imageButton2 = (ImageButton) viewGroup.findViewById(R.id.suggest_app_bar_close);
        if (imageButton2 != null) {
            AbstractC0808b.m(AbstractC0807a.b(), imageButton2);
            imageButton = imageButton2;
        }
        this.close = imageButton;
        this.bottomLayout = (ViewGroup) viewGroup.findViewById(R.id.suggest_app_bar_bottom_layout);
        Context context = getContext();
        AbstractC0219i.d("context", context);
        updateResource(context);
        addView(viewGroup);
    }

    public final void setBottomLayout(ViewGroup viewGroup) {
        this.bottomLayout = viewGroup;
    }

    public final void setButtonModules(ButtonListModel buttonModels) {
        AbstractC0219i.e("buttonModels", buttonModels);
        ViewGroup viewGroup = this.bottomLayout;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.buttons.clear();
        List list = buttonModels.f5720b;
        int i5 = 0;
        for (Object obj : list) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                n.k0();
                throw null;
            }
            ButtonModel buttonModel = (ButtonModel) obj;
            boolean zI = b.I(getContext());
            ButtonStyle buttonStyle = buttonModels.f5719a;
            Button buttonGenerateButton = generateButton(buttonModel, zI ? buttonStyle.f5724a : buttonStyle.f5725b);
            buttonGenerateButton.setMaxWidth(buttonGenerateButton.getResources().getDimensionPixelSize(list.size() > 1 ? R.dimen.sesl_appbar_button_max_width : R.dimen.sesl_appbar_button_max_width_multi));
            if (i5 != 0) {
                addMargin();
            }
            this.buttons.add(buttonGenerateButton);
            ViewGroup viewGroup2 = this.bottomLayout;
            if (viewGroup2 != null) {
                viewGroup2.addView(buttonGenerateButton);
            }
            i5 = i6;
        }
    }

    public final void setClose(ImageButton imageButton) {
        this.close = imageButton;
    }

    public final void setCloseClickListener(AppBarModel.OnClickListener closeClickListener) {
        ImageButton imageButton = this.close;
        if (imageButton != null) {
            imageButton.setVisibility(closeClickListener == null ? 8 : 0);
            imageButton.setOnClickListener(new ViewOnClickListenerC0608b1(closeClickListener, this, 2));
        }
    }

    public final void setModel(SuggestAppBarModel<? extends SuggestAppBarView> model) {
        AbstractC0219i.e("model", model);
        this.model = model;
    }

    public final void setTitle(String title) {
        TextView textView = this.titleView;
        if (textView != null) {
            textView.setText(title);
            textView.setVisibility(TextUtils.isEmpty(title) ? 8 : 0);
        }
    }

    public final void setTitleView(TextView textView) {
        this.titleView = textView;
    }

    public void updateResource(Context context) throws Resources.NotFoundException {
        AbstractC0219i.e("context", context);
        b.I(context);
        TextView textView = this.titleView;
        if (textView != null) {
            textView.setTextColor(getAppBarSuggestTitleColor(context));
        }
        ImageButton imageButton = this.close;
        if (imageButton != null) {
            String string = imageButton.getResources().getString(R.string.sesl_appbar_suggest_dismiss);
            AbstractC0219i.d("resources.getString(andr…l_appbar_suggest_dismiss)", string);
            J1.a(imageButton, string);
            imageButton.setContentDescription(string);
            imageButton.setBackground(getCloseDrawable(context));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestAppBarView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        AbstractC0219i.e("context", context);
        this.buttons = new ArrayList();
        inflate();
    }

    public /* synthetic */ SuggestAppBarView(Context context, AttributeSet attributeSet, int i5, AbstractC0215e abstractC0215e) {
        this(context, (i5 & 2) != 0 ? null : attributeSet);
    }
}
