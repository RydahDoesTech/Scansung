package E0;

import android.content.res.Resources;
import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;
import k.C0662x0;
import k.s1;

/* loaded from: classes.dex */
public final class i extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f530a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f531b;

    public /* synthetic */ i(int i5, Object obj) {
        this.f530a = i5;
        this.f531b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() throws NoSuchMethodException, Resources.NotFoundException, SecurityException {
        switch (this.f530a) {
            case 0:
                ((ViewPager) this.f531b).e();
                break;
            case 1:
                s1 s1Var = (s1) this.f531b;
                s1Var.f2102d = true;
                s1Var.notifyDataSetChanged();
                break;
            default:
                C0662x0 c0662x0 = (C0662x0) this.f531b;
                if (c0662x0.f7836A.isShowing()) {
                    c0662x0.r();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() throws NoSuchMethodException, Resources.NotFoundException, SecurityException {
        switch (this.f530a) {
            case 0:
                ((ViewPager) this.f531b).e();
                break;
            case 1:
                s1 s1Var = (s1) this.f531b;
                s1Var.f2102d = false;
                s1Var.notifyDataSetInvalidated();
                break;
            default:
                ((C0662x0) this.f531b).dismiss();
                break;
        }
    }
}
