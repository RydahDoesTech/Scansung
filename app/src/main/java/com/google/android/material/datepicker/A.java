package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wssyncmldm.R;
import j0.AbstractC0510A;
import j0.b0;
import java.util.Locale;

/* loaded from: classes.dex */
public final class A extends AbstractC0510A {

    /* renamed from: d, reason: collision with root package name */
    public final l f5854d;

    public A(l lVar) {
        this.f5854d = lVar;
    }

    @Override // j0.AbstractC0510A
    public final int a() {
        return this.f5854d.f.f5862i;
    }

    @Override // j0.AbstractC0510A
    public final void d(b0 b0Var, int i5) {
        l lVar = this.f5854d;
        int i6 = lVar.f.f5858d.f + i5;
        String str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i6));
        TextView textView = ((z) b0Var).f5933v;
        textView.setText(str);
        Context context = textView.getContext();
        textView.setContentDescription(y.b().get(1) == i6 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i6)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i6)));
        c cVar = lVar.f5882i;
        if (y.b().get(1) == i6) {
            Y0.h hVar = cVar.f5865b;
        } else {
            Y0.h hVar2 = cVar.f5864a;
        }
        throw null;
    }

    @Override // j0.AbstractC0510A
    public final b0 e(ViewGroup viewGroup, int i5) {
        return new z((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
