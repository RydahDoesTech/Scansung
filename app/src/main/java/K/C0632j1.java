package k;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.SeslProgressBar;
import com.samsung.android.knox.custom.CustomDeviceManager;

/* renamed from: k.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0632j1 extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f7680a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f7681b;

    /* renamed from: c, reason: collision with root package name */
    public int f7682c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7683d;

    /* renamed from: e, reason: collision with root package name */
    public int f7684e;
    public final RectF f;

    /* renamed from: g, reason: collision with root package name */
    public int f7685g;

    /* renamed from: h, reason: collision with root package name */
    public final C0.e f7686h;

    /* renamed from: i, reason: collision with root package name */
    public final C0629i1 f7687i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SeslProgressBar f7688j;

    public C0632j1(SeslProgressBar seslProgressBar, boolean z4, ColorStateList colorStateList) {
        this.f7688j = seslProgressBar;
        Paint paint = new Paint();
        this.f7680a = paint;
        this.f7682c = CustomDeviceManager.CALL_SCREEN_ALL;
        this.f = new RectF();
        this.f7686h = new C0.e(this, 2);
        this.f7687i = new C0629i1(this);
        this.f7683d = z4;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f7681b = colorStateList;
        int defaultColor = colorStateList.getDefaultColor();
        this.f7685g = defaultColor;
        paint.setColor(defaultColor);
        this.f7684e = 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.f7680a;
        SeslProgressBar seslProgressBar = this.f7688j;
        paint.setStrokeWidth(seslProgressBar.f);
        int alpha = paint.getAlpha();
        int i5 = this.f7682c;
        paint.setAlpha(((i5 + (i5 >>> 7)) * alpha) >>> 8);
        paint.setAntiAlias(true);
        RectF rectF = this.f;
        float f = (seslProgressBar.f / 2.0f) + seslProgressBar.f3406g;
        rectF.set(f, f, (seslProgressBar.getWidth() - (seslProgressBar.f / 2.0f)) - seslProgressBar.f3406g, (seslProgressBar.getWidth() - (seslProgressBar.f / 2.0f)) - seslProgressBar.f3406g);
        int i6 = seslProgressBar.f3421w - seslProgressBar.f3419u;
        float f5 = i6 > 0 ? (this.f7684e - r0) / i6 : 0.0f;
        canvas.save();
        if (this.f7683d) {
            canvas.drawArc(rectF, 270.0f, 360.0f, false, paint);
        } else {
            canvas.drawArc(rectF, 270.0f, f5 * 360.0f, false, paint);
        }
        canvas.restore();
        paint.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f7686h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Paint paint = this.f7680a;
        if (paint.getXfermode() != null) {
            return -3;
        }
        int alpha = paint.getAlpha();
        if (alpha == 0) {
            return -2;
        }
        return alpha == 255 ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int colorForState = this.f7681b.getColorForState(iArr, this.f7685g);
        if (this.f7685g != colorForState) {
            this.f7685g = colorForState;
            this.f7680a.setColor(colorForState);
            invalidateSelf();
        }
        return zOnStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
        this.f7682c = i5;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f7680a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
        if (colorStateList != null) {
            this.f7681b = colorStateList;
            int defaultColor = colorStateList.getDefaultColor();
            this.f7685g = defaultColor;
            this.f7680a.setColor(defaultColor);
            invalidateSelf();
        }
    }
}
