package e;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: e.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0402e implements AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0406i f6545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0404g f6546e;

    public C0402e(C0404g c0404g, C0406i c0406i) {
        this.f6546e = c0404g;
        this.f6545d = c0406i;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i5, long j5) {
        C0404g c0404g = this.f6546e;
        DialogInterface.OnClickListener onClickListener = c0404g.f6562p;
        C0406i c0406i = this.f6545d;
        onClickListener.onClick(c0406i.f6578b, i5);
        if (c0404g.f6566t) {
            return;
        }
        c0406i.f6578b.dismiss();
    }
}
