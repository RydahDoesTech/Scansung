package j0;

import J.C0045b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class d0 extends C0045b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f7152d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f7153e;

    public d0(RecyclerView recyclerView) {
        this.f7152d = recyclerView;
        C0045b c0045bJ = j();
        if (c0045bJ == null || !(c0045bJ instanceof c0)) {
            this.f7153e = new c0(this);
        } else {
            this.f7153e = (c0) c0045bJ;
        }
    }

    @Override // J.C0045b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f7152d.Z()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().S(accessibilityEvent);
        }
    }

    @Override // J.C0045b
    public final void d(View view, K.h hVar) {
        this.f1437a.onInitializeAccessibilityNodeInfo(view, hVar.f1615a);
        RecyclerView recyclerView = this.f7152d;
        if (recyclerView.Z() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC0519J layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f7063b;
        layoutManager.T(recyclerView2.f, recyclerView2.m0, hVar);
    }

    @Override // J.C0045b
    public final boolean g(View view, int i5, Bundle bundle) {
        if (super.g(view, i5, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f7152d;
        if (recyclerView.Z() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        AbstractC0519J layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f7063b;
        return layoutManager.g0(recyclerView2.f, recyclerView2.m0, i5, bundle);
    }

    public C0045b j() {
        return this.f7153e;
    }
}
