package com.google.android.gms.internal.p000firebaseauthapi;

import a4.v;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0265g0 implements InterfaceC0277i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f5490a;

    public C0265g0(v vVar) {
        this.f5490a = vVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0277i0
    public final Set a() {
        return ((Map) this.f5490a.f3094c).keySet();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0277i0
    public final U b() {
        v vVar = this.f5490a;
        return new U(vVar, (Class) vVar.f3095d);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0277i0
    public final Class c() {
        return null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0277i0
    public final U d(Class cls) throws GeneralSecurityException {
        try {
            return new U(this.f5490a, cls);
        } catch (IllegalArgumentException e5) {
            throw new GeneralSecurityException("Primitive type not supported", e5);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0277i0
    public final Class e() {
        return this.f5490a.getClass();
    }
}
