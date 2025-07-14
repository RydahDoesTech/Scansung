package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288k extends AbstractC0294l {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.AbstractC0294l
    public final List a(long j5, Object obj) {
        InterfaceC0240c interfaceC0240c = (InterfaceC0240c) L.f5338c.m(j5, obj);
        if (((V4) interfaceC0240c).f5400d) {
            return interfaceC0240c;
        }
        int size = interfaceC0240c.size();
        InterfaceC0240c interfaceC0240cD = interfaceC0240c.d(size == 0 ? 10 : size + size);
        L.r(obj, j5, interfaceC0240cD);
        return interfaceC0240cD;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.AbstractC0294l
    public final void b(long j5, Object obj) {
        ((V4) ((InterfaceC0240c) L.f5338c.m(j5, obj))).f5400d = false;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.AbstractC0294l
    public final void c(m5 m5Var, m5 m5Var2, long j5) {
        K k5 = L.f5338c;
        InterfaceC0240c interfaceC0240cD = (InterfaceC0240c) k5.m(j5, m5Var);
        InterfaceC0240c interfaceC0240c = (InterfaceC0240c) k5.m(j5, m5Var2);
        int size = interfaceC0240cD.size();
        int size2 = interfaceC0240c.size();
        if (size > 0 && size2 > 0) {
            if (!((V4) interfaceC0240cD).f5400d) {
                interfaceC0240cD = interfaceC0240cD.d(size2 + size);
            }
            interfaceC0240cD.addAll(interfaceC0240c);
        }
        if (size > 0) {
            interfaceC0240c = interfaceC0240cD;
        }
        L.r(m5Var, j5, interfaceC0240c);
    }
}
