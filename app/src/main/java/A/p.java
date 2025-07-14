package A;

import android.view.View;
import com.google.android.material.appbar.model.view.BasicViewPagerAppBarView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.idm.fotaagent.abupdate.manager.EnablerManager;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f32d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f33e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p(int i5, Object obj, int i6) {
        this.f32d = i6;
        this.f = obj;
        this.f33e = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32d) {
            case 0:
                ((b) this.f).h(this.f33e);
                break;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f;
                View view = (View) sideSheetBehavior.f5964p.get();
                if (view != null) {
                    sideSheetBehavior.u(view, this.f33e, false);
                    break;
                }
                break;
            case 2:
                ((EnablerManager) this.f).lambda$suspend$2(this.f33e);
                break;
            default:
                BasicViewPagerAppBarView.moveNextAndRemove$lambda$11$lambda$10((BasicViewPagerAppBarView) this.f, this.f33e);
                break;
        }
    }
}
