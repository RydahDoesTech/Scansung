package androidx.picker.widget;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4194a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4195b;

    public /* synthetic */ J(int i5, Object obj) {
        this.f4194a = i5;
        this.f4195b = obj;
    }

    public final void a(V.e eVar, float f, float f5) {
        switch (this.f4194a) {
            case 0:
                M m4 = (M) this.f4195b;
                float f6 = f - m4.f4273z;
                if (!m4.f4210F0 && Math.round(f6) == 0) {
                    eVar.b();
                    m4.c(0);
                    break;
                } else {
                    if (Math.round(f6) == 0) {
                        m4.f4210F0 = false;
                    }
                    m4.n(Math.round(f6));
                    m4.f4273z = f;
                    ((SeslSpinningDatePickerSpinner) m4.f4189b).invalidate();
                    break;
                }
                break;
            default:
                if (f5 <= 0.0f) {
                    f5 = -f5;
                }
                D d5 = (D) this.f4195b;
                d5.f4086U0 = f5;
                float f7 = f - d5.f4060H;
                if (!d5.f4084T0 && Math.round(f7) == 0) {
                    eVar.b();
                    if (!d5.e(0)) {
                        d5.C();
                        break;
                    }
                } else {
                    if (Math.round(f7) == 0) {
                        d5.f4084T0 = false;
                    }
                    d5.t(Math.round(f7));
                    d5.f4060H = f;
                    ((SeslNumberPicker) d5.f4189b).invalidate();
                    break;
                }
                break;
        }
    }
}
