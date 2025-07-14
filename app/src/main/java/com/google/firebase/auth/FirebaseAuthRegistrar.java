package com.google.firebase.auth;

import V1.g;
import X1.u;
import Y0.j;
import Z1.a;
import Z1.s;
import a2.C0104b;
import a2.InterfaceC0105c;
import a2.f;
import a2.k;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import r2.d;

/* loaded from: classes.dex */
public class FirebaseAuthRegistrar implements f {
    public static FirebaseAuth lambda$getComponents$0(InterfaceC0105c interfaceC0105c) {
        return new s((g) interfaceC0105c.a(g.class));
    }

    @Override // a2.f
    public List<C0104b> getComponents() {
        Class[] clsArr = {a.class};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(FirebaseAuth.class);
        for (Class cls : clsArr) {
            j.e("Null interface", cls);
        }
        Collections.addAll(hashSet, clsArr);
        k kVar = new k(1, 0, g.class);
        if (hashSet.contains(kVar.f3003a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(kVar);
        return Arrays.asList(new C0104b(new HashSet(hashSet), new HashSet(hashSet2), 2, 0, u.f2752d, hashSet3), d.c("fire-auth", "21.0.1"));
    }
}
