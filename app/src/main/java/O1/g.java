package O1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import com.samsung.android.knox.custom.CustomDeviceManager;
import e1.AbstractC0415a;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes.dex */
public class g extends Drawable implements u {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f1930x = 0;

    /* renamed from: d, reason: collision with root package name */
    public f f1931d;

    /* renamed from: e, reason: collision with root package name */
    public final s[] f1932e;
    public final s[] f;

    /* renamed from: g, reason: collision with root package name */
    public final BitSet f1933g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1934h;

    /* renamed from: i, reason: collision with root package name */
    public final Matrix f1935i;

    /* renamed from: j, reason: collision with root package name */
    public final Path f1936j;

    /* renamed from: k, reason: collision with root package name */
    public final Path f1937k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f1938l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f1939m;
    public final Region n;

    /* renamed from: o, reason: collision with root package name */
    public final Region f1940o;

    /* renamed from: p, reason: collision with root package name */
    public k f1941p;

    /* renamed from: q, reason: collision with root package name */
    public final Paint f1942q;

    /* renamed from: r, reason: collision with root package name */
    public final Paint f1943r;

    /* renamed from: s, reason: collision with root package name */
    public final B.g f1944s;

    /* renamed from: t, reason: collision with root package name */
    public final m f1945t;

    /* renamed from: u, reason: collision with root package name */
    public PorterDuffColorFilter f1946u;

    /* renamed from: v, reason: collision with root package name */
    public PorterDuffColorFilter f1947v;

    /* renamed from: w, reason: collision with root package name */
    public final RectF f1948w;

    static {
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f1931d;
        this.f1945t.a(fVar.f1916a, fVar.f1923i, rectF, this.f1944s, path);
        if (this.f1931d.f1922h != 1.0f) {
            Matrix matrix = this.f1935i;
            matrix.reset();
            float f = this.f1931d.f1922h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f1948w, true);
    }

    public final int b(int i5) {
        int i6;
        f fVar = this.f1931d;
        float f = fVar.f1927m + 0.0f + fVar.f1926l;
        H1.a aVar = fVar.f1917b;
        if (aVar == null || !aVar.f809a || B.a.c(i5, CustomDeviceManager.CALL_SCREEN_ALL) != aVar.f812d) {
            return i5;
        }
        float fMin = (aVar.f813e <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i5);
        int I4 = AbstractC0415a.I(B.a.c(i5, CustomDeviceManager.CALL_SCREEN_ALL), fMin, aVar.f810b);
        if (fMin > 0.0f && (i6 = aVar.f811c) != 0) {
            I4 = AbstractC0415a.J(I4, B.a.c(i6, H1.a.f));
        }
        return B.a.c(I4, iAlpha);
    }

