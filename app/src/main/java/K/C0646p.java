package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import e1.AbstractC0415a;

/* renamed from: k.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0646p extends CheckBox implements O.r {

    /* renamed from: d, reason: collision with root package name */
    public final r f7764d;

    /* renamed from: e, reason: collision with root package name */
    public final B3.g f7765e;
    public final V f;

    /* renamed from: g, reason: collision with root package name */
    public C0657v f7766g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0646p(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        w1.a(context);
        v1.a(this, getContext());
        r rVar = new r(this);
        this.f7764d = rVar;
        rVar.c(attributeSet, i5);
        B3.g gVar = new B3.g(this);
        this.f7765e = gVar;
        gVar.g(attributeSet, i5);
        V v2 = new V(this);
        this.f = v2;
        v2.f(attributeSet, i5);
        getEmojiTextViewHelper().b(attributeSet, i5);
    }

    private C0657v getEmojiTextViewHelper() {
        if (this.f7766g == null) {
            this.f7766g = new C0657v(this);
        }
        return this.f7766g;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        B3.g gVar = this.f7765e;
        if (gVar != null) {
            gVar.a();
        }
        V v2 = this.f;
        if (v2 != null) {
            v2.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        r rVar = this.f7764d;
        if (rVar != null) {
            rVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        B3.g gVar = this.f7765e;
        if (gVar != null) {
            return gVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        B3.g gVar = this.f7765e;
        if (gVar != null) {
            return gVar.f();
        }
        return null;
    }

    @Override // O.r
    public ColorStateList getSupportButtonTintList() {
        r rVar = this.f7764d;
        if (rVar != null) {
            return rVar.f7783a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        r rVar = this.f7764d;
        if (rVar != null) {
            return rVar.f7784b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().c(z4);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        B3.g gVar = this.f7765e;
        if (gVar != null) {
            gVar.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        B3.g gVar = this.f7765e;
        if (gVar != null) {
            gVar.i(i5);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        r rVar = this.f7764d;
        if (rVar != null) {
            if (rVar.f7787e) {
                rVar.f7787e = false;
            } else {
                rVar.f7787e = true;
                rVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v2 = this.f;
        if (v2 != null) {
            v2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v2 = this.f;
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
        B3.g gVar = this.f7765e;
        if (gVar != null) {
            gVar.k(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        B3.g gVar = this.f7765e;
        if (gVar != null) {
            gVar.l(mode);
        }
    }

    @Override // O.r
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        r rVar = this.f7764d;
        if (rVar != null) {
            rVar.f7783a = colorStateList;
            rVar.f7785c = true;
            rVar.a();
        }
    }

    @Override // O.r
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        r rVar = this.f7764d;
        if (rVar != null) {
            rVar.f7784b = mode;
            rVar.f7786d = true;
            rVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v2 = this.f;
        v2.h(colorStateList);
        v2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v2 = this.f;
        v2.i(mode);
        v2.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i5) {
        setButtonDrawable(AbstractC0415a.r(getContext(), i5));
    }
}
