package G;

import G0.n;
import android.os.Handler;
import androidx.picker.widget.D;
import androidx.picker.widget.H;
import androidx.picker.widget.SeslNumberPicker;
import g3.y;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f676d;

    /* renamed from: e, reason: collision with root package name */
    public final int f677e;
    public final Object f;

    public /* synthetic */ b(int i5, Object obj, int i6) {
        this.f676d = i6;
        this.f = obj;
        this.f677e = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f676d) {
            case 0:
                A.b bVar = (A.b) ((B.g) this.f).f95e;
                if (bVar != null) {
                    bVar.h(this.f677e);
                    break;
                }
                break;
            case 1:
                ((n) this.f).A0(this.f677e);
                break;
            case 2:
                ArrayList arrayList = (ArrayList) this.f;
                int size = arrayList.size();
                int i5 = 0;
                if (this.f677e == 1) {
                    while (i5 < size) {
                        ((androidx.emoji2.text.g) arrayList.get(i5)).b();
                        i5++;
                    }
                    break;
                } else {
                    while (i5 < size) {
                        ((androidx.emoji2.text.g) arrayList.get(i5)).a();
                        i5++;
                    }
                    break;
                }
            case 3:
                new Handler().postDelayed(new H(6, this), 100L);
                break;
            case 4:
                D d5 = (D) this.f;
                int i6 = d5.f4048A;
                if (i6 != 0) {
                    d5.n0 = true;
                    d5.f4053D = d5.p0;
                    int i7 = d5.f4118o;
                    int i8 = d5.f4117m;
                    int i9 = i7 != i8 ? i6 : -i6;
                    int i10 = i7 - i8;
                    boolean z4 = d5.f4077Q;
                    int i11 = (z4 || i10 >= 5) ? 5 : i10;
                    float f = (z4 || i10 >= 5) ? 5.4f : i10 + 0.4f;
                    boolean z5 = d5.f4107f0;
                    int i12 = z5 ? i9 : i11 * i6;
                    if (!z5) {
                        i9 = (int) (i6 * f);
                    }
                    d5.t(i12);
                    ((SeslNumberPicker) d5.f4189b).invalidate();
                    new Handler().postDelayed(new b(i9, this, 3), this.f677e);
                    break;
                } else {
                    d5.o0 = true;
                    break;
                }
            case 5:
                new Handler().postDelayed(new H(1, this), 100L);
                break;
            default:
                ((com.google.android.material.datepicker.l) this.f).f5884k.A0(this.f677e);
                break;
        }
    }

    public b(int i5, n nVar) {
        this.f676d = 1;
        this.f677e = i5;
        this.f = nVar;
    }

    public b(List list, int i5, Throwable th) {
        this.f676d = 2;
        y.h("initCallbacks cannot be null", list);
        this.f = new ArrayList(list);
        this.f677e = i5;
    }
}
