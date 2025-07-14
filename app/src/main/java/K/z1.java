package k;

import androidx.appcompat.widget.Toolbar;
import j.C0494k;

/* loaded from: classes.dex */
public final /* synthetic */ class z1 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Toolbar f7873e;

    public /* synthetic */ z1(Toolbar toolbar, int i5) {
        this.f7872d = i5;
        this.f7873e = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7872d) {
            case 0:
                D1 d1 = this.f7873e.f3486Q;
                C0494k c0494k = d1 == null ? null : d1.f7486e;
                if (c0494k != null) {
                    c0494k.collapseActionView();
                    break;
                }
                break;
            default:
                this.f7873e.o();
                break;
        }
    }
}
