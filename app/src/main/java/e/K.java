package e;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import j.C0494k;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.C0633k;
import k.D1;
import k.I1;

/* loaded from: classes.dex */
public final class K extends AbstractC0398a {

    /* renamed from: a, reason: collision with root package name */
    public final I1 f6498a;

    /* renamed from: b, reason: collision with root package name */
    public final x f6499b;

    /* renamed from: c, reason: collision with root package name */
    public final J f6500c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6501d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6502e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f6503g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final A1.h f6504h = new A1.h(14, this);

    public K(Toolbar toolbar, CharSequence charSequence, x xVar) {
        J j5 = new J(this);
        toolbar.getClass();
        I1 i12 = new I1(toolbar, false);
        this.f6498a = i12;
        xVar.getClass();
        this.f6499b = xVar;
        i12.f7516k = xVar;
        toolbar.setOnMenuItemClickListener(j5);
        if (!i12.f7512g) {
            i12.f7513h = charSequence;
            if ((i12.f7508b & 8) != 0) {
                Toolbar toolbar2 = i12.f7507a;
                toolbar2.setTitle(charSequence);
                if (i12.f7512g) {
                    J.P.i(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.f6500c = new J(this);
    }

    @Override // e.AbstractC0398a
    public final boolean a() {
        C0633k c0633k;
        ActionMenuView actionMenuView = this.f6498a.f7507a.f3495d;
        return (actionMenuView == null || (c0633k = actionMenuView.f3297w) == null || !c0633k.i()) ? false : true;
    }

    @Override // e.AbstractC0398a
    public final boolean b() {
        C0494k c0494k;
        D1 d1 = this.f6498a.f7507a.f3486Q;
        if (d1 == null || (c0494k = d1.f7486e) == null) {
            return false;
        }
        if (d1 == null) {
            c0494k = null;
        }
        if (c0494k == null) {
            return true;
        }
        c0494k.collapseActionView();
        return true;
    }

    @Override // e.AbstractC0398a
    public final void c(boolean z4) {
        if (z4 == this.f) {
            return;
        }
        this.f = z4;
        ArrayList arrayList = this.f6503g;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // e.AbstractC0398a
    public final int d() {
        return this.f6498a.f7508b;
    }

    @Override // e.AbstractC0398a
    public final Context e() {
        return this.f6498a.f7507a.getContext();
    }

    @Override // e.AbstractC0398a
    public final boolean f() {
        I1 i12 = this.f6498a;
        Toolbar toolbar = i12.f7507a;
        A1.h hVar = this.f6504h;
        toolbar.removeCallbacks(hVar);
        Toolbar toolbar2 = i12.f7507a;
        WeakHashMap weakHashMap = J.P.f1421a;
        toolbar2.postOnAnimation(hVar);
        return true;
    }

    @Override // e.AbstractC0398a
    public final void g() {
    }

    @Override // e.AbstractC0398a
    public final void h() {
        this.f6498a.f7507a.removeCallbacks(this.f6504h);
    }

    @Override // e.AbstractC0398a
    public final boolean i(int i5, KeyEvent keyEvent) {
        Menu menuQ = q();
        if (menuQ == null) {
            return false;
        }
        menuQ.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuQ.performShortcut(i5, keyEvent, 0);
    }

    @Override // e.AbstractC0398a
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // e.AbstractC0398a
    public final boolean k() {
        C0633k c0633k;
        I1 i12 = this.f6498a;
        ActionMenuView actionMenuView = i12.f7507a.f3495d;
        if (actionMenuView == null || (c0633k = actionMenuView.f3297w) == null || (c0633k.f7709x == null && !c0633k.j())) {
            return i12.f7507a.w();
        }
        return true;
    }

    @Override // e.AbstractC0398a
    public final void l(boolean z4) {
    }

    @Override // e.AbstractC0398a
    public final void m(boolean z4) {
        I1 i12 = this.f6498a;
        i12.a((i12.f7508b & (-5)) | 4);
    }

    @Override // e.AbstractC0398a
    public final void n(boolean z4) {
    }

    @Override // e.AbstractC0398a
    public final void o(CharSequence charSequence) {
        I1 i12 = this.f6498a;
        if (i12.f7512g) {
            return;
        }
        i12.f7513h = charSequence;
        if ((i12.f7508b & 8) != 0) {
            Toolbar toolbar = i12.f7507a;
            toolbar.setTitle(charSequence);
            if (i12.f7512g) {
                J.P.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final Menu q() {
        boolean z4 = this.f6502e;
        I1 i12 = this.f6498a;
        if (!z4) {
            A1.c cVar = new A1.c(5, this);
            J j5 = new J(this);
            Toolbar toolbar = i12.f7507a;
            toolbar.f3487R = cVar;
            toolbar.f3488T = j5;
            ActionMenuView actionMenuView = toolbar.f3495d;
            if (actionMenuView != null) {
                actionMenuView.f3298x = cVar;
                actionMenuView.f3299y = j5;
            }
            this.f6502e = true;
        }
        return i12.f7507a.getMenu();
    }
}
