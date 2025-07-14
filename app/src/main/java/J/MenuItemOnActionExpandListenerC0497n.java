package j;

import android.view.MenuItem;

/* renamed from: j.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC0497n implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f7010a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0499p f7011b;

    public MenuItemOnActionExpandListenerC0497n(MenuItemC0499p menuItemC0499p, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f7011b = menuItemC0499p;
        this.f7010a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f7010a.onMenuItemActionCollapse(this.f7011b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f7010a.onMenuItemActionExpand(this.f7011b.g(menuItem));
    }
}
