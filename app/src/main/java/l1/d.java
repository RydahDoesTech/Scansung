package L1;

import A.r;
import Y0.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import c.AbstractC0220a;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f1719a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1720b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1721c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1722d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1723e;
    public final float f;

    /* renamed from: g, reason: collision with root package name */
    public final float f1724g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1725h;

    /* renamed from: i, reason: collision with root package name */
    public final float f1726i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f1727j;

    /* renamed from: k, reason: collision with root package name */
    public float f1728k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1729l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1730m = false;
    public Typeface n;

    public d(Context context, int i5) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i5, AbstractC0220a.f5108A);
        this.f1728k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f1727j = V1.a.z(context, typedArrayObtainStyledAttributes, 3);
        V1.a.z(context, typedArrayObtainStyledAttributes, 4);
        V1.a.z(context, typedArrayObtainStyledAttributes, 5);
        this.f1721c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f1722d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i6 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f1729l = typedArrayObtainStyledAttributes.getResourceId(i6, 0);
        this.f1720b = typedArrayObtainStyledAttributes.getString(i6);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f1719a = V1.a.z(context, typedArrayObtainStyledAttributes, 6);
        this.f1723e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f1724g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i5, u1.a.f9174s);
        this.f1725h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f1726i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.n;
        int i5 = this.f1721c;
        if (typeface == null && (str = this.f1720b) != null) {
            this.n = Typeface.create(str, i5);
        }
        if (this.n == null) {
            int i6 = this.f1722d;
            if (i6 == 1) {
                this.n = Typeface.SANS_SERIF;
            } else if (i6 == 2) {
                this.n = Typeface.SERIF;
            } else if (i6 != 3) {
                this.n = Typeface.DEFAULT;
            } else {
                this.n = Typeface.MONOSPACE;
            }
            this.n = Typeface.create(this.n, i5);
        }
    }

    public final Typeface b(Context context) {
        if (this.f1730m) {
            return this.n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceB = r.b(context, this.f1729l);
                this.n = typefaceB;
                if (typefaceB != null) {
                    this.n = Typeface.create(typefaceB, this.f1721c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e5) {
                Log.d("TextAppearance", "Error loading font " + this.f1720b, e5);
            }
        }
        a();
        this.f1730m = true;
        return this.n;
    }

    public final void c(Context context, j jVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i5 = this.f1729l;
        if (i5 == 0) {
            this.f1730m = true;
        }
        if (this.f1730m) {
            jVar.F(this.n, true);
            return;
        }
        try {
            b bVar = new b(this, jVar);
            ThreadLocal threadLocal = r.f34a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                r.c(context, i5, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f1730m = true;
            jVar.E(1);
        } catch (Exception e5) {
            Log.d("TextAppearance", "Error loading font " + this.f1720b, e5);
            this.f1730m = true;
            jVar.E(-3);
        }
    }

    public final boolean d(Context context) throws InterruptedException, Resources.NotFoundException {
        Typeface typefaceC = null;
        int i5 = this.f1729l;
        if (i5 != 0) {
            ThreadLocal threadLocal = r.f34a;
            if (!context.isRestricted()) {
                typefaceC = r.c(context, i5, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceC != null;
    }

    public final void e(Context context, TextPaint textPaint, j jVar) {
        f(context, textPaint, jVar);
        ColorStateList colorStateList = this.f1727j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f1719a;
        textPaint.setShadowLayer(this.f1724g, this.f1723e, this.f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, j jVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.n);
        c(context, new c(this, context, textPaint, jVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceK = AbstractC0415a.K(context.getResources().getConfiguration(), typeface);
        if (typefaceK != null) {
            typeface = typefaceK;
        }
        textPaint.setTypeface(typeface);
        int i5 = (~typeface.getStyle()) & this.f1721c;
        textPaint.setFakeBoldText((i5 & 1) != 0);
        textPaint.setTextSkewX((i5 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f1728k);
        if (this.f1725h) {
            textPaint.setLetterSpacing(this.f1726i);
        }
    }
}
