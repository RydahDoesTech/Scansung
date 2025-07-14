package k;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import i.AbstractC0476b;
import j.C0494k;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0606b implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7649e;

    public /* synthetic */ ViewOnClickListenerC0606b(int i5, Object obj) {
        this.f7648d = i5;
        this.f7649e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f7648d) {
            case 0:
                ((AbstractC0476b) this.f7649e).a();
                break;
            default:
                D1 d1 = ((Toolbar) this.f7649e).f3486Q;
                C0494k c0494k = d1 == null ? null : d1.f7486e;
                if (c0494k != null) {
                    c0494k.collapseActionView();
                    break;
                }
                break;
        }
    }
}
