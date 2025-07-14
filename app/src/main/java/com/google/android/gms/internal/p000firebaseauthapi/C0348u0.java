package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Random;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0348u0 extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5643a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f5643a) {
            case 0:
                try {
                    return (Cipher) C0374y2.f5690e.a("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e5) {
                    throw new IllegalStateException(e5);
                }
            case 1:
                try {
                    return (Cipher) C0374y2.f5690e.a("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e6) {
                    throw new IllegalStateException(e6);
                }
            case 2:
                try {
                    return (Cipher) C0374y2.f5690e.a("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e7) {
                    throw new IllegalStateException(e7);
                }
            case 3:
                try {
                    return (Cipher) C0374y2.f5690e.a("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e8) {
                    throw new IllegalStateException(e8);
                }
            case 4:
                try {
                    return (Cipher) C0374y2.f5690e.a("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e9) {
                    throw new IllegalStateException(e9);
                }
            case 5:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            default:
                return new Random();
        }
    }
}
