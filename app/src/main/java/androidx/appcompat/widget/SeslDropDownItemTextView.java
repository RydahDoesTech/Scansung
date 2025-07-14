package androidx.appcompat.widget;

import A.r;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import c.AbstractC0220a;
import k.AbstractC0605a1;
import k.AbstractC0622g0;

/* loaded from: classes.dex */
public class SeslDropDownItemTextView extends AbstractC0605a1 {
    public SeslDropDownItemTextView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.textViewStyle, 0);
        this.f7639g = null;
        this.f7640h = null;
        this.f7641i = false;
        this.f7642j = false;
        this.f7645m = 8388611;
        int[] iArr = AbstractC0220a.f5122l;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
        try {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.textViewStyle, 0);
            this.f7647p = context.getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_checked_spinner_padding_end);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
            if (drawable != null) {
                setCheckMarkDrawable(drawable);
            }
            if (typedArrayObtainStyledAttributes.hasValue(3)) {
                this.f7640h = AbstractC0622g0.b(typedArrayObtainStyledAttributes.getInt(3, -1), this.f7640h);
                this.f7642j = true;
            }
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                this.f7639g = typedArrayObtainStyledAttributes.getColorStateList(2);
                this.f7641i = true;
            }
            this.f7645m = typedArrayObtainStyledAttributes.getInt(5, 8388611);
            setChecked(typedArrayObtainStyledAttributes.getBoolean(0, false));
            typedArrayObtainStyledAttributes.recycle();
            this.f7646o = context.getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_checked_text_padding);
            a();
            Resources resources = context.getResources();
            setMaxWidth(resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_menu_popup_offset_horizontal) * 2));
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // k.AbstractC0605a1, android.widget.Checkable
    public void setChecked(boolean z4) {
        Context context;
        super.setChecked(z4);
        setTypeface(Typeface.create(Typeface.create("sec", 0), z4 ? 600 : 400, false));
        if (z4 && (context = getContext()) != null && getCurrentTextColor() == -65281) {
            Log.w("SeslDropDownItemTextView", "text color reload!");
            ColorStateList colorStateListA = r.a(context.getResources(), J2.b.I(context) ? com.wssyncmldm.R.color.sesl_spinner_dropdown_text_color_light : com.wssyncmldm.R.color.sesl_spinner_dropdown_text_color_dark, context.getTheme());
            if (colorStateListA != null) {
                setTextColor(colorStateListA);
            } else {
                Log.w("SeslDropDownItemTextView", "Didn't set SeslDropDownItemTextView text color!!");
            }
        }
    }
}
