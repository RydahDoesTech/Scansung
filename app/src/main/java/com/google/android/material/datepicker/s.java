package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class s implements AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f5925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f5926e;

    public s(u uVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f5926e = uVar;
        this.f5925d = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i5, long j5) {
        MaterialCalendarGridView materialCalendarGridView = this.f5925d;
        r rVarA = materialCalendarGridView.a();
        if (i5 < rVarA.a() || i5 > rVarA.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i5).longValue() >= ((l) this.f5926e.f5930e.f5001d).f.f.f5867d) {
            throw null;
        }
    }
}
