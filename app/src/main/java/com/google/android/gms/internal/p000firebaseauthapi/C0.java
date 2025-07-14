package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class C0 implements T {

    /* renamed from: a, reason: collision with root package name */
    public final U f5278a;

    public C0(U u4) {
        this.f5278a = u4;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.T
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        U u4 = this.f5278a;
        if (length > 5) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            Iterator it = u4.f(bArrCopyOfRange).iterator();
            while (it.hasNext()) {
                try {
                    return ((T) ((C0241c0) it.next()).f5442a).a(bArrCopyOfRange2);
                } catch (GeneralSecurityException e5) {
                    Logger logger = D0.f5288a;
                    Level level = Level.INFO;
                    String strValueOf = String.valueOf(e5.toString());
                    logger.logp(level, "com.google.crypto.tink.hybrid.HybridDecryptWrapper$WrappedHybridDecrypt", "decrypt", strValueOf.length() != 0 ? "ciphertext prefix matches a key, but cannot decrypt: ".concat(strValueOf) : new String("ciphertext prefix matches a key, but cannot decrypt: "));
                }
            }
        }
        Iterator it2 = u4.f(AbstractC0335s.f5614a).iterator();
        while (it2.hasNext()) {
            try {
                return ((T) ((C0241c0) it2.next()).f5442a).a(bArr);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
