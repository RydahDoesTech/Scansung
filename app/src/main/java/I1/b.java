package I1;

import J.P;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import e1.AbstractC0415a;
import java.util.WeakHashMap;
import v1.AbstractC0886a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f867A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f868B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f869C;
    public Bitmap E;

    /* renamed from: F, reason: collision with root package name */
    public float f871F;

    /* renamed from: G, reason: collision with root package name */
    public float f872G;

    /* renamed from: H, reason: collision with root package name */
    public float f873H;

    /* renamed from: I, reason: collision with root package name */
    public float f874I;

    /* renamed from: J, reason: collision with root package name */
    public float f875J;

    /* renamed from: K, reason: collision with root package name */
    public int f876K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f877L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f878M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f879N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f880O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f881P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f882Q;

    /* renamed from: R, reason: collision with root package name */
    public float f883R;

    /* renamed from: S, reason: collision with root package name */
    public float f884S;

    /* renamed from: T, reason: collision with root package name */
    public float f885T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f886U;

    /* renamed from: V, reason: collision with root package name */
    public float f887V;

    /* renamed from: W, reason: collision with root package name */
    public float f888W;

    /* renamed from: X, reason: collision with root package name */
    public float f889X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f890Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f891Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f892a;

    /* renamed from: a0, reason: collision with root package name */
    public float f893a0;

    /* renamed from: b, reason: collision with root package name */
    public float f894b;

    /* renamed from: b0, reason: collision with root package name */
    public float f895b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f896c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f897c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f898d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f900e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f906j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f907k;

    /* renamed from: l, reason: collision with root package name */
    public float f908l;

    /* renamed from: m, reason: collision with root package name */
    public float f909m;
    public float n;

    /* renamed from: o, reason: collision with root package name */
    public float f910o;

    /* renamed from: p, reason: collision with root package name */
    public float f911p;

    /* renamed from: q, reason: collision with root package name */
    public float f912q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f913r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f914s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f915t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f916u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f917v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f918w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f919x;

    /* renamed from: y, reason: collision with root package name */
    public L1.a f920y;
    public int f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f903g = 16;

    /* renamed from: h, reason: collision with root package name */
    public float f904h = 15.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f905i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f921z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f870D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f899d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f901e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f902f0 = 1;

    public b(TextInputLayout textInputLayout) {
        this.f892a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f879N = textPaint;
        this.f880O = new TextPaint(textPaint);
        this.f898d = new Rect();
        this.f896c = new Rect();
        this.f900e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(int i5, float f, int i6) {
        float f5 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i6) * f) + (Color.alpha(i5) * f5)), Math.round((Color.red(i6) * f) + (Color.red(i5) * f5)), Math.round((Color.green(i6) * f) + (Color.green(i5) * f5)), Math.round((Color.blue(i6) * f) + (Color.blue(i5) * f5)));
    }

    public static float f(float f, float f5, float f6, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f6 = timeInterpolator.getInterpolation(f6);
        }
        return AbstractC0886a.a(f, f5, f6);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = P.f1421a;
        boolean z4 = this.f892a.getLayoutDirection() == 1;
        if (this.f870D) {
            return (z4 ? H.g.f803d : H.g.f802c).d(charSequence, charSequence.length());
        }
        return z4;
    }

    public final void c(float f, boolean z4) {
        float f5;
        float f6;
        Typeface typeface;
        boolean z5;
        Layout.Alignment alignment;
        if (this.f867A == null) {
            return;
        }
        float fWidth = this.f898d.width();
        float fWidth2 = this.f896c.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f5 = this.f905i;
            f6 = this.f887V;
            this.f871F = 1.0f;
            typeface = this.f913r;
        } else {
            float f7 = this.f904h;
            float f8 = this.f888W;
            Typeface typeface2 = this.f916u;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.f871F = 1.0f;
            } else {
                this.f871F = f(this.f904h, this.f905i, f, this.f882Q) / this.f904h;
            }
            float f9 = this.f905i / this.f904h;
            fWidth = (z4 || fWidth2 * f9 <= fWidth) ? fWidth2 : Math.min(fWidth / f9, fWidth2);
            f5 = f7;
            f6 = f8;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f879N;
        if (fWidth > 0.0f) {
            boolean z6 = this.f872G != f5;
            boolean z7 = this.f889X != f6;
            boolean z8 = this.f919x != typeface;
            StaticLayout staticLayout = this.f890Y;
            boolean z9 = z6 || z7 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z8 || this.f878M;
            this.f872G = f5;
            this.f889X = f6;
            this.f919x = typeface;
            this.f878M = false;
            textPaint.setLinearText(this.f871F != 1.0f);
            z5 = z9;
        } else {
            z5 = false;
        }
        if (this.f868B == null || z5) {
            textPaint.setTextSize(this.f872G);
            textPaint.setTypeface(this.f919x);
            textPaint.setLetterSpacing(this.f889X);
            boolean zB = b(this.f867A);
            this.f869C = zB;
            int i5 = this.f899d0;
            if (i5 <= 1 || zB) {
                i5 = 1;
            }
            if (i5 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f, zB ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f869C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f869C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            i iVar = new i(this.f867A, textPaint, (int) fWidth);
            iVar.f941k = this.f921z;
            iVar.f940j = zB;
            iVar.f936e = alignment;
            iVar.f939i = false;
            iVar.f = i5;
            iVar.f937g = this.f901e0;
            iVar.f938h = this.f902f0;
            StaticLayout staticLayoutA = iVar.a();
            staticLayoutA.getClass();
            this.f890Y = staticLayoutA;
            this.f868B = staticLayoutA.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f880O;
        textPaint.setTextSize(this.f905i);
        textPaint.setTypeface(this.f913r);
        textPaint.setLetterSpacing(this.f887V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f877L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        Typeface typeface = this.f915t;
        if (typeface != null) {
            this.f914s = AbstractC0415a.K(configuration, typeface);
        }
        Typeface typeface2 = this.f918w;
        if (typeface2 != null) {
            this.f917v = AbstractC0415a.K(configuration, typeface2);
        }
        Typeface typeface3 = this.f914s;
        if (typeface3 == null) {
            typeface3 = this.f915t;
        }
        this.f913r = typeface3;
        Typeface typeface4 = this.f917v;
        if (typeface4 == null) {
            typeface4 = this.f918w;
        }
        this.f916u = typeface4;
        h(true);
    }

    public final void h(boolean z4) {
        float fMeasureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f892a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z4) {
            return;
        }
        c(1.0f, z4);
        CharSequence charSequence = this.f868B;
        TextPaint textPaint = this.f879N;
        if (charSequence != null && (staticLayout = this.f890Y) != null) {
            this.f897c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f921z);
        }
        CharSequence charSequence2 = this.f897c0;
        if (charSequence2 != null) {
            this.f891Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f891Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f903g, this.f869C ? 1 : 0);
        int i5 = absoluteGravity & 112;
        Rect rect = this.f898d;
        if (i5 == 48) {
            this.f909m = rect.top;
        } else if (i5 != 80) {
            this.f909m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f909m = textPaint.ascent() + rect.bottom;
        }
        int i6 = absoluteGravity & 8388615;
        if (i6 == 1) {
            this.f910o = rect.centerX() - (this.f891Z / 2.0f);
        } else if (i6 != 5) {
            this.f910o = rect.left;
        } else {
            this.f910o = rect.right - this.f891Z;
        }
        c(0.0f, z4);
        float height = this.f890Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f890Y;
        if (staticLayout2 == null || this.f899d0 <= 1) {
            CharSequence charSequence3 = this.f868B;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f890Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f, this.f869C ? 1 : 0);
        int i7 = absoluteGravity2 & 112;
        Rect rect2 = this.f896c;
        if (i7 == 48) {
            this.f908l = rect2.top;
        } else if (i7 != 80) {
            this.f908l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f908l = textPaint.descent() + (rect2.bottom - height);
        }
        int i8 = absoluteGravity2 & 8388615;
        if (i8 == 1) {
            this.n = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i8 != 5) {
            this.n = rect2.left;
        } else {
            this.n = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.E;
        if (bitmap != null) {
            bitmap.recycle();
            this.E = null;
        }
        l(this.f894b);
        float f = this.f894b;
        float f5 = f(rect2.left, rect.left, f, this.f881P);
        RectF rectF = this.f900e;
        rectF.left = f5;
        rectF.top = f(this.f908l, this.f909m, f, this.f881P);
        rectF.right = f(rect2.right, rect.right, f, this.f881P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f, this.f881P);
        this.f911p = f(this.n, this.f910o, f, this.f881P);
        this.f912q = f(this.f908l, this.f909m, f, this.f881P);
        l(f);
        a0.a aVar = AbstractC0886a.f9218b;
        this.f893a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f, aVar);
        WeakHashMap weakHashMap = P.f1421a;
        textInputLayout.postInvalidateOnAnimation();
        this.f895b0 = f(1.0f, 0.0f, f, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f907k;
        ColorStateList colorStateList2 = this.f906j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), f, e(this.f907k)));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f6 = this.f887V;
        float f7 = this.f888W;
        if (f6 != f7) {
            textPaint.setLetterSpacing(f(f7, f6, f, aVar));
        } else {
            textPaint.setLetterSpacing(f6);
        }
        this.f873H = AbstractC0886a.a(0.0f, this.f883R, f);
        this.f874I = AbstractC0886a.a(0.0f, this.f884S, f);
        this.f875J = AbstractC0886a.a(0.0f, this.f885T, f);
        int iA = a(0, f, e(this.f886U));
        this.f876K = iA;
        textPaint.setShadowLayer(this.f873H, this.f874I, this.f875J, iA);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f907k == colorStateList && this.f906j == colorStateList) {
            return;
        }
        this.f907k = colorStateList;
        this.f906j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        L1.a aVar = this.f920y;
        if (aVar != null) {
            aVar.f1714e = true;
        }
        if (this.f915t == typeface) {
            return false;
        }
        this.f915t = typeface;
        Typeface typefaceK = AbstractC0415a.K(this.f892a.getContext().getResources().getConfiguration(), typeface);
        this.f914s = typefaceK;
        if (typefaceK == null) {
            typefaceK = this.f915t;
        }
        this.f913r = typefaceK;
        return true;
    }

    public final void k(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f894b) {
            this.f894b = f;
            float f5 = this.f896c.left;
            Rect rect = this.f898d;
            float f6 = f(f5, rect.left, f, this.f881P);
            RectF rectF = this.f900e;
            rectF.left = f6;
            rectF.top = f(this.f908l, this.f909m, f, this.f881P);
            rectF.right = f(r1.right, rect.right, f, this.f881P);
            rectF.bottom = f(r1.bottom, rect.bottom, f, this.f881P);
            this.f911p = f(this.n, this.f910o, f, this.f881P);
            this.f912q = f(this.f908l, this.f909m, f, this.f881P);
            l(f);
            a0.a aVar = AbstractC0886a.f9218b;
            this.f893a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f, aVar);
            WeakHashMap weakHashMap = P.f1421a;
            TextInputLayout textInputLayout = this.f892a;
            textInputLayout.postInvalidateOnAnimation();
            this.f895b0 = f(1.0f, 0.0f, f, aVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f907k;
            ColorStateList colorStateList2 = this.f906j;
            TextPaint textPaint = this.f879N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), f, e(this.f907k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f7 = this.f887V;
            float f8 = this.f888W;
            if (f7 != f8) {
                textPaint.setLetterSpacing(f(f8, f7, f, aVar));
            } else {
                textPaint.setLetterSpacing(f7);
            }
            this.f873H = AbstractC0886a.a(0.0f, this.f883R, f);
            this.f874I = AbstractC0886a.a(0.0f, this.f884S, f);
            this.f875J = AbstractC0886a.a(0.0f, this.f885T, f);
            int iA = a(0, f, e(this.f886U));
            this.f876K = iA;
            textPaint.setShadowLayer(this.f873H, this.f874I, this.f875J, iA);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f) {
        c(f, false);
        WeakHashMap weakHashMap = P.f1421a;
        this.f892a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z4;
        boolean zJ = j(typeface);
        if (this.f918w != typeface) {
            this.f918w = typeface;
            Typeface typefaceK = AbstractC0415a.K(this.f892a.getContext().getResources().getConfiguration(), typeface);
            this.f917v = typefaceK;
            if (typefaceK == null) {
                typefaceK = this.f918w;
            }
            this.f916u = typefaceK;
            z4 = true;
        } else {
            z4 = false;
        }
        if (zJ || z4) {
            h(false);
        }
    }
}
