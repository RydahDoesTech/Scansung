package androidx.picker.widget;

import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class L implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4198d;

    /* renamed from: e, reason: collision with root package name */
    public int f4199e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4200g;

    public /* synthetic */ L(int i5, Object obj) {
        this.f4198d = i5;
        this.f4200g = obj;
    }

    public final void a() {
        switch (this.f4198d) {
            case 0:
                M m4 = (M) this.f4200g;
                int right = ((SeslSpinningDatePickerSpinner) m4.f4189b).getRight();
                int bottom = ((SeslSpinningDatePickerSpinner) m4.f4189b).getBottom();
                this.f = 0;
                this.f4199e = 0;
                ((SeslSpinningDatePickerSpinner) m4.f4189b).removeCallbacks(this);
                if (m4.f4226Q) {
                    m4.f4226Q = false;
                    ((SeslSpinningDatePickerSpinner) m4.f4189b).invalidate(0, m4.f4223N, right, bottom);
                }
                if (m4.f4227R) {
                    m4.f4227R = false;
                    ((SeslSpinningDatePickerSpinner) m4.f4189b).invalidate(0, 0, right, m4.f4222M);
                    break;
                }
                break;
            default:
                D d5 = (D) this.f4200g;
                int right2 = ((SeslNumberPicker) d5.f4189b).getRight();
                int bottom2 = ((SeslNumberPicker) d5.f4189b).getBottom();
                this.f = 0;
                this.f4199e = 0;
                ((SeslNumberPicker) d5.f4189b).removeCallbacks(this);
                if (d5.f4096a0) {
                    d5.f4096a0 = false;
                    ((SeslNumberPicker) d5.f4189b).invalidate(0, d5.f4092Y, right2, bottom2);
                }
                if (d5.f4098b0) {
                    d5.f4098b0 = false;
                    ((SeslNumberPicker) d5.f4189b).invalidate(0, 0, right2, d5.f4090X);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r9v13, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r9v8, types: [boolean, byte] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4198d) {
            case 0:
                M m4 = (M) this.f4200g;
                int right = ((SeslSpinningDatePickerSpinner) m4.f4189b).getRight();
                int bottom = ((SeslSpinningDatePickerSpinner) m4.f4189b).getBottom();
                int i5 = this.f;
                if (i5 == 1) {
                    int i6 = this.f4199e;
                    if (i6 == 1) {
                        m4.f4226Q = true;
                        ((SeslSpinningDatePickerSpinner) m4.f4189b).invalidate(0, m4.f4223N, right, bottom);
                        break;
                    } else if (i6 == 2) {
                        m4.f4227R = true;
                        ((SeslSpinningDatePickerSpinner) m4.f4189b).invalidate(0, 0, right, m4.f4222M);
                        break;
                    }
                } else if (i5 == 2) {
                    int i7 = this.f4199e;
                    if (i7 == 1) {
                        if (!m4.f4226Q) {
                            ((SeslSpinningDatePickerSpinner) m4.f4189b).postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        m4.f4226Q = (byte) (!m4.f4226Q ? 1 : 0);
                        ((SeslSpinningDatePickerSpinner) m4.f4189b).invalidate(0, m4.f4223N, right, bottom);
                        break;
                    } else if (i7 == 2) {
                        if (!m4.f4227R) {
                            ((SeslSpinningDatePickerSpinner) m4.f4189b).postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        m4.f4227R = (byte) (!m4.f4227R ? 1 : 0);
                        ((SeslSpinningDatePickerSpinner) m4.f4189b).invalidate(0, 0, right, m4.f4222M);
                        break;
                    }
                }
                break;
            default:
                D d5 = (D) this.f4200g;
                int right2 = ((SeslNumberPicker) d5.f4189b).getRight();
                int bottom2 = ((SeslNumberPicker) d5.f4189b).getBottom();
                int i8 = this.f;
                if (i8 == 1) {
                    int i9 = this.f4199e;
                    if (i9 == 1) {
                        d5.f4096a0 = true;
                        ((SeslNumberPicker) d5.f4189b).invalidate(0, d5.f4092Y, right2, bottom2);
                        break;
                    } else if (i9 == 2) {
                        d5.f4098b0 = true;
                        ((SeslNumberPicker) d5.f4189b).invalidate(0, 0, right2, d5.f4090X);
                        break;
                    }
                } else if (i8 == 2) {
                    int i10 = this.f4199e;
                    if (i10 == 1) {
                        if (!d5.f4096a0) {
                            ((SeslNumberPicker) d5.f4189b).postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        d5.f4096a0 = !d5.f4096a0;
                        ((SeslNumberPicker) d5.f4189b).invalidate(0, d5.f4092Y, right2, bottom2);
                        break;
                    } else if (i10 == 2) {
                        if (!d5.f4098b0) {
                            ((SeslNumberPicker) d5.f4189b).postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        d5.f4098b0 = !d5.f4098b0;
                        ((SeslNumberPicker) d5.f4189b).invalidate(0, 0, right2, d5.f4090X);
                        break;
                    }
                }
                break;
        }
    }
}
