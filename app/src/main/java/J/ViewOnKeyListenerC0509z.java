package j;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import k.B0;
import k.C0637l0;

/* renamed from: j.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0509z implements PopupWindow.OnDismissListener, View.OnKeyListener, InterfaceC0508y, InterfaceC0504u, AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public Rect f7029d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f7030e;
    public final MenuC0492i f;

    /* renamed from: g, reason: collision with root package name */
    public final C0489f f7031g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7032h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7033i;

    /* renamed from: j, reason: collision with root package name */
    public final int f7034j;

    /* renamed from: k, reason: collision with root package name */
    public final B0 f7035k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7036l;

    /* renamed from: o, reason: collision with root package name */
    public final Q1.e f7038o;

    /* renamed from: p, reason: collision with root package name */
    public final R1.n f7039p;

    /* renamed from: q, reason: collision with root package name */
    public C0500q f7040q;

    /* renamed from: r, reason: collision with root package name */
    public View f7041r;

    /* renamed from: s, reason: collision with root package name */
    public View f7042s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0503t f7043t;

    /* renamed from: u, reason: collision with root package name */
    public ViewTreeObserver f7044u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7045v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7046w;

    /* renamed from: x, reason: collision with root package name */
    public int f7047x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7049z;

    /* renamed from: m, reason: collision with root package name */
    public C0637l0 f7037m = null;
    public boolean n = true;

    /* renamed from: y, reason: collision with root package name */
    public int f7048y = 0;

    public ViewOnKeyListenerC0509z(int i5, Context context, View view, MenuC0492i menuC0492i, boolean z4) throws Resources.NotFoundException {
        int i6 = 0;
        this.f7036l = false;
        int i7 = 1;
        this.f7038o = new Q1.e(i7, this);
        this.f7039p = new R1.n(i7, this);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.popupTheme, typedValue, false);
        if (typedValue.data != 0) {
            this.f7030e = new i.e(context, typedValue.data);
        } else {
            this.f7030e = context;
        }
        this.f = menuC0492i;
        this.f7036l = menuC0492i instanceof SubMenuC0483A;
        this.f7032h = z4;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int size = menuC0492i.f.size();
        while (true) {
            if (i6 >= size) {
                this.f7031g = new C0489f(menuC0492i, layoutInflaterFrom, this.f7032h, com.wssyncmldm.R.layout.sesl_popup_menu_item_layout);
                break;
            } else {
                if (((C0494k) this.f.getItem(i6)).h()) {
                    this.f7031g = new C0489f(menuC0492i, layoutInflaterFrom, this.f7032h, com.wssyncmldm.R.layout.sesl_popup_sub_menu_item_layout);
                    break;
                }
                i6++;
            }
        }
        this.f7034j = i5;
        this.f7033i = context.getResources().getDisplayMetrics().widthPixels - (this.f7030e.getResources().getDimensionPixelOffset(com.wssyncmldm.R.dimen.sesl_menu_popup_offset_horizontal) * 2);
        this.f7041r = view;
        B0 b02 = new B0(this.f7030e, null, i5);
        this.f7035k = b02;
        b02.f7837B = this.f7032h;
        menuC0492i.b(this, context);
    }

    @Override // j.InterfaceC0504u
    public final void a(MenuC0492i menuC0492i, boolean z4) {
        if (menuC0492i != this.f) {
            return;
        }
        dismiss();
        InterfaceC0503t interfaceC0503t = this.f7043t;
        if (interfaceC0503t != null) {
            interfaceC0503t.a(menuC0492i, z4);
        }
    }

    @Override // j.InterfaceC0508y
    public final boolean b() {
        return !this.f7045v && this.f7035k.f7836A.isShowing();
    }

    @Override // j.InterfaceC0504u
    public final void c(Context context, MenuC0492i menuC0492i) {
    }

    @Override // j.InterfaceC0504u
    public final boolean d() {
        return false;
    }

    @Override // j.InterfaceC0508y
    public final void dismiss() {
        if (b()) {
            this.f7035k.dismiss();
        }
    }

    @Override // j.InterfaceC0504u
    public final boolean e(C0494k c0494k) {
        return false;
    }

    @Override // j.InterfaceC0504u
    public final void f() {
        this.f7046w = false;
        C0489f c0489f = this.f7031g;
        if (c0489f != null) {
            c0489f.notifyDataSetChanged();
        }
    }

    @Override // j.InterfaceC0504u
    public final boolean g(C0494k c0494k) {
        return false;
    }

    @Override // j.InterfaceC0504u
    public final boolean h(SubMenuC0483A subMenuC0483A) {
        MenuItem item;
        if (subMenuC0483A.hasVisibleItems()) {
            C0502s c0502s = new C0502s(this.f7034j, this.f7030e, this.f7042s, subMenuC0483A, this.f7032h);
            InterfaceC0503t interfaceC0503t = this.f7043t;
            c0502s.f7023h = interfaceC0503t;
            ViewOnKeyListenerC0509z viewOnKeyListenerC0509z = c0502s.f7024i;
            if (viewOnKeyListenerC0509z != null) {
                viewOnKeyListenerC0509z.f7043t = interfaceC0503t;
            }
            int size = subMenuC0483A.f.size();
            boolean z4 = false;
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    break;
                }
                MenuItem item2 = subMenuC0483A.getItem(i5);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z4 = true;
                    break;
                }
                i5++;
            }
            c0502s.f7022g = z4;
            ViewOnKeyListenerC0509z viewOnKeyListenerC0509z2 = c0502s.f7024i;
            if (viewOnKeyListenerC0509z2 != null) {
                viewOnKeyListenerC0509z2.f7031g.f6950h = z4;
            }
            c0502s.f7025j = this.f7040q;
            View childAt = null;
            this.f7040q = null;
            MenuC0492i menuC0492i = this.f;
            int size2 = menuC0492i.f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size2) {
                    item = null;
                    break;
                }
                item = menuC0492i.getItem(i6);
                if (item.hasSubMenu() && subMenuC0483A == item.getSubMenu()) {
                    break;
                }
                i6++;
            }
            C0489f c0489f = this.f7031g;
            int count = c0489f.getCount();
            int i7 = 0;
            while (true) {
                if (i7 >= count) {
                    i7 = -1;
                    break;
                }
                if (item == c0489f.getItem(i7)) {
                    break;
                }
                i7++;
            }
            C0637l0 c0637l0 = this.f7037m;
            if (c0637l0 != null) {
                int firstVisiblePosition = i7 - c0637l0.getFirstVisiblePosition();
                if (firstVisiblePosition >= 0) {
                    this.f7037m.getChildCount();
                }
                childAt = this.f7037m.getChildAt(firstVisiblePosition);
            }
            if (childAt != null) {
                childAt.getMeasuredHeight();
            }
            c0502s.f = this.f7048y;
            menuC0492i.c(false);
            if (!c0502s.b()) {
                if (c0502s.f7021e != null) {
                    c0502s.d(true, true);
                }
            }
            InterfaceC0503t interfaceC0503t2 = this.f7043t;
            if (interfaceC0503t2 != null) {
                interfaceC0503t2.b(subMenuC0483A);
            }
            return true;
        }
        return false;
    }

    @Override // j.InterfaceC0508y
    public final C0637l0 i() {
        return this.f7035k.f;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f7045v = true;
        this.f.c(true);
        ViewTreeObserver viewTreeObserver = this.f7044u;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f7044u = this.f7042s.getViewTreeObserver();
            }
            this.f7044u.removeGlobalOnLayoutListener(this.f7038o);
            this.f7044u = null;
        }
        this.f7042s.removeOnAttachStateChangeListener(this.f7039p);
        C0500q c0500q = this.f7040q;
        if (c0500q != null) {
            c0500q.onDismiss();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i5, long j5) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C0489f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0489f) listAdapter).f6947d.q((MenuItem) listAdapter.getItem(i5), this, 0);
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i5, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i5 != 82) {
            return false;
        }
        dismiss();
        return true;
    }
}
