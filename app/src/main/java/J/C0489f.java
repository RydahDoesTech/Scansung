package j;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import com.wssyncmldm.R;
import java.util.ArrayList;

/* renamed from: j.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0489f extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final MenuC0492i f6947d;

    /* renamed from: e, reason: collision with root package name */
    public int f6948e = -1;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f6949g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6950h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6951i;

    /* renamed from: j, reason: collision with root package name */
    public final LayoutInflater f6952j;

    /* renamed from: k, reason: collision with root package name */
    public final int f6953k;

    public C0489f(MenuC0492i menuC0492i, LayoutInflater layoutInflater, boolean z4, int i5) {
        this.f6951i = z4;
        this.f6952j = layoutInflater;
        this.f6947d = menuC0492i;
        this.f6953k = i5;
        a();
    }

    public final void a() {
        MenuC0492i menuC0492i = this.f6947d;
        C0494k c0494k = menuC0492i.f6974v;
        if (c0494k != null) {
            menuC0492i.i();
            ArrayList arrayList = menuC0492i.f6963j;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (((C0494k) arrayList.get(i5)) == c0494k) {
                    this.f6948e = i5;
                    return;
                }
            }
        }
        this.f6948e = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0494k getItem(int i5) {
        ArrayList arrayListL;
        MenuC0492i menuC0492i = this.f6947d;
        if (this.f6951i) {
            menuC0492i.i();
            arrayListL = menuC0492i.f6963j;
        } else {
            arrayListL = menuC0492i.l();
        }
        int i6 = this.f6948e;
        if (i6 >= 0 && i5 >= i6) {
            i5++;
        }
        return (C0494k) arrayListL.get(i5);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        MenuC0492i menuC0492i = this.f6947d;
        if (this.f6951i) {
            menuC0492i.i();
            arrayListL = menuC0492i.f6963j;
        } else {
            arrayListL = menuC0492i.l();
        }
        return this.f6948e < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i5) {
        return i5;
    }

    @Override // android.widget.Adapter
    public final View getView(int i5, View view, ViewGroup viewGroup) throws Resources.NotFoundException {
        boolean z4 = false;
        if (view == null) {
            view = this.f6952j.inflate(this.f6953k, viewGroup, false);
            this.f = view.getPaddingTop();
            this.f6949g = view.getPaddingBottom();
        }
        int i6 = getItem(i5).f6983b;
        int i7 = i5 - 1;
        int i8 = i7 >= 0 ? getItem(i7).f6983b : i6;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f6947d.m() && i6 != i8) {
            z4 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z4);
        InterfaceC0505v interfaceC0505v = (InterfaceC0505v) view;
        if (this.f6950h) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0505v.d(getItem(i5));
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.sesl_popup_menu_first_last_item_vertical_edge_padding);
        int i9 = this.f + dimensionPixelSize;
        int i10 = this.f6949g + dimensionPixelSize;
        int paddingLeft = view.getPaddingLeft();
        if (i5 != 0) {
            i9 = this.f;
        }
        int paddingRight = view.getPaddingRight();
        if (i5 != getCount() - 1) {
            i10 = this.f6949g;
        }
        view.setPadding(paddingLeft, i9, paddingRight, i10);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i5) {
        ArrayList arrayListL;
        MenuC0492i menuC0492i = this.f6947d;
        if (this.f6951i) {
            menuC0492i.i();
            arrayListL = menuC0492i.f6963j;
        } else {
            arrayListL = menuC0492i.l();
        }
        return ((C0494k) arrayListL.get(i5)).isEnabled();
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
