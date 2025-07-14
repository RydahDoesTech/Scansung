package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.S;
import androidx.fragment.app.a0;
import androidx.lifecycle.C0161y;
import androidx.lifecycle.EnumC0154q;
import androidx.lifecycle.InterfaceC0159w;
import b3.AbstractC0219i;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f3169a;

    /* renamed from: b, reason: collision with root package name */
    public final P2.h f3170b;

    /* renamed from: c, reason: collision with root package name */
    public S f3171c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f3172d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f3173e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3174g;

    public v(Runnable runnable) {
        this.f3169a = runnable;
        P2.h hVar = new P2.h();
        hVar.f2156e = P2.h.f2154g;
        this.f3170b = hVar;
        this.f3172d = s.f3165a.a(new n(this, 0), new n(this, 1), new o(this, 0), new o(this, 1));
    }

    public final void a(InterfaceC0159w interfaceC0159w, S s2) {
        AbstractC0219i.e("onBackPressedCallback", s2);
        androidx.lifecycle.r lifecycle = interfaceC0159w.getLifecycle();
        if (((C0161y) lifecycle).f4031c == EnumC0154q.f4021d) {
            return;
        }
        s2.f3738b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, lifecycle, s2));
        d();
        s2.f3739c = new u(0, this, v.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
    }

    public final void b() {
        Object objPrevious;
        P2.h hVar = this.f3170b;
        ListIterator listIterator = hVar.listIterator(hVar.l());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((S) objPrevious).f3737a) {
                    break;
                }
            }
        }
        S s2 = (S) objPrevious;
        this.f3171c = null;
        if (s2 == null) {
            this.f3169a.run();
            return;
        }
        a0 a0Var = s2.f3740d;
        a0Var.x(true);
        if (a0Var.f3771h.f3737a) {
            a0Var.L();
        } else {
            a0Var.f3770g.b();
        }
    }

    public final void c(boolean z4) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f3173e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f3172d) == null) {
            return;
        }
        q qVar = q.f3138a;
        if (z4 && !this.f) {
            qVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z4 || !this.f) {
                return;
            }
            qVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void d() {
        boolean z4 = this.f3174g;
        boolean z5 = false;
        P2.h hVar = this.f3170b;
        if (hVar == null || !hVar.isEmpty()) {
            Iterator it = hVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((S) it.next()).f3737a) {
                    z5 = true;
                    break;
                }
            }
        }
        this.f3174g = z5;
        if (z5 != z4) {
            c(z5);
        }
    }
}
