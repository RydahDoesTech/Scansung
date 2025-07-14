package L2;

import A3.f;
import J2.b;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.samsung.context.sdk.samsunganalytics.BuildConfig;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1731a;

    /* renamed from: b, reason: collision with root package name */
    public static final Uri f1732b;

    /* renamed from: c, reason: collision with root package name */
    public static int f1733c;

    static {
        String strValueOf;
        StringBuilder sb = new StringBuilder("DIAGMON_SDK[");
        try {
            strValueOf = String.valueOf(BuildConfig.VERSION_CODE);
        } catch (Exception unused) {
            strValueOf = "";
        }
        f1731a = f.p(sb, strValueOf, "]");
        f1732b = Uri.parse("content://com.sec.android.log.diagmonagent/");
        f1733c = -1;
    }

    public static int a(Context context) {
        if (f1733c == -1) {
            int iQ = AbstractC0415a.q(context);
            f1733c = iQ < 600000000 ? iQ == 0 ? 0 : 1 : 2;
            Log.i(f1731a, "DiagMonAgent type: " + f1733c);
        }
        return f1733c;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0015 A[PHI: r2
  0x0015: PHI (r2v9 long) = (r2v2 long), (r2v3 long) binds: [B:3:0x0013, B:6:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b() {
        /*
            java.io.File r0 = android.os.Environment.getDataDirectory()
            long r0 = r0.getTotalSpace()
            r2 = 5
            long r0 = r0 * r2
            r2 = 100
            long r0 = r0 / r2
            r2 = 1073741824(0x40000000, double:5.304989477E-315)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L17
        L15:
            r0 = r2
            goto L1f
        L17:
            r2 = 314572800(0x12c00000, double:1.554196136E-315)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L1f
            goto L15
        L1f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Storage size threshold : "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = " bytes"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            J2.b.k(r2)
            java.io.File r2 = android.os.Environment.getDataDirectory()
            long r2 = r2.getUsableSpace()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L61
            java.lang.String r4 = "insufficient storage"
            J2.b.c0(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "usableSpace: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = ", threshold: "
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            J2.b.c0(r0)
            r0 = 1
            return r0
        L61:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.a.b():boolean");
    }

    public static void c(Bundle bundle) {
        try {
            String string = bundle.getString("result");
            String string2 = bundle.getString("cause");
            if (string2 == null) {
                b.C("Results : " + string);
            } else {
                b.C("Results : " + string + ", Cause : " + string2);
            }
        } catch (Exception e5) {
            Log.e(f1731a, e5.getMessage());
        }
    }
}
