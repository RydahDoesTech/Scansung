package com.google.firebase.installations;

import V1.g;
import a2.C0103a;
import a2.C0104b;
import a2.InterfaceC0105c;
import a2.f;
import a2.k;
import com.idm.fotaagent.enabler.ui.notification.manager.a;
import java.util.Arrays;
import java.util.List;
import k2.d;
import k2.e;
import r2.b;

/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements f {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$0(InterfaceC0105c interfaceC0105c) {
        return new d((g) interfaceC0105c.a(g.class), interfaceC0105c.b(b.class), interfaceC0105c.b(h2.b.class));
    }

    @Override // a2.f
    public List<C0104b> getComponents() {
        C0103a c0103aA = C0104b.a(e.class);
        c0103aA.a(new k(1, 0, g.class));
        c0103aA.a(new k(0, 1, h2.b.class));
        c0103aA.a(new k(0, 1, b.class));
        c0103aA.f = new a(10);
        return Arrays.asList(c0103aA.b(), r2.d.c("fire-installations", "17.0.0"));
    }
}
