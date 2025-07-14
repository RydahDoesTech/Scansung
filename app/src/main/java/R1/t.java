package R1;

import android.view.View;
import android.widget.AdapterView;
import k.C0662x0;

/* loaded from: classes.dex */
public final class t implements AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f2460d;

    public t(v vVar) {
        this.f2460d = vVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i5, long j5) {
        Object item;
        v vVar = this.f2460d;
        if (i5 < 0) {
            C0662x0 c0662x0 = vVar.f2463g;
            item = !c0662x0.f7836A.isShowing() ? null : c0662x0.f.getSelectedItem();
        } else {
            item = vVar.getAdapter().getItem(i5);
        }
        v.a(vVar, item);
        AdapterView.OnItemClickListener onItemClickListener = vVar.getOnItemClickListener();
        C0662x0 c0662x02 = vVar.f2463g;
        if (onItemClickListener != null) {
            if (view == null || i5 < 0) {
                view = c0662x02.f7836A.isShowing() ? c0662x02.f.getSelectedView() : null;
                i5 = !c0662x02.f7836A.isShowing() ? -1 : c0662x02.f.getSelectedItemPosition();
                j5 = !c0662x02.f7836A.isShowing() ? Long.MIN_VALUE : c0662x02.f.getSelectedItemId();
            }
            onItemClickListener.onItemClick(c0662x02.f, view, i5, j5);
        }
        c0662x02.dismiss();
    }
}
