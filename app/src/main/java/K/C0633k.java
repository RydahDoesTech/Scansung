package k;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.wssyncmldm.R;
import j.C0494k;
import j.InterfaceC0503t;
import j.InterfaceC0504u;
import j.InterfaceC0505v;
import j.InterfaceC0506w;
import j.MenuC0492i;
import j.SubMenuC0483A;
import j.ViewOnKeyListenerC0509z;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: k.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0633k implements InterfaceC0504u {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f7689A;

    /* renamed from: d, reason: collision with root package name */
    public final Context f7691d;

    /* renamed from: e, reason: collision with root package name */
    public Context f7692e;
    public MenuC0492i f;

    /* renamed from: g, reason: collision with root package name */
    public final LayoutInflater f7693g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0503t f7694h;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0506w f7697k;

    /* renamed from: l, reason: collision with root package name */
    public C0627i f7698l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f7699m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7700o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7701p;

    /* renamed from: q, reason: collision with root package name */
    public int f7702q;

    /* renamed from: r, reason: collision with root package name */
    public int f7703r;

    /* renamed from: s, reason: collision with root package name */
    public int f7704s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7705t;

    /* renamed from: v, reason: collision with root package name */
    public C0618f f7707v;

    /* renamed from: w, reason: collision with root package name */
    public C0618f f7708w;

    /* renamed from: x, reason: collision with root package name */
    public G.a f7709x;

    /* renamed from: y, reason: collision with root package name */
    public C0621g f7710y;

    /* renamed from: i, reason: collision with root package name */
    public final int f7695i = R.layout.sesl_action_menu_layout;

    /* renamed from: j, reason: collision with root package name */
    public final int f7696j = R.layout.sesl_action_menu_item_layout;

    /* renamed from: u, reason: collision with root package name */
    public final SparseBooleanArray f7706u = new SparseBooleanArray();

    /* renamed from: z, reason: collision with root package name */
    public final C0586A f7711z = new C0586A(this);

    /* renamed from: B, reason: collision with root package name */
    public final NumberFormat f7690B = NumberFormat.getInstance(Locale.getDefault());

    public C0633k(Context context) {
        this.f7691d = context;
        this.f7693g = LayoutInflater.from(context);
        this.f7689A = context.getResources().getBoolean(R.bool.sesl_action_bar_text_item_mode);
    }

    @Override // j.InterfaceC0504u
    public final void a(MenuC0492i menuC0492i, boolean z4) {
        i();
        C0618f c0618f = this.f7708w;
        if (c0618f != null && c0618f.b()) {
            c0618f.f7024i.dismiss();
        }
        InterfaceC0503t interfaceC0503t = this.f7694h;
        if (interfaceC0503t != null) {
            interfaceC0503t.a(menuC0492i, z4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [j.v] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final View b(C0494k c0494k, View view, ViewGroup viewGroup) {
        View actionView = c0494k.getActionView();
        if (actionView == null || c0494k.f()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC0505v ? (InterfaceC0505v) view : (InterfaceC0505v) this.f7693g.inflate(this.f7696j, viewGroup, false);
            actionMenuItemView.d(c0494k);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f7697k);
            if (this.f7710y == null) {
                this.f7710y = new C0621g(this);
            }
            actionMenuItemView2.setPopupCallback(this.f7710y);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c0494k.f6981C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0639m)) {
            actionView.setLayoutParams(ActionMenuView.m(layoutParams));
        }
        return actionView;
    }

    @Override // j.InterfaceC0504u
    public final void c(Context context, MenuC0492i menuC0492i) {
        this.f7692e = context;
        LayoutInflater.from(context);
        this.f = menuC0492i;
        Resources resources = context.getResources();
        if (!this.f7701p) {
            this.f7700o = true;
        }
        this.f7702q = (int) (context.getResources().getDisplayMetrics().widthPixels * 0.7f);
        Configuration configuration = context.getResources().getConfiguration();
        int i5 = configuration.screenWidthDp;
        int i6 = configuration.screenHeightDp;
        this.f7704s = (configuration.smallestScreenWidthDp > 600 || i5 > 600 || (i5 > 960 && i6 > 720) || (i5 > 720 && i6 > 960)) ? 5 : (i5 >= 500 || (i5 > 640 && i6 > 480) || (i5 > 480 && i6 > 640)) ? 4 : i5 >= 360 ? 3 : 2;
        int measuredWidth = this.f7702q;
        if (this.f7700o) {
            if (this.f7698l == null) {
                C0627i c0627i = new C0627i(this, this.f7691d);
                this.f7698l = c0627i;
                c0627i.setId(R.id.sesl_action_bar_overflow_button);
                if (this.n) {
                    if (this.f7689A) {
                        ((C0661x) this.f7698l.f).setImageDrawable(this.f7699m);
                    }
                    this.f7699m = null;
                    this.n = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f7698l.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f7698l.getMeasuredWidth();
        } else {
            this.f7698l = null;
        }
        this.f7703r = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // j.InterfaceC0504u
    public final boolean d() {
        int size;
        ArrayList arrayListL;
        int i5;
        boolean z4;
        MenuC0492i menuC0492i = this.f;
        if (menuC0492i != null) {
            arrayListL = menuC0492i.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i6 = this.f7704s;
        int i7 = this.f7703r;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        Object obj = this.f7697k;
        if (obj == null) {
            Log.d("ActionMenuPresenter", "mMenuView is null, maybe Menu has not been initialized.");
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) obj;
        int i8 = 0;
        boolean z5 = false;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i5 = 2;
            z4 = true;
            if (i8 >= size) {
                break;
            }
            C0494k c0494k = (C0494k) arrayListL.get(i8);
            int i11 = c0494k.f7004y;
            if ((i11 & 2) == 2) {
                i9++;
            } else if ((i11 & 1) == 1) {
                i10++;
            } else {
                z5 = true;
            }
            if (this.f7705t && c0494k.f6981C) {
                i6 = 0;
            }
            i8++;
        }
        if (this.f7700o && (z5 || i10 + i9 > i6)) {
            i6--;
        }
        int i12 = i6 - i9;
        SparseBooleanArray sparseBooleanArray = this.f7706u;
        sparseBooleanArray.clear();
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            C0494k c0494k2 = (C0494k) arrayListL.get(i13);
            int i15 = c0494k2.f7004y;
            boolean z6 = (i15 & 2) == i5 ? z4 : false;
            int i16 = c0494k2.f6983b;
            if (z6) {
                View viewB = b(c0494k2, null, viewGroup);
                viewB.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewB.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                if (i16 != 0) {
                    sparseBooleanArray.put(i16, z4);
                }
                c0494k2.i(z4);
            } else if ((i15 & 1) == z4) {
                boolean z7 = sparseBooleanArray.get(i16);
                boolean z8 = ((i12 > 0 || z7) && i7 > 0) ? z4 : false;
                if (z8) {
                    View viewB2 = b(c0494k2, null, viewGroup);
                    viewB2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewB2.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z8 &= i7 >= 0;
                }
                if (z8 && i16 != 0) {
                    sparseBooleanArray.put(i16, true);
                } else if (z7) {
                    sparseBooleanArray.put(i16, false);
                    for (int i17 = 0; i17 < i13; i17++) {
                        C0494k c0494k3 = (C0494k) arrayListL.get(i17);
                        if (c0494k3.f6983b == i16) {
                            if (c0494k3.g()) {
                                i12++;
                            }
                            c0494k3.i(false);
                        }
                    }
                }
                if (z8) {
                    i12--;
                }
                c0494k2.i(z8);
            } else {
                c0494k2.i(false);
                i13++;
                i5 = 2;
                z4 = true;
            }
            i13++;
            i5 = 2;
            z4 = true;
        }
        return z4;
    }

    @Override // j.InterfaceC0504u
    public final boolean e(C0494k c0494k) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    @Override // j.InterfaceC0504u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0633k.f():void");
    }

    @Override // j.InterfaceC0504u
    public final boolean g(C0494k c0494k) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.InterfaceC0504u
    public final boolean h(SubMenuC0483A subMenuC0483A) {
        boolean z4;
        if (subMenuC0483A == null || !subMenuC0483A.hasVisibleItems()) {
            return false;
        }
        SubMenuC0483A subMenuC0483A2 = subMenuC0483A;
        while (true) {
            MenuC0492i menuC0492i = subMenuC0483A2.f6924z;
            if (menuC0492i == this.f) {
                break;
            }
            subMenuC0483A2 = (SubMenuC0483A) menuC0492i;
        }
        ViewGroup viewGroup = (ViewGroup) this.f7697k;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i5);
                if ((childAt instanceof InterfaceC0505v) && ((InterfaceC0505v) childAt).getItemData() == subMenuC0483A2.f6923A) {
                    view = childAt;
                    break;
                }
                i5++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC0483A.f6923A.getClass();
        int size = subMenuC0483A.f.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                z4 = false;
                break;
            }
            MenuItem item = subMenuC0483A.getItem(i6);
            if (item.isVisible() && item.getIcon() != null) {
                z4 = true;
                break;
            }
            i6++;
        }
        C0618f c0618f = new C0618f(this, this.f7692e, subMenuC0483A, view);
        this.f7708w = c0618f;
        c0618f.f7022g = z4;
        ViewOnKeyListenerC0509z viewOnKeyListenerC0509z = c0618f.f7024i;
        if (viewOnKeyListenerC0509z != null) {
            viewOnKeyListenerC0509z.f7031g.f6950h = z4;
        }
        if (!c0618f.b()) {
            if (c0618f.f7021e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0618f.d(false, false);
        }
        InterfaceC0503t interfaceC0503t = this.f7694h;
        if (interfaceC0503t != null) {
            interfaceC0503t.b(subMenuC0483A);
        }
        return true;
    }

    public final boolean i() {
        Object obj;
        G.a aVar = this.f7709x;
        if (aVar != null && (obj = this.f7697k) != null) {
            ((View) obj).removeCallbacks(aVar);
            this.f7709x = null;
            return true;
        }
        C0618f c0618f = this.f7707v;
        if (c0618f == null) {
            return false;
        }
        if (c0618f.b()) {
            c0618f.f7024i.dismiss();
        }
        return true;
    }

    public final boolean j() {
        C0618f c0618f = this.f7707v;
        return c0618f != null && c0618f.b();
    }

    public final void k() {
        C0627i c0627i;
        Configuration configuration = this.f7692e.getResources().getConfiguration();
        int i5 = configuration.screenWidthDp;
        int i6 = configuration.screenHeightDp;
        this.f7704s = (configuration.smallestScreenWidthDp > 600 || i5 > 600 || (i5 > 960 && i6 > 720) || (i5 > 720 && i6 > 960)) ? 5 : (i5 >= 500 || (i5 > 640 && i6 > 480) || (i5 > 480 && i6 > 640)) ? 4 : i5 >= 360 ? 3 : 2;
        int i7 = (int) (r0.getResources().getDisplayMetrics().widthPixels * 0.7f);
        this.f7702q = i7;
        if (!this.f7700o || (c0627i = this.f7698l) == null) {
            this.f7703r = i7;
        } else {
            this.f7703r = i7 - c0627i.getMeasuredWidth();
        }
        MenuC0492i menuC0492i = this.f;
        if (menuC0492i != null) {
            menuC0492i.p(true);
        }
    }

    public final boolean l() {
        MenuC0492i menuC0492i;
        if (!this.f7700o || j() || (menuC0492i = this.f) == null || this.f7697k == null || this.f7709x != null) {
            return false;
        }
        menuC0492i.i();
        if (menuC0492i.f6963j.isEmpty()) {
            return false;
        }
        G.a aVar = new G.a(this, new C0618f(this, this.f7692e, this.f, this.f7698l), 8, false);
        this.f7709x = aVar;
        ((View) this.f7697k).post(aVar);
        return true;
    }
}
