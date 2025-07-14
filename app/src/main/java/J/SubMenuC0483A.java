package j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: j.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC0483A extends MenuC0492i implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final C0494k f6923A;

    /* renamed from: z, reason: collision with root package name */
    public final MenuC0492i f6924z;

    public SubMenuC0483A(Context context, MenuC0492i menuC0492i, C0494k c0494k) {
        super(context);
        this.f6924z = menuC0492i;
        this.f6923A = c0494k;
    }

    @Override // j.MenuC0492i
    public final boolean d(C0494k c0494k) {
        return this.f6924z.d(c0494k);
    }

    @Override // j.MenuC0492i
    public final boolean e(MenuC0492i menuC0492i, MenuItem menuItem) {
        return super.e(menuC0492i, menuItem) || this.f6924z.e(menuC0492i, menuItem);
    }

    @Override // j.MenuC0492i
    public final boolean f(C0494k c0494k) {
        return this.f6924z.f(c0494k);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f6923A;
    }

    @Override // j.MenuC0492i
    public final String j() {
        C0494k c0494k = this.f6923A;
        int i5 = c0494k != null ? c0494k.f6982a : 0;
        if (i5 == 0) {
            return null;
        }
        return A3.f.l(i5, "android:menu:actionviewstates:");
    }

    @Override // j.MenuC0492i
    public final MenuC0492i k() {
        return this.f6924z.k();
    }

    @Override // j.MenuC0492i
    public final boolean m() {
        return this.f6924z.m();
    }

    @Override // j.MenuC0492i
    public final boolean n() {
        return this.f6924z.n();
    }

    @Override // j.MenuC0492i
    public final boolean o() {
        return this.f6924z.o();
    }

    @Override // j.MenuC0492i, android.view.Menu
    public final void setGroupDividerEnabled(boolean z4) {
        this.f6924z.setGroupDividerEnabled(z4);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f6923A.setIcon(drawable);
        return this;
    }

    @Override // j.MenuC0492i, android.view.Menu
    public final void setQwertyMode(boolean z4) {
        this.f6924z.setQwertyMode(z4);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i5) {
        u(0, null, i5, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i5) {
        u(i5, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i5) {
        this.f6923A.setIcon(i5);
        return this;
    }
}
