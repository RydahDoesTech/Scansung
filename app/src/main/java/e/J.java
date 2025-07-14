package e;

import android.view.MenuItem;
import j.InterfaceC0490g;
import j.MenuC0492i;
import k.F1;

/* loaded from: classes.dex */
public final class J implements F1, InterfaceC0490g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ K f6497d;

    public /* synthetic */ J(K k5) {
        this.f6497d = k5;
    }

    @Override // j.InterfaceC0490g
    public void c(MenuC0492i menuC0492i) {
        K k5 = this.f6497d;
        boolean zQ = k5.f6498a.f7507a.q();
        x xVar = k5.f6499b;
        if (zQ) {
            xVar.onPanelClosed(108, menuC0492i);
        } else if (xVar.onPreparePanel(0, null, menuC0492i)) {
            xVar.onMenuOpened(108, menuC0492i);
        }
    }

    @Override // j.InterfaceC0490g
    public boolean d(MenuC0492i menuC0492i, MenuItem menuItem) {
        return false;
    }
}
