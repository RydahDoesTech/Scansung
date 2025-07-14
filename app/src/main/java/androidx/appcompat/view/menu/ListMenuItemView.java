package androidx.appcompat.view.menu;

import D3.c;
import J.P;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SeslDropDownItemTextView;
import c.AbstractC0220a;
import com.wssyncmldm.R;
import j.C0494k;
import j.InterfaceC0505v;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0505v, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: d, reason: collision with root package name */
    public C0494k f3209d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView f3210e;
    public RadioButton f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f3211g;

    /* renamed from: h, reason: collision with root package name */
    public CheckBox f3212h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f3213i;

    /* renamed from: j, reason: collision with root package name */
    public ImageView f3214j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f3215k;

    /* renamed from: l, reason: collision with root package name */
    public LinearLayout f3216l;

    /* renamed from: m, reason: collision with root package name */
    public final Drawable f3217m;
    public final int n;

    /* renamed from: o, reason: collision with root package name */
    public final Context f3218o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3219p;

    /* renamed from: q, reason: collision with root package name */
    public final Drawable f3220q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f3221r;

    /* renamed from: s, reason: collision with root package name */
    public LayoutInflater f3222s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3223t;

    /* renamed from: u, reason: collision with root package name */
    public final NumberFormat f3224u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f3225v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3226w;

    /* renamed from: x, reason: collision with root package name */
    public SeslDropDownItemTextView f3227x;

    /* renamed from: y, reason: collision with root package name */
    public LinearLayout f3228y;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3226w = false;
        c cVarL = c.l(getContext(), attributeSet, AbstractC0220a.f5127r, R.attr.listMenuViewStyle);
        this.f3217m = cVarL.g(5);
        TypedArray typedArray = (TypedArray) cVarL.f;
        this.n = typedArray.getResourceId(1, -1);
        this.f3219p = typedArray.getBoolean(7, false);
        this.f3218o = context;
        this.f3220q = cVarL.g(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f3221r = typedArrayObtainStyledAttributes.hasValue(0);
        cVarL.m();
        typedArrayObtainStyledAttributes.recycle();
        this.f3224u = NumberFormat.getInstance(Locale.getDefault());
    }

    private LayoutInflater getInflater() {
        if (this.f3222s == null) {
            this.f3222s = LayoutInflater.from(getContext());
        }
        return this.f3222s;
    }

    private void setBadgeText(String str) throws Resources.NotFoundException, NumberFormatException {
        if (this.f3225v == null) {
            this.f3225v = (TextView) findViewById(R.id.menu_badge);
        }
        if (this.f3225v == null) {
            Log.i("ListMenuItemView", "SUB_MENU_ITEM_LAYOUT case, mBadgeView is null");
            return;
        }
        if (this.f3228y == null) {
            Log.i("ListMenuItemView", "mTitleParent is null");
            return;
        }
        Resources resources = getResources();
        float dimension = resources.getDimension(R.dimen.sesl_badge_additional_width);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f3225v.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f3228y.getLayoutParams();
        if (str == null) {
            layoutParams.topMargin = (int) resources.getDimension(R.dimen.sesl_list_menu_item_dot_badge_top_margin);
            layoutParams2.width = -2;
            this.f3228y.setLayoutParams(layoutParams2);
            this.f3225v.setLayoutParams(layoutParams);
        } else {
            try {
                Integer.parseInt(str);
                String str2 = this.f3224u.format(Math.min(Integer.parseInt(str), 99));
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.sesl_menu_item_badge_text_size);
                TextView textView = this.f3225v;
                float f = getResources().getConfiguration().fontScale;
                if (f > 1.2f) {
                    textView.setTextSize(0, (dimensionPixelSize / f) * 1.2f);
                }
                this.f3225v.setText(str2);
                int length = (int) ((str2.length() * dimension) + resources.getDimension(R.dimen.sesl_badge_default_width));
                int dimension2 = (int) (resources.getDimension(R.dimen.sesl_badge_default_width) + dimension);
                layoutParams.width = length;
                layoutParams.height = dimension2;
                layoutParams.addRule(15, -1);
                this.f3225v.setLayoutParams(layoutParams);
            } catch (NumberFormatException unused) {
            }
        }
        int i5 = layoutParams.width;
        if (str != null) {
            this.f3228y.setPaddingRelative(0, 0, getResources().getDimensionPixelSize(R.dimen.sesl_list_menu_item_dot_badge_end_margin) + i5, 0);
        }
        this.f3225v.setVisibility(str == null ? 8 : 0);
    }

    private void setSubMenuArrowVisible(boolean z4) {
        ImageView imageView = this.f3214j;
        if (imageView == null || this.f3226w) {
            return;
        }
        imageView.setVisibility(z4 ? 0 : 8);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f3215k;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3215k.getLayoutParams();
        rect.top = this.f3215k.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012b  */
    @Override // j.InterfaceC0505v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(j.C0494k r11) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.d(j.k):void");
    }

    @Override // j.InterfaceC0505v
    public C0494k getItemData() {
        return this.f3209d;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = P.f1421a;
        setBackground(this.f3217m);
        SeslDropDownItemTextView seslDropDownItemTextView = (SeslDropDownItemTextView) findViewById(R.id.sub_menu_title);
        this.f3227x = seslDropDownItemTextView;
        boolean z4 = seslDropDownItemTextView != null;
        this.f3226w = z4;
        if (z4) {
            return;
        }
        TextView textView = (TextView) findViewById(R.id.title);
        this.f3211g = textView;
        int i5 = this.n;
        if (i5 != -1) {
            textView.setTextAppearance(this.f3218o, i5);
        }
        TextView textView2 = this.f3211g;
        if (textView2 != null) {
            textView2.setSingleLine(false);
            this.f3211g.setMaxLines(2);
        }
        this.f3213i = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f3214j = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f3220q);
        }
        this.f3215k = (ImageView) findViewById(R.id.group_divider);
        this.f3216l = (LinearLayout) findViewById(R.id.content);
        this.f3228y = (LinearLayout) findViewById(R.id.title_parent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextView textView = this.f3225v;
        if (textView == null || textView.getVisibility() != 0 || this.f3225v.getWidth() <= 0) {
            return;
        }
        CharSequence charSequence = this.f3209d.f6986e;
        if (!TextUtils.isEmpty(getContentDescription())) {
            accessibilityNodeInfo.setContentDescription(getContentDescription());
            return;
        }
        accessibilityNodeInfo.setContentDescription(((Object) charSequence) + " , " + getResources().getString(R.string.sesl_action_menu_overflow_badge_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i5, int i6) {
        if (this.f3210e != null && this.f3219p && !this.f3226w) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f3210e.getLayoutParams();
            int i7 = layoutParams.height;
            if (i7 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i7;
            }
        }
        super.onMeasure(i5, i6);
    }

    public void setCheckable(boolean z4) {
        CompoundButton compoundButton;
        View view;
        if (!z4 && this.f == null && this.f3212h == null) {
            return;
        }
        if (this.f3226w) {
            if (z4) {
                this.f3227x.setChecked(this.f3209d.isChecked());
                return;
            }
            return;
        }
        if (this.f3209d.h()) {
            if (this.f == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.sesl_list_menu_item_radio, (ViewGroup) this, false);
                this.f = radioButton;
                LinearLayout linearLayout = this.f3216l;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f;
            view = this.f3212h;
        } else {
            if (this.f3212h == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.sesl_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f3212h = checkBox;
                LinearLayout linearLayout2 = this.f3216l;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f3212h;
            view = this.f;
        }
        if (z4) {
            compoundButton.setChecked(this.f3209d.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f3212h;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z4) {
        CompoundButton compoundButton;
        if (this.f3226w) {
            this.f3227x.setChecked(z4);
            return;
        }
        if (this.f3209d.h()) {
            if (this.f == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.sesl_list_menu_item_radio, (ViewGroup) this, false);
                this.f = radioButton;
                LinearLayout linearLayout = this.f3216l;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f;
        } else {
            if (this.f3212h == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.sesl_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f3212h = checkBox;
                LinearLayout linearLayout2 = this.f3216l;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f3212h;
        }
        compoundButton.setChecked(z4);
    }

    public void setForceShowIcon(boolean z4) {
        this.f3223t = z4;
        this.f3219p = z4;
    }

    public void setGroupDividerEnabled(boolean z4) {
        ImageView imageView = this.f3215k;
        if (imageView != null) {
            imageView.setVisibility((this.f3221r || !z4) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f3226w) {
            return;
        }
        this.f3209d.n.getClass();
        boolean z4 = this.f3223t;
        if (z4 || this.f3219p) {
            ImageView imageView = this.f3210e;
            if (imageView == null && drawable == null && !this.f3219p) {
                return;
            }
            if (imageView == null && !this.f3226w) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f3210e = imageView2;
                LinearLayout linearLayout = this.f3216l;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f3219p) {
                this.f3210e.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f3210e;
            if (!z4) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f3210e.getVisibility() != 0) {
                this.f3210e.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (this.f3226w) {
            if (charSequence == null) {
                if (this.f3227x.getVisibility() != 8) {
                    this.f3227x.setVisibility(8);
                    return;
                }
                return;
            } else {
                this.f3227x.setText(charSequence);
                if (this.f3227x.getVisibility() != 0) {
                    this.f3227x.setVisibility(0);
                    return;
                }
                return;
            }
        }
        if (charSequence == null) {
            if (this.f3211g.getVisibility() != 8) {
                this.f3211g.setVisibility(8);
            }
        } else {
            this.f3211g.setText(charSequence);
            if (this.f3211g.getVisibility() != 0) {
                this.f3211g.setVisibility(0);
            }
        }
    }
}
