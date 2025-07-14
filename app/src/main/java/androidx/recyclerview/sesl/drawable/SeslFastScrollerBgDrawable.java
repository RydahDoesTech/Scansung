package androidx.recyclerview.sesl.drawable;

import B.a;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import b3.AbstractC0219i;
import com.samsung.android.knox.custom.CustomDeviceManager;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/recyclerview/sesl/drawable/SeslFastScrollerBgDrawable;", "Landroid/graphics/drawable/Drawable;", "", "", "<init>", "()V", "recyclerview_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SeslFastScrollerBgDrawable extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f4696a;

    public SeslFastScrollerBgDrawable() {
        Paint paint = new Paint(1);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAlpha(8);
        paint.setColor(a.c(-16777216, CustomDeviceManager.CALL_SCREEN_ALL));
        this.f4696a = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC0219i.e("canvas", canvas);
        Paint paint = this.f4696a;
        paint.setStrokeWidth(0.0f);
        float f = 2;
        canvas.drawLine(canvas.getWidth() / f, paint.getStrokeWidth() / f, canvas.getWidth() / f, canvas.getHeight() - (paint.getStrokeWidth() / f), paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4696a.setColorFilter(colorFilter);
    }
}
