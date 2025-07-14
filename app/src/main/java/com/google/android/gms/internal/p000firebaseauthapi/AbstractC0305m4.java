package com.google.android.gms.internal.p000firebaseauthapi;

import o.C0704b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.m4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0305m4 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0704b f5564a = new C0704b();

    /* renamed from: b, reason: collision with root package name */
    public static final C0704b f5565b = new C0704b();

    public static String a(String str) {
        C0704b c0704b = f5564a;
        synchronized (c0704b) {
            if (c0704b.getOrDefault(str, null) != null) {
                throw new ClassCastException();
            }
        }
        return "https://".concat("www.googleapis.com/identitytoolkit/v3/relyingparty");
    }
}
