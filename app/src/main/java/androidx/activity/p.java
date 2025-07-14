package androidx.activity;

import a3.InterfaceC0106a;
import android.window.OnBackInvokedCallback;
import b3.AbstractC0219i;
import e.B;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3136a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3137b;

    public /* synthetic */ p(int i5, Object obj) {
        this.f3136a = i5;
        this.f3137b = obj;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f3136a) {
            case 0:
                InterfaceC0106a interfaceC0106a = (InterfaceC0106a) this.f3137b;
                AbstractC0219i.e("$onBackInvoked", interfaceC0106a);
                interfaceC0106a.a();
                break;
            case 1:
                ((B) this.f3137b).E();
                break;
            default:
                ((Runnable) this.f3137b).run();
                break;
        }
    }
}
