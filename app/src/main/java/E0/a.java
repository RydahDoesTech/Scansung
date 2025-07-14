package E0;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.animation.PathInterpolator;
import androidx.picker.widget.C0169g;
import androidx.picker.widget.F;
import androidx.picker.widget.SeslDatePicker;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final DataSetObservable f514a = new DataSetObservable();

    /* renamed from: b, reason: collision with root package name */
    public DataSetObserver f515b;

    public final void a(ViewPager viewPager, int i5, F f) {
        C0169g c0169g = (C0169g) this;
        PathInterpolator pathInterpolator = SeslDatePicker.f4339v0;
        c0169g.f4472d.getClass();
        viewPager.removeView(f);
        c0169g.f4471c.remove(i5);
    }

    public abstract int b();

    public final void c() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f515b;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f514a.notifyChanged();
    }
}
