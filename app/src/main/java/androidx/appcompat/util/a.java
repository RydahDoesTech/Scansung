package androidx.appcompat.util;

import B.f;
import Y0.j;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f3187a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3188b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3189c;

    /* renamed from: d, reason: collision with root package name */
    public ColorFilter f3190d;

    /* renamed from: e, reason: collision with root package name */
    public int f3191e = 0;
    public int f = 0;

    /* renamed from: g, reason: collision with root package name */
    public f[] f3192g = null;

    /* renamed from: h, reason: collision with root package name */
    public final Path f3193h = new Path();

    public a(int i5, Paint paint, float f) {
        this.f3188b = i5;
        this.f3187a = paint;
        this.f3189c = f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z4;
        Path path;
        if (this.f3191e == canvas.getWidth() && this.f == canvas.getHeight()) {
            z4 = false;
        } else {
            this.f3191e = canvas.getWidth();
            this.f = canvas.getHeight();
            z4 = true;
        }
        ColorFilter colorFilter = this.f3190d;
        Paint paint = this.f3187a;
        paint.setColorFilter(colorFilter);
        float f = this.f3188b;
        int i5 = this.f3191e;
        int i6 = this.f;
        if (i5 <= 0 || i6 <= 0) {
            path = new Path();
        } else {
            float f5 = i5 / 2.0f;
            float f6 = i6 / 2.0f;
            float fMin = Math.min(f5, f6);
            float fMin2 = Math.min(Math.max(f, 0.0f), fMin);
            float f7 = fMin2 / fMin;
            float fMin3 = f7 > 0.5f ? 1.0f - (Math.min(1.0f, (f7 - 0.5f) / 0.4f) * 0.13877845f) : 1.0f;
            float fMin4 = ((double) f7) > 0.6d ? 1.0f + (Math.min(1.0f, (f7 - 0.6f) / 0.3f) * 0.042454004f) : 1.0f;
            if (z4 || this.f3192g == null) {
                float f8 = (f5 / fMin2) * 100.0f;
                Locale locale = Locale.ENGLISH;
                float f9 = fMin3 * 128.19f;
                float f10 = fMin4 * 83.62f;
                this.f3192g = j.s("M 0 0 " + String.format(locale, "L %f %f ", Float.valueOf(0.0f), Float.valueOf(Math.min((f6 / fMin2) * 100.0f, f9))) + String.format(locale, "C %f %f %f %f %f %f ", Float.valueOf(0.0f), Float.valueOf(f10), Float.valueOf(4.64f), Float.valueOf(67.45f), Float.valueOf(13.36f), Float.valueOf(51.16f)) + String.format(locale, "C %f %f %f %f %f %f ", Float.valueOf(22.07f), Float.valueOf(34.86f), Float.valueOf(34.86f), Float.valueOf(22.07f), Float.valueOf(51.16f), Float.valueOf(13.36f)) + String.format(locale, "C %f %f %f %f %f %f ", Float.valueOf(67.45f), Float.valueOf(4.64f), Float.valueOf(f10), Float.valueOf(0.0f), Float.valueOf(Math.min(f8, f9)), Float.valueOf(0.0f)) + String.format(locale, "L %f %f ", Float.valueOf(Math.min(f8, f9)), Float.valueOf(0.0f)) + "Z");
            }
            path = this.f3193h;
            path.reset();
            f.b(this.f3192g, path);
            Matrix matrix = new Matrix();
            float f11 = fMin2 / 100.0f;
            matrix.setScale(f11, f11);
            path.transform(matrix);
            Rect bounds = getBounds();
            Matrix matrix2 = new Matrix();
            matrix2.setRotate(this.f3189c, bounds.width() / 2.0f, bounds.height() / 2.0f);
            path.transform(matrix2);
            Matrix matrix3 = new Matrix();
            matrix3.setTranslate(bounds.left, bounds.top);
            path.transform(matrix3);
        }
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f3190d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
        this.f3187a.setAlpha(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3190d = colorFilter;
    }
}
