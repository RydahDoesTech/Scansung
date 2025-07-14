package com.google.android.material.snackbar;

import J.P;
import J2.b;
import Q1.e;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wssyncmldm.R;
import java.util.WeakHashMap;
import u1.a;
import v1.AbstractC0886a;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public TextView f5972d;

    /* renamed from: e, reason: collision with root package name */
    public Button f5973e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f5974g;

    /* renamed from: h, reason: collision with root package name */
    public final SnackbarContentLayout f5975h;

    /* renamed from: i, reason: collision with root package name */
    public int f5976i;

    /* renamed from: j, reason: collision with root package name */
    public final InputMethodManager f5977j;

    /* renamed from: k, reason: collision with root package name */
    public final WindowManager f5978k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5979l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5980m;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5979l = false;
        this.f5980m = false;
        b.U(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC0886a.f9218b);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f9181z);
        this.f5974g = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        Resources resources = context.getResources();
        int fraction = (int) resources.getFraction(R.dimen.sesl_config_prefSnackWidth, resources.getDisplayMetrics().widthPixels, resources.getDisplayMetrics().widthPixels);
        this.f5976i = fraction;
        this.f5974g = fraction;
        this.f5975h = (SnackbarContentLayout) findViewById(R.id.snackbar_content_layout);
        this.f5977j = (InputMethodManager) context.getSystemService(InputMethodManager.class);
        this.f5978k = (WindowManager) context.getSystemService("window");
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new e(0, this));
        }
    }

    public final boolean a(int i5, int i6, int i7) {
        boolean z4;
        if (i5 != getOrientation()) {
            setOrientation(i5);
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f5972d.getPaddingTop() == i6 && this.f5972d.getPaddingBottom() == i7) {
            return z4;
        }
        TextView textView = this.f5972d;
        WeakHashMap weakHashMap = P.f1421a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i6, textView.getPaddingEnd(), i7);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i6, textView.getPaddingRight(), i7);
        return true;
    }

    public Button getActionView() {
        return this.f5973e;
    }

    public TextView getMessageView() {
        return this.f5972d;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Resources resources = getContext().getResources();
        int fraction = (int) resources.getFraction(R.dimen.sesl_config_prefSnackWidth, resources.getDisplayMetrics().widthPixels, resources.getDisplayMetrics().widthPixels);
        this.f5976i = fraction;
        this.f5974g = fraction;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f5972d = (TextView) findViewById(R.id.snackbar_text);
        this.f5973e = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0227  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r11, int r12) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setIsCoordinatorLayoutParent(boolean z4) {
        this.f5979l = z4;
    }

    public void setMaxInlineActionWidth(int i5) {
        this.f = i5;
    }
}
