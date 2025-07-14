package k;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.samsung.android.knox.custom.CustomDeviceManager;
import com.wssyncmldm.R;
import d.AbstractC0390a;

/* loaded from: classes.dex */
public final class W0 extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f7574a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f7575b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f7576c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7577d;

    /* renamed from: e, reason: collision with root package name */
    public int f7578e;
    public final ValueAnimator f;

    /* renamed from: g, reason: collision with root package name */
    public final ValueAnimator f7579g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7580h;

    /* renamed from: i, reason: collision with root package name */
    public int f7581i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f7582j;

    /* renamed from: k, reason: collision with root package name */
    public int f7583k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7584l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ X0 f7585m;

    public W0(X0 x02, int i5, ColorStateList colorStateList, boolean z4) {
        this.f7585m = x02;
        Paint paint = new Paint(1);
        this.f7574a = paint;
        Paint paint2 = new Paint(1);
        this.f7575b = paint2;
        this.f7580h = false;
        this.f7581i = CustomDeviceManager.CALL_SCREEN_ALL;
        this.f7582j = false;
        this.f7584l = x02.getContext().getResources().getDimensionPixelSize(R.dimen.sesl_seekbar_thumb_stroke);
        this.f7578e = i5;
        this.f7577d = i5;
        this.f7576c = colorStateList;
        this.f7583k = colorStateList.getDefaultColor();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint.setColor(this.f7583k);
        paint2.setColor(x02.getContext().getResources().getColor(R.color.sesl_thumb_control_fill_color_activated));
        this.f7582j = z4;
        float f = i5;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
        this.f = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(100L);
        this.f.setInterpolator(new LinearInterpolator());
        this.f.addUpdateListener(new V0(this, 0));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, f);
        this.f7579g = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.setDuration(300L);
        this.f7579g.setInterpolator(AbstractC0390a.f6384b);
        this.f7579g.addUpdateListener(new V0(this, 1));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.f7574a;
        int alpha = paint.getAlpha();
        int i5 = this.f7581i;
        paint.setAlpha(((i5 + (i5 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f7575b;
        int i6 = this.f7581i;
        paint2.setAlpha(((i6 + (i6 >>> 7)) * alpha) >>> 8);
        canvas.save();
        boolean z4 = this.f7582j;
        int i7 = this.f7584l;
        X0 x02 = this.f7585m;
        if (z4) {
            float width = ((x02.getWidth() - x02.getPaddingLeft()) - x02.getPaddingRight()) / 2.0f;
            canvas.drawCircle(width, x02.f7587C0 - x02.getPaddingLeft(), this.f7578e, paint);
            canvas.drawCircle(width, x02.f7587C0 - x02.getPaddingLeft(), this.f7578e - i7, paint2);
        } else {
            canvas.drawCircle(x02.f7587C0, x02.getHeight() / 2.0f, this.f7578e, paint);
            canvas.drawCircle(x02.f7587C0, x02.getHeight() / 2.0f, this.f7578e - i7, paint2);
        }
        canvas.restore();
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f7577d * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f7577d * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Paint paint = this.f7574a;
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
        int colorForState = this.f7576c.getColorForState(iArr, this.f7583k);
        if (this.f7583k != colorForState) {
            this.f7583k = colorForState;
            this.f7574a.setColor(colorForState);
            invalidateSelf();
        }
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        for (int i5 : iArr) {
            if (i5 == 16842910) {
                z5 = true;
            } else if (i5 == 16842919) {
                z6 = true;
            }
        }
        if (z5 && z6) {
            z4 = true;
        }
        if (this.f7580h != z4) {
            if (z4) {
                if (!this.f.isRunning()) {
                    if (this.f7579g.isRunning()) {
                        this.f7579g.cancel();
                    }
                    this.f.start();
                }
            } else if (!this.f7579g.isRunning()) {
                if (this.f.isRunning()) {
                    this.f.cancel();
                }
                this.f7579g.start();
            }
            this.f7580h = z4;
        }
        return zOnStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
        this.f7581i = i5;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f7574a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
        if (colorStateList != null) {
            this.f7576c = colorStateList;
            int colorForState = colorStateList.getColorForState(this.f7585m.getDrawableState(), this.f7583k);
            this.f7583k = colorForState;
            this.f7574a.setColor(colorForState);
            invalidateSelf();
        }
    }
}
