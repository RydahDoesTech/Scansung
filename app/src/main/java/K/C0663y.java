package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import com.google.firebase.messaging.C0388e;
import e1.AbstractC0415a;

/* renamed from: k.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0663y extends MultiAutoCompleteTextView {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f7863g = {R.attr.popupBackground};

    /* renamed from: d, reason: collision with root package name */
    public final B3.g f7864d;

    /* renamed from: e, reason: collision with root package name */
    public final V f7865e;
    public final C0388e f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0663y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.wssyncmldm.R.attr.autoCompleteTextViewStyle);
        w1.a(context);
        v1.a(this, getContext());
        D3.c cVarL = D3.c.l(getContext(), attributeSet, f7863g, com.wssyncmldm.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) cVarL.f).hasValue(0)) {
            setDropDownBackgroundDrawable(cVarL.g(0));
        }
        cVarL.m();
        B3.g gVar = new B3.g(this);
        this.f7864d = gVar;
        gVar.g(attributeSet, com.wssyncmldm.R.attr.autoCompleteTextViewStyle);
        V v2 = new V(this);
        this.f7865e = v2;
        v2.f(attributeSet, com.wssyncmldm.R.attr.autoCompleteTextViewStyle);
        v2.b();
        C0388e c0388e = new C0388e((EditText) this);
        this.f = c0388e;
        c0388e.v(attributeSet, com.wssyncmldm.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerR = c0388e.r(keyListener);
        if (keyListenerR == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerR);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        B3.g gVar = this.f7864d;
        if (gVar != null) {
            gVar.a();
        }
        V v2 = this.f7865e;
        if (v2 != null) {
            v2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        B3.g gVar = this.f7864d;
        if (gVar != null) {
            return gVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        B3.g gVar = this.f7864d;
        if (gVar != null) {
            return gVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f7865e.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f7865e.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        g3.y.R(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.f.y(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        B3.g gVar = this.f7864d;
        if (gVar != null) {
            gVar.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        B3.g gVar = this.f7864d;
        if (gVar != null) {
            gVar.i(i5);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v2 = this.f7865e;
        if (v2 != null) {
            v2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v2 = this.f7865e;
        if (v2 != null) {
            v2.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i5) {
        setDropDownBackgroundDrawable(AbstractC0415a.r(getContext(), i5));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        this.f.E(z4);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f.r(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        B3.g gVar = this.f7864d;
        if (gVar != null) {
            gVar.k(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        B3.g gVar = this.f7864d;
        if (gVar != null) {
            gVar.l(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v2 = this.f7865e;
        v2.h(colorStateList);
        v2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v2 = this.f7865e;
        v2.i(mode);
        v2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i5) {
        super.setTextAppearance(context, i5);
        V v2 = this.f7865e;
        if (v2 != null) {
            v2.g(context, i5);
        }
    }
}
