package G0;

import androidx.preference.Preference;
import androidx.viewpager2.widget.ViewPager2;
import com.google.firebase.messaging.q;
import j0.AbstractC0512C;

/* loaded from: classes.dex */
public final class e extends AbstractC0512C {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f719b;

    public /* synthetic */ e(int i5, Object obj) {
        this.f718a = i5;
        this.f719b = obj;
    }

    @Override // j0.AbstractC0512C
    public final void a() {
        switch (this.f718a) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) this.f719b;
                viewPager2.f4981h = true;
                viewPager2.f4987o.f717l = true;
                break;
            default:
                ((q) this.f719b).D();
                break;
        }
    }

    @Override // j0.AbstractC0512C
    public final void b(int i5, int i6, Preference preference) {
        a();
    }
}
