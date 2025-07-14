package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0271h0 implements InterfaceC0277i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0378z0 f5497a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A0 f5498b;

    public C0271h0(C0378z0 c0378z0, A0 a02) {
        this.f5497a = c0378z0;
        this.f5498b = a02;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0277i0
    public final Set a() {
        return ((Map) this.f5497a.f3094c).keySet();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0277i0
    public final U b() {
        C0378z0 c0378z0 = this.f5497a;
        return new C0259f0(c0378z0, this.f5498b, (Class) c0378z0.f3095d);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0277i0
    public final Class c() {
        return A0.class;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0277i0
    public final U d(Class cls) throws GeneralSecurityException {
        try {
            return new C0259f0(this.f5497a, this.f5498b, cls);
        } catch (IllegalArgumentException e5) {
            throw new GeneralSecurityException("Primitive type not supported", e5);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0277i0
    public final Class e() {
        return C0378z0.class;
    }
}
