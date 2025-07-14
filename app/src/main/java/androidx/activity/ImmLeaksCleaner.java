package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.EnumC0153p;
import androidx.lifecycle.InterfaceC0157u;
import androidx.lifecycle.InterfaceC0159w;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC0157u {

    /* renamed from: a, reason: collision with root package name */
    public static int f3107a;

    @Override // androidx.lifecycle.InterfaceC0157u
    public final void a(InterfaceC0159w interfaceC0159w, EnumC0153p enumC0153p) throws SecurityException {
        if (enumC0153p != EnumC0153p.ON_DESTROY) {
            return;
        }
        if (f3107a == 0) {
            try {
                f3107a = 2;
                InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                f3107a = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f3107a == 1) {
            throw null;
        }
    }
}
