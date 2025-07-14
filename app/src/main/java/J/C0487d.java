package j;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.wssyncmldm.R;
import java.util.ArrayList;

/* renamed from: j.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0487d extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public int f6940d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0488e f6941e;

    public C0487d(C0488e c0488e) {
        this.f6941e = c0488e;
        a();
    }

    public final void a() {
        MenuC0492i menuC0492i = this.f6941e.f;
        C0494k c0494k = menuC0492i.f6974v;
        if (c0494k != null) {
            menuC0492i.i();
            ArrayList arrayList = menuC0492i.f6963j;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (((C0494k) arrayList.get(i5)) == c0494k) {
                    this.f6940d = i5;
                    return;
                }
            }
        }
        this.f6940d = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0494k getItem(int i5) {
        C0488e c0488e = this.f6941e;
        MenuC0492i menuC0492i = c0488e.f;
        menuC0492i.i();
        ArrayList arrayList = menuC0492i.f6963j;
        c0488e.getClass();
        int i6 = this.f6940d;
        if (i6 >= 0 && i5 >= i6) {
            i5++;
        }
        return (C0494k) arrayList.get(i5);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C0488e c0488e = this.f6941e;
        MenuC0492i menuC0492i = c0488e.f;
        menuC0492i.i();
        int size = menuC0492i.f6963j.size();
        c0488e.getClass();
        return this.f6940d < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i5) {
        return i5;
    }

    @Override // android.widget.Adapter
    public final View getView(int i5, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f6941e.f6943e.inflate(R.layout.sesl_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC0505v) view).d(getItem(i5));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
