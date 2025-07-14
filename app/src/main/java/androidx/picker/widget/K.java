package androidx.picker.widget;

import android.content.res.Resources;

/* loaded from: classes.dex */
public final class K implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4196d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4197e;
    public final /* synthetic */ Object f;

    public /* synthetic */ K(int i5, Object obj) {
        this.f4196d = i5;
        this.f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws NoSuchMethodException, Resources.NotFoundException, SecurityException {
        switch (this.f4196d) {
            case 0:
                boolean z4 = this.f4197e;
                M m4 = (M) this.f;
                m4.a(z4);
                ((SeslSpinningDatePickerSpinner) m4.f4189b).postDelayed(this, 300L);
                break;
            default:
                boolean z5 = this.f4197e;
                SeslDatePicker seslDatePicker = (SeslDatePicker) this.f;
                if (z5) {
                    seslDatePicker.f4356T.setCurrentItem(seslDatePicker.f4350L + 1);
                } else {
                    seslDatePicker.f4356T.setCurrentItem(seslDatePicker.f4350L - 1);
                }
                seslDatePicker.postDelayed(this, 300L);
                break;
        }
    }
}
