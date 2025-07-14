package i;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.firebase.messaging.C0388e;
import j.InterfaceC0490g;
import j.MenuC0492i;
import java.lang.ref.WeakReference;
import k.C0633k;

/* loaded from: classes.dex */
public final class f extends AbstractC0476b implements InterfaceC0490g {
    public Context f;

    /* renamed from: g, reason: collision with root package name */
    public ActionBarContextView f6867g;

    /* renamed from: h, reason: collision with root package name */
    public C0388e f6868h;

    /* renamed from: i, reason: collision with root package name */
    public WeakReference f6869i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6870j;

    /* renamed from: k, reason: collision with root package name */
    public MenuC0492i f6871k;

    @Override // i.AbstractC0476b
    public final void a() {
        if (this.f6870j) {
            return;
        }
        this.f6870j = true;
        this.f6868h.i(this);
    }

    @Override // i.AbstractC0476b
    public final View b() {
        WeakReference weakReference = this.f6869i;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.InterfaceC0490g
    public final void c(MenuC0492i menuC0492i) {
        i();
        C0633k c0633k = this.f6867g.f3239g;
        if (c0633k != null) {
            c0633k.l();
        }
    }

    @Override // j.InterfaceC0490g
    public final boolean d(MenuC0492i menuC0492i, MenuItem menuItem) {
        return ((InterfaceC0475a) this.f6868h.f6142e).c(this, menuItem);
    }

    @Override // i.AbstractC0476b
    public final MenuC0492i e() {
        return this.f6871k;
    }

    @Override // i.AbstractC0476b
    public final MenuInflater f() {
        return new j(this.f6867g.getContext());
    }

    @Override // i.AbstractC0476b
    public final CharSequence g() {
        return this.f6867g.getSubtitle();
    }

    @Override // i.AbstractC0476b
    public final CharSequence h() {
        return this.f6867g.getTitle();
    }

    @Override // i.AbstractC0476b
    public final void i() {
        this.f6868h.f(this, this.f6871k);
    }

    @Override // i.AbstractC0476b
    public final boolean j() {
        return this.f6867g.f3253v;
    }

    @Override // i.AbstractC0476b
    public final void k(View view) {
        this.f6867g.setCustomView(view);
        this.f6869i = view != null ? new WeakReference(view) : null;
    }

    @Override // i.AbstractC0476b
    public final void l(int i5) {
        m(this.f.getString(i5));
    }

    @Override // i.AbstractC0476b
    public final void m(CharSequence charSequence) {
        this.f6867g.setSubtitle(charSequence);
    }

    @Override // i.AbstractC0476b
    public final void n(int i5) {
        o(this.f.getString(i5));
    }

    @Override // i.AbstractC0476b
    public final void o(CharSequence charSequence) {
        this.f6867g.setTitle(charSequence);
    }

    @Override // i.AbstractC0476b
    public final void p(boolean z4) {
        this.f6861e = z4;
        this.f6867g.setTitleOptional(z4);
    }
}
