package e;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.firebase.messaging.C0388e;
import i.AbstractC0476b;
import i.InterfaceC0475a;
import j.InterfaceC0490g;
import j.MenuC0492i;
import java.lang.ref.WeakReference;
import k.C0633k;

/* loaded from: classes.dex */
public final class O extends AbstractC0476b implements InterfaceC0490g {
    public final Context f;

    /* renamed from: g, reason: collision with root package name */
    public final MenuC0492i f6513g;

    /* renamed from: h, reason: collision with root package name */
    public C0388e f6514h;

    /* renamed from: i, reason: collision with root package name */
    public WeakReference f6515i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P f6516j;

    public O(P p2, Context context, C0388e c0388e) {
        this.f6516j = p2;
        this.f = context;
        this.f6514h = c0388e;
        MenuC0492i menuC0492i = new MenuC0492i(context);
        menuC0492i.f6965l = 1;
        this.f6513g = menuC0492i;
        menuC0492i.f6959e = this;
    }

    @Override // i.AbstractC0476b
    public final void a() {
        P p2 = this.f6516j;
        if (p2.f6526i != this) {
            return;
        }
        if (p2.f6532p) {
            p2.f6527j = this;
            p2.f6528k = this.f6514h;
        } else {
            this.f6514h.i(this);
        }
        this.f6514h = null;
        p2.q(false);
        ActionBarContextView actionBarContextView = p2.f;
        if (actionBarContextView.n == null) {
            actionBarContextView.e();
        }
        p2.f6521c.setHideOnContentScrollEnabled(p2.f6537u);
        p2.f6526i = null;
    }

    @Override // i.AbstractC0476b
    public final View b() {
        WeakReference weakReference = this.f6515i;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.InterfaceC0490g
    public final void c(MenuC0492i menuC0492i) {
        if (this.f6514h == null) {
            return;
        }
        i();
        C0633k c0633k = this.f6516j.f.f3239g;
        if (c0633k != null) {
            c0633k.l();
        }
    }

    @Override // j.InterfaceC0490g
    public final boolean d(MenuC0492i menuC0492i, MenuItem menuItem) {
        C0388e c0388e = this.f6514h;
        if (c0388e != null) {
            return ((InterfaceC0475a) c0388e.f6142e).c(this, menuItem);
        }
        return false;
    }

    @Override // i.AbstractC0476b
    public final MenuC0492i e() {
        return this.f6513g;
    }

    @Override // i.AbstractC0476b
    public final MenuInflater f() {
        return new i.j(this.f);
    }

    @Override // i.AbstractC0476b
    public final CharSequence g() {
        return this.f6516j.f.getSubtitle();
    }

    @Override // i.AbstractC0476b
    public final CharSequence h() {
        return this.f6516j.f.getTitle();
    }

    @Override // i.AbstractC0476b
    public final void i() {
        if (this.f6516j.f6526i != this) {
            return;
        }
        MenuC0492i menuC0492i = this.f6513g;
        menuC0492i.w();
        try {
            this.f6514h.f(this, menuC0492i);
        } finally {
            menuC0492i.v();
        }
    }

    @Override // i.AbstractC0476b
    public final boolean j() {
        return this.f6516j.f.f3253v;
    }

    @Override // i.AbstractC0476b
    public final void k(View view) {
        this.f6516j.f.setCustomView(view);
        this.f6515i = new WeakReference(view);
    }

    @Override // i.AbstractC0476b
    public final void l(int i5) {
        m(this.f6516j.f6519a.getResources().getString(i5));
    }

    @Override // i.AbstractC0476b
    public final void m(CharSequence charSequence) {
        this.f6516j.f.setSubtitle(charSequence);
    }

    @Override // i.AbstractC0476b
    public final void n(int i5) {
        o(this.f6516j.f6519a.getResources().getString(i5));
    }

    @Override // i.AbstractC0476b
    public final void o(CharSequence charSequence) {
        this.f6516j.f.setTitle(charSequence);
    }

    @Override // i.AbstractC0476b
    public final void p(boolean z4) {
        this.f6861e = z4;
        this.f6516j.f.setTitleOptional(z4);
    }
}
