package androidx.activity;

import a3.InterfaceC0106a;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f3138a = new q();

    public final OnBackInvokedCallback a(InterfaceC0106a interfaceC0106a) {
        AbstractC0219i.e("onBackInvoked", interfaceC0106a);
        return new p(0, interfaceC0106a);
    }

    public final void b(Object obj, int i5, Object obj2) {
        AbstractC0219i.e("dispatcher", obj);
        AbstractC0219i.e("callback", obj2);
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i5, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        AbstractC0219i.e("dispatcher", obj);
        AbstractC0219i.e("callback", obj2);
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
