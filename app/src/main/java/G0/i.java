package G0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import j0.C0525P;
import j0.X;

/* loaded from: classes.dex */
public final class i extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ViewPager2 viewPager2) {
        super(1);
        this.E = viewPager2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B0(X x4, int[] iArr) {
        ViewPager2 viewPager2 = this.E;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.B0(x4, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // j0.AbstractC0519J
    public final void T(C0525P c0525p, X x4, K.h hVar) {
        super.T(c0525p, x4, hVar);
        this.E.f4995w.getClass();
    }

    @Override // j0.AbstractC0519J
    public final boolean g0(C0525P c0525p, X x4, int i5, Bundle bundle) {
        this.E.f4995w.getClass();
        return super.g0(c0525p, x4, i5, bundle);
    }

    @Override // j0.AbstractC0519J
    public final boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z4, boolean z5) {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, j0.AbstractC0519J
    public final int n0(int i5, C0525P c0525p, X x4) {
        ViewPager2 viewPager2 = this.E;
        if (viewPager2.f4975A) {
            ViewPager2.a(viewPager2);
        }
        return super.n0(i5, c0525p, x4);
    }
}
