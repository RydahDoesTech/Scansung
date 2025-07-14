package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b0.C0198c;
import com.wssyncmldm.R;
import j0.AbstractC0510A;
import j0.C0520K;
import j0.b0;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class u extends AbstractC0510A {

    /* renamed from: d, reason: collision with root package name */
    public final b f5929d;

    /* renamed from: e, reason: collision with root package name */
    public final C0198c f5930e;
    public final int f;

    public u(ContextThemeWrapper contextThemeWrapper, b bVar, C0198c c0198c) {
        q qVar = bVar.f5858d;
        q qVar2 = bVar.f5860g;
        if (qVar.f5915d.compareTo(qVar2.f5915d) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (qVar2.f5915d.compareTo(bVar.f5859e.f5915d) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * r.f5921g) + (o.i(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f5929d = bVar;
        this.f5930e = c0198c;
        h(true);
    }

    @Override // j0.AbstractC0510A
    public final int a() {
        return this.f5929d.f5863j;
    }

    @Override // j0.AbstractC0510A
    public final long b(int i5) {
        Calendar calendarA = y.a(this.f5929d.f5858d.f5915d);
        calendarA.add(2, i5);
        calendarA.set(5, 1);
        Calendar calendarA2 = y.a(calendarA);
        calendarA2.get(2);
        calendarA2.get(1);
        calendarA2.getMaximum(7);
        calendarA2.getActualMaximum(5);
        calendarA2.getTimeInMillis();
        return calendarA2.getTimeInMillis();
    }

    @Override // j0.AbstractC0510A
    public final void d(b0 b0Var, int i5) {
        t tVar = (t) b0Var;
        b bVar = this.f5929d;
        Calendar calendarA = y.a(bVar.f5858d.f5915d);
        calendarA.add(2, i5);
        q qVar = new q(calendarA);
        tVar.f5927v.setText(qVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) tVar.f5928w.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !qVar.equals(materialCalendarGridView.a().f5923d)) {
            new r(qVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // j0.AbstractC0510A
    public final b0 e(ViewGroup viewGroup, int i5) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!o.i(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new t(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C0520K(-1, this.f));
        return new t(linearLayout, true);
    }
}
