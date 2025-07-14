package i;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import j.MenuC0507x;

/* loaded from: classes.dex */
public final class g extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6872a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0476b f6873b;

    public g(Context context, AbstractC0476b abstractC0476b) {
        this.f6872a = context;
        this.f6873b = abstractC0476b;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f6873b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f6873b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0507x(this.f6872a, this.f6873b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f6873b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f6873b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f6873b.f6860d;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f6873b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f6873b.f6861e;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f6873b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f6873b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f6873b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f6873b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f6873b.f6860d = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f6873b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z4) {
        this.f6873b.p(z4);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i5) {
        this.f6873b.l(i5);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i5) {
        this.f6873b.n(i5);
    }
}
