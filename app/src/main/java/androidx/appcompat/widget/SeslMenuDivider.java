package androidx.appcompat.widget;

import A.l;
import A.r;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.ImageView;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class SeslMenuDivider extends ImageView {

    /* renamed from: d, reason: collision with root package name */
    public final int f3376d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3377e;
    public final Paint f;

    public SeslMenuDivider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f3377e = (int) TypedValue.applyDimension(1, 1.5f, displayMetrics);
        this.f3376d = (int) TypedValue.applyDimension(1, 3.0f, displayMetrics);
        Paint paint = new Paint();
        this.f = paint;
        paint.setFlags(1);
        Resources resources = context.getResources();
        int i5 = J2.b.I(context) ? R.color.sesl_popup_menu_divider_color_light : R.color.sesl_popup_menu_divider_color_dark;
        ThreadLocal threadLocal = r.f34a;
        paint.setColor(l.a(resources, i5, null));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i5;
        int i6;
        super.onDraw(canvas);
        int width = (getWidth() - getPaddingStart()) - getPaddingEnd();
        int height = getHeight();
        int i7 = this.f3377e;
        int i8 = this.f3376d;
        int i9 = (width - i7) / (i8 + i7);
        int i10 = i9 + 1;
        int paddingStart = getPaddingStart() + ((int) ((i7 / 2.0f) + 0.5f));
        int i11 = (width - i7) - ((i8 + i7) * i9);
        if (i7 % 2 != 0) {
            i11--;
        }
        if (i9 > 0) {
            i6 = i11 / i9;
            i5 = i11 % i9;
        } else {
            i5 = 0;
            i6 = 0;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            canvas.drawCircle(paddingStart + i12, height / 2.0f, i7 / 2.0f, this.f);
            int i14 = i7 + i8 + i6 + i12;
            if (i13 < i5) {
                i14++;
            }
            i12 = i14;
        }
    }
}
