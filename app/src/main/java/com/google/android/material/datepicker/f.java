package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.wssyncmldm.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class f extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final Calendar f5868d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5869e;
    public final int f;

    public f() {
        Calendar calendarC = y.c(null);
        this.f5868d = calendarC;
        this.f5869e = calendarC.getMaximum(7);
        this.f = calendarC.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f5869e;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i5) {
        int i6 = this.f5869e;
        if (i5 >= i6) {
            return null;
        }
        int i7 = i5 + this.f;
        if (i7 > i6) {
            i7 -= i6;
        }
        return Integer.valueOf(i7);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i5) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i5, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i6 = i5 + this.f;
        int i7 = this.f5869e;
        if (i6 > i7) {
            i6 -= i7;
        }
        Calendar calendar = this.f5868d;
        calendar.set(7, i6);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public f(int i5) {
        Calendar calendarC = y.c(null);
        this.f5868d = calendarC;
        this.f5869e = calendarC.getMaximum(7);
        this.f = i5;
    }
}
