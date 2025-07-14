package G0;

import K.q;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class k implements q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.messaging.q f725e;

    public /* synthetic */ k(com.google.firebase.messaging.q qVar, int i5) {
        this.f724d = i5;
        this.f725e = qVar;
    }

    @Override // K.q
    public final boolean h(View view) {
        switch (this.f724d) {
            case 0:
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = (ViewPager2) this.f725e.f6170h;
                if (viewPager2.f4993u) {
                    viewPager2.d(currentItem);
                    break;
                }
                break;
            default:
                int currentItem2 = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager22 = (ViewPager2) this.f725e.f6170h;
                if (viewPager22.f4993u) {
                    viewPager22.d(currentItem2);
                    break;
                }
                break;
        }
        return true;
    }
}
