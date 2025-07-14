package X0;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.B2;
import com.google.android.gms.internal.p000firebaseauthapi.K0;
import h1.ThreadFactoryC0474a;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.crypto.Mac;
import t1.n;

/* loaded from: classes.dex */
public final class j implements K0 {

    /* renamed from: h, reason: collision with root package name */
    public static j f2695h;

    /* renamed from: d, reason: collision with root package name */
    public int f2696d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2697e;
    public final Object f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2698g;

    public j(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f2698g = new h(this);
        this.f2696d = 1;
        this.f = scheduledExecutorService;
        this.f2697e = context.getApplicationContext();
    }

    public static synchronized j b(Context context) {
        try {
            if (f2695h == null) {
                f2695h = new j(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC0474a("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2695h;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.K0
    public byte[] a(int i5, byte[] bArr) throws IllegalStateException, InvalidAlgorithmParameterException {
        if (i5 > this.f2696d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        B2 b2 = (B2) this.f2697e;
        ((Mac) b2.get()).update(bArr);
        return Arrays.copyOf(((Mac) b2.get()).doFinal(), i5);
    }

    public synchronized n c(i iVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String strValueOf = String.valueOf(iVar);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 9);
                sb.append("Queueing ");
                sb.append(strValueOf);
                Log.d("MessengerIpcClient", sb.toString());
            }
            if (!((h) this.f2698g).d(iVar)) {
                h hVar = new h(this);
                this.f2698g = hVar;
                hVar.d(iVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return iVar.f2691b.f8959a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j(java.lang.String r6, javax.crypto.spec.SecretKeySpec r7) throws java.security.NoSuchAlgorithmException, java.security.InvalidAlgorithmParameterException {
        /*
            r5 = this;
            r5.<init>()
            com.google.android.gms.internal.firebase-auth-api.B2 r0 = new com.google.android.gms.internal.firebase-auth-api.B2
            r0.<init>(r5)
            r5.f2697e = r0
            r5.f = r6
            r5.f2698g = r7
            byte[] r7 = r7.getEncoded()
            int r7 = r7.length
            r1 = 16
            if (r7 < r1) goto L8f
            int r7 = r6.hashCode()
            r1 = 1
            r2 = 2
            r3 = 3
            r4 = 4
            switch(r7) {
                case -1823053428: goto L4b;
                case 392315023: goto L41;
                case 392315118: goto L37;
                case 392316170: goto L2d;
                case 392317873: goto L23;
                default: goto L22;
            }
        L22:
            goto L55
        L23:
            java.lang.String r7 = "HMACSHA512"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L55
            r7 = r4
            goto L56
        L2d:
            java.lang.String r7 = "HMACSHA384"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L55
            r7 = r3
            goto L56
        L37:
            java.lang.String r7 = "HMACSHA256"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L55
            r7 = r2
            goto L56
        L41:
            java.lang.String r7 = "HMACSHA224"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L55
            r7 = r1
            goto L56
        L4b:
            java.lang.String r7 = "HMACSHA1"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L55
            r7 = 0
            goto L56
        L55:
            r7 = -1
        L56:
            if (r7 == 0) goto L88
            if (r7 == r1) goto L85
            if (r7 == r2) goto L82
            if (r7 == r3) goto L7d
            if (r7 == r4) goto L78
            java.security.NoSuchAlgorithmException r5 = new java.security.NoSuchAlgorithmException
            int r7 = r6.length()
            java.lang.String r0 = "unknown Hmac algorithm: "
            if (r7 == 0) goto L6f
            java.lang.String r6 = r0.concat(r6)
            goto L74
        L6f:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
        L74:
            r5.<init>(r6)
            throw r5
        L78:
            r6 = 64
            r5.f2696d = r6
            goto L8b
        L7d:
            r6 = 48
        L7f:
            r5.f2696d = r6
            goto L8b
        L82:
            r6 = 32
            goto L7f
        L85:
            r6 = 28
            goto L7f
        L88:
            r6 = 20
            goto L7f
        L8b:
            r0.get()
            return
        L8f:
            java.security.InvalidAlgorithmParameterException r5 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r6 = "key size too small, need at least 16 bytes"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.j.<init>(java.lang.String, javax.crypto.spec.SecretKeySpec):void");
    }
}
