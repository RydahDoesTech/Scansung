package T;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public List f2546d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f2547e;

    /* renamed from: h, reason: collision with root package name */
    public final LayoutInflater f2549h;

    /* renamed from: g, reason: collision with root package name */
    public final int f2548g = R.layout.simple_spinner_item;
    public final int f = R.layout.simple_spinner_dropdown_item;

    public d(Context context, List list) {
        this.f2547e = context;
        this.f2549h = (LayoutInflater) context.getSystemService("layout_inflater");
        if (this.f2546d == list) {
            return;
        }
        this.f2546d = list;
        notifyDataSetChanged();
    }

    public final View a(int i5, int i6, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = i5 == 0 ? new TextView(this.f2547e) : this.f2549h.inflate(i5, viewGroup, false);
        }
        TextView textView = (TextView) view;
        Object obj = this.f2546d.get(i6);
        textView.setText(obj instanceof CharSequence ? (CharSequence) obj : String.valueOf(obj));
        return view;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f2546d.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i5, View view, ViewGroup viewGroup) {
        return a(this.f, i5, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i5) {
        return this.f2546d.get(i5);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i5) {
        return i5;
    }

    @Override // android.widget.Adapter
    public final View getView(int i5, View view, ViewGroup viewGroup) {
        return a(this.f2548g, i5, view, viewGroup);
    }
}
