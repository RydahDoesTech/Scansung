package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: k.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0607b0 extends ToggleButton {

    /* renamed from: d, reason: collision with root package name */
    public final B3.g f7650d;

    /* renamed from: e, reason: collision with root package name */
    public final V f7651e;
    public C0657v f;

    public C0607b0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        v1.a(this, getContext());
        B3.g gVar = new B3.g(this);
        this.f7650d = gVar;
        gVar.g(attributeSet, R.attr.buttonStyleToggle);
        V v2 = new V(this);
        this.f7651e = v2;
        v2.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.buttonStyleToggle);
    }

    private C0657v getEmojiTextViewHelper() {
        if (this.f == null) {
            this.f = new C0657v(this);
        }
        return this.f;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        B3.g gVar = this.f7650d;
        if (gVar != null) {
            gVar.a();
        }
        V v2 = this.f7651e;
        if (v2 != null) {
            v2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        B3.g gVar = this.f7650d;
        if (gVar != null) {
            return gVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        B3.g gVar = this.f7650d;
        if (gVar != null) {
            return gVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f7651e.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f7651e.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().c(z4);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        B3.g gVar = this.f7650d;
        if (gVar != null) {
            gVar.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        B3.g gVar = this.f7650d;
        if (gVar != null) {
            gVar.i(i5);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v2 = this.f7651e;
        if (v2 != null) {
            v2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v2 = this.f7651e;
        if (v2 != null) {
            v2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().d(z4);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        B3.g gVar = this.f7650d;
        if (gVar != null) {
            gVar.k(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        B3.g gVar = this.f7650d;
        if (gVar != null) {
            gVar.l(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v2 = this.f7651e;
        v2.h(colorStateList);
        v2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v2 = this.f7651e;
        v2.i(mode);
        v2.b();
    }
}
