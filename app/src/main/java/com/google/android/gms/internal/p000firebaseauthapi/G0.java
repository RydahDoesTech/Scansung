package com.google.android.gms.internal.p000firebaseauthapi;

import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    public KeyStore f5307a;

    public G0() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.f5307a = keyStore;
        } catch (IOException | GeneralSecurityException e5) {
            throw new IllegalStateException(e5);
        }
    }

    public final synchronized C0307n0 a(String str) {
        C0307n0 c0307n0;
        c0307n0 = new C0307n0(E2.a(str), this.f5307a);
        byte[] bArrA = D2.a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(bArrA, c0307n0.a(c0307n0.b(bArrA, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return c0307n0;
    }

    public final synchronized boolean b(String str) {
        String strA;
        strA = E2.a(str);
        try {
        } catch (NullPointerException unused) {
            Log.w("G0", "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f5307a = keyStore;
                keyStore.load(null);
            } catch (IOException e5) {
                throw new GeneralSecurityException(e5);
            } catch (InterruptedException unused2) {
            }
            return this.f5307a.containsAlias(strA);
        }
        return this.f5307a.containsAlias(strA);
    }
}
