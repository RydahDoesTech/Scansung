package androidx.preference;

import android.content.res.Configuration;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import j0.AbstractC0510A;

/* loaded from: classes.dex */
public final class v implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f4685d;

    public v(z zVar) {
        this.f4685d = zVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        z zVar = this.f4685d;
        RecyclerView recyclerView = zVar.mList;
        if (recyclerView != null) {
            AbstractC0510A adapter = recyclerView.getAdapter();
            Configuration configuration = zVar.getResources().getConfiguration();
            int i5 = configuration.screenWidthDp;
            int i6 = ((i5 > 320 || configuration.fontScale < 1.1f) && (i5 >= 411 || configuration.fontScale < 1.3f)) ? 2 : 1;
            if (adapter instanceof D) {
                D d5 = (D) adapter;
                if (z.access$100(zVar, d5, i6, i5)) {
                    zVar.mIsLargeLayout = i6;
                    for (int i7 = 0; i7 < d5.f.size(); i7++) {
                        Preference preferenceK = d5.k(i7);
                        if (preferenceK != null && D.o(preferenceK) && (preferenceK instanceof SwitchPreferenceCompat)) {
                            adapter.f7050a.c(i7, 1, null);
                        }
                    }
                }
            }
            zVar.mScreenWidthDp = configuration.screenWidthDp;
            zVar.mList.getViewTreeObserver().removeOnPreDrawListener(this);
            zVar.mOnPreDrawListener = null;
        }
        return false;
    }
}
