package A;

import J.M;
import J.P;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import c.AbstractC0220a;
import e1.AbstractC0415a;
import java.util.Locale;
import java.util.WeakHashMap;
import k.AbstractC0622g0;
import k.C0651s;
import k.x1;
import m2.C0686b;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f10a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11b;

    /* renamed from: c, reason: collision with root package name */
    public Object f12c;

    public d(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append(']');
            sb.append(' ');
            string = sb.toString();
        }
        this.f12c = string;
        this.f11b = str;
        boolean z4 = str.length() <= 23;
        Object[] objArr = {str, 23};
        if (!z4) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        int i5 = 2;
        while (7 >= i5 && !Log.isLoggable((String) this.f11b, i5)) {
            i5++;
        }
        this.f10a = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f1, code lost:
    
        if (r5 == 1) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f3, code lost:
    
        if (r5 == 2) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f5, code lost:
    
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f7, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fa, code lost:
    
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fd, code lost:
    
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0200, code lost:
    
        r1 = 0;
        r3 = new android.graphics.LinearGradient(r11, r27, r26, r25, r0.f23a, r0.f24b, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0212, code lost:
    
        r1 = 0;
        r3 = new android.graphics.SweepGradient(r22, r23, r0.f23a, r0.f24b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0221, code lost:
    
        r9 = r22;
        r15 = r23;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0229, code lost:
    
        if (r24 <= 0.0f) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x022e, code lost:
    
        if (r5 == 1) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0231, code lost:
    
        if (r5 == 2) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0233, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0238, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x023b, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x023e, code lost:
    
        r3 = new android.graphics.RadialGradient(r9, r15, r24, r0.f23a, r0.f24b, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0257, code lost:
    
        return new A.d(r3, null, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x025f, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01cf, code lost:
    
        if (r14.size() <= 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d1, code lost:
    
        r0 = new A.j(r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d7, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d8, code lost:
    
        if (r0 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dc, code lost:
    
        if (r19 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01de, code lost:
    
        r0 = new A.j(r6, r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e4, code lost:
    
        r0 = new A.j(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ea, code lost:
    
        if (r8 == 1) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ed, code lost:
    
        if (r8 == 2) goto L107;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static A.d c(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A.d.c(android.content.res.Resources, int, android.content.res.Resources$Theme):A.d");
    }

    public void a() {
        x1 x1Var;
        ImageView imageView = (ImageView) this.f11b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            Rect rect = AbstractC0622g0.f7667a;
        }
        if (drawable == null || (x1Var = (x1) this.f12c) == null) {
            return;
        }
        C0651s.d(drawable, x1Var, imageView.getDrawableState());
    }

    public C0686b b() {
        if (!"".isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(""));
        }
        return new C0686b(((Long) this.f12c).longValue(), this.f10a, (String) this.f11b);
    }

    public void d(String str, Exception exc, Object... objArr) {
        Log.e((String) this.f11b, f(str, objArr), exc);
    }

    public void e(String str, Object... objArr) {
        Log.e((String) this.f11b, f(str, objArr));
    }

    public String f(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return ((String) this.f12c).concat(str);
    }

    public boolean g() {
        ColorStateList colorStateList;
        return ((Shader) this.f11b) == null && (colorStateList = (ColorStateList) this.f12c) != null && colorStateList.isStateful();
    }

    public void h(AttributeSet attributeSet, int i5) {
        int resourceId;
        ImageView imageView = (ImageView) this.f11b;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0220a.f;
        D3.c cVarL = D3.c.l(context, attributeSet, iArr, i5);
        Context context2 = imageView.getContext();
        WeakHashMap weakHashMap = P.f1421a;
        M.d(imageView, context2, iArr, attributeSet, (TypedArray) cVarL.f, i5, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) cVarL.f;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0415a.r(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                Rect rect = AbstractC0622g0.f7667a;
            }
            if (typedArray.hasValue(2)) {
                O.f.c(imageView, cVarL.f(2));
            }
            if (typedArray.hasValue(3)) {
                O.f.d(imageView, AbstractC0622g0.b(typedArray.getInt(3, -1), null));
            }
            cVarL.m();
        } catch (Throwable th) {
            cVarL.m();
            throw th;
        }
    }

    public void i(String str, Object... objArr) {
        if (this.f10a <= 2) {
            Log.v((String) this.f11b, f(str, objArr));
        }
    }

    public d(ImageView imageView) {
        this.f10a = 0;
        this.f11b = imageView;
    }

    public d(Shader shader, ColorStateList colorStateList, int i5) {
        this.f11b = shader;
        this.f12c = colorStateList;
        this.f10a = i5;
    }
}
