package R1;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class g extends O1.g {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f2381z = 0;

    /* renamed from: y, reason: collision with root package name */
    public f f2382y;

    @Override // O1.g
    public final void d(Canvas canvas) {
        if (this.f2382y.f2380q.isEmpty()) {
            super.d(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f2382y.f2380q);
        super.d(canvas);
        canvas.restore();
    }

    public final void m(float f, float f5, float f6, float f7) {
        RectF rectF = this.f2382y.f2380q;
        if (f == rectF.left && f5 == rectF.top && f6 == rectF.right && f7 == rectF.bottom) {
            return;
        }
        rectF.set(f, f5, f6, f7);
        invalidateSelf();
    }

    @Override // O1.g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f2382y = new f(this.f2382y);
        return this;
    }
}