    public final void c(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = kVar.f.a(rectF) * this.f1931d.f1923i;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void d(Canvas canvas) {
        Paint paint = this.f1943r;
        Path path = this.f1937k;
        k kVar = this.f1941p;
        RectF rectF = this.f1939m;
        rectF.set(e());
        float strokeWidth = f() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        c(canvas, paint, path, kVar, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f1942q;
        paint.setColorFilter(this.f1946u);
        int alpha = paint.getAlpha();
        int i5 = this.f1931d.f1925k;
        paint.setAlpha(((i5 + (i5 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f1943r;
        paint2.setColorFilter(this.f1947v);
        paint2.setStrokeWidth(this.f1931d.f1924j);
        int alpha2 = paint2.getAlpha();
        int i6 = this.f1931d.f1925k;
        paint2.setAlpha(((i6 + (i6 >>> 7)) * alpha2) >>> 8);
        boolean z4 = this.f1934h;
        Path path = this.f1936j;
        if (z4) {
            float f = -(f() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f1931d.f1916a;
            j jVarE = kVar.e();
            c bVar = kVar.f1965e;
            if (!(bVar instanceof h)) {
                bVar = new b(f, bVar);
            }
            jVarE.f1954e = bVar;
            c bVar2 = kVar.f;
            if (!(bVar2 instanceof h)) {
                bVar2 = new b(f, bVar2);
            }
            jVarE.f = bVar2;
            c bVar3 = kVar.f1967h;
            if (!(bVar3 instanceof h)) {
                bVar3 = new b(f, bVar3);
            }
            jVarE.f1956h = bVar3;
            c bVar4 = kVar.f1966g;
            if (!(bVar4 instanceof h)) {
                bVar4 = new b(f, bVar4);
            }
            jVarE.f1955g = bVar4;
            k kVarA = jVarE.a();
            this.f1941p = kVarA;
            float f5 = this.f1931d.f1923i;
            RectF rectF = this.f1939m;
            rectF.set(e());
            float strokeWidth = f() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f1945t.a(kVarA, f5, rectF, null, this.f1937k);
            a(e(), path);
            this.f1934h = false;
        }
        f fVar = this.f1931d;
        fVar.getClass();
        if (fVar.n > 0 && !this.f1931d.f1916a.d(e())) {
            path.isConvex();
        }
        f fVar2 = this.f1931d;
        Paint.Style style = fVar2.f1929p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            c(canvas, paint, path, fVar2.f1916a, e());
        }
        if (f()) {
            d(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final RectF e() {
        RectF rectF = this.f1938l;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean f() {
        Paint.Style style = this.f1931d.f1929p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f1943r.getStrokeWidth() > 0.0f;
    }

    public final void g(Context context) {
        this.f1931d.f1917b = new H1.a(context);
        l();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1931d.f1925k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f1931d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f1931d.getClass();
        if (this.f1931d.f1916a.d(e())) {
            outline.setRoundRect(getBounds(), this.f1931d.f1916a.f1965e.a(e()) * this.f1931d.f1923i);
        } else {
            RectF rectFE = e();
            Path path = this.f1936j;
            a(rectFE, path);
            outline.setPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f1931d.f1921g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.n;
        region.set(bounds);
        RectF rectFE = e();
        Path path = this.f1936j;
        a(rectFE, path);
        Region region2 = this.f1940o;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(float f) {
        f fVar = this.f1931d;
        if (fVar.f1927m != f) {
            fVar.f1927m = f;
            l();
        }
    }

    public final void i(ColorStateList colorStateList) {
        f fVar = this.f1931d;
        if (fVar.f1918c != colorStateList) {
            fVar.f1918c = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f1934h = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f1931d.f1920e) == null || !colorStateList.isStateful())) {
            this.f1931d.getClass();
            ColorStateList colorStateList3 = this.f1931d.f1919d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f1931d.f1918c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(int[] iArr) {
        boolean z4;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f1931d.f1918c == null || color2 == (colorForState2 = this.f1931d.f1918c.getColorForState(iArr, (color2 = (paint2 = this.f1942q).getColor())))) {
            z4 = false;
        } else {
            paint2.setColor(colorForState2);
            z4 = true;
        }
        if (this.f1931d.f1919d == null || color == (colorForState = this.f1931d.f1919d.getColorForState(iArr, (color = (paint = this.f1943r).getColor())))) {
            return z4;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean k() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f1946u;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f1947v;
        f fVar = this.f1931d;
        ColorStateList colorStateList = fVar.f1920e;
        PorterDuff.Mode mode = fVar.f;
        Paint paint = this.f1942q;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int iB = b(color);
            porterDuffColorFilter = iB != color ? new PorterDuffColorFilter(iB, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f1946u = porterDuffColorFilter;
        this.f1931d.getClass();
        this.f1947v = null;
        this.f1931d.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f1946u) && Objects.equals(porterDuffColorFilter3, this.f1947v)) ? false : true;
    }

    public final void l() {
        f fVar = this.f1931d;
        float f = fVar.f1927m + 0.0f;
        fVar.n = (int) Math.ceil(0.75f * f);
        this.f1931d.f1928o = (int) Math.ceil(f * 0.25f);
        k();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f1931d = new f(this.f1931d);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f1934h = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z4 = j(iArr) || k();
        if (z4) {
            invalidateSelf();
        }
        return z4;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        f fVar = this.f1931d;
        if (fVar.f1925k != i5) {
            fVar.f1925k = i5;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1931d.getClass();
        super.invalidateSelf();
    }

    @Override // O1.u
    public final void setShapeAppearanceModel(k kVar) {
        this.f1931d.f1916a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i5) {
        setTintList(ColorStateList.valueOf(i5));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1931d.f1920e = colorStateList;
        k();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f1931d;
        if (fVar.f != mode) {
            fVar.f = mode;
            k();
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i5, int i6) {
        this(k.b(context, attributeSet, i5, i6).a());
    }

    public g(k kVar) {
        this(new f(kVar));
    }

    public g(f fVar) {
        m mVar;
        this.f1932e = new s[4];
        this.f = new s[4];
        this.f1933g = new BitSet(8);
        this.f1935i = new Matrix();
        this.f1936j = new Path();
        this.f1937k = new Path();
        this.f1938l = new RectF();
        this.f1939m = new RectF();
        this.n = new Region();
        this.f1940o = new Region();
        Paint paint = new Paint(1);
        this.f1942q = paint;
        Paint paint2 = new Paint(1);
        this.f1943r = paint2;
        new N1.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f1972a;
        } else {
            mVar = new m();
        }
        this.f1945t = mVar;
        this.f1948w = new RectF();
        this.f1931d = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        k();
        j(getState());
        this.f1944s = new B.g(15, this);
    }
}
