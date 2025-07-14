package androidx.picker.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.View;
import com.wssyncmldm.R;
import java.util.Calendar;

/* renamed from: androidx.picker.widget.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0171i extends View {

    /* renamed from: d, reason: collision with root package name */
    public final Calendar f4473d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f4474e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4475g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4476h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f4477i;

    /* renamed from: j, reason: collision with root package name */
    public final String f4478j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ SeslDatePicker f4479k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0171i(SeslDatePicker seslDatePicker, Context context, TypedArray typedArray) throws Resources.NotFoundException {
        super(context);
        this.f4479k = seslDatePicker;
        this.f4477i = new int[7];
        this.f4473d = Calendar.getInstance();
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.sesl_date_picker_month_day_label_text_size);
        int color = typedArray.getColor(6, resources.getColor(R.color.sesl_date_picker_normal_text_color_light));
        this.f = color;
        this.f4475g = typedArray.getColor(10, resources.getColor(R.color.sesl_date_picker_sunday_text_color_light));
        ThreadLocal threadLocal = A.r.f34a;
        this.f4476h = A.l.a(resources, R.color.sesl_date_picker_saturday_week_text_color_light, null);
        String str = seslDatePicker.f4354Q;
        if (str != null) {
            this.f4478j = str;
        } else {
            this.f4478j = V1.a.P();
        }
        Paint paint = new Paint();
        this.f4474e = paint;
        paint.setAntiAlias(true);
        paint.setColor(color);
        paint.setTextSize(dimensionPixelSize);
        paint.setTypeface(Typeface.create(Typeface.create("sec", 0), 400, false));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStyle(Paint.Style.FILL);
        paint.setFakeBoldText(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int[] iArr;
        int i5;
        int i6;
        super.onDraw(canvas);
        SeslDatePicker seslDatePicker = this.f4479k;
        int i7 = seslDatePicker.f4391y;
        if (i7 == 0) {
            return;
        }
        int i8 = (seslDatePicker.f4347I * 2) / 3;
        int i9 = seslDatePicker.f4348J / (i7 * 2);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = seslDatePicker.f4391y;
            iArr = this.f4477i;
            if (i11 >= i12) {
                break;
            }
            char cCharAt = this.f4478j.charAt(i11);
            int i13 = (i11 + 2) % seslDatePicker.f4391y;
            if (cCharAt == 'B') {
                iArr[i13] = this.f4476h;
            } else if (cCharAt != 'R') {
                iArr[i13] = this.f;
            } else {
                iArr[i13] = this.f4475g;
            }
            i11++;
        }
        while (true) {
            int i14 = seslDatePicker.f4391y;
            if (i10 >= i14) {
                return;
            }
            int i15 = (seslDatePicker.f4392z + i10) % i14;
            Calendar calendar = this.f4473d;
            calendar.set(7, i15);
            String upperCase = seslDatePicker.g0.format(calendar.getTime()).toUpperCase();
            if (seslDatePicker.f4375k) {
                i5 = ((((seslDatePicker.f4391y - 1) - i10) * 2) + 1) * i9;
                i6 = seslDatePicker.f4342C;
            } else {
                i5 = ((i10 * 2) + 1) * i9;
                i6 = seslDatePicker.f4342C;
            }
            int i16 = i5 + i6;
            Paint paint = this.f4474e;
            paint.setColor(iArr[i15]);
            canvas.drawText(upperCase, i16, i8, paint);
            i10++;
        }
    }
}
