package l2;

import V1.g;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.idm.core.syncml.Constants;
import com.samsung.android.knox.custom.CustomDeviceManager;
import com.samsung.android.knox.net.nap.NetworkAnalyticsConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import k.Q0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f8020c = {"*", "FCM", "GCM", ""};

    /* renamed from: a, reason: collision with root package name */
    public final Object f8021a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8022b;

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(V1.g r4, int r5) {
        /*
            r3 = this;
            switch(r5) {
                case 1: goto L4e;
                default: goto L3;
            }
        L3:
            r3.<init>()
            r4.a()
            java.lang.String r5 = "com.google.android.gms.appid"
            r0 = 0
            android.content.Context r1 = r4.f2610a
            android.content.SharedPreferences r5 = r1.getSharedPreferences(r5, r0)
            r3.f8021a = r5
            r4.a()
            V1.j r5 = r4.f2612c
            java.lang.String r0 = r5.f2621e
            if (r0 == 0) goto L1e
            goto L4b
        L1e:
            r4.a()
            java.lang.String r4 = "1:"
            java.lang.String r0 = r5.f2618b
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L34
            java.lang.String r4 = "2:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L34
            goto L4b
        L34:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r0.split(r4)
            int r5 = r4.length
            r0 = 4
            r1 = 0
            if (r5 == r0) goto L41
        L3f:
            r0 = r1
            goto L4b
        L41:
            r5 = 1
            r0 = r4[r5]
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L4b
            goto L3f
        L4b:
            r3.f8022b = r0
            return
        L4e:
            r3.<init>()
            java.io.File r5 = new java.io.File
            r4.a()
            android.content.Context r0 = r4.f2610a
            java.io.File r0 = r0.getFilesDir()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "PersistedInstallation."
            r1.<init>(r2)
            java.lang.String r2 = r4.f()
            r1.append(r2)
            java.lang.String r2 = ".json"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r5.<init>(r0, r1)
            r3.f8021a = r5
            r3.f8022b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.b.<init>(V1.g, int):void");
    }

    public void a(C0682a c0682a) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c0682a.f8014a);
            jSONObject.put(Constants.SYNCML_TAG_STATUS, Q0.c(c0682a.f8015b));
            jSONObject.put("AuthToken", c0682a.f8016c);
            jSONObject.put("RefreshToken", c0682a.f8017d);
            jSONObject.put("TokenCreationEpochInSecs", c0682a.f);
            jSONObject.put("ExpiresInSecs", c0682a.f8018e);
            jSONObject.put("FisError", c0682a.f8019g);
            g gVar = (g) this.f8022b;
            gVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f2610a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo((File) this.f8021a)) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public C0682a b() throws IOException {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[NetworkAnalyticsConstants.DataPoints.FLAG_SOURCE_PORT];
        try {
            FileInputStream fileInputStream = new FileInputStream((File) this.f8021a);
            while (true) {
                try {
                    int i5 = fileInputStream.read(bArr, 0, NetworkAnalyticsConstants.DataPoints.FLAG_SOURCE_PORT);
                    if (i5 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i5);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt(Constants.SYNCML_TAG_STATUS, 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i6 = Q0.d(5)[iOptInt];
        if (i6 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i6 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new C0682a(strOptString, i6, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public String c() {
        PublicKey publicKeyGeneratePublic;
        synchronized (((SharedPreferences) this.f8021a)) {
            String strEncodeToString = null;
            String string = ((SharedPreferences) this.f8021a).getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e5) {
                Log.w("ContentValues", "Invalid key stored " + e5);
                publicKeyGeneratePublic = null;
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & CustomDeviceManager.CALL_SCREEN_ALL);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return strEncodeToString;
        }
    }
}
