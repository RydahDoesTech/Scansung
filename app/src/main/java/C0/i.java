package C0;

import android.graphics.Paint;

/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: d, reason: collision with root package name */
    public A.d f282d;

    /* renamed from: e, reason: collision with root package name */
    public float f283e;
    public A.d f;

    /* renamed from: g, reason: collision with root package name */
    public float f284g;

    /* renamed from: h, reason: collision with root package name */
    public float f285h;

    /* renamed from: i, reason: collision with root package name */
    public float f286i;

    /* renamed from: j, reason: collision with root package name */
    public float f287j;

    /* renamed from: k, reason: collision with root package name */
    public float f288k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f289l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f290m;
    public float n;

    @Override // C0.k
    public final boolean a() {
        return this.f.g() || this.f282d.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // C0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int[] r6) {
        /*
            r5 = this;
            A.d r0 = r5.f
            boolean r1 = r0.g()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f12c
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r6, r4)
            int r4 = r0.f10a
            if (r1 == r4) goto L1e
            r0.f10a = r1
            r0 = r3
            goto L1f
        L1e:
            r0 = r2
        L1f:
            A.d r5 = r5.f282d
            boolean r1 = r5.g()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r5.f12c
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r6 = r1.getColorForState(r6, r4)
            int r1 = r5.f10a
            if (r6 == r1) goto L3a
            r5.f10a = r6
            r2 = r3
        L3a:
            r5 = r0 | r2
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.i.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f285h;
    }

    public int getFillColor() {
        return this.f.f10a;
    }

    public float getStrokeAlpha() {
        return this.f284g;
    }

    public int getStrokeColor() {
        return this.f282d.f10a;
    }

    public float getStrokeWidth() {
        return this.f283e;
    }

    public float getTrimPathEnd() {
        return this.f287j;
    }

    public float getTrimPathOffset() {
        return this.f288k;
    }

    public float getTrimPathStart() {
        return this.f286i;
    }

    public void setFillAlpha(float f) {
        this.f285h = f;
    }

    public void setFillColor(int i5) {
        this.f.f10a = i5;
    }

    public void setStrokeAlpha(float f) {
        this.f284g = f;
    }

    public void setStrokeColor(int i5) {
        this.f282d.f10a = i5;
    }

    public void setStrokeWidth(float f) {
        this.f283e = f;
    }

    public void setTrimPathEnd(float f) {
        this.f287j = f;
    }

    public void setTrimPathOffset(float f) {
        this.f288k = f;
    }

    public void setTrimPathStart(float f) {
        this.f286i = f;
    }
}
