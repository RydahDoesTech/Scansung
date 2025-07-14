package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class g implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f5871e;
    public final /* synthetic */ l f;

    public /* synthetic */ g(l lVar, u uVar, int i5) {
        this.f5870d = i5;
        this.f = lVar;
        this.f5871e = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5870d) {
            case 0:
                l lVar = this.f;
                int iM0 = ((LinearLayoutManager) lVar.f5884k.getLayoutManager()).M0() - 1;
                if (iM0 >= 0) {
                    Calendar calendarA = y.a(this.f5871e.f5929d.f5858d.f5915d);
                    calendarA.add(2, iM0);
                    lVar.f(new q(calendarA));
                    break;
                }
                break;
            default:
                l lVar2 = this.f;
                int iL0 = ((LinearLayoutManager) lVar2.f5884k.getLayoutManager()).L0() + 1;
                if (iL0 < lVar2.f5884k.getAdapter().a()) {
                    Calendar calendarA2 = y.a(this.f5871e.f5929d.f5858d.f5915d);
                    calendarA2.add(2, iL0);
                    lVar2.f(new q(calendarA2));
                    break;
                }
                break;
        }
    }
}
