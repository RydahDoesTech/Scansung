package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.v2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0356v2 implements Q {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0350u2 f5652a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0350u2 f5653b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5654c;

    public C0356v2(byte[] bArr, int i5) {
        this.f5654c = i5;
        this.f5652a = b(1, bArr);
        this.f5653b = b(0, bArr);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Q
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        int iRemaining = byteBufferWrap.remaining();
        AbstractC0350u2 abstractC0350u2 = this.f5652a;
        if (iRemaining < abstractC0350u2.b() + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBufferWrap.position();
        byte[] bArr3 = new byte[16];
        byteBufferWrap.position(byteBufferWrap.limit() - 16);
        byteBufferWrap.get(bArr3);
        byteBufferWrap.position(iPosition);
        byteBufferWrap.limit(byteBufferWrap.limit() - 16);
        byte[] bArr4 = new byte[abstractC0350u2.b()];
        byteBufferWrap.get(bArr4);
        try {
            ByteBuffer byteBufferD = this.f5653b.d(0, bArr4);
            byte[] bArr5 = new byte[32];
            byteBufferD.get(bArr5);
            int length = bArr2.length;
            int i5 = length & 15;
            int i6 = i5 == 0 ? length : (length + 16) - i5;
            int iRemaining2 = byteBufferWrap.remaining();
            int i7 = iRemaining2 % 16;
            int i8 = (i7 == 0 ? iRemaining2 : (iRemaining2 + 16) - i7) + i6;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i8 + 16).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put(bArr2);
            byteBufferOrder.position(i6);
            byteBufferOrder.put(byteBufferWrap);
            byteBufferOrder.position(i8);
            byteBufferOrder.putLong(length);
            byteBufferOrder.putLong(iRemaining2);
            if (!AbstractC0335s.v(AbstractC0335s.n(bArr5, byteBufferOrder.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBufferWrap.position(iPosition);
            return abstractC0350u2.g(byteBufferWrap);
        } catch (GeneralSecurityException e5) {
            throw new AEADBadTagException(e5.toString());
        }
    }

    public final AbstractC0350u2 b(int i5, byte[] bArr) {
        switch (this.f5654c) {
            case 0:
                return new C0344t2(bArr, i5);
            default:
                return new F2(bArr, i5);
        }
    }
}
