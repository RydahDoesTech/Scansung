package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0246d {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f5451a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f5452b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f5452b = bArr;
        ByteBuffer.wrap(bArr);
        int i5 = 0 + 0;
        try {
            if (i5 < 0) {
                throw C0258f.d();
            }
            if (i5 > Integer.MAX_VALUE) {
                throw C0258f.e();
            }
        } catch (C0258f e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public static int a(long j5) {
        return (int) (j5 ^ (j5 >>> 32));
    }

    public static m5 b(Object obj, Object obj2) {
        m5 m5Var = (m5) ((U4) obj);
        l5 l5Var = (l5) m5Var.h(5);
        l5Var.a(m5Var);
        U4 u4 = (U4) obj2;
        if (!l5Var.f5557d.getClass().isInstance(u4)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        l5Var.a((m5) u4);
        return l5Var.c();
    }
}
