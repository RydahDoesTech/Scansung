package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import j0.AbstractC0522M;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class j extends AbstractC0522M {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f5874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f5875b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f5876c;

    public j(l lVar, u uVar, MaterialButton materialButton) {
        this.f5876c = lVar;
        this.f5874a = uVar;
        this.f5875b = materialButton;
    }

    @Override // j0.AbstractC0522M
    public final void a(RecyclerView recyclerView, int i5) {
        if (i5 == 0) {
            recyclerView.announceForAccessibility(this.f5875b.getText());
        }
    }

    @Override // j0.AbstractC0522M
    public final void b(RecyclerView recyclerView, int i5, int i6) {
        l lVar = this.f5876c;
        int iL0 = i5 < 0 ? ((LinearLayoutManager) lVar.f5884k.getLayoutManager()).L0() : ((LinearLayoutManager) lVar.f5884k.getLayoutManager()).M0();
        b bVar = this.f5874a.f5929d;
        Calendar calendarA = y.a(bVar.f5858d.f5915d);
        calendarA.add(2, iL0);
        lVar.f5880g = new q(calendarA);
        Calendar calendarA2 = y.a(bVar.f5858d.f5915d);
        calendarA2.add(2, iL0);
        calendarA2.set(5, 1);
        Calendar calendarA3 = y.a(calendarA2);
        calendarA3.get(2);
        calendarA3.get(1);
        calendarA3.getMaximum(7);
        calendarA3.getActualMaximum(5);
        calendarA3.getTimeInMillis();
        long timeInMillis = calendarA3.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = y.f5932a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        this.f5875b.setText(instanceForSkeleton.format(new Date(timeInMillis)));
    }
}
