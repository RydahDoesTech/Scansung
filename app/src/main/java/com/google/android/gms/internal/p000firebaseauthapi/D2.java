package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.SecureRandom;

/* loaded from: classes.dex */
public abstract class D2 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0348u0 f5289a = new C0348u0(5);

    public static byte[] a(int i5) {
        byte[] bArr = new byte[i5];
        ((SecureRandom) f5289a.get()).nextBytes(bArr);
        return bArr;
    }
}
