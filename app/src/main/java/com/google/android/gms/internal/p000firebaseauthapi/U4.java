package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class U4 {
    protected int zza;

    public abstract void a(f5 f5Var);

    public final Y4 b() {
        try {
            int iD = d();
            Y4 y4 = Z4.f5416e;
            byte[] bArr = new byte[iD];
            Logger logger = f5.f5478e;
            c5 c5Var = new c5(bArr, iD);
            a(c5Var);
            if (iD - c5Var.f5450i == 0) {
                return new Y4(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e5) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e5);
        }
    }

    public final byte[] c() {
        try {
            int iD = d();
            byte[] bArr = new byte[iD];
            Logger logger = f5.f5478e;
            c5 c5Var = new c5(bArr, iD);
            a(c5Var);
            if (iD - c5Var.f5450i == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e5) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e5);
        }
    }

    public abstract int d();
}
