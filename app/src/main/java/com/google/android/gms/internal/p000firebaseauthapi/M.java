package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import t1.d;

/* loaded from: classes.dex */
public final class M implements d, P {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5347d;

    public /* synthetic */ M(int i5) {
        this.f5347d = i5;
    }

    public static boolean c(byte[] bArr, int i5, int i6) {
        int iA;
        while (i5 < i6 && bArr[i5] >= 0) {
            i5++;
        }
        if (i5 >= i6) {
            iA = 0;
        } else {
            while (i5 < i6) {
                int i7 = i5 + 1;
                iA = bArr[i5];
                if (iA < 0) {
                    if (iA >= -32) {
                        if (iA >= -16) {
                            if (i7 < i6 - 2) {
                                int i8 = i5 + 2;
                                byte b2 = bArr[i7];
                                if (b2 <= -65) {
                                    if ((((b2 + 112) + (iA << 28)) >> 30) == 0) {
                                        int i9 = i5 + 3;
                                        if (bArr[i8] <= -65) {
                                            i5 += 4;
                                            if (bArr[i9] > -65) {
                                            }
                                        }
                                    }
                                }
                                iA = -1;
                                break;
                            }
                            iA = O.a(bArr, i7, i6);
                            break;
                        }
                        if (i7 < i6 - 1) {
                            int i10 = i5 + 2;
                            byte b5 = bArr[i7];
                            if (b5 <= -65 && ((iA != -32 || b5 >= -96) && (iA != -19 || b5 < -96))) {
                                i5 += 3;
                                if (bArr[i10] > -65) {
                                }
                            }
                            iA = -1;
                            break;
                        }
                        iA = O.a(bArr, i7, i6);
                        break;
                    }
                    if (i7 < i6) {
                        if (iA >= -62) {
                            i5 += 2;
                            if (bArr[i7] > -65) {
                            }
                        }
                        iA = -1;
                        break;
                    }
                    break;
                }
                i5 = i7;
            }
            iA = 0;
        }
        return iA == 0;
    }

    @Override // t1.d
    public void I(Exception exc) {
        A.d dVar = C0299l4.f5553d;
        String strValueOf = String.valueOf(exc.getMessage());
        dVar.e(strValueOf.length() != 0 ? "SmsRetrieverClient failed to start: ".concat(strValueOf) : new String("SmsRetrieverClient failed to start: "), new Object[0]);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.P
    public Iterator a(C0306n c0306n, String str) {
        return new S4(c0306n, str);
    }

    public /* bridge */ Object b(String str, Provider provider) {
        switch (this.f5347d) {
            case 4:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            case 5:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            case 6:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            case 7:
                return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
            default:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
        }
    }
}
