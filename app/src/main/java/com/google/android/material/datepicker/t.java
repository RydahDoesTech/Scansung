package com.google.android.material.datepicker;

import J.C;
import J.P;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wssyncmldm.R;
import j0.b0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class t extends b0 {

    /* renamed from: v, reason: collision with root package name */
    public final TextView f5927v;

    /* renamed from: w, reason: collision with root package name */
    public final MaterialCalendarGridView f5928w;

    public t(LinearLayout linearLayout, boolean z4) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f5927v = textView;
        WeakHashMap weakHashMap = P.f1421a;
        new C(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(textView, Boolean.TRUE);
        this.f5928w = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z4) {
            return;
        }
        textView.setVisibility(8);
    }
}
