package C0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import e1.AbstractC0415a;
import java.io.IOException;
import java.util.ArrayDeque;
import o.C0704b;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class p extends g {

    /* renamed from: m, reason: collision with root package name */
    public static final PorterDuff.Mode f330m = PorterDuff.Mode.SRC_IN;

    /* renamed from: e, reason: collision with root package name */
    public n f331e;
    public PorterDuffColorFilter f;

    /* renamed from: g, reason: collision with root package name */
    public ColorFilter f332g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f333h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f334i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f335j;

    /* renamed from: k, reason: collision with root package name */
    public final Matrix f336k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f337l;

    public p() {
        this.f334i = true;
        this.f335j = new float[9];
        this.f336k = new Matrix();
        this.f337l = new Rect();
        n nVar = new n();
        nVar.f320c = null;
        nVar.f321d = f330m;
        nVar.f319b = new m();
        this.f331e = nVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f281d;
        if (drawable == null) {
            return false;
        }
        C.a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f281d;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f337l;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f332g;
        if (colorFilter == null) {
            colorFilter = this.f;
        }
        Matrix matrix = this.f336k;
        canvas.getMatrix(matrix);
        float[] fArr = this.f335j;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && C.b.a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        n nVar = this.f331e;
        Bitmap bitmap = nVar.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != nVar.f.getHeight()) {
            nVar.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            nVar.f327k = true;
        }
        if (this.f334i) {
            n nVar2 = this.f331e;
            if (nVar2.f327k || nVar2.f323g != nVar2.f320c || nVar2.f324h != nVar2.f321d || nVar2.f326j != nVar2.f322e || nVar2.f325i != nVar2.f319b.getRootAlpha()) {
                n nVar3 = this.f331e;
                nVar3.f.eraseColor(0);
                Canvas canvas2 = new Canvas(nVar3.f);
                m mVar = nVar3.f319b;
                mVar.a(mVar.f310g, m.f304p, canvas2, iMin, iMin2);
                n nVar4 = this.f331e;
                nVar4.f323g = nVar4.f320c;
                nVar4.f324h = nVar4.f321d;
                nVar4.f325i = nVar4.f319b.getRootAlpha();
                nVar4.f326j = nVar4.f322e;
                nVar4.f327k = false;
            }
        } else {
            n nVar5 = this.f331e;
            nVar5.f.eraseColor(0);
            Canvas canvas3 = new Canvas(nVar5.f);
            m mVar2 = nVar5.f319b;
            mVar2.a(mVar2.f310g, m.f304p, canvas3, iMin, iMin2);
        }
        n nVar6 = this.f331e;
        if (nVar6.f319b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (nVar6.f328l == null) {
                Paint paint2 = new Paint();
                nVar6.f328l = paint2;
                paint2.setFilterBitmap(true);
            }
            nVar6.f328l.setAlpha(nVar6.f319b.getRootAlpha());
            nVar6.f328l.setColorFilter(colorFilter);
            paint = nVar6.f328l;
        }
        canvas.drawBitmap(nVar6.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f281d;
        return drawable != null ? drawable.getAlpha() : this.f331e.f319b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.f331e.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f281d;
        return drawable != null ? C.a.c(drawable) : this.f332g;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f281d != null) {
            return new o(this.f281d.getConstantState());
        }
        this.f331e.f318a = getChangingConfigurations();
        return this.f331e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f281d;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f331e.f319b.f312i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f281d;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f331e.f319b.f311h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f281d;
        return drawable != null ? drawable.isAutoMirrored() : this.f331e.f322e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f281d;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            n nVar = this.f331e;
            if (nVar != null) {
                m mVar = nVar.f319b;
                if (mVar.n == null) {
                    mVar.n = Boolean.valueOf(mVar.f310g.a());
                }
                if (mVar.n.booleanValue() || ((colorStateList = this.f331e.f320c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f333h && super.mutate() == this) {
            n nVar = this.f331e;
            n nVar2 = new n();
            nVar2.f320c = null;
            nVar2.f321d = f330m;
            if (nVar != null) {
                nVar2.f318a = nVar.f318a;
                m mVar = new m(nVar.f319b);
                nVar2.f319b = mVar;
                if (nVar.f319b.f309e != null) {
                    mVar.f309e = new Paint(nVar.f319b.f309e);
                }
                if (nVar.f319b.f308d != null) {
                    nVar2.f319b.f308d = new Paint(nVar.f319b.f308d);
                }
                nVar2.f320c = nVar.f320c;
                nVar2.f321d = nVar.f321d;
                nVar2.f322e = nVar.f322e;
            }
            this.f331e = nVar2;
            this.f333h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z4;
        PorterDuff.Mode mode;
        Drawable drawable = this.f281d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f331e;
        ColorStateList colorStateList = nVar.f320c;
        if (colorStateList == null || (mode = nVar.f321d) == null) {
            z4 = false;
        } else {
            this.f = a(colorStateList, mode);
            invalidateSelf();
            z4 = true;
        }
        m mVar = nVar.f319b;
        if (mVar.n == null) {
            mVar.n = Boolean.valueOf(mVar.f310g.a());
        }
        if (mVar.n.booleanValue()) {
            boolean zB = nVar.f319b.f310g.b(iArr);
            nVar.f327k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z4;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j5) {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j5);
        } else {
            super.scheduleSelf(runnable, j5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            drawable.setAlpha(i5);
        } else if (this.f331e.f319b.getRootAlpha() != i5) {
            this.f331e.f319b.setRootAlpha(i5);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z4) {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            drawable.setAutoMirrored(z4);
        } else {
            this.f331e.f322e = z4;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f332g = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i5) {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            AbstractC0415a.V(drawable, i5);
        } else {
            setTintList(ColorStateList.valueOf(i5));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            C.a.h(drawable, colorStateList);
            return;
        }
        n nVar = this.f331e;
        if (nVar.f320c != colorStateList) {
            nVar.f320c = colorStateList;
            this.f = a(colorStateList, nVar.f321d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            C.a.i(drawable, mode);
            return;
        }
        n nVar = this.f331e;
        if (nVar.f321d != mode) {
            nVar.f321d = mode;
            this.f = a(nVar.f320c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z5) {
        Drawable drawable = this.f281d;
        return drawable != null ? drawable.setVisible(z4, z5) : super.setVisible(z4, z5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f281d;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        m mVar;
        int i5;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.f281d;
        if (drawable != null) {
            C.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f331e;
        nVar.f319b = new m();
        TypedArray typedArrayG = A.b.g(resources, theme, attributeSet, a.f264a);
        n nVar2 = this.f331e;
        m mVar2 = nVar2.f319b;
        int i8 = !A.b.d(xmlPullParser, "tintMode") ? -1 : typedArrayG.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i9 = 3;
        if (i8 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i8 != 5) {
            if (i8 != 9) {
                switch (i8) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        nVar2.f321d = mode;
        int i10 = 1;
        ColorStateList colorStateListA = null;
        boolean z6 = false;
        if (A.b.d(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArrayG.getValue(1, typedValue);
            int i11 = typedValue.type;
            if (i11 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i11 >= 28 && i11 <= 31) {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayG.getResources();
                int resourceId = typedArrayG.getResourceId(1, 0);
                ThreadLocal threadLocal = A.c.f9a;
                try {
                    colorStateListA = A.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e5) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e5);
                }
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            nVar2.f320c = colorStateList;
        }
        boolean z7 = nVar2.f322e;
        if (A.b.d(xmlPullParser, "autoMirrored")) {
            z7 = typedArrayG.getBoolean(5, z7);
        }
        nVar2.f322e = z7;
        float f = mVar2.f313j;
        if (A.b.d(xmlPullParser, "viewportWidth")) {
            f = typedArrayG.getFloat(7, f);
        }
        mVar2.f313j = f;
        float f5 = mVar2.f314k;
        if (A.b.d(xmlPullParser, "viewportHeight")) {
            f5 = typedArrayG.getFloat(8, f5);
        }
        mVar2.f314k = f5;
        if (mVar2.f313j <= 0.0f) {
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f5 > 0.0f) {
            mVar2.f311h = typedArrayG.getDimension(3, mVar2.f311h);
            float dimension = typedArrayG.getDimension(2, mVar2.f312i);
            mVar2.f312i = dimension;
            if (mVar2.f311h <= 0.0f) {
                throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = mVar2.getAlpha();
                if (A.b.d(xmlPullParser, "alpha")) {
                    alpha = typedArrayG.getFloat(4, alpha);
                }
                mVar2.setAlpha(alpha);
                String string = typedArrayG.getString(0);
                if (string != null) {
                    mVar2.f316m = string;
                    mVar2.f317o.put(string, mVar2);
                }
                typedArrayG.recycle();
                nVar.f318a = getChangingConfigurations();
                nVar.f327k = true;
                n nVar3 = this.f331e;
                m mVar3 = nVar3.f319b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(mVar3.f310g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z8 = true;
                while (eventType != i10 && (xmlPullParser.getDepth() >= depth || eventType != i9)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        j jVar = (j) arrayDeque.peek();
                        boolean zEquals = "path".equals(name);
                        i5 = depth;
                        C0704b c0704b = mVar3.f317o;
                        if (zEquals) {
                            i iVar = new i();
                            iVar.f283e = 0.0f;
                            iVar.f284g = 1.0f;
                            iVar.f285h = 1.0f;
                            iVar.f286i = 0.0f;
                            iVar.f287j = 1.0f;
                            iVar.f288k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            iVar.f289l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            iVar.f290m = join3;
                            mVar = mVar3;
                            iVar.n = 4.0f;
                            TypedArray typedArrayG2 = A.b.g(resources, theme, attributeSet, a.f266c);
                            if (A.b.d(xmlPullParser, "pathData")) {
                                String string2 = typedArrayG2.getString(0);
                                if (string2 != null) {
                                    iVar.f302b = string2;
                                }
                                String string3 = typedArrayG2.getString(2);
                                if (string3 != null) {
                                    iVar.f301a = Y0.j.s(string3);
                                }
                                iVar.f = A.b.c(typedArrayG2, xmlPullParser, theme, "fillColor", 1);
                                float f6 = iVar.f285h;
                                if (A.b.d(xmlPullParser, "fillAlpha")) {
                                    f6 = typedArrayG2.getFloat(12, f6);
                                }
                                iVar.f285h = f6;
                                int i12 = !A.b.d(xmlPullParser, "strokeLineCap") ? -1 : typedArrayG2.getInt(8, -1);
                                Paint.Cap cap3 = iVar.f289l;
                                if (i12 != 0) {
                                    join = join3;
                                    if (i12 != 1) {
                                        cap = i12 != 2 ? cap3 : Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.ROUND;
                                    }
                                } else {
                                    join = join3;
                                    cap = cap2;
                                }
                                iVar.f289l = cap;
                                int i13 = !A.b.d(xmlPullParser, "strokeLineJoin") ? -1 : typedArrayG2.getInt(9, -1);
                                Paint.Join join4 = iVar.f290m;
                                if (i13 == 0) {
                                    join2 = join;
                                } else if (i13 != 1) {
                                    join2 = i13 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                iVar.f290m = join2;
                                float f7 = iVar.n;
                                if (A.b.d(xmlPullParser, "strokeMiterLimit")) {
                                    f7 = typedArrayG2.getFloat(10, f7);
                                }
                                iVar.n = f7;
                                iVar.f282d = A.b.c(typedArrayG2, xmlPullParser, theme, "strokeColor", 3);
                                float f8 = iVar.f284g;
                                if (A.b.d(xmlPullParser, "strokeAlpha")) {
                                    f8 = typedArrayG2.getFloat(11, f8);
                                }
                                iVar.f284g = f8;
                                float f9 = iVar.f283e;
                                if (A.b.d(xmlPullParser, "strokeWidth")) {
                                    f9 = typedArrayG2.getFloat(4, f9);
                                }
                                iVar.f283e = f9;
                                float f10 = iVar.f287j;
                                if (A.b.d(xmlPullParser, "trimPathEnd")) {
                                    f10 = typedArrayG2.getFloat(6, f10);
                                }
                                iVar.f287j = f10;
                                float f11 = iVar.f288k;
                                if (A.b.d(xmlPullParser, "trimPathOffset")) {
                                    f11 = typedArrayG2.getFloat(7, f11);
                                }
                                iVar.f288k = f11;
                                float f12 = iVar.f286i;
                                if (A.b.d(xmlPullParser, "trimPathStart")) {
                                    f12 = typedArrayG2.getFloat(5, f12);
                                }
                                iVar.f286i = f12;
                                int i14 = iVar.f303c;
                                if (A.b.d(xmlPullParser, "fillType")) {
                                    i14 = typedArrayG2.getInt(13, i14);
                                }
                                iVar.f303c = i14;
                            }
                            typedArrayG2.recycle();
                            jVar.f292b.add(iVar);
                            if (iVar.getPathName() != null) {
                                c0704b.put(iVar.getPathName(), iVar);
                            }
                            nVar3.f318a = nVar3.f318a;
                            z5 = false;
                            i6 = 1;
                            z8 = false;
                        } else {
                            mVar = mVar3;
                            if ("clip-path".equals(name)) {
                                h hVar = new h();
                                if (A.b.d(xmlPullParser, "pathData")) {
                                    TypedArray typedArrayG3 = A.b.g(resources, theme, attributeSet, a.f267d);
                                    String string4 = typedArrayG3.getString(0);
                                    if (string4 != null) {
                                        hVar.f302b = string4;
                                    }
                                    String string5 = typedArrayG3.getString(1);
                                    if (string5 != null) {
                                        hVar.f301a = Y0.j.s(string5);
                                    }
                                    hVar.f303c = !A.b.d(xmlPullParser, "fillType") ? 0 : typedArrayG3.getInt(2, 0);
                                    typedArrayG3.recycle();
                                }
                                jVar.f292b.add(hVar);
                                if (hVar.getPathName() != null) {
                                    c0704b.put(hVar.getPathName(), hVar);
                                }
                                nVar3.f318a = nVar3.f318a;
                            } else if ("group".equals(name)) {
                                j jVar2 = new j();
                                TypedArray typedArrayG4 = A.b.g(resources, theme, attributeSet, a.f265b);
                                float f13 = jVar2.f293c;
                                if (A.b.d(xmlPullParser, "rotation")) {
                                    f13 = typedArrayG4.getFloat(5, f13);
                                }
                                jVar2.f293c = f13;
                                i6 = 1;
                                jVar2.f294d = typedArrayG4.getFloat(1, jVar2.f294d);
                                jVar2.f295e = typedArrayG4.getFloat(2, jVar2.f295e);
                                float f14 = jVar2.f;
                                if (A.b.d(xmlPullParser, "scaleX")) {
                                    f14 = typedArrayG4.getFloat(3, f14);
                                }
                                jVar2.f = f14;
                                float f15 = jVar2.f296g;
                                if (A.b.d(xmlPullParser, "scaleY")) {
                                    f15 = typedArrayG4.getFloat(4, f15);
                                }
                                jVar2.f296g = f15;
                                float f16 = jVar2.f297h;
                                if (A.b.d(xmlPullParser, "translateX")) {
                                    f16 = typedArrayG4.getFloat(6, f16);
                                }
                                jVar2.f297h = f16;
                                float f17 = jVar2.f298i;
                                if (A.b.d(xmlPullParser, "translateY")) {
                                    f17 = typedArrayG4.getFloat(7, f17);
                                }
                                jVar2.f298i = f17;
                                z5 = false;
                                String string6 = typedArrayG4.getString(0);
                                if (string6 != null) {
                                    jVar2.f300k = string6;
                                }
                                jVar2.c();
                                typedArrayG4.recycle();
                                jVar.f292b.add(jVar2);
                                arrayDeque.push(jVar2);
                                if (jVar2.getGroupName() != null) {
                                    c0704b.put(jVar2.getGroupName(), jVar2);
                                }
                                nVar3.f318a = nVar3.f318a;
                            }
                            z5 = false;
                            i6 = 1;
                        }
                        z4 = z5;
                        i7 = 3;
                    } else {
                        mVar = mVar3;
                        i5 = depth;
                        i6 = i10;
                        z4 = z6;
                        i7 = 3;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i9 = i7;
                    z6 = z4;
                    i10 = i6;
                    depth = i5;
                    mVar3 = mVar;
                }
                if (!z8) {
                    this.f = a(nVar.f320c, nVar.f321d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public p(n nVar) {
        this.f334i = true;
        this.f335j = new float[9];
        this.f336k = new Matrix();
        this.f337l = new Rect();
        this.f331e = nVar;
        this.f = a(nVar.f320c, nVar.f321d);
    }
}
