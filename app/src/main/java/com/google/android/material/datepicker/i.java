package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j0.AbstractC0516G;

/* loaded from: classes.dex */
public final class i extends AbstractC0516G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f5873a;

    public i(l lVar) {
        this.f5873a = lVar;
        y.c(null);
        y.c(null);
    }

    @Override // j0.AbstractC0516G
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof A) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f5873a.getClass();
            throw null;
        }
    }
}
