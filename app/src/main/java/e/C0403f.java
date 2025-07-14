package e;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: e.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0403f implements AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AlertController$RecycleListView f6547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0406i f6548e;
    public final /* synthetic */ C0404g f;

    public C0403f(C0404g c0404g, AlertController$RecycleListView alertController$RecycleListView, C0406i c0406i) {
        this.f = c0404g;
        this.f6547d = alertController$RecycleListView;
        this.f6548e = c0406i;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i5, long j5) {
        C0404g c0404g = this.f;
        boolean[] zArr = c0404g.f6564r;
        AlertController$RecycleListView alertController$RecycleListView = this.f6547d;
        if (zArr != null) {
            zArr[i5] = alertController$RecycleListView.isItemChecked(i5);
        }
        c0404g.f6568v.onClick(this.f6548e.f6578b, i5, alertController$RecycleListView.isItemChecked(i5));
    }
}
