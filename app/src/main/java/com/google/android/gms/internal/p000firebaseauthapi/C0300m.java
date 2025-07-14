package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300m implements r {

    /* renamed from: a, reason: collision with root package name */
    public final r[] f5559a;

    public C0300m(r... rVarArr) {
        this.f5559a = rVarArr;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.r
    public final C0377z a(Class cls) {
        for (int i5 = 0; i5 < 2; i5++) {
            r rVar = this.f5559a[i5];
            if (rVar.b(cls)) {
                return rVar.a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.r
    public final boolean b(Class cls) {
        for (int i5 = 0; i5 < 2; i5++) {
            if (this.f5559a[i5].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
