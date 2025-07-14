package androidx.emoji2.text;

import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.InterfaceC0145h;
import androidx.lifecycle.InterfaceC0159w;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import z0.C0944a;
import z0.InterfaceC0945b;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0945b {
    @Override // z0.InterfaceC0945b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // z0.InterfaceC0945b
    public final Object b(Context context) {
        Object objB;
        o oVar = new o(new K0.c(context, 1));
        oVar.f3650a = 1;
        if (i.f3654j == null) {
            synchronized (i.f3653i) {
                try {
                    if (i.f3654j == null) {
                        i.f3654j = new i(oVar);
                    }
                } finally {
                }
            }
        }
        C0944a c0944aC = C0944a.c(context);
        c0944aC.getClass();
        synchronized (C0944a.f9474e) {
            try {
                objB = c0944aC.f9475a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = c0944aC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final androidx.lifecycle.r lifecycle = ((InterfaceC0159w) objB).getLifecycle();
        lifecycle.a(new InterfaceC0145h() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.InterfaceC0145h
            public final void onResume() {
                EmojiCompatInitializer.this.getClass();
                b.a(Looper.getMainLooper()).postDelayed(new k(), 500L);
                lifecycle.b(this);
            }
        });
        return Boolean.TRUE;
    }
}
