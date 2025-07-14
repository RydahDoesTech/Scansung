package k;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import i.InterfaceC0477c;
import j.C0494k;
import j.InterfaceC0504u;
import j.MenuC0492i;
import j.SubMenuC0483A;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class D1 implements InterfaceC0504u {

    /* renamed from: d, reason: collision with root package name */
    public MenuC0492i f7485d;

    /* renamed from: e, reason: collision with root package name */
    public C0494k f7486e;
    public final /* synthetic */ Toolbar f;

    public D1(Toolbar toolbar) {
        this.f = toolbar;
    }

    @Override // j.InterfaceC0504u
    public final void a(MenuC0492i menuC0492i, boolean z4) {
    }

    @Override // j.InterfaceC0504u
    public final void c(Context context, MenuC0492i menuC0492i) {
        C0494k c0494k;
        MenuC0492i menuC0492i2 = this.f7485d;
        if (menuC0492i2 != null && (c0494k = this.f7486e) != null) {
            menuC0492i2.d(c0494k);
        }
        this.f7485d = menuC0492i;
    }

    @Override // j.InterfaceC0504u
    public final boolean d() {
        return false;
    }

    @Override // j.InterfaceC0504u
    public final boolean e(C0494k c0494k) {
        ViewParent parent;
        Toolbar toolbar = this.f;
        toolbar.c();
        ViewParent parent2 = toolbar.f3504k.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f3504k);
            }
            toolbar.addView(toolbar.f3504k);
        }
        View actionView = c0494k.getActionView();
        toolbar.f3505l = actionView;
        this.f7486e = c0494k;
        if (actionView != null && (parent = actionView.getParent()) != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f3505l);
            }
            E1 e1H = Toolbar.h();
            e1H.f7489a = (toolbar.f3509q & 112) | 8388611;
            e1H.f7490b = 2;
            toolbar.f3505l.setLayoutParams(e1H);
            toolbar.addView(toolbar.f3505l);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((E1) childAt.getLayoutParams()).f7490b != 2 && childAt != toolbar.f3495d) {
                toolbar.removeViewAt(childCount);
                toolbar.f3478H.add(childAt);
            }
        }
        toolbar.requestLayout();
        c0494k.f6981C = true;
        c0494k.n.p(false);
        KeyEvent.Callback callback = toolbar.f3505l;
        if (callback instanceof InterfaceC0477c) {
            ((InterfaceC0477c) callback).c();
        }
        toolbar.x();
        return true;
    }

    @Override // j.InterfaceC0504u
    public final void f() {
        if (this.f7486e != null) {
            MenuC0492i menuC0492i = this.f7485d;
            if (menuC0492i != null) {
                int size = menuC0492i.f.size();
                for (int i5 = 0; i5 < size; i5++) {
                    if (this.f7485d.getItem(i5) == this.f7486e) {
                        return;
                    }
                }
            }
            g(this.f7486e);
        }
    }

    @Override // j.InterfaceC0504u
    public final boolean g(C0494k c0494k) {
        Toolbar toolbar = this.f;
        KeyEvent.Callback callback = toolbar.f3505l;
        if (callback instanceof InterfaceC0477c) {
            ((InterfaceC0477c) callback).e();
        }
        toolbar.removeView(toolbar.f3505l);
        toolbar.removeView(toolbar.f3504k);
        toolbar.f3505l = null;
        ArrayList arrayList = toolbar.f3478H;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f7486e = null;
        toolbar.requestLayout();
        c0494k.f6981C = false;
        c0494k.n.p(false);
        toolbar.x();
        return true;
    }

    @Override // j.InterfaceC0504u
    public final boolean h(SubMenuC0483A subMenuC0483A) {
        return false;
    }
}
