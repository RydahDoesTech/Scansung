package j;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import i.InterfaceC0477c;

/* renamed from: j.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0496m extends FrameLayout implements InterfaceC0477c {

    /* renamed from: d, reason: collision with root package name */
    public final CollapsibleActionView f7009d;

    /* JADX WARN: Multi-variable type inference failed */
    public C0496m(View view) {
        super(view.getContext());
        this.f7009d = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // i.InterfaceC0477c
    public final void c() {
        this.f7009d.onActionViewExpanded();
    }

    @Override // i.InterfaceC0477c
    public final void e() {
        this.f7009d.onActionViewCollapsed();
    }
}
