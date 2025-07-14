package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.graphics.drawable.SeslRecoilDrawable;
import e1.AbstractC0415a;

/* renamed from: k.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0661x extends ImageView {

    /* renamed from: d, reason: collision with root package name */
    public final B3.g f7832d;

    /* renamed from: e, reason: collision with root package name */
    public final A.d f7833e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7834g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0661x(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        w1.a(context);
        this.f = false;
        v1.a(this, getContext());
        B3.g gVar = new B3.g(this);
        this.f7832d = gVar;
        gVar.g(attributeSet, i5);
        A.d dVar = new A.d(this);
        this.f7833e = dVar;
        dVar.h(attributeSet, i5);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        B3.g gVar = this.f7832d;
        if (gVar != null) {
            gVar.a();
        }
        A.d dVar = this.f7833e;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        B3.g gVar = this.f7832d;
        if (gVar != null) {
            return gVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        B3.g gVar = this.f7832d;
        if (gVar != null) {
            return gVar.f();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        x1 x1Var;
        A.d dVar = this.f7833e;
        if (dVar == null || (x1Var = (x1) dVar.f12c) == null) {
            return null;
        }
        return x1Var.f7859a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        x1 x1Var;
        A.d dVar = this.f7833e;
        if (dVar == null || (x1Var = (x1) dVar.f12c) == null) {
            return null;
        }
        return x1Var.f7860b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f7833e.f11b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getBackground() instanceof SeslRecoilDrawable) {
            this.f7834g = true;
        }
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (!this.f7834g || getStateListAnimator() == null) {
            return;
        }
        getStateListAnimator().jumpToCurrentState();
        this.f7834g = false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        B3.g gVar = this.f7832d;
        if (gVar != null) {
            gVar.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        B3.g gVar = this.f7832d;
        if (gVar != null) {
            gVar.i(i5);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        A.d dVar = this.f7833e;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        A.d dVar = this.f7833e;
        if (dVar != null && drawable != null && !this.f) {
            dVar.f10a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f11b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f10a);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i5) {
        super.setImageLevel(i5);
        this.f = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i5) {
        A.d dVar = this.f7833e;
        if (dVar != null) {
            ImageView imageView = (ImageView) dVar.f11b;
            if (i5 != 0) {
                Drawable drawableR = AbstractC0415a.r(imageView.getContext(), i5);
                if (drawableR != null) {
                    Rect rect = AbstractC0622g0.f7667a;
                }
                imageView.setImageDrawable(drawableR);
            } else {
                imageView.setImageDrawable(null);
            }
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        A.d dVar = this.f7833e;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        B3.g gVar = this.f7832d;
        if (gVar != null) {
            gVar.k(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        B3.g gVar = this.f7832d;
        if (gVar != null) {
            gVar.l(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        A.d dVar = this.f7833e;
        if (dVar != null) {
            if (((x1) dVar.f12c) == null) {
                dVar.f12c = new x1();
            }
            x1 x1Var = (x1) dVar.f12c;
            x1Var.f7859a = colorStateList;
            x1Var.f7862d = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        A.d dVar = this.f7833e;
        if (dVar != null) {
            if (((x1) dVar.f12c) == null) {
                dVar.f12c = new x1();
            }
            x1 x1Var = (x1) dVar.f12c;
            x1Var.f7860b = mode;
            x1Var.f7861c = true;
            dVar.a();
        }
    }
}
