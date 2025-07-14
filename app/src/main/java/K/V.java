package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import c.AbstractC0220a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f7560a;

    /* renamed from: b, reason: collision with root package name */
    public x1 f7561b;

    /* renamed from: c, reason: collision with root package name */
    public x1 f7562c;

    /* renamed from: d, reason: collision with root package name */
    public x1 f7563d;

    /* renamed from: e, reason: collision with root package name */
    public x1 f7564e;
    public x1 f;

    /* renamed from: g, reason: collision with root package name */
    public x1 f7565g;

    /* renamed from: h, reason: collision with root package name */
    public x1 f7566h;

    /* renamed from: i, reason: collision with root package name */
    public final C0604a0 f7567i;

    /* renamed from: j, reason: collision with root package name */
    public int f7568j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f7569k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f7570l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7571m;

    public V(TextView textView) {
        this.f7560a = textView;
        this.f7567i = new C0604a0(textView);
    }

    public static x1 c(Context context, C0651s c0651s, int i5) {
        synchronized (c0651s) {
            synchronized (c0651s.f7796a) {
            }
        }
        return null;
    }

    public final void a(Drawable drawable, x1 x1Var) {
        if (drawable == null || x1Var == null) {
            return;
        }
        C0651s.d(drawable, x1Var, this.f7560a.getDrawableState());
    }

    public final void b() {
        x1 x1Var = this.f7561b;
        TextView textView = this.f7560a;
        if (x1Var != null || this.f7562c != null || this.f7563d != null || this.f7564e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f7561b);
            a(compoundDrawables[1], this.f7562c);
            a(compoundDrawables[2], this.f7563d);
            a(compoundDrawables[3], this.f7564e);
        }
        if (this.f == null && this.f7565g == null) {
            return;
        }
        Drawable[] drawableArrA = AbstractC0602Q.a(textView);
        a(drawableArrA[0], this.f);
        a(drawableArrA[2], this.f7565g);
    }

    public final ColorStateList d() {
        x1 x1Var = this.f7566h;
        if (x1Var != null) {
            return x1Var.f7859a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        x1 x1Var = this.f7566h;
        if (x1Var != null) {
            return x1Var.f7860b;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i5) {
        String string;
        String string2;
        boolean z4;
        boolean z5;
        boolean z6;
        int i6;
        Drawable drawableB;
        int i7;
        Paint.FontMetricsInt fontMetricsInt;
        int i8;
        ColorStateList colorStateList;
        int resourceId;
        int i9;
        int resourceId2;
        TextView textView = this.f7560a;
        Context context = textView.getContext();
        C0651s c0651sA = C0651s.a();
        int[] iArr = AbstractC0220a.f5118h;
        D3.c cVarL = D3.c.l(context, attributeSet, iArr, i5);
        Context context2 = textView.getContext();
        WeakHashMap weakHashMap = J.P.f1421a;
        J.M.d(textView, context2, iArr, attributeSet, (TypedArray) cVarL.f, i5, 0);
        TypedArray typedArray = (TypedArray) cVarL.f;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            c(context, c0651sA, typedArray.getResourceId(3, 0));
            this.f7561b = null;
        }
        if (typedArray.hasValue(1)) {
            c(context, c0651sA, typedArray.getResourceId(1, 0));
            this.f7562c = null;
        }
        if (typedArray.hasValue(4)) {
            c(context, c0651sA, typedArray.getResourceId(4, 0));
            this.f7563d = null;
        }
        if (typedArray.hasValue(2)) {
            c(context, c0651sA, typedArray.getResourceId(2, 0));
            this.f7564e = null;
        }
        if (typedArray.hasValue(5)) {
            c(context, c0651sA, typedArray.getResourceId(5, 0));
            this.f = null;
        }
        if (typedArray.hasValue(6)) {
            c(context, c0651sA, typedArray.getResourceId(6, 0));
            this.f7565g = null;
        }
        cVarL.m();
        boolean z7 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC0220a.f5108A;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            D3.c cVar = new D3.c(context, typedArrayObtainStyledAttributes);
            if (z7 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z4 = false;
                z5 = false;
            } else {
                z5 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z4 = true;
            }
            j(context, cVar);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = typedArrayObtainStyledAttributes.hasValue(13) ? typedArrayObtainStyledAttributes.getString(13) : null;
            cVar.m();
        } else {
            string = null;
            string2 = null;
            z4 = false;
            z5 = false;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i5, 0);
        D3.c cVar2 = new D3.c(context, typedArrayObtainStyledAttributes2);
        if (z7 || !typedArrayObtainStyledAttributes2.hasValue(14)) {
            z6 = z5;
        } else {
            z6 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z4 = true;
        }
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        j(context, cVar2);
        cVar2.m();
        if (!z7 && z4) {
            textView.setAllCaps(z6);
        }
        Typeface typeface = this.f7570l;
        if (typeface != null) {
            if (this.f7569k == -1) {
                textView.setTypeface(typeface, this.f7568j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            T.d(textView, string);
        }
        if (string2 != null) {
            S.b(textView, S.a(string2));
        }
        int[] iArr3 = AbstractC0220a.f5119i;
        C0604a0 c0604a0 = this.f7567i;
        Context context3 = c0604a0.f7635h;
        TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, iArr3, i5, 0);
        TextView textView2 = c0604a0.f7634g;
        J.M.d(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i5, 0);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c0604a0.f7629a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i10 = 0; i10 < length; i10++) {
                    iArr4[i10] = typedArrayObtainTypedArray.getDimensionPixelSize(i10, -1);
                }
                int[] iArrA = C0604a0.a(iArr4);
                c0604a0.f7633e = iArrA;
                boolean z8 = iArrA.length > 0;
                c0604a0.f = z8;
                if (z8) {
                    c0604a0.f7629a = 1;
                    c0604a0.f7631c = iArrA[0];
                    c0604a0.f7632d = iArrA[r9 - 1];
                    c0604a0.f7630b = -1.0f;
                }
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c0604a0.b()) {
            c0604a0.f7629a = 0;
        } else if (c0604a0.f7629a == 1) {
            if (!c0604a0.f) {
                DisplayMetrics displayMetrics = context3.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i9 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i9 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i9, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= 0.0f) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                }
                if (dimension3 <= dimension2) {
                    throw new IllegalArgumentException("Maximum auto-size text size (" + dimension3 + "px) is less or equal to minimum auto-size text size (" + dimension2 + "px)");
                }
                if (dimension <= 0.0f) {
                    throw new IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                }
                c0604a0.f7629a = 1;
                c0604a0.f7631c = dimension2;
                c0604a0.f7632d = dimension3;
                c0604a0.f7630b = dimension;
                c0604a0.f = false;
            }
            if (c0604a0.b() && c0604a0.f7629a == 1 && (!c0604a0.f || c0604a0.f7633e.length == 0)) {
                int iFloor = ((int) Math.floor((c0604a0.f7632d - c0604a0.f7631c) / c0604a0.f7630b)) + 1;
                int[] iArr5 = new int[iFloor];
                for (int i11 = 0; i11 < iFloor; i11++) {
                    iArr5[i11] = Math.round((i11 * c0604a0.f7630b) + c0604a0.f7631c);
                }
                c0604a0.f7633e = C0604a0.a(iArr5);
            }
        }
        Method method = M1.f7533a;
        if (c0604a0.f7629a != 0) {
            int[] iArr6 = c0604a0.f7633e;
            if (iArr6.length > 0) {
                if (T.a(textView) != -1.0f) {
                    T.b(textView, Math.round(c0604a0.f7631c), Math.round(c0604a0.f7632d), Math.round(c0604a0.f7630b), 0);
                } else {
                    T.c(textView, iArr6, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        if (resourceId4 != -1) {
            drawableB = c0651sA.b(context, resourceId4);
            i6 = 13;
        } else {
            i6 = 13;
            drawableB = null;
        }
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(i6, -1);
        Drawable drawableB2 = resourceId5 != -1 ? c0651sA.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? c0651sA.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? c0651sA.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? c0651sA.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? c0651sA.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] drawableArrA = AbstractC0602Q.a(textView);
            if (drawableB5 == null) {
                drawableB5 = drawableArrA[0];
            }
            if (drawableB2 == null) {
                drawableB2 = drawableArrA[1];
            }
            if (drawableB6 == null) {
                drawableB6 = drawableArrA[2];
            }
            if (drawableB4 == null) {
                drawableB4 = drawableArrA[3];
            }
            AbstractC0602Q.b(textView, drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] drawableArrA2 = AbstractC0602Q.a(textView);
            Drawable drawable = drawableArrA2[0];
            if (drawable == null && drawableArrA2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = drawableArrA2[1];
                }
                Drawable drawable2 = drawableArrA2[2];
                if (drawableB4 == null) {
                    drawableB4 = drawableArrA2[3];
                }
                AbstractC0602Q.b(textView, drawable, drawableB2, drawable2, drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = A.r.a(context.getResources(), resourceId, context.getTheme())) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            O.p.f(textView, colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            i7 = -1;
            fontMetricsInt = null;
            O.p.g(textView, AbstractC0622g0.b(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i7 = -1;
            fontMetricsInt = null;
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, i7);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, i7);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, i7);
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i7) {
            g3.y.g(dimensionPixelSize);
            O.q.d(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i7) {
            g3.y.g(dimensionPixelSize2);
            Paint.FontMetricsInt fontMetricsInt2 = textView.getPaint().getFontMetricsInt();
            int i12 = textView.getIncludeFontPadding() ? fontMetricsInt2.bottom : fontMetricsInt2.descent;
            if (dimensionPixelSize2 > Math.abs(i12)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), dimensionPixelSize2 - i12);
            }
            i8 = -1;
        } else {
            i8 = i7;
        }
        if (dimensionPixelSize3 != i8) {
            g3.y.g(dimensionPixelSize3);
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(fontMetricsInt)) {
                textView.setLineSpacing(dimensionPixelSize3 - r0, 1.0f);
            }
        }
    }

    public final void g(Context context, int i5) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i5, AbstractC0220a.f5108A);
        D3.c cVar = new D3.c(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f7560a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        j(context, cVar);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            T.d(textView, string);
        }
        cVar.m();
        Typeface typeface = this.f7570l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f7568j);
        }
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f7566h == null) {
            this.f7566h = new x1();
        }
        x1 x1Var = this.f7566h;
        x1Var.f7859a = colorStateList;
        x1Var.f7862d = colorStateList != null;
        this.f7561b = x1Var;
        this.f7562c = x1Var;
        this.f7563d = x1Var;
        this.f7564e = x1Var;
        this.f = x1Var;
        this.f7565g = x1Var;
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f7566h == null) {
            this.f7566h = new x1();
        }
        x1 x1Var = this.f7566h;
        x1Var.f7860b = mode;
        x1Var.f7861c = mode != null;
        this.f7561b = x1Var;
        this.f7562c = x1Var;
        this.f7563d = x1Var;
        this.f7564e = x1Var;
        this.f = x1Var;
        this.f7565g = x1Var;
    }

    public final void j(Context context, D3.c cVar) {
        String string;
        int i5 = this.f7568j;
        TypedArray typedArray = (TypedArray) cVar.f;
        this.f7568j = typedArray.getInt(2, i5);
        int i6 = typedArray.getInt(11, -1);
        this.f7569k = i6;
        if (i6 != -1) {
            this.f7568j &= 2;
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f7571m = false;
                int i7 = typedArray.getInt(1, 1);
                if (i7 == 1) {
                    this.f7570l = Typeface.SANS_SERIF;
                    return;
                } else if (i7 == 2) {
                    this.f7570l = Typeface.SERIF;
                    return;
                } else {
                    if (i7 != 3) {
                        return;
                    }
                    this.f7570l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f7570l = null;
        int i8 = typedArray.hasValue(12) ? 12 : 10;
        int i9 = this.f7569k;
        int i10 = this.f7568j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceI = cVar.i(i8, this.f7568j, new C0601P(this, i9, i10, new WeakReference(this.f7560a)));
                if (typefaceI != null) {
                    if (this.f7569k != -1) {
                        this.f7570l = U.a(Typeface.create(typefaceI, 0), this.f7569k, (this.f7568j & 2) != 0);
                    } else {
                        this.f7570l = typefaceI;
                    }
                }
                this.f7571m = this.f7570l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f7570l != null || (string = typedArray.getString(i8)) == null) {
            return;
        }
        if (this.f7569k != -1) {
            this.f7570l = U.a(Typeface.create(string, 0), this.f7569k, (this.f7568j & 2) != 0);
        } else {
            this.f7570l = Typeface.create(string, this.f7568j);
        }
    }
}
