package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import c.AbstractC0220a;
import e1.AbstractC0415a;
import java.util.WeakHashMap;

/* renamed from: k.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0648q extends CheckedTextView {

    /* renamed from: d, reason: collision with root package name */
    public final r f7767d;

    /* renamed from: e, reason: collision with root package name */
    public final B3.g f7768e;
    public final V f;

    /* renamed from: g, reason: collision with root package name */
    public C0657v f7769g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0648q(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        w1.a(context);
        v1.a(this, getContext());
        V v2 = new V(this);
        this.f = v2;
        v2.f(attributeSet, R.attr.checkedTextViewStyle);
        v2.b();
        B3.g gVar = new B3.g(this);
        this.f7768e = gVar;
        gVar.g(attributeSet, R.attr.checkedTextViewStyle);
        this.f7767d = new r(this);
        Context context2 = getContext();
        int[] iArr = AbstractC0220a.f5122l;
        D3.c cVarL = D3.c.l(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) cVarL.f;
        Context context3 = getContext();
        WeakHashMap weakHashMap = J.P.f1421a;
        J.M.d(this, context3, iArr, attributeSet, (TypedArray) cVarL.f, R.attr.checkedTextViewStyle, 0);
        try {
            if (typedArray.hasValue(4) && (resourceId2 = typedArray.getResourceId(4, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC0415a.r(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(1) && (resourceId = typedArray.getResourceId(1, 0)) != 0) {
                setCheckMarkDrawable(AbstractC0415a.r(getContext(), resourceId));
            }
            if (typedArray.hasValue(6)) {
                setCheckMarkTintList(cVarL.f(6));
            }
            if (typedArray.hasValue(7)) {
                setCheckMarkTintMode(AbstractC0622g0.b(typedArray.getInt(7, -1), null));
            }
            cVarL.m();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            cVarL.m();
            throw th;
        }
    }

    private C0657v getEmojiTextViewHelper() {
        if (this.f7769g == null) {
            this.f7769g = new C0657v(this);
        }
        return this.f7769g;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        V v2 = this.f;
        if (v2 != null) {
            v2.b();
        }
        B3.g gVar = this.f7768e;
        if (gVar != null) {
            gVar.a();
        }
        r rVar = this.f7767d;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        B3.g gVar = this.f7768e;
        if (gVar != null) {
            return gVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        B3.g gVar = this.f7768e;
        if (gVar != null) {
            return gVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        r rVar = this.f7767d;
        if (rVar != null) {
            return rVar.f7783a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        r rVar = this.f7767d;
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        g3.y.R(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().c(z4);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        B3.g gVar = this.f7768e;
        if (gVar != null) {
            gVar.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        B3.g gVar = this.f7768e;
        if (gVar != null) {
            gVar.i(i5);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        r rVar = this.f7767d;
        if (rVar != null) {
            if (rVar.f7787e) {
                rVar.f7787e = false;
            } else {
                rVar.f7787e = true;
                rVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v2 = this.f;
        if (v2 != null) {
            v2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v2 = this.f;
        if (v2 != null) {
            v2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().d(z4);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        B3.g gVar = this.f7768e;
        if (gVar != null) {
            gVar.k(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        B3.g gVar = this.f7768e;
        if (gVar != null) {
            gVar.l(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        r rVar = this.f7767d;
        if (rVar != null) {
            rVar.f7783a = colorStateList;
            rVar.f7785c = true;
            rVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        r rVar = this.f7767d;
        if (rVar != null) {
            rVar.f7784b = mode;
            rVar.f7786d = true;
            rVar.b();
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i5) {
        super.setTextAppearance(context, i5);
        V v2 = this.f;
        if (v2 != null) {
            v2.g(context, i5);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i5) {
        setCheckMarkDrawable(AbstractC0415a.r(getContext(), i5));
    }
}
