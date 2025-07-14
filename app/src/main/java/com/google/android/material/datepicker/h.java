package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j0.X;

/* loaded from: classes.dex */
public final class h extends LinearLayoutManager {
    public final /* synthetic */ int E;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ l f5872F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, int i5, int i6) {
        super(i5);
        this.f5872F = lVar;
        this.E = i6;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B0(X x4, int[] iArr) {
        int i5 = this.E;
        l lVar = this.f5872F;
        if (i5 == 0) {
            iArr[0] = lVar.f5884k.getWidth();
            iArr[1] = lVar.f5884k.getWidth();
        } else {
            iArr[0] = lVar.f5884k.getHeight();
            iArr[1] = lVar.f5884k.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, j0.AbstractC0519J
    public final void y0(RecyclerView recyclerView, int i5) {
        w wVar = new w(recyclerView.getContext());
        wVar.f7300a = i5;
        z0(wVar);
    }
}
