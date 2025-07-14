package k;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import j.InterfaceC0490g;
import j.MenuC0492i;

/* loaded from: classes.dex */
public final class B1 implements InterfaceC0642n, InterfaceC0490g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Toolbar f7477d;

    public /* synthetic */ B1(Toolbar toolbar) {
        this.f7477d = toolbar;
    }

    @Override // j.InterfaceC0490g
    public void c(MenuC0492i menuC0492i) {
        Toolbar toolbar = this.f7477d;
        C0633k c0633k = toolbar.f3495d.f3297w;
        if (c0633k == null || !c0633k.j()) {
            toolbar.f3480J.b(menuC0492i);
        }
        e.J j5 = toolbar.f3488T;
        if (j5 != null) {
            j5.c(menuC0492i);
        }
    }

    @Override // j.InterfaceC0490g
    public boolean d(MenuC0492i menuC0492i, MenuItem menuItem) {
        e.J j5 = this.f7477d.f3488T;
        return false;
    }
}
