package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.C0161y;
import androidx.lifecycle.EnumC0153p;
import androidx.lifecycle.InterfaceC0149l;
import b0.AbstractC0197b;
import b0.C0199d;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class t0 implements InterfaceC0149l, w0.f, androidx.lifecycle.c0 {

    /* renamed from: d, reason: collision with root package name */
    public final Fragment f3917d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.b0 f3918e;
    public final RunnableC0132u f;

    /* renamed from: g, reason: collision with root package name */
    public C0161y f3919g = null;

    /* renamed from: h, reason: collision with root package name */
    public w0.e f3920h = null;

    public t0(Fragment fragment, androidx.lifecycle.b0 b0Var, RunnableC0132u runnableC0132u) {
        this.f3917d = fragment;
        this.f3918e = b0Var;
        this.f = runnableC0132u;
    }

    public final void a(EnumC0153p enumC0153p) {
        this.f3919g.e(enumC0153p);
    }

    public final void b() {
        if (this.f3919g == null) {
            this.f3919g = new C0161y(this);
            w0.e eVar = new w0.e(this);
            this.f3920h = eVar;
            eVar.a();
            this.f.run();
        }
    }

    @Override // androidx.lifecycle.InterfaceC0149l
    public final AbstractC0197b getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.f3917d;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C0199d c0199d = new C0199d();
        LinkedHashMap linkedHashMap = c0199d.f5000a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.Y.f4004d, application);
        }
        linkedHashMap.put(androidx.lifecycle.Q.f3983a, fragment);
        linkedHashMap.put(androidx.lifecycle.Q.f3984b, this);
        if (fragment.getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.Q.f3985c, fragment.getArguments());
        }
        return c0199d;
    }

    @Override // androidx.lifecycle.InterfaceC0159w
    public final androidx.lifecycle.r getLifecycle() {
        b();
        return this.f3919g;
    }

    @Override // w0.f
    public final w0.d getSavedStateRegistry() {
        b();
        return this.f3920h.f9293b;
    }

    @Override // androidx.lifecycle.c0
    public final androidx.lifecycle.b0 getViewModelStore() {
        b();
        return this.f3918e;
    }
}
