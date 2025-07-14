package com.google.android.gms.internal.p000firebaseauthapi;

import G3.c;
import V1.a;
import X1.d;
import X1.o;
import Z1.n;
import a1.C0097e;
import a4.k;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import b1.AbstractC0203C;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class A2 implements K0, InterfaceC0257e4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5255d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5256e;
    public final Object f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f5257g;

    public A2(k kVar, C0364w4 c0364w4, H3 h3, C0382z4 c0382z4, InterfaceC0257e4 interfaceC0257e4) {
        this.f5255d = 2;
        this.f5256e = kVar;
        this.f = c0364w4;
        this.f5257g = interfaceC0257e4;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.K0
    public byte[] a(int i5, byte[] bArr) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrJ;
        if (i5 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipher = (Cipher) C0374y2.f5690e.a("AES/ECB/NoPadding");
        cipher.init(1, (SecretKeySpec) this.f5256e);
        int length = bArr.length;
        int iMax = Math.max(1, (int) Math.ceil(length / 16.0d));
        if (iMax * 16 == length) {
            bArrJ = AbstractC0335s.M(bArr, (iMax - 1) * 16, 0, (byte[]) this.f, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) * 16, length);
            int length2 = bArrCopyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[length2] = Byte.MIN_VALUE;
            bArrJ = AbstractC0335s.J(bArrCopyOf, (byte[]) this.f5257g);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i6 = 0; i6 < iMax - 1; i6++) {
            bArrDoFinal = cipher.doFinal(AbstractC0335s.M(bArrDoFinal, 0, i6 * 16, bArr, 16));
        }
        return Arrays.copyOf(cipher.doFinal(AbstractC0335s.J(bArrJ, bArrDoFinal)), i5);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0257e4
    public void b(String str) {
        switch (this.f5255d) {
            case 1:
                ((H3) this.f).b(a.q0(str));
                break;
            case 2:
                ((InterfaceC0257e4) this.f5257g).b(str);
                break;
            case 3:
                ((H3) this.f).b(a.q0(str));
                break;
            case 4:
                ((H3) this.f).b(a.q0(str));
                break;
            case 5:
                ((C0351u3) this.f5257g).f.b(a.q0(str));
                break;
            case 6:
                ((H3) this.f).b(a.q0(str));
                break;
            case 7:
                ((C0345t3) this.f5256e).b(str);
                break;
            default:
                ((H3) this.f).b(a.q0(str));
                break;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0257e4
    public void e(Z3 z32) throws IOException {
        switch (this.f5255d) {
            case 1:
                ((C0306n) this.f5257g).i(new C0334r4((d) this.f5256e, ((C0382z4) z32).f5703e), (H3) this.f);
                return;
            case 2:
                if (z32 != null) {
                    throw new ClassCastException();
                }
                k kVar = (k) this.f5256e;
                AbstractC0203C.c("EMAIL");
                M4 m4 = (M4) kVar.f3063j;
                boolean zContains = m4.f5353e.contains("EMAIL");
                C0364w4 c0364w4 = (C0364w4) this.f;
                if (zContains) {
                    c0364w4.f5666e = null;
                } else {
                    String str = (String) kVar.f;
                    if (str != null) {
                        c0364w4.f5666e = str;
                    }
                }
                AbstractC0203C.c("DISPLAY_NAME");
                if (m4.f5353e.contains("DISPLAY_NAME")) {
                    c0364w4.f5667g = null;
                } else {
                    String str2 = (String) kVar.f3059e;
                    if (str2 != null) {
                        c0364w4.f5667g = str2;
                    }
                }
                AbstractC0203C.c("PHOTO_URL");
                if (m4.f5353e.contains("PHOTO_URL")) {
                    c0364w4.f5668h = null;
                } else {
                    String str3 = (String) kVar.f3062i;
                    if (str3 != null) {
                        c0364w4.f5668h = str3;
                    }
                }
                if (TextUtils.isEmpty((String) kVar.f3060g)) {
                    throw null;
                }
                byte[] bytes = "redacted".getBytes();
                String strEncodeToString = bytes == null ? null : Base64.encodeToString(bytes, 0);
                c0364w4.getClass();
                AbstractC0203C.c(strEncodeToString);
                c0364w4.f5670j = strEncodeToString;
                throw null;
            case 3:
                String str4 = ((C0382z4) z32).f5703e;
                C0097e c0097e = (C0097e) this.f5256e;
                c0097e.f2948i = str4;
                c cVar = (c) ((C0306n) this.f5257g).f5568e;
                C0306n c0306n = new C0306n(this, this);
                W3 w3 = (W3) cVar.f740e;
                AbstractC0335s.l(w3.j("/verifyPhoneNumber", (String) cVar.f744j), c0097e, c0306n, R4.class, (C0239b4) w3.f5381b);
                return;
            case 4:
                N4 n42 = (N4) this.f5256e;
                n42.f5373r = true;
                String str5 = ((C0382z4) z32).f5703e;
                AbstractC0203C.c(str5);
                n42.f5362e = str5;
                c cVar2 = (c) ((C0306n) this.f5257g).f5568e;
                U u4 = new U(this, this, 3);
                cVar2.getClass();
                W3 w32 = (W3) cVar2.f740e;
                AbstractC0335s.l(w32.j("/verifyAssertion", (String) cVar2.f744j), n42, u4, O4.class, (C0239b4) w32.f5381b);
                return;
            case 5:
                List list = ((C0358v4) z32).f5656d.f5683d;
                C0351u3 c0351u3 = (C0351u3) this.f5256e;
                if (list == null || list.isEmpty()) {
                    c0351u3.b("No users.");
                    return;
                }
                C0364w4 c0364w42 = (C0364w4) list.get(0);
                k kVar2 = new k();
                C0382z4 c0382z4 = (C0382z4) this.f;
                kVar2.d(c0382z4.f5703e);
                C0351u3 c0351u32 = (C0351u3) this.f5257g;
                String str6 = c0351u32.f5648e;
                AbstractC0203C.c(str6);
                ((M4) kVar2.f3064k).f5353e.add(str6);
                H3 h3 = c0351u32.f;
                AbstractC0203C.e(c0382z4);
                AbstractC0203C.e(c0364w42);
                c cVar3 = (c) c0351u32.f5649g.f5568e;
                A2 a22 = new A2(kVar2, c0364w42, h3, c0382z4, c0351u3);
                W3 w33 = (W3) cVar3.f740e;
                AbstractC0335s.l(w33.j("/setAccountInfo", (String) cVar3.f744j), kVar2, a22, H4.class, (C0239b4) w33.f5381b);
                return;
            case 6:
                String str7 = ((C0382z4) z32).f5703e;
                n nVar = (n) this.f5256e;
                nVar.f2880e = str7;
                c cVar4 = (c) ((C0306n) this.f5257g).f5568e;
                C0306n c0306n2 = new C0306n(11, this);
                cVar4.getClass();
                W3 w34 = (W3) cVar4.f;
                AbstractC0335s.l(w34.j("/mfaEnrollment:finalize", (String) cVar4.f744j), nVar, c0306n2, AbstractC0346t4.class, (C0239b4) w34.f5381b);
                return;
            case 7:
                List list2 = ((C0358v4) z32).f5656d.f5683d;
                if (list2 == null || list2.isEmpty()) {
                    ((C0345t3) this.f5256e).b("No users");
                    return;
                }
                H3 h32 = ((C0345t3) this.f5257g).f5639e;
                try {
                    h32.f5313a.c((C0382z4) this.f, (C0364w4) list2.get(0));
                    return;
                } catch (RemoteException e5) {
                    h32.f5314b.d("RemoteException when sending get token and account info user response", e5, new Object[0]);
                    return;
                }
            default:
                C0382z4 c0382z42 = (C0382z4) z32;
                k kVar3 = new k();
                kVar3.d(c0382z42.f5703e);
                o oVar = (o) this.f5256e;
                boolean z4 = oVar.f;
                M4 m42 = (M4) kVar3.f3063j;
                if (z4 || oVar.f2737d != null) {
                    String str8 = oVar.f2737d;
                    if (str8 == null) {
                        m42.f5353e.add("DISPLAY_NAME");
                    } else {
                        kVar3.f3059e = str8;
                    }
                }
                if (oVar.f2739g || oVar.f2740h != null) {
                    String str9 = oVar.f2738e;
                    if (str9 == null) {
                        m42.f5353e.add("PHOTO_URL");
                    } else {
                        kVar3.f3062i = str9;
                    }
                }
                C0306n.p(kVar3, (C0306n) this.f5257g, (H3) this.f, this, c0382z42);
                return;
        }
    }

    public /* synthetic */ A2(Object obj, Object obj2, Object obj3, int i5) {
        this.f5255d = i5;
        this.f5257g = obj;
        this.f5256e = obj2;
        this.f = obj3;
    }

    public A2(byte[] bArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.f5255d = 0;
        E2.b(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f5256e = secretKeySpec;
        Cipher cipher = (Cipher) C0374y2.f5690e.a("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        byte[] bArrW = AbstractC0335s.w(cipher.doFinal(new byte[16]));
        this.f = bArrW;
        this.f5257g = AbstractC0335s.w(bArrW);
    }
}
