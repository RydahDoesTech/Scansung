package com.google.android.gms.internal.p000firebaseauthapi;

import A3.f;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.Q0;

/* loaded from: classes.dex */
public final class I0 implements InterfaceC0235b0 {

    /* renamed from: a, reason: collision with root package name */
    public final U f5315a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f5316b = {0};

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0235b0
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length <= 5) {
            throw new GeneralSecurityException("tag too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, length);
        U u4 = this.f5315a;
        for (C0241c0 c0241c0 : u4.f(bArrCopyOf)) {
            try {
                boolean zB = Q0.b(c0241c0.f5445d, 3);
                Object obj = c0241c0.f5442a;
                if (zB) {
                    ((InterfaceC0235b0) obj).a(bArrCopyOfRange, AbstractC0335s.C(bArr2, this.f5316b));
                    return;
                } else {
                    ((InterfaceC0235b0) obj).a(bArrCopyOfRange, bArr2);
                    return;
                }
            } catch (GeneralSecurityException e5) {
                Logger logger = J0.f5319a;
                Level level = Level.INFO;
                String strValueOf = String.valueOf(e5);
                logger.logp(level, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", f.p(new StringBuilder(strValueOf.length() + 45), "tag prefix matches a key, but cannot verify: ", strValueOf));
            }
        }
        Iterator it = u4.f(AbstractC0335s.f5614a).iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC0235b0) ((C0241c0) it.next()).f5442a).a(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
