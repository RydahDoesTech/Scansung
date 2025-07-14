package j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b0.C0198c;
import e1.AbstractC0415a;
import java.util.ArrayList;

/* renamed from: j.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0494k implements D.a {

    /* renamed from: A, reason: collision with root package name */
    public ActionProviderVisibilityListenerC0495l f6979A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f6980B;

    /* renamed from: a, reason: collision with root package name */
    public final int f6982a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6983b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6984c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6985d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f6986e;
    public CharSequence f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f6987g;

    /* renamed from: h, reason: collision with root package name */
    public char f6988h;

    /* renamed from: j, reason: collision with root package name */
    public char f6990j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f6992l;
    public final MenuC0492i n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC0483A f6994o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f6995p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f6996q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f6997r;

    /* renamed from: y, reason: collision with root package name */
    public int f7004y;

    /* renamed from: z, reason: collision with root package name */
    public View f7005z;

    /* renamed from: i, reason: collision with root package name */
    public int f6989i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f6991k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f6993m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f6998s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f6999t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7000u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7001v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7002w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f7003x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f6981C = false;

    public C0494k(MenuC0492i menuC0492i, int i5, int i6, int i7, int i8, CharSequence charSequence, int i9) {
        this.n = menuC0492i;
        this.f6982a = i6;
        this.f6983b = i5;
        this.f6984c = i7;
        this.f6985d = i8;
        this.f6986e = charSequence;
        this.f7004y = i9;
    }

    public static void d(StringBuilder sb, int i5, int i6, String str) {
        if ((i5 & i6) == i6) {
            sb.append(str);
        }
    }

    @Override // D.a
    public final void a() {
        this.n.p(false);
    }

    @Override // D.a
    public final D.a b(ActionProviderVisibilityListenerC0495l actionProviderVisibilityListenerC0495l) {
        this.f7005z = null;
        this.f6979A = actionProviderVisibilityListenerC0495l;
        this.n.p(true);
        ActionProviderVisibilityListenerC0495l actionProviderVisibilityListenerC0495l2 = this.f6979A;
        if (actionProviderVisibilityListenerC0495l2 != null) {
            actionProviderVisibilityListenerC0495l2.f7008c = new C0198c(this);
            actionProviderVisibilityListenerC0495l2.f7006a.setVisibilityListener(actionProviderVisibilityListenerC0495l2);
        }
        return this;
    }

    @Override // D.a
    public final ActionProviderVisibilityListenerC0495l c() {
        return this.f6979A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f7004y & 8) == 0) {
            return false;
        }
        if (this.f7005z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f6980B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.n.d(this);
        }
        return false;
    }

    public final Drawable e(Drawable drawable) {
        if (drawable != null && this.f7002w && (this.f7000u || this.f7001v)) {
            drawable = drawable.mutate();
            if (this.f7000u) {
                C.a.h(drawable, this.f6998s);
            }
            if (this.f7001v) {
                C.a.i(drawable, this.f6999t);
            }
            this.f7002w = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!f()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f6980B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.n.f(this);
        }
        return false;
    }

    public final boolean f() {
        ActionProviderVisibilityListenerC0495l actionProviderVisibilityListenerC0495l;
        if ((this.f7004y & 8) == 0) {
            return false;
        }
        if (this.f7005z == null && (actionProviderVisibilityListenerC0495l = this.f6979A) != null) {
            this.f7005z = actionProviderVisibilityListenerC0495l.a(this);
        }
        return this.f7005z != null;
    }

    public final boolean g() {
        return (this.f7003x & 32) == 32;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f7005z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC0495l actionProviderVisibilityListenerC0495l = this.f6979A;
        if (actionProviderVisibilityListenerC0495l == null) {
            return null;
        }
        View viewA = actionProviderVisibilityListenerC0495l.a(this);
        this.f7005z = viewA;
        return viewA;
    }

    @Override // D.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f6991k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f6990j;
    }

    @Override // D.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f6996q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f6983b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f6992l;
        if (drawable != null) {
            return e(drawable);
        }
        int i5 = this.f6993m;
        if (i5 == 0) {
            return null;
        }
        Drawable drawableR = AbstractC0415a.r(this.n.f6955a, i5);
        this.f6993m = 0;
        this.f6992l = drawableR;
        return e(drawableR);
    }

    @Override // D.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f6998s;
    }

    @Override // D.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f6999t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f6987g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f6982a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // D.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f6989i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f6988h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f6984c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f6994o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f6986e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        return charSequence != null ? charSequence : this.f6986e;
    }

    @Override // D.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f6997r;
    }

    public final boolean h() {
        return (this.f7003x & 4) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f6994o != null;
    }

    public final void i(boolean z4) {
        if (z4) {
            this.f7003x |= 32;
        } else {
            this.f7003x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f6981C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f7003x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f7003x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f7003x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC0495l actionProviderVisibilityListenerC0495l = this.f6979A;
        return (actionProviderVisibilityListenerC0495l == null || !actionProviderVisibilityListenerC0495l.f7006a.overridesItemVisibility()) ? (this.f7003x & 8) == 0 : (this.f7003x & 8) == 0 && this.f6979A.f7006a.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i5;
        this.f7005z = view;
        this.f6979A = null;
        if (view != null && view.getId() == -1 && (i5 = this.f6982a) > 0) {
            view.setId(i5);
        }
        MenuC0492i menuC0492i = this.n;
        menuC0492i.f6964k = true;
        menuC0492i.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f6990j == c2) {
            return this;
        }
        this.f6990j = Character.toLowerCase(c2);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z4) {
        int i5 = this.f7003x;
        int i6 = (z4 ? 1 : 0) | (i5 & (-2));
        this.f7003x = i6;
        if (i5 != i6) {
            this.n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z4) {
        int i5 = this.f7003x;
        if ((i5 & 4) != 0) {
            MenuC0492i menuC0492i = this.n;
            menuC0492i.getClass();
            ArrayList arrayList = menuC0492i.f;
            int size = arrayList.size();
            menuC0492i.w();
            for (int i6 = 0; i6 < size; i6++) {
                C0494k c0494k = (C0494k) arrayList.get(i6);
                if (c0494k.f6983b == this.f6983b && c0494k.h() && c0494k.isCheckable()) {
                    boolean z5 = c0494k == this;
                    int i7 = c0494k.f7003x;
                    int i8 = (z5 ? 2 : 0) | (i7 & (-3));
                    c0494k.f7003x = i8;
                    if (i7 != i8) {
                        c0494k.n.p(false);
                    }
                }
            }
            menuC0492i.v();
        } else {
            int i9 = (i5 & (-3)) | (z4 ? 2 : 0);
            this.f7003x = i9;
            if (i5 != i9) {
                this.n.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z4) {
        if (z4) {
            this.f7003x |= 16;
        } else {
            this.f7003x &= -17;
        }
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f6993m = 0;
        this.f6992l = drawable;
        this.f7002w = true;
        this.n.p(false);
        return this;
    }

    @Override // D.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f6998s = colorStateList;
        this.f7000u = true;
        this.f7002w = true;
        this.n.p(false);
        return this;
    }

    @Override // D.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f6999t = mode;
        this.f7001v = true;
        this.f7002w = true;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f6987g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.f6988h == c2) {
            return this;
        }
        this.f6988h = c2;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f6980B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f6995p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c5) {
        this.f6988h = c2;
        this.f6990j = Character.toLowerCase(c5);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i5) {
        int i6 = i5 & 3;
        if (i6 != 0 && i6 != 1 && i6 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f7004y = i5;
        MenuC0492i menuC0492i = this.n;
        menuC0492i.f6964k = true;
        menuC0492i.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i5) {
        setShowAsAction(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f6986e = charSequence;
        this.n.p(false);
        SubMenuC0483A subMenuC0483A = this.f6994o;
        if (subMenuC0483A != null) {
            subMenuC0483A.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z4) {
        int i5 = this.f7003x;
        int i6 = (z4 ? 0 : 8) | (i5 & (-9));
        this.f7003x = i6;
        if (i5 != i6) {
            MenuC0492i menuC0492i = this.n;
            menuC0492i.f6961h = true;
            menuC0492i.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f6986e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // D.a, android.view.MenuItem
    public final D.a setContentDescription(CharSequence charSequence) {
        this.f6996q = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // D.a, android.view.MenuItem
    public final D.a setTooltipText(CharSequence charSequence) {
        this.f6997r = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // D.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i5) {
        if (this.f6990j == c2 && this.f6991k == i5) {
            return this;
        }
        this.f6990j = Character.toLowerCase(c2);
        this.f6991k = KeyEvent.normalizeMetaState(i5);
        this.n.p(false);
        return this;
    }

    @Override // D.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i5) {
        if (this.f6988h == c2 && this.f6989i == i5) {
            return this;
        }
        this.f6988h = c2;
        this.f6989i = KeyEvent.normalizeMetaState(i5);
        this.n.p(false);
        return this;
    }

    @Override // D.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c5, int i5, int i6) {
        this.f6988h = c2;
        this.f6989i = KeyEvent.normalizeMetaState(i5);
        this.f6990j = Character.toLowerCase(c5);
        this.f6991k = KeyEvent.normalizeMetaState(i6);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i5) {
        this.f6992l = null;
        this.f6993m = i5;
        this.f7002w = true;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i5) {
        setTitle(this.n.f6955a.getString(i5));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i5) {
        int i6;
        Context context = this.n.f6955a;
        View viewInflate = LayoutInflater.from(context).inflate(i5, (ViewGroup) new LinearLayout(context), false);
        this.f7005z = viewInflate;
        this.f6979A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i6 = this.f6982a) > 0) {
            viewInflate.setId(i6);
        }
        MenuC0492i menuC0492i = this.n;
        menuC0492i.f6964k = true;
        menuC0492i.p(true);
        return this;
    }
}
