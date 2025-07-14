package R1;

import J.P;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.wssyncmldm.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class x extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f2472d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatTextView f2473e;
    public CharSequence f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f2474g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f2475h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f2476i;

    /* renamed from: j, reason: collision with root package name */
    public int f2477j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView.ScaleType f2478k;

    /* renamed from: l, reason: collision with root package name */
    public View.OnLongClickListener f2479l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2480m;

    public x(TextInputLayout textInputLayout, D3.c cVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f2472d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f2474g = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f2473e = appCompatTextView;
        if (V1.a.Y(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f2479l;
        checkableImageButton.setOnClickListener(null);
        Y0.j.P(checkableImageButton, onLongClickListener);
        this.f2479l = null;
        checkableImageButton.setOnLongClickListener(null);
        Y0.j.P(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) cVar.f;
        if (typedArray.hasValue(69)) {
            this.f2475h = V1.a.y(getContext(), cVar, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f2476i = I1.m.g(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(cVar.g(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f2477j) {
            this.f2477j = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleTypeM = Y0.j.m(typedArray.getInt(68, -1));
            this.f2478k = scaleTypeM;
            checkableImageButton.setScaleType(scaleTypeM);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = P.f1421a;
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            appCompatTextView.setTextColor(cVar.f(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f = TextUtils.isEmpty(text2) ? null : text2;
        appCompatTextView.setText(text2);
        e();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f2474g;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        WeakHashMap weakHashMap = P.f1421a;
        return this.f2473e.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f2474g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f2475h;
            PorterDuff.Mode mode = this.f2476i;
            TextInputLayout textInputLayout = this.f2472d;
            Y0.j.a(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            Y0.j.L(textInputLayout, checkableImageButton, this.f2475h);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f2479l;
        checkableImageButton.setOnClickListener(null);
        Y0.j.P(checkableImageButton, onLongClickListener);
        this.f2479l = null;
        checkableImageButton.setOnLongClickListener(null);
        Y0.j.P(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z4) {
        CheckableImageButton checkableImageButton = this.f2474g;
        if ((checkableImageButton.getVisibility() == 0) != z4) {
            checkableImageButton.setVisibility(z4 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() throws Resources.NotFoundException {
        int paddingStart;
        EditText editText = this.f2472d.f6017g;
        if (editText == null) {
            return;
        }
        if (this.f2474g.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = P.f1421a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = P.f1421a;
        this.f2473e.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i5 = (this.f == null || this.f2480m) ? 8 : 0;
        setVisibility((this.f2474g.getVisibility() == 0 || i5 == 0) ? 0 : 8);
        this.f2473e.setVisibility(i5);
        this.f2472d.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i5, int i6) throws Resources.NotFoundException {
        super.onMeasure(i5, i6);
        d();
    }
}
