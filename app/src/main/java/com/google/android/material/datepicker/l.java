package com.google.android.material.datepicker;

import J.P;
import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b0.C0198c;
import com.google.android.material.button.MaterialButton;
import j0.C0555x;

/* loaded from: classes.dex */
public final class l<S> extends v {

    /* renamed from: e, reason: collision with root package name */
    public int f5879e;
    public b f;

    /* renamed from: g, reason: collision with root package name */
    public q f5880g;

    /* renamed from: h, reason: collision with root package name */
    public int f5881h;

    /* renamed from: i, reason: collision with root package name */
    public c f5882i;

    /* renamed from: j, reason: collision with root package name */
    public RecyclerView f5883j;

    /* renamed from: k, reason: collision with root package name */
    public RecyclerView f5884k;

    /* renamed from: l, reason: collision with root package name */
    public View f5885l;

    /* renamed from: m, reason: collision with root package name */
    public View f5886m;
    public View n;

    /* renamed from: o, reason: collision with root package name */
    public View f5887o;

    public final void f(q qVar) {
        u uVar = (u) this.f5884k.getAdapter();
        int iD = uVar.f5929d.f5858d.d(qVar);
        int iD2 = iD - uVar.f5929d.f5858d.d(this.f5880g);
        boolean z4 = Math.abs(iD2) > 3;
        boolean z5 = iD2 > 0;
        this.f5880g = qVar;
        if (z4 && z5) {
            this.f5884k.v0(iD - 3);
            this.f5884k.post(new G.b(iD, this, 6));
        } else if (!z4) {
            this.f5884k.post(new G.b(iD, this, 6));
        } else {
            this.f5884k.v0(iD + 3);
            this.f5884k.post(new G.b(iD, this, 6));
        }
    }

    public final void g(int i5) {
        this.f5881h = i5;
        if (i5 == 2) {
            this.f5883j.getLayoutManager().o0(this.f5880g.f - ((A) this.f5883j.getAdapter()).f5854d.f.f5858d.f);
            this.n.setVisibility(0);
            this.f5887o.setVisibility(8);
            this.f5885l.setVisibility(8);
            this.f5886m.setVisibility(8);
            return;
        }
        if (i5 == 1) {
            this.n.setVisibility(8);
            this.f5887o.setVisibility(0);
            this.f5885l.setVisibility(0);
            this.f5886m.setVisibility(0);
            f(this.f5880g);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f5879e = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f5880g = (q) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        int i5;
        int i6;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f5879e);
        this.f5882i = new c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        q qVar = this.f.f5858d;
        if (o.i(contextThemeWrapper, R.attr.windowFullscreen)) {
            i5 = com.wssyncmldm.R.layout.mtrl_calendar_vertical;
            i6 = 1;
        } else {
            i5 = com.wssyncmldm.R.layout.mtrl_calendar_horizontal;
            i6 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i5, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.wssyncmldm.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.wssyncmldm.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.wssyncmldm.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.wssyncmldm.R.dimen.mtrl_calendar_days_of_week_height);
        int i7 = r.f5921g;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.wssyncmldm.R.dimen.mtrl_calendar_month_vertical_padding) * (i7 - 1)) + (resources.getDimensionPixelSize(com.wssyncmldm.R.dimen.mtrl_calendar_day_height) * i7) + resources.getDimensionPixelOffset(com.wssyncmldm.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.wssyncmldm.R.id.mtrl_calendar_days_of_week);
        P.h(gridView, new O.j(1));
        int i8 = this.f.f5861h;
        gridView.setAdapter((ListAdapter) (i8 > 0 ? new f(i8) : new f()));
        gridView.setNumColumns(qVar.f5917g);
        gridView.setEnabled(false);
        this.f5884k = (RecyclerView) viewInflate.findViewById(com.wssyncmldm.R.id.mtrl_calendar_months);
        getContext();
        this.f5884k.setLayoutManager(new h(this, i6, i6));
        this.f5884k.setTag("MONTHS_VIEW_GROUP_TAG");
        u uVar = new u(contextThemeWrapper, this.f, new C0198c(this));
        this.f5884k.setAdapter(uVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.wssyncmldm.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(com.wssyncmldm.R.id.mtrl_calendar_year_selector_frame);
        this.f5883j = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f5883j.setLayoutManager(new GridLayoutManager(integer));
            this.f5883j.setAdapter(new A(this));
            this.f5883j.j(new i(this));
        }
        if (viewInflate.findViewById(com.wssyncmldm.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.wssyncmldm.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            P.h(materialButton, new m(1, this));
            View viewFindViewById = viewInflate.findViewById(com.wssyncmldm.R.id.month_navigation_previous);
            this.f5885l = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(com.wssyncmldm.R.id.month_navigation_next);
            this.f5886m = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.n = viewInflate.findViewById(com.wssyncmldm.R.id.mtrl_calendar_year_selector_frame);
            this.f5887o = viewInflate.findViewById(com.wssyncmldm.R.id.mtrl_calendar_day_selector_frame);
            g(1);
            materialButton.setText(this.f5880g.c());
            this.f5884k.k(new j(this, uVar, materialButton));
            materialButton.setOnClickListener(new k(0, this));
            this.f5886m.setOnClickListener(new g(this, uVar, 1));
            this.f5885l.setOnClickListener(new g(this, uVar, 0));
        }
        if (!o.i(contextThemeWrapper, R.attr.windowFullscreen)) {
            new C0555x().a(this.f5884k);
        }
        this.f5884k.v0(uVar.f5929d.f5858d.d(this.f5880g));
        P.h(this.f5884k, new O.j(2));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f5879e);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f5880g);
    }
}
