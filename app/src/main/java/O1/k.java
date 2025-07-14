package O1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public V1.a f1961a = new i();

    /* renamed from: b, reason: collision with root package name */
    public V1.a f1962b = new i();

    /* renamed from: c, reason: collision with root package name */
    public V1.a f1963c = new i();

    /* renamed from: d, reason: collision with root package name */
    public V1.a f1964d = new i();

    /* renamed from: e, reason: collision with root package name */
    public c f1965e = new a(0.0f);
    public c f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public c f1966g = new a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public c f1967h = new a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public e f1968i = new e(0);

    /* renamed from: j, reason: collision with root package name */
    public e f1969j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public e f1970k = new e(0);

    /* renamed from: l, reason: collision with root package name */
    public e f1971l = new e(0);

    public static j a(Context context, int i5, int i6, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i5);
        if (i6 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i6);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(u1.a.f9179x);
        try {
            int i7 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i8 = typedArrayObtainStyledAttributes.getInt(3, i7);
            int i9 = typedArrayObtainStyledAttributes.getInt(4, i7);
            int i10 = typedArrayObtainStyledAttributes.getInt(2, i7);
            int i11 = typedArrayObtainStyledAttributes.getInt(1, i7);
            c cVarC = c(typedArrayObtainStyledAttributes, 5, aVar);
            c cVarC2 = c(typedArrayObtainStyledAttributes, 8, cVarC);
            c cVarC3 = c(typedArrayObtainStyledAttributes, 9, cVarC);
            c cVarC4 = c(typedArrayObtainStyledAttributes, 7, cVarC);
            c cVarC5 = c(typedArrayObtainStyledAttributes, 6, cVarC);
            j jVar = new j();
            V1.a aVarR = Y0.j.r(i8);
            jVar.f1950a = aVarR;
            j.b(aVarR);
            jVar.f1954e = cVarC2;
            V1.a aVarR2 = Y0.j.r(i9);
            jVar.f1951b = aVarR2;
            j.b(aVarR2);
            jVar.f = cVarC3;
            V1.a aVarR3 = Y0.j.r(i10);
            jVar.f1952c = aVarR3;
            j.b(aVarR3);
            jVar.f1955g = cVarC4;
            V1.a aVarR4 = Y0.j.r(i11);
            jVar.f1953d = aVarR4;
            j.b(aVarR4);
            jVar.f1956h = cVarC5;
            return jVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i5, int i6) {
        a aVar = new a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u1.a.f9173r, i5, i6);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i5, c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i5);
        if (typedValuePeekValue == null) {
            return cVar;
        }
        int i6 = typedValuePeekValue.type;
        return i6 == 5 ? new a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i6 == 6 ? new h(typedValuePeekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z4 = this.f1971l.getClass().equals(e.class) && this.f1969j.getClass().equals(e.class) && this.f1968i.getClass().equals(e.class) && this.f1970k.getClass().equals(e.class);
        float fA = this.f1965e.a(rectF);
        return z4 && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f1967h.a(rectF) > fA ? 1 : (this.f1967h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f1966g.a(rectF) > fA ? 1 : (this.f1966g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f1962b instanceof i) && (this.f1961a instanceof i) && (this.f1963c instanceof i) && (this.f1964d instanceof i));
    }

    public final j e() {
        j jVar = new j();
        jVar.f1950a = this.f1961a;
        jVar.f1951b = this.f1962b;
        jVar.f1952c = this.f1963c;
        jVar.f1953d = this.f1964d;
        jVar.f1954e = this.f1965e;
        jVar.f = this.f;
        jVar.f1955g = this.f1966g;
        jVar.f1956h = this.f1967h;
        jVar.f1957i = this.f1968i;
        jVar.f1958j = this.f1969j;
        jVar.f1959k = this.f1970k;
        jVar.f1960l = this.f1971l;
        return jVar;
    }
}
