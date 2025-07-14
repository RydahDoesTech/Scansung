package x1;

import G0.j;
import com.google.android.material.appbar.model.view.BasicViewPagerAppBarView;
import k.C0620f1;

/* renamed from: x1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0910b extends j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasicViewPagerAppBarView f9305a;

    public C0910b(BasicViewPagerAppBarView basicViewPagerAppBarView) {
        this.f9305a = basicViewPagerAppBarView;
    }

    @Override // G0.j
    public final void c(int i5) {
        C0620f1 indicator;
        BasicViewPagerAppBarView basicViewPagerAppBarView = this.f9305a;
        if (basicViewPagerAppBarView.isDeleteAnimatorRunning || (indicator = basicViewPagerAppBarView.getIndicator()) == null) {
            return;
        }
        indicator.setSelectedPosition(i5);
    }
}
