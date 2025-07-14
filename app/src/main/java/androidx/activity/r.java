package androidx.activity;

import a3.InterfaceC0106a;
import a3.InterfaceC0107b;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class r implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0107b f3139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0107b f3140b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0106a f3141c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0106a f3142d;

    public r(InterfaceC0107b interfaceC0107b, InterfaceC0107b interfaceC0107b2, InterfaceC0106a interfaceC0106a, InterfaceC0106a interfaceC0106a2) {
        this.f3139a = interfaceC0107b;
        this.f3140b = interfaceC0107b2;
        this.f3141c = interfaceC0106a;
        this.f3142d = interfaceC0106a2;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        this.f3142d.a();
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.f3141c.a();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        AbstractC0219i.e("backEvent", backEvent);
        this.f3140b.d(new b(backEvent));
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        AbstractC0219i.e("backEvent", backEvent);
        this.f3139a.d(new b(backEvent));
    }
}
