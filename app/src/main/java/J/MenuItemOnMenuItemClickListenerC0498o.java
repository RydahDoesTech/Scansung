package j;

import android.view.MenuItem;

/* renamed from: j.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0498o implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f7012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0499p f7013e;

    public MenuItemOnMenuItemClickListenerC0498o(MenuItemC0499p menuItemC0499p, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f7013e = menuItemC0499p;
        this.f7012d = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f7012d.onMenuItemClick(this.f7013e.g(menuItem));
    }
}
