package androidx.picker.widget;

import android.graphics.Rect;
import android.text.format.DateUtils;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.wssyncmldm.R;
import java.util.ArrayList;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class E extends S.b {

    /* renamed from: q, reason: collision with root package name */
    public final Rect f4138q;

    /* renamed from: r, reason: collision with root package name */
    public final Calendar f4139r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ F f4140s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F f, F f5) {
        super(f5);
        this.f4140s = f;
        this.f4138q = new Rect();
        this.f4139r = Calendar.getInstance();
    }

    @Override // S.b
    public final int n(float f, float f5) {
        F f6 = this.f4140s;
        int iC = f6.c(f, f5);
        if (f6.f4165d0 && iC < f6.f4147H) {
            return Integer.MIN_VALUE;
        }
        if (f6.f4167e0 && iC > f6.f4148I) {
            return Integer.MIN_VALUE;
        }
        int iB = f6.b() + iC;
        if (f6.f4142B != 3) {
            return iB;
        }
        int i5 = iB + 6;
        return i5 - (i5 % 7);
    }

    @Override // S.b
    public final void o(ArrayList arrayList) {
        F f = this.f4140s;
        int iB = f.b();
        for (int i5 = 1; i5 <= 42; i5++) {
            int i6 = i5 - iB;
            if ((f.f4142B != 3 || i5 % 7 == 0) && ((!f.f4165d0 || i6 >= f.f4147H) && (!f.f4167e0 || i6 <= f.f4148I))) {
                arrayList.add(Integer.valueOf(i5));
            }
        }
    }

    @Override // S.b
    public final boolean s(int i5, int i6) {
        if (i6 != 16) {
            return false;
        }
        F f = this.f4140s;
        int iB = i5 - f.b();
        if ((f.f4165d0 && iB < f.f4147H) || (f.f4167e0 && iB > f.f4148I)) {
            return true;
        }
        if (iB <= 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.clear();
            calendar.set(f.f4172j, f.f4171i, 1);
            calendar.add(5, iB - 1);
            f.i(calendar.get(1), calendar.get(2), calendar.get(5), true);
        } else if (iB > f.f4146G) {
            Calendar calendar2 = Calendar.getInstance();
            calendar2.clear();
            calendar2.set(f.f4172j, f.f4171i, f.f4146G);
            calendar2.add(5, iB - f.f4146G);
            f.i(calendar2.get(1), calendar2.get(2), calendar2.get(5), false);
        } else {
            int i7 = f.f4172j;
            int i8 = f.f4171i;
            if (f.f4161a0 != null) {
                f.playSoundEffect(0);
                f.f4161a0.k(f, i7, i8, iB);
            }
            f.f4160W.y(f.b() + iB, 1);
        }
        return true;
    }

    @Override // S.b
    public final void t(int i5, AccessibilityEvent accessibilityEvent) {
        F f = this.f4140s;
        int iB = i5 - f.b();
        if (accessibilityEvent.getEventType() == 32768) {
            f.f4168f0 = iB;
            f.g0 = false;
        }
        if (accessibilityEvent.getEventType() == 65536) {
            f.f4168f0 = -1;
            f.g0 = true;
        }
        if (f.f4142B != 3) {
            accessibilityEvent.setContentDescription(z(iB));
            return;
        }
        int i6 = (((f.f4143C - (f.f4145F - 1)) - 1) + iB) % 7;
        if (i6 == 0) {
            i6 = 7;
        }
        accessibilityEvent.setContentDescription(String.format(f.getResources().getString(R.string.sesl_date_picker_week_select_content_description), z((iB - i6) + 1), z((7 - i6) + iB)));
    }

    @Override // S.b
    public final void v(int i5, K.h hVar) {
        F f = this.f4140s;
        int iB = i5 - f.b();
        int i6 = f.f4144D;
        int i7 = (int) (f.f4170h.getResources().getDisplayMetrics().density * (-1.0f));
        int i8 = f.f4173k;
        int i9 = f.f4174l / 7;
        int iB2 = f.b() + (iB - 1);
        int i10 = iB2 / 7;
        int i11 = iB2 % 7;
        int i12 = (i10 * i8) + i7;
        int i13 = f.f4142B;
        Rect rect = this.f4138q;
        if (i13 == 3) {
            rect.set(0, i12, f.f4174l, i8 + i12);
        } else {
            int i14 = (i11 * i9) + i6;
            rect.set(i14, i12, i9 + i14, i8 + i12);
        }
        int i15 = f.f4142B;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f1615a;
        if (i15 == 3) {
            int i16 = (((f.f4143C - (f.f4145F - 1)) - 1) + iB) % 7;
            if (i16 == 0) {
                i16 = 7;
            }
            accessibilityNodeInfo.setContentDescription(String.format(f.getResources().getString(R.string.sesl_date_picker_week_select_content_description), z((iB - i16) + 1), z((7 - i16) + iB)));
        } else {
            accessibilityNodeInfo.setContentDescription(z(iB));
        }
        accessibilityNodeInfo.setBoundsInParent(rect);
        hVar.a(16);
        int i17 = f.E;
        if (i17 == -1 || iB != i17) {
            return;
        }
        hVar.a(4);
        accessibilityNodeInfo.setClickable(true);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(true);
    }

    public final String z(int i5) {
        F f = this.f4140s;
        int i6 = f.f4172j;
        int i7 = f.f4171i;
        Calendar calendar = this.f4139r;
        calendar.set(i6, i7, i5);
        return DateUtils.formatDateTime(f.f4170h, calendar.getTimeInMillis(), 22);
    }
}
