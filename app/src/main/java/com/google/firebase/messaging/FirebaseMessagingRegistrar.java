package com.google.firebase.messaging;

import a2.C0103a;
import a2.C0104b;
import a2.InterfaceC0105c;
import i2.InterfaceC0481a;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements a2.f {
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(InterfaceC0105c interfaceC0105c) {
        V1.g gVar = (V1.g) interfaceC0105c.a(V1.g.class);
        if (interfaceC0105c.a(InterfaceC0481a.class) == null) {
            return new FirebaseMessaging(gVar, interfaceC0105c.b(r2.b.class), interfaceC0105c.b(h2.b.class), (k2.e) interfaceC0105c.a(k2.e.class), (H0.d) interfaceC0105c.a(H0.d.class), (g2.b) interfaceC0105c.a(g2.b.class));
        }
        throw new ClassCastException();
    }

    @Override // a2.f
    public List<C0104b> getComponents() {
        C0103a c0103aA = C0104b.a(FirebaseMessaging.class);
        c0103aA.a(new a2.k(1, 0, V1.g.class));
        c0103aA.a(new a2.k(0, 0, InterfaceC0481a.class));
        c0103aA.a(new a2.k(0, 1, r2.b.class));
        c0103aA.a(new a2.k(0, 1, h2.b.class));
        c0103aA.a(new a2.k(0, 0, H0.d.class));
        c0103aA.a(new a2.k(1, 0, k2.e.class));
        c0103aA.a(new a2.k(1, 0, g2.b.class));
        c0103aA.f = f.f6144g;
        if (c0103aA.f2980a != 0) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        c0103aA.f2980a = 1;
        return Arrays.asList(c0103aA.b(), r2.d.c("fire-fcm", "23.0.0"));
    }
}
