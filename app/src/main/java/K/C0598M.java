package k;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatSpinner;
import com.wssyncmldm.R;

/* renamed from: k.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0598M extends C0662x0 implements InterfaceC0600O {

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f7530D;
    public C0595J E;

    /* renamed from: F, reason: collision with root package name */
    public int f7531F;

    /* renamed from: G, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f7532G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0598M(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f7532G = appCompatSpinner;
        new Rect();
        appCompatSpinner.getClass();
        this.f7846m = 0;
        this.f7848p = appCompatSpinner;
        this.f7858z = true;
        this.f7836A.setFocusable(true);
        this.f7849q = new C0596K(0, this);
    }

    @Override // k.InterfaceC0600O
    public final void e(int i5, int i6) {
        C0665z c0665z = this.f7836A;
        boolean zIsShowing = c0665z.isShowing();
        s();
        this.f7836A.setInputMethodMode(2);
        r();
        C0637l0 c0637l0 = this.f;
        AbstractC0592G.d(c0637l0, i5);
        AbstractC0592G.c(c0637l0, i6);
        if (zIsShowing) {
            return;
        }
        c0637l0.setChoiceMode(1);
        AppCompatSpinner appCompatSpinner = this.f7532G;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        C0637l0 c0637l02 = this.f;
        if (c0665z.isShowing() && c0637l02 != null) {
            c0637l02.setListSelectionHidden(false);
            c0637l02.setSelection(selectedItemPosition);
            if (c0637l02.getChoiceMode() != 0) {
                c0637l02.setItemChecked(selectedItemPosition, true);
            }
        }
        ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
        if (viewTreeObserver != null) {
            ViewTreeObserverOnGlobalLayoutListenerC0590E viewTreeObserverOnGlobalLayoutListenerC0590E = new ViewTreeObserverOnGlobalLayoutListenerC0590E(1, this);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0590E);
            this.f7836A.setOnDismissListener(new C0597L(this, viewTreeObserverOnGlobalLayoutListenerC0590E));
        }
    }

    @Override // k.InterfaceC0600O
    public final CharSequence h() {
        return this.f7530D;
    }

    @Override // k.InterfaceC0600O
    public final void j(CharSequence charSequence) {
        this.f7530D = charSequence;
    }

    @Override // k.C0662x0, k.InterfaceC0600O
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.E = (C0595J) listAdapter;
    }

    @Override // k.InterfaceC0600O
    public final void o(int i5) {
        this.f7531F = i5;
    }

    public final void s() {
        int i5;
        C0665z c0665z = this.f7836A;
        Drawable background = c0665z.getBackground();
        AppCompatSpinner appCompatSpinner = this.f7532G;
        if (background != null) {
            background.getPadding(appCompatSpinner.f3312l);
            boolean zA = M1.a(appCompatSpinner);
            Rect rect = appCompatSpinner.f3312l;
            i5 = zA ? rect.right : -rect.left;
        } else {
            Rect rect2 = appCompatSpinner.f3312l;
            rect2.right = 0;
            rect2.left = 0;
            i5 = 0;
        }
        int paddingLeft = appCompatSpinner.getPaddingLeft();
        int paddingRight = appCompatSpinner.getPaddingRight();
        int width = appCompatSpinner.getWidth();
        int i6 = appCompatSpinner.f3310j;
        if (i6 == -2) {
            int iA = appCompatSpinner.a(this.E, c0665z.getBackground());
            int i7 = appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = appCompatSpinner.f3312l;
            int i8 = (i7 - rect3.left) - rect3.right;
            if (iA > i8) {
                iA = i8;
            }
            q(Math.max(iA + 4, (width - paddingLeft) - paddingRight));
        } else if (i6 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i6);
        }
        int i9 = appCompatSpinner.f3311k;
        if (i9 == 0) {
            i9 = this.f7531F;
        }
        this.f7842i = M1.a(appCompatSpinner) ? (((i5 + width) - paddingRight) - this.f7841h) - i9 : i5 + paddingLeft + i9;
    }
}
