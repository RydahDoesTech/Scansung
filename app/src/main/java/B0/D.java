package B0;

import android.view.View;
import android.view.ViewGroup;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public final class D extends u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f99a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f100b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f101c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f102d;

    public D(j jVar, ViewGroup viewGroup, View view, View view2) {
        this.f102d = jVar;
        this.f99a = viewGroup;
        this.f100b = view;
        this.f101c = view2;
    }

    @Override // B0.u, B0.s
    public final void c() {
        this.f99a.getOverlay().remove(this.f100b);
    }

    @Override // B0.s
    public final void d(t tVar) {
        this.f101c.setTag(R.id.save_overlay_view, null);
        this.f99a.getOverlay().remove(this.f100b);
        tVar.w(this);
    }

    @Override // B0.u, B0.s
    public final void e() {
        View view = this.f100b;
        if (view.getParent() == null) {
            this.f99a.getOverlay().add(view);
        } else {
            this.f102d.d();
        }
    }
}
