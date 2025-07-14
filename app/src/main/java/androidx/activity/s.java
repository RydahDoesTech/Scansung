package androidx.activity;

import a3.InterfaceC0106a;
import a3.InterfaceC0107b;
import android.window.OnBackInvokedCallback;
import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f3165a = new s();

    public final OnBackInvokedCallback a(InterfaceC0107b interfaceC0107b, InterfaceC0107b interfaceC0107b2, InterfaceC0106a interfaceC0106a, InterfaceC0106a interfaceC0106a2) {
        AbstractC0219i.e("onBackStarted", interfaceC0107b);
        AbstractC0219i.e("onBackProgressed", interfaceC0107b2);
        AbstractC0219i.e("onBackInvoked", interfaceC0106a);
        AbstractC0219i.e("onBackCancelled", interfaceC0106a2);
        return new r(interfaceC0107b, interfaceC0107b2, interfaceC0106a, interfaceC0106a2);
    }
}
