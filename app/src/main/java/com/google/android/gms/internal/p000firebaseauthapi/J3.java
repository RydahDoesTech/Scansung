package com.google.android.gms.internal.p000firebaseauthapi;

import A.d;
import Y0.c;
import Z0.e;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import b1.k;

/* loaded from: classes.dex */
public final class J3 extends k implements I3 {

    /* renamed from: y, reason: collision with root package name */
    public static final d f5322y = new d("FirebaseAuth", "FirebaseAuth:");

    /* renamed from: w, reason: collision with root package name */
    public final Context f5323w;

    /* renamed from: x, reason: collision with root package name */
    public final X3 f5324x;

    public J3(Context context, Looper looper, G3.d dVar, X3 x32, Z0.d dVar2, e eVar) {
        super(context, looper, 112, dVar, dVar2, eVar);
        this.f5323w = context;
        this.f5324x = x32;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2 A[RETURN] */
    @Override // b1.k, Z0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b() throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.ClassNotFoundException, java.lang.IllegalArgumentException {
        /*
            r7 = this;
            java.lang.String r0 = "' didn't match expected id 'com.google.firebase.auth'"
            java.lang.String r1 = "com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor"
            android.content.Context r7 = r7.f5323w
            java.lang.String r2 = "com.google.firebase.auth"
            int r3 = k1.AbstractC0667a.f7874a
            java.lang.String r3 = "DynamiteModule"
            r4 = 0
            android.content.Context r7 = r7.getApplicationContext()     // Catch: java.lang.Exception -> L65 java.lang.ClassNotFoundException -> L8a
            java.lang.ClassLoader r7 = r7.getClassLoader()     // Catch: java.lang.Exception -> L65 java.lang.ClassNotFoundException -> L8a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L65 java.lang.ClassNotFoundException -> L8a
            r6 = 85
            r5.<init>(r6)     // Catch: java.lang.Exception -> L65 java.lang.ClassNotFoundException -> L8a
            r5.append(r1)     // Catch: java.lang.Exception -> L65 java.lang.ClassNotFoundException -> L8a
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Exception -> L65 java.lang.ClassNotFoundException -> L8a
            java.lang.Class r7 = r7.loadClass(r1)     // Catch: java.lang.Exception -> L65 java.lang.ClassNotFoundException -> L8a
            java.lang.String r1 = "MODULE_ID"
            java.lang.reflect.Field r1 = r7.getDeclaredField(r1)     // Catch: java.lang.Exception -> L65 java.lang.ClassNotFoundException -> L8a
            java.lang.String r5 = "MODULE_VERSION"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r5)     // Catch: java.lang.Exception -> L65 java.lang.ClassNotFoundException -> L8a
            r5 = 0
            java.lang.Object r6 = r1.get(r5)     // Catch: java.lang.Exception -> L65 java.lang.ClassNotFoundException -> L8a
            boolean r2 = r6.equals(r2)     // Catch: java.lang.Exception -> L65 java.lang.ClassNotFoundException -> L8a
            if (r2 != 0) goto L67
            java.lang.Object r7 = r1.get(r5)     // Catch: java.lang.Exception -> L65 java.lang.ClassNotFoundException -> L8a
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Exception -> L65 java.lang.ClassNotFoundException -> L8a
            int r1 = r7.length()     // Catch: java.lang.Exception -> L65 java.lang.ClassNotFoundException -> L8a
            int r1 = r1 + 75
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L65 java.lang.ClassNotFoundException -> L8a
            r2.<init>(r1)     // Catch: java.lang.Exception -> L65 java.lang.ClassNotFoundException -> L8a
            java.lang.String r1 = "Module descriptor id '"
            r2.append(r1)     // Catch: java.lang.Exception -> L65 java.lang.ClassNotFoundException -> L8a
            r2.append(r7)     // Catch: java.lang.Exception -> L65 java.lang.ClassNotFoundException -> L8a
            r2.append(r0)     // Catch: java.lang.Exception -> L65 java.lang.ClassNotFoundException -> L8a
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Exception -> L65 java.lang.ClassNotFoundException -> L8a
            android.util.Log.e(r3, r7)     // Catch: java.lang.Exception -> L65 java.lang.ClassNotFoundException -> L8a
        L63:
            r7 = r4
            goto L9e
        L65:
            r7 = move-exception
            goto L6c
        L67:
            int r7 = r7.getInt(r5)     // Catch: java.lang.Exception -> L65 java.lang.ClassNotFoundException -> L8a
            goto L9e
        L6c:
            java.lang.String r7 = r7.getMessage()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r0 = r7.length()
            java.lang.String r1 = "Failed to load module descriptor class: "
            if (r0 == 0) goto L81
            java.lang.String r7 = r1.concat(r7)
            goto L86
        L81:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1)
        L86:
            android.util.Log.e(r3, r7)
            goto L63
        L8a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r0 = 69
            r7.<init>(r0)
            java.lang.String r0 = "Local module descriptor class for com.google.firebase.auth not found."
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            android.util.Log.w(r3, r7)
            goto L63
        L9e:
            if (r7 != 0) goto La2
            r7 = 1
            return r7
        La2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.J3.b():boolean");
    }

    @Override // b1.k
    public final IInterface c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
        return iInterfaceQueryLocalInterface instanceof V3 ? (V3) iInterfaceQueryLocalInterface : new S3(iBinder, "com.google.firebase.auth.api.internal.IFirebaseAuthService", 0);
    }

    @Override // b1.k
    public final c[] e() {
        return AbstractC0335s.f5615b;
    }

    @Override // b1.k
    public final Bundle f() {
        Bundle bundle = new Bundle();
        X3 x32 = this.f5324x;
        if (x32 != null) {
            bundle.putString("com.google.firebase.auth.API_KEY", x32.f5409e);
        }
        bundle.putString("com.google.firebase.auth.LIBRARY_VERSION", C0233a4.a());
        return bundle;
    }

    @Override // b1.k
    public final String i() {
        return "com.google.firebase.auth.api.internal.IFirebaseAuthService";
    }

    @Override // b1.k
    public final String j() {
        return "com.google.firebase.auth.api.gms.service.START";
    }

    @Override // b1.k
    public final String k() {
        boolean z4 = this.f5324x.f5408d;
        d dVar = f5322y;
        if (z4) {
            Log.i((String) dVar.f11b, dVar.f("Preparing to create service connection to fallback implementation", new Object[0]));
            return this.f5323w.getPackageName();
        }
        Log.i((String) dVar.f11b, dVar.f("Preparing to create service connection to gms implementation", new Object[0]));
        return "com.google.android.gms";
    }
}
